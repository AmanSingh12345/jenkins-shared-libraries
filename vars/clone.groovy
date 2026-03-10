def call(string url, string branch){
  git url: "${url}", "${branch}"
  echo 'cloning the repo'
}
