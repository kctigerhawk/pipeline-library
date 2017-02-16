def call(Closure body) {
    echo 'before body'
    body()
    echo 'after body'
}
