$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddOrder.feature");
formatter.feature({
  "name": "OneOrder",
  "description": "    Make sure that adding a new order causes appropriate changes in UI",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add a new order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.step({
  "name": "I add a new order with parameters: \u003cname\u003e, \u003cproduct\u003e, \u003cquantity\u003e, \u003cstreet\u003e, \u003ccity\u003e, \u003czip\u003e, \u003ccardName\u003e, \u003ccardNumber\u003e, \u003ccardDate\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the new order \u0027\u003cname\u003e\u0027 in the list of orders",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "product",
        "quantity",
        "street",
        "city",
        "zip",
        "cardName",
        "cardNumber",
        "cardDate"
      ]
    },
    {
      "cells": [
        "\"John Black\"",
        "\"ScreenSaver\"",
        "4",
        "\"Light street\"",
        "\"Rain city\"",
        "123456",
        "\"Visa\"",
        "1324354657",
        "08/20"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add a new order",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.match({
  "location": "WebOrdersSteps.i_have_launched_the_Orders_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "WebOrdersSteps.i_have_logged_in_successfully_using_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new order with parameters: \"John Black\", \"ScreenSaver\", 4, \"Light street\", \"Rain city\", 123456, \"Visa\", 1324354657, 08/20",
  "keyword": "When "
});
formatter.match({
  "location": "WebOrdersSteps.i_add_a_new_order_for_customer_to_the_Orders_list(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the new order \u0027\"John Black\"\u0027 in the list of orders",
  "keyword": "Then "
});
formatter.match({
  "location": "WebOrdersSteps.i_should_see_the_new_order_for_upon_returning_to_the_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/DeleteAllOrders.feature");
formatter.feature({
  "name": "Delete all orders",
  "description": "    Make sure that Check All and Delete Selected buttons remove all orders",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Delete all orders",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.match({
  "location": "WebOrdersSteps.i_have_launched_the_Orders_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "WebOrdersSteps.i_have_logged_in_successfully_using_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Check All button",
  "keyword": "When "
});
formatter.match({
  "location": "WebOrdersSteps.i_click_check_all_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete Selected button",
  "keyword": "And "
});
formatter.match({
  "location": "WebOrdersSteps.i_click_delete_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"List of orders is empty\" label",
  "keyword": "Then "
});
formatter.match({
  "location": "WebOrdersSteps.i_should_see_label(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/DeleteOrder.feature");
formatter.feature({
  "name": "Delete order",
  "description": "    Make sure that Delete Selected button removes order",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Delete selected order",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have launched the Orders application",
  "keyword": "Given "
});
formatter.match({
  "location": "WebOrdersSteps.i_have_launched_the_Orders_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have logged in using the name \"Tester\" and password \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "WebOrdersSteps.i_have_logged_in_successfully_using_user_name_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Mark Smith\" order",
  "keyword": "When "
});
formatter.match({
  "location": "WebOrdersSteps.i_select_order(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Delete Selected button",
  "keyword": "And "
});
formatter.match({
  "location": "WebOrdersSteps.i_click_delete_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Mark Smith\" order should be removed from list",
  "keyword": "Then "
});
formatter.match({
  "location": "WebOrdersSteps.order_should_be_removed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});