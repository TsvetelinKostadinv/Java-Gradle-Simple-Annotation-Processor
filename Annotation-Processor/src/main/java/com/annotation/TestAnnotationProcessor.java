/**
 * 
 */
package com.annotation;

import java.util.Collections;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

import com.google.auto.service.AutoService;

/**
 * @author Tsvetelin
 *
 */
@AutoService(Processor.class)
public class TestAnnotationProcessor extends AbstractProcessor {
	
	private Messager msg;
	
	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		super.init(processingEnv);
		this.msg = processingEnv.getMessager();
	}
	
	@Override
	public Set<String> getSupportedAnnotationTypes() {
		return Collections.singleton( TestAnnotation.class.getCanonicalName() );
	}
	
	@Override
	public SourceVersion getSupportedSourceVersion() {
		return SourceVersion.latestSupported();
	}
	
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		
		annotations.forEach( annotation -> {
			msg.printMessage( Kind.NOTE, "Processing: " + annotation.getSimpleName());
			
			roundEnv.getElementsAnnotatedWith(annotation).forEach(element ->{
				msg.printMessage( Kind.NOTE, "Element: " + element.getSimpleName() );
			});
			
		});
		
		return true;
	}
}
