package base;

import java.util.ArrayList;
import java.util.Date;

public class Organization {

    /////////////// People ///////////////

    class Person {
        ArrayList<Hospital> hospitals;

        String title;
        String givenName;
        String middleName;
        String familyName;
        FullName name;
        Date birthDate;
        Gender gender;
        Address homeAddress;
        Phone phone;
    }

    class Patient extends Person {
        ArrayList<OperationsStaff> operationsStaffs;

        String id;
        Integer age;
        Date accepted;
        History sickness;
        String[] prescriptions;
        String[] allergies;
        String[] specialReqs;
    }

    /////////////// Hospital ///////////////

    class Hospital {
        ArrayList<Person> people;
        ArrayList<Department> departments;

        String name;
        Address address;
        Phone phone;
    }

    class Department {
        Hospital hospital;
        ArrayList<Staff> staffs;
    }

    ////////// Staff //////////

    class Staff extends Person {
        Department department;

        Date joined;
        String[] education;
        String[] certification;
        String[] languages;
    }

    ///// Operations staff /////

    class OperationsStaff extends Staff {
        ArrayList<Patient> patients;
    }

    class Doctor extends OperationsStaff {
        String[] speciality;
        String[] locations;
    }

    class Nurse extends OperationsStaff {

    }

    class Surgeon extends Doctor {

    }

    ///// Administrative Staff /////

    class AdministrativeStaff extends Staff {

    }

    class FrontDeskStaff extends AdministrativeStaff {

    }

    class Receptionist extends FrontDeskStaff {

    }

    ///// TechnicalStaff /////

    class TechnicalStaff extends Staff {

    }

    class Technician extends TechnicalStaff {

    }

    class Technologist extends TechnicalStaff {

    }

    class SurgicalTechnologist extends Technologist {

    }

    ///////////////////////// Supplementary classes /////////////////////////

    class FullName {
        String lastName;   // Last name
        String firstName;  // First name
        String middleName; // Middle name
    }

    class Gender {
        String gender;
    }

    class Address {
        String address;
    }

    class Phone {
        String phone;
    }

    class History {
        ArrayList<String> history;
    }
}
