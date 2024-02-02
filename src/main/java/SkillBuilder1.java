import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String friendName = input.nextLine();

        System.out.println("Enter a floating-point number: ");
        double spice = input.nextDouble();

        double equt = (4.0/3.0)*Math.pow (2, Math.sqrt (5)/Math.pow(spice, 3));
        System.out.println("Well" + friendName + ",the spice value resulted in " + equt);

        double newNumber = Math.round (equt*100.0)/100.0;
        System.out.println("And the converted value is ");





    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double wallArea = wallHeight*wallWidth;
        System.out.println("Wall area: "+ wallArea + " square feet");

        double paintPaint = wallArea/squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", paintPaint);

        int paintCan = (int)Math.ceil(gallonsPerCan*paintPaint);
        System.out.println("Cans needed:" + paintCan + "can(s)");
    }
}
