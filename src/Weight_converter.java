import java.util.Scanner;

public class Weight_converter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double weight, newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert to lbs to kgs");
        System.out.println("2: Convert to kgs to lbs");
        System.out.print("Choose an option: ");

        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.4535;
            System.out.printf("The new weight in kgs is %.2f" , newWeight);
        } else if (choice ==2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.204;
            System.out.printf("The new weight in lbs is %.2f" , newWeight);
        }else {
            System.out.println("That is not a valid choice");
        }


        scanner.close();
    }
}
