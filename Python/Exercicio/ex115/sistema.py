from ex115.lib.interface import *
from ex115.lib.arquivo import *
from time import sleep

arq = 'cursoemvideo.txt'

if not arquivoExiste(arq):
    criarArquivo(arq)


while True:
    resposta = menu(['Ver pessoas', 'Cadastrar nova pessoa', 'Sair do Sistema'])
    if resposta == 1:
        # listar o conteudo item 1
        lerarquivo(arq)
    elif resposta == 2:
        # opção de cadastrar uma nova pessoa.
        head('NOVO CADASTRO')
        nome = str(input('Nome: '))
        idade = leiaInt('Idade: ')
        cadastrar(arq, nome, idade)

    elif resposta == 3:
        # encerra o sistema
        head('\033[35mSaindo do programa... Até logo!\033[m')
        break
    else:
        print('\033[31mErro - Por favor, digite um numero inteiro vállido!\033[m ')
    sleep(2)