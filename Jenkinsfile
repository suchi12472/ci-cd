pipeline{
    agent any
    stages{
        stage('cloning..'){
            steps{
                git branch: 'main',
                url: 'https://github.com/suchi12472/ci-cd.git'
            }
        }
        stage('Building'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Image-conversion'){
            steps{
                sh 'docker build -t employee-app .'
            }
        }
        stage('container-creation'){
            steps{
                sh '''
                    docker stop employee-con || true
                    docker rm employee-con || true
                    docker run -d -p 80:80 --name employee-con employee-app
                '''
            }
        }
    }
}
