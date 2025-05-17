// O problema Two Sum pede para encontrar, em um array de inteiros nums, os índices de dois números que somados resultem em um target específico.

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Índices encontrados: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Nenhuma combinação encontrada.");
        }

        int[] result2 = twoSumWithHash(nums, target);

        if (result2.length == 2) {
            System.out.println("Índices encontrados: " + result2[0] + ", " + result2[1]);
        } else {
            System.out.println("Nenhuma combinação encontrada.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) { // verifica o arrays até o penúltimo elemento
            for (int j = i + 1; j < n; j++) { // verifica o arrays a partir do próximo elemento
                if (nums[i] + nums[j] == target) { // verifica se a soma dos dois elementos é igual ao target
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {}; // Retorna array vazio se não encontrar
    }

    public static int[] twoSumWithHash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();// Cria um HashMap para armazenar os números e seus índices

        for (int i = 0; i < nums.length; i++) { // Verifica cada elemento do array
            int complement = target - nums[i]; // Calcula o complemento necessário para atingir o target
            if (map.containsKey(complement)) { // Verifica se o complemento já está no HashMap
                return new int[] {map.get(complement), i}; 
            }
            map.put(nums[i], i); 
        }
        return new int[]{};  
    }
}
