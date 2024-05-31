import org.springframework.stereotype.Repository;

@Repository // Bu sınıfın bir bileşen olduğunu belirtiyoruz
public class RepositoryImpl implements IRepository {

    @Override
    public void performDatabaseOperations() {
        System.out.println("Performing database operations...");
    }
}
