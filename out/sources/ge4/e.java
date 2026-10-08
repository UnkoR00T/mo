package ge4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface e<R, T> {

    public static abstract class a {
        protected static Type b(int i15, ParameterizedType parameterizedType) {
            return c0.g(i15, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return c0.h(type);
        }

        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, y yVar);
    }

    Type a();

    T b(d<R> dVar);
}
