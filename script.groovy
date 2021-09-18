def buildApp() {
     echo 'building the application...'
     echo "bulding version ${NEW_VERSION}"
}

def testApp() {
    echo 'testing the application...'
    echo "skipping test phase as execute test is: ${params.executeTest}"
}

def deployApp() {
     echo 'deploying the application...'
}

return this