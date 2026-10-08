package f50;

import b1.f;
import b1.k;
import b1.l;
import b50.RadioButtonRow;
import d1.a3;
import d1.e0;
import d1.i;
import d1.i0;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
import j70.h;
import mx.Label;
import n4.f0;
import n4.v;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import t70.s;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb50/c;", "data", "", "additionalContentDescription", "Loq/i0;", "e", "(Lb50/c;Ljava/lang/String;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void e(final RadioButtonRow radioButtonRow, final String str, r rVar, final int i15) {
        int i16;
        long jD;
        r rVarH = rVar.h(1982109540);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(radioButtonRow) : rVarH.G(radioButtonRow) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(str) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1982109540, i16, -1, "pl.gov.coi.common.ui.ds.radiobutton.common.radiobuttonrow.RadioButtonRow (RadioButtonRow.kt:35)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            l lVar = (l) objE2;
            f6<Boolean> f6VarA = f.a(lVar, rVarH, 6);
            m.Companion companion2 = m.INSTANCE;
            m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            i iVar = i.f39152a;
            i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarH);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            i0 i0Var = i0.f39176a;
            m mVarC = androidx.compose.foundation.layout.d.C(companion2, null, false, 3, null);
            int i17 = i16 & 14;
            boolean z15 = (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(radioButtonRow))) | ((i16 & 112) == 32);
            Object objE3 = rVarH.E();
            if (z15 || objE3 == companion.a()) {
                objE3 = new er.l() { // from class: f50.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.f(radioButtonRow, str, (n4.i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarC2 = v.c(mVarC, true, (er.l) objE3);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            m mVarA = k3.f.a(s.w(mVarC2, f6VarA, aVar2.b(rVarH, i18).getSpacing50(), 0.0f, 4, null), aVar2.e(rVarH, i18).getRadius50());
            int iF = n4.l.INSTANCE.f();
            boolean enabled = radioButtonRow.getItem().getEnabled();
            int i19 = i16;
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            n4.l lVarJ = n4.l.j(iF);
            boolean zG = (i17 == 4 || ((i19 & 8) != 0 && rVarH.G(radioButtonRow))) | rVarH.G(aVar);
            Object objE4 = rVarH.E();
            if (zG || objE4 == companion.a()) {
                objE4 = new er.a() { // from class: f50.b
                    @Override // er.a
                    public final Object a() {
                        return e.g(radioButtonRow, aVar);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarL = androidx.compose.foundation.b.l(mVarA, lVar, r1VarE, enabled, null, lVarJ, (er.a) objE4, 8, null);
            w0 w0VarB = m3.b(iVar.j(), companion3.l(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarL);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            q3 q3Var = q3.f39261a;
            e50.b.b(radioButtonRow.getItem(), rVarH, 0);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            m mVarH2 = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            Label label = radioButtonRow.getLabel();
            TextStyle textStyleB = aVar2.f(rVarH, i18).b();
            if (radioButtonRow.getItem().getEnabled()) {
                rVarH.X(911871136);
                jD = aVar2.a(rVarH, i18).getNeutral().i();
                rVarH.R();
            } else {
                rVarH.X(911932640);
                jD = aVar2.a(rVarH, i18).getNeutral().d();
                rVarH.R();
            }
            h.g(mVarH2, null, label, null, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, null, null, false, true, null, rVarH, 6, 0, 3072, 24641498);
            rVarH = rVarH;
            rVarH.x();
            m mVarH3 = androidx.compose.foundation.layout.d.h(a3.r(companion2, aVar2.b(rVarH, i18).getSpacing500(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarH3);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            d50.b.b(radioButtonRow.getDescription(), rVarH, 0);
            b50.a content = radioButtonRow.getContent();
            c50.c.c(radioButtonRow.getItem().getIsSelected(), content != null ? content.a() : null, rVarH, 0);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f50.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.i(radioButtonRow, str, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(RadioButtonRow radioButtonRow, String str, n4.i0 i0Var) {
        f0.y0(i0Var, "radiobutton " + radioButtonRow.getLabel().getTag());
        f0.c0(i0Var, str);
        f0.s0(i0Var, radioButtonRow.getItem().getIsSelected());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(final RadioButtonRow radioButtonRow, cx.a aVar) {
        if (radioButtonRow.getItem().getEnabled() && !radioButtonRow.getItem().getIsSelected()) {
            cx.a.a(aVar, 0L, new er.a() { // from class: f50.d
                @Override // er.a
                public final Object a() {
                    return e.h(radioButtonRow);
                }
            }, 1, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(RadioButtonRow radioButtonRow) {
        radioButtonRow.g().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(RadioButtonRow radioButtonRow, String str, int i15, r rVar, int i16) {
        e(radioButtonRow, str, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
