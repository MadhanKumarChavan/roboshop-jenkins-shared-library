def call() {

    pipeline {

        agent {
            label 'workstation'
        }

        stages {
            stage('Build/compile') {
                steps {
                    script {
                        common.compile()
                    }
                }
            }
            stage('unit Test') {
                steps {
                    script {
                        common.unittest()
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


}