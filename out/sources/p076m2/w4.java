package p076m2;

import e3.g;
import e3.k;
import ju.a0;
import ju.d2;
import ju.g2;
import ju.m0;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import tq.a;
import tq.i;
import tq.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lm2/w4;", "Lju/p0;", "Lm2/u4;", "Ltq/i;", "parentContext", "overlayContext", "<init>", "(Ltq/i;Ltq/i;)V", "Loq/i0;", "f", "()V", "c", "e", "d", "a", "Ltq/i;", "b", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "lock", "_coroutineContext", "getCoroutineContext", "()Ltq/i;", "coroutineContext", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w4 implements p0, u4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123222f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f123223g = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i parentContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i overlayContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile i _coroutineContext;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"m2/w4$b", "Ltq/a;", "Lju/m0;", "Ltq/i;", "context", "", "exception", "Loq/i0;", "i1", "(Ltq/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a implements m0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f123228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w4 f123229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m0.Companion companion, k kVar, w4 w4Var) {
            super(companion);
            this.f123228b = kVar;
            this.f123229c = w4Var;
        }

        @Override // ju.m0
        public void i1(i context, Throwable exception) throws Throwable {
            this.f123228b.a(exception, this.f123229c);
            i iVar = this.f123229c.overlayContext;
            m0.Companion companion = m0.INSTANCE;
            m0 m0Var = (m0) iVar.m(companion);
            if (m0Var != null) {
                m0Var.i1(context, exception);
                return;
            }
            m0 m0Var2 = (m0) this.f123229c.parentContext.m(companion);
            if (m0Var2 == null) {
                throw exception;
            }
            m0Var2.i1(context, exception);
        }
    }

    public w4(i iVar, i iVar2) {
        this.parentContext = iVar;
        this.overlayContext = iVar2;
    }

    @Override // p076m2.u4
    public void c() {
    }

    @Override // p076m2.u4
    public void d() {
        f();
    }

    @Override // p076m2.u4
    public void e() {
        f();
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                i iVar = this._coroutineContext;
                if (iVar == null) {
                    this._coroutineContext = f123223g;
                } else {
                    g2.d(iVar, new x0());
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // ju.p0
    public i getCoroutineContext() {
        i iVarN0;
        i iVar = this._coroutineContext;
        if (iVar != null && iVar != f123223g) {
            return iVar;
        }
        k kVar = (k) this.parentContext.m(k.INSTANCE);
        i bVar = kVar != null ? new b(m0.INSTANCE, kVar, this) : j.f191408a;
        synchronized (this.lock) {
            try {
                iVarN0 = this._coroutineContext;
                if (iVarN0 == null) {
                    i iVar2 = this.parentContext;
                    iVarN0 = iVar2.n0(g2.a((d2) iVar2.m(d2.INSTANCE))).n0(this.overlayContext).n0(bVar);
                } else if (iVarN0 == f123223g) {
                    i iVar3 = this.parentContext;
                    a0 a0VarA = g2.a((d2) iVar3.m(d2.INSTANCE));
                    a0VarA.u(new x0());
                    iVarN0 = iVar3.n0(a0VarA).n0(this.overlayContext).n0(bVar);
                    if (g.isVerboseTracingEnabled) {
                        iVarN0 = iVarN0.n0(x4.f123254c);
                    }
                }
                this._coroutineContext = iVarN0;
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return iVarN0;
    }
}
