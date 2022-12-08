package conconnect.services;

import conconnect.models.parse.Convention;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;

import java.util.ArrayList;
import java.util.List;


@Service
public class ConventionService {

    protected final log logger = LogFactory.getLog(this.getClass());

            public ArrayList<Convention> retrieveConventions()
            {
                final ArrayList<Convention> conventions = new ArrayList<>();

                ParseQuery<Convention> query = ParseQuery.getQuery(Convention.class);
                try{
                    List<Convention> list = query.find();
                    for (Convention c: list){
                        conventions.add(c);
                    }
                }
                catch(Exception e)
                {
                    logger.error("Error occurred", e);
                }
                logger.info(conventions.size());
                return conventions;
            }

            public Convention getConventionById(String id)
            {
                Convention convention = null;

                ParseQuery<Convention> query = ParseQuery.getQuery(Convention.class);

                try{
                    convention = query.get(id);
                }catch (ParseException e)
                {
                    e.printStackTrace();
                }

                return convention;
            }
}
