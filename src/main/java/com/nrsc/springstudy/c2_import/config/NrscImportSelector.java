package com.nrsc.springstudy.c2_import.config;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
public class NrscImportSelector implements ImportSelector {
    /**
     * 该类需要实现的方法就一个
     * @param importingClassMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //返回要注入到spring容器的全类名
        return new String[]{
                "com.nrsc.springstudy.c2_import.bean.Duck",
                "com.nrsc.springstudy.c2_import.bean.Elephant"};
    }
}
