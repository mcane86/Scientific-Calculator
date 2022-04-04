pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                    sh 'cd Calculator && mvn clean package'

            }
        }
       stage('SonarQube analysis') {
//    def scannerHome = tool 'SonarScanner 4.0';
            steps{
                    withSonarQubeEnv('sonarqube-env') 
                { 
        // If you have configured more than one global server connection, you can specify its name
//      sh "${scannerHome}/bin/sonar-scanner"   
                        sh "cd Calculator && mvn sonar:sonar"
                }
            }
        }
        
    }

    post {
        always {
            junit testResults: '**/target/surefire-reports/TEST-*.xml'

            recordIssues enabledForFailure: true, tools: [mavenConsole(), java(), javaDoc()]
            recordIssues enabledForFailure: true, tool: checkStyle()
            recordIssues enabledForFailure: true, tool: spotBugs()
            recordIssues enabledForFailure: true, tool: cpd(pattern: '**/target/cpd.xml')
            recordIssues enabledForFailure: true, tool: pmdParser(pattern: '**/target/pmd.xml')
        }
    }

}