package PageObjetcs;	

import org.openqa.selenium.By;

public class EnterProductDataPageObject {
	
	public static final By startdate = By.id("startdate");
	public static final By insurancesum = By.id("insurancesum");
	//public static final By insurancesum = By.xpath("//*[@id=\"insurancesum\"]");
	public static final By meritrating = By.id("meritrating");
	public static final By damageinsurance = By.id("damageinsurance");
	public static final By EuroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	
	public static final By setarProduto(String posicao) {
        return By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label["+posicao+"]/span");
    }
	
	public static final By courtesycar = By.id("courtesycar");
	
	public static final By nextselectpriceoption= By.id("nextselectpriceoption");
	
}
