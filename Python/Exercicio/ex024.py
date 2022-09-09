cid = str(input('Em qual cidade voce reside? :').strip())

print('A sua cidade possui Santo no nome: {}'.format(cid[:5].upper() == 'SANTO'))
# name = cid.upper().split()
#print('Sua cidade {} possui "Santo" no nome: {}'.format(cid.title(), ('SANTO'in (name[0]))))
