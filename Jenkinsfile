pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/your-org/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                // e.g., bat 'npm install' or 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Tests...'
                // bat 'npm test' or 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Your deploy logic
            }
        }
    }
}
