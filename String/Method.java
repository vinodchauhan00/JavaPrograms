public class Method {
    public static void main(String[] args) {
        String str ="Welcome to Java";
        String str1="Good Bye";

        int len=str.length();
        char ch =str.charAt(11);
        String st=str.substring(8, 10);
        int num=str.compareTo(str1);
        int num1=str1.compareTo(str);
        int id=str.indexOf('o');
        int id1=str.lastIndexOf('o');
        System.out.println(len +" "+ch +" "+st+" "+num +" "+num1 + " "+id +" " +id1);



    }
    
}
