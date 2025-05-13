def call(String url, String branch){
  echo "This stage 1 - Cloning the code"
  git url: "${url}", branch: "{branch}
  echo "Code Cloning is Successful"
}
