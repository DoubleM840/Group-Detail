import java.util.Scanner;

class GroupMember {
    String regNo;
    String fullName;
    String dateOfBirth;
    double averageScore;
    char grade;

    GroupMember(String regNo, String fullName, String dateOfBirth, double averageScore) {
        this.regNo = regNo;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.averageScore = averageScore;
        this.grade = calculateGrade(averageScore);
    }

    private char calculateGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayDetails() {
        System.out.println("Reg No: " + regNo);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}

public class GroupDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMembers;

        System.out.print("Enter the number of group members: ");
        numberOfMembers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        GroupMember[] members = new GroupMember[numberOfMembers];

        for (int i = 0; i < numberOfMembers; i++) {
            System.out.println("Enter details for member " + (i + 1) + ":");

            System.out.print("Reg No: ");
            String regNo = scanner.nextLine();

            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();

            System.out.print("Date of Birth (YYYY-MM-DD): ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("Average Score: ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            members[i] = new GroupMember(regNo, fullName, dateOfBirth, averageScore);
        }

        System.out.println("\nGroup Members Details:");
        for (GroupMember member : members) {
            System.out.println("------------------------------------------");
            member.displayDetails();
        }

        scanner.close();
    }
}