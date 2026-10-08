package j82;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.r3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.p0;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0013\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lj82/c;", "viewModel", "Loq/i0;", "i", "(Lj82/c;Lm2/r;I)V", "Lj82/c$a;", "data", "l", "(Lj82/c$a;Lm2/r;I)V", "Lj82/c$a$b;", "n", "(Lj82/c$a$b;Lm2/r;I)V", "", "Lj82/c$a$b$a;", "inputs", "", "Lm82/a;", "Lj1/a;", "bringIntoViewRequesterMap", "f", "(Ljava/util/List;Ljava/util/Map;Lm2/r;I)V", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f100221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f100222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f100223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f100224h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.a.InitializedData f100225j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<m82.a, j1.a> f100226k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a.InitializedData initializedData, Map<m82.a, ? extends j1.a> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f100225j = initializedData;
            this.f100226k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c.a.InitializedData initializedData;
            Object objE = uq.b.e();
            int i15 = this.f100224h;
            if (i15 == 0) {
                oq.u.b(obj);
                m82.a scrollToField = this.f100225j.getScrollToField();
                if (scrollToField != null) {
                    Map<m82.a, j1.a> map = this.f100226k;
                    c.a.InitializedData initializedData2 = this.f100225j;
                    j1.a aVar = (j1.a) v0.j(map, scrollToField);
                    this.f100221e = initializedData2;
                    this.f100222f = vq.j.a(scrollToField);
                    this.f100223g = 0;
                    this.f100224h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    initializedData = initializedData2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initializedData = (c.a.InitializedData) this.f100221e;
            oq.u.b(obj);
            initializedData.d().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f100225j, this.f100226k, eVar);
        }
    }

    private static final void f(final List<c.a.InitializedData.Input> list, final Map<m82.a, ? extends j1.a> map, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(166585443);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(map) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(166585443, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.applicantdetails.ApplicantDataForm (ApplicantDetailsScreen.kt:101)");
            }
            x30.c.c(null, 0.0f, y2.m.d(613239330, true, new er.p() { // from class: j82.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(list, map, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: j82.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(list, map, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(List list, Map map, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(613239330, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.applicantdetails.ApplicantDataForm.<anonymous> (ApplicantDetailsScreen.kt:103)");
            }
            d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(fVarR, f3.c.INSTANCE.k(), rVar, 0);
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
            rVar.X(701905163);
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                c.a.InitializedData.Input input = (c.a.InitializedData.Input) list.get(i16);
                f3.m mVarB = j1.e.b(f3.m.INSTANCE, (j1.a) v0.j(map, input.getType()));
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarB);
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
                u50.v0.g(input.getData(), null, rVar, v50.c.f203957t, 2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(List list, Map map, int i15, p076m2.r rVar, int i16) {
        f(list, map, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1228748347);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1228748347, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.applicantdetails.ApplicantDetailsScreen (ApplicantDetailsScreen.kt:35)");
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
            d5VarM.a(new er.p() { // from class: j82.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a j(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c cVar, int i15, p076m2.r rVar, int i16) {
        i(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1002235582);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1002235582, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.applicantdetails.ApplicantDetailsScreenContent (ApplicantDetailsScreen.kt:44)");
            }
            if (fr.t.c(aVar, c.a.C2349a.f100201a)) {
                rVarH.X(1012558366);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.InitializedData)) {
                    rVarH.X(-1075717197);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1075713481);
                n((c.a.InitializedData) aVar, rVarH, i16 & 14);
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
            d5VarM.a(new er.p() { // from class: j82.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(c.a aVar, int i15, p076m2.r rVar, int i16) {
        l(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
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
    public static final void n(final c.a.InitializedData initializedData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1801486596);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initializedData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1801486596, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.applicantdetails.ApplicantDetailsScreenInitializedContent (ApplicantDetailsScreen.kt:54)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<m82.a> aVarE = m82.a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<m82.a> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            Map map = (Map) objE;
            m82.a scrollToField = initializedData.getScrollToField();
            boolean zG = rVarH.G(initializedData) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(initializedData, map, null);
                rVarH.v(objE2);
            }
            Function0.d(scrollToField, (er.p) objE2, rVarH, 0);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
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
            f3.m mVarR2 = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVarH, 0, 1), 0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarR2);
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
            rVar2 = rVarH;
            j70.h.g(null, null, initializedData.getHeaderText(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            f(initializedData.c(), map, rVar2, 0);
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            h30.q.p(initializedData.getButtonData(), false, null, rVar2, 0, 6);
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
            d5VarM.a(new er.p() { // from class: j82.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(initializedData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(c.a.InitializedData initializedData, int i15, p076m2.r rVar, int i16) {
        n(initializedData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
