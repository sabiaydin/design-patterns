package proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployerUtil {
    public static List<Employers> getEmployerList(){
      Employers e1 = new Employers("khadija","123456",false);
      Employers e2 = new Employers("sabina_aa","34569",false);
      Employers e3= new Employers("ali_77","77896",true);
      List<Employers> employersList =new ArrayList<>();
      employersList.add(e1);
      employersList.add(e2);
      employersList.add(e3);
      return employersList;
    }
    public static Map<String,Employers>  getUsernameEmployeeMap(){
        List<Employers> list = getEmployerList();
        Map<String,Employers> map = new LinkedHashMap<>();
        for(Employers employer : list){
            map.put(employer.getUsername(), employer);
        }
        return map;
    }
    public static Employers getEmployerByUsername(String username){
        Map<String ,Employers> map = getUsernameEmployeeMap();
      Employers employers=map.get(username);
      return employers;
    }

    public static boolean isUsernameValid(String username, String password) {
        boolean isUsernameValid=false;
        Employers employer=getEmployerByUsername(username);
        if(employer!=null){
            isUsernameValid =  employer.getPassword().equals(password);
        }
        return isUsernameValid;
    }
}
