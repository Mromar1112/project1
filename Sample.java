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
    
app.js
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
