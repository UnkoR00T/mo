package ju;

import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lju/d1;", "T", "Lqu/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "k", "()Ljava/lang/Object;", "takenState", "", "cause", "Loq/i0;", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "j", "(Ljava/lang/Throwable;)V", "c", "I", "Ltq/e;", "b", "()Ltq/e;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d1<T> extends qu.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int resumeMode;

    public d1(int i15) {
        this.resumeMode = i15;
    }

    public void a(Object takenState, Throwable cause) {
    }

    public abstract tq.e<T> b();

    public Throwable d(Object state) {
        c0 c0Var = state instanceof c0 ? (c0) state : null;
        if (c0Var != null) {
            return c0Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object state) {
        return state;
    }

    public final void j(Throwable exception) {
        n0.a(b().getContext(), new s0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ou.i iVar = (ou.i) b();
            tq.e<T> eVar = iVar.continuation;
            Object obj = iVar.countOrElement;
            tq.i iVarC = eVar.getContext();
            Object objI = ou.l0.i(iVarC, obj);
            d2 d2Var = null;
            i3<?> i3VarM = objI != ou.l0.f150053a ? j0.m(eVar, iVarC, objI) : null;
            try {
                tq.i iVarC2 = eVar.getContext();
                Object objK = k();
                Throwable thD = d(objK);
                if (thD == null && e1.b(this.resumeMode)) {
                    d2Var = (d2) iVarC2.m(d2.INSTANCE);
                }
                if (d2Var != null && !d2Var.h()) {
                    CancellationException cancellationExceptionN = d2Var.N();
                    a(objK, cancellationExceptionN);
                    oq.t.Companion companion = oq.t.INSTANCE;
                    eVar.i(oq.t.b(oq.u.a(cancellationExceptionN)));
                } else if (thD != null) {
                    oq.t.Companion companion2 = oq.t.INSTANCE;
                    eVar.i(oq.t.b(oq.u.a(thD)));
                } else {
                    oq.t.Companion companion3 = oq.t.INSTANCE;
                    eVar.i(oq.t.b(f(objK)));
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } finally {
                if (i3VarM == null || i3VarM.q1()) {
                    ou.l0.f(iVarC, objI);
                }
            }
        } catch (b1 e15) {
            n0.a(b().getContext(), e15.getCause());
        } catch (Throwable th4) {
            j(th4);
        }
    }
}
