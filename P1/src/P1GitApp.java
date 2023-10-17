public class P1GitApp {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        ifExample();
    }

    private static void ifExample(){
        int dayValue = 6;
        if (dayValue >= 1 && dayValue <= 5){
            doWork();
        } else if (dayValue >= 6 && dayValue <= 7) {
            doToRest();
        } else {
            System.err.println("day value is wrong!");
        }
    }
    private static void doWork(){
        System.out.println("I am working");
    }
    private static void doToRest(){
        System.out.println("Resting");
    }

}
