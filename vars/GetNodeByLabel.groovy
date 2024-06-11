def call(String label){
    online_nodes = nodesByLabel label: "${label}", offline: true
    return online_nodes 
}