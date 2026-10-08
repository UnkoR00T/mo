package uu1;

import android.annotation.SuppressLint;
import d1.a3;
import d1.d3;
import d1.x;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w20.BaseDocumentScreenState;
import wu1.TextData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Luu1/e;", "viewModel", "Loq/i0;", "h", "(Luu1/e;Lm2/r;I)V", "Luu1/e$a;", "screenData", "Lw20/a;", "baseScreenData", "Lg20/a;", "Lwu1/b;", "bottomSheetState", "m", "(Luu1/e$a;Lw20/a;Lg20/a;Lm2/r;I)V", "data", "drivinglicence_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {
    public static final void h(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1945415650);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1945415650, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.historicdatadetails.DrivingLicenceHistoricDocumentDetailsScreen (DrivingLicenceHistoricDocumentDetailsScreen.kt:30)");
            }
            m(i(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), k(m7.b.c(eVar.L8(), null, null, null, rVarH, 0, 7)), j(m7.b.c(eVar.T(), null, null, null, rVarH, 0, 7)), rVarH, BaseDocumentScreenState.f209332e << 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uu1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.l(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data i(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final g20.a<TextData> j(f6<? extends g20.a<TextData>> f6Var) {
        return f6Var.getValue();
    }

    private static final BaseDocumentScreenState k(f6<BaseDocumentScreenState> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e eVar, int i15, p076m2.r rVar, int i16) {
        h(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void m(final e.Data data, final BaseDocumentScreenState baseDocumentScreenState, final g20.a<TextData> aVar, p076m2.r rVar, final int i15) {
        int i16;
        v vVar;
        p076m2.r rVarH = rVar.h(-1482928079);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(baseDocumentScreenState) : rVarH.G(baseDocumentScreenState) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1482928079, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.historicdatadetails.DrivingLicenceHistoricDocumentDetailsScreenContent (DrivingLicenceHistoricDocumentDetailsScreen.kt:48)");
            }
            if (fr.t.c(aVar, g20.a.C1572a.f69798a)) {
                vVar = v.HIDDEN;
            } else {
                if (!(aVar instanceof g20.a.Expanded)) {
                    throw new oq.p();
                }
                vVar = v.EXPANDED;
            }
            v vVar2 = vVar;
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: uu1.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.n((v) obj);
                    }
                };
                rVarH.v(objE);
            }
            g30.t.f(new ModalBottomSheetData(new ModalSheetState(vVar2, false, (er.l) objE, 2, null), null, null, null, 14, null), 0.0f, false, null, null, y2.m.d(1609030712, true, new er.p() { // from class: uu1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.o(aVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(2093667543, true, new er.p() { // from class: uu1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(data, baseDocumentScreenState, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: uu1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.s(data, baseDocumentScreenState, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(v vVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(g20.a aVar, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1609030712, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.historicdatadetails.DrivingLicenceHistoricDocumentDetailsScreenContent.<anonymous> (DrivingLicenceHistoricDocumentDetailsScreen.kt:60)");
            }
            i0 i0Var = null;
            final g20.a.Expanded expanded = aVar instanceof g20.a.Expanded ? (g20.a.Expanded) aVar : null;
            if (expanded == null) {
                rVar.X(-1495975218);
                rVar.R();
                rVar2 = rVar;
            } else {
                rVar.X(-1495975217);
                Label title = ((TextData) expanded.a()).getTitle();
                Label content = ((TextData) expanded.a()).getContent();
                boolean zG = rVar.G(expanded);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: uu1.l
                        @Override // er.a
                        public final Object a() {
                            return m.p(expanded);
                        }
                    };
                    rVar.v(objE);
                }
                rVar2 = rVar;
                o70.b.b(title, true, content, (er.a) objE, rVar2, 48, 0);
                rVar2.R();
                i0Var = i0.f148189a;
            }
            if (i0Var == null) {
                rVar2.X(90296990);
                f3.m.Companion companion = f3.m.INSTANCE;
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                e0 e0VarT = rVar2.t();
                f3.m mVarE = f3.j.e(rVar2, companion);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC = n6.c(rVar2);
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                x xVar = x.f39368a;
                rVar2.x();
                rVar2.R();
            } else {
                rVar2.X(90288217);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(g20.a.Expanded expanded) {
        ((TextData) expanded.a()).d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final e.Data data, final BaseDocumentScreenState baseDocumentScreenState, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2093667543, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.historicdatadetails.DrivingLicenceHistoricDocumentDetailsScreenContent.<anonymous> (DrivingLicenceHistoricDocumentDetailsScreen.kt:70)");
            }
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1152450742, true, new er.q() { // from class: uu1.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.r(data, baseDocumentScreenState, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(e.Data data, BaseDocumentScreenState baseDocumentScreenState, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1152450742, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.historicdatadetails.DrivingLicenceHistoricDocumentDetailsScreenContent.<anonymous>.<anonymous> (DrivingLicenceHistoricDocumentDetailsScreen.kt:71)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), d3Var);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
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
            n20.i.j(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), data.getDocumentState(), baseDocumentScreenState, false, null, null, rVar, (BaseDocumentScreenState.f209332e << 6) | 6, 56);
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
    public static final i0 s(e.Data data, BaseDocumentScreenState baseDocumentScreenState, g20.a aVar, int i15, p076m2.r rVar, int i16) {
        m(data, baseDocumentScreenState, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
