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
                sh 'docker build -t Employee-app .'
            }
        }
    }
}