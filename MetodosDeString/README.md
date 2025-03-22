### Métodos de manipulação de uma String

---
<h4>

- length() - Tamanho da String
- charAt(int)	Retorna o caractere na posição especificada
- isEmpty() - =True se a String estiver vazia, =False caso contrário
- isBlank() - =True se a String estiver vazia ou apenas com espaços, =False caso contrário
- codePointAt(int) - Retorna unicode do caractere indicado no índice int

Comparação com string
- equals(String texto2) - Compara se duas strings são iguais, considerando maiúsculas/minúsculas
- equalsIgnoreCase(String outra) - Compara ignorando maiúsculas/minúsculas
- matches(String regex) - Verifica se string corresponde a uma regex (expressão)


Busca em uma String
- contains(CharSequence seq) - Verifica se a string contém a sequência
- startsWith(String prefixo) - Verifica se começa com determinado prefixo
- endsWith(String sufixo) - Verifica se termina com determinado sufixo
- endsWith(String sufixo) - Verifica se termina com um sufixo
- indexOf(String str) - Retorna o índice da primeira ocorrência
- lastIndexOf(String str) - Retorna o índice da última ocorrência

Modificação da String
- toLowerCase() - Transformar letras em minúsculas
- toUpperCase() - Transformar letras em maúsculas
- trim() - Remove espaços no início e no fim
- replace(String velho,String novo) - Substitui todas as ocorrências de um texto
- replaceAll(String regex,String novo) - Substitui todas as ocorrências com regex
  replaceFirst(String regex,String novo)	Substitui apenas a primeira ocorrência

Recortar
- substring(int inicio) - Retorna a substring a partir do índice fornecido
- substring(int inicio, int fim) - Retorna a substring do intervalo fornecido
- split(String regex) - Divide a string com base em um delimitador
- split(String regex, int limite) - Divide a string com limite de divisões

Converter
- valueOf(int, double, char, etc.) - Converte diferentes tipos para String
- getBytes() - Converte a string em bytes, isso é: identificar o byte de cada caracter
- toCharArray() - Converte a string em um array de caracter
---
</h4>

## BÔNUS

**Uso do StringBuilder, que são como String, mas mutáveis.**
- append(String str) - Adiciona um string ao final
- insert(int index, String str) - Insere uma string em um index específico
- replace(int start, int end, String str) - Delimita uma string e Substitui parte delimitada
- delete(int start, int end) - Remove parte delimitada da da string
- reverse()- inverte a string


>  Inicia a contagem do index dos caracteres da String por 0.