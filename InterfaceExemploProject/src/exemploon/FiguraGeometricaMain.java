package exemploon;

public class FiguraGeometricaMain {

    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(10);
        System.out.print(quadrado.getArea());
    }


    public interface FiguraGeometrica
    {
        public String getNomeFigura();
        public int getArea();
        public int getPerimetro();
    }

    public static class Quadrado implements FiguraGeometrica {

        private int lado;

        public Quadrado(int lado) {
            this.lado = lado;
        }

        public int getLado() {
            return lado;
        }

        public void setLado(int lado) {
            this.lado = lado;
        }

        @Override
        public int getArea() {
            int area = 0;
            area = lado * lado;

            return area;
        }

        @Override
        public int getPerimetro() {
            int perimetro = 0;

            perimetro = lado * 4;
            return perimetro;
        }

        @Override
        public String getNomeFigura() {
            return "quadrado";
        }
    }

    public class Triangulo implements FiguraGeometrica {

        private int base;
        private int altura;
        private int ladoA;
        private int ladoB;
        private int ladoC;

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public int getBase() {
            return base;
        }

        public void setBase(int base) {
            this.base = base;
        }

        public int getLadoA() {
            return ladoA;
        }

        public void setLadoA(int ladoA) {
            this.ladoA = ladoA;
        }

        public int getLadoB() {
            return ladoB;
        }

        public void setLadoB(int ladoB) {
            this.ladoB = ladoB;
        }

        public int getLadoC() {
            return ladoC;
        }

        public void setLadoC(int ladoC) {
            this.ladoC = ladoC;
        }

        @Override
        public String getNomeFigura() {
            return "Triangulo";
        }

        @Override
        public int getArea() {
            int area = 0;
            area = (base * altura) / 2;
            return area;
        }

        @Override
        public int getPerimetro() {
            int perimetro = 0;
            perimetro = ladoA + ladoB + ladoC;

            return perimetro;
        }
    }
}
