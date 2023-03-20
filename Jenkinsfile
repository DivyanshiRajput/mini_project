pipeline {
    tools {
        maven 'Maven 3.9.0'
    }
    
    agent any

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
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script{
                    dockerImage = docker.build(registry + ":latest")
                }
            }
        }

        stage('Push Image to dockerHub') {
            steps {
                script{
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }    
            }
        }

        stage('Cleaning Up') {
            steps {
                sh "docker rmi $registry:latest" 
            }
        }    

        stage('Deploy') {
            steps {
                // sh 'ansible-playbook playbook.yml'
                ansiblePlaybook colorized: true,
                installation: 'Ansible',
                inventory: 'inventory',
                playbook: 'playbook.yml'
            }
        }
    }
}