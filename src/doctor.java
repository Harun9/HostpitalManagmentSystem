import java.util.Scanner;

public class doctor {
	

	
	String did, dname, specilist, appoint, doc_qual;
	int droom;

    public doctor(){
        
    }
        
    public doctor(String did, String dname, String specilist, String appoint, String doc_qual, int droom) {
        this.did = did;
        this.dname = dname;
        this.specilist = specilist;
        this.appoint = appoint;
        this.doc_qual = doc_qual;
        this.droom = droom;
    }
        
        
	void new_doctor()

	{
	Scanner input = new Scanner(System.in);

	System.out.print("id:-");
	did = input.nextLine();

	System.out.print("name:-");
	dname = input.nextLine();

	System.out.print("specilization:-");
	specilist = input.nextLine();

	System.out.print("work time:-");
	appoint = input.nextLine();

	System.out.print("qualification:-");
	doc_qual = input.nextLine();

	System.out.print("room no.:-");
	droom = input.nextInt();

	}

	void doctor_info()

	{
	System.out.println(did + "\t" + dname + " "+"\t" + specilist +" "+ "\t" + appoint + "\t" + doc_qual + "\t" + droom);
	

	}
	}

