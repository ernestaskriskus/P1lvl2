public class P1GitApp {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        ifExample();
    }

    private static void ifExample(){
        int dayValue = 6;
        if (dayValue >= 1 && dayValue <= 5){
            working();
        } else if (dayValue >= 6 && dayValue <= 7) {
            resting();
        } else {
            System.err.println("day value is wrong!");
        }
    }
private static void working(){
    System.out.println("I am working");
}
private static void resting(){
    System.out.println("Resting");
}

}
