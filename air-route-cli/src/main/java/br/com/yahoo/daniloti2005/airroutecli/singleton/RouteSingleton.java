package br.com.yahoo.daniloti2005.airroutecli.singleton;


import java.util.ArrayList;
import java.util.List;

/***
 * Route Pool
 */
public final class RouteSingleton {
    
    private static RouteSingleton INSTANCE;
    private static String info = "This class is responsible to create a Route´s Pool";
    private static List<String> lstRoute;

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
    public static void setRoute(String route){
        if (lstRoute == null) {
            lstRoute = new ArrayList<>();
            try {
                lstRoute.add(route.toString());
            } catch (Exception exception) {
                throw exception;
            }
            
        }
    }

    /***
     * get a list of Routes.
     * @return
     */
    public static List<String> getListRoutes() {
        return lstRoute;
    }


    /***
     * Reset Route's pool.
     */
    public static void reset() {
        lstRoute.clear();
    }

    /***
     *  Returns Information converns to class responsabilities.
     * @return info
     */
    public static String getInfo() {
        return info;
    }
    
}
