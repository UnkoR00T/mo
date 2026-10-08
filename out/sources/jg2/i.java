package jg2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ljg2/d;", "viewModel", "Loq/i0;", "f", "(Ljg2/d;Lm2/r;I)V", "Ljg2/d$a;", "data", "e", "(Ljg2/d$a;Lm2/r;I)V", "j", "state", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void e(final d.Data data, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1264493040);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1264493040, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.datashare.DataShareScreen (DataShareScreen.kt:36)");
            }
            j(data, rVarH, BaseScaffoldData.f89350g | InfoRowListData.f187643b | (i16 & 14));
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: jg2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void f(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1698602976);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1698602976, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.datashare.DataShareScreen (DataShareScreen.kt:25)");
            }
            e(g(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g | InfoRowListData.f187643b);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: jg2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data g(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d dVar, int i15, r rVar, int i16) {
        f(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d.Data data, int i15, r rVar, int i16) {
        e(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final d.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1166611170);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1166611170, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.datashare.DataShareScreenInitialized (DataShareScreen.kt:41)");
            }
            rVar2 = rVarH;
            s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-145146801, true, new q() { // from class: jg2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.k(data, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: jg2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d.Data data, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-145146801, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.datashare.DataShareScreenInitialized.<anonymous> (DataShareScreen.kt:45)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label description = data.getDescription();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, description, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            s40.g.c(data.getInfoRowList(), 0.0f, rVar, InfoRowListData.f187643b, 2);
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
    public static final i0 l(d.Data data, int i15, r rVar, int i16) {
        j(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
