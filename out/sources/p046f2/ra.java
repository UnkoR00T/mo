package p046f2;

import androidx.compose.foundation.layout.d;
import d1.x;
import er.a;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import h2.a2;
import h2.b2;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf2/ra;", "Lf2/i0;", "<init>", "()V", "Lf2/j0;", "Loq/i0;", "a", "(Lf2/j0;Lm2/r;I)V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ra implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ra f57515a = new ra();

    private ra() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(j0 j0Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1163527043, i15, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog.<anonymous> (AlertDialog.kt:167)");
            }
            a2.Companion companion = a2.INSTANCE;
            final String strB = b2.b(a2.a(ih.I), rVar, 0);
            m mVarX = d.x(j0Var.getModifier(), C6455g.r(), 0.0f, C6455g.q(), 0.0f, 10, null);
            m.Companion companion2 = m.INSTANCE;
            boolean zW = rVar.W(strB);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.qa
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ra.f(strB, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarU = mVarX.u(v.d(companion2, false, (l) objE, 1, null));
            w0 w0VarI = d1.r.i(c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarU);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            j0Var.a().B(rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(String str, n4.i0 i0Var) {
        f0.n0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(ra raVar, j0 j0Var, int i15, r rVar, int i16) {
        raVar.a(j0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // p046f2.i0
    public void a(final j0 j0Var, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1565826668);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(j0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1565826668, i16, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog (AlertDialog.kt:165)");
            }
            androidx.compose.ui.window.a.a(j0Var.c(), j0Var.getProperties(), y2.m.d(1163527043, true, new p() { // from class: f2.oa
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ra.e(j0Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.pa
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ra.g(this.f57266a, j0Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
