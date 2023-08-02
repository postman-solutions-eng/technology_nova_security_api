pipeline {
    agent {
        kubernetes {
            yaml '''
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: shell
    image: node
    command:
    - sleep
    args:
    - infinity
'''
            defaultContainer 'shell'
        }
    }
    environment {
        POSTMAN_ENVIRONMENT_ID = "16952209-c3caf3b3-188f-4a33-9bf8-99774ae6cd79"
        POSTMAN_COLLECTION_ID = "16952209-ad6052a8-3cae-481e-9b32-568a2497b5b7"
    }
    stages {
        stage('Install Postman CLI') {
            steps {
                //sh 'curl -o- "https://dl-cli.pstmn.io/install/linux64.sh" | sh'
                sh 'curl -o- "https://raw.githubusercontent.com/fyvekatz/portfolio/master/postman_cli_silent.sh" | sh'
            }
        }
        stage('Postman CLI Login') {
            steps {
                withCredentials([string(credentialsId: 'PM_CONTRACT_TESTS_VIA_GITHUB_API_KEY', variable: 'POSTMAN_API_KEY')]) {
                    sh 'postman login --with-api-key "${POSTMAN_API_KEY}"'
                }
            }
        }
        stage('Running collection') {
            steps {
                sh 'postman collection run -e ${POSTMAN_ENVIRONMENT_ID} ${POSTMAN_COLLECTION_ID} --integration-id "145246-${JOB_NAME}${BUILD_NUMBER}" --color off --disable-unicode | sed -E "s/\\033[.*m//g"'
            }
        }
    }
}
