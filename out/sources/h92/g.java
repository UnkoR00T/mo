package h92;

import a50.RadioButtonData;
import androidx.compose.ui.platform.g1;
import d1.a3;
import d1.h0;
import d1.r3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ju.p0;
import n40.FilePickerData;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import pq.v0;
import t50.TextAreaData;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lh92/c;", "viewModel", "Loq/i0;", "g", "(Lh92/c;Lm2/r;I)V", "Lh92/c$a;", "data", "d", "(Lh92/c$a;Lm2/r;I)V", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f82062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f82063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f82064g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f82065h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.Data f82066j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<l92.a, j1.a> f82067k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.Data data, Map<l92.a, ? extends j1.a> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f82066j = data;
            this.f82067k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c.Data data;
            Object objE = uq.b.e();
            int i15 = this.f82065h;
            if (i15 == 0) {
                oq.u.b(obj);
                l92.a scrollToField = this.f82066j.getScrollToField();
                if (scrollToField != null) {
                    Map<l92.a, j1.a> map = this.f82067k;
                    c.Data data2 = this.f82066j;
                    j1.a aVar = (j1.a) v0.j(map, scrollToField);
                    this.f82062e = data2;
                    this.f82063f = vq.j.a(scrollToField);
                    this.f82064g = 0;
                    this.f82065h = 1;
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
            data = (c.Data) this.f82062e;
            oq.u.b(obj);
            data.h().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f82066j, this.f82067k, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.Data f82069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l3.o f82070g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c.Data data, l3.o oVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f82069f = data;
            this.f82070g = oVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f82068e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f82069f.getIsFocusRemoved()) {
                this.f82070g.B(true);
                this.f82069f.g().a();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f82069f, this.f82070g, eVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(final c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1256077431);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1256077431, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationdescription.ViolationDescriptionInitializedContent (ViolationDescriptionScreen.kt:46)");
            }
            f3 f3VarB = u2.b(0, rVarH, 0, 1);
            l3.o oVar = (l3.o) rVarH.N(g1.g());
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<l92.a> aVarE = l92.a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<l92.a> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            final Map map = (Map) objE;
            l92.a scrollToField = data.getScrollToField();
            int i17 = i16 & 14;
            boolean zG = (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(data))) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(data, map, null);
                rVarH.v(objE2);
            }
            Function0.d(scrollToField, (er.p) objE2, rVarH, 0);
            Boolean boolValueOf = Boolean.valueOf(data.getIsFocusRemoved());
            boolean zG2 = (i17 == 4 || ((i16 & 8) != 0 && rVarH.G(data))) | rVarH.G(oVar);
            Object objE3 = rVarH.E();
            if (zG2 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new b(data, oVar, null);
                rVarH.v(objE3);
            }
            Function0.d(boolValueOf, (er.p) objE3, rVarH, 0);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarP = a3.p(w0.i.d(mVarF, aVar.a(rVarH, i18).getBase().a(), null, 2, null), aVar.b(rVarH, i18).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
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
            f3.m mVarR = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), f3VarB, rVarH, 0, 0), 0.0f, aVar.b(rVarH, i18).getSpacing100(), 0.0f, aVar.b(rVarH, i18).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR);
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
            f3.m mVarB = j1.e.b(companion, (j1.a) v0.j(map, l92.a.OFFICE));
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d1.x xVar = d1.x.f39368a;
            a50.k.j(data.getRadioButtonData(), rVarH, RadioButtonData.f3462h);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, data.getFormTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
            x30.c.c(null, 0.0f, y2.m.d(-2073203562, true, new er.p() { // from class: h92.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.e(map, data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, data.getAddPhotoTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
            m40.c.c(j1.e.b(companion, (j1.a) v0.j(map, l92.a.PHOTO)), data.getImagePickerData(), rVarH, FilePickerData.f131319k << 3, 0);
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
            h30.q.p(data.getButtonNext(), false, null, rVarH, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing200()), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h92.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.f(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Map map, c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2073203562, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationdescription.ViolationDescriptionInitializedContent.<anonymous>.<anonymous>.<anonymous> (ViolationDescriptionScreen.kt:95)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
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
            f3.m mVarB = j1.e.b(companion, (j1.a) v0.j(map, l92.a.SUBJECT));
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
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
            u50.v0.g(data.getEntityTextInputData(), null, rVar, v50.c.f203957t, 2);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            f3.m mVarB2 = j1.e.b(companion, (j1.a) v0.j(map, l92.a.DESCRIPTION));
            w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarB2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
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
            n6.i(rVarC3, w0VarI2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            t50.r.m(data.getCaseDescriptionTextInputData(), null, rVar, TextAreaData.f187694o, 2);
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
    public static final i0 f(c.Data data, int i15, p076m2.r rVar, int i16) {
        d(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1675703694);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1675703694, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.violationdescription.ViolationDescriptionScreen (ViolationDescriptionScreen.kt:38)");
            }
            d(h(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, RadioButtonData.f3462h | v50.c.f203957t | TextAreaData.f187694o | FilePickerData.f131319k);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h92.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.i(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.Data h(f6<c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c cVar, int i15, p076m2.r rVar, int i16) {
        g(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
