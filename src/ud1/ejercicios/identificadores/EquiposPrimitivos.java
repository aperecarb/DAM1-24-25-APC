package identificadores;

public class EquiposPrimitivos {
public static void main(String[] args) {
byte variByte = 127;
short variShort = 32000;
int varint = 2000000000;
long varilong = 4000000000000L;
double vARIdOUBLE =35E230;
float varifloat= 2.5f;


System.out.println("Tipo\tNumBits\tValor");
System.out.println("----------------------------");
System.out.println("byte\t8\t" +variByte);
System.out.println("short\t16\t" +variShort);
System.out.println("int\t32\t" +varint);
System.out.println("long\t8\t" +varilong);
System.out.println("float\t32\t" +varifloat);
System.out.println("double\t64\t" +vARIdOUBLE);



}
}