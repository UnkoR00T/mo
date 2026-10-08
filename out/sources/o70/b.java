package o70;

import b5.j;
import d1.a3;
import d1.e0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import f3.m;
import h30.ButtonData;
import h30.q;
import j70.h;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.C6461wc;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import t70.i;
import t70.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmx/a;", "tooltipTitle", "", "centerTitle", "tooltipContent", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "b", "(Lmx/a;ZLmx/a;Ler/a;Lm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0156  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x01af  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void b(final Label label, boolean z15, final Label label2, final er.a<i0> aVar, r rVar, final int i15, final int i16) {
        int i17;
        boolean z16;
        boolean z17;
        r rVar2;
        final boolean z18;
        d5 d5VarM;
        boolean z19;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        j.Companion companion;
        int iF;
        int i18;
        int i19;
        r rVarH = rVar.h(1661474936);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) != 0) {
                if (rVarH.W(label2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) != 0) {
                if (rVarH.G(aVar)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i17 |= i18;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i25 != 0) {
                    z19 = false;
                } else {
                    z19 = z16;
                }
                if (t.k()) {
                    t.o(1661474936, i17, -1, "pl.gov.coi.common.ui.tooltips.BottomSheetTooltip (BottomSheetTooltip.kt:38)");
                }
                m.Companion companion2 = m.INSTANCE;
                m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
                k70.a aVar2 = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                m mVarS = i.S(a3.n(w0.i.d(mVarH, aVar2.a(rVarH, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null), aVar2.b(rVarH, i26).getSpacing250()), null, rVarH, 0, 1);
                d1.i iVar = d1.i.f39152a;
                d1.i.n nVarK = iVar.k();
                f3.c.Companion companion3 = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                m mVarE = f3.j.e(rVarH, mVarS);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
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
                d1.i0 i0Var = d1.i0.f39176a;
                m mVarH2 = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
                w0 w0VarB = m3.b(iVar.j(), companion3.i(), rVarH, 48);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                m mVarE2 = f3.j.e(rVarH, mVarH2);
                aVarB2 = companion4.b();
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
                TextStyle textStyleP = aVar2.f(rVarH, i26).p();
                m mVarC = p3.c(q3Var, companion2, 1.0f, false, 2, null);
                companion = j.INSTANCE;
                if (z19) {
                    iF = companion.a();
                } else {
                    iF = companion.f();
                }
                boolean z25 = z19;
                h.g(mVarC, null, label, null, null, 0L, 0L, null, null, null, 0L, null, j.h(iF), 0L, 0, false, 0, 0, null, textStyleP, null, null, false, false, null, rVarH, (i17 << 6) & 896, 0, 0, 33026042);
                C6461wc.c(aVar, androidx.compose.foundation.layout.d.t(companion2, aVar2.b(rVarH, i26).getSpacing300()), true, null, new x(), null, d.f142870a.b(), rVarH, ((i17 >> 9) & 14) | 1573248, 40);
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i26).getSpacing200()), rVarH, 0);
                rVar2 = rVarH;
                h.g(null, null, label2, null, null, 0L, 0L, null, null, null, 0L, null, j.h(j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i26).b(), null, null, false, false, null, rVar2, i17 & 896, 0, 0, 33026043);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i26).getSpacing300()), rVar2, 0);
                q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Zamknij", "closeButton"), null, 2, null), k30.d.a.f107773a, null, aVar, 35, null), false, null, rVar2, 0, 6);
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
                z18 = z25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z18 = z16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: o70.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return b.c(label, z18, label2, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        if ((i15 & MLKEMEngine.KyberPolyBytes) != 0) {
            if (rVarH.W(label2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i17 |= i19;
        }
        if ((i15 & 3072) != 0) {
            if (rVarH.G(aVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i17 |= i18;
        }
        if ((i17 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i25 != 0) {
                z19 = false;
            } else {
                z19 = z16;
            }
            if (t.k()) {
                t.o(1661474936, i17, -1, "pl.gov.coi.common.ui.tooltips.BottomSheetTooltip (BottomSheetTooltip.kt:38)");
            }
            m.Companion companion5 = m.INSTANCE;
            m mVarH3 = androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null);
            k70.a aVar3 = k70.a.f108864a;
            int i27 = k70.a.f108865b;
            m mVarS2 = i.S(a3.n(w0.i.d(mVarH3, aVar3.a(rVarH, i27).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null), aVar3.b(rVarH, i27).getSpacing250()), null, rVarH, 0, 1);
            d1.i iVar2 = d1.i.f39152a;
            d1.i.n nVarK2 = iVar2.k();
            f3.c.Companion companion6 = f3.c.INSTANCE;
            w0 w0VarA2 = e0.a(nVarK2, companion6.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = f3.j.e(rVarH, mVarS2);
            androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion7.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion7.d());
            n6.i(rVarC3, e0VarT3, companion7.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion7.c());
            n6.g(rVarC3, companion7.a());
            n6.i(rVarC3, mVarE3, companion7.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            m mVarH4 = androidx.compose.foundation.layout.d.h(companion5, 0.0f, 1, null);
            w0 w0VarB2 = m3.b(iVar2.j(), companion6.i(), rVarH, 48);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            m mVarE4 = f3.j.e(rVarH, mVarH4);
            aVarB2 = companion7.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarB2, companion7.d());
            n6.i(rVarC4, e0VarT4, companion7.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion7.c());
            n6.g(rVarC4, companion7.a());
            n6.i(rVarC4, mVarE4, companion7.e());
            q3 q3Var2 = q3.f39261a;
            TextStyle textStyleP2 = aVar3.f(rVarH, i27).p();
            m mVarC2 = p3.c(q3Var2, companion5, 1.0f, false, 2, null);
            companion = j.INSTANCE;
            if (z19) {
                iF = companion.a();
            } else {
                iF = companion.f();
            }
            boolean z26 = z19;
            h.g(mVarC2, null, label, null, null, 0L, 0L, null, null, null, 0L, null, j.h(iF), 0L, 0, false, 0, 0, null, textStyleP2, null, null, false, false, null, rVarH, (i17 << 6) & 896, 0, 0, 33026042);
            C6461wc.c(aVar, androidx.compose.foundation.layout.d.t(companion5, aVar3.b(rVarH, i27).getSpacing300()), true, null, new x(), null, d.f142870a.b(), rVarH, ((i17 >> 9) & 14) | 1573248, 40);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVarH, i27).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            h.g(null, null, label2, null, null, 0L, 0L, null, null, null, 0L, null, j.h(j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i27).b(), null, null, false, false, null, rVar2, i17 & 896, 0, 0, 33026043);
            r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar3.b(rVar2, i27).getSpacing300()), rVar2, 0);
            q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Zamknij", "closeButton"), null, 2, null), k30.d.a.f107773a, null, aVar, 35, null), false, null, rVar2, 0, 6);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            z18 = z26;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            z18 = z16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: o70.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(label, z18, label2, aVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(Label label, boolean z15, Label label2, er.a aVar, int i15, int i16, r rVar, int i17) {
        b(label, z15, label2, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
