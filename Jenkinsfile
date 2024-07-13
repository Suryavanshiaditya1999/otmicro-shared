@Library('shared-lib') _

pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    attendance.checkoutgit('https://github.com/OT-MICROSERVICES/attendance-api.git', 'main')
                }
            }
        }
        // stage('Run Coverage2') {
        //     steps {
        //         script {
        //             commongeneric.callCoverage2()
        //         }
        //     }
        // }
        
    }
}
