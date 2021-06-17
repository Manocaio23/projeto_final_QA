package PageObjetcs;

import org.openqa.selenium.By;

public class EnterInsurantDataPageObject {
		
	public static final By firstname = By.id("firstname");
	public static final By lastname = By.id("lastname");
	public static final By birthdate = By.id("birthdate");
	
	public static final By setarGenero(String genero) {
        return By.xpath("(//*[@class='ideal-radio'])["+ genero + "]");
    }
	
	public static final By country = By.id("country");
	public static final By zipcode = By.id("zipcode");
	public static final By occupation = By.id("occupation");
	
	public static final By Hobbies =(By.xpath("//*[@id=\'insurance-form\']/div/section[2]/div[10]/p/label[1]/span"));
	
	public static final By setarHobbie(String posicao) {
        return By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label["+ posicao +"]/span");
    }

	
	public static final By nextenterproductdata = By.id("nextenterproductdata");
	
	

	
	
}
