package DZ_10.DZ_10_1;

public class Test_Exeption {
    public static void main(String[] args) {


        Check_Exeption1 ch_exeption = new Check_Exeption1();
        Uncheck_Exeption unch_exeption = new Uncheck_Exeption();
        try {
            ch_exeption.check_exeption();
        } catch (Exception re) {
            System.out.print(".....");
        } finally {
            System.out.println("finally Checked_Exeption ");
        }
        try {
            unch_exeption.uncheck_runtime();
        } catch (RuntimeException re) {
            System.out.print(".....");
        } finally {
            System.out.println("finally Unchecked_Exeption ");
        }

    }
}



