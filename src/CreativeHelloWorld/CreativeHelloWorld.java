package CreativeHelloWorld;

public class CreativeHelloWorld {
    public static void main(String[] args) {
        System.out.println(greet());
    }

    public static String greet() {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 104);
        sb.append((char) 101);
        sb.append((char) 108);
        sb.append((char) 108);
        sb.append((char) 111);
        sb.append((char) 32);
        sb.append((char) 119);
        sb.append((char) 111);
        sb.append((char) 114);
        sb.append((char) 108);
        sb.append((char) 100);
        sb.append((char) 33);
        return sb.toString();
    }
}
