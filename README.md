# air-route-solution-master
Author: Danilo Carrenho Ferreira
Date: 27/01/2021

This RPEL is developed with spring shell and is responsable for test air-route-common library that help to manipulate data structure like graph and perform dijkstra to find out the short path between two point as beginning and ending points.

## How to compile:
* mvn clean install -DskipTests

## How to Run:
* This project is develop with JDK15
* run
```
java -jar air-route-cli.jar rota.csv
```
  * rota.csv is on repository root
  
 this command are going to open RPEL, to perform dijkstra, first of all, run help command to see the options:
 
 ```
                                                                                
             ,@@@@*                 .&@@&.                 *@@@@,               
           &@@@#*@@@@@@@@@%%#%&@@@@@@@@@@@@@@@@&%#%%@@@@@@@@@,%@@@&             
        *@@@@         .(&@@@@@@&(.          .(&@@@@@@&/.         @@@@*          
      @@@@,                                                        *@@@@        
   #@@@%      ,@@@@@@@*   .%@@@(   #@@   %@@ @@@@@@@@ @@@@@@@%        %@@@(     
 .@@@.        ,@@,  ,@@*/@@%  .@@@ #@@   #@@   .@@/   @@@....           ,@@@    
   (@@@       ,@@@@@@@. @@#     @@##@@   #@@   .@@/   @@@@@@@%         @@@/     
    .@@@.     ,@@,/@@&  *@@&  ,@@@ /@@*  @@@   .@@/   @@@.....       .@@@.      
      @@@.    ,@@,  #@@#   #@@@*     (@@@%.    .@@/   @@@@@@@%      .@@@        
      ,@@@                                                          @@@.        
       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         
       &@@                                                         .@@%         
       @@@             #@@#                         %@@.            @@@         
      %@@,           @@@@@@@@.                    @@@@@@@@          *@@(        
     #@@#          @@@@@@@%                    .@@@@@@@(             %@@(       
    &@@#         %@@@@@@*                     @@@@@@@.                %@@%      
   @@@/        .@@@@@@%                     ,@@@@@@/                   (@@@     
  @@@,        /@@@@@@.                     %@@@@@@                      ,@@@    
 @@@,        (@@@@@@@@@@@@@@@@@@&         &@@@@@@@@@@@@@@@@@@/           *@@@   
&@@%        *@@@@@@@@@@@@@@@@@@@@@@      (@@@@@@@@@@@@@@@@@@@@@&          &@@#  
@@@         @@@@@@@&        .@@@@@@@.    @@@@@@@%        (@@@@@@@         .@@@  
@@@        /@@@@@@            #@@@@@@   @@@@@@@            @@@@@@&         @@@  
@@@        /@@@@@@            .@@@@@@   @@@@@@%            /@@@@@&         @@@  
&@@/        @@@@@@/           @@@@@@#   .@@@@@@.           @@@@@@*        #@@&  
 @@@.        @@@@@@@#      .@@@@@@@#     ,@@@@@@@,      .@@@@@@@*        ,@@@   
  @@@(        ,@@@@@@@@@@@@@@@@@@&         #@@@@@@@@@@@@@@@@@@#         #@@@    
   @@@@/         .@@@@@@@@@@@@(               /@@@@@@@@@@@@(          (@@@@     
     @@@@@#                                                        #@@@@&       
        &@@@@@@@&(*.                                      .*(&@@@@@@@&          
            ,%@@@@@@@@@@@@@@@@@@#.          .#@@@@@@@@@@@@@@@@@@%,              
                         ./&@@@@@@@@@@  @@@@@@@@@@%*.                           
                                  ,@@@@@@@@,                                    
                                      @@                                        
                                                                                

shell:>
 ```
 * Help option: 
 
 ```
 shell:>help
AVAILABLE COMMANDS

Built-In Commands
        clear: Clear the shell screen.
        exit, quit: Exit the shell.
        help: Display help about available commands.
        script: Read and execute commands from a file.
        stacktrace: Display the full stacktrace of the last error.

Route Command
        about: About air-route-cli
        add: Example: add origin distance destionation
        change-path: Change original path passed as parameter.
        list: List all routes added or uploaded.
        load-file: Create Route from file passed as argument
        path: Return original path passed as parameter.
        reset: Clean Routes in Memory
        run: Run dijkstra to discover lower cost between two points 
        save-to-file: Save to File on Path
        show-minor-path: Show minor path discovered by Dijkstra algorithm 


shell:>
 ```
 * Step by step to perform
 - load-file Obs: to upload file passed as parameter.
 - list. Obs: to check file uploaded.
 - run. -> to perform dijkstra between two point. It is mandatory pass arguments in this order : origin destination
 - show-minor-path -> show complete show path solved by dijkstra


