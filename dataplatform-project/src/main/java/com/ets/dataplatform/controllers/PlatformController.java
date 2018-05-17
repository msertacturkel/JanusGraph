package com.ets.dataplatform.controllers;



import org.springframework.web.bind.annotation.*;

/**
 * Class rest-end point for schema and data.
 * It Provides CRUD operations.
 *
 */

@RestController
public class PlatformController {

    /**
     * Create Schema JSON
     * @param input
     */
    @PostMapping
    @RequestMapping(value="/schema/create",produces = "application/json")
    public void schemaCreate(@RequestBody String input) {
        System.out.println(input);
    }

    /**
     * Read Schema JSON
     * @param input
     * @return
     */
    @PostMapping
    @RequestMapping(value="/schema/read",produces = "application/json")
    public String schemaRead(@RequestBody String input){
        return null;
    }

    /**
     * Update Schema JSON
     * @param input
     * @return
     */
    @PostMapping
    @RequestMapping(value="/schema/update",produces = "application/json")
    public String schemaUpdate(@RequestBody String input){
        return null;
    }

    /**
     * Delete Schema JSON
     * @param input
     * @return
     */
    @PostMapping
    @RequestMapping(value="/schema/delete",produces = "application/json")
    public String schemaDelete(@RequestBody String input){
        return null;
    }

    /**
     * Create Data JSON
     * @param input
     */
    @PostMapping
    @RequestMapping(value="/data/create",produces = "application/json")
    public void dataCreate(@RequestBody String input) {
        System.out.println(input);
    }

    /**
     * Read Data JSON
     * @param input
     * @return
     */
    @PostMapping
    @RequestMapping(value="/data/read",produces = "application/json")
    public String dataRead(@RequestBody String input){
        return null;
    }

    /**
     * Update Data JSON
     * @param input
     * @return
     */
    @PostMapping
    @RequestMapping(value="/data/update",produces = "application/json")
    public String dataUpdate(@RequestBody String input){
        return null;
    }

    /**
     * Delete Data JSON
     * @param input
     * @return
     */
    @PostMapping
    @RequestMapping(value="/data/delete",produces = "application/json")
    public String dataDelete(@RequestBody String input){
        return null;
    }

    @GetMapping
    @RequestMapping(value="/test",produces = "application/json")
    public String dataDelete(){
        System.out.println("TEST");

        return null;
    }
}
