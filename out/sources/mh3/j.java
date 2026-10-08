package mh3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lmh3/e;", "viewModel", "Loq/i0;", "e", "(Lmh3/e;Lm2/r;I)V", "Lmh3/e$a;", "data", "h", "(Lmh3/e$a;Lm2/r;I)V", "Lmh3/e$a$a;", "j", "(Lmh3/e$a$a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void e(final e eVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1265437718);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1265437718, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamage.VehicleDamageScreen (VehicleDamageScreen.kt:27)");
            }
            h(f(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mh3.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.g(eVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a f(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(e eVar, int i15, r rVar, int i16) {
        e(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final e.a aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1641753506);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1641753506, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamage.VehicleDetailsContent (VehicleDamageScreen.kt:38)");
            }
            if (!(aVar instanceof e.a.Initialized)) {
                rVarH.X(1472123186);
                rVarH.R();
                throw new oq.p();
            }
            rVarH.X(1472125137);
            j((e.a.Initialized) aVar, rVarH, i16 & 14);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: mh3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(e.a aVar, int i15, r rVar, int i16) {
        h(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(final e.a.Initialized initialized, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1806667267);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1806667267, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamage.VehicleDetailsInitialized (VehicleDamageScreen.kt:48)");
            }
            rVar2 = rVarH;
            s.r(initialized.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(858969078, true, new q() { // from class: mh3.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.k(initialized, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: mh3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(initialized, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e.a.Initialized initialized, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(858969078, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamage.VehicleDetailsInitialized.<anonymous> (VehicleDamageScreen.kt:52)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(t70.i.S(w0.i.d(mVarF, aVar.a(rVar, i17).getBase().a(), null, 2, null), null, rVar, 0, 1), rVar, 0);
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
            j70.h.g(null, null, initialized.getHeader(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h0.v(initialized.getHasDamagesSingleCardData(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h0.v(initialized.getNoDamagesSingleCardData(), null, rVar, 0, 2);
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
    public static final i0 l(e.a.Initialized initialized, int i15, r rVar, int i16) {
        j(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
