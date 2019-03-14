package com.nrsc.springstudy.c2_import.config;

import com.nrsc.springstudy.c2_import.bean.Cat;
import com.nrsc.springstudy.c2_import.bean.Dog;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Dog.class, Cat.class, NrscImportSelector.class, NrscImportBeanDefinitionRegistrar.class})
public class ImportStudyConfig3 {
}
