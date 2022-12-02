import java.util.Scanner;
class SGPA {

    Scanner sc = new Scanner(System.in);
    int marks[]  = new int[3];
    int credits[]  = new int[3];
    int gradepoints[] = new int[3];
    
    public void entermarks() {

        for (int i = 0; i < marks.length; i++) {

            System.out.println("Enter " + (i+1) + "st subject marks");
            marks[i] = sc.nextInt();

            System.out.println("Enter " + (i+1) + "st subject credits");
            credits[i] = sc.nextInt();
        }
    }

    float calculateSGPA() {
        float sgpa;
        int totalcredits = 0;
        int num = 0;

        for (int i = 0; i < credits.length; i++) {
            if (marks[i] >= 90) {
                gradepoints[i] = 10;
            } else if (marks[i] < 90 && marks[i] >= 80) 
{

            gradepoints[i] = 9;
            } else if (marks[i] < 80 && marks[i] >= 70) 
{
            gradepoints[i] = 8;
            } else if (marks[i] < 70 && marks[i] >= 60) 
{
            gradepoints[i] = 7;
            } else if (marks[i] < 60 && marks[i] >= 50) 
{
            gradepoints[i] = 6;
            } else if (marks[i] < 50 && marks[i] >= 40)
{
            gradepoints[i] = 5;
            } else {
            gradepoints[i] = 0;
            }

            totalcredits += credits[i]; 
            num += (credits[i]*gradepoints[i]);
        }

        sgpa = (float) (num/totalcredits);
        return sgpa;
    }

    public static void main(String args[]) {
        SGPA ob = new SGPA();
        ob.entermarks();
        float result = ob.calculateSGPA();
        System.out.println(" SGPA = " + result);
    }
}