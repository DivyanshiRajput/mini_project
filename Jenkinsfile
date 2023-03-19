pipeline {
    tools {
        maven 'Maven 3.9.0'
    }

    agent any

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }

        // stage('Build and Test') {
        //     steps {
        //         echo 'Building and Testing'
        //         sh 'mvn package'
        //         echo 'Done!'
        //     }
        // }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}