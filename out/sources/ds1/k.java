package ds1;

import d1.a3;
import d1.e0;
import d1.i0;
import d1.r3;
import h30.ButtonData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import u50.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lds1/g;", "viewModel", "Loq/i0;", "g", "(Lds1/g;Lm2/r;I)V", "Lds1/g$a;", "data", "d", "(Lds1/g$a;Lm2/r;I)V", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    /* JADX WARN: Code duplicated, block: B:49:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x02f0  */
    public static final void d(g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        boolean z15;
        Object objE;
        final g.Data data2 = data;
        p076m2.r rVarH = rVar.h(-435439750);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(data2) : rVarH.G(data2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-435439750, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.setappversion.DeveloperSetAppVersionInitialized (DeveloperSetAppVersionScreen.kt:42)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            i0 i0Var = i0.f39176a;
            p70.g.f153260a.o(mx.b.b("Ustaw wersję aplikacji", ""), data2.c(), rVarH, p70.g.f153262c << 6);
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200());
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            int i18 = i16;
            j70.h.g(null, null, mx.b.b("Na tym ekranie możesz ustawić wersję aplikacji która będzie wysyłana w headerze do back end. Pozwala to na zasymulowania zawołań z apki o niższej, konkretnie przez nas ustawionej wersji. Celem tego jest m.in. ułatwienie testów wymuszenia aktualizacji.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVarH, 0, 0, 0, 33554427);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Obecna wersja aplikacji:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            j70.h.g(null, null, data.getCurrentAppVersion(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            v0.g(data.getInputData(), null, rVarH, v50.c.Text.P, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing600()), rVarH, 0);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Ustaw", ""), null, 2, null), k30.d.a.f107773a, null, data.e(), 35, null), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Zresetuj ustawioną wersję", ""), null, 2, null), new k30.d.Secondary(null, 1, null), null, data.d(), 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if ((i18 & 14) != 4) {
                if ((i18 & 8) != 0) {
                    data2 = data;
                    if (rVarH.G(data2)) {
                    }
                    objE = rVarH.E();
                    if (z15 || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: ds1.h
                            @Override // er.a
                            public final Object a() {
                                return k.e(data2);
                            }
                        };
                        rVarH.v(objE);
                    }
                    q0.g(false, (er.a) objE, rVarH, 0, 1);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    data2 = data;
                }
                z15 = false;
                objE = rVarH.E();
                if (z15) {
                    objE = new er.a() { // from class: ds1.h
                        @Override // er.a
                        public final Object a() {
                            return k.e(data2);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: ds1.h
                        @Override // er.a
                        public final Object a() {
                            return k.e(data2);
                        }
                    };
                    rVarH.v(objE);
                }
                q0.g(false, (er.a) objE, rVarH, 0, 1);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                data2 = data;
            }
            z15 = true;
            objE = rVarH.E();
            if (z15) {
                objE = new er.a() { // from class: ds1.h
                    @Override // er.a
                    public final Object a() {
                        return k.e(data2);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: ds1.h
                    @Override // er.a
                    public final Object a() {
                        return k.e(data2);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ds1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.f(data2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(g.Data data) {
        data.c().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(g.Data data, int i15, p076m2.r rVar, int i16) {
        d(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-139492476);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-139492476, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.setappversion.DeveloperSetAppVersionScreen (DeveloperSetAppVersionScreen.kt:31)");
            }
            d(h(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, v50.c.Text.P);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ds1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.i(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data h(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(g gVar, int i15, p076m2.r rVar, int i16) {
        g(gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
