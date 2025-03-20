PORTUGUÊS || ENGLISH


Implementação completa da busca binária com versões iterativa e recursiva em Java. Ideal para estudos de algoritmos.

## 🇧🇷 Português

### Visão Geral
Implementação de referência do algoritmo de busca binária, contendo:
- Versão iterativa com O(1) de espaço
- Versão recursiva com O(log n) de espaço
- Casos de teste demonstrativos
- Documentação detalhada em código

### Funcionalidades Principais
- 🎯 Busca eficiente em O(log n)
- ⚡ Duas implementações complementares
- 🧪 Casos de teste prontos
- 📚 Documentação Javadoc completa

### Detalhes de Implementação
```
public class BinarySearch {
    // Versão iterativa
    public static int iterativeSearch(int[] nums, int target) { ... }
    
    // Versão recursiva
    public static int recursiveSearch(int[] nums, int target) { ... }
}
```

### Como Usar
1. Clone o repositório:
```
git clone https://github.com/MouraMath/BinarySearch.git
```

2. Execute o programa principal:
```
public static void main(String[] args) {
    int[] arr = {-5, 0, 3, 12, 24};
    System.out.println(BinarySearch.iterativeSearch(arr, 12)); // 3
}
```

3. Execute os testes incluídos no método `main`

### Complexidade
| Método       | Tempo  | Espaço   |
|--------------|--------|----------|
| Iterativo    | O(log n)| O(1)     |
| Recursivo    | O(log n)| O(log n) |

### Por que Usar?
- Demonstração de diferentes abordagens (iterativa vs recursiva)
- Base para problemas mais complexos de busca ordenada

## 🇺🇸 English

### Overview
Reference implementation of binary search algorithm featuring:
- Iterative version with O(1) space
- Recursive version with O(log n) space
- Demonstration test cases
- Detailed code documentation

### Key Features
- 🎯 O(log n) efficient search
- ⚡ Two complementary implementations
- 🧪 Ready-to-use test cases
- 📚 Complete Javadoc documentation

### Implementation Details
```
public class BinarySearch {
    // Iterative version
    public static int iterativeSearch(int[] nums, int target) { ... }
    
    // Recursive version
    public static int recursiveSearch(int[] nums, int target) { ... }
}
```

### How to Use
1. Clone repository:
```
git clone https://github.com/MouraMath/BinarySearch.git
```

2. Run main program:
```
public static void main(String[] args) {
    int[] arr = {-5, 0, 3, 12, 24};
    System.out.println(BinarySearch.iterativeSearch(arr, 12)); // 3
}
```

3. Execute included test cases in `main` method

### Complexity
| Method       | Time   | Space    |
|--------------|--------|----------|
| Iterative    | O(log n)| O(1)     |
| Recursive    | O(log n)| O(log n) |

### Why This Implementation?
- Demonstrates different approaches (iterative vs recursive)
- Foundation for complex ordered search problems

## 📝 Comparative Analysis
| Aspect          | Iterative          | Recursive          |
|-----------------|--------------------|--------------------|
| Memory Usage    | Constant (O(1))    | Log n (O(log n))   |
| Stack Safety    | Safe for huge data | Risk for huge data |
| Code Style      | Imperative         | Declarative        |
| Learning Value  | Loop management    | Recursion concepts |
