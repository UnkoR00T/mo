package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll3/t0;", "focusability", "Lkotlin/Function2;", "Ll3/l0;", "Loq/i0;", "onFocusChange", "Ll3/n0;", "a", "(ILer/p;)Ll3/n0;", "Lm3/g;", "c", "(Ll3/n0;)Lm3/g;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o0 {
    public static final n0 a(int i15, er.p<? super l0, ? super l0, oq.i0> pVar) {
        return new p0(i15, false, pVar, null, 10, null);
    }

    public static /* synthetic */ n0 b(int i15, er.p pVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = t0.INSTANCE.a();
        }
        if ((i16 & 2) != 0) {
            pVar = null;
        }
        return a(i15, pVar);
    }

    public static final m3.g c(n0 n0Var) {
        if (!n0Var.getNode().getIsAttached()) {
            return null;
        }
        l0 l0VarD0 = n0Var.d0();
        if (!l0VarD0.e()) {
            return null;
        }
        if (l0VarD0.b()) {
            return p0.w3((p0) n0Var, null, 1, null);
        }
        p0 p0VarK = g4.h.t(n0Var).getFocusOwner().k();
        if (p0VarK != null) {
            return p0VarK.v3(g4.h.q(n0Var));
        }
        return null;
    }
}
