// import java.util.Date;
import java.util.Scanner;
import javax.swing.*;

public class PatientDriver {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Hua Box");
/*Patient data = new Patient(001,"Chien-Hua","Wang","1111 Happy-Land","Toronto",
        "ON","MP3 LP1");

        System.out.print( data.getPatientInfo());
    }*/
        Scanner input = new Scanner(System.in);

        Patient mypatient = new Patient();
        //input id
        System.out.println("Please enter the ID for the Patient:");
        int patientid = input.nextInt();
        mypatient.setPatientId(patientid);
        System.out.println();
        //input first name
        System.out.println("Please enter the First Name for the Patient:");
        String fName = input.next();
        mypatient.setfName(fName);
        System.out.println();
        //input last name
        System.out.println("Please enter the Last Name for the Patient:");
        String lName = input.next();
        mypatient.setLName(lName);
        System.out.println();
        //input address
        System.out.println("Please enter the address for the Patient:");
        String address = input.next();
        mypatient.setAddress(address);
        System.out.println();
        //input city
        System.out.println("Please enter the city for the Patient:");
        String city = input.next();
        mypatient.setCity(city);
        System.out.println();
        //input province
        System.out.println("Please enter the province for the Patient:");
        String province = input.next();
        mypatient.setProvince(province);
        System.out.println();
        //input postal code
        System.out.println("Please enter the Postal code for the Patient:");
        String postalcode = input.next();
        mypatient.setpCode(postalcode);
        System.out.println();
        //output value



        JOptionPane.showMessageDialog(frame, String.format("ID:%d%nFirst Name:%s%nLast Name:%s%nAddress:%s%nCity:%s%nProvince:%s%nPostal Code:%s%n",
                mypatient.getPatientId(), mypatient.getFName(),mypatient.getLName(),mypatient.getAddress(),
                mypatient.getCity(),mypatient.getProvince(),mypatient.getProvince()));

        /**
        System.out.printf("ID:%d%nFirst Name:%s%nLast Name:%s%nAddress:%s%nCity:%s%nProvince:%s%nPostal Code:%s%n",
                mypatient.getPatientId(), mypatient.getFName(),mypatient.getLName(),mypatient.getAddress(),
                mypatient.getCity(),mypatient.getProvince(),mypatient.getProvince());**/


    }
}
