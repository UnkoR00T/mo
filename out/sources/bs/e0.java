package bs;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 implements qs.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21231a = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final e0 a(Type type) {
            boolean z15 = type instanceof Class;
            if (z15) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new c0(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z15 && ((Class) type).isArray())) {
                return new m(type);
            }
            return type instanceof WildcardType ? new h0((WildcardType) type) : new s(type);
        }

        private a() {
        }
    }

    @Override // qs.d
    public qs.a H(zs.c cVar) {
        Object obj;
        Object next;
        zs.b bVarI;
        Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                bVarI = ((qs.a) next).i();
            }
            return (qs.a) obj;
        } while (!fr.t.c(bVarI != null ? bVarI.a() : null, cVar));
        obj = next;
        return (qs.a) obj;
    }

    protected abstract Type T();

    public boolean equals(Object obj) {
        return (obj instanceof e0) && fr.t.c(T(), ((e0) obj).T());
    }

    public int hashCode() {
        return T().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + T();
    }
}
