package register;
import com.rest.app.rest.Services.UserService;
import login.LoginScreenModel;

public class RegisterScreenModel extends LoginScreenModel {
    private String secondPassword = "";
    private String role = "";


    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public void clickRegisterButton() {
        UserService service = new UserService();
        super.notification = service.Register(context, username, password, secondPassword, email, role);
    }
}
