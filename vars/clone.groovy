def call(String url, String branch){
    echo 'cloning the repo'
    git url: url, branch: branch
}
