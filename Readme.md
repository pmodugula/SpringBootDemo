Goal

Build a Restful Service written in Java or Groovy with the following endpoints:

1. GET : http://<server_url>/math/add?n1=<numeric param 1>&n2=<numeric param 2>

This should add numbers 1 and 2 and provide the result in JSON


2. POST : http://<server_url>/math/add	(allow for form params 1&2 in a POST body)

This should add two numbers from a POST body


3. GET : http://<server_url>/time/now 

This should fetch time for MST at time of call from another service (https://www.developer.aero/WaitTime-API/Try-it-Now for YYC is a free one) and simplify the result to timezone and current time.  Return the result or the timestring in a rational JSON document.  

The service must be built using the following technologies:

1. Spring Boot
2. Gradlew (build)
3. Git (source control)

Please provide a Dockerfile using alpine linux:

4. Docker (optional - see below)

Please provide all code and answers in a public github (or equivalent) repo. Include a README.md file in the repo with any necessary documentation.
Additional Questions & Deliverables
The following is a set of questions and deliverables that should be completed and provided as part of the answer, respectively. If you cannot provide an answer please describe why. 

A. All code should be publicly accessible via github url (or similar public git repo).

B. The Rest Service should be deployed to a publicly accessible server on the internet (preferably AWS). Please provide reasons why AWS was not used. If the service is not deployed remotely please provide instructions on how to run it locally. The service should be runnable outside an IDE.

I don’t have account for AWS  , service was implemented in local tomcat server and instructions have been provided how to build , deploy and test local tomcat server . For AWS cloud service , provided steps how to deploy remotely.


C. A set of integration tests asserting server functionality (Postman test suites, Rest Assured tests or bash scripts preferred). 
Sprint Tool Suite framework unit test cases  have been implemented for unti testing this module .


D. Documentation detailing any service design, security choices regarding api keys or credentials or implementation preferences.
For Security , we can create and pass SSL key as parameter header on REST service, but this was  not implemented in the current demo.


E. A dockerfile providing packaging as a docker container. If omitted please provide reasoning why Docker was not used.
Don’t have experience on Docker file creation and  having exposure on deployment engine application which was wrote using JAVA for deployments in higher environments.


F. Explain how caching could be performed on the Restful service and pros/cons
Caching refers to storing the server response in the client itself, so that a client need not make a server request for the same resource again and again. A server response should have information about how caching is to be done, so that a client caches the response for a time-period or never caches the server response.
Using the cache-control headers we can do caching. Never keep expiry date too high. Dynamic content should be cached for a few hours only


G. All documentation and code should be provided within the README.md file in github


Tomcat Server Setup :
Step 1) Installation Tomcat and make sure that below environment variables have been set up in order to run Tomcat locally.

* CATALINA_HOME=   (address where your Apache Tomcat is)
C:\Program Files\Java\apache-tomcat-7.0.59\apache-tomcat-7.0.59 
* JAVA_HOME= (address where your JDK is)
C:\Program Files\Java\jdk1.8.0_25; 
* JRE_HOME= ; (address where your JRE is)
        C:\Program Files\Java\jre1.8.0_25 
* CLASSPATH=%JAVA_HOME%\bin;%JRE_HOME%;%CATALINA_HOME%\lib

Step 2) Testing Tomcat as it was installed and set up properly




2) Building WAR file manually:

Location of the WAR file crated as :  <GIT Project Worksapce Directory>\build\libs
3) Deploy the WAR file into TOMCAT server manually  , start the Tomcat server after copy the WAR file 
Location path : <<TOMCAT server install locatkion>>/webapps folder
4) Testing
Test the application GET service from IE Browser

Down load the SOAP UI project from GIT and Import into SOAP UI Project
<<GIT Source Code Location>>/ SpringDemoGradleProject /RESTTestProject-soapui-project.xml

2) Steps for AWS cloud Solution :
2.1) AWS Service  - Elastic Beanstalk
2.3) Create a new application 
2.3) Create an environment
	a) Webserver Environment , Tomcat Platform and upload WAR file 
2.4) Copy the URL service into application.properties , service.url
       a)  Save the project and create new WAR file with updated URL and deploy again into AWS
2.5)  Test using above URL( Update with new URL ) and test the same from SOAP UI as well.
       
 


