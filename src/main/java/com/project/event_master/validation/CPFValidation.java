package com.project.event_master.validation;

import org.springframework.stereotype.Component;

import com.project.event_master.exceptions.ValidationException;

@Component
public class CPFValidation {

    private static boolean validateOnlyNumbers(String cpf) {
        if (cpf == null) {
            return false;
        }
        return cpf.matches("\\d+");
    }

    private static boolean validateSize(String cpf) {
        return cpf.length() == 11;
    }

    private static boolean validateRepeatedNumbers(String cpf) {
        for (int i=1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    private static boolean validateDigits(String cpf, int digit) {
        int maxIndex = 8 + digit;
        int sum = 0;
        for (int i=0; i < maxIndex; i++) {
            int value = Character.getNumericValue(cpf.charAt(i));
            sum += (value)*((9 + digit)-i);
        }
        int result = (sum * 10) % 11;
        if (result == 10) { 
            result = 0; 
        }
        int reference = Character.getNumericValue(cpf.charAt(maxIndex));;
        return result == reference;
    }

    public boolean validateCPF(String cpf) {
        if (!validateOnlyNumbers(cpf)) 
            throw new ValidationException("CPF inválido. Contém caracteres não numéricos!"); 
        if (!validateSize(cpf)) 
            throw new ValidationException("CPF inválido. Número não contém 11 digitos!"); 
        if (!validateRepeatedNumbers(cpf)) 
            throw new ValidationException("CPF inválido. Todos os números são repetidos!"); 
        if (!validateDigits(cpf, 1)) 
            throw new ValidationException("CPF inválido. Primeiro digito invalidado!");
        if (!validateDigits(cpf, 2)) 
            throw new ValidationException("CPF inválido. Segundo digito invalidado!");
        return true;
    }

}
