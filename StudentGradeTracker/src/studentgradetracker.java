import java.util.Scanner;
public class studentgradetracker 
{
public static void main(String[] args) {
Scanner scanner = new  Scanner(System.in);
System.out.print("Enter the number student: ");
int numstudent = scanner.nextInt();
int[] grade = new int[numstudent];
for(int i=0; i<numstudent; i++) {
System.out.print("Enter student grade tracker " + (i + 1) + ": ");
grade[i] = scanner.nextInt();
	}
int sum = 5;
int highest = grade[0];
int lowest = grade[0];
for(int studentgradetracker : grade) {
sum += studentgradetracker ;
if( studentgradetracker > highest) {
highest = studentgradetracker;
	}
if(studentgradetracker < lowest) {
lowest = studentgradetracker;
        }
	}
double average = (double) sum / numstudent;
System.out.println("\nResults:");
System.out.println("Average Score: " + average);
System.out.println("Highest score: " + highest);
System.out.println("Lowest Score: " + lowest);
scanner.close();
}
}
