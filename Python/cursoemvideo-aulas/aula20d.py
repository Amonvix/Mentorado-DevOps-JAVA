# Desempacotamento

def soma(* valores):                             # coleta N valores para utilizar na função
    s = 0                                        # declaração da variavel que ira receber a soma
    for num in valores:                          # laço para verificação de cada um dos valores informados
        s += num                                 # soma dos valores atribuidos à variavel S
    print(f'A soma de valores é {s}')            # print dos valores somados


soma(3,5,6)
soma(2,3)
soma(1,2,3,4)
