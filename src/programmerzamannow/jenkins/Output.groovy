package programmerzamannow.jenkins;


class Output {
	static def hello(steps, String name) {
	/*	println("Hello ${name}") */
	steps.echo("Hello ${name}")
	}
}