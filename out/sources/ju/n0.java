package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltq/i;", "context", "", "exception", "Loq/i0;", "a", "(Ltq/i;Ljava/lang/Throwable;)V", "originalException", "thrownException", "b", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n0 {
    public static final void a(tq.i iVar, Throwable th4) {
        if (th4 instanceof b1) {
            th4 = ((b1) th4).getCause();
        }
        try {
            m0 m0Var = (m0) iVar.m(m0.INSTANCE);
            if (m0Var != null) {
                m0Var.i1(iVar, th4);
            } else {
                ou.g.a(iVar, th4);
            }
        } catch (Throwable th5) {
            ou.g.a(iVar, b(th4, th5));
        }
    }

    public static final Throwable b(Throwable th4, Throwable th5) {
        if (th4 == th5) {
            return th4;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th5);
        oq.c.a(runtimeException, th4);
        return runtimeException;
    }
}
