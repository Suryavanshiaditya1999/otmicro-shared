@Library('shared-lib') _

pipeline {
    agent any
    
    stages {
        stage('Run CoveragePython') {
            steps {
                script {
                    attendance.callCoveragePython()
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
