package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JG\u0010*\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0004\b*\u0010+R\u001d\u00101\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b,\u0010.R\u0014\u00103\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0014\u00106\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lju/a;", "T", "Lju/j2;", "Lju/d2;", "Ltq/e;", "Lju/p0;", "Ltq/i;", "parentContext", "", "initParentJob", "active", "<init>", "(Ltq/i;ZZ)V", "value", "Loq/i0;", "m1", "(Ljava/lang/Object;)V", "", "cause", "handled", "l1", "(Ljava/lang/Throwable;Z)V", "", "Y", "()Ljava/lang/String;", "", "state", "P0", "Loq/t;", "result", "i", "k1", "exception", "x0", "(Ljava/lang/Throwable;)V", "I0", "R", "Lju/r0;", "start", "receiver", "Lkotlin/Function2;", "block", "n1", "(Lju/r0;Ljava/lang/Object;Ler/p;)V", "c", "Ltq/i;", "()Ltq/i;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "h", "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> extends j2 implements d2, tq.e<T>, p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tq.i context;

    public a(tq.i iVar, boolean z15, boolean z16) {
        super(z16);
        if (z15) {
            y0((d2) iVar.m(d2.INSTANCE));
        }
        this.context = iVar.n0(this);
    }

    @Override // ju.j2
    public String I0() {
        String strG = j0.g(this.context);
        if (strG == null) {
            return super.I0();
        }
        return '\"' + strG + "\":" + super.I0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ju.j2
    protected final void P0(Object state) {
        if (!(state instanceof c0)) {
            m1(state);
        } else {
            c0 c0Var = (c0) state;
            l1(c0Var.cause, c0Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ju.j2
    public String Y() {
        return t0.a(this) + " was cancelled";
    }

    @Override // tq.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final tq.i getContext() {
        return this.context;
    }

    @Override // ju.p0
    public tq.i getCoroutineContext() {
        return this.context;
    }

    @Override // ju.j2, ju.d2
    public boolean h() {
        return super.h();
    }

    @Override // tq.e
    public final void i(Object result) {
        Object objG0 = G0(e0.b(result));
        if (objG0 == k2.f105735b) {
            return;
        }
        k1(objG0);
    }

    protected void k1(Object state) {
        z(state);
    }

    protected void l1(Throwable cause, boolean handled) {
    }

    protected void m1(T value) {
    }

    public final <R> void n1(r0 start, R receiver, er.p<? super R, ? super tq.e<? super T>, ? extends Object> block) {
        start.e(block, receiver, this);
    }

    @Override // ju.j2
    public final void x0(Throwable exception) {
        n0.a(this.context, exception);
    }
}
