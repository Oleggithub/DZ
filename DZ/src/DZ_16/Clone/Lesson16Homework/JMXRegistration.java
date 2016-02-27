package DZ_16.Clone.Lesson16Homework;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMXRegistration {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        UserMBean userMBean = new User();
        ObjectName objectName = new ObjectName("user: name=user_test");
        platformMBeanServer.registerMBean(userMBean, objectName);
        while(true);
    }
}
