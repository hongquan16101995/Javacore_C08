package minitest.case_study;

public class User {
    private String account;
    private String password;
    private String name;
    private String role;
    private Role role1;

    private Author author = Author.STAFF;

//    public User(String account, String password, String name) {
//        this.account = account;
//        this.password = password;
//        this.name = name;
//        this.role = "USER";
//    }

    public User(String account, String password, String name) {
        this.account = account;
        this.password = password;
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Role getRole1() {
        return role1;
    }

    public void setRole1(Role role1) {
        this.role1 = role1;
    }
}
