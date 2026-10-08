package fu1;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import hu1.FormFieldData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.p0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lfu1/c;", "viewModel", "Loq/i0;", "i", "(Lfu1/c;Lm2/r;I)V", "Lfu1/c$a;", "data", "l", "(Lfu1/c$a;Lm2/r;I)V", "f", "driverqualifications_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f67149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f67150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f67151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f67152h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.Data f67153j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<FormFieldData.EnumC2027a, j1.a> f67154k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.Data data, Map<FormFieldData.EnumC2027a, ? extends j1.a> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f67153j = data;
            this.f67154k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c.Data data;
            Object objE = uq.b.e();
            int i15 = this.f67152h;
            if (i15 == 0) {
                oq.u.b(obj);
                FormFieldData.EnumC2027a typeToScroll = this.f67153j.getTypeToScroll();
                if (typeToScroll != null) {
                    Map<FormFieldData.EnumC2027a, j1.a> map = this.f67154k;
                    c.Data data2 = this.f67153j;
                    j1.a aVar = (j1.a) v0.j(map, typeToScroll);
                    this.f67149e = data2;
                    this.f67150f = vq.j.a(typeToScroll);
                    this.f67151g = 0;
                    this.f67152h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    data = data2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            data = (c.Data) this.f67149e;
            oq.u.b(obj);
            data.e().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f67153j, this.f67154k, eVar);
        }
    }

    private static final void f(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1891343820);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1891343820, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.welcome.FormSection (WelcomeScreen.kt:69)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<FormFieldData.EnumC2027a> aVarE = FormFieldData.EnumC2027a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<FormFieldData.EnumC2027a> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            final Map map = (Map) objE;
            FormFieldData.EnumC2027a typeToScroll = data.getTypeToScroll();
            boolean zG = rVarH.G(data) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(data, map, null);
                rVarH.v(objE2);
            }
            Function0.d(typeToScroll, (er.p) objE2, rVarH, 0);
            x30.c.c(null, 0.0f, y2.m.d(720267787, true, new er.p() { // from class: fu1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(data, map, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fu1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.Data data, Map map, p076m2.r rVar, int i15) {
        float spacing100;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(720267787, i15, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.welcome.FormSection.<anonymous> (WelcomeScreen.kt:80)");
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
            rVar.X(35939361);
            List<FormFieldData> listB = data.b();
            int size = listB.size();
            for (int i16 = 0; i16 < size; i16++) {
                FormFieldData formFieldData = listB.get(i16);
                f3.m mVarB = j1.e.b(f3.m.INSTANCE, (j1.a) v0.j(map, formFieldData.getType()));
                if (i16 != pq.v.p(data.b())) {
                    rVar.X(-931762476);
                    spacing100 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
                    rVar.R();
                } else {
                    rVar.X(-931697004);
                    spacing100 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100();
                    rVar.R();
                }
                f3.m mVarR = a3.r(mVarB, 0.0f, 0.0f, 0.0f, spacing100, 7, null);
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarR);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
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
                n6.i(rVarC2, w0VarI, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                d1.x xVar = d1.x.f39368a;
                u50.v0.g(formFieldData.getTextInputData(), null, rVar, v50.c.f203957t, 2);
                rVar.x();
            }
            rVar.R();
            j30.f.e(null, data.getFormNumberInfoButtonData(), false, rVar, ButtonTextData.f99099f << 3, 5);
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
    public static final i0 h(c.Data data, int i15, p076m2.r rVar, int i16) {
        f(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-2107389687);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2107389687, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.welcome.WelcomeScreen (WelcomeScreen.kt:33)");
            }
            l(j(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: fu1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data j(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c cVar, int i15, p076m2.r rVar, int i16) {
        i(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void l(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1662792262);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1662792262, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.welcome.WelcomeScreenContent (WelcomeScreen.kt:41)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1808913139, true, new er.q() { // from class: fu1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.m(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: fu1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.Data data, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1808913139, i16, -1, "pl.gov.coi.mobywatel.feature.driverqualifications.presentation.welcome.WelcomeScreenContent.<anonymous> (WelcomeScreen.kt:43)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(a3.r(mVarL, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
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
            f3.m mVarR = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
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
            o40.j.i(data.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            f(data, rVar, 0);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(data.getCheckDriverQualificationsButtonData(), false, null, rVar, 0, 6);
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
    public static final i0 n(c.Data data, int i15, p076m2.r rVar, int i16) {
        l(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
