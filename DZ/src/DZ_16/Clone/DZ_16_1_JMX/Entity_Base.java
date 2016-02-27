package DZ_16.Clone.DZ_16_1_JMX;

public class Entity_Base implements Cloneable{
    String entity_name;
    int entity_kod;
    Entity_Base entity_vid;

    public Entity_Base() {
    }

//    public Entity_Base(String firma2, int entity_kod, String ooo) {
//
//    }
//public Entity_Base lightclone() throws CloneNotSupportedException {
//    return (Entity_Base) super.clone();
//}
    @Override
    public Entity_Base clone() throws CloneNotSupportedException {
        Entity_Base clone = (Entity_Base) super.clone(); // при углубленном клонировании
        Entity_Base parentClone = clone.entity_vid == null ? null : clone.entity_vid.clone(); // проверка на ошибку NullPointer
        clone.setEntity_vid(parentClone);
        return clone; // при углубленном клонировании
        // return super.clone(); // при поверхностное клонирование и при objecte
    }

    public Entity_Base(String entity_name, int entity_kod, Entity_Base entity_vid) {
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

    public Entity_Base getEntity_vid() {
        return entity_vid;
    }

    public void setEntity_vid(Entity_Base entity_vid) {
        this.entity_vid = entity_vid;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public String toString() {
        return "Entity_Base{" +
                "entity_name='" + entity_name + '\'' +
                ", entity_kod=" + entity_kod +
                ", entity_vid=" + entity_vid +
                '}';
    }
//    public Entity_Base createObjectFromBaseEntity(){
//        Entity_Base entity_base = new Entity_Base("Firma2", 2, "OOO");
//        return entity_base;
//    }
}
