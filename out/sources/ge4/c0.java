package ge4;

import fv.e0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import oq.i0;

/* JADX INFO: loaded from: classes2.dex */
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Type[] f72297a = new Type[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f72298b = true;

    private static final class a implements GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f72299a;

        a(Type type) {
            this.f72299a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && c0.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f72299a;
        }

        public int hashCode() {
            return this.f72299a.hashCode();
        }

        public String toString() {
            return c0.u(this.f72299a) + "[]";
        }
    }

    static final class b implements ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f72300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f72301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type[] f72302c;

        b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                c0.b(type3);
            }
            this.f72300a = type;
            this.f72301b = type2;
            this.f72302c = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && c0.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f72302c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f72300a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f72301b;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f72302c) ^ this.f72301b.hashCode();
            Type type = this.f72300a;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f72302c;
            if (typeArr.length == 0) {
                return c0.u(this.f72301b);
            }
            StringBuilder sb5 = new StringBuilder((typeArr.length + 1) * 30);
            sb5.append(c0.u(this.f72301b));
            sb5.append("<");
            sb5.append(c0.u(this.f72302c[0]));
            for (int i15 = 1; i15 < this.f72302c.length; i15++) {
                sb5.append(", ");
                sb5.append(c0.u(this.f72302c[i15]));
            }
            sb5.append(">");
            return sb5.toString();
        }
    }

    private static final class c implements WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f72303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f72304b;

        c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                c0.b(typeArr[0]);
                this.f72304b = null;
                this.f72303a = typeArr[0];
                return;
            }
            typeArr2[0].getClass();
            c0.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f72304b = typeArr2[0];
            this.f72303a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && c0.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f72304b;
            return type != null ? new Type[]{type} : c0.f72297a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f72303a};
        }

        public int hashCode() {
            Type type = this.f72304b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f72303a.hashCode() + 31);
        }

        public String toString() {
            if (this.f72304b != null) {
                return "? super " + c0.u(this.f72304b);
            }
            if (this.f72303a == Object.class) {
                return "?";
            }
            return "? extends " + c0.u(this.f72303a);
        }
    }

    static e0 a(e0 e0Var) {
        vv.e eVar = new vv.e();
        e0Var.getF67345e().A0(eVar);
        return e0.y(e0Var.getF67343c(), e0Var.getF67344d(), eVar);
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    private static Class<?> c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i15 = 0; i15 < length; i15++) {
                Class<?> cls3 = interfaces[i15];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i15];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return e(cls.getGenericInterfaces()[i15], interfaces[i15], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type f(int i15, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i15];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    static Type g(int i15, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i15 >= 0 && i15 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i15];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i15 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    static Class<?> h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return r(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    private static int k(Object[] objArr, Object obj) {
        for (int i15 = 0; i15 < objArr.length; i15++) {
            if (obj.equals(objArr[i15])) {
                return i15;
            }
        }
        throw new NoSuchElementException();
    }

    static boolean l(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static boolean m(Type type) {
        return f72298b && type == i0.class;
    }

    static RuntimeException n(Method method, String str, Object... objArr) {
        return o(method, null, str, objArr);
    }

    static RuntimeException o(Method method, Throwable th4, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th4);
    }

    static RuntimeException p(Method method, int i15, String str, Object... objArr) {
        return n(method, str + " (" + t.f72419b.a(method, i15) + ")", objArr);
    }

    static RuntimeException q(Method method, Throwable th4, int i15, String str, Object... objArr) {
        return o(method, th4, str + " (" + t.f72419b.a(method, i15) + ")", objArr);
    }

    static Type r(Type type, Class<?> cls, Type type2) {
        Type type3;
        WildcardType wildcardType;
        Type typeR;
        Type type4 = type2;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typeS = s(type, cls, typeVariable);
            if (typeS == typeVariable) {
                return typeS;
            }
            type4 = typeS;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeR2 = r(type, cls, componentType);
                return componentType == typeR2 ? cls2 : new a(typeR2);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeR3 = r(type, cls, genericComponentType);
            return genericComponentType == typeR3 ? genericArrayType : new a(typeR3);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeR4 = r(type, cls, ownerType);
            boolean z15 = typeR4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i15 = 0; i15 < length; i15++) {
                Type typeR5 = r(type, cls, actualTypeArguments[i15]);
                if (typeR5 != actualTypeArguments[i15]) {
                    if (!z15) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z15 = true;
                    }
                    actualTypeArguments[i15] = typeR5;
                }
            }
            return z15 ? new b(typeR4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type4 instanceof WildcardType) {
            wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeR6 = r(type, cls, lowerBounds[0]);
                if (typeR6 != lowerBounds[0]) {
                    type3 = type4;
                    type3 = wildcardType;
                    return new c(new Type[]{Object.class}, new Type[]{typeR6});
                }
            } else if (upperBounds.length == 1 && (typeR = r(type, cls, upperBounds[0])) != upperBounds[0]) {
                type3 = type4;
                type3 = wildcardType;
                type3 = wildcardType;
                return new c(new Type[]{typeR}, f72297a);
            }
        }
        type3 = type4;
        type3 = wildcardType;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        type3 = wildcardType;
        type3 = type4;
        return type3;
    }

    private static Type s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsC = c(typeVariable);
        if (clsC != null) {
            Type typeE = e(type, cls, clsC);
            if (typeE instanceof ParameterizedType) {
                return ((ParameterizedType) typeE).getActualTypeArguments()[k(clsC.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    static void t(Throwable th4) {
        if (th4 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th4);
        }
        if (th4 instanceof ThreadDeath) {
            throw ((ThreadDeath) th4);
        }
        if (th4 instanceof LinkageError) {
            throw ((LinkageError) th4);
        }
    }

    static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
