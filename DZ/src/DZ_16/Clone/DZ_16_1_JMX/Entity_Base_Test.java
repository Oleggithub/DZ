package DZ_16.Clone.DZ_16_1_JMX;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Entity_Base_Test {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, CloneNotSupportedException {

//        Entity_Base entity_base = new Entity_Base("Firma1", 1, "OAO");
//       Entity_Base a = entity_base.createObjectFromBaseEntity();
//        System.out.println("entity_base = " + entity_base);
//        System.out.println("a = " + a);


        Entity_Base fazer = new Entity_Base("fazer", 1 , null);
        Entity_Base fazer_child = new Entity_Base("clone_fazer", 1 , fazer);
        //Entity_Base clone_child = (Entity_Base) fazer_child.clone();
        Entity_Base clone_child = fazer_child.clone();

        //clone_child.lightclone();
        printInformationAboutEntity_Base(fazer_child, clone_child);

        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        Entity_Base entity_base1 = new Entity_Base();
        ObjectName objectName = new ObjectName("Entity_Base_M: name=user_test");
        platformMBeanServer.registerMBean(entity_base1, objectName);
       // StandardMBean mbean = new StandardMBean(entity_base1, Entity_Base_M.class);
        //platformMBeanServer.registerMBean(mbean, objectName);
        while(true);


      //  while(true);
    }

    private static void printInformationAboutEntity_Base(Entity_Base fazer_child, Entity_Base clone_child) {
        System.out.println("fazer_child = " + fazer_child);
        System.out.println("clone_child = " + clone_child);

    }
}
