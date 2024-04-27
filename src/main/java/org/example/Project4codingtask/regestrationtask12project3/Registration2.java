package org.example.Project4codingtask.regestrationtask12project3;
class Registration2 {
    private String email;
    private String userName;
    private String password;
    public void toPrintInfo() {
        System.out.println("Your user name is "+userName+" and your email is "+ userName + " @" + email +".com and password is " + password);
    }
    public void setEmail(String email) {
        this.email = email;
        if (!email.equalsIgnoreCase("yahoo")) {
            System.out.println("Please enter Yahoo email");
        } else {
            System.out.println("Yahoo email accepted");
        }
    }
    public void setUserName(String UserName) {
        this.userName = UserName;
        if (userName.isEmpty()) {
            System.out.println("User Name cannot be empty");
        } else if (userName.length() < 6) {
            System.out.println("User Name should be 6 characters or more!");
        } else {
            System.out.println("Your user name is " + userName);
        }
    }
    public void setPassword(String Password){
        this.password=Password;
        if (password.isEmpty()){
            System.out.println("Password Cannot be Empty");
        }else if (password.length()<6){
            System.out.println("Password Should be 6 or more characters");
        }else if (password.contains(userName)){
            System.out.println("Password Cannot Contain User Name");
        }else {
            System.out.println("Your password is "+password);
        }
    }
}
