package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig() {
        File src = new File("./Configurations/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is" + e.getMessage());
        }
    }

    public String getUrl() {
        return pro.getProperty("Url");
    }
    public String getEmail() {
        return pro.getProperty("email");
    }
    public String getCustomerID() {
        return pro.getProperty("customerID");
    }
}
