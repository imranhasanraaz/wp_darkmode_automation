# Introduction
-Main aim of this project is automated test cases of wordpress plugin. 

# Install
**Java**  
https://www.oracle.com/java/technologies/downloads/

**Maven**

 https://maven.apache.org/download.cgi
 
 Click =>Binaries    
 =>**apache-maven-3.9.4-bin.zip**

**Install WordPress Locally**

[See Here](https://www.hostinger.com/tutorials/wordpress-localhost)

![image](https://github.com/imranhasanraaz/wp_darkmode_automation/assets/110620143/6f8313c6-7ba5-4c5f-8a44-3402149f466d)

![image](https://github.com/imranhasanraaz/wp_darkmode_automation/assets/110620143/0e884a99-9765-4bf1-9866-41a6f46748f7)


# To Run This Project
**Prerequisites**
- Java 8 and above are supported.
- Maven 3 and above are supported.
- Install above programs (Java, Maven, Wordpress local server)

  **Running Procedures**
  - Clone this repository.
  - Install all the dependencies from POM file
  - Create a .env file src/main/resources/.env in this Location. this .env file will hold your wordpress username and password.
  - Config src/main/resources/config.json this file according to your wordpress Local server adress
  - Build this project as a maven project.
  - Run src/test/java/tests/TestOfWPDarkMode.java this file.
    
![image](https://github.com/imranhasanraaz/wp_darkmode_automation/assets/110620143/1e43b60e-0ce2-4dd7-a543-b628b1ebbca1)

    
