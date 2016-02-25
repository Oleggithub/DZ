package DZ_16.Clone.DZ_16_1_JMX;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;

import static DZ_16.Clone.DZ_16_1_JMX.Entity_Base_M.createObjectFromBaseEntity;

public class Entity_Base_Test {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {

        Entity_Base entity_base = new Entity_Base("Firma1", 1, "OOO");
       createObjectFromBaseEntity();
        System.out.println("entity_base = " + entity_base);

      //  while(true);
    }
}
