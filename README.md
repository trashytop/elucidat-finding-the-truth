# Elucidat - Finding The Truth

## Intro
This project contains automated acceptance tests for bugs found whilst testing
https://learning.elucidat.com/course/5c9126fd760e5-611a53751213a

The project is based on https://github.com/serenity-bdd/serenity-cucumber-starter

## Prerequisites

* Chrome (or a different browser supported by WebDriver)
* Git (to clone this repo)
* Maven (only required if you use command line tools)
* Oracle Java 17 JDK (other versions will probably work too!)
* IntelliJ Community Edition (not necessary if you only want to run the tests)
  * Cucumber for Java plugin
  * Gherkin plugin

## Serenity BDD

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

## The project directory structure
The project has a Maven build script and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
     + search                  Feature file subdirectories 
             search_by_keyword.feature
```
## Screenplay 

The Screenplay DSL is rich and flexible, and well suited to teams working on large test automation projects with many team members, and who are reasonably comfortable with Java and design patterns. 

## Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run `mvn verify` from the command line.

The test results will be recorded in the `target/site/serenity` directory.

## Want to learn more?
For more information about Serenity BDD, you can read the [**Serenity BDD Book**](https://serenity-bdd.github.io/theserenitybook/latest/index.html), the official online Serenity documentation source. Other sources include:
* **[Learn Serenity BDD Online](https://expansion.serenity-dojo.com/)** with online courses from the Serenity Dojo Training Library
* **[Byte-sized Serenity BDD](https://www.youtube.com/channel/UCav6-dPEUiLbnu-rgpy7_bw/featured)** - tips and tricks about Serenity BDD
* For regular posts on agile test automation best practices, join the **[Agile Test Automation Secrets](https://www.linkedin.com/groups/8961597/)** groups on [LinkedIn](https://www.linkedin.com/groups/8961597/) and [Facebook](https://www.facebook.com/groups/agiletestautomation/)
* [**Serenity BDD Blog**](https://johnfergusonsmart.com/category/serenity-bdd/) - regular articles about Serenity BDD
