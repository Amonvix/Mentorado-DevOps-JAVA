dia = int(input('Por quantos dias o carro foi alugado? '))
km = float(input('Qual o total de quilometros rodados com o veículo? '))
vdia: float = 60.00  # valor da diária do veículo
vkm: float = 0.15  # valor do km rodado
tdia: float = dia * vdia
tkm: float = km * vkm
print('O valor total de seu aluguel foi de R$ {:.2f}'.format(tdia + tkm))
