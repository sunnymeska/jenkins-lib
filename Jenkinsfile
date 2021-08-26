@Library('jenkins-lib')
import com.cgi.notifications.notification_test
import com.cgi.notifications.notification

pipeline {
    agent any
    stages{
        stage('var'){
            steps{
                welcome('sunny')
            }
        }
            stage('src'){
            steps{
                script{
                    bat "echo Hellow"
                    def notify = new notification_test("i am in jenkins" , "src dir")
		            notify.printall() 
                }
                
            }
        }
        stage('grab'){
            steps{
                script{
                    bat "echo Hellow2"
                    def noti = new notification()
		            noti.printAll() 
                }
                
            }
        }
    }
}
