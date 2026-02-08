import java.util.Scanner;
class TrafficLight 
{
    public static void main(String[] args) 
    {
        System.out.println("Sana Tasneem Azimudin=2024503007");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color of the traffic light (red, yellow, or green): ");
        String input = scanner.nextLine().toLowerCase();
        switch (input) 
        {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready to move");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
                break;
}
}

}

