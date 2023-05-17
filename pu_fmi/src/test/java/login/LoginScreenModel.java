package login;

import com.rest.app.rest.Services.UserService;
import com.rest.app.rest.DB;

public class LoginScreenModel {
	protected String username = "";
	protected String password = "";
    protected String email = "";
    protected String notification = "";
    protected DB context = new DB();

    public void addUsername(String username) {
        this.username = username;
    }
    
    public void addPassword(String pass) {
        this.password = pass;
    }
    
    public void addEmail(String email) {
        this.email = email;
    }
    
    public void clickLoginButton() {
        UserService service = new UserService();
        notification = service.Login(context, username, password, email);
    }
    
    public String getMessage() {
        return notification;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }

    public void setNotification(String message) {
        this.notification = message;
    }
}
