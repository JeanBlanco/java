package POO.coleccciónDeZapato.Personal;

public class Empleado{
    private String cedula;
    private String name;
    private Integer age;

    public Empleado() {
    }

    public Empleado(String cedula, String name, Integer age) {
        this.cedula = cedula;
        this.name = name;
        this.age = age;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    

    

}