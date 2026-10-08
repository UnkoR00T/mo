package fk;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f64357b = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, b> f64358a;

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ nk.d f64359a;

        a(nk.d dVar) {
            this.f64359a = dVar;
        }

        @Override // fk.j.b
        public Class<?> a() {
            return this.f64359a.getClass();
        }

        @Override // fk.j.b
        public Set<Class<?>> b() {
            return this.f64359a.i();
        }

        @Override // fk.j.b
        public <Q> h<Q> c(Class<Q> cls) throws GeneralSecurityException {
            try {
                return new i(this.f64359a, cls);
            } catch (IllegalArgumentException e15) {
                throw new GeneralSecurityException("Primitive type not supported", e15);
            }
        }

        @Override // fk.j.b
        public h<?> d() {
            nk.d dVar = this.f64359a;
            return new i(dVar, dVar.b());
        }
    }

    private interface b {
        Class<?> a();

        Set<Class<?>> b();

        <P> h<P> c(Class<P> cls);

        h<?> d();
    }

    j(j jVar) {
        this.f64358a = new ConcurrentHashMap(jVar.f64358a);
    }

    private static <T> T a(T t15) {
        t15.getClass();
        return t15;
    }

    private static <KeyProtoT extends r0> b b(nk.d<KeyProtoT> dVar) {
        return new a(dVar);
    }

    private synchronized b d(String str) {
        if (!this.f64358a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.f64358a.get(str);
    }

    private <P> h<P> e(String str, Class<P> cls) throws GeneralSecurityException {
        b bVarD = d(str);
        if (cls == null) {
            return (h<P>) bVarD.d();
        }
        if (bVarD.b().contains(cls)) {
            return bVarD.c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + bVarD.a() + ", supported primitives: " + i(bVarD.b()));
    }

    private synchronized <P> void h(b bVar, boolean z15) {
        try {
            String strB = bVar.d().b();
            b bVar2 = this.f64358a.get(strB);
            if (bVar2 != null && !bVar2.a().equals(bVar.a())) {
                f64357b.warning("Attempted overwrite of a registered key manager for key type " + strB);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strB, bVar2.a().getName(), bVar.a().getName()));
            }
            if (z15) {
                this.f64358a.put(strB, bVar);
            } else {
                this.f64358a.putIfAbsent(strB, bVar);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private static String i(Set<Class<?>> set) {
        StringBuilder sb5 = new StringBuilder();
        boolean z15 = true;
        for (Class<?> cls : set) {
            if (!z15) {
                sb5.append(", ");
            }
            sb5.append(cls.getCanonicalName());
            z15 = false;
        }
        return sb5.toString();
    }

    <P> h<P> c(String str, Class<P> cls) {
        return e(str, (Class) a(cls));
    }

    h<?> f(String str) {
        return d(str).d();
    }

    synchronized <KeyProtoT extends r0> void g(nk.d<KeyProtoT> dVar) {
        if (!dVar.a().b()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    boolean j(String str) {
        return this.f64358a.containsKey(str);
    }

    j() {
        this.f64358a = new ConcurrentHashMap();
    }
}
