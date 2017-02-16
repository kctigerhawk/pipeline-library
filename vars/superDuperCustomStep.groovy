def call(Closure body) {
    echo 'before body'
    input(message: 'do body')
    body()
    echo 'after body'
}
