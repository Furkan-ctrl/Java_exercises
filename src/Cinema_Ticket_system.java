public class Cinema_Ticket_system {
    public static void main(String[] args) {

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.9;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            } else {
                price *= 1;
            }
        }

        System.out.println("Final ticket price: $" + price);
    }
}
