/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfw;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lucas
 */
public class WeightSort {

    public static String orderWeight(String strng) {
        String result = "";
        if (!strng.isEmpty()) {
            List<String> numeros = Arrays.asList(strng.split(" "));
            numeros.sort((String o1, String o2) -> {
                if (pesoNumero(o1) == pesoNumero(o2)) {
                    return o1.compareTo(o2);
                } else {
                    return Integer.compare(pesoNumero(o1), pesoNumero(o2));
                }
            });
            for (String numero : numeros) {
                result += (result.isEmpty() ? "" : " ") + numero;
            }
        }
        return result;
    }

    public static int pesoNumero(String numero) {
        int valor = 0;
        for (int i = 0; i < numero.length(); i++) {
            valor += Integer.parseInt(String.valueOf(numero.charAt(i)));
        }
        return valor;
    }
}
