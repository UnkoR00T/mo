package nw3;

import b1.k;
import d1.a3;
import d1.h0;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.j;
import l1.h;
import lr.m;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.Function1;
import p046f2.hr;
import p046f2.ik;
import p046f2.jr;
import p046f2.mj;
import p046f2.mk;
import p046f2.vj;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld1/h0;", "", "sliderDegreesValue", "Lmx/a;", "rotationPopupLabel", "Lkotlin/Function1;", "", "Loq/i0;", "onValueChange", "Lkotlin/Function0;", "onValueChangeFinished", "g", "(Ld1/h0;FLmx/a;Ler/l;Ler/a;Lm2/r;I)V", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void g(final h0 h0Var, final float f15, final Label label, final l<? super Integer, i0> lVar, final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(359262017);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(h0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.b(f15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(label) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(aVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (t.k()) {
                t.o(359262017, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.component.AdjustmentSlider (AdjustmentSlider.kt:34)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            final b1.l lVar2 = (b1.l) objE;
            vj vjVar = vj.f58107a;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            final mj mjVarS = vjVar.s(aVar2.a(rVarH, i17).getBase().getPrimary(), aVar2.a(rVarH, i17).getBase().getPrimary(), aVar2.a(rVarH, i17).getBase().getPrimary(), aVar2.a(rVarH, i17).getBase().getSecondary(), aVar2.a(rVarH, i17).getBase().getSecondary(), 0L, 0L, 0L, 0L, 0L, rVarH, 0, 6, 992);
            lr.e<Float> eVarB = m.b(-45.0f, 45.0f);
            boolean z15 = (i16 & 7168) == 2048;
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new l() { // from class: nw3.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.h(lVar, ((Float) obj).floatValue());
                    }
                };
                rVarH.v(objE2);
            }
            ik.m(f15, (l) objE2, null, false, aVar, mjVarS, lVar2, 89, y2.m.d(1422384509, true, new q() { // from class: nw3.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.i(lVar2, h0Var, label, mjVarS, (mk) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), null, eVarB, rVarH, ((i16 >> 3) & 14) | 114819072 | (i16 & 57344), 0, 524);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: nw3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.m(h0Var, f15, label, lVar, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, float f15) {
        lVar.b(Integer.valueOf(Math.round(f15)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final b1.l lVar, final h0 h0Var, final Label label, final mj mjVar, mk mkVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1422384509, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.component.AdjustmentSlider.<anonymous> (AdjustmentSlider.kt:53)");
            }
            Function1.i(y2.m.d(-685045517, true, new q() { // from class: nw3.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.j(h0Var, label, (jr) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), null, lVar, false, y2.m.d(-1830097640, true, new p() { // from class: nw3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.l(lVar, mjVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 24966, 10);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(final h0 h0Var, final Label label, jr jrVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-685045517, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.component.AdjustmentSlider.<anonymous>.<anonymous> (AdjustmentSlider.kt:56)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        hr.p(jrVar, androidx.compose.foundation.layout.d.E(androidx.compose.foundation.layout.d.x(companion, aVar.b(rVar, i16).getSpacing600(), aVar.b(rVar, i16).getSpacing600(), 0.0f, 0.0f, 12, null), f3.c.INSTANCE.e(), false, 2, null), null, 0.0f, h.i(), 0L, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0.0f, 0.0f, y2.m.d(-1039385915, true, new p() { // from class: nw3.f
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return g.k(h0Var, label, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, (i15 & 14) | 805306368, 214);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(h0 h0Var, Label label, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1039385915, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.component.AdjustmentSlider.<anonymous>.<anonymous>.<anonymous> (AdjustmentSlider.kt:63)");
            }
            f3.m mVarB = h0.b(h0Var, f3.m.INSTANCE, 1.0f, false, 2, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarO = a3.o(mVarB, aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing150());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarO);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            j70.h.g(null, null, label, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).c(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
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
    public static final i0 l(b1.l lVar, mj mjVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1830097640, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.component.AdjustmentSlider.<anonymous>.<anonymous> (AdjustmentSlider.kt:82)");
            }
            vj.f58107a.h(lVar, null, mjVar, false, 0L, rVar, 196614, 26);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(h0 h0Var, float f15, Label label, l lVar, er.a aVar, int i15, r rVar, int i16) {
        g(h0Var, f15, label, lVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
