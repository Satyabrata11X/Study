public class Stringscharat {
    public static void main(String[] args) {
        //print charactern in strings
        String firstName="Satyabrata";
        String lastName="Behera";
        String fullName=firstName+ " "+lastName;  
        System.out.println(fullName.length());
        //charAt
        for(int i=0;i<fullName.length();i++){
           System.out.println(fullName.charAt(i)); 
        }
    }
}
