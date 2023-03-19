pipeline {
    agent any

    tools {
        maven 'Maven 3.9.0'
    }

    // agent{
    //     docker{
    //         image "maven:3.9.0-jdk-17"
    //         label "docker"
    //     }
    // }
    
    environment
    {
        registry = "divyanshi2241/mini_project"
        registryCredential = "4e7af052-eef1-43a5-8beb-5264998fc9c6"
        dockerImage = ""
    }

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build and Test') {
            steps {
                sh 'mvn clean install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script{
                    dockerImage = docker.build(registry + ":latest")
                    // dockerimage = sh '/usr/local/bin/docker build -t'+registry+':latest .'
                }
            }
        }
        // stage('Build image') {
        //     dockerImage = docker.build("divyanshi2241/mini_project:latest")
        // }

        stage('Push Image to dockerHub') {
            steps {
                script{
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                    // sh '/usr/local/bin/docker login -u "gaparul" -p "Parul@191210"'
                    // sh '/usr/local/bin/docker push ' +registry +':latest'
                }    
            }
        }

        // stage('Push image') {
        //     withDockerRegistry([ credentialsId: "4e7af052-eef1-43a5-8beb-5264998fc9c6", url: "" ]) {
        //         dockerImage.push()
        //     }
        // }    
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}