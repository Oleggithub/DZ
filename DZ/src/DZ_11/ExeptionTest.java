package DZ_11;

public class ExeptionTest {
    public static void main(String[] args) {
        try {
            throw new Child1Exeption();
        } catch (Child2Exeption e){
        } catch (Child3Exeption e){
        } catch (Child1Exeption e){
        }
        catch(ChildExeption e){
        }
    }
}

class ChildExeption extends Exception {
    private static String message = "Child";

    ChildExeption() {
    }

    public ChildExeption(String message) {
        super(message);
    }

}

class Child1Exeption extends ChildExeption {

}

class Child2Exeption extends Child1Exeption {

}

class Child3Exeption extends Child1Exeption {

}