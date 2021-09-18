pipeline{
   agent any
   environment {
      NEW_VERSION = '1.3.0'
   }
   parameters{
      booleanParam(name: 'executeTest', defaultValue: false, description: '')
   }

   stages{

       stage("init"){
          steps {
             script {
                gv = load "script.groovy"
             }
          }

       }

       stage("build"){
          steps{
             script{
                 gv.buildApp()
             }
            
          }
       }

       stage("test"){
          when{
             expression {
                params.executeTest == true    
             }
          }
            steps{
               script{
                  gv.testApp()
               }
              
            }
       }

       stage("deploy"){
             steps{
                script{
                    gv.deployApp()
                }
               
             }
       }
   }
}
