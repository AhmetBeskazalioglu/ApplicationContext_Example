import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    private final IRepository iRepository;

    @Autowired
    public ServiceClass(IRepository iRepository) {
        this.iRepository = iRepository;
    }


    public void executeService() {
        iRepository.performDatabaseOperations();
    }
}