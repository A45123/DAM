package processor;

import annotations.Greeting;
import com.google.auto.service.AutoService;
import com.squareup.kotlinpoet.ClassName;
import com.squareup.kotlinpoet.FileSpec;
import com.squareup.kotlinpoet.FunSpec;
import com.squareup.kotlinpoet.KModifier;
import com.squareup.kotlinpoet.ParameterSpec;
import com.squareup.kotlinpoet.PropertySpec;
import com.squareup.kotlinpoet.TypeSpec;
import java.io.File;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

@javax.annotation.processing.SupportedAnnotationTypes(value = {"annotations.Greeting"})
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a8\u0006\u0013"}, d2 = {"Lprocessor/GreetingProcessor;", "Ljavax/annotation/processing/AbstractProcessor;", "<init>", "()V", "getSupportedSourceVersion", "Ljavax/lang/model/SourceVersion;", "process", "", "annotations", "", "Ljavax/lang/model/element/TypeElement;", "roundEnv", "Ljavax/annotation/processing/RoundEnvironment;", "generateKotlinWrapperClass", "", "classElement", "methods", "", "Ljavax/lang/model/element/ExecutableElement;", "processor"})
@com.google.auto.service.AutoService(value = {javax.annotation.processing.Processor.class})
public final class GreetingProcessor extends javax.annotation.processing.AbstractProcessor {
    
    public GreetingProcessor() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public javax.lang.model.SourceVersion getSupportedSourceVersion() {
        return null;
    }
    
    @java.lang.Override()
    public boolean process(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends javax.lang.model.element.TypeElement> annotations, @org.jetbrains.annotations.NotNull()
    javax.annotation.processing.RoundEnvironment roundEnv) {
        return false;
    }
    
    private final void generateKotlinWrapperClass(javax.lang.model.element.TypeElement classElement, java.util.List<? extends javax.lang.model.element.ExecutableElement> methods) {
    }
}