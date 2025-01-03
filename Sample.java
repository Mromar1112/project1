[1]
public class Sample {
    public static void main(String[] args) {
    
        double num1 = 5.0; 
        double num2 = 10.0;
        double result = num1 * num2;
        System.out.println("The result of multiplication is: " + result);}}

..........................................................................................................


java pipeline
    
pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Mromar1112/project1.git'
            }
        }
        stage('Build') {
            steps {
                
                bat 'javac Sample.java'
            }
        }
        stage('Test') {
            steps {
               
                bat 'java Sample'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
              
            }
        }
    }
}

..................................................................................................................

[2]
app.js using java prgm
    
const express = require('express');

const app = express();

app.get('/', (req, res) => {
  res.send('Hello, world! I am from Node.js'); 
});

app.listen(3020, () => {
  console.log('Server is running on Port 3020');
});

............................................................................................................

nodejs pipeline
    
    pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/deepak574/nodejsexample.git'
            }
        }

        stage('Install Dependencies') {
            steps {
                bat 'npm install'
            }
        }

        stage('Run Application') {
            steps {
                bat 'node app.js'
            }
        }
    }
}

....................................................................................................................

[3]
    
touch Dockerfile java prgm

    # Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . .

# Compile the Java program
RUN javac Sample.java

# Command to run the program
CMD ["java", "Sample"]
..
docker build -t dockernodejs ""
............................................................................................

[4]
    
app.js for docker nodejs
    
const express = require('express');
const app = express();
app.get('/', (req, res) => {
  res.send('Hello, world! I am from Node.js'); 
});
app.listen(3111, () => {
  console.log('Server is running on Port 3111');
});

................................................................................

touch dockerfile using nodejs

  
FROM node:14
# Set the working directory inside the container
WORKDIR /usr/src/app
# Copy package.json and package-lock.json (if available)
COPY package.json ./
COPY package-lock.json ./
# Install dependencies
RUN npm install
# Copy the rest of your application code
COPY . .
# Expose the port the app runs on
EXPOSE 3111
# Command to run the application
CMD ["node", "app.js"]

.......................................
    
docker build -t dockernodejs ""
docker run -d -p 3111:3111 dockernodejs
    
