public class STRINGS_2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.insert(2,12);
        System.out.println(builder.toString());
    }
}
