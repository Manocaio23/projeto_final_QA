package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import PageObjetcs.EnterInsurantDataPageObject;
import PageObjetcs.EnterProductDataPageObject;
import PageObjetcs.EnterVehicleDataPageObjetc;
import PageObjetcs.SelectPriceOptionPageObject;
import PageObjetcs.SendQuotePageObjects;
import Ultis.Utils;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastroStepDefinition extends Utils {

	private WebDriver driver;

	@Before
	public void Setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\CAIO\\Documents\\Teste de Software\\Selenium/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();

	}

	@Dado("que estou no site da tricentis")
	public void que_estou_no_site_da_tricentis() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");

	}

	@Quando("preencher {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} do formulario da aba enteer Vehicle Data e clicar em Next")
	public void preencher_do_formulario_da_aba_enteer_vehicle_data_e_clicar_em_next(String marca, String modelo,
			String cilindrada, String desepenho, String dataFabircacao, String assentos, String assentos2,
			String tipoCom, String payload, String TotalWheit, String pesoT, String precoTabela, String KM)
			throws InterruptedException {

		selectElementByValueMethod(this.driver, EnterVehicleDataPageObjetc.make, marca);
		selectElementByValueMethod(this.driver, EnterVehicleDataPageObjetc.model, modelo);
		Input(driver, EnterVehicleDataPageObjetc.cylindercapacity, cilindrada);
		Input(driver, EnterVehicleDataPageObjetc.engineperformance, desepenho);
		Input(driver, EnterVehicleDataPageObjetc.dateofmanufacture, dataFabircacao);
		Input(driver, EnterVehicleDataPageObjetc.numberofseats, assentos);
		selectElementByValueMethod(this.driver, EnterVehicleDataPageObjetc.numberofseatsmotorcycle, assentos2);
		selectElementByValueMethod(this.driver, EnterVehicleDataPageObjetc.fuel, tipoCom);
		Input(driver, EnterVehicleDataPageObjetc.payload, payload);

		Input(driver, EnterVehicleDataPageObjetc.totalweight, TotalWheit);
		Input(driver, EnterVehicleDataPageObjetc.listprice, pesoT);
		Input(driver, EnterVehicleDataPageObjetc.licenseplatenumber, precoTabela);
		Input(driver, EnterVehicleDataPageObjetc.annualmileage, KM);

		Thread.sleep(1500);

		Click(driver, EnterVehicleDataPageObjetc.nextenterinsurantdata);

	}

	@E("preencher {string} {string} {string} {string} {string} {string}  {string} {string} os dados do formulario da aba enter Insurante Data e clicar em Next")
	public void preencher_os_dados_do_formulario_da_aba_enter_insurante_data_e_clicar_em_next(String PrimeiroNome,
			String UltimoNome, String Nascimento, String Genero, String Cep, String Pais, String Ocupacao,
			String Hobbies) throws InterruptedException {

		Input(driver, EnterInsurantDataPageObject.firstname, PrimeiroNome);
		Input(driver, EnterInsurantDataPageObject.lastname, UltimoNome);
		Input(driver, EnterInsurantDataPageObject.birthdate, Nascimento);

		if (Genero.equalsIgnoreCase("Masculino")) {

			Genero = "3";
		} else {
			Genero = "4";
		}
		Click(driver, EnterInsurantDataPageObject.setarGenero(Genero));

		selectElementByValueMethod(this.driver, EnterInsurantDataPageObject.country, Pais);
		Input(driver, EnterInsurantDataPageObject.zipcode, Cep);
		selectElementByValueMethod(this.driver, EnterInsurantDataPageObject.occupation, Ocupacao);

		switch (Hobbies) {
		case "Speeding":
			Hobbies = "1";
			break;

		case "Bungee Jumping":
			Hobbies = "2";
			break;

		case "Cliff Diving":
			Hobbies = "3";
			break;

		case "Skydiving":
			Hobbies = "4";
			break;

		default:
			Hobbies = "5";
			break;
		}

		Click(driver, EnterInsurantDataPageObject.setarHobbie(Hobbies));

		Thread.sleep(1300);

		Click(driver, EnterInsurantDataPageObject.nextenterproductdata);

	}

	@E("{string} {string} {string} {string} {string} {string} preencher os dados do formulario da aba enter Product Data e clicar em Next")
	public void preencher_os_dados_do_formulario_da_aba_enter_product_data_e_clicar_em_next(String DataInicio,
			String SomaSeguro, String Classificao, String Segurodanos, String Produtos, String Carro) throws InterruptedException {
		
		Input(driver, EnterProductDataPageObject.startdate, DataInicio);
		selectElementByValueMethod(this.driver, EnterProductDataPageObject.insurancesum, SomaSeguro);
		selectElementByValueMethod(this.driver, EnterProductDataPageObject.meritrating, Classificao);
		selectElementByValueMethod(this.driver, EnterProductDataPageObject.damageinsurance, Segurodanos);

		if (Produtos.equalsIgnoreCase("Euro Protection")) {
			Produtos = "1";
		}
		else if(Produtos.equalsIgnoreCase("Legal Defense Insurance")) {
			Produtos = "2";
		}
		
		Click(driver, EnterProductDataPageObject.setarProduto(Produtos));
		
		selectElementByValueMethod(this.driver, EnterProductDataPageObject.courtesycar, Carro);
		
		Thread.sleep(1300);

		Click(driver,EnterProductDataPageObject.nextselectpriceoption);
	}
		
		@E("selecionar {string} do formulario da aba Select Prince Option e clicar em Next")
		public void selecionar_do_formulario_da_aba_select_prince_option_e_clicar_em_next(String Opcao) throws InterruptedException {
		    
			Click(driver, SelectPriceOptionPageObject.selectsilver);
		    
		    Thread.sleep(1300);

			Click(driver,SelectPriceOptionPageObject.nextsendquote);
		}
		

		@E("preencher {string} {string} {string} {string}  dados do formulario da aba Send Quote")
		public void preencher_dados_do_formulario_da_aba_send_quote(String Email, String User, String Senha, String Confirmar) throws InterruptedException {
			
			Input(driver, SendQuotePageObjects.email, Email);
			Input(driver, SendQuotePageObjects.username, User);
			Input(driver, SendQuotePageObjects.password, Senha);
			Input(driver, SendQuotePageObjects.confirmpassword,Confirmar);
			 
		}
		
		@Quando("clico em Send")
		public void clico_em_send() throws InterruptedException {
			 Thread.sleep(1300);

			 Click(driver, SendQuotePageObjects.sendemail);
		}
		
		@Entao("O cadastro deve ser criado com sucesso e clicar em ok")
		public void o_cadastro_deve_ser_criado_com_sucesso_e_clicar_em_ok() throws InterruptedException {
			
			Thread.sleep(15000);
			
			Click(driver, SendQuotePageObjects.btnOK);
		}

}
