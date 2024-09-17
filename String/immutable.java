package String;

public class immutable {
    public static void main(String[] args) {
        String pwd = "gla123";
        changepwd(pwd);
        System.out.println("in main:"+ pwd);

    }
    public static String changepwd( String pwd){
        pwd =  pwd +"gla456";
        System.out.println("inside method:"+pwd);
        return pwd;
    }
    
}
