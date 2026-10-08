package sh3;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import f1.q0;
import he3.VehicleCardCustomContent;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n50.CustomSingleCardData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import vh3.VehicleListAddedByPaging;
import vh3.VehicleListAddedManually;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0018\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006\"²\u0006\f\u0010!\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lsh3/f;", "viewModel", "Loq/i0;", "v", "(Lsh3/f;Lm2/r;I)V", "Lsh3/f$a;", "data", "s", "(Lsh3/f$a;Lm2/r;I)V", "Ld1/d3;", "paddingValues", "Lsh3/f$a$c;", "m", "(Ld1/d3;Lsh3/f$a$c;Lm2/r;I)V", "Lsh3/f$a$b;", "y", "(Ld1/d3;Lsh3/f$a$b;Lm2/r;I)V", "Lka/a;", "Lhe3/d;", "pagingItems", "Lvh3/b;", "vehicleListAddedManually", "Lvh3/a;", "vehicleListAddedByPaging", "A", "(Lka/a;Lvh3/b;Lvh3/a;Lm2/r;I)V", "Lmx/a;", "title", "o", "(Lmx/a;Lm2/r;I)V", "Lsh3/f$a$a;", "q", "(Ld1/d3;Lsh3/f$a$a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f.a.List f181906f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ka.a<he3.d> f181907g;

        /* JADX INFO: renamed from: sh3.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C4680a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ka.a<he3.d> f181908a;

            C4680a(ka.a<he3.d> aVar) {
                this.f181908a = aVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(d dVar, tq.e<? super oq.i0> eVar) {
                if (!fr.t.c(dVar, d.a.f181745a)) {
                    throw new oq.p();
                }
                this.f181908a.k();
                return oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f.a.List list, ka.a<he3.d> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f181906f = list;
            this.f181907g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f181905e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.f0<d> f0VarD = this.f181906f.d();
                C4680a c4680a = new C4680a(this.f181907g);
                this.f181905e = 1;
                if (f0VarD.a(c4680a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f181906f, this.f181907g, eVar);
        }
    }

    public static final void A(final ka.a<he3.d> aVar, final VehicleListAddedManually vehicleListAddedManually, final VehicleListAddedByPaging vehicleListAddedByPaging, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1910930224);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(vehicleListAddedManually) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(vehicleListAddedByPaging) ? 256 : 128;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1910930224, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleSection (VehicleListScreen.kt:169)");
            }
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarI = a3.i(0.0f, aVar2.b(rVarH, i17).getSpacing100(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 5, null);
            boolean zG = rVarH.G(vehicleListAddedManually);
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar))) {
                z15 = true;
            }
            boolean zG2 = zG | z15 | rVarH.G(vehicleListAddedByPaging);
            Object objE = rVarH.E();
            if (zG2 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sh3.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.B(aVar, vehicleListAddedManually, vehicleListAddedByPaging, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 507);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sh3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.F(aVar, vehicleListAddedManually, vehicleListAddedByPaging, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(final ka.a aVar, final VehicleListAddedManually vehicleListAddedManually, final VehicleListAddedByPaging vehicleListAddedByPaging, q0 q0Var) {
        q0.c(q0Var, null, null, y2.m.b(589760485, true, new er.q() { // from class: sh3.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.C(vehicleListAddedManually, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (!aVar.h().isEmpty()) {
            q0.c(q0Var, null, null, y2.m.b(1359573504, true, new er.q() { // from class: sh3.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.D(vehicleListAddedByPaging, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        q0.e(q0Var, aVar.g(), null, null, y2.m.b(-280627090, true, new er.r() { // from class: sh3.h
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return s.E(aVar, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        if (fr.t.c(aVar.i().getAppend(), ja.w.Loading.f101205b)) {
            q0.c(q0Var, null, null, b.f181717a.b(), 3, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(VehicleListAddedManually vehicleListAddedManually, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(589760485, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleSection.<anonymous>.<anonymous>.<anonymous> (VehicleListScreen.kt:177)");
            }
            if (vehicleListAddedManually.b().isEmpty()) {
                rVar.X(-1162477891);
            } else {
                rVar.X(-175853556);
                Label title = vehicleListAddedManually.getTitle();
                if (title == null) {
                    rVar.X(-1156492939);
                } else {
                    rVar.X(-1156492938);
                    o(title, rVar, 0);
                }
                rVar.R();
            }
            rVar.R();
            List<he3.d> listB = vehicleListAddedManually.b();
            ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
            for (he3.d dVar : listB) {
                n50.h0.v(new CustomSingleCardData(dVar.getTestTag(), new VehicleCardCustomContent(dVar), dVar.c(), false, null, null, false, null, 248, null), null, rVar, CustomSingleCardData.f131996i, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                arrayList.add(oq.i0.f148189a);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(VehicleListAddedByPaging vehicleListAddedByPaging, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1359573504, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleSection.<anonymous>.<anonymous>.<anonymous> (VehicleListScreen.kt:199)");
            }
            Label title = vehicleListAddedByPaging.getTitle();
            if (title == null) {
                rVar.X(1512701924);
            } else {
                rVar.X(1512701925);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                o(title, rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(ka.a aVar, f1.e eVar, int i15, p076m2.r rVar, int i16) {
        int i17;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-280627090, i17, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleSection.<anonymous>.<anonymous>.<anonymous> (VehicleListScreen.kt:206)");
            }
            he3.d dVar = (he3.d) aVar.f(i15);
            if (dVar == null) {
                rVar.X(2139743698);
            } else {
                rVar.X(2139743699);
                n50.h0.v(new CustomSingleCardData(dVar.getTestTag(), new VehicleCardCustomContent(dVar), dVar.c(), false, null, null, false, null, 248, null), null, rVar, CustomSingleCardData.f131996i, 2);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(ka.a aVar, VehicleListAddedManually vehicleListAddedManually, VehicleListAddedByPaging vehicleListAddedByPaging, int i15, p076m2.r rVar, int i16) {
        A(aVar, vehicleListAddedManually, vehicleListAddedByPaging, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void m(final d3 d3Var, final f.a.Loader loader, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-2140226405);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(loader) : rVarH.G(loader) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2140226405, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.LoaderState (VehicleListScreen.kt:83)");
            }
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.p(w0.i.d(mVarL, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing500(), 0.0f, 2, null), 0.0f, 1, null);
            w0 w0VarA = d1.e0.a(fVarE, bVarG, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
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
            x70.f.g(loader.getLoaderData(), rVarH, x70.a.f217278b);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, loader.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).k(), null, Float.valueOf(-2.0f), false, false, null, rVar2, 6, 0, 0, 30928890);
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
            d5VarM.a(new er.p() { // from class: sh3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.n(d3Var, loader, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(d3 d3Var, f.a.Loader loader, int i15, p076m2.r rVar, int i16) {
        m(d3Var, loader, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void o(final Label label, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1728007765);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1728007765, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.TitleList (VehicleListScreen.kt:234)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030139);
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sh3.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.p(label, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(Label label, int i15, p076m2.r rVar, int i16) {
        o(label, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void q(final d3 d3Var, final f.a.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1247792401);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(empty) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1247792401, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleEmptyState (VehicleListScreen.kt:243)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(a3.l(companion, d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(w0.i.d(mVarH, aVar.a(rVarH, i17).getBase().a(), null, 2, null), rVarH, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarH2);
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
            j70.h.g(null, null, empty.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            j70.h.g(null, null, empty.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            n50.h0.v(empty.getSingleCardData(), null, rVarH, 0, 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sh3.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.r(d3Var, empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(d3 d3Var, f.a.Empty empty, int i15, p076m2.r rVar, int i16) {
        q(d3Var, empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final f.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1957268394);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1957268394, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleListContent (VehicleListScreen.kt:59)");
            }
            rVar2 = rVarH;
            i50.s.r(aVar.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1230145443, true, new er.q() { // from class: sh3.j
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.t(aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: sh3.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.u(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(f.a aVar, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1230145443, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleListContent.<anonymous> (VehicleListScreen.kt:63)");
            }
            if (aVar instanceof f.a.Loader) {
                rVar.X(-1053762291);
                m(d3Var, (f.a.Loader) aVar, rVar, i15 & 14);
                rVar.R();
            } else if (aVar instanceof f.a.List) {
                rVar.X(-1053758958);
                y(d3Var, (f.a.List) aVar, rVar, i15 & 14);
                rVar.R();
            } else {
                if (!(aVar instanceof f.a.Empty)) {
                    rVar.X(-1053763243);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1053755437);
                q(d3Var, (f.a.Empty) aVar, rVar, i15 & 14);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(f.a aVar, int i15, p076m2.r rVar, int i16) {
        s(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void v(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-341740229);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-341740229, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleListScreen (VehicleListScreen.kt:48)");
            }
            s(w(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sh3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.x(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a w(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(f fVar, int i15, p076m2.r rVar, int i16) {
        v(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void y(final d3 d3Var, final f.a.List list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2023416277);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2023416277, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehiclelist.VehicleListState (VehicleListScreen.kt:110)");
            }
            ka.a aVarB = ka.b.b(list.getVehicleListAddedByPaging().b(), null, rVarH, 0, 1);
            oq.i0 i0Var = oq.i0.f148189a;
            boolean zG = rVarH.G(list) | rVarH.G(aVarB);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(list, aVarB, null);
                rVarH.v(objE);
            }
            Function0.d(i0Var, (er.p) objE, rVarH, 6);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(a3.l(companion, d3Var), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(w0.i.d(mVarH, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 8, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            w0 w0VarB = m3.b(iVar.j(), companion2.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, companion);
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
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            f3.m mVarC = p3.c(q3.f39261a, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            j70.h.g(null, null, list.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            j70.h.g(null, null, list.getDescription(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            rVarH.x();
            f3.m mVarR2 = a3.r(companion, aVar.b(rVarH, i17).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null);
            w0 w0VarA3 = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB5 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB5);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarA3, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            h30.q.p(list.getButtonAdd(), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            A(aVarB, list.getVehicleListAddedManually(), list.getVehicleListAddedByPaging(), rVarH, ka.a.f109310f);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sh3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.z(d3Var, list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(d3 d3Var, f.a.List list, int i15, p076m2.r rVar, int i16) {
        y(d3Var, list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
