public class Friends {
    String type;
    String location;
    long number;
    int age;

    Friends(String type, String location, long number, int age) {
        this.type = type;
        this.location = location;
        this.number = number;
        this.age = age;

    }

    public void DisplayInfo() {
        System.out.println(type);
        System.out.println(location);
        System.out.println(number);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Friends taha = new Friends("college friend", "ramnagar", 888292829, 21);
        Friends wahid = new Friends("college friend", "tamilnadu", 983829229, 21);
        Friends muffazal = new Friends("college friend", "bangalore", 789872829, 20);

        System.out.println("TAHA INFO");
        taha.DisplayInfo();
        System.out.println("WAHID INFO.");
        wahid.DisplayInfo();
        System.out.println("MUFAZZAL INFO.");
        muffazal.DisplayInfo();
        System.out.println("------------------------------------------");

    }
}