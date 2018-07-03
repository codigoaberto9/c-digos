import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeAutomatizado {

	public static void main(String[] args) {
		


	       //Preparando o ambiente para poder abrir o chrome

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cielo\\Documents\\seleniumm\\chromedriver.exe");


	        //Abrindo o Chrome
	        WebDriver driver = new ChromeDriver();

	        //Acessar um site
	        driver.get("https://www.google.com.br");
	  
	        // Buscando Elemento 
	       WebElement campoDeTexto = driver.findElement(By.id("lst-ib"));
	       campoDeTexto.sendKeys(" https://www.youtube.com/?hl=pt&gl=BR");
           campoDeTexto.submit();
	       
	       WebElement linkSite = driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div/div/h3/a"));
	       linkSite.click();
	       
	       
	       WebElement campoDeSite = driver.findElement(By.name("search_query"));
	       campoDeSite.sendKeys("Como estou fazendo isso ? ");
	       
	       
	       WebElement campoDeSite2 = driver.findElement(By.name("search_query"));
	       campoDeSite2.sendKeys(" Você já vai Descobrir!!!!\n");
	       
	       
	     

	       WebElement campoDeVideo = driver.findElement(By.xpath("//*[@id=\'video-title\']" +"\n"));
	       campoDeVideo.click();
	       
	       
	       driver.get("https://www.alura.com.br/");
	       
	      WebElement campoLogin = driver.findElement(By.className("header-utilitario-login" ));
	      campoLogin.click();
	       
	     
	      
	      
	      WebElement entrarLogin = driver.findElement(By.className("fill-with-cached-email"));
	      entrarLogin.click();
	      entrarLogin.sendKeys("gustavo-meneghetti@hotmail.com");
	      WebElement entrarSenha = driver.findElement(By.name("password"));
	      entrarSenha.click();
	      entrarSenha.sendKeys("gume.93"+ "\n");
	      
	      WebElement cursoEntrar = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/section/div[2]/a[1]"));
	      cursoEntrar.click();
	      
	      WebElement continuarCurso = driver.findElement(By.xpath("/html/body/section[2]/section/div[2]/div[2]/div/a[1]"));
	      continuarCurso.click();
	      
	      WebElement playNaAula = driver.findElement(By.className("vjs-big-play-button"));
	      playNaAula.click();
	      
	    
	     
		
	}
	
}
