package rz2;

import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.l;
import er.p;
import f3.j;
import l1.RoundedCornerShape;
import l1.h;
import mx.Label;
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
import y2.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lrz2/g;", "model", "Loq/i0;", "f", "(Lrz2/g;Lm2/r;I)V", "Ll1/g;", "a", "Ll1/g;", "counterBoxRadius", "Lc5/h;", "b", "F", "counterBoxSize", "qualifiedsignature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final RoundedCornerShape f176966a = h.f(c5.h.n(8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f176967b = c5.h.n(60);

    public static final void f(final FreeSignaturesCounterModel freeSignaturesCounterModel, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1473873965);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(freeSignaturesCounterModel) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1473873965, i16, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.component.FreeSignaturesCounter (FreeSignaturesCounter.kt:35)");
            }
            x30.c.c(null, 0.0f, m.d(-1807945070, true, new p() { // from class: rz2.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(freeSignaturesCounterModel, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: rz2.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.k(freeSignaturesCounterModel, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final FreeSignaturesCounterModel freeSignaturesCounterModel, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1807945070, i15, -1, "pl.gov.coi.mobywatel.feature.qualifiedsignature.presentation.screen.main.component.FreeSignaturesCounter.<anonymous> (FreeSignaturesCounter.kt:37)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean zW = rVar.W(freeSignaturesCounterModel);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: rz2.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.h(freeSignaturesCounterModel, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarC = v.c(companion, true, (l) objE);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(i.f39152a.j(), companion2.i(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarC);
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
            f3.m mVarA = k3.f.a(androidx.compose.foundation.layout.d.t(companion, f176967b), f176966a);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarA, aVar.a(rVar, i16).getBase().getSecondary(), null, 2, null);
            w0 w0VarI = d1.r.i(companion2.e(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = j.e(rVar, mVarD);
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
            Object objE2 = rVar.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE2 == companion4.a()) {
                objE2 = new l() { // from class: rz2.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.i((n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            j70.h.g(v.d(companion, false, (l) objE2, 1, null), null, freeSignaturesCounterModel.getAvailableSignatures(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).k(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            Object objE3 = rVar.E();
            if (objE3 == companion4.a()) {
                objE3 = new l() { // from class: rz2.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.j((n4.i0) obj);
                    }
                };
                rVar.v(objE3);
            }
            j70.h.g(v.d(companion, false, (l) objE3, 1, null), null, freeSignaturesCounterModel.getMessage(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
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
    public static final i0 h(FreeSignaturesCounterModel freeSignaturesCounterModel, n4.i0 i0Var) {
        String text;
        Label contentDescription = freeSignaturesCounterModel.getContentDescription();
        if (contentDescription == null || (text = contentDescription.getText()) == null) {
            text = "";
        }
        f0.c0(i0Var, text);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(FreeSignaturesCounterModel freeSignaturesCounterModel, int i15, r rVar, int i16) {
        f(freeSignaturesCounterModel, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
