package com.example.MPI_Project.interface_tests;// Generated by Selenium IDE

import com.example.MPI_Project.testHelpers.TestDataFiller;
import com.example.MPI_Project.testHelpers.TestUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsultantInterfaceTest {
    private WebDriver driver;
    Wait<WebDriver> wait;
    TestDataFiller testDataFiller;

    @Before
    public void setUp() {
        driver = TestUtils.GetDriver();
        wait = new WebDriverWait(driver, 5, 1000);
        testDataFiller = new TestDataFiller();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void basicInterfaceTest() {
        driver.get("http://localhost:8080/main");
        driver.manage().window().setSize(new Dimension(1544, 829));
        driver.findElement(By.name("task_loginButton")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("consultant");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("consultant");
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.name("exitButton")).click();
        driver.findElement(By.name("task_conButton")).click();
        driver.findElement(By.cssSelector("tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1)")).getText(), is("Консультант"));
        driver.findElement(By.cssSelector("tr:nth-child(2) strong")).click();
        driver.findElement(By.cssSelector("tr:nth-child(2) p")).click();
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(2) strong")).getText(), is("Текущие заказы"));
        driver.findElement(By.cssSelector("th:nth-child(1)")).click();
        assertThat(driver.findElement(By.cssSelector("th:nth-child(1)")).getText(), is("ИД"));
        driver.findElement(By.cssSelector("th:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector("th:nth-child(2)")).getText(), is("Наименование"));
        driver.findElement(By.cssSelector("th:nth-child(3)")).click();
        assertThat(driver.findElement(By.cssSelector("th:nth-child(3)")).getText(), is("Заказчик"));
        {
            String value = driver.findElement(By.name("exitButton")).getAttribute("value");
            assertThat(value, is("Выход"));
        }
        driver.findElement(By.cssSelector("tr:nth-child(1) > .colOrder:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) span")).getText(), is("Отредактированный заказ"));
        driver.findElement(By.cssSelector("tr:nth-child(1) i")).click();
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) i")).getText(), is("Петров П.П."));
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) > .colOrder:nth-child(4) button")).getText(), is("Удалить"));
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) > .colOrder .colOrder")).getText(), is("Просмотр и редактирование"));
        driver.findElement(By.name("exitButton")).click();
        driver.findElement(By.name("task_logoutButton")).click();
        driver.findElement(By.name("exitButton")).click();
    }

    @Test
    public void createOrderInterfaceTest() {
        driver.get("http://localhost:8080/main");
        driver.manage().window().setSize(new Dimension(1526, 829));
        driver.findElement(By.name("task_loginButton")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("consultant");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("consultant");
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.name("exitButton")).click();
        driver.findElement(By.name("task_conButton")).click();
        driver.findElement(By.cssSelector("td:nth-child(2) > p")).click();
        assertThat(driver.findElement(By.cssSelector("td:nth-child(2) strong")).getText(), is("Новый заказ"));
        driver.findElement(By.cssSelector("tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector("td:nth-child(2) p:nth-child(2)")).getText(), is("Дата: Дедлайн:"));
        {
            WebElement element = driver.findElement(By.name("newOrder_name"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("newOrder_customer"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("newOrder_date"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("newOrder_deadline"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        assertThat(driver.findElement(By.cssSelector("td:nth-child(2) label:nth-child(2)")).getText(), is("Техническое"));
        assertFalse(driver.findElement(By.name("newOrder_quality")).isSelected());
        assertThat(driver.findElement(By.cssSelector("td:nth-child(2) label:nth-child(4)")).getText(), is("Обычное"));
        assertTrue(driver.findElement(By.cssSelector("td:nth-child(2) #orderQuality_mid")).isSelected());
        assertThat(driver.findElement(By.cssSelector("td:nth-child(2) label:nth-child(6)")).getText(), is("Высококачественное"));
        assertFalse(driver.findElement(By.cssSelector("td:nth-child(2) #orderQuality_top")).isSelected());
        {
            WebElement element = driver.findElement(By.name("newOrder_quantity"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("newOrder_notes"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            String value = driver.findElement(By.cssSelector("td:nth-child(2) p:nth-child(6) > input:nth-child(1)")).getAttribute("value");
            assertThat(value, is("ОК"));
        }
        {
            String value = driver.findElement(By.cssSelector("p:nth-child(6) > input:nth-child(2)")).getAttribute("value");
            assertThat(value, is("Отмена"));
        }
        driver.findElement(By.name("exitButton")).click();
        driver.findElement(By.name("task_logoutButton")).click();
        driver.findElement(By.name("exitButton")).click();
    }

    @Test
    public void editOrderInterfaceTest() {
        driver.get("http://localhost:8080/main");
        driver.manage().window().setSize(new Dimension(1543, 829));
        driver.findElement(By.name("task_loginButton")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("consultant");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("consultant");
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.name("exitButton")).click();
        driver.findElement(By.name("task_conButton")).click();
        driver.findElement(By.cssSelector("tr:nth-child(1) > .colOrder .colOrder")).click();
        driver.findElement(By.name("order_changeButton")).click();
        assertThat(driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(1) strong")).getText(), is("Редактировать заказ"));
        driver.findElement(By.name("order_name")).click();
        {
            String value = driver.findElement(By.name("order_name")).getAttribute("value");
            assertThat(value, is("Отредактированный заказ"));
        }
        driver.findElement(By.name("order_customer")).click();
        {
            String value = driver.findElement(By.name("order_customer")).getAttribute("value");
            assertThat(value, is("Петров П.П."));
        }
        driver.findElement(By.cssSelector("td:nth-child(1) p:nth-child(2)")).click();
        assertThat(driver.findElement(By.cssSelector("td:nth-child(1) p:nth-child(2)")).getText(), is("Дата: Дедлайн:"));
        driver.findElement(By.cssSelector("td:nth-child(1) > form:nth-child(2)")).click();
        {
            String value = driver.findElement(By.name("order_date")).getAttribute("value");
            assertThat(value, is("2021-11-02"));
        }
        {
            String value = driver.findElement(By.name("order_deadline")).getAttribute("value");
            assertThat(value, is("2021-11-23"));
        }
        {
            WebElement element = driver.findElement(By.name("order_name"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("order_customer"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("order_date"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("order_deadline"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        assertThat(driver.findElement(By.cssSelector("td:nth-child(1) label:nth-child(2)")).getText(), is("Техническое"));
        assertFalse(driver.findElement(By.id("orderQuality_low")).isSelected());
        assertThat(driver.findElement(By.cssSelector("td:nth-child(1) label:nth-child(4)")).getText(), is("Обычное"));
        assertTrue(driver.findElement(By.id("orderQuality_mid")).isSelected());
        assertThat(driver.findElement(By.cssSelector("td:nth-child(1) label:nth-child(6)")).getText(), is("Высококачественное"));
        assertFalse(driver.findElement(By.id("orderQuality_top")).isSelected());
        driver.findElement(By.name("order_quantity")).click();
        {
            String value = driver.findElement(By.name("order_quantity")).getAttribute("value");
            assertThat(value, is("100"));
        }
        driver.findElement(By.name("order_notes")).click();
        {
            String value = driver.findElement(By.name("order_notes")).getAttribute("value");
            assertThat(value, is("Отредактированное описание тестового заказа."));
        }
        {
            WebElement element = driver.findElement(By.name("order_quantity"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            WebElement element = driver.findElement(By.name("order_notes"));
            Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
            assertTrue(isEditable);
        }
        {
            String value = driver.findElement(By.cssSelector("td:nth-child(1) p:nth-child(6) > input")).getAttribute("value");
            assertThat(value, is("ОК"));
        }
        {
            String value = driver.findElement(By.cssSelector("form:nth-child(3) input")).getAttribute("value");
            assertThat(value, is("Отмена"));
        }
        driver.findElement(By.cssSelector("form:nth-child(3) input")).click();
        driver.findElement(By.name("exitButton")).click();
        driver.findElement(By.name("task_logoutButton")).click();
        driver.findElement(By.name("exitButton")).click();
    }

}
