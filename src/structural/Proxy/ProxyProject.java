package structural.Proxy;

public class ProxyProject implements Project {
    private RealProject realProject;
    private String url;

    public ProxyProject(String url) {
        this.url=url;
    }

    @Override
    public void run() {
        if(realProject==null){
            realProject=new RealProject(url);
        }
        realProject.run();
    }
}
