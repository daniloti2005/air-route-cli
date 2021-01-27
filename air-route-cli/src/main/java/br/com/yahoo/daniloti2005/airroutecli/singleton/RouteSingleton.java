package br.com.yahoo.daniloti2005.airroutecli.singleton;


import br.com.daniloti2005.air_route_commons.interpreter.dijkstra.Node;
import br.com.daniloti2005.air_route_commons.interpreter.dijkstra.Route;

import java.util.ArrayList;
import java.util.List;

/***
 * Route Pool
 */
public final class RouteSingleton {
    
    private static RouteSingleton INSTANCE;
    private static String info = "This class is responsible to create a Route´s Pool";
    private static Route route;
    private static List<Node> result;


    /***
     * Constructor doing nothing :)
     */
    private RouteSingleton() {

    }

    /***
     * Return a single INSTANCE of this Pool Class.
     * @return INSTANCE
     * @throws Exception
     */
    public static RouteSingleton getInstance() throws Exception {
        if (INSTANCE == null) {
            INSTANCE = new RouteSingleton();
        }

        return INSTANCE;
    }

    /***
     * set a Route to this Singleton pool.
     */
    public static void setRoute(Route initRoute){
        if (route == null) {
            route = new Route();
            try {
                route = initRoute;
            } catch (Exception exception) {
                throw exception;
            }
            
        }
    }

    /***
     * get a list of Routes.
     * @return
     */
    public static Route getRoute() {
        return route;
    }


    /***
     * Reset Route's pool.
     */
    public static void reset() {
        route = null;
    }

    /***
     *  Returns Information converns to class responsabilities.
     * @return info
     */
    public static String getInfo() {
        return info;
    }

    /***
     * Return Resultes performed by dijkstra to find out a minor path.
     * @return
     */
    public static List<Node> getResult() {
        return result;
    }

    /***
     * Set Results to save results
     * @param initResult
     */
    public static void setResult(List<Node> initResult) {
        if (result == null) {
            result = new ArrayList<>();
            try {
                result = initResult;
            } catch (Exception exception) {
                throw exception;
            }

        }
        RouteSingleton.result = result;
    }
}
