public class Sample {
    public static void main(String[] args) {
        // Predefined numbers
        double num1 = 5.0; // You can change these values as needed
        double num2 = 10.0;

        // Perform multiplication
        double result = num1 * num2;

        // Display the result
        System.out.println("The result of multiplication is: " + result);}}
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
                // Add your deployment commands here (like copying files to a server)
            }
        }
    }
}
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
