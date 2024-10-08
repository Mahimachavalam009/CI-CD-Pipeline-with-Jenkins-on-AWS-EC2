# CI-CD-Pipeline-with-Jenkins-on-AWS-EC2


### Files Overview

- **pom.xml**: Maven configuration file for managing dependencies and build configuration.
- **App.java**: The main Java application that includes a simple running application. This version will implement a basic command-line interface (CLI) that allows users to interact with the application

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher
- An AWS account
- Jenkins installed on an AWS EC2 instance (refer to [Setting Up Jenkins on AWS](https://www.jenkins.io/doc/book/installing/#installing-jenkins)).

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/MahimaChavalam09/CI-CD-Pipeline-with-Jenkins-on-AWS-EC2.git
cd your-CI-CD-Pipeline-with-Jenkins-on-AWS-EC2
``` 
### 2. Build the project
Make sure you have Maven installed on your local machine. To build the project, run:
```bash
mvn clean install
```

### 3. Running the Application
After building, you can run the application using the following command:
```bash
java -cp target/my-java-app-1.0-SNAPSHOT.jar com.example.App
```

CI/CD Setup with Jenkins
Setting Up Jenkins
1. Install Jenkins on your AWS EC2 instance.
2. Access Jenkins at http://your-ec2-public-dns:8080.
3. Create a new job:
Choose "Freestyle project."
Under "Source Code Management," select "Git" and enter your repository URL.
4. Configure Build Steps
Add a build step to "Execute shell" with the command :
mvn clean install
5. Set Up Build Triggers
Enable "GitHub hook trigger for GITScm polling" if you want builds triggered on code changes.

Running the Application 
After updating the App.java file, you can build and run the application again: 

1. Build the project:
``` bash
mvn clean install
```
2. Run the Application:
```bash
java -cp target/my-java-app-1.0-SNAPSHOT.jar com.example.App
```
Work in progress.
