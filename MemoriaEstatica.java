public class MemoriaEstatica
{
    public static void main(String[] args)
    {
        int[] datos = new int[10];
        for (int i=0;i<10;i++)
        {
            datos[i] = i*10;
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(datos[i]);
        }
    }
}