pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        git(url: 'git@github.com:XiDian-ChenMiao/springboot-docker.git', branch: 'master', changelog: true, credentialsId: 'bf2ee83f796571fd0f614198da24ca4c3281f651')
        echo '[+]git checkout successfully'
        pwd(tmp: true)
      }
    }
  }
}