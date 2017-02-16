def call(Closure body) {
    println 'before body'
    body()
    println 'after body'
}
