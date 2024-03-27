package proxy;

import java.math.BigDecimal;

public class ManagerProxy implements CompanyInfo{
    private RealManager realManager;
    private  String username;
    private String password;

    public ManagerProxy( String username, String password) {
        this.realManager = new RealManager();
        this.username = username;
        this.password = password;
    }
private boolean isUserFromManager(){
     boolean isUserFromManager=false;
   boolean isUsernameValid = EmployerUtil.isUsernameValid(username,password);
   if(isUsernameValid) {
       Employers employer = EmployerUtil.getEmployerByUsername(username);
       isUserFromManager = employer.isManager();
   }
     return isUserFromManager;
}
    @Override
    public BigDecimal getGiro() throws IllegalAccessException {
        boolean userIsManager = isUserFromManager();
        if(userIsManager){
            return realManager.getGiro();
        }else {
            throw new IllegalAccessException();
        }
    }
}
