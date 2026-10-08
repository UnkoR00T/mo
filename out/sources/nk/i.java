package nk;

import fk.u;
import fk.y;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f137057b = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<r> f137058a = new AtomicReference<>(new r.b().e());

    public static i a() {
        return f137057b;
    }

    public <SerializationT extends q> boolean b(SerializationT serializationt) {
        return this.f137058a.get().e(serializationt);
    }

    public <SerializationT extends q> fk.g c(SerializationT serializationt, y yVar) {
        return this.f137058a.get().f(serializationt, yVar);
    }

    public fk.g d(o oVar, y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, yVar);
        }
        try {
            return new e(oVar, yVar);
        } catch (GeneralSecurityException e15) {
            throw new s("Creating a LegacyProtoKey failed", e15);
        }
    }

    public synchronized <SerializationT extends q> void e(b<SerializationT> bVar) {
        this.f137058a.set(new r.b(this.f137058a.get()).f(bVar).e());
    }

    public synchronized <KeyT extends fk.g, SerializationT extends q> void f(c<KeyT, SerializationT> cVar) {
        this.f137058a.set(new r.b(this.f137058a.get()).g(cVar).e());
    }

    public synchronized <SerializationT extends q> void g(j<SerializationT> jVar) {
        this.f137058a.set(new r.b(this.f137058a.get()).h(jVar).e());
    }

    public synchronized <ParametersT extends u, SerializationT extends q> void h(k<ParametersT, SerializationT> kVar) {
        this.f137058a.set(new r.b(this.f137058a.get()).i(kVar).e());
    }
}
