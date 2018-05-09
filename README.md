# Atividade IX
Estrutura de Dados - Atividade de Avaliação IX – Prof. Arley - FATEC SJC

## Atividade

Descrição da atividade: programar uma classe para representar uma matriz de
adjacência. A classe deverá implementar as seguintes operações (métodos), porém ela
pode ter outros métodos e atributos que você julgar necessário:

• create(nroVertice:int):void criar uma matriz com nroVertice elementos e
manter ela num atributo da classe. Essa matriz deverá ser a matriz de
adjacência;
• addArco(origem:int, destino:int):void adiciona um arco na matriz de
adjacência entre o vértice de origem e destino;
• removeArco(origem:int, destino:int):void remove um arco na matriz de
adjacência entre o vértice de origem e destino;
• grauEntrada(nroVertice:int):int retorna o grau de entrada do vértice
indicado;
• grauSaida(nroVertice:int):int retorna o grau de saída do vértice indicado;
• grau(nroVertice:int):int retorna o grau do vértice indicado;
• isAdjacente(nroVerticeA:int, nroVerticeB:int):boolean retorna true se
os vértices a e b são adjacentes;
• print():void imprimir na tela a matriz de incidência;
• printPath(nroVerticeA:int, nroVerticeB:int):void imprimir na tela os
vértices existentes entre a e b, isto é, o caminho que une dois vértices
