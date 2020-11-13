package ru.vilikdin.java;


public class EmployeeApp {


    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Vilikdin Gnatenko", "Engineer", "vilikbag@mail.ru", "89534586234", 30000, 23, false);
        employeeArray[1] = new Employee("Roman Popov", "Engineer", "r.popov@mail.ru", "65412434", 49042, 41, true);
        employeeArray[2] = new Employee("Igor Smalov", "Engineer", "i.smalov@mail.ru", "1243124", 54800, 52, true);
        employeeArray[3] = new Employee("Maxim Karlkov", "SysAdmin", "m.karlkov@mail.ru", "389212434312312", 24500, 42, false);
        employeeArray[4] = new Employee("Ivanov Ivan", "Engineer", "i.ivanod@mail.ru", "4892311232132312", 38000, 24, true);

        for (int i = 0; i < 5; i++) {
            if (employeeArray[i].getAge() > 40) {

                employeeArray[i].printInformation();
            }

        }



    }


}
