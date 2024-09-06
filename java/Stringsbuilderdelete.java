public class Stringsbuilderdelete {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("SSatya");
        System.out.println(sb);
        //delete character in string
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
