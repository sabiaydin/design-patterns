package proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
      ManagerProxy managerProxy =  new ManagerProxy("khadija","123456");
        try {
           BigDecimal giro = managerProxy.getGiro();
            System.out.println("Company giro :" + giro);
        } catch (IllegalAccessException e) {
            System.out.println("You don't have access to company's information ! ");
        }

    }
}
