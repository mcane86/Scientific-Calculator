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
//    def scannerHome = tool 'SonarScanner 4.0';
            steps{
                    withSonarQubeEnv('sonarqube-env') 
                { 
        // If you have configured more than one global server connection, you can specify its name
//      sh "${scannerHome}/bin/sonar-scanner"  
                        sh 'cd Calculator'

                        sh "mvn sonar:sonar"
                }
            }
        }
    }

}