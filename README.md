## Wordpress Plugin Test Automation

# Content
- [Introduction](https://github.com/imranhasanraaz/wp_darkmode_automation/blob/main/README.md#introduction)
- [Technologies used in this project](https://github.com/imranhasanraaz/wp_darkmode_automation/blob/main/README.md#technologies-used-in-this-project)
- [Install](https://github.com/imranhasanraaz/wp_darkmode_automation/blob/main/README.md#install)
- [Install wordpress Locally](https://github.com/imranhasanraaz/wp_darkmode_automation/blob/main/README.md#install-wordpress-locally)
- [To Run This Project](https://github.com/imranhasanraaz/wp_darkmode_automation/blob/main/README.md#to-run-this-project)

# Introduction
-Main aim of this project is automated test cases of wordpress plugin. 

# Technologies used in this project
- [Aquality Selenium 4.0.0](https://github.com/aquality-automation/aquality-selenium-java)
- [TestNG 7.8.1](https://mvnrepository.com/artifact/org.testng/testng)
- Wordpress 6.3.1 

# Install
**Java**  
https://www.oracle.com/java/technologies/downloads/

**Maven**

 https://maven.apache.org/download.cgi
 
 Click =>Binaries    
 =>**apache-maven-3.9.4-bin.zip**

# Install WordPress Locally

[See Here How to install wordpress Locally](https://www.hostinger.com/tutorials/wordpress-localhost)

![image](https://github.com/imranhasanraaz/wp_darkmode_automation/assets/110620143/6f8313c6-7ba5-4c5f-8a44-3402149f466d)

![image](https://github.com/imranhasanraaz/wp_darkmode_automation/assets/110620143/0e884a99-9765-4bf1-9866-41a6f46748f7)


# To Run This Project
**Prerequisites**
- Java 8 and above are supported.
- Maven 3 and above are supported.
- Install above programs (Java, Maven, Wordpress local server)
- Make sure you have a folder name wordpress in your htdocs folder.
- If everything goes well then goto this link from your browser **http://localhost/wordpress/wp-login.php**
- If the above link working then goto **Running Procederues**

  **Running Procedures**
  - Clone this repository.
  - Install all the dependencies from POM file
  - Create a .env file src/main/resources/.env in this Location. this .env file will hold your wordpress username and password.
  - Config src/main/resources/config.json this file according to your wordpress Local server adress
  - Build this project as a maven project.
  - Run src/test/java/tests/TestOfWPDarkMode.java this file.
  - You can see logs in the terminal.
    
![image](https://github.com/imranhasanraaz/wp_darkmode_automation/assets/110620143/1e43b60e-0ce2-4dd7-a543-b628b1ebbca1)
![image](https://github.com/imranhasanraaz/wp_darkmode_automation/assets/110620143/861eac0d-5029-4e69-ac34-b8d093e9c1f5)


    
