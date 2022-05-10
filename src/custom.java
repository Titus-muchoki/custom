public class custom {
    int y = 19;
    public static void main(String[] args) {
        custom myObj = new custom();
        custom myObj1 = new custom();
        myObj.y = 100;
        System.out.println(myObj.y);
        System.out.println(myObj1.y);
    }
}
