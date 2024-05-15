import java.util.ArrayList;
import java.util.List;

public class ProxyShell implements Terminal{
    private Powershell powershell;
    private List<String> Restricted;
    
    public ProxyShell() {
        powershell = new Powershell();
        Restricted = new ArrayList<>();
        Restricted.add("rm-rf");
    }

    @Override
    public void Start(String command, String person) {
        if(Restricted.contains(command) && person != "admin"){
            System.out.println("Didn't run : " + command);
        }
        else{
            powershell.Start(command,person);
        }
    }

}
