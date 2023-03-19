pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                echo 'Building and Testing'
                sh 'mvn package'
                echo 'Done!'
            }
        }
        
        // stage('Test') {
        //     steps {
        //         echo 'Testing..'
        //     }
        // }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}