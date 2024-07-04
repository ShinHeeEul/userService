import controller.PhoneController;
import model.Logo;
import model.user.User;

public class Main {
    public static final PhoneController phoneController = new PhoneController();

    public static void main(String[] args) {
        User jaeDragon = new User("재용");
        User jobs = new User("잡스");


        phoneController.buyPhone(jobs, Logo.APPLE);
        jobs.turnOnPhone();

        phoneController.buyPhone(jaeDragon, Logo.GALAXY);
        jaeDragon.turnOnPhone();
    }
}