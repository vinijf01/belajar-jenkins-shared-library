def call(){
	pipeline {
	agent any
	stages {
		stage("Maven Clean") {
			steps {
				script {
					maven(["clean"])
				}
			}
		}
		stage("Maven Compile") {
			steps {
				script {
					maven(["compile"])
				}
			}
		}
	}
}
}