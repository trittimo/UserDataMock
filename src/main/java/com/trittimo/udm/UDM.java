package com.trittimo.udm;

import com.dslplatform.json.DslJson;
import com.trittimo.udm.util.UDMContext;
import com.trittimo.udm.util.UDMDefinition;
import org.apache.commons.cli.*;

import java.util.HashMap;
import java.util.Map;

public class UDM {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        options.addOption("d", "definition", true, "The path to the definition file");
        options.addOption("o", "output", true, "The path to write output to");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        String definitionPath = cmd.getOptionValue("d");
        String outputPath = cmd.getOptionValue("o");

        UDMContext context = new UDMContext();
        context.put("dslJson", new DslJson<>());

        UDMDefinition definition = UDMDefinition.load(context, definitionPath);
        context.put("definition", definition);


    }
}
