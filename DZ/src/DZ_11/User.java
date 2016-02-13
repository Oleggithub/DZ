package DZ_11;

public class User {
    public void printInfo() throws Exception{
        System.out.println("parent");
    }

    public static void main(String[] args) {
      User users[] = {new Studen(), new Teacher()};
        for (User user : users){
            try {
                user.printInfo();
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
class Teacher extends User{
    @Override
    public void printInfo() throws Exception{
        System.out.println("teacher -> printInfo");
        throw new CustomException("customexeption from Teacher class")
;    }
}
class Studen extends User{
    @Override
    public void printInfo() throws Exception{
        System.out.println("student ->");
    }

}
class CustomException extends Exception{
    public CustomException(String message){
    super (message);
    }

}
