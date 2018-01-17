pipeline {
	agent any

	stages {
		stage ('Compile Stage') {
		steps {
		withMave(maven : 'maven_3_5_0'){
		sh 'mvn clean compile'
}
}
}
		stage ('Testing Stage') {
		steps {
		withMave(maven : 'maven_3_5_0'){
		sh 'mvn test'
}
}
}
stage ('Deployment Stage') {
		steps {
		withMave(maven : 'maven_3_5_0'){
		sh 'mvn deploy'
}
}
}
}
}
