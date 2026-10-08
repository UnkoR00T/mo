package qe;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ve.j;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f166157a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0.a<j, List<Class<?>>> f166158b = new r0.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f166157a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f166158b) {
            list = this.f166158b.get(andSet);
        }
        this.f166157a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f166158b) {
            this.f166158b.put(new j(cls, cls2, cls3), list);
        }
    }
}
