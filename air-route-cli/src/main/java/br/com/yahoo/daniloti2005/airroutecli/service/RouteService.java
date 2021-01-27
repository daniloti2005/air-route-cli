package br.com.yahoo.daniloti2005.airroutecli.service;

import br.com.daniloti2005.air_route_commons.interpreter.dijkstra.Route;
import br.com.daniloti2005.air_route_commons.service.csv.FileService;

public class RouteService {

    public Route fromParameterPath(String path) throws Exception {
        FileService file = new FileService(path);
        return file.loadfromfile();
        
    }

    public void saveToPath(String path) throws Exception {
        FileService file = new FileService(path);
        file.save(path);
    }
}
