package DZ_20.generic_with;

public class SecurityBox<T> {

    private T securityThing;

    public T getSecurityThing() {
        return securityThing;
    }

    public void setSecurityThing(T securityThing) {
        this.securityThing = securityThing;
    }
}
