@Library('shared-lib') _

pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    attendance.checkoutgit()
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
