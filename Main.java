public class Main
{
    static class Persona
    {
        protected String nombre;
        protected int edad;
        public Persona (String nombre, int edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }
        public void mostrar()
        {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad );
        }
    }
    
    static class Alumno extends Persona
    {
        private float notaFinal;
        public Alumno (String nombre, int edad, float notaFinal)
        {
            super (nombre, edad);
            this.notaFinal = notaFinal;
        }
        public void mostrar()
        {
            super.mostrar();
            System.out.println("Nota Final: " + notaFinal);
        }
    }
    
    static class Profesor extends Persona
    {
        public String materia;
        public Profesor (String nombre, int edad, String materia)
        {
            super (nombre, edad);
            this.materia = materia;
        }
        public void mostrar()
        {
            super.mostrar();
            System.out.println("Materia: " + materia);
        }
    }
    
    public static void main (String[] args) 
    {
        Persona [] lista = new Persona[3];
        lista[0] = new Profesor("Maria",30,"Algoritmos");
        lista[1] = new Alumno ("José",20,4.9f);
        lista[2] = new Alumno ("Pedro",19,4.5f);
    
    
        for(Persona p:lista)
        {
            p.mostrar();
        }
    
    }
    
}