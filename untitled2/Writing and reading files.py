fw= open('sample.txt','w')
fw.write("this is the sentence\t")
fw.write('I think it will concat\n')
fw.write('New line sentence')
fw.close()

fr=open('sample.txt','r')
text=fr.read()
print(text)
fr.close()