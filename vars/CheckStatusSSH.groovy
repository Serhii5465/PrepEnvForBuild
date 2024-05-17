def call(String id){
    sshPublisher failOnError: true, 
    publishers: [sshPublisherDesc(configName: "${id}", sshRetry: [retries: 3, retryDelay: 1000], 
    transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: 'whoami; uname -r', execTimeout: 120000)], verbose: true)]

    if(currentBuild.result == 'SUCCESS'){
        echo "${id} online"
    }
}