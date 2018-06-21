package com.ets.dataplatform.services;

import com.ets.dataplatform.init.JanusGraphApp;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.util.GraphFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

@Service
public class GraphService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GraphService.class);
    String fileName = JanusGraphApp.class.getClassLoader().getResource("jgex-hbase-solr-http.properties").getPath();
    public Configuration conf;
    public Graph graph;
    public GraphTraversalSource g;

    /**
     * Opens the graph instance. If the graph instance does not exist, a new
     * graph instance is initialized.
     */
    public GraphTraversalSource openGraph() throws ConfigurationException {
        System.out.println("");
        LOGGER.info("opening graph");
        conf = new PropertiesConfiguration(fileName);
        graph = GraphFactory.open(conf);
        g = graph.traversal();
        return g;
    }



}
