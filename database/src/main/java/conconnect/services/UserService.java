package conconnect.services;

import conconnect.models.parse.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    protected final log logger = LogFactory.getLog(this.getClass());

        public ArrayList<User> retrieveUsers()
        {
            final ArrayList<User> users = new ArrayList<>();

            ParseQuery<User> query = ParseQuery.getQuery(User.class);
            try{
                List<User> list = query.find();
                for (User u: list){
                    users.add(u);
                }
            }
            catch(Exception e)
            {
                logger.error("Error occurred", e);
            }
            logger.info(users.size());
            return users;
        }

        public User getUserById(String id)
        {
            User user = null;

            ParseQuery<User> query = ParseQuery.getQuery(User.class);

            try{
                user = query.get(id);
            }catch (ParseException e)
            {
                e.printStackTrace();
            }

            return user;
        }
}
