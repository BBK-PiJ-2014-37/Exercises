int numberToGuess = Math.abs (1000 * Math.random())
int c = 0
while (true) {
        println "Guess which number I chose: "
        String s= System.console().readLine()
        int i = Integer.parseInt (s)
        c++
        if (i == numberToGuess) {
                break
        }   
        else if (i > numberToGuess) {
                println "Nah, that's too high."
        } else {
                println "Ooops, too low!"
        }
}
println "Exactly right!"  
println "You needed " + c + " guesses."               


