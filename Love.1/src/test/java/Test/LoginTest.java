package Test;



public class LoginTest extends Baseclass {
    public static void main(String[] args) throws InterruptedException{
        setup();
        pageFactory.getLoginPage().login();
    }
}
