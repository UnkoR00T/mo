package w0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\r\u001a\u0004\u0018\u00010\u0000*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lw0/v0;", "gestureConnection", "Lg4/g;", "b", "(Lw0/v0;)Lg4/g;", "Lkotlin/Function1;", "", "block", "Loq/i0;", "d", "(Lg4/g;Ler/l;)V", "c", "(Lg4/g;)Lw0/v0;", "parentGestureConnection", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y0 {
    public static final g4.g b(v0 v0Var) {
        return new w0(v0Var);
    }

    public static final v0 c(g4.g gVar) {
        g4.q1 q1VarA = g4.r1.a(gVar, w0.INSTANCE);
        w0 w0Var = q1VarA instanceof w0 ? (w0) q1VarA : null;
        if (w0Var != null) {
            return w0Var.getGestureConnection();
        }
        return null;
    }

    public static final void d(g4.g gVar, final er.l<? super v0, Boolean> lVar) {
        g4.r1.c(gVar, w0.INSTANCE, new er.l() { // from class: w0.x0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(y0.e(lVar, (g4.q1) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(er.l lVar, g4.q1 q1Var) {
        if (q1Var instanceof w0) {
            return ((Boolean) lVar.b(((w0) q1Var).getGestureConnection())).booleanValue();
        }
        throw new IllegalStateException("Node is not a GestureNode instance");
    }
}
