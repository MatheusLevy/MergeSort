TESTE
# MergeSort
Algoritimo de Merge Sort feito em java com utilização da ide IntelliJ.

1. DESCRIÇÃO: 

1) Implemente o algoritmo do MergeSort padrão apresentado em aula.

2) Usando o InsertSort para subarrays pequenos. Podemos melhorar a maioria dos algoritmos
recursivos tratando pequenos casos de maneira diferente, porque a recursão garante que o
método será usado com frequência para casos pequenos, portanto, melhorias no tratamento
deles levam a melhorias em todo o algoritmo. No caso da ordenação, sabemos que a
ordenação por inserção (ou seleção) é simples e, portanto, provavelmente mais rápida do
que a ordenação por mergesort para subvetores pequenos. Alternar para a ordenação por
inserção para subvetores pequenos (tamanho 15 ou menor) melhorará o tempo de execução
de uma implementação padrão do mergesort em 10 a 15 por cento.

3) Testando se o vetor já está ordenado. Podemos reduzir o tempo de execução para ser linear
para vetores que já estão ordenados, adicionando um teste para pular a chamada para o
método merge() se A[meio] é menor ou igual a A[meio+1]. Com essa mudança, ainda fazemos
todas as chamadas recursivas, mas o tempo de execução para qualquer subarray ordenado é
linear.

4) Eliminando a cópia para o vetor auxiliar. É possível eliminar o tempo (mas não o espaço)
gasto para copiar as chaves para um vetor auxiliar usado para Merging. Para fazer isso,
fazemos duas chamadas ao método de ordenação: uma obtém sua entrada do array
fornecido e coloca a saída ordenada no array auxiliar; a outra obtém sua entrada do vetor
auxiliar e coloca a saída ordenada no vetor fornecido. Com essa abordagem, em um pouco de
truque recursivo, podemos organizar as chamadas recursivas de modo que a computação
troque os papéis da matriz de entrada e da matriz auxiliar em cada nível.

2. Descrição sobre os arquivos de dados:
Execute experimento com Vetores de tamanho pequeno, médio e grande.
OBS: Você deverá gerar vetores de itens de vários tipos com valores de chaves aleatórias. Incluindo
os seguintes:

a) Chave (tipo string com no mínimo 10 caracteres), valor (tipo double)
b) Chave (tipo double), valor (tipo string com no mínimo 10 caracteres)
c) Chave (tipo int), valor (tipo int[30])


