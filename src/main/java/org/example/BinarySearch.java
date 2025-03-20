package org.example;

/**
 * Implementação de Busca Binária com versões iterativa e recursiva
 *
 * @author SeuNome
 * @version 1.0
 * @since 2024-03-20
 */
public class BinarySearch {

    /**
     * Implementação iterativa da busca binária
     *
     * @param nums Array ordenado de inteiros
     * @param target Valor a ser buscado
     * @return Índice do elemento ou -1 se não encontrado
     */
    public static int iterativeSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Cálculo seguro do meio

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // Busca na metade direita
            } else {
                right = mid - 1; // Busca na metade esquerda
            }
        }
        return -1;
    }

    /**
     * Implementação recursiva da busca binária
     *
     * @param nums Array ordenado de inteiros
     * @param target Valor a ser buscado
     * @return Índice do elemento ou -1 se não encontrado
     */
    public static int recursiveSearch(int[] nums, int target) {
        return recursiveHelper(nums, target, 0, nums.length - 1);
    }

    private static int recursiveHelper(int[] nums, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return recursiveHelper(nums, target, mid + 1, right);
        } else {
            return recursiveHelper(nums, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        // Casos de teste originais do problema
        int[] testArray1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int target2 = 2;

        // Testando versão iterativa
        System.out.println("=== Teste Iterativo ===");
        System.out.println("Caso 1: " + iterativeSearch(testArray1, target1)); // Deve retornar 4
        System.out.println("Caso 2: " + iterativeSearch(testArray1, target2)); // Deve retornar -1

        // Testando versão recursiva
        System.out.println("\n=== Teste Recursivo ===");
        System.out.println("Caso 1: " + recursiveSearch(testArray1, target1)); // Deve retornar 4
        System.out.println("Caso 2: " + recursiveSearch(testArray1, target2)); // Deve retornar -1

        // Caso adicional: array com um elemento
        int[] singleElementArray = {5};
        System.out.println("\n=== Caso Adicional ===");
        System.out.println("Elemento único (5): " + iterativeSearch(singleElementArray, 5)); // Deve retornar 0
    }
}
