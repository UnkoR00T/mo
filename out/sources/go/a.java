package go;

import ao.b;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? super T> f75084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f75085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f75086c;

    private a(Type type) {
        Objects.requireNonNull(type);
        Type typeB = b.b(type);
        this.f75085b = typeB;
        this.f75084a = (Class<? super T>) b.k(typeB);
        this.f75086c = typeB.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    public static a<?> c(Type type, Type... typeArr) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(typeArr);
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type);
        }
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        if (typeArr.length == 0) {
            return a(cls);
        }
        if (b.o(type)) {
            throw new IllegalArgumentException("Raw type " + cls.getName() + " is not supported because it requires specifying an owner type");
        }
        for (int i15 = 0; i15 < length; i15++) {
            Type type2 = typeArr[i15];
            Objects.requireNonNull(type2, "Type argument must not be null");
            Type type3 = type2;
            Class<?> clsK = b.k(type3);
            TypeVariable<Class<T>> typeVariable = typeParameters[i15];
            for (Type type4 : typeVariable.getBounds()) {
                if (!b.k(type4).isAssignableFrom(clsK)) {
                    throw new IllegalArgumentException("Type argument " + type3 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new a<>(b.n(null, cls, typeArr));
    }

    public final Class<? super T> d() {
        return this.f75084a;
    }

    public final Type e() {
        return this.f75085b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f75085b, ((a) obj).f75085b);
    }

    public final int hashCode() {
        return this.f75086c;
    }

    public final String toString() {
        return b.u(this.f75085b);
    }
}
