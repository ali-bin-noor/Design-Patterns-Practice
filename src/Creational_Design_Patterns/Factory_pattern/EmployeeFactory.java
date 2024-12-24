package Creational_Design_Patterns.Factory_pattern;

public class EmployeeFactory {

    public static Employee getEmpObject(String type){

       /* if (type.trim().equalsIgnoreCase("android developer")){
            return new AndroidDeveloper();
        }else if(type.trim().equalsIgnoreCase("web developer")){
            return new WebDeveloper();
        }else {
         throw new RuntimeException("illegal argument");
        }*/

        switch(type){

            case "android developer":
                return new AndroidDeveloper();
            case "web developer":
                return new WebDeveloper();
            default :{
                return null;
            }

        }

    }
}
