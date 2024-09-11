Objective:
I have Automated the Germany is calling web application using Selenium with Java.
Here I used the Maven framework.
For this we need to install Maven in our Eclipse from Eclilpse market place.
Create a Maven project and dependencies in pom.xml
Dependencies are 
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.15.0</version>
</dependency>
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.5</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.5</version>
</dependency>

Here we have 3 folders, they are 
1.	src/main/java
BasePack:
i.BaseClass: This is TestNG class. Here I take Before method and After method for the purpose of opening the browser and close the browser
2.	src/test/java
    ExecutingPack:
i.	Executing class: This is TestNG class. Here I take Test method for the purpose of Running all test cases. This class is extended by Base class.
ii.	Reused class: This is normal java class, here I created methods which we reused to write script. This is extended by Executing class
iii.	Scripting Class: This is normal class, Here I wrote Scripting with mentioning test cases. This is extended by Reused class, Here I call the reused methods for Xpaths and wait conditions. This class is implemented in Executing class by creating object reference.
3.	src/data/java
i.	Flat file: Here I mentioned all Xpaths and URLs . This file access in the scripting class using file input stream class
