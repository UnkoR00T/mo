package p50;

import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.v;
import d1.a3;
import d1.h0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import er.q;
import f3.j;
import f3.m;
import i30.g;
import j70.h;
import n3.y2;
import oq.i0;
import p036e4.h1;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp50/a;", "data", "Loq/i0;", "d", "(Lp50/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void d(final a aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1616234945);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1616234945, i16, -1, "pl.gov.coi.common.ui.ds.snackbar.SnackBar (SnackBar.kt:28)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            m.Companion companion = m.INSTANCE;
            boolean zG = rVarH.G(context) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: p50.c
                    @Override // er.a
                    public final Object a() {
                        return f.e(context, aVar);
                    }
                };
                rVarH.v(objE);
            }
            m mVarB = h1.b(companion, 0L, 0.0f, null, (er.a) objE, 7, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            y2 radius50 = aVar2.e(rVarH, i17).getRadius50();
            y1 y1Var = y1.f58315a;
            long jB = aVar2.a(rVarH, i17).getSurface().b();
            int i18 = y1.f58316b;
            rVar2 = rVarH;
            c2.c(mVarB, radius50, y1Var.b(jB, 0L, 0L, 0L, rVarH, i18 << 12, 14), y1Var.c(aVar2.c(rVarH, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i18 << 18, 62), null, y2.m.d(-681049203, true, new q() { // from class: p50.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.f(aVar, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar2, 54), rVar2, 196608, 16);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: p50.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Context context, a aVar) {
        i.u(context).a(aVar.getMessageLabel().getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar, h0 h0Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-681049203, i15, -1, "pl.gov.coi.common.ui.ds.snackbar.SnackBar.<anonymous> (SnackBar.kt:39)");
            }
            m.Companion companion = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarN = a3.n(mVarH, aVar2.b(rVar, i16).getSpacing200());
            d1.i.e eVarJ = d1.i.f39152a.j();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(eVarJ, companion2.l(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            h.g(q3Var.b(p3.c(q3Var, companion, 1.0f, false, 2, null), companion2.i()), null, aVar.getMessageLabel(), null, null, Color.INSTANCE.i(), 0L, null, null, null, 0L, null, null, 0L, v.INSTANCE.b(), false, 0, 0, null, aVar2.f(rVar, i16).d(), null, null, false, false, null, rVar, 196608, 24576, 0, 33013722);
            if (aVar instanceof a.Default) {
                rVar.X(252818221);
                rVar.R();
            } else {
                if (!(aVar instanceof a.DefaultWithIcon)) {
                    rVar.X(252816968);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-752515613);
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar2.b(rVar, i16).getSpacing150()), rVar, 0);
                w0 w0VarI = d1.r.i(companion2.m(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                e0 e0VarT2 = rVar.t();
                m mVarE2 = j.e(rVar, companion);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarI, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                x xVar = x.f39368a;
                g.f(((a.DefaultWithIcon) aVar).getIconButtonData(), false, false, rVar, 0, 6);
                rVar.x();
                rVar.R();
            }
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
    public static final i0 g(a aVar, int i15, r rVar, int i16) {
        d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
