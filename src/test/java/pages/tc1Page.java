import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1Page {
    
    private WebDriver driver;

    public tc1Page() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        this.driver = new ChromeDriver();
    }

    public void iniciarAplicacion() {
        driver.get("http://url-de-la-aplicacion.com");
    }

    public boolean verificarAplicacionIniciada() {
        // Verificar algunos elementos de la aplicación para confirmar que se inició correctamente
        return driver.getTitle().contains("Título de la aplicación");
    }

    public void cerrar() {
        if (driver != null) {
            driver.quit();
        }
    }
}