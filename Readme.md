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

