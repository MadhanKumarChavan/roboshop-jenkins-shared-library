//def call() {
//
//    pipeline {
//        agent {
//            label 'workstation'
//        }
//
//        stages {
//            stage('Build/compile') {
//                steps {
//                    echo 'compile'
//                }
//            }
//            stage('unit Test') {
//                steps {
//                    echo 'unit tests'
//                }
//            }
//            stage('quality control') {
//                steps {
//                    echo 'quality control'
//                }
//            }
//            stage('upload in centralized place') {
//                steps {
//                    echo 'upload'
//                }
//            }
//        }
//    }
//
//}
//


def call() {

    pipeline {
        agent {
            label 'workstation'
        }

        stages {
            stage('Build/compile') {
                steps {
                    script{
                        def abc ="hello"
                        def xyz ="10"
                        print "abc= $(abc)"
                        print "xyz = $(xyz)"
                    }
                }
            }
        }

    }
}