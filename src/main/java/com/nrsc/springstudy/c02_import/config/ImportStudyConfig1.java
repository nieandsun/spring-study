package com.nrsc.springstudy.c02_import.config;

import com.nrsc.springstudy.c02_import.bean.Cat;
import com.nrsc.springstudy.c02_import.bean.Dog;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
/**将Dog和Cat类注入到Spring容器*/
@Import(value = {Dog.class, Cat.class})
public class ImportStudyConfig1 {
}
