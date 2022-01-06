// Generated by Selenium IDE
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium.Interactions;
using NUnit.Framework;


namespace HW1
{
public class MyTest : BasePage {
  
  HomePage home;

  public void SetUp() 
  {
    Initialize();
    home = new HomePage(driver);
  }
 
  [Test]
  public void search() {
   home.SearchProduct();
  }
  public void addbasket() {
   home.AddBasketProduct();
  }

   [TearDown]
  protected void Close() {
    TearDown();
  }
}
}