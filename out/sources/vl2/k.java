package vl2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import java.io.IOException;
import java.util.List;
import k40.EmptyStateData;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\r\u001a\u00020\u0002*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lvl2/c;", "viewModel", "Loq/i0;", "l", "(Lvl2/c;Lm2/r;I)V", "Lvl2/c$a$a;", "data", "i", "(Lvl2/c$a$a;Lm2/r;I)V", "Ld1/h0;", "", "Lvl2/c$a$a$a;", "items", "f", "(Ld1/h0;Ljava/util/List;Lm2/r;I)V", "Lvl2/c$a;", "state", "nationalcourtregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vl2.c.a.Content.InterfaceC5432a f207284a;

        a(vl2.c.a.Content.InterfaceC5432a interfaceC5432a) {
            this.f207284a = interfaceC5432a;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1649310128, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.welcome.ItemsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WelcomeScreen.kt:78)");
            }
            k40.d.c(null, ((vl2.c.a.Content.InterfaceC5432a.Empty) this.f207284a).getEmptyStateData(), rVar, EmptyStateData.f108236d << 3, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f207285a;

        public b(List list) {
            this.f207285a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f207285a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f207286a;

        public c(List list) {
            this.f207286a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            p076m2.r rVar2 = rVar;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar2.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar2.c(i15) ? 32 : 16;
            }
            if (!rVar2.r((i17 & 147) != 146, i17 & 1)) {
                rVar2.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            vl2.c.a.Content.InterfaceC5432a interfaceC5432a = (vl2.c.a.Content.InterfaceC5432a) this.f207286a.get(i15);
            rVar2.X(602501159);
            if (interfaceC5432a instanceof vl2.c.a.Content.InterfaceC5432a.Empty) {
                rVar2.X(602525431);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                x30.c.c(null, 0.0f, y2.m.d(-1649310128, true, new a(interfaceC5432a), rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
                rVar2.R();
            } else if (interfaceC5432a instanceof Header) {
                rVar2.X(602794604);
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i18).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, ((Header) interfaceC5432a).getListHeader(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                rVar2.R();
            } else {
                if (!(interfaceC5432a instanceof Entry)) {
                    rVar2.X(-1227490468);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(603070721);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
                h0.v(((Entry) interfaceC5432a).getItem(), null, rVar2, 0, 2);
                rVar2.R();
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    public static final void f(final d1.h0 h0Var, final List<? extends vl2.c.a.Content.InterfaceC5432a> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1850448797);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(h0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1850448797, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.welcome.ItemsContent (WelcomeScreen.kt:67)");
            }
            f3.m mVarB = d1.h0.b(h0Var, f3.m.INSTANCE, 1.0f, false, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            boolean zG = rVarH.G(list);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: vl2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k.g(list, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            rVar2 = rVarH;
            f1.d.c(null, null, null, false, null, null, null, false, null, (er.l) objE, rVar2, 0, 511);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: vl2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(h0Var, list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(List list, q0 q0Var) {
        q0Var.j(list.size(), null, new b(list), y2.m.b(2039820996, true, new c(list)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d1.h0 h0Var, List list, int i15, p076m2.r rVar, int i16) {
        f(h0Var, list, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final vl2.c.a.Content content, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-14502660);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(content) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-14502660, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.welcome.WelcomeContent (WelcomeScreen.kt:49)");
            }
            rVar2 = rVarH;
            i50.s.r(content.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1867096087, true, new er.q() { // from class: vl2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.j(content, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: vl2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(content, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(vl2.c.a.Content content, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1867096087, i15, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.welcome.WelcomeContent.<anonymous> (WelcomeScreen.kt:53)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o40.j.i(content.getHeaderData(), rVar, 0);
            f(i0Var, content.d(), rVar, 6);
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
    public static final i0 k(vl2.c.a.Content content, int i15, p076m2.r rVar, int i16) {
        i(content, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final vl2.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1544699030);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1544699030, i16, -1, "pl.gov.coi.mobywatel.feature.nationalcourtregister.presentation.screens.welcome.WelcomeScreen (WelcomeScreen.kt:34)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            vl2.c.a aVarM = m(f6VarC);
            if (aVarM instanceof vl2.c.a.Loading) {
                rVarH.X(-1602910617);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarM instanceof vl2.c.a.Content) {
                rVarH.X(-1602908719);
                i((vl2.c.a.Content) aVarM, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarM instanceof vl2.c.a.Error)) {
                    rVarH.X(-1602912552);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1602905922);
                ((vl2.c.a.Error) aVarM).getErrorVMSAdapter().b(rVarH, 0);
                rVarH.R();
            }
            p088nul.q0.g(false, m(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: vl2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.n(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final vl2.c.a m(f6<? extends vl2.c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(vl2.c cVar, int i15, p076m2.r rVar, int i16) {
        l(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
