package com.example;

//Crea una clase Persona con las siguientes variables:
//- La edad.
//- El nombre.
//- El teléfono.

//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la
// variable credito solo para esa clase.

//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el
// credito, tienes que darles valor y mostrarlas por pantalla.

//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que
// solo tenga la clase Trabajador.

public class Herencia {

    public static void main(String[] args) {

        Persona persona = new Persona(32, "Jorge", 2134467445);
        System.out.println(persona.toString());

        Cliente cliente = new Cliente(40, "Julia", 13135769, 100);
        System.out.println(cliente.toString());

        Trabajador trabajador = new Trabajador(89, "María", 719275094, 10000);
        System.out.println(trabajador.toString());

    }

    static class Persona {
        int edad;
        String nombre;
        long telefono;

        public Persona(){};
        public Persona(int edad, String nombre, long telefono){
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "edad=" + edad +
                    ", nombre='" + nombre + '\'' +
                    ", telefono=" + telefono +
                    '}';
        }
    }

    static class Cliente extends Persona {
        int credito;

        public Cliente(){};
        public Cliente(int edad, String nombre, long telefono, int credito){
            super(edad, nombre, telefono);
            this.credito = credito;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "edad=" + edad +
                    ", nombre='" + nombre + '\'' +
                    ", telefono=" + telefono +
                    ", credito=" + credito +
                    '}';
        }
    }

    static class Trabajador extends Persona {
        int salario;

        public Trabajador(){};
        public Trabajador(int edad, String nombre, long telefono, int salario){
            super(edad, nombre, telefono);
            this.salario = salario;
        }

        @Override
        public String toString() {
            return "Trabajador{" +
                    "edad=" + edad +
                    ", nombre='" + nombre + '\'' +
                    ", telefono=" + telefono +
                    ", salario=" + salario +
                    '}';
        }
    }
}
