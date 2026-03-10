def call(String imageName, String Tag, String repo){
  sh "docker build -t ${repo}/${imageName}:${Tag} ."
}
