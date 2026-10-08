package q63;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import p088nul.q0;
import pq.v0;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lq63/d;", "viewModel", "Loq/i0;", "f", "(Lq63/d;Lm2/r;I)V", "Lq63/d$a;", "data", "i", "(Lq63/d$a;Lm2/r;I)V", "Lq63/d$a$b;", "k", "(Lq63/d$a$b;Lm2/r;I)V", "state", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f165084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f165085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f165086h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d.a.Initialized f165087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<c0, j1.a> f165088k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d.a.Initialized initialized, Map<c0, ? extends j1.a> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f165087j = initialized;
            this.f165088k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d.a.Initialized initialized;
            Object objE = uq.b.e();
            int i15 = this.f165086h;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 scrollToError = this.f165087j.getScrollToError();
                if (scrollToError != null) {
                    Map<c0, j1.a> map = this.f165088k;
                    d.a.Initialized initialized2 = this.f165087j;
                    j1.a aVar = (j1.a) v0.j(map, scrollToError);
                    this.f165083e = initialized2;
                    this.f165084f = vq.j.a(scrollToError);
                    this.f165085g = 0;
                    this.f165086h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    initialized = initialized2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initialized = (d.a.Initialized) this.f165083e;
            oq.u.b(obj);
            initialized.e().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f165087j, this.f165088k, eVar);
        }
    }

    public static final void f(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-647162263);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-647162263, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.add.AddEmailFormScreen (AddEmailScreen.kt:35)");
            }
            i(g(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q63.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.h(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a g(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(d dVar, int i15, p076m2.r rVar, int i16) {
        f(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final d.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1027327066);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1027327066, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.add.AddEmailFormScreenContent (AddEmailScreen.kt:42)");
            }
            if (fr.t.c(aVar, d.a.C4111a.f165060a)) {
                rVarH.X(836443226);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.Initialized)) {
                    rVarH.X(581169880);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(581172976);
                k((d.a.Initialized) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: q63.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.j(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d.a aVar, int i15, p076m2.r rVar, int i16) {
        i(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final d.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(189057243);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(189057243, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.add.AddEmailScreenFormInitialized (AddEmailScreen.kt:50)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<c0> aVarE = c0.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<c0> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            final Map map = (Map) objE;
            c0 scrollToError = initialized.getScrollToError();
            boolean zG = rVarH.G(initialized) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(initialized, map, null);
                rVarH.v(objE2);
            }
            Function0.d(scrollToError, (er.p) objE2, rVarH, 0);
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1853425208, true, new er.q() { // from class: q63.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.l(initialized, map, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            q0.g(false, initialized.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: q63.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.n(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    public static final i0 l(final d.a.Initialized initialized, final Map map, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        k70.a aVar;
        int i17;
        f3.m.Companion companion;
        ?? r15;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1853425208, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.add.AddEmailScreenFormInitialized.<anonymous> (AddEmailScreen.kt:63)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), d3Var);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar2.b(rVar, i18).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarR = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion2, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar2.b(rVar, i18).getSpacing100(), 0.0f, aVar2.b(rVar, i18).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i18).getSpacing300()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1899154667, true, new er.p() { // from class: q63.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(map, initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
            p076m2.r rVar2 = rVar;
            CheckBoxSingleData checkBoxData = initialized.getContentData().getCheckBoxData();
            if (checkBoxData == null) {
                rVar2.X(-1118399155);
                rVar2.R();
                r15 = 0;
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
            } else {
                rVar2.X(-1118399154);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
                aVar = aVar2;
                j70.h.g(null, null, initialized.getContentData().getStatementTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
                rVar2 = rVar;
                i17 = i18;
                r15 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
                f3.m mVarB = j1.e.b(companion, (j1.a) v0.j(map, c0.STATEMENT));
                w0 w0VarI = d1.r.i(companion3.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT3 = rVar2.t();
                f3.m mVarE3 = f3.j.e(rVar2, mVarB);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                if (rVar2.l() == null) {
                    companion = companion2;
                    p076m2.m.d();
                }
                companion = companion2;
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB3);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC3 = n6.c(rVar2);
                n6.i(rVarC3, w0VarI, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                d1.x xVar = d1.x.f39368a;
                v30.d.f(checkBoxData, rVar2, CheckBoxSingleData.f210090f);
                rVar2.x();
                i0 i0Var = i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            f3.m mVarP2 = a3.p(companion, 0.0f, aVar.b(rVar2, i17).getSpacing200(), 1, null);
            w0 w0VarI2 = d1.r.i(companion3.o(), r15);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, r15));
            p076m2.e0 e0VarT4 = rVar2.t();
            f3.m mVarE4 = f3.j.e(rVar2, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB4);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC4 = n6.c(rVar2);
            n6.i(rVarC4, w0VarI2, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            d1.x xVar2 = d1.x.f39368a;
            h30.q.p(initialized.getButtonData(), false, null, rVar2, 0, 6);
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
    public static final i0 m(Map map, d.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1899154667, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.email.add.AddEmailScreenFormInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddEmailScreen.kt:81)");
            }
            f3.m mVarB = j1.e.b(f3.m.INSTANCE, (j1.a) v0.j(map, c0.EMAIL));
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
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
            u50.v0.g(initialized.getContentData().getEmailTextInputData(), null, rVar, v50.c.f203957t, 2);
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
    public static final i0 n(d.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
