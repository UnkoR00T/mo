package qe;

import be.i;
import be.t;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import ne.g;
import ve.j;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t<?, ?, ?> f166154c = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0.a<j, t<?, ?, ?>> f166155a = new r0.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<j> f166156b = new AtomicReference<>();

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f166156b.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f166155a) {
            tVar = (t) this.f166155a.get(jVarB);
        }
        this.f166156b.set(jVarB);
        return tVar;
    }

    public boolean c(t<?, ?, ?> tVar) {
        return f166154c.equals(tVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f166155a) {
            r0.a<j, t<?, ?, ?>> aVar = this.f166155a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f166154c;
            }
            aVar.put(jVar, tVar);
        }
    }
}
