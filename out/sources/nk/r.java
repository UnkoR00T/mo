package nk;

import fk.u;
import fk.y;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<d, nk.c<?, ?>> f137082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<c, nk.b<?>> f137083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<d, k<?, ?>> f137084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<c, j<?>> f137085d;

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends q> f137090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final uk.a f137091b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f137090a.equals(this.f137090a) && cVar.f137091b.equals(this.f137091b);
        }

        public int hashCode() {
            return Objects.hash(this.f137090a, this.f137091b);
        }

        public String toString() {
            return this.f137090a.getSimpleName() + ", object identifier: " + this.f137091b;
        }

        private c(Class<? extends q> cls, uk.a aVar) {
            this.f137090a = cls;
            this.f137091b = aVar;
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f137092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<? extends q> f137093b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f137092a.equals(this.f137092a) && dVar.f137093b.equals(this.f137093b);
        }

        public int hashCode() {
            return Objects.hash(this.f137092a, this.f137093b);
        }

        public String toString() {
            return this.f137092a.getSimpleName() + " with serialization type: " + this.f137093b.getSimpleName();
        }

        private d(Class<?> cls, Class<? extends q> cls2) {
            this.f137092a = cls;
            this.f137093b = cls2;
        }
    }

    public <SerializationT extends q> boolean e(SerializationT serializationt) {
        return this.f137083b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends q> fk.g f(SerializationT serializationt, y yVar) throws GeneralSecurityException {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f137083b.containsKey(cVar)) {
            return this.f137083b.get(cVar).d(serializationt, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    private r(b bVar) {
        this.f137082a = new HashMap(bVar.f137086a);
        this.f137083b = new HashMap(bVar.f137087b);
        this.f137084c = new HashMap(bVar.f137088c);
        this.f137085d = new HashMap(bVar.f137089d);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<d, nk.c<?, ?>> f137086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<c, nk.b<?>> f137087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<d, k<?, ?>> f137088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<c, j<?>> f137089d;

        public b() {
            this.f137086a = new HashMap();
            this.f137087b = new HashMap();
            this.f137088c = new HashMap();
            this.f137089d = new HashMap();
        }

        r e() {
            return new r(this);
        }

        public <SerializationT extends q> b f(nk.b<SerializationT> bVar) throws GeneralSecurityException {
            c cVar = new c(bVar.c(), bVar.b());
            if (!this.f137087b.containsKey(cVar)) {
                this.f137087b.put(cVar, bVar);
                return this;
            }
            nk.b<?> bVar2 = this.f137087b.get(cVar);
            if (bVar2.equals(bVar) && bVar.equals(bVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <KeyT extends fk.g, SerializationT extends q> b g(nk.c<KeyT, SerializationT> cVar) throws GeneralSecurityException {
            d dVar = new d(cVar.b(), cVar.c());
            if (!this.f137086a.containsKey(dVar)) {
                this.f137086a.put(dVar, cVar);
                return this;
            }
            nk.c<?, ?> cVar2 = this.f137086a.get(dVar);
            if (cVar2.equals(cVar) && cVar.equals(cVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public <SerializationT extends q> b h(j<SerializationT> jVar) throws GeneralSecurityException {
            c cVar = new c(jVar.c(), jVar.b());
            if (!this.f137089d.containsKey(cVar)) {
                this.f137089d.put(cVar, jVar);
                return this;
            }
            j<?> jVar2 = this.f137089d.get(cVar);
            if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <ParametersT extends u, SerializationT extends q> b i(k<ParametersT, SerializationT> kVar) throws GeneralSecurityException {
            d dVar = new d(kVar.b(), kVar.c());
            if (!this.f137088c.containsKey(dVar)) {
                this.f137088c.put(dVar, kVar);
                return this;
            }
            k<?, ?> kVar2 = this.f137088c.get(dVar);
            if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(r rVar) {
            this.f137086a = new HashMap(rVar.f137082a);
            this.f137087b = new HashMap(rVar.f137083b);
            this.f137088c = new HashMap(rVar.f137084c);
            this.f137089d = new HashMap(rVar.f137085d);
        }
    }
}
