def CheckGitCred(String credentials){
    if ("${credentials}".isEmpty()) {
        currentBuild.result = 'ABORTED'
        error("Enter GitHub credentials...")
    }
}