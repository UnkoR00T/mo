package g22;

import d1.a3;
import d1.d3;
import d1.e0;
import i50.BaseScaffoldData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ju.p0;
import n50.h0;
import oq.i0;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import pq.v0;
import w0.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lg22/d;", "viewModel", "Loq/i0;", "g", "(Lg22/d;Lm2/r;I)V", "Lg22/d$a;", "state", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f69904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f69905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f69906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f69907h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f6<d.Data> f69908j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<d.Data.b, j1.a> f69909k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f6<d.Data> f6Var, Map<d.Data.b, ? extends j1.a> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f69908j = f6Var;
            this.f69909k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            f6<d.Data> f6Var;
            Object objE = uq.b.e();
            int i15 = this.f69907h;
            if (i15 == 0) {
                oq.u.b(obj);
                d.Data.b fieldTypeToScroll = k.j(this.f69908j).getFieldTypeToScroll();
                if (fieldTypeToScroll != null) {
                    Map<d.Data.b, j1.a> map = this.f69909k;
                    f6<d.Data> f6Var2 = this.f69908j;
                    j1.a aVar = (j1.a) v0.j(map, fieldTypeToScroll);
                    this.f69904e = f6Var2;
                    this.f69905f = vq.j.a(fieldTypeToScroll);
                    this.f69906g = 0;
                    this.f69907h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    f6Var = f6Var2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6Var = (f6) this.f69904e;
            oq.u.b(obj);
            k.j(f6Var).g().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f69908j, this.f69909k, eVar);
        }
    }

    public static final void g(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(495649622);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(495649622, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactdetails.ContactDetailsScreen (ContactDetailsScreen.kt:37)");
            }
            final f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<d.Data.b> aVarE = d.Data.b.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<d.Data.b> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            final Map map = (Map) objE;
            d.Data.b fieldTypeToScroll = j(f6VarC).getFieldTypeToScroll();
            boolean zW = rVarH.W(f6VarC) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zW || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(f6VarC, map, null);
                rVarH.v(objE2);
            }
            Function0.d(fieldTypeToScroll, (er.p) objE2, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(j(f6VarC).getBaseScaffoldData(), y2.m.d(1681046273, true, new er.p() { // from class: g22.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.k(f6VarC, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-117626359, true, new er.q() { // from class: g22.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.l(f6VarC, map, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g22.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.p(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d60.c h(final f6<d.Data> f6Var, final d.Data.InterfaceC1577a interfaceC1577a, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-771626878, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactdetails.ContactDetailsScreen.createFieldFocusHost (ContactDetailsScreen.kt:46)");
        }
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar.G(interfaceC1577a)) || (i15 & 6) == 4) | rVar.W(f6Var);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: g22.j
                @Override // er.l
                public final Object b(Object obj) {
                    return k.i(interfaceC1577a, f6Var, ((Boolean) obj).booleanValue());
                }
            };
            rVar.v(objE);
        }
        d60.c cVarB = d60.e.b(false, (er.l) objE, rVar, 0, 1);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return cVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d.Data.InterfaceC1577a interfaceC1577a, f6 f6Var, boolean z15) {
        j(f6Var).f().B(interfaceC1577a, Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d.Data j(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1681046273, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactdetails.ContactDetailsScreen.<anonymous> (ContactDetailsScreen.kt:66)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
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
            h30.q.p(j(f6Var).getNextButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 l(final f6 f6Var, final Map map, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-117626359, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactdetails.ContactDetailsScreen.<anonymous> (ContactDetailsScreen.kt:75)");
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
            m30.c.c(null, y2.m.d(-712546068, true, new er.p() { // from class: g22.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.m(f6Var, map, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 48, 1);
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
    public static final i0 m(f6 f6Var, Map map, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-712546068, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactdetails.ContactDetailsScreen.<anonymous>.<anonymous>.<anonymous> (ContactDetailsScreen.kt:83)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
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
            d1.i0 i0Var = d1.i0.f39176a;
            h0.v(j(f6Var).getNameAndSurname(), null, rVar, 0, 2);
            n(rVar, 0);
            h0.v(j(f6Var).getPesel(), null, rVar, 0, 2);
            n(rVar, 0);
            rVar.x();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarP = a3.p(companion, 0.0f, aVar.b(rVar, i16).getSpacing200(), 1, null);
            w0 w0VarA2 = e0.a(iVar.r(aVar.b(rVar, i16).getSpacing200()), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarP);
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
            rVar.X(1586715907);
            for (d.Data.InterfaceC1577a interfaceC1577a : j(f6Var).c()) {
                f3.m mVarC = q0.c(a3.p(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null), false, null, 2, null);
                Object objE = rVar.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: g22.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return k.o((n4.i0) obj);
                        }
                    };
                    rVar.v(objE);
                }
                f3.m mVarB = j1.e.b(n4.v.d(mVarC, false, (er.l) objE, 1, null), (j1.a) v0.j(map, interfaceC1577a.getType()));
                w0 w0VarA3 = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT3 = rVar.t();
                f3.m mVarE3 = f3.j.e(rVar, mVarB);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB3);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC3 = n6.c(rVar);
                n6.i(rVarC3, w0VarA3, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                if (!(interfaceC1577a instanceof d.Data.InterfaceC1577a.TextInput)) {
                    rVar.X(1601274176);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1601277415);
                u50.v0.g(((d.Data.InterfaceC1577a.TextInput) interfaceC1577a).getTextInputData(), h(f6Var, interfaceC1577a, rVar, 0), rVar, v50.c.f203957t, 0);
                rVar.R();
                rVar.x();
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private static final void n(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(198856611, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.contactdetails.ContactDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.Divider (ContactDetailsScreen.kt:85)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        vb.h(a3.p(companion, aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null), aVar.b(rVar, i16).getStrokeWidth(), aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(d dVar, int i15, p076m2.r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
