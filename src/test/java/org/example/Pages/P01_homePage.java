package org.example.Pages;

import org.example.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;

public class P01_homePage {

  public WebElement  changeLanToEnglish(){
      return Hooks.driver.findElement(By.id("translation-btn"));
  }

  public WebElement getArrow(){
      return Hooks.driver.findElement(By.id("arrow"));
  }
  public WebElement getCountry(String countryid){
      return Hooks.driver.findElement(By.id(countryid));
  }

  public String getPrice(String name){
      return Hooks.driver.findElement(By.xpath("//div[@id='currency-"+name.toLowerCase(Locale.ROOT)+"']//b")).getText();

  }

  public String getPackageName(String name)
  {

      return  Hooks.driver.findElement(By.xpath("//strong[@id='name-"+name.toLowerCase(Locale.ROOT)+"']")).getText();

  }
  public String getCurrency(String name ){


              String TextCurr=Hooks.driver.findElement(By.xpath("//div[@id='currency-"+name.toLowerCase(Locale.ROOT)+"']/i")).getText();
              String[] spliTxt=TextCurr.split("/");
              System.out.println(spliTxt[0]);
              return spliTxt[0];
  }
}
