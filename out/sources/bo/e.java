package bo;

import ao.w;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import yn.a0;
import yn.s;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a0 f20473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a0 f20474d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f20475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, a0> f20476b = new ConcurrentHashMap();

    private static class b implements a0 {
        private b() {
        }

        @Override // yn.a0
        public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f20473c = new b();
        f20474d = new b();
    }

    public e(w wVar) {
        this.f20475a = wVar;
    }

    private static Object a(w wVar, Class<?> cls) {
        return wVar.v(go.a.a(cls)).a();
    }

    private static zn.b c(Class<?> cls) {
        return (zn.b) cls.getAnnotation(zn.b.class);
    }

    private a0 f(Class<?> cls, a0 a0Var) {
        a0 a0VarPutIfAbsent = this.f20476b.putIfAbsent(cls, a0Var);
        return a0VarPutIfAbsent != null ? a0VarPutIfAbsent : a0Var;
    }

    @Override // yn.a0
    public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
        zn.b bVarC = c(aVar.d());
        if (bVarC == null) {
            return null;
        }
        return (z<T>) d(this.f20475a, fVar, aVar, bVarC, true);
    }

    z<?> d(w wVar, yn.f fVar, go.a<?> aVar, zn.b bVar, boolean z15) {
        z<?> zVarB;
        Object objA = a(wVar, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objA instanceof z) {
            zVarB = (z) objA;
        } else if (objA instanceof a0) {
            a0 a0VarF = (a0) objA;
            if (z15) {
                a0VarF = f(aVar.d(), a0VarF);
            }
            zVarB = a0VarF.b(fVar, aVar);
        } else {
            boolean z16 = objA instanceof s;
            if (!z16 && !(objA instanceof yn.k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            n nVar = new n(z16 ? (s) objA : null, objA instanceof yn.k ? (yn.k) objA : null, fVar, aVar, z15 ? f20473c : f20474d, zNullSafe);
            zNullSafe = false;
            zVarB = nVar;
        }
        return (zVarB == null || !zNullSafe) ? zVarB : zVarB.a();
    }

    public boolean e(go.a<?> aVar, a0 a0Var) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(a0Var);
        if (a0Var == f20473c) {
            return true;
        }
        Class<? super Object> clsD = aVar.d();
        a0 a0Var2 = this.f20476b.get(clsD);
        if (a0Var2 != null) {
            return a0Var2 == a0Var;
        }
        zn.b bVarC = c(clsD);
        if (bVarC == null) {
            return false;
        }
        Class<?> clsValue = bVarC.value();
        return a0.class.isAssignableFrom(clsValue) && f(clsD, (a0) a(this.f20475a, clsValue)) == a0Var;
    }
}
