import urllib
import urllib.request

try:
    urllib.request.urlopen('http://www.pudim.com.br')
except:
    print("URL NÃO ACESSÍVEL!")
else:
    print("PUDIM SERVIDO!")