package ib3;

import ju.p0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import u50.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv50/c;", "data", "", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "b", "(Lv50/c;ZLer/a;Lm2/r;I)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f90781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f90782f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.a f90783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f90784h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, j1.a aVar, er.a<oq.i0> aVar2, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f90782f = z15;
            this.f90783g = aVar;
            this.f90784h = aVar2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f90781e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f90782f) {
                    j1.a aVar = this.f90783g;
                    this.f90781e = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f90784h.a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f90782f, this.f90783g, this.f90784h, eVar);
        }
    }

    public static final void b(final v50.c cVar, final boolean z15, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1936712174);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1936712174, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.trip.contactdetails.CheckboxCustomContent (CheckboxCustomContent.kt:17)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j1.e.a();
                rVarH.v(objE);
            }
            j1.a aVar2 = (j1.a) objE;
            Boolean boolValueOf = Boolean.valueOf(z15);
            boolean zG = ((i16 & 112) == 32) | rVarH.G(aVar2) | ((i16 & 896) == 256);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(z15, aVar2, aVar, null);
                rVarH.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVarH, (i16 >> 3) & 14);
            f3.m mVarB = j1.e.b(f3.m.INSTANCE, aVar2);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            v0.g(cVar, null, rVarH, v50.c.f203957t | (i16 & 14), 2);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ib3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(cVar, z15, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(v50.c cVar, boolean z15, er.a aVar, int i15, p076m2.r rVar, int i16) {
        b(cVar, z15, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
