import java.io.*;
import java.net.*;
class pingip{
public static void runSystemCommand(String command)
{
try
{
Process p=Runtime.getRuntime().exec(command);
BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
String st=" ";
while(true)
{
st=br.readLine();
System.out.println(st);
}
}
catch(Exception e){}
}
public static void main(String arg[])
{
String ip="10.0.10.64";
runSystemCommand("ping "+ip);
}}
