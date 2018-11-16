package com.trittimo.udm.util;

import com.dslplatform.json.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class UDMDefinition implements JsonObject {
    @JsonAttribute


    public static UDMDefinition load(UDMContext context, String definitionPath) {
        // DslJson json = context.get(DslJson.class, "dslJson");
        // json.deserialize(UDMDefinition.class, new FileInputStream(definitionPath));
        // return JsonReader.ReadJsonObject<UDMDefinition>
        return null;
    }


    @Override
    public void serialize(JsonWriter writer, boolean minimal) {

    }
}
