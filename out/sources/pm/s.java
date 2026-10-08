package pm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class s extends PhantomReference implements a.InterfaceC3959a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f160882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f160883b;

    /* synthetic */ s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, r rVar) {
        super(obj, referenceQueue);
        this.f160882a = set;
        this.f160883b = runnable;
    }

    @Override // pm.a.InterfaceC3959a
    public final void a() {
        if (this.f160882a.remove(this)) {
            clear();
            this.f160883b.run();
        }
    }
}
