$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/BusBooking5.feature");
formatter.feature({
  "name": "BusBooking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Book a bus in RedBus application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters the value in from place \"\u003cFromPlace\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the value in to place \"\u003cToPlace\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects a data  in the Date DropDown",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the bus displayed in the UI",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FromPlace",
        "ToPlace"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Vijayawada"
      ]
    }
  ]
});
formatter.background({
  "name": "Application Launch",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and appilication \"https://www.redbus.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.BusBooking5.launch_the_browser_and_appilication(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book a bus in RedBus application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters the value in from place \"Chennai\"",
  "keyword": "When "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.BusBooking5.user_enters_the_value_in_from_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in to place \"Vijayawada\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.BusBooking5.user_enters_the_value_in_to_place(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a data  in the Date DropDown",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.BusBooking5.user_selects_a_data_in_the_Date_DropDown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.BusBooking5.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the bus displayed in the UI",
  "keyword": "Then "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.BusBooking5.validate_the_bus_displayed_in_the_UI()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/TrainBooking5.feature");
formatter.feature({
  "name": "TrainBooking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Book a train in RedBus application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on rail",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the value in from place1 \"\u003cFromPlace\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters the value in to place1 \"\u003cToPlace\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects a data  in the Date DropDown1",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on search button1",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the bus displayed in the UI1",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FromPlace",
        "ToPlace"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Visakhapatnam"
      ]
    }
  ]
});
formatter.background({
  "name": "Application Launch",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the browser and appilication1 \"https://www.redbus.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.TrainBooking5.launch_the_browser_and_appilication1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book a train in RedBus application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User clicks on rail",
  "keyword": "When "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.TrainBooking5.user_clicks_on_rail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in from place1 \"Chennai\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.TrainBooking5.user_enters_the_value_in_from_place1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the value in to place1 \"Visakhapatnam\"",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.TrainBooking5.user_enters_the_value_in_to_place1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects a data  in the Date DropDown1",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.TrainBooking5.user_selects_a_data_in_the_Date_DropDown1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search button1",
  "keyword": "And "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.TrainBooking5.user_clicks_on_search_button1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the bus displayed in the UI1",
  "keyword": "Then "
});
formatter.match({
  "location": "in.redBus5.StepDefinition.TrainBooking5.validate_the_bus_displayed_in_the_UI1()"
});
formatter.result({
  "status": "passed"
});
});