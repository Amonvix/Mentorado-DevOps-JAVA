from pygame import mixer
# programa para tocar musica a partir do Python.
mixer.init()
mixer.music.load('ex021.mp3')
mixer.music.play()
input('Enjoy the Ride')
