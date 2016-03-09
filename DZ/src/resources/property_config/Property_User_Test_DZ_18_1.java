package resources.property_config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Property_User_Test_DZ_18_1 {
    public static void main(String[] args) throws IOException {

        //использование getResourceAsStream - стандартный класслоадер
        getPropertyFileByAbsolutePath();
        getPropertyFileByRelPath();
        //       getPropertyFileUsingClassLoader();

        //использование класслоадера

    }

    //КЛАССЛОАДЕР - > АБСОЛЮТНЫЙ ПУТЬ ПО-УМОЛЧАНИЮ, ОПРЕДЕЛЯТЬ СЛЕШ ВПЕРЕДИ - УЖЕ НЕ НУЖНО!! - ЭТО ВАЖНО

    private static void getPropertyFileUsingClassLoader() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream = Property_User_Test_DZ_18_1.class.getClassLoader().
                getResourceAsStream("user_config_data_set.properties");
        //    properties.load(resourceAsStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("company"));

        resourceAsStream = Property_User_Test_DZ_18_1.class.getClassLoader().
                getResourceAsStream("property_config/user_config_data_set.properties");
        properties.load(resourceAsStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("company"));

    }

    private static void getPropertyFileByRelPath() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream = Property_User_Test_DZ_18_1.class.getResourceAsStream("user_config_data_set.properties");
        properties.load(resourceAsStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("company"));
    }

    private static void getPropertyFileByAbsolutePath() throws IOException {
        Properties properties = new Properties();
        InputStream resourceAsStream = Property_User_Test_DZ_18_1.class.getResourceAsStream("user_config_data_set.properties");
        properties.load(resourceAsStream);
        System.out.println(properties.get("username"));
        System.out.println(properties.get("company"));
    }

}
