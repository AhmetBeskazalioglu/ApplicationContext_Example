
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.anke")
public class AppConfig {

    @Bean
    public IRepository repository() {
        return new RepositoryImpl();
    }

    @Bean
    public ServiceClass service() {
        return new ServiceClass(repository());
    }
}
