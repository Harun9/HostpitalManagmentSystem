import java.util.Scanner;

public class patient {

	
	String pid, pname, disease, sex, admit_status;
	int age;
	void new_patient()

	{
	Scanner input = new Scanner(System.in);

	System.out.print("id:-");
	pid = input.nextLine();

	System.out.print("name:-");
	pname = input.nextLine();

	System.out.print("disease:-");
	disease = input.nextLine();

	System.out.print("sex:-");
	sex = input.nextLine();

	System.out.print("admit_status:-");
	admit_status = input.nextLine();

	System.out.print("age:-");
	age = input.nextInt();

	}

    public patient(String pid, String pname, String disease, String sex, String admit_status, int age) {
        this.pid = pid;
        this.pname = pname;
        this.disease = disease;
        this.sex = sex;
        this.admit_status = admit_status;
        this.age = age;
    }

    public patient() {
    }

	void patient_info()
	{
	System.out.println(pid + "\t" + pname + " \t" + disease + " \t" + sex + " \t" + admit_status + "\t" + age);
	}
	}

