package wa3;

import androidx.compose.ui.platform.g1;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Map;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.q1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.m5;
import p076m2.n6;
import p076m2.y2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0015\u001a\u00020\u0002*\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u001b\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006!²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lwa3/n;", "viewModel", "Loq/i0;", "y", "(Lwa3/n;Lm2/r;I)V", "Lwa3/n$a$c;", "data", "p", "(Lwa3/n$a$c;Lm2/r;I)V", "Lwa3/n$a$e;", "B", "(Lwa3/n$a$e;Lm2/r;I)V", "Lwa3/n$a$f;", "searchData", "F", "(Lwa3/n$a$f;Lm2/r;I)V", "Lf1/q0;", "", "Lmx/a;", "Ln30/b;", "countryList", "J", "(Lf1/q0;Ljava/util/Map;)V", "Lwa3/n$a$a$b;", "followedCountriesData", "Lc5/h;", "remainingHeight", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lf1/q0;Lwa3/n$a$a$b;F)V", "Lwa3/n$a;", "state", "", "headerHeightPx", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(n nVar, int i15, p076m2.r rVar, int i16) {
        y(nVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void B(final n.a.Search search, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(374831415);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(search) : rVarH.G(search) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(374831415, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountrySearchContent (CountryListScreen.kt:108)");
            }
            rVar2 = rVarH;
            i50.s.r(search.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1634960022, true, new er.q() { // from class: wa3.u
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.C(search, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: wa3.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.E(search, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final n.a.Search search, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1634960022, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountrySearchContent.<anonymous> (CountryListScreen.kt:110)");
            }
            j50.f0.A(a3.l(f3.m.INSTANCE, d3Var), search.getSearchBarData(), y2.m.d(-1861489716, true, new er.p() { // from class: wa3.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.D(search, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(n.a.Search search, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1861489716, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountrySearchContent.<anonymous>.<anonymous> (CountryListScreen.kt:115)");
            }
            F(search.getSearchListData(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(n.a.Search search, int i15, p076m2.r rVar, int i16) {
        B(search, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void F(final n.a.f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(445996671);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(445996671, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.SearchInnerContent (CountryListScreen.kt:123)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(fVar))) {
                z15 = true;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: wa3.b0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.G(fVar, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarN, null, null, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 510);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: wa3.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.I(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final n.a.f fVar, f1.q0 q0Var) {
        if (fVar instanceof n.a.f.NotFound) {
            f1.q0.c(q0Var, null, null, y2.m.b(76859922, true, new er.q() { // from class: wa3.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.H(fVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            if (!(fVar instanceof n.a.f.WithContent)) {
                throw new oq.p();
            }
            m30.m.h(q0Var, ((n.a.f.WithContent) fVar).getCountryList());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(n.a.f fVar, f1.e eVar, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(eVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(76859922, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.SearchInnerContent.<anonymous>.<anonymous>.<anonymous> (CountryListScreen.kt:129)");
            }
            f3.m mVarB = f1.e.b(eVar, f3.m.INSTANCE, 0.0f, 1, null);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarB);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            k40.d.c(null, ((n.a.f.NotFound) fVar).getNotFoundData(), rVar, EmptyStateData.f108236d << 3, 1);
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
    public static final oq.i0 I(n.a.f fVar, int i15, p076m2.r rVar, int i16) {
        F(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void J(f1.q0 q0Var, Map<Label, CardListData> map) {
        for (Map.Entry<Label, CardListData> entry : map.entrySet()) {
            final Label key = entry.getKey();
            CardListData value = entry.getValue();
            f1.q0.c(q0Var, null, null, y2.m.b(-585905822, true, new er.q() { // from class: wa3.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.K(key, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
            m30.m.h(q0Var, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-585905822, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.allCountriesContent.<anonymous>.<anonymous> (CountryListScreen.kt:147)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(a3.p(f3.m.INSTANCE, 0.0f, aVar.b(rVar, i16).getSpacing100(), 1, null), null, label, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    public static final void L(f1.q0 q0Var, final n.a.InterfaceC5570a.b bVar, final float f15) {
        if (bVar instanceof n.a.InterfaceC5570a.b.Empty) {
            f1.q0.c(q0Var, null, null, y2.m.b(-1719574840, true, new er.q() { // from class: wa3.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.M(f15, bVar, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            if (!(bVar instanceof n.a.InterfaceC5570a.b.WithContent)) {
                throw new oq.p();
            }
            m30.m.h(q0Var, ((n.a.InterfaceC5570a.b.WithContent) bVar).getCountryList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(float f15, n.a.InterfaceC5570a.b bVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1719574840, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.followedCountriesContent.<anonymous> (CountryListScreen.kt:163)");
            }
            f3.m mVarK = androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), f15, 0.0f, 2, null);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarK);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            k40.d.c(null, ((n.a.InterfaceC5570a.b.Empty) bVar).getEmptyData(), rVar, EmptyStateData.f108236d << 3, 1);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final void p(final n.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-623567905);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-623567905, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountryListContent (CountryListScreen.kt:58)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = m5.a(0);
                rVarH.v(objE);
            }
            final y2 y2Var = (y2) objE;
            final c5.d dVar = (c5.d) rVarH.N(g1.f());
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1818805964, true, new er.q() { // from class: wa3.w
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.s(dVar, initialized, y2Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: wa3.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.x(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int q(y2 y2Var) {
        return y2Var.d();
    }

    private static final void r(y2 y2Var, int i15) {
        y2Var.g(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(final c5.d dVar, final n.a.Initialized initialized, final y2 y2Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1818805964, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountryListContent.<anonymous> (CountryListScreen.kt:63)");
            }
            d1.b0.d(a3.p(a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null), null, false, y2.m.d(1256996130, true, new er.q() { // from class: wa3.y
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.t(dVar, initialized, y2Var, (d1.c0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 3072, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(c5.d dVar, final n.a.Initialized initialized, final y2 y2Var, d1.c0 c0Var, p076m2.r rVar, int i15) {
        d1.c0 c0Var2;
        int i16;
        if ((i15 & 6) == 0) {
            c0Var2 = c0Var;
            i16 = i15 | (rVar.W(c0Var2) ? 4 : 2);
        } else {
            c0Var2 = c0Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1256996130, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountryListContent.<anonymous>.<anonymous> (CountryListScreen.kt:69)");
            }
            final float value = ((c5.h) lr.m.g(c5.h.j(c5.h.n(c0Var2.b() - dVar.b2(q(y2Var)))), c5.h.j(c5.h.n(0)))).getValue();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(initialized) | rVar.b(value);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: wa3.a0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.u(initialized, value, y2Var, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 507);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(final n.a.Initialized initialized, float f15, final y2 y2Var, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(1118591351, true, new er.q() { // from class: wa3.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.v(y2Var, initialized, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        n.a.InterfaceC5570a countriesListType = initialized.getCountriesListType();
        if (countriesListType instanceof n.a.InterfaceC5570a.All) {
            J(q0Var, ((n.a.InterfaceC5570a.All) countriesListType).a());
        } else {
            if (!(countriesListType instanceof n.a.InterfaceC5570a.b)) {
                throw new oq.p();
            }
            L(q0Var, (n.a.InterfaceC5570a.b) countriesListType, f15);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(final y2 y2Var, n.a.Initialized initialized, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1118591351, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountryListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CountryListScreen.kt:79)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: wa3.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.w(y2Var, (c5.r) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = q1.a(companion, (er.l) objE);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarA);
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
            Label description = initialized.getDescription();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, description, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            j50.f0.A(null, initialized.getSearchBarData(), b.f211600a.b(), rVar, MLKEMEngine.KyberPolyBytes, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            y30.m.g(initialized.getControllerData(), rVar, y30.n.Switch.f223693f);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
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
    public static final oq.i0 w(y2 y2Var, c5.r rVar) {
        r(y2Var, (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(n.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        p(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void y(final n nVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1963065872);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(nVar) : rVarH.G(nVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1963065872, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.list.CountryListScreen (CountryListScreen.kt:46)");
            }
            n.a aVarZ = z(m7.b.c(nVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarZ, n.a.d.f211656a)) {
                rVarH.X(1015666305);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarZ instanceof n.a.Error) {
                rVarH.X(1015668920);
                ((n.a.Error) aVarZ).getErrorVMSAdapter().b(rVarH, 0);
                rVarH.R();
            } else if (aVarZ instanceof n.a.Initialized) {
                rVarH.X(1015670799);
                p((n.a.Initialized) aVarZ, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarZ instanceof n.a.Search)) {
                    rVarH.X(1015664433);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1015673233);
                B((n.a.Search) aVarZ, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: wa3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.A(nVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final n.a z(f6<? extends n.a> f6Var) {
        return f6Var.getValue();
    }
}
