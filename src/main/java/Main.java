import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ApplicationContext başlatılıyor ve konfigürasyon sınıfı yükleniyor
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Service bean'i alınıyor ve kullanılıyor
        ServiceClass serviceClass = context.getBean(ServiceClass.class);
        serviceClass.executeService();
    }
}
