pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'echo "build"'
        sh '''cd Calculator/
mvn clean install'''
      }
    }

    stage('Test') {
      steps {
        sh 'echo "testing"'
        sh '''cd Calculator/
mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dlicense.skip=true -Dsonar.login="1858584c627cda84cdad8309a89701e7cde7f809"'''
      }
    }

  }
}