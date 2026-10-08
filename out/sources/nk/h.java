package nk;

import fk.v;
import fk.w;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static h f137055b = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<n> f137056a = new AtomicReference<>(new n.b().c());

    h() {
    }

    public static h c() {
        return f137055b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) {
        return this.f137056a.get().c(cls);
    }

    public <KeyT extends fk.g, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.f137056a.get().d(keyt, cls);
    }

    public synchronized <KeyT extends fk.g, PrimitiveT> void d(l<KeyT, PrimitiveT> lVar) {
        this.f137056a.set(new n.b(this.f137056a.get()).d(lVar).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(w<InputPrimitiveT, WrapperPrimitiveT> wVar) {
        this.f137056a.set(new n.b(this.f137056a.get()).e(wVar).c());
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(v<InputPrimitiveT> vVar, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.f137056a.get().e(vVar, cls);
    }
}
