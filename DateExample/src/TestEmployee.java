import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class TestEmployee {

    public static void main(String args[]){
        Employee empOne = new Employee();
        String name, phone, birthYear, birthMonth,birthDay;
        LocalDate bDate;

        //input
        name = JOptionPane.showInputDialog(null, "Enter your name: ");
        empOne.setEmpName(name);

        phone = JOptionPane.showInputDialog(null, "Enter your phone number with area code first; ");
        empOne.setEmpPhone(phone);
        birthMonth = JOptionPane.showInputDialog(null, "Enter your birth month");
        birthDay = JOptionPane.showInputDialog(null, "Enter your birth day");
        birthYear = JOptionPane.showInputDialog(null, "Enter your birth year");

        bDate = LocalDate.of(Integer.parseInt(birthYear), Integer.parseInt(birthMonth), Integer.parseInt(birthDay));
        empOne.setEmpBirthDate(bDate);

        //calculate age
        LocalDate today = LocalDate.now();
        Period span = Period.between(empOne.getEmpBirthDate(), today);
        int age = span.getYears();

        //output
        System.out.println("Today is "+ today.getDayOfWeek());
        System.out.println("Name: " +empOne.getEmpName()+
                "\nPhone: "+ empOne.getEmpPhone() +
                "\nBirthdate: " +empOne.getEmpBirthDate() +
                "\nAge: "+age);
    }
}
