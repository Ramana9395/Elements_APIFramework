pipeline {

    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Ramana9395/Elements_APIFramework.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Generate Reports') {
            steps {
                echo 'Cucumber Execution Completed'
            }
        }
    }

    post {

        always {
            echo 'Pipeline Execution Finished'
        }

        success {
            echo 'Build Successfully Completed'
        }

        failure {
            echo 'Build Failed'
        }
    }
}