## Problem Statement: Implementing CRUD operations on NoSQL Column store database in AWS Keyspaces for Apache Cassandra

In this assignment, base code for the HotelApplication has been provided. You need to setup AWS Keyspaces
 on cloud and complete the functionality for performing CRUD operations on the database in the given HotelApplication.
This assignment uses the Datastax java driver to access AWS keyspaces database. Manual of Datastax driver can be found
 [here](https://docs.datastax.com/en/developer/java-driver/4.6/manual/) 

### The following tasks needs to be completed as part of this assignment. 
 
  - Provide access to Amazon Keyspaces resources by setting up Identity and Access Management using AWS console. Refer [here](https://docs.aws.amazon.com/keyspaces/latest/devguide/accessing.html) for instructions
  - Generate Service-Specific Credentials using the AWS Management Console to access Amazon Keyspaces (for Apache Cassandra) programmatically. Download the username and password generated. Refer [here](https://docs.aws.amazon.com/keyspaces/latest/devguide/programmatic.credentials.html) for instructions
     Note: we will not be using Authentication plugin in this assignment_
  - Get service endpoint for Amazon Keyspaces for your region [here](https://docs.aws.amazon.com/keyspaces/latest/devguide/programmatic.endpoints.html). 
  - To enable secure connection to AWS keyspaces with TLS, download Amazon digital certificate and convert it to a trustStore file using following commands. Copy the jks file created in the resources folder

        curl https://www.amazontrust.com/repository/AmazonRootCA1.pem -O
        
        openssl x509 -outform der -in AmazonRootCA1.pem -out temp_file.der
        keytool -import -alias cassandra -keystore cassandra_truststore.jks -file temp_file.der

  - Configure the values in the application.properties provided using the information gathered from above steps       
  - Implement the functionality based on the comments provided in base code. 
    We will be using DataStax Java Driver 4.6 for connecting to AWS Keyspaces. 
    Refer the links provided in the Reference section for manuals
  - Respective classes/files contain the **TODO** comments for the code/task to be completed
  - Ensure that all Test cases provided are successful for assignment completion

## Reference 
   - [Datastax Mapper api for Mapping Entities with POJO and creating Dao interfaces](https://docs.datastax.com/en/developer/java-driver/4.6/manual/mapper/) 
   - [Datastax Schema builder api for creating keyspace and table](https://docs.datastax.com/en/developer/java-driver/4.6/manual/query_builder/schema/)
   - [Datastax core driver api](https://docs.datastax.com/en/developer/java-driver/4.6/manual/core/)
   
## Instructions
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Ensure your code compiles without any errors/warning/deprecations 
- Check for code smells using SonarLint plugin from STS/IntelliJ IDE
- Follow best practices while coding
