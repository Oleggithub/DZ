package DZ_12.DZ_12_2;

public class Employer {
    private String name;
    private Employer boss;
    private Employer vsem_boss;



    public Employer getVsem_boss() {
        return vsem_boss;
    }

    public void setVsem_boss(Employer vsem_boss) {
        this.vsem_boss = vsem_boss;
    }

    public Employer(Employer vsem_boss) {
        this.vsem_boss = vsem_boss;
    }

    public Employer(String name, Employer boss) {
        this.name = name;
        this.boss = boss;
    }

    public Employer(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getBoss() {
        return boss;
    }

    public void setBoss(Employer boss) {
        this.boss = boss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employer employer = (Employer) o;

        if (name != null ? !name.equals(employer.name) : employer.name != null) return false;
        if (boss != null ? !boss.equals(employer.boss) : employer.boss != null) return false;
        return !(vsem_boss != null ? !vsem_boss.equals(employer.vsem_boss) : employer.vsem_boss != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (boss != null ? boss.hashCode() : 0);
        result = 31 * result + (vsem_boss != null ? vsem_boss.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                //", boss=" + boss +
               // ", vsem_boss=" + vsem_boss +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Employer{" +
//                "name='" + name + '\'' +
//               // ", boss=" + boss +
//                '}';
//    }
}
