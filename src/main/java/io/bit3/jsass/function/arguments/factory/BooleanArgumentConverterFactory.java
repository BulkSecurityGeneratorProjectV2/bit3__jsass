package io.bit3.jsass.function.arguments.factory;

import io.bit3.jsass.function.arguments.converter.ArgumentConverter;
import io.bit3.jsass.function.arguments.converter.BooleanArgumentConverter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class BooleanArgumentConverterFactory implements ArgumentConverterFactory {

  @Override
  public boolean canHandle(Class<?> targetType) {
    return Boolean.class.isAssignableFrom(targetType)
        || boolean.class.isAssignableFrom(targetType);
  }

  @Override
  public ArgumentConverter create(Object object, Method method, Parameter parameter) {
    return new BooleanArgumentConverter();
  }
}
