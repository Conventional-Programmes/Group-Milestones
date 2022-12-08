package conconnect;
import conconnect.models.parse.Convention;
import conconnect.models.parse.User;
import io.github.cdimascio.dotenv.Dotenv;
import org.parse4j.Parse;
import org.parse4j.util.ParseRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication {

    public static <Dotenv> void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().filename("env").load();
        Parse.initialize(dotenv.get("PARSE_APP_ID"), dotenv.get("PARSE_REST_ID"));
        ParseRegistry.registerSubclass(Convention.class);
        ParseRegistry.registerSubclass(User.class);

        SpringApplication.run(DatabaseApplication.class, args);
    }

}
