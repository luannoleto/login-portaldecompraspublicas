package config;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestConfig {

    @BeforeMethod
    public static void abrirNavegador() {

        Configuration.browser = "Chrome";
        open("http://www.homologacao.wcompras.com.br/18/loginext/");
        Configuration.startMaximized = true;
        Configuration.timeout = 30000;

//        db = new Database();
    }

//    public static Database db;


    @AfterMethod
    public static void finish() throws SQLException, ClassNotFoundException {
//        db.deleteUserBloqueado();
//        Database.getConnection().close();
        closeWebDriver();
    }
}
