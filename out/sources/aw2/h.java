package aw2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Law2/d;", "viewModel", "Loq/i0;", "g", "(Law2/d;Lm2/r;I)V", "Law2/d$a$a;", "data", "d", "(Law2/d$a$a;Lm2/r;I)V", "Law2/d$a;", "state", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final void d(final d.a.Installing installing, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1168475224);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(installing) : rVarH.G(installing) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1168475224, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.facedetectionmoduleloader.FaceDetectionModuleLoaderContent (FaceDetectionModuleLoaderScreen.kt:34)");
            }
            rVar2 = rVarH;
            i50.s.r(installing.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2004636555, true, new er.q() { // from class: aw2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.e(installing, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: aw2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.f(installing, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(d.a.Installing installing, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(2004636555, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.facedetectionmoduleloader.FaceDetectionModuleLoaderContent.<anonymous> (FaceDetectionModuleLoaderScreen.kt:36)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, installing.getLoadingLabel(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, Float.valueOf(-2.0f), false, false, null, rVar, 0, 0, 0, 30932955);
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
    public static final i0 f(d.a.Installing installing, int i15, p076m2.r rVar, int i16) {
        d(installing, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1097873094);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1097873094, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.facedetectionmoduleloader.FaceDetectionModuleLoaderScreen (FaceDetectionModuleLoaderScreen.kt:25)");
            }
            d.a aVarH = h(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarH, d.a.b.f14792a)) {
                rVarH.X(-1505904073);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof d.a.Installing)) {
                    rVarH.X(-1505906503);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1505901485);
                d((d.a.Installing) aVarH, rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: aw2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.i(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a h(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar, int i15, p076m2.r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
