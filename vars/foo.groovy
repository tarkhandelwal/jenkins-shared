def call(){
  pipeline{
    agent {label 'jenkins-slave'}
    stages{
      stage('Sample stage'){
        steps{
        echo "I'm creating a file"
        sh "touch test"
        }
      }
    }
  } 
}
