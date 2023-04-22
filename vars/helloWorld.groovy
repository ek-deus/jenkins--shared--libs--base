def call(Map config = [:]) {
    sh "echo Hello E.K. ${config.name}. Today is ${config.dayOfWeek}."
}
