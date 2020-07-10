import java.util.Scanner;

public class lab

{
String fecility;
int lab_cost;

    public lab() {
    }

    public lab(String fecility, int lab_cost) {
        this.fecility = fecility;
        this.lab_cost = lab_cost;
    }



void new_feci()
{
Scanner input = new Scanner(System.in);

System.out.print("fecility:-");
fecility = input.nextLine();

System.out.print("cost:-");
lab_cost = input.nextInt();

}

void feci_list()
{
System.out.println(fecility + " "+"\t" +" "+" "+ lab_cost);

}
}
