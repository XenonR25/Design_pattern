public class Powershell implements Terminal{

    @Override
    public void Start(String command, String person)
    {
        System.out.println(command + " started for-  " + person );
    }

}
