package vg2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import j50.f0;
import java.util.List;
import ju.p0;
import mx.Label;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lvg2/c;", "viewModel", "Loq/i0;", "l", "(Lvg2/c;Lm2/r;I)V", "Lvg2/c$a$a;", "data", "o", "(Lvg2/c$a$a;Lm2/r;I)V", "Lvg2/c$a$a$a;", "h", "(Lvg2/c$a$a$a;Lm2/r;I)V", "Lvg2/c$a;", "landregistry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f206739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f206740f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f206740f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f206739e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f206740f;
                this.f206739e = 1;
                if (y0.r(y0Var, 0, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f206740f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f206741a = new b();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f206742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f206743b;

        public c(er.l lVar, List list) {
            this.f206742a = lVar;
            this.f206743b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f206742a.b(this.f206743b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f206744a;

        public d(List list) {
            this.f206744a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            n50.k kVar = (n50.k) this.f206744a.get(i15);
            rVar.X(-428220184);
            h0.v(kVar, null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            rVar.R();
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

    private static final void h(final vg2.c.a.InterfaceC5408a.Cards cards, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1174547571);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(cards) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1174547571, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.neworder.yourregistries.RegistriesCardsListContent (YourRegistriesScreen.kt:97)");
            }
            y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            String query = cards.getSearchBarData().getQuery();
            boolean zW = rVarH.W(y0VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(y0VarC, null);
                rVarH.v(objE);
            }
            Function0.d(query, (er.p) objE, rVarH, 0);
            boolean zG = rVarH.G(cards);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: vg2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.i(cards, (q0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f1.d.c(null, y0VarC, null, false, null, null, null, false, null, (er.l) objE2, rVarH, 0, 509);
            if (cards.f().isEmpty()) {
                rVarH.X(152587682);
                f3.m.Companion companion = f3.m.INSTANCE;
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                f3.m mVarR = a3.r(mVarF, 0.0f, 0.0f, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 7, null);
                w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVarH, 54);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarR);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
                n6.i(rVarC, w0VarA, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                d1.i0 i0Var = d1.i0.f39176a;
                Label noSearchResultLabelTitle = cards.getNoSearchResultLabelTitle();
                TextStyle textStyleA = aVar.f(rVarH, i17).a();
                b5.j.Companion companion3 = b5.j.INSTANCE;
                j70.h.g(null, null, noSearchResultLabelTitle, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, textStyleA, null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                j70.h.g(null, null, cards.getNoSearchResultLabelSubtitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                rVarH = rVarH;
                rVarH.x();
            } else {
                rVarH.X(148280821);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: vg2.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.k(cards, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(vg2.c.a.InterfaceC5408a.Cards cards, q0 q0Var) {
        q0 q0Var2;
        final c30.b info = cards.getInfo();
        if (info != null) {
            q0Var2 = q0Var;
            q0.c(q0Var2, null, null, y2.m.b(986236643, true, new er.q() { // from class: vg2.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.j(info, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            q0Var2 = q0Var;
        }
        List<n50.k> listF = cards.f();
        q0Var2.j(listF.size(), null, new c(b.f206741a, listF), y2.m.b(802480018, true, new d(listF)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c30.b bVar, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(986236643, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.neworder.yourregistries.RegistriesCardsListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (YourRegistriesScreen.kt:108)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            c30.e.c(null, bVar, rVar, c30.b.f22944i << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
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
    public static final i0 k(vg2.c.a.InterfaceC5408a.Cards cards, int i15, p076m2.r rVar, int i16) {
        h(cards, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final vg2.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1690231483);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1690231483, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.neworder.yourregistries.YourRegistriesScreen (YourRegistriesScreen.kt:38)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            vg2.c.a aVarM = m(f6VarC);
            if (aVarM instanceof vg2.c.a.Initial) {
                rVarH.X(-814811626);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarM instanceof vg2.c.a.InterfaceC5408a) {
                rVarH.X(-814809965);
                o((vg2.c.a.InterfaceC5408a) aVarM, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarM instanceof vg2.c.a.Error)) {
                    rVarH.X(-814813467);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-814806899);
                ((vg2.c.a.Error) aVarM).getAdapter().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: vg2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.n(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final vg2.c.a m(f6<? extends vg2.c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(vg2.c cVar, int i15, p076m2.r rVar, int i16) {
        l(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final vg2.c.a.InterfaceC5408a interfaceC5408a, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(700636295);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(interfaceC5408a) : rVarH.G(interfaceC5408a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(700636295, i16, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.neworder.yourregistries.YourRegistriesScreenContent (YourRegistriesScreen.kt:53)");
            }
            rVar2 = rVarH;
            i50.s.r(interfaceC5408a.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-92379014, true, new er.q() { // from class: vg2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.p(interfaceC5408a, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: vg2.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.r(interfaceC5408a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(final vg2.c.a.InterfaceC5408a interfaceC5408a, d3 d3Var, p076m2.r rVar, int i15) {
        float spacing200;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-92379014, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.neworder.yourregistries.YourRegistriesScreenContent.<anonymous> (YourRegistriesScreen.kt:57)");
            }
            if (interfaceC5408a instanceof vg2.c.a.InterfaceC5408a.Empty) {
                rVar.X(1418083292);
                q40.i.b(((vg2.c.a.InterfaceC5408a.Empty) interfaceC5408a).c(), null, null, rVar, 0, 6);
                rVar.R();
            } else {
                if (!(interfaceC5408a instanceof vg2.c.a.InterfaceC5408a.Cards)) {
                    rVar.X(1418082614);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1418086669);
                f3.m.Companion companion = f3.m.INSTANCE;
                f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
                vg2.c.a.InterfaceC5408a.Cards cards = (vg2.c.a.InterfaceC5408a.Cards) interfaceC5408a;
                if (cards.getSearchBarData().getIsActive()) {
                    rVar.X(1011156722);
                    spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
                    rVar.R();
                } else {
                    rVar.X(1011216428);
                    spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                    rVar.R();
                }
                f3.m mVarP = a3.p(mVarL, spacing200, 0.0f, 2, null);
                w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarP);
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
                f0.A(null, cards.getSearchBarData(), y2.m.d(-1976674011, true, new er.p() { // from class: vg2.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l.q(interfaceC5408a, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 1);
                if (cards.getSearchBarData().getIsActive()) {
                    rVar.X(451731935);
                } else {
                    rVar.X(454995925);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
                    h(cards, rVar, 0);
                }
                rVar.R();
                p088nul.q0.g(false, cards.a(), rVar, 0, 1);
                rVar.x();
                rVar.R();
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
    public static final i0 q(vg2.c.a.InterfaceC5408a interfaceC5408a, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1976674011, i15, -1, "pl.gov.coi.mobywatel.feature.landregistry.presentation.neworder.yourregistries.YourRegistriesScreenContent.<anonymous>.<anonymous>.<anonymous> (YourRegistriesScreen.kt:72)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing200(), 0.0f, 0.0f, 13, null), aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            h((vg2.c.a.InterfaceC5408a.Cards) interfaceC5408a, rVar, 0);
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
    public static final i0 r(vg2.c.a.InterfaceC5408a interfaceC5408a, int i15, p076m2.r rVar, int i16) {
        o(interfaceC5408a, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
