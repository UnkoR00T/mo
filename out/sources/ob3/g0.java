package ob3;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import k70.Dimensions;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.Function1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;
import rb3.SelectedPlaceData;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001a²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lob3/v;", "viewModel", "Loq/i0;", "x", "(Lob3/v;Lm2/r;I)V", "Lob3/v$a$b;", "data", "r", "(Lob3/v$a$b;Lm2/r;I)V", "Lf3/m;", "modifier", "Lj50/e;", "searchBarData", "Lob3/v$a$b$b;", "searchData", "k", "(Lf3/m;Lj50/e;Lob3/v$a$b$b;Lm2/r;II)V", "Lrb3/a;", "", "splitMode", "n", "(Lf3/m;Lrb3/a;ZLm2/r;II)V", "Lob3/v$a;", "state", "", "alpha", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g0 {
    private static final void k(f3.m mVar, final SearchBarData searchBarData, final v.a.Initialized.InterfaceC3582b interfaceC3582b, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final f3.m mVar2;
        p076m2.r rVarH = rVar.h(-995022075);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(searchBarData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= (i15 & 512) == 0 ? rVarH.W(interfaceC3582b) : rVarH.G(interfaceC3582b) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            f3.m mVar3 = i18 != 0 ? f3.m.INSTANCE : mVar;
            if (p076m2.t.k()) {
                p076m2.t.o(-995022075, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.SearchBar (TripMapScreen.kt:157)");
            }
            y2.f fVarD = y2.m.d(-38787481, true, new er.p() { // from class: ob3.d0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g0.l(interfaceC3582b, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54);
            int i19 = (i17 & 14) | MLKEMEngine.KyberPolyBytes | (i17 & 112);
            f3.m mVar4 = mVar3;
            j50.f0.A(mVar4, searchBarData, fVarD, rVarH, i19, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar2 = mVar4;
        } else {
            rVarH.O();
            mVar2 = mVar;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ob3.e0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g0.m(mVar2, searchBarData, interfaceC3582b, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(v.a.Initialized.InterfaceC3582b interfaceC3582b, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-38787481, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.SearchBar.<anonymous> (TripMapScreen.kt:162)");
            }
            if (interfaceC3582b == null) {
                rVar.X(-171622270);
            } else {
                rVar.X(-171622269);
                pb3.g.b(null, interfaceC3582b, rVar, 0, 1);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(f3.m mVar, SearchBarData searchBarData, v.a.Initialized.InterfaceC3582b interfaceC3582b, int i15, int i16, p076m2.r rVar, int i17) {
        k(mVar, searchBarData, interfaceC3582b, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void n(f3.m mVar, final SelectedPlaceData selectedPlaceData, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        final f3.m mVar3;
        p076m2.r rVarH = rVar.h(-7451776);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(selectedPlaceData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            f3.m mVar4 = i18 != 0 ? f3.m.INSTANCE : mVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(-7451776, i17, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.SelectedPlaceBox (TripMapScreen.kt:172)");
            }
            mVar3 = mVar4;
            p114t0.k.g(selectedPlaceData != null, a3.r(mVar4, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 0.0f, 0.0f, 13, null), null, null, null, y2.m.d(574954920, true, new er.q() { // from class: ob3.b0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g0.o(selectedPlaceData, z15, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 28);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ob3.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g0.q(mVar3, selectedPlaceData, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(final SelectedPlaceData selectedPlaceData, final boolean z15, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(574954920, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.SelectedPlaceBox.<anonymous> (TripMapScreen.kt:177)");
        }
        if (selectedPlaceData == null) {
            rVar.X(152496206);
            rVar.R();
        } else {
            rVar.X(152496207);
            x30.c.c(null, 0.0f, y2.m.d(-1394758922, true, new er.p() { // from class: ob3.f0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g0.p(z15, selectedPlaceData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(boolean z15, SelectedPlaceData selectedPlaceData, p076m2.r rVar, int i15) {
        TextStyle textStyleI;
        int iA;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1394758922, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.SelectedPlaceBox.<anonymous>.<anonymous>.<anonymous> (TripMapScreen.kt:179)");
            }
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVar, i16).getSpacing200());
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(fVarR, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarA = d1.i0.f39176a.a(t70.i.S(companion, u2.b(0, rVar, 0, 1), rVar, 6, 0), 1.0f, z15);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.r(aVar.b(rVar, i16).getSpacing100()), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarA);
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
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, selectedPlaceData.getHeader(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            Label description = selectedPlaceData.getDescription();
            if (!selectedPlaceData.getIsSupported()) {
                rVar.X(50182969);
                textStyleI = aVar.f(rVar, i16).a();
                rVar.R();
            } else if (z15) {
                rVar.X(50185048);
                textStyleI = aVar.f(rVar, i16).j();
                rVar.R();
            } else {
                rVar.X(50186937);
                textStyleI = aVar.f(rVar, i16).i();
                rVar.R();
            }
            TextStyle textStyle = textStyleI;
            boolean isSupported = selectedPlaceData.getIsSupported();
            if (isSupported) {
                iA = b5.j.INSTANCE.f();
            } else {
                if (isSupported) {
                    throw new oq.p();
                }
                iA = b5.j.INSTANCE.a();
            }
            j70.h.g(mVarH, null, description, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, textStyle, null, null, false, false, null, rVar, 6, 0, 0, 33026042);
            rVar.x();
            h30.q.p(selectedPlaceData.getButton(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(f3.m mVar, SelectedPlaceData selectedPlaceData, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        n(mVar, selectedPlaceData, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void r(final v.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        float spacing100;
        float spacing200;
        float f15;
        p076m2.r rVarH = rVar.h(174786012);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(174786012, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.TripMapContent (TripMapScreen.kt:59)");
            }
            int i17 = ((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).orientation;
            boolean isActive = initialized.getSearchBarData().getIsActive();
            Dimensions dimensionsB = k70.a.f108864a.b(rVarH, k70.a.f108865b);
            boolean zA = rVarH.a(isActive);
            Object objE = rVarH.E();
            if (zA || objE == p076m2.r.INSTANCE.a()) {
                if (isActive) {
                    spacing100 = dimensionsB.getZero();
                } else {
                    if (isActive) {
                        throw new oq.p();
                    }
                    spacing100 = dimensionsB.getSpacing100();
                }
                objE = c5.h.j(spacing100);
                rVarH.v(objE);
            }
            float value = ((c5.h) objE).getValue();
            boolean zA2 = rVarH.a(isActive);
            Object objE2 = rVarH.E();
            if (zA2 || objE2 == p076m2.r.INSTANCE.a()) {
                if (isActive) {
                    spacing200 = dimensionsB.getZero();
                } else {
                    if (isActive) {
                        throw new oq.p();
                    }
                    spacing200 = dimensionsB.getSpacing200();
                }
                objE2 = c5.h.j(spacing200);
                rVarH.v(objE2);
            }
            float value2 = ((c5.h) objE2).getValue();
            boolean zC = rVarH.c(i17);
            Object objE3 = rVarH.E();
            if (zC || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = Boolean.valueOf(i17 == 2);
                rVarH.v(objE3);
            }
            final boolean zBooleanValue = ((Boolean) objE3).booleanValue();
            boolean isLoaded = initialized.getMapData().getIsLoaded();
            if (isLoaded) {
                f15 = 1.0f;
            } else {
                if (isLoaded) {
                    throw new oq.p();
                }
                f15 = 0.0f;
            }
            final f6<Float> f6VarE = u0.f.e(f15, null, 0.0f, null, null, rVarH, 0, 30);
            final d3 d3VarH = a3.h(value2, value, value2, value2);
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(828238921, true, new er.q() { // from class: ob3.x
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g0.t(f6VarE, initialized, zBooleanValue, d3VarH, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i16 & 14) == 4;
            Object objE4 = rVarH.E();
            if (z15 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.a() { // from class: ob3.y
                    @Override // er.a
                    public final Object a() {
                        return g0.v(initialized);
                    }
                };
                rVarH.v(objE4);
            }
            p088nul.q0.g(false, (er.a) objE4, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ob3.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g0.w(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float s(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(f6 f6Var, final v.a.Initialized initialized, boolean z15, final d3 d3Var, d3 d3Var2, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(828238921, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.TripMapContent.<anonymous> (TripMapScreen.kt:99)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarA = k3.a.a(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var2), s(f6Var));
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            pb3.e.e(null, initialized.getMapData(), rVar, 0, 1);
            if (initialized.getSearchBarData().getIsActive() || !z15) {
                rVar.X(-1039596133);
                f3.m mVarL = a3.l(companion, d3Var);
                p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing50()), companion2.k(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarL);
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
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarA, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.i0 i0Var = d1.i0.f39176a;
                k(null, initialized.getSearchBarData(), initialized.getSearchData(), rVar, 0, 1);
                r3.a(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), rVar, 0);
                n(null, initialized.getMapData().getSelectedPlace(), false, rVar, MLKEMEngine.KyberPolyBytes, 1);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(-1039622965);
                Function1.a(y2.m.d(-1344420282, true, new er.q() { // from class: ob3.a0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return g0.u(d3Var, initialized, (p036e4.s0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar, 54), rVar, 6);
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(d3 d3Var, v.a.Initialized initialized, p036e4.s0 s0Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1344420282, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.TripMapContent.<anonymous>.<anonymous>.<anonymous> (TripMapScreen.kt:109)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        f3.m mVarL = a3.l(companion, d3Var);
        p036e4.w0 w0VarB = m3.b(d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), f3.c.INSTANCE.l(), rVar, 0);
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
        n6.i(rVarC, w0VarB, companion2.d());
        n6.i(rVarC, e0VarT, companion2.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
        n6.g(rVarC, companion2.a());
        n6.i(rVarC, mVarE, companion2.e());
        q3 q3Var = q3.f39261a;
        k(p114t0.c.d(p3.c(q3Var, companion, 1.0f, false, 2, null), s0Var, null, null, false, 14, null), initialized.getSearchBarData(), initialized.getSearchData(), rVar, 0, 0);
        n(p114t0.c.d(p3.c(q3Var, companion, 1.0f, false, 2, null), s0Var, null, null, false, 14, null), initialized.getMapData().getSelectedPlace(), true, rVar, MLKEMEngine.KyberPolyBytes, 0);
        rVar.x();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(v.a.Initialized initialized) {
        initialized.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(v.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        r(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final v vVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1646557223);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(vVar) : rVarH.G(vVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1646557223, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.map.TripMapScreen (TripMapScreen.kt:48)");
            }
            v.a aVarY = y(m7.b.c(vVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarY instanceof v.a.Error) {
                rVarH.X(1793532751);
                ((v.a.Error) aVarY).getVmsAdapter().b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarY instanceof v.a.Initialized)) {
                    rVarH.X(1793530317);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1793534498);
                r((v.a.Initialized) aVarY, rVarH, 0);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ob3.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g0.z(vVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final v.a y(f6<? extends v.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(v vVar, int i15, p076m2.r rVar, int i16) {
        x(vVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
