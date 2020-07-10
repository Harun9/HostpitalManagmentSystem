
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HospitalMgmtSystem {
    
    List<doctor> doctorList = new ArrayList<> ();
    List<patient> patientList = new ArrayList<> ();
    List<fecility> fecilityList = new ArrayList<> ();
    List<lab> labList = new ArrayList<> ();
    List<medical> medicalList = new ArrayList<> ();
    List<staff> staffList = new ArrayList<> ();
    
    void readDoctorFile(String filename){
     
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException ex) {
           
        }

        List<String> Data = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);

        try {
            String HeadRow = br.readLine();
        } catch (IOException ex) {
          
        }

        
        String row;
        try {
            while((row = br.readLine())!=null){
                Data.add(row);
            }
        } catch (IOException ex) {
          
        }

   
        for(int s = 0; s<Data.size(); s++){
            String strToParse = Data.get(s);
            Scanner sc = new Scanner(strToParse);
            sc.useDelimiter(" ");
            String[] rowData = new String[6];
            for(int i = 0; i< rowData.length; i++){
                rowData[i] = sc.next();

            }
            doctor d = new doctor(rowData[0],rowData[1],rowData[2],rowData[3],rowData[4],Integer.parseInt(rowData[5]));
            doctorList.add(d);
    }
}
    
    void readPatientFile(String filename){
        
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException ex) {
          
        }

        List<String> Data = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);

        try {
            String HeadRow = br.readLine();
        } catch (IOException ex) {
         
        }

    
        String row;
        try {
            while((row = br.readLine())!=null){
                Data.add(row);
            }
        } catch (IOException ex) {
          
        }


        for(int s = 0; s<Data.size(); s++){
            String strToParse = Data.get(s);
            Scanner sc = new Scanner(strToParse);
            sc.useDelimiter(" ");
            String[] rowData = new String[6];
            for(int i = 0; i< rowData.length; i++){
                rowData[i] = sc.next();

            }
            patient p = new patient(rowData[0],rowData[1],rowData[2],rowData[3],rowData[4],Integer.parseInt(rowData[5]));
            patientList.add(p);
    }
}
    
    void readFecilityFile(String filename){
        
      
        
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException ex) {
          
        }

        List<String> Data = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);

        try {
            String HeadRow = br.readLine();
        } catch (IOException ex) {
          
        }

        String row;
        try {
            while((row = br.readLine())!=null){
                Data.add(row);
            }
        } catch (IOException ex) {
          
        }

        for(int s = 0; s<Data.size(); s++){
            String strToParse = Data.get(s);
            Scanner sc = new Scanner(strToParse);
            sc.useDelimiter(" ");
            String[] rowData = new String[1];
            for(int i = 0; i< rowData.length; i++){
                rowData[i] = sc.next();

            }
            fecility f = new fecility(rowData[0]);
            fecilityList.add(f);
    }
}
    
    void readLabFile(String filename){
        
        
        
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException ex) {
           
        }

        List<String> Data = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);

        try {
            String HeadRow = br.readLine();
        } catch (IOException ex) {

        }

     
        String row;
        try {
            while((row = br.readLine())!=null){
                Data.add(row);
            }
        } catch (IOException ex) {
          
        }

  
        for(int s = 0; s<Data.size(); s++){
            String strToParse = Data.get(s);
            Scanner sc = new Scanner(strToParse);
            sc.useDelimiter(" ");
            String[] rowData = new String[2];
            for(int i = 0; i< rowData.length; i++){
                rowData[i] = sc.next();

            }
            lab l = new lab(rowData[0],Integer.parseInt(rowData[1]));
            labList.add(l);
    }
}
    
    void readMedicalFile(String filename){
        
       
        
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException ex) {
          
        }

        List<String> Data = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);

        try {
            String HeadRow = br.readLine();
        } catch (IOException ex) {
          
        }

      
        String row;
        try {
            while((row = br.readLine())!=null){
                Data.add(row);
            }
        } catch (IOException ex) {
         
        }

        
        for(int s = 0; s<Data.size(); s++){
            String strToParse = Data.get(s);
            Scanner sc = new Scanner(strToParse);
            sc.useDelimiter(" ");
            String[] rowData = new String[5];
            for(int i = 0; i< rowData.length; i++){
                rowData[i] = sc.next();

            }
            medical m = new medical(rowData[0], rowData[1], rowData[2], Integer.parseInt(rowData[3]), Integer.parseInt(rowData[4]));
            medicalList.add(m);
    }
}
    
    void readStaffFile(String filename){
        
        
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException ex) {
         
        }

        List<String> Data = new ArrayList<>();
        BufferedReader br = new BufferedReader(fr);

        try {
            String HeadRow = br.readLine();
        } catch (IOException ex) {
         
        }

      
        String row;
        try {
            while((row = br.readLine())!=null){
                Data.add(row);
            }
        } catch (IOException ex) {
         
        }

    
        for(int s = 0; s<Data.size(); s++){
            String strToParse = Data.get(s);
            Scanner sc = new Scanner(strToParse);
            sc.useDelimiter(" ");
            String[] rowData = new String[5];
            for(int i = 0; i< rowData.length; i++){
                rowData[i] = sc.next();

            }
            staff stf = new staff(rowData[0], rowData[1], rowData[2], rowData[3], Integer.parseInt(rowData[4]));
            staffList.add(stf);
    }
}
    
    
    void writeDoctorFile(doctor[] doctors, String filename) throws IOException{
        
        FileWriter writer = new FileWriter(filename);
       writer.append('\n');
        for(int i = 0; i < doctors.length; i++){
            
            if(doctors[i].did == null){
                break;
            }else{
                writer.append(doctors[i].did);
                writer.append(' ');
                writer.append(doctors[i].dname);
                writer.append(' ');
                writer.append(doctors[i].specilist);
                writer.append(' ');
                writer.append(doctors[i].appoint);
                writer.append(' ');
                writer.append(doctors[i].doc_qual);
                writer.append(' ');
                writer.append(Integer.toString(doctors[i].droom));
                writer.append('\n');

            }
            
        }
        
        
        writer.flush();
        writer.close();
        
    }
    
    void writePatientFile(patient[] patients, String filename) throws IOException{
        
        FileWriter writer = new FileWriter(filename);
        writer.append('\n');
        for(int i = 0; i < patients.length; i++){
            
            if(patients[i].pid == null){
                break;
            }else{
                writer.append(patients[i].pid);
                writer.append(' ');
                writer.append(patients[i].pname);
                writer.append(' ');
                writer.append(patients[i].disease);
                writer.append(' ');
                writer.append(patients[i].sex);
                writer.append(' ');
                writer.append(patients[i].admit_status);
                writer.append(' ');
                writer.append(Integer.toString(patients[i].age));
                writer.append('\n');

            }
            
        }
        
        
        writer.flush();
        writer.close();
        
    }
    
    void writeFecilityFile(fecility[] fecilitys, String filename) throws IOException{
        
        FileWriter writer = new FileWriter(filename);
       writer.append('\n');
        for(int i = 0; i < fecilitys.length; i++){
            
            if(fecilitys[i].fec_name == null){
                break;
            }else{
                writer.append(fecilitys[i].fec_name);
                writer.append('\n');

            }
            
        }
        
        
        writer.flush();
        writer.close();
        
    }
     
    void writeLabFile(lab[] labs, String filename) throws IOException{
        
        FileWriter writer = new FileWriter(filename);
        writer.append('\n');
        for(int i = 0; i < labs.length; i++){
            
            if(labs[i].fecility == null){
                break;
            }else{
                writer.append(labs[i].fecility);
                writer.append(' ');
                writer.append(Integer.toString(labs[i].lab_cost));
                writer.append('\n');

            }
            
        }
        
        
        writer.flush();
        writer.close();
        
    }
    
    void writeMedicalFile(medical[] medicines, String filename) throws IOException{
        
        FileWriter writer = new FileWriter(filename);
        writer.append('\n');
        for(int i = 0; i < medicines.length; i++){
            
            if(medicines[i].med_name == null){
                break;
            }else{
                writer.append(medicines[i].med_name);
                writer.append(' ');
                writer.append(medicines[i].med_comp);
                writer.append(' ');
                writer.append(medicines[i].exp_date);
                writer.append(' ');
                writer.append(Integer.toString(medicines[i].med_cost));
                writer.append(' ');
                writer.append(Integer.toString(medicines[i].count));
                writer.append('\n');

            }
            
        }
        
        
        writer.flush();
        writer.close();
        
    } 
     
    void writeStaffFile(staff[] staffs, String filename) throws IOException{
        
        FileWriter writer = new FileWriter(filename);
        writer.append('\n');
        for(int i = 0; i < staffs.length; i++){
            
            if(staffs[i].sname == null){
                break;
            }else{
                writer.append(staffs[i].sid);
                writer.append(' ');
                writer.append(staffs[i].sname);
                writer.append(' ');
                writer.append(staffs[i].desg);
                writer.append(' ');
                writer.append(staffs[i].sex);
                writer.append(' ');
                writer.append(Integer.toString(staffs[i].salary));
                writer.append('\n');

            }
            
        }
        
        
        writer.flush();
        writer.close();
        
    }
    
    
    
    public static void main(String args[]) throws IOException {
        
        HospitalMgmtSystem hospital = new HospitalMgmtSystem(); 
        
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };

        Calendar calendar = Calendar.getInstance();

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println(" *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        doctor[] d = new doctor[25];

        patient[] p = new patient[100];

        lab[] l = new lab[20];

        fecility[] f = new fecility[20];

        medical[] m = new medical[100];

        staff[] s = new staff[100];

        //calling read files for all classes
        hospital.readDoctorFile("doctor1.txt");
        hospital.readPatientFile("patient.txt");
        hospital.readMedicalFile("medical.txt");
        hospital.readLabFile("lab.txt");
        hospital.readFecilityFile("fecility.txt");
       hospital.readStaffFile("staff.txt");
        
        
        
        int i;

        for(i = 0; i < hospital.doctorList.size(); i++){
            d[i] = hospital.doctorList.get(i);
            count1++;
        }
        
        for (;i < 25; i++) {
            d[i] = new doctor();
        }
        
        for(i = 0; i < hospital.patientList.size(); i++){
            p[i] = hospital.patientList.get(i);
            count2++;
        }
        

        for (; i < 100; i++) {
            p[i] = new patient();
        }
        
        for(i = 0; i < hospital.labList.size(); i++){
            l[i] = hospital.labList.get(i);
            count4++;
        }

        for (; i < 20; i++) {
            l[i] = new lab();
        }
        
        for(i = 0; i < hospital.fecilityList.size(); i++){
            f[i] = hospital.fecilityList.get(i);
            count5++;
        }
        
        for (; i < 20; i++) {
            f[i] = new fecility();
        }
        
        for(i = 0; i < hospital.medicalList.size(); i++){
            m[i] = hospital.medicalList.get(i);
            count3++;
        }
        
        for (; i < 100; i++) {
            m[i] = new medical();
        }
        
        for(i = 0; i < hospital.staffList.size(); i++){
            s[i] = hospital.staffList.get(i);
            count6++;
        }

        for (; i < 100; i++) {
            s[i] = new staff();
        }

        Scanner input = new Scanner(System.in);

        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;

        while (status == 1) {
            System.out.println("\n MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos 2. Patients 3.Medicines 4.Laboratories 5. Facilities 6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");

            choice = input.nextInt();
            switch (choice) {

                case 1: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println(" **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    s1 = 1;

                    while (s1 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {

//d[count1].new_doctor();count1++;
                                FileReader fr = new FileReader("doctor1.txt");
                                List<String> Data = new ArrayList<>();
                                BufferedReader br = new BufferedReader(fr);
                                String HeadRow = br.readLine();
                                String row;
                                while ((row = br.readLine()) != null) {
                                    //System.out.println(row);
                                    Data.add(row);
                                    d[count1].new_doctor();
                                    count1++;
                                    break;
                                }
                            }

                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count1; j++) {
                                    d[j].doctor_info();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }

                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println(" **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    s2 = 1;

                    while (s2 == 1) {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1) {
                            case 1: {
                                p[count2].new_patient();
                                count2++;
                                break;
                            }

                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    p[j].patient_info();
                                }
                                break;
                            }
                        }

                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }

                case 3: {
                    s3 = 1;

                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println(" **MEDICINE SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    while (s3 == 1) {
                        System.out.println("1.Add New Entry\n2. Existing Medicines List");
                        c1 = input.nextInt();

                        switch (c1) {

                            case 1: {
                                m[count3].new_medi();
                                count3++;
                                break;
                            }

                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count3; j++) {
                                    m[j].find_medi();
                                }
                                break;
                            }

                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s3 = input.nextInt();
                    }
                    break;
                }

                case 4: {
                    s4 = 1;

                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println(" **LABORATORY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                        c1 = input.nextInt();

                        switch (c1) {
                            case 1: {
                                l[count4].new_feci();
                                count4++;
                                break;
                            }

                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Fecilities\t\t Cost");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count4; j++) {
                                    l[j].feci_list();
                                }
                                break;
                            }
                        }

                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s4 = input.nextInt();
                    }
                    break;
                }

                case 5: {
                    s5 = 1;

                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println(" **HOSPITAL FACILITY SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    while (s5 == 1) {
                        System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                        c1 = input.nextInt();

                        switch (c1) {
                            case 1: {
                                f[count5].add_feci();
                                count5++;
                                break;
                            }

                            case 2: {

                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Hospital Facility are:");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count5; j++) {
                                    f[j].show_feci();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5 = input.nextInt();
                    }
                    break;
                }

                case 6: {
                    s6 = 1;

                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println(" **STAFF SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    while (s6 == 1) {
                        String a = "nurse", b = "worker", c = "security";
                        System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                        c1 = input.nextInt();

                        switch (c1) {
                            case 1: {
                                s[count6].new_staff();
                               count6++;
                                break;
                            }

                            case 2: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");
                                
                                for (j = 0; j < count6; j++) {
                                    if (a.equals(s[j].desg)) {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }

                            case 3: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count6; j++) {
                                    if (b.equals(s[j].desg)) {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Gender \t Salary");
                                System.out.println("--------------------------------------------------------------------------------");

                                for (j = 0; j < count6; j++) {
                                    if (c.equals(s[j].desg)) {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s6 = input.nextInt();
                    }
                    break;
                }
                default: {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }

            System.out.println("\nReturn to MAIN MENU Press 1");

            status = input.nextInt();

            hospital.writeDoctorFile(d,"doctor1.txt");
            hospital.writePatientFile(p,"patient.txt");
            hospital.writeMedicalFile(m,"medical.txt");
            hospital.writeLabFile(l,"lab.txt");
            hospital.writeFecilityFile(f,"fecility.txt");
            hospital.writeStaffFile(s,"staff.txt");
            
            
        }
        
        
        
    }
}
