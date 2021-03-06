// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.gttn.mapmodule.domain;

import com.gttn.mapmodule.domain.Mapmodule;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect Mapmodule_Roo_Json {
    
    public String Mapmodule.toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }
    
    public String Mapmodule.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }
    
    public static Mapmodule Mapmodule.fromJsonToMapmodule(String json) {
        return new JSONDeserializer<Mapmodule>()
        .use(null, Mapmodule.class).deserialize(json);
    }
    
    public static String Mapmodule.toJsonArray(Collection<Mapmodule> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }
    
    public static String Mapmodule.toJsonArray(Collection<Mapmodule> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }
    
    public static Collection<Mapmodule> Mapmodule.fromJsonArrayToMapmodules(String json) {
        return new JSONDeserializer<List<Mapmodule>>()
        .use("values", Mapmodule.class).deserialize(json);
    }
    
}
