# UIexample
This automation framework is designed to test the search functionality on the Amazon website. I utilized the Selenium Cucumber BDD JUnit framework, which incorporates the Page Object, Singleton Design, and Page Factory design patterns, along with Configuration Properties. The framework is intended to be user-friendly and easily maintainable.
<h3>This project requires the following dependencies:</h3>
<ul><li>Java 8</li>
<li>Maven</li>
<li>Selenium WebDriver</li>
<li>Cucumber</li>
<li>JUnit</li></ul>

<h3><i>This project uses the following design patterns:</i></h3>
<b>Page Object Pattern:</b> This pattern decouples the code that interacts with the web browser from the code that defines the steps in the cucumber feature files.<br>
<b>Singleton Design Pattern:</b> This pattern ensures that there is only one instance of a class in memory at a time. This is useful for objects that need to be shared across multiple tests.<br>
<b>Page Factory:</b> This pattern makes it easier to find and interact with web elements on a web page.

<h3>This project has a configuration file called Configuration.properties.</h3> 
This file contains the following properties:<br>
browser: The browser to use for testing.<br>
url: The URL of the web application to test.<br>
You can customize these properties to fit your needs. For example, if you want to test after logging in to the web application, you can add the username and password properties and store there information.

