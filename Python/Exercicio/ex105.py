def notas(*num, sit=False):
    """
    -> Função criada para calcular a media de notas dos alunos independente de quantos inseridos
    :param num: notas dos alunos
    :param sit: (opcional) Se True, informa a situação da média
    :return: O valores total de notas, Maior nota, Menor nota, Média e (opcional) Situação do aluno
    """
    dicionario['Total'] = len(num)
    dicionario['Maior'] = max(num)
    dicionario['Menor'] = min(num)
    dicionario['Média'] = sum(num) / len(num)
    if sit == True:
        if dicionario['Média'] > 7:
            dicionario['Situação'] = 'APROVADO'
        if 4 <= dicionario['Média'] < 7:
            dicionario['Situação'] = 'RECUPERAÇÃO'
        if dicionario['Média'] < 4:
            dicionario['Situação'] = 'REPROVADO'


dicionario = dict()
resp = notas(5.5, 8, 6, sit=True)
print(dicionario)
help(notas)
