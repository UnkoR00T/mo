package oz;

import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Loz/j;", "lifecycleConnector", "Loq/i0;", "b", "(Loz/j;Lm2/r;I)V", "lifecycle_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f150729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f150730g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, androidx.p016lifecycle.q qVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f150729f = jVar;
            this.f150730g = qVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f150728e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            px.f.f163100a.b("Lifecycle connected", v.e(new px.a.Custom("LIFECYCLE", "Connecting...")));
            this.f150729f.R(this.f150730g);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f150729f, this.f150730g, eVar);
        }
    }

    public static final void b(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(483455112);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(483455112, i16, -1, "pl.gov.coi.common.lifecycle.ConnectLifecycle (LifecycleConnector.kt:14)");
            }
            androidx.p016lifecycle.q qVar = (androidx.p016lifecycle.q) rVarH.N(m7.n.c());
            i0 i0Var = i0.f148189a;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(jVar))) {
                z15 = true;
            }
            boolean zG = rVarH.G(qVar) | z15;
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(jVar, qVar, null);
                rVarH.v(objE);
            }
            Function0.d(i0Var, (er.p) objE, rVarH, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oz.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.c(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(j jVar, int i15, p076m2.r rVar, int i16) {
        b(jVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
