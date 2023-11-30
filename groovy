pipeline {
    agent any

    stages {
        stage('Get source code') {
            steps {
                git credentialsId: 'b8bde80c-9b61-4e86-8e53-3a5616d9c8bb', url: 'https://github.com/VigneshVellingiri/dummi.git'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
