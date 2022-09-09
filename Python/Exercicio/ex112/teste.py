from ex112.utilidadescev import dado
from ex112.utilidadescev import  moeda

p = dado.leiaDinheiro('Digite um preço: R$ ')
print(moeda.resumo(p, 50, 75))
