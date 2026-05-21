pipeline {

    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'master',
                url: 'https://github.com/Ramana9395/Elements_APIFramework.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean test'
            }
        }

    }

    post {

        always {
            echo 'Execution Completed'
        }

        success {
            echo 'Build Success'
        }

        failure {
            echo 'Build Failed'
        }
    }
}