pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
        sh 'cd Calculator'
        sh 'mvn clean package'
      }
    }

    stage('SonarQube analysis') {
      steps {
        withSonarQubeEnv('sonarqube-env') {
          sh 'cd Calculator'
          sh 'mvn sonar:sonar'
        }

      }
    }

  }
}