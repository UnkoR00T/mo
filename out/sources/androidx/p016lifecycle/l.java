package androidx.p016lifecycle;

import er.p;
import ju.g1;
import ju.h2;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/j;", "lifecycle", "Ltq/i;", "coroutineContext", "<init>", "(Landroidx/lifecycle/j;Ltq/i;)V", "Loq/i0;", "b", "()V", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "a", "Landroidx/lifecycle/j;", "()Landroidx/lifecycle/j;", "Ltq/i;", "getCoroutineContext", "()Ltq/i;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j lifecycle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i coroutineContext;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f12793f;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b.e();
            if (this.f12792e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            p0 p0Var = (p0) this.f12793f;
            if (l.this.getLifecycle().getState().compareTo(j.b.INITIALIZED) >= 0) {
                l.this.getLifecycle().a(l.this);
            } else {
                h2.f(p0Var.getCoroutineContext(), null, 1, null);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = l.this.new a(eVar);
            aVar.f12793f = obj;
            return aVar;
        }
    }

    public l(j jVar, i iVar) {
        this.lifecycle = jVar;
        this.coroutineContext = iVar;
        if (getLifecycle().getState() == j.b.DESTROYED) {
            h2.f(getCoroutineContext(), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public j getLifecycle() {
        return this.lifecycle;
    }

    public final void b() {
        ju.k.d(this, g1.c().j2(), null, new a(null), 2, null);
    }

    @Override // ju.p0
    public i getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.p016lifecycle.n
    public void m(q source, j.a event) {
        if (getLifecycle().getState().compareTo(j.b.DESTROYED) <= 0) {
            getLifecycle().d(this);
            h2.f(getCoroutineContext(), null, 1, null);
        }
    }
}
