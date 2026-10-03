import java.util.*;

public class SolarEnergyMoniter {
static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
return morningEnergy + eveningEnergy;
}
public static void main(String[] args) {

int panelID = 101;
double energy = 10;
int panels = 10;
char status = 'A'; // A = Activate

System.out.println("Panel ID =" + panelID);
System.out.println("Energy generated in kWh =" + energy);
System.out.println("Number of solar panels = " + panels);
System.out.println("System status = "+ status);

if(energy >= 10) {
System.out.println("Good Energy Generation");
} else {
System.out.println("Low Energy Generation");
}

Scanner sc = new Scanner(System.in);

System.out.print("Enter morning energy: ");
double morningEnergy = sc.nextDouble();

System.out.print("Enter evening energy: ");
double eveningEnergy = sc.nextDouble();

double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

System.out.println("Total Energy Generated = " + totalEnergy + " kWh");
}
    } 






