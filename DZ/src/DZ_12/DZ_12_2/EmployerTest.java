package DZ_12.DZ_12_2;

import java.util.Arrays;

public class EmployerTest {

    public static final String EMP_1 = "emp1";
    public static final String EMP_2 = "emp2";
    public static final String EMP_3 = "emp3";

    public static void main(String[] args) {
        Employer emp = new Employer(EMP_1, new Employer(EMP_2, new Employer(EMP_3, new Employer("Boss"))));

        Employer boss = new Employer("Boss"); // главный босс
        Employer emp3 = new Employer(EMP_3, boss); // // для emp 3 боссом будет boss
        Employer emp2 = new Employer(EMP_2, emp3); // для emp 2 боссом будет emp3
        Employer emp1 = new Employer(EMP_1, emp2);// для emp 1 боссом будет emp2 = просто сотрудник
//        System.out.println(emp1);
//        System.out.println(emp2);
//        System.out.println(emp3);
//        System.out.println(boss);

        Employer employers[] = new Employer[4];
        getAllEmployer(employers, 0, emp1);
        System.out.println(Arrays.toString(employers));

    }
    public static void getAllEmployer (Employer employer[], int currentPosition, Employer currentEmpl){

        employer[currentPosition]= currentEmpl;

        if (currentEmpl.getBoss() != null)
        {
            getAllEmployer(employer, ++currentPosition, currentEmpl.getBoss());
        }
       // employer[currentPosition]= currentEmpl;
    }
}
