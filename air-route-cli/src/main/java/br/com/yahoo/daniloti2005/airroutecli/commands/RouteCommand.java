package br.com.yahoo.daniloti2005.airroutecli.commands;

import br.com.daniloti2005.air_route_commons.interpreter.dijkstra.Edge;
import br.com.daniloti2005.air_route_commons.interpreter.dijkstra.Node;
import br.com.daniloti2005.air_route_commons.interpreter.dijkstra.Route;
import br.com.daniloti2005.air_route_commons.service.csv.FileService;
import br.com.yahoo.daniloti2005.airroutecli.AirRouteCliApplication;
import br.com.yahoo.daniloti2005.airroutecli.service.RouteService;
import br.com.yahoo.daniloti2005.airroutecli.singleton.RouteSingleton;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class RouteCommand {

    @ShellMethod("Example: add origin distance destionation")
    public String add(String origin, String distance, String destination) throws Exception {
        RouteService service = new RouteService();
        if (RouteSingleton.getRoute() == null) {
            RouteSingleton.setRoute(new Route());
        }
        RouteSingleton.getRoute().makeRoute(origin, destination, Integer.valueOf(distance));
        return "created!";
    }

    @ShellMethod("Create Route from file passed as argument")
    public String loadFile() throws Exception {
        RouteService service = new RouteService();
        RouteSingleton.setRoute(service.fromParameterPath(AirRouteCliApplication.path));
        return "created from file!";
    }

    @ShellMethod("List all routes added or uploaded.")
    public String list()
    {
        String ret = "";
        if (RouteSingleton.getRoute() == null || RouteSingleton.getRoute().getNodes() == null) {
            ret = "Nothing!!";
        } else {
            for (Node itemNode : RouteSingleton.getRoute().getNodes()){
                ret += "Node: "+itemNode.getName()+"\n";
                for (Edge itemEdge : itemNode.getEdges()) {
                    ret += "  To: "+itemEdge.getEndNode().getName()+" distance: "+String.valueOf(itemEdge.getLength())+"\n";
                }

            }
        }
        return ret;
    }

    @ShellMethod("Return original path passed as parameter.")
    public String path() {
        return AirRouteCliApplication.path;
    }

    @ShellMethod("Change original path passed as parameter.")
    public String changePath (String initPath) {
        AirRouteCliApplication.path = initPath.toString();
        return AirRouteCliApplication.path.toString();
    }

    @ShellMethod("Save to File on Path")
    public String saveToFile() throws Exception {
        FileService service = new FileService(AirRouteCliApplication.path);
        br.com.daniloti2005.air_route_commons.singleton.route.RouteSingleton.get
        service.save(AirRouteCliApplication.path);
        return "Created on "+AirRouteCliApplication.path;
    }

    @ShellMethod("Clean Routes in Memory")
    public String reset() {
        RouteSingleton.reset();
        return "Reset!";
    }

}
