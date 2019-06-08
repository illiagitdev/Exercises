package basicPart1;

public class Base {

    /**
     * Convert DECIMAL number to ordered Binary array
     *
     * @param decimal
     * @return
     */
    public int[] decimalToBinary(int decimal) {
        int index = 0, i = 0;
        int[] res = new int[32];

        while (decimal != 0) {
            res[index++] = decimal % 2;
            decimal /= 2;
        }

        int[] result = new int[index];
        for (index--; index >= 0; index--) {
            result[i] = res[index];
            i++;
        }
        return result;
    }

    /**
     * Convert OCTA number to decimal
     *
     * @param octa
     * @return
     */
    public int octaToDecimal(int octa) {
        int decimal = 0, index = 1;
        while (octa != 0) {
            decimal = decimal + (octa % 10) * index;
            index *= 8;
            octa /= 10;
        }
        return decimal;
    }

    /**
     * Convert BINARY number to Hexa string
     *
     * @param binary
     * @return
     */
    public String binaryToHexa(int[] binary) {
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int tetrade = 0, multiplier = 1, index = 0, length = binary.length;
        String hexaOutput = "";
        while (index < length) {

            for (int i = 0; i < 4; i++) {
                if (index < length) {
                    tetrade = tetrade + binary[length - index - 1] * multiplier;
                    multiplier *= 2;
                    index++;
                }
            }
            multiplier = 1;
            hexaOutput = hexa[tetrade] + hexaOutput;
            tetrade = 0;
        }
        return hexaOutput;
    }

    /**
     * Convert HEXA string to decimal
     *
     * @param hexa
     * @return
     */
    public int hexaToDecimal(String hexa) {
        char[] hexaList = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int lenthHexa = hexa.length();
        char[] toDecimal = hexa.toUpperCase().toCharArray();
        int result = 0, multiplier = 1;

        for (int i = lenthHexa - 1; i >= 0; i--) {

            for (int z = 0; z < 16; z++) {
                if (toDecimal[i] != hexaList[z]) {
                    continue;
                } else {
                    result = result + z * multiplier;
                }
            }
            multiplier *= 16;
        }
        return result;
    }

    public int[] decimalToOcta(int decimal) {
        int[] octaRev = new int[32];
        int rem = 0, i = 0, k = 0;

        while (decimal > 0) {
            octaRev[i++] = decimal % 8;
            decimal /= 8;
        }
        i--;

        int[] octa = new int[i+1];
        for (; i >= 0; i--, k++) {
            octa[k] = octaRev[i];
        }
        return octa;
    }

//    public long octaToBinary(int octa) {
//        return 0;
//    }
//
//    public String octaToHexa(int octa) {
//        return "";
//    }

    public int[] hexaToOcta(String hexa) {
        return decimalToOcta(hexaToDecimal(hexa));
    }

    public int[] hexaToBinary(String hexa) {
        return decimalToBinary(hexaToDecimal(hexa));
    }

//    public long binaryToDecimal(long binary) {
//        return 0;
//    }
}
