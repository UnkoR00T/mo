package zc;

import androidx.p016lifecycle.DefaultLifecycleObserver;
import java.util.concurrent.CancellationException;
import ju.d2;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, d2 = {"Lzc/t;", "Lzc/o;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkc/s;", "imageLoader", "Lzc/f;", "initialRequest", "Lbd/b;", "target", "Landroidx/lifecycle/j;", "lifecycle", "Lju/d2;", "job", "<init>", "(Lkc/s;Lzc/f;Lbd/b;Landroidx/lifecycle/j;Lju/d2;)V", "Loq/i0;", "e", "()V", "c", "start", "a", "(Ltq/e;)Ljava/lang/Object;", "d", "Landroidx/lifecycle/q;", "owner", "onDestroy", "(Landroidx/lifecycle/q;)V", "Lkc/s;", "b", "Lzc/f;", "Lbd/b;", "Landroidx/lifecycle/j;", "Lju/d2;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements o, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kc.s imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImageRequest initialRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bd.b<?> target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.j lifecycle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d2 job;

    public t(kc.s sVar, ImageRequest imageRequest, bd.b<?> bVar, androidx.p016lifecycle.j jVar, d2 d2Var) {
        this.imageLoader = sVar;
        this.initialRequest = imageRequest;
        this.target = bVar;
        this.lifecycle = jVar;
        this.job = d2Var;
    }

    @Override // zc.o
    public Object a(tq.e<? super i0> eVar) {
        Object objA;
        androidx.p016lifecycle.j jVar = this.lifecycle;
        return (jVar == null || (objA = ed.r.a(jVar, eVar)) != uq.b.e()) ? i0.f148189a : objA;
    }

    @Override // zc.o
    public void c() {
        if (this.target.m().isAttachedToWindow()) {
            return;
        }
        v.a(this.target.m()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    public void d() {
        androidx.p016lifecycle.j jVar;
        d2.a.a(this.job, null, 1, null);
        bd.b<?> bVar = this.target;
        if ((bVar instanceof androidx.p016lifecycle.p) && (jVar = this.lifecycle) != null) {
            jVar.d((androidx.p016lifecycle.p) bVar);
        }
        androidx.p016lifecycle.j jVar2 = this.lifecycle;
        if (jVar2 != null) {
            jVar2.d(this);
        }
    }

    public final void e() {
        this.imageLoader.c(this.initialRequest);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.p016lifecycle.q owner) {
        v.a(this.target.m()).a();
    }

    @Override // zc.o
    public void start() {
        androidx.p016lifecycle.j jVar;
        androidx.p016lifecycle.j jVar2 = this.lifecycle;
        if (jVar2 != null) {
            jVar2.a(this);
        }
        bd.b<?> bVar = this.target;
        if ((bVar instanceof androidx.p016lifecycle.p) && (jVar = this.lifecycle) != null) {
            ed.r.b(jVar, (androidx.p016lifecycle.p) bVar);
        }
        v.a(this.target.m()).c(this);
    }
}
