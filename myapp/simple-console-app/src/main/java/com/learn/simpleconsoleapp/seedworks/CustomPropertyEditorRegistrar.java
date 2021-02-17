package com.learn.simpleconsoleapp.seedworks;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        var dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        registry.registerCustomEditor(Date.class, new CustomDateEditor(dateFormatter, false));

        registry.registerCustomEditor(String.class, new StringTrimmerEditor(false));
    }
}
