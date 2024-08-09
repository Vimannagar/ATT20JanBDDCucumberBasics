pipeline {
    agent any

    stages {
        stage('Building the image') {
            steps {
                
                bat "docker build -t=cucumbertestcaseimage ."
                 }
        }

                stage('Making infra up for execution') {
                    steps {
                         bat "docker-compose up -d hub chrome firefox"               
                    }
                }

stage('Running testcases'){

    parallel{
 stage('Running on Chrome browser') {


    steps{

        bat "docker-compose up cucumber-tests-chrome"
    }
    
    post
        {
        always { 
            emailext attachLog: true, attachmentsPattern: 'chrometestsreports/amazontestreport/reports.html', body: '''<h1>This is customized email report</h1>
<p>Hi Team,<br>
Here are the details for the execution of project:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks  & Regards<br>
ATT 20 Jan Batch</p>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email for Chrome Browser', to: 'attevening@gmail.com'
        }
        }
    }
stage('Running testcases on firefox'){

    steps{

        bat "docker-compose up cucumber-tests-firefox"
    }
    
    post
        {
        always { 
            emailext attachLog: true, attachmentsPattern: 'firefoxtestsreports/amazontestreport/reports.html', body: '''<h1>This is customized email report</h1>
<p>Hi Team,<br>
Here are the details for the execution of project:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks  & Regards<br>
ATT 20 Jan Batch</p>
''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email for Firefox Browser', to: 'attevening@gmail.com'
        }
        }
}
}
}







        }
    }
