package nk;

import fk.v;
import fk.w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<c, l<?, ?>> f137069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, w<?, ?>> f137070b;

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f137073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<?> f137074b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f137073a.equals(this.f137073a) && cVar.f137074b.equals(this.f137074b);
        }

        public int hashCode() {
            return Objects.hash(this.f137073a, this.f137074b);
        }

        public String toString() {
            return this.f137073a.getSimpleName() + " with primitive type: " + this.f137074b.getSimpleName();
        }

        private c(Class<?> cls, Class<?> cls2) {
            this.f137073a = cls;
            this.f137074b = cls2;
        }
    }

    public Class<?> c(Class<?> cls) throws GeneralSecurityException {
        if (this.f137070b.containsKey(cls)) {
            return this.f137070b.get(cls).b();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends fk.g, PrimitiveT> PrimitiveT d(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f137069a.containsKey(cVar)) {
            return (PrimitiveT) this.f137069a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT e(v<InputPrimitiveT> vVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.f137070b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        w<?, ?> wVar = this.f137070b.get(cls);
        if (vVar.g().equals(wVar.b()) && wVar.b().equals(vVar.g())) {
            return (WrapperPrimitiveT) wVar.a(vVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    private n(b bVar) {
        this.f137069a = new HashMap(bVar.f137071a);
        this.f137070b = new HashMap(bVar.f137072b);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<c, l<?, ?>> f137071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, w<?, ?>> f137072b;

        public b() {
            this.f137071a = new HashMap();
            this.f137072b = new HashMap();
        }

        n c() {
            return new n(this);
        }

        public <KeyT extends fk.g, PrimitiveT> b d(l<KeyT, PrimitiveT> lVar) throws GeneralSecurityException {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (!this.f137071a.containsKey(cVar)) {
                this.f137071a.put(cVar, lVar);
                return this;
            }
            l<?, ?> lVar2 = this.f137071a.get(cVar);
            if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        public <InputPrimitiveT, WrapperPrimitiveT> b e(w<InputPrimitiveT, WrapperPrimitiveT> wVar) throws GeneralSecurityException {
            if (wVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> clsC = wVar.c();
            if (!this.f137072b.containsKey(clsC)) {
                this.f137072b.put(clsC, wVar);
                return this;
            }
            w<?, ?> wVar2 = this.f137072b.get(clsC);
            if (wVar2.equals(wVar) && wVar.equals(wVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsC);
        }

        public b(n nVar) {
            this.f137071a = new HashMap(nVar.f137069a);
            this.f137072b = new HashMap(nVar.f137070b);
        }
    }
}
