# campeonato brasileiro :(
times = ('FLAMENGO','INTER','ATLETICO MG','SAO PAULO','FLUMINENSE','GREMIO','PALMEIRAS','SANTOS',
         'ATLETICO PR','BRAGANTINO','CEARA','CORINTHIANS','ATLETICO GO','BAHIA','SPORT RECIFE',
         'FORTALEZA','VASCO DA GAMA','GOIAS','CORITIBA','BOTAFOGO')

if times.count('CHAPECOENSE') == 0:
    print('O TIME DA CHAPECOENSE NÃO SE CLASSIFICOU ESTE ANO')
else:
    print(f'O time está na posição {times.index("CHAPECOENSE")}')

print(f'Os cinco primeiros colocados são : {times[0:5]}')
print(f'Na zona de Rebaixamento estão: {times[:16]}')
print(f'Em ordem alfabética, os times deste ano são{sorted(times)}')

