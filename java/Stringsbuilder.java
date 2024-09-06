public class Stringsbuilder {
    public static void main(String[] args) {
        //string builder
       StringBuilder sb =new StringBuilder("patya");
       System.out.println(sb);

       //charbat index 0
       System.out.println(sb.charAt(0));
       // set char at index
       sb.setCharAt(0, 'S');
       System.out.println(sb);
    }
}
