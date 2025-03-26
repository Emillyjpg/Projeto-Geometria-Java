package br.com.fecaf.model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe o Base: ");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("                                   ");
        return true;
    }

    public void calcularArea() {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("                                   ");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("--------------------------------------");
    }

    public void calcularPerimetro() {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("                                   ");
        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("                                   ");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo() {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("                                   ");

        if (base == lado2 && base == lado3) {
            System.out.println("Este Triângulo é Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Este Triângulo é Escaleno ...");

        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }
        System.out.println("                                   ");
    }

    //Na função a seguir, eu declaro as condições para se achar a parte maior do trinagulo (hipotenusa) e os outros lados (catetos)
    public void descobrirTrianRatan() {
        double hipot = 0;

        System.out.println("/*********************************/");
        System.out.println("/*   É um triangulo retangulo?   */");
        System.out.println("                                   ");

        //Se o maior lado for a base:
        if (base > lado2 && base > lado3) {
            hipot = base;

            // Se o maior lado for o lado2:
        } else if (lado2 > base && lado2 > lado3) {
            hipot = lado2;
        }
        // Se o maior lado for o lado3:
        else {
            hipot = lado3;
        }

        //Nesta parte da função, já com as condições declaradas, eu monto as operações matematicas
        //para descobrir se o triangulo cadastrado é um retangulo.
        if ((lado2 * lado2 + lado3 * lado3) == hipot * hipot) {
            System.out.println("Esse trinagulo é um retangulo");
        } else if ((base * base + lado2 * lado2) == hipot * hipot) {
            System.out.println("Esse trinagulo é um retangulo");
        } else if ((lado3 * lado3 + base * base) == hipot*hipot) {
            System.out.println("Esse trinagulo é um retangulo");
        }
        else{
            System.out.println("Esse trinagulo não é um retangulo");
        }
        System.out.println("--------------------------------------");
        }

//Nessa nova função, descobriremos se o triangulo é um 3 4 5;

    public void verificandoTriangulo (){

        //Arrumando o layout para o terminal
        System.out.println("/*********************************/");
        System.out.println("/*     Esta no padrão 3 4 5?     */");
        System.out.println("                                   ");

    // Para saber se o triangulo cadastrado é um 3 4 5, vou começar criando uma variavel para checar se o triangulo esta dentro do padão:

        // Se o primeiro cateto, que no caso será a base, for multiplo de 3, ele estara dentro do padrão 3 4 5
        double pad = base / 3;


        // Aqui estou informando para a função que se todos os numeros inseridos
        // pelo usuario forem multiplos de 3 4 5, e continuarem nesse padrão, ele sera um 3 4 5;
        if (lado2 == pad * 4 && lado3 == pad * 5){
            System.out.println("Seu triangulo é um 3 4 5");
        } else{
            System.out.println("Este triangulo não é um 3 4 5");
        }
        System.out.println("                                   ");
    }
    }