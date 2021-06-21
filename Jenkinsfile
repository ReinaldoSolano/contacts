pipeline {
    agent any

    stages {
        stage('Checkout Source') {
            steps {
                git url:'https://github.com/ReinaldoSolano/contacts.git', branch:'master'
            }
        }

        stage('Build Image') {
            steps {
                script {
                    dockerapp = docker.build("rssystem/contacts:${env.BUILD_ID}", '-f ./Dockerfile .')
                }
            }
        }
        
        stage('Push Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub'){
                    dockerapp.push('latest')
                    dockerapp.push("${env.BUILD_ID}")
                    }
                }
            }
        }

        stage('Deploy k8s') {
            agent {
                kubernetes {
                    cloud 'kubernetes'
                }
            }
            environment{
                tag_version = "${env.BUILD_ID}"
            }
            steps {
                sh 'sed -i "s/{{tag_version}}/$tag_version/g" ./k8s/api/deployment.yaml'
            	sh 'cat ./k8s/api/deployment.yaml'
                kubernetesDeploy(configs: '**/k8s/**', kubeconfigId: 'kubeconfig')
            }
        }

        
    }
}
