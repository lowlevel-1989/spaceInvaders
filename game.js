//asignos a la variable canvas el objeto canvas
var canvas  = document.getElementById('game')
//creamos un contexto del canvas en formato 2d
var context = canvas.getContext('2d')

//creamos el juego a partir de la clase DevGame
var game = new DevGame()
//creamo un objeto a partir de la clase Entity, argumentos: x, y, width, height
var rect = new DevGame.Entity(30, 10, 100, 50)

//dibujamos el objeto
rect.draw(context)
