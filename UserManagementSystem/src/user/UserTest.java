package user;

public class UserTest {
    public static void main(String[] args) {
        
        User admin = new AdminUser();
        admin.displayUserType();
        admin.showMessage();

        System.out.println(); 

        
        User guest = new GuestUser();
        guest.displayUserType();
        guest.showMessage();
    }
}
