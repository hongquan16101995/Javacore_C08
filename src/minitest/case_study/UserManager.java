package minitest.case_study;

public class UserManager {
    public void addUser() {
        User user = new User("lhq1995", "1995", "Quân" );
        user.setRole1(new Role("USER"));
        user.getRole1().getName_role();
    }
}
