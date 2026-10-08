package yb3;

import cc3.ScrollableField;
import d1.a3;
import d1.d3;
import d1.r3;
import f1.b1;
import f1.y0;
import i50.BaseScaffoldData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import pq.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\r\u001aA\u0010\u0018\u001a\u00020\u0002*\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00130\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Lyb3/l;", "viewModel", "Loq/i0;", "n", "(Lyb3/l;Lm2/r;I)V", "Lyb3/l$a$a;", "data", "i", "(Lyb3/l$a$a;Lm2/r;I)V", "Lf1/q0;", "Lmx/a;", "header", "s", "(Lf1/q0;Lmx/a;)V", "description", "q", "", "Lyb3/l$a$a$a;", "items", "", "", "Lga3/b;", "Lj1/a;", "stagePositionToRequesterMap", "u", "(Lf1/q0;Ljava/util/List;Ljava/util/Map;)V", "Lyb3/l$a;", "state", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f226103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f226105h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f226106j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f226107k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f226108l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ l.a.Initialized f226109m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ y0 f226110n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Map<Integer, Map<ga3.b, j1.a>> f226111p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l.a.Initialized initialized, y0 y0Var, Map<Integer, ? extends Map<ga3.b, ? extends j1.a>> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f226109m = initialized;
            this.f226110n = y0Var;
            this.f226111p = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(l.a.Initialized initialized, l.a.Initialized.StageData stageData) {
            return fr.t.c(stageData.getId(), initialized.getScrollToField().getId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final l.a.Initialized initialized;
            a aVar;
            Map<Integer, Map<ga3.b, j1.a>> map;
            int i15;
            int i16;
            int i17;
            l.a.Initialized initialized2;
            Object objE = uq.b.e();
            int i18 = this.f226108l;
            if (i18 != 0) {
                if (i18 == 1) {
                    i15 = this.f226106j;
                    i17 = this.f226105h;
                    i16 = this.f226104g;
                    l.a.Initialized initialized3 = (l.a.Initialized) this.f226103f;
                    Map<Integer, Map<ga3.b, j1.a>> map2 = (Map) this.f226102e;
                    oq.u.b(obj);
                    initialized = initialized3;
                    map = map2;
                    aVar = this;
                } else {
                    if (i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    initialized2 = (l.a.Initialized) this.f226102e;
                    oq.u.b(obj);
                }
                initialized = initialized2;
                initialized.d().a();
                return oq.i0.f148189a;
            }
            oq.u.b(obj);
            initialized = this.f226109m;
            y0 y0Var = this.f226110n;
            Map<Integer, Map<ga3.b, j1.a>> map3 = this.f226111p;
            if (initialized.getScrollToField() == null) {
                return oq.i0.f148189a;
            }
            Integer numB = yb3.b.b(initialized.g(), new er.l() { // from class: yb3.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return Boolean.valueOf(a0.a.O(initialized, (l.a.Initialized.StageData) obj2));
                }
            });
            if (numB != null) {
                int iIntValue = numB.intValue();
                this.f226102e = map3;
                this.f226103f = initialized;
                this.f226104g = 0;
                this.f226105h = iIntValue;
                this.f226106j = 0;
                this.f226108l = 1;
                aVar = this;
                if (y0.r(y0Var, iIntValue + 2, 0, aVar, 2, null) != objE) {
                    map = map3;
                    i15 = 0;
                    i16 = 0;
                    i17 = iIntValue;
                }
                return objE;
            }
            return oq.i0.f148189a;
            ga3.b focusType = initialized.getScrollToField().getFocusType();
            if (focusType != null) {
                j1.a aVar2 = (j1.a) v0.j((Map) v0.j(map, vq.b.e(i17)), focusType);
                aVar.f226102e = initialized;
                aVar.f226103f = vq.j.a(focusType);
                aVar.f226104g = i16;
                aVar.f226105h = i17;
                aVar.f226106j = i15;
                aVar.f226107k = 0;
                aVar.f226108l = 2;
                if (j1.a.a(aVar2, null, this, 1, null) != objE) {
                    initialized2 = initialized;
                    initialized = initialized2;
                }
                return objE;
            }
            initialized.d().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f226109m, this.f226110n, this.f226111p, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.p f226112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f226113b;

        public b(er.p pVar, List list) {
            this.f226112a = pVar;
            this.f226113b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f226112a.B(Integer.valueOf(i15), this.f226113b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f226114a;

        public c(List list) {
            this.f226114a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f226114a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f226115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f226116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f226117c;

        public d(List list, Map map, List list2) {
            this.f226115a = list;
            this.f226116b = map;
            this.f226117c = list2;
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
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            l.a.Initialized.StageData stageData = (l.a.Initialized.StageData) this.f226115a.get(i15);
            rVar.X(627846442);
            zb3.j.r(null, stageData, (Map) v0.j(this.f226116b, Integer.valueOf(i15)), rVar, 0, 1);
            if (i15 == pq.v.p(this.f226117c) || stageData.getAddNextButton() != null) {
                rVar.X(623420726);
            } else {
                rVar.X(628015577);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
            }
            rVar.R();
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    private static final void i(final l.a.Initialized initialized, p076m2.r rVar, final int i15) {
        p076m2.r rVar2;
        Object obj;
        p076m2.r rVarH = rVar.h(857728547);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(initialized) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(857728547, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.TripStagesContent (TripStagesScreen.kt:49)");
            }
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            boolean zC = rVarH.c(initialized.g().size());
            Object objE = rVarH.E();
            if (zC || objE == p076m2.r.INSTANCE.a()) {
                obj = objE;
                lr.i iVarO = pq.v.o(initialized.g());
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(iVarO, 10)), 16));
                for (Integer num : iVarO) {
                    num.intValue();
                    wq.a<ga3.b> aVarE = ga3.b.e();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                    Iterator<ga3.b> it = aVarE.iterator();
                    while (it.hasNext()) {
                        linkedHashMap2.put(it.next(), j1.e.a());
                    }
                    linkedHashMap.put(num, linkedHashMap2);
                }
                rVarH.v(linkedHashMap);
                obj = linkedHashMap;
            }
            obj = objE;
            final Map map = (Map) obj;
            ScrollableField scrollToField = initialized.getScrollToField();
            boolean zG = rVarH.G(initialized) | rVarH.W(y0VarC) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(initialized, y0VarC, map, null);
                rVarH.v(objE2);
            }
            Function0.d(scrollToField, (er.p) objE2, rVarH, 0);
            p076m2.r rVar3 = rVarH;
            i50.s.r(initialized.getScaffoldData(), y2.m.d(618370894, true, new er.p() { // from class: yb3.s
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return a0.j(initialized, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1152062890, true, new er.q() { // from class: yb3.t
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return a0.k(y0VarC, initialized, map, (d3) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVar3, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVar2 = rVar3;
            if (p076m2.t.k()) {
                p076m2.t.n();
                rVar2 = rVar3;
            }
        } else {
            p076m2.r rVar4 = rVarH;
            rVar4.O();
            rVar2 = rVar4;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: yb3.u
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return a0.m(initialized, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(l.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(618370894, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.TripStagesContent.<anonymous> (TripStagesScreen.kt:75)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(initialized.getButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 k(y0 y0Var, final l.a.Initialized initialized, final Map map, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1152062890, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.TripStagesContent.<anonymous> (TripStagesScreen.kt:80)");
            }
            f3.m mVarN = t70.s.n(a3.l(qa3.b.b(f3.m.INSTANCE), d3Var), rVar, 0);
            d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100());
            boolean zG = rVar.G(initialized) | rVar.G(map);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: yb3.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return a0.l(initialized, map, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarN, y0Var, null, false, fVarR, null, null, false, null, (er.l) objE, rVar, 0, 492);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(l.a.Initialized initialized, Map map, f1.q0 q0Var) {
        s(q0Var, initialized.getHeader());
        q(q0Var, initialized.getDescription());
        u(q0Var, initialized.g(), map);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(l.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        i(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void n(final l lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1097437744);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1097437744, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.TripStagesScreen (TripStagesScreen.kt:38)");
            }
            l.a aVarO = o(m7.b.c(lVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarO, l.a.b.f226262a)) {
                rVarH.X(1924288961);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarO instanceof l.a.Initialized)) {
                    rVarH.X(1924286967);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1924291086);
                i((l.a.Initialized) aVarO, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: yb3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.p(lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final l.a o(f6<? extends l.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(l lVar, int i15, p076m2.r rVar, int i16) {
        n(lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(f1.q0 q0Var, final Label label) {
        f1.q0.c(q0Var, null, null, y2.m.b(1346876721, true, new er.q() { // from class: yb3.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return a0.r(label, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1346876721, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.description.<anonymous> (TripStagesScreen.kt:107)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final void s(f1.q0 q0Var, final Label label) {
        f1.q0.c(q0Var, null, null, y2.m.b(-1987166802, true, new er.q() { // from class: yb3.w
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return a0.t(label, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1987166802, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.stages.header.<anonymous> (TripStagesScreen.kt:98)");
            }
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, k70.a.f108864a.f(rVar, k70.a.f108865b).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final void u(f1.q0 q0Var, List<l.a.Initialized.StageData> list, Map<Integer, ? extends Map<ga3.b, ? extends j1.a>> map) {
        q0Var.j(list.size(), new b(new er.p() { // from class: yb3.x
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return a0.v(((Integer) obj).intValue(), (l.a.Initialized.StageData) obj2);
            }
        }, list), new c(list), y2.m.b(2039820996, true, new d(list, map, list)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object v(int i15, l.a.Initialized.StageData stageData) {
        return stageData.getId();
    }
}
