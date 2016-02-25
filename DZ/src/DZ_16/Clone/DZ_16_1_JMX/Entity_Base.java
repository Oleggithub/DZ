package DZ_16.Clone.DZ_16_1_JMX;

public class Entity_Base {
    String entity_name;
    int entity_kod;
    String entity_vid;

    public Entity_Base(String entity_name, int entity_kod, String entity_vid) {
        this.entity_name = entity_name;
        this.entity_kod = entity_kod;
        this.entity_vid = entity_vid;
    }

    public String getEntity_name() {
        return entity_name;
    }

    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name;
    }

    public int getEntity_kod() {
        return entity_kod;
    }

    public void setEntity_kod(int entity_kod) {
        this.entity_kod = entity_kod;
    }

    public String getEntity_vid() {
        return entity_vid;
    }

    public void setEntity_vid(String entity_vid) {
        this.entity_vid = entity_vid;
    }

    @Override
    public String toString() {
        return "Entity_Base{" +
                "entity_name='" + entity_name + '\'' +
                ", entity_kod=" + entity_kod +
                ", entity_vid='" + entity_vid + '\'' +
                '}';
    }
    public void createObjectFromBaseEntity(){
        Entity_Base entity_base = new Entity_Base("Firma1", 1, "OOO");
    }
}
