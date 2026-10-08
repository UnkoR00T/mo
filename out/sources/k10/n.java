package k10;

import ju.h2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000f"}, d2 = {"Lk10/n;", "", "Lju/a0;", "job", "a", "(Lju/a0;)Lju/a0;", "Loq/i0;", "e", "(Lju/a0;)V", "", "f", "(Lju/a0;)Ljava/lang/String;", "", "d", "(Lju/a0;)I", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static ju.a0 a(ju.a0 a0Var) {
        return a0Var;
    }

    public static /* synthetic */ ju.a0 b(ju.a0 a0Var, int i15, fr.k kVar) {
        if ((i15 & 1) != 0) {
            a0Var = h2.b(null, 1, null);
        }
        return a(a0Var);
    }

    public static final boolean c(ju.a0 a0Var, ju.a0 a0Var2) {
        return fr.t.c(a0Var, a0Var2);
    }

    public static int d(ju.a0 a0Var) {
        return a0Var.hashCode();
    }

    public static final void e(ju.a0 a0Var) {
        a0Var.y();
    }

    public static String f(ju.a0 a0Var) {
        return "CoroutineWaiter(job=" + a0Var + ')';
    }
}
