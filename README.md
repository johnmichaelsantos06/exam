# How to install
* Open a terminal (Linux based systems) or command prompt (Windows based systems)
* Run ``mvn clean install`` in the root folder of the project
* Run ``java -jar target/exam-0.0.1-SNAPSHOT.jar``
* Navigate to ``http://localhost:8000/gui`` to test GraphQL queries
> **_NOTE:_** http://localhost:8000/graphql is the url for the GraphQL API

# Improvements to be done
* Implement a container based deployment such as Docker

# Current issues
* GraphQL SPQR is tested to work on Spring Boot 2.6.8 and Java version 1.8 so guarantee of the code working when upgrading or downgrading the aforementioned technology is not yet tested
