package kx0;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import n50.h0;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkx0/h;", "viewModel", "Loq/i0;", "e", "(Lkx0/h;Lm2/r;I)V", "Lkx0/h$a;", "data", "h", "(Lkx0/h$a;Lm2/r;I)V", "viewModelState", "adddocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void e(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1064030512);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1064030512, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.main.AddMainDocumentScreen (AddMainDocumentScreen.kt:28)");
            }
            h(f(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kx0.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.g(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.Data f(f6<h.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(h hVar, int i15, p076m2.r rVar, int i16) {
        e(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final h.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1891052653);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1891052653, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.main.AddMainDocumentScreenContent (AddMainDocumentScreen.kt:38)");
            }
            boolean zG = rVarH.G(data);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: kx0.j
                    @Override // er.a
                    public final Object a() {
                        return m.i(data);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1378093882, true, new er.q() { // from class: kx0.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.j(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: kx0.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(h.Data data) {
        data.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(h.Data data, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1378093882, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.main.AddMainDocumentScreenContent.<anonymous> (AddMainDocumentScreen.kt:46)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.q(mVarL, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200()), 0.0f, 1, null), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            o40.j.i(data.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            h0.v(data.getMainIdentitySingleCardData(), null, rVar, 0, 2);
            vb.h(a3.p(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 0.0f, aVar.b(rVar, i17).getSpacing300(), 1, null), aVar.b(rVar, i17).getStrokeWidth(), 0L, rVar, 0, 4);
            h0.v(data.getMainDiiaSingleCardData(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h0.v(data.getStudentCardSingleCardData(), null, rVar, 0, 2);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(h.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
