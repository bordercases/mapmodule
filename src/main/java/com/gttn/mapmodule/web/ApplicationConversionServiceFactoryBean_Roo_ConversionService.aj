// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.gttn.mapmodule.web;

import com.gttn.mapmodule.domain.Mapmodule;
import com.gttn.mapmodule.repository.MapmoduleRepository;
import com.gttn.mapmodule.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    @Autowired
    MapmoduleRepository ApplicationConversionServiceFactoryBean.mapmoduleRepository;
    
    public Converter<Mapmodule, String> ApplicationConversionServiceFactoryBean.getMapmoduleToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.gttn.mapmodule.domain.Mapmodule, java.lang.String>() {
            public String convert(Mapmodule mapmodule) {
                return new StringBuilder().append(mapmodule.getName()).toString();
            }
        };
    }
    
    public Converter<Long, Mapmodule> ApplicationConversionServiceFactoryBean.getIdToMapmoduleConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.gttn.mapmodule.domain.Mapmodule>() {
            public com.gttn.mapmodule.domain.Mapmodule convert(java.lang.Long id) {
                return mapmoduleRepository.findOne(id);
            }
        };
    }
    
    public Converter<String, Mapmodule> ApplicationConversionServiceFactoryBean.getStringToMapmoduleConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.gttn.mapmodule.domain.Mapmodule>() {
            public com.gttn.mapmodule.domain.Mapmodule convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Mapmodule.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getMapmoduleToStringConverter());
        registry.addConverter(getIdToMapmoduleConverter());
        registry.addConverter(getStringToMapmoduleConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}