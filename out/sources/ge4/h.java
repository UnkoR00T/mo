package ge4;

import fv.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface h<F, T> {

    public static abstract class a {
        protected static Type a(int i15, ParameterizedType parameterizedType) {
            return c0.g(i15, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return c0.h(type);
        }

        public h<?, fv.c0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
            return null;
        }

        public h<e0, ?> d(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }

        public h<?, String> e(Type type, Annotation[] annotationArr, y yVar) {
            return null;
        }
    }

    T a(F f15);
}
