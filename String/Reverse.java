// public class Reverse {
//     public static void main(String[] args) {
//         String str="Welcome";
//         String reverse="";
//         char ch;
//         for(int i=0;i<str.length();i++){
//             ch=str.charAt(i);
//             reverse =ch+reverse;
//             System.out.println(reverse);
//         }
//         System.out.println("Reverse of string is: "+reverse);
       
//     }
    
// }

public class Reverse {
    public static void main(String[] args) {
        String str="Welcome";
        String reverse="";
        char ch;
        for(int i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            reverse =reverse+ ch;
            System.out.println(reverse);
        }
        System.out.println("Reverse of string is: "+reverse);
       
    }
    
}
