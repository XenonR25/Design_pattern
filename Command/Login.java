public class Login {
    public static void main(String[] args) {

        ProxyShell proxyShell = new ProxyShell();
        proxyShell.Start("cd DP accessing", "user");
        proxyShell.Start("rm-rf", "user");
        proxyShell.Start("rm-rf", "admin");

        
    }
}
