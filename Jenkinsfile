node{
stage ('SCM Checkout'){
git 'https://github.com/harjeetc/QAFrameworkApril21-'
}
stage('Compile-Package'){
  // get maven home path 
 def mvnHome = tool name: 'C:\\Users\\hchatha\\Downloads\\apache-maven-3.6.3-bin(1)\\apache-maven-3.6.3', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
sh 'mvn package'
}
}