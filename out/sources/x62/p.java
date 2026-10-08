package x62;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lx62/e;", "viewModel", "Loq/i0;", "p", "(Lx62/e;Lm2/r;I)V", "Lx62/e$a;", "screenData", "Lka/a;", "Lz62/a;", "tickets", "s", "(Lx62/e$a;Lka/a;Lm2/r;I)V", "Lx62/e$a$c;", "u", "(Lx62/e$a$c;Lka/a;Lm2/r;I)V", "Lc30/b;", "alertData", "x", "(Lka/a;Lc30/b;Lm2/r;I)V", "Lq40/g;", "emptyScreenData", "k", "(Lq40/g;Lm2/r;I)V", "Lx62/e$a$a;", "m", "(Lx62/e$a$a;Lm2/r;I)V", "fines_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f217043a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-825672861);
            if (p076m2.t.k()) {
                p076m2.t.o(-825672861, i15, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListInformalTaxPayerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TicketsListScreen.kt:170)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(ka.a aVar, c30.b bVar, int i15, p076m2.r rVar, int i16) {
        x(aVar, bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(IconPageData<i0, i0> iconPageData, p076m2.r rVar, final int i15) {
        int i16;
        final IconPageData<i0, i0> iconPageData2;
        p076m2.r rVarH = rVar.h(1178741621);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(iconPageData) : rVarH.G(iconPageData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1178741621, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListEmptyContent (TicketsListScreen.kt:147)");
            }
            iconPageData2 = iconPageData;
            q40.i.b(iconPageData2, null, null, rVarH, IconPageData.f164667h | (i16 & 14), 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            iconPageData2 = iconPageData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: x62.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.l(iconPageData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(IconPageData iconPageData, int i15, p076m2.r rVar, int i16) {
        k(iconPageData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final e.a.InformalTaxPayer informalTaxPayer, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1290864797);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(informalTaxPayer) : rVarH.G(informalTaxPayer) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1290864797, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListInformalTaxPayerScreen (TicketsListScreen.kt:152)");
            }
            rVar2 = rVarH;
            i50.s.r(informalTaxPayer.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-359451242, true, new er.q() { // from class: x62.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.n(informalTaxPayer, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: x62.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.o(informalTaxPayer, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(e.a.InformalTaxPayer informalTaxPayer, d3 d3Var, p076m2.r rVar, int i15) {
        d3 d3Var2;
        int i16;
        if ((i15 & 6) == 0) {
            d3Var2 = d3Var;
            i16 = i15 | (rVar.W(d3Var2) ? 4 : 2);
        } else {
            d3Var2 = d3Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-359451242, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListInformalTaxPayerScreen.<anonymous> (TicketsListScreen.kt:154)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarR = a3.r(companion, 0.0f, d3Var2.getTop(), 0.0f, 0.0f, 13, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(w0.i.d(mVarR, aVar.a(rVar, i17).getBase().a(), null, 2, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            w0 w0VarA2 = d1.e0.a(iVar.e(), companion2.g(), rVar, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarF);
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
            d40.h.f(a3.r(companion, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing300(), 7, null), new d40.b.C0864b(null, jz.a.f106754d2, d40.i.n.f39717e, a.f217043a, Label.INSTANCE.c(), null, 33, null), false, rVar, d40.b.C0864b.f39687h << 3, 4);
            TextStyle textStyleI = aVar.f(rVar, i17).i();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            j70.h.g(null, null, informalTaxPayer.getTitle(), null, null, aVar.a(rVar, i17).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleI, null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, informalTaxPayer.getDescription(), null, null, aVar.a(rVar, i17).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            rVar.x();
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
    public static final i0 o(e.a.InformalTaxPayer informalTaxPayer, int i15, p076m2.r rVar, int i16) {
        m(informalTaxPayer, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(812301597);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(812301597, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListScreen (TicketsListScreen.kt:48)");
            }
            s(q(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), ka.b.b(eVar.y1(), null, rVarH, 0, 1), rVarH, ka.a.f109310f << 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: x62.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.a q(f6<? extends e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(e eVar, int i15, p076m2.r rVar, int i16) {
        p(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void s(final e.a aVar, final ka.a<z62.a> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(804454670);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(804454670, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListScreenContent (TicketsListScreen.kt:58)");
            }
            if (fr.t.c(aVar, e.a.b.f217014a)) {
                rVarH.X(-13169486);
                rVarH.R();
            } else if (aVar instanceof e.a.Initialized) {
                rVarH.X(-13167756);
                u((e.a.Initialized) aVar, aVar2, rVarH, (i16 & 112) | (i16 & 14) | (ka.a.f109310f << 3));
                rVarH.R();
            } else {
                if (!(aVar instanceof e.a.InformalTaxPayer)) {
                    rVarH.X(-13171115);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-13163832);
                m((e.a.InformalTaxPayer) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: x62.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.t(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(e.a aVar, ka.a aVar2, int i15, p076m2.r rVar, int i16) {
        s(aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    public static final void u(final e.a.Initialized initialized, final ka.a<z62.a> aVar, p076m2.r rVar, final int i15) {
        int i16;
        ?? r15;
        int i17;
        p076m2.r rVarH = rVar.h(-603308292);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-603308292, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListScreenDisplayed (TicketsListScreen.kt:68)");
            }
            if (fr.t.c(aVar.i().getRefresh(), ja.w.Loading.f101205b)) {
                rVarH.X(1773152908);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
                r15 = 0;
                i17 = 1;
            } else {
                rVarH.X(1773237476);
                r15 = 0;
                i17 = 1;
                i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(331347793, true, new er.q() { // from class: x62.h
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return p.v(initialized, aVar, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
                rVarH = rVarH;
                rVarH.R();
            }
            q0.g(r15, initialized.b(), rVarH, r15, i17);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: x62.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.w(initialized, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(e.a.Initialized initialized, ka.a aVar, e.a.Initialized initialized2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(331347793, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsListScreenDisplayed.<anonymous>.<anonymous> (TicketsListScreen.kt:73)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(a3.l(w0.i.d(mVarF, aVar2.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing100(), aVar2.b(rVar, i17).getSpacing200(), 0.0f, 8, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            d1.i0 i0Var = d1.i0.f39176a;
            y30.m.g(initialized.getControllersData(), rVar, y30.n.Switch.f223693f);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarD = androidx.compose.foundation.layout.d.d(companion, 0.0f, 1, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarD);
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
            if (aVar.g() == 0) {
                rVar.X(-138360939);
                k(initialized2.d(), rVar, IconPageData.f164667h);
                rVar.R();
            } else {
                rVar.X(-138251106);
                x(aVar, initialized.getAlertData(), rVar, ka.a.f109310f | (c30.b.f22944i << 3));
                rVar.R();
            }
            rVar.x();
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
    public static final i0 w(e.a.Initialized initialized, ka.a aVar, int i15, p076m2.r rVar, int i16) {
        u(initialized, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void x(final ka.a<z62.a> aVar, final c30.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1377291626);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 32 : 16;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1377291626, i16, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsWithDates (TicketsListScreen.kt:106)");
            }
            c30.e.c(null, bVar, rVarH, (c30.b.f22944i << 3) | (i16 & 112), 1);
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            d3 d3VarI = a3.i(0.0f, aVar2.b(rVarH, i17).getSpacing100(), 0.0f, aVar2.b(rVarH, i17).getSpacing100(), 5, null);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(aVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: x62.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.y(aVar, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 507);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: x62.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.A(aVar, bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final ka.a aVar, f1.q0 q0Var) {
        f1.q0.e(q0Var, aVar.g(), null, null, y2.m.b(-1288993736, true, new er.r() { // from class: x62.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.z(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
            f1.q0.c(q0Var, null, null, b.f216988a.b(), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        p076m2.r rVar2 = rVar;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar2.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar2.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1288993736, i17, -1, "pl.gov.coi.mobywatel.feature.fines.presentation.tickets.list.TicketsWithDates.<anonymous>.<anonymous>.<anonymous> (TicketsListScreen.kt:116)");
            }
            z62.a aVar2 = (z62.a) aVar.f(i15);
            if (aVar2 == null) {
                rVar2.X(890257960);
            } else {
                rVar2.X(890257961);
                if (aVar2 instanceof z62.a.b) {
                    rVar2.X(1264917677);
                    if (i15 != 0) {
                        rVar2.X(1149183181);
                        r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing300()), rVar2, 0);
                    } else {
                        rVar2.X(1260056288);
                    }
                    rVar2.R();
                    Label date = ((z62.a.b) aVar2).getDate();
                    k70.a aVar3 = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    j70.h.g(null, null, date, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                    rVar2 = rVar;
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar3.b(rVar2, i18).getSpacing200()), rVar2, 0);
                    rVar2.R();
                } else {
                    if (!(aVar2 instanceof z62.a.C6275a)) {
                        rVar2.X(1149179927);
                        rVar2.R();
                        throw new oq.p();
                    }
                    rVar2.X(1265270550);
                    h0.v(((z62.a.C6275a) aVar2).getCardItem(), null, rVar2, 0, 2);
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing100()), rVar2, 0);
                    rVar2.R();
                }
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }
}
