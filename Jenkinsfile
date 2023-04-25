
pipeline {
    agent any
    parameters {
        string(name: 'Укажите номер ЗНИ/РЕЛИЗ', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')

        text(name: 'Впишите исполнителя', defaultValue: '', description: 'Enter some information about the person')

        booleanParam(name: 'Впишите исполнителя', defaultValue: true, description: 'Toggle this value')

        choice(name: 'CHOICE', choices: [
                                            'One', 
                                            'Two', 
                                            'Three'], description: 'Pick something')
        choice(name: 'Тип ЗНИ/Релиза', choices: [
                                            'Minor', 
                                            'Release', 
                                            'Extreem'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')choice(name: 'NameSpace', choices: [

        choice(name: 'Тип ЗНИ/Релиза', choices: [
                                             'One', 
                                             'Two', 
                                             'Three'], description: 'Pick something')

        password(name: 'PASSWORD', defaultValue: 'SECRET', description: 'Enter a password')

    }
    stages {
        stage('Example') {
            steps {
                echo "Hello ${params.PERSON}"

                echo "Biography: ${params.BIOGRAPHY}"

                echo "Toggle: ${params.TOGGLE}"

                echo "Choice: ${params.CHOICE}"

                echo "Password: ${params.PASSWORD}"
            }
        }
    }
}
