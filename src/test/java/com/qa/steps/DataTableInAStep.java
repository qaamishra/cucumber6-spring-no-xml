package com.qa.steps;

import com.qa.config.ComponentTwo;
import com.qa.main.MyComponentClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class DataTableInAStep {
    @Value("${variable.one}")
    private int variableOne;

    @Autowired
    MyComponentClass myComponentClass;

    @Autowired
    ComponentTwo componentTwo;


    @Given("^User is on base Page$")
    public void user_is_on_home_page() throws Throwable {
        System.out.println("user_is_on_home_page");
        int output=myComponentClass.multiplyHelper(variableOne);
        System.out.println("From auto wired component" +output);


    }

    @When("^User Navigate to home Page$")
    public void user_navigate_to_login_page() throws Throwable {
        int output=componentTwo.additionHelper(variableOne);
        System.out.println("From auto wired component two" +output);

        System.out.println("user_navigate_to_login_page");
    }

    @Then("^Message displayed Login Success$")
    public void message_displayed_login_successfully() throws Throwable {
        System.out.println("message_displayed_login_successfully");
    }

    @And("^User enters Credentials to LogIn$")
    public void user_enters_credentials_to_login(DataTable dataTable) throws Throwable {

        List<String> stringList=dataTable.asList();
         

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        stringList.forEach(val -> System.out.print(val + " "));

    }

}
