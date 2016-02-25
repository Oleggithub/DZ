package DZ_16.Clone.JMX;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMXTest {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException {
        MBeanServer platformMXBeanServer = ManagementFactory.getPlatformMBeanServer();
        CalculatorMBean calculatorMBean = new Calculator(12,13);
        ObjectName objectName = new ObjectName("CalculatorMBean:name=calculator");
        platformMXBeanServer.registerMBean(calculatorMBean,objectName);
        while(true);
    }
}
