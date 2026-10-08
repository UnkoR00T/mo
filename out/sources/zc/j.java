package zc;

import androidx.p016lifecycle.DefaultLifecycleObserver;
import ju.d2;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lzc/j;", "Lzc/o;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/j;", "lifecycle", "Lju/d2;", "job", "<init>", "(Landroidx/lifecycle/j;Lju/d2;)V", "Loq/i0;", "start", "()V", "a", "(Ltq/e;)Ljava/lang/Object;", "y", "d", "Landroidx/lifecycle/q;", "owner", "onDestroy", "(Landroidx/lifecycle/q;)V", "Landroidx/lifecycle/j;", "b", "Lju/d2;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements o, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.j lifecycle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d2 job;

    public j(androidx.p016lifecycle.j jVar, d2 d2Var) {
        this.lifecycle = jVar;
        this.job = d2Var;
    }

    @Override // zc.o
    public Object a(tq.e<? super i0> eVar) throws Throwable {
        Object objA = ed.r.a(this.lifecycle, eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    public void d() {
        d2.a.a(this.job, null, 1, null);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.p016lifecycle.q owner) {
        d();
    }

    @Override // zc.o
    public void start() {
        this.lifecycle.a(this);
    }

    @Override // zc.o
    public void y() {
        this.lifecycle.d(this);
    }
}
