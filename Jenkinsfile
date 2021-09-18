pipeline{
   agent any
   environment {
      NEW_VERSION = '1.3.0'
   }
   parameters{
      booleanParam(name: 'executeTest', defaultValue: false, description: '')
   }

   stages{
       stage("build"){
          steps{
             echo 'building the application...'
             echo "bulding version ${NEW_VERSION}"
          }
       }

       stage("test"){
          when{
             expression {
                params.executeTest == true
                echo "skipping test phase as execute test is: ${params.executeTest}"
             }
          }
            steps{
               echo 'testing the application...'
            }
       }

       stage("deploy"){
             steps{
                echo 'deploying the application...'
             }
       }
   }
}
