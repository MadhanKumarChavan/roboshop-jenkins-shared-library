def call() {

    pipeline {

        agent {
            label 'workstation'
        }

        stages {
            stage('Build/compile') {
                steps {
                   script{
                       common.compile()
                   }
                }
            }
            stage('unit Test') {
                steps {
                    echo 'unit tests'
                }
            }
            stage('quality control') {
                steps {
                    echo 'quality control'
                }
            }
            stage('upload in centralized place') {
                steps {
                    echo 'upload'
                }
            }
        }
    }

}


