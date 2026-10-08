package d60;

import androidx.compose.ui.platform.g1;
import er.p;
import ju.p0;
import ju.z0;
import l3.d0;
import l3.o;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "shouldFocus", "Lkotlin/Function1;", "Loq/i0;", "onFocusChanged", "Ld60/c;", "b", "(ZLer/l;Lm2/r;II)Ld60/c;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f40052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f40053g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, c cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f40052f = z15;
            this.f40053g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40051e;
            if (i15 == 0) {
                u.b(obj);
                this.f40051e = 1;
                if (z0.b(20L, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            if (this.f40052f) {
                this.f40053g.l();
            } else {
                this.f40053g.g();
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
            return new a(this.f40052f, this.f40053g, eVar);
        }
    }

    public static final c b(boolean z15, er.l<? super Boolean, i0> lVar, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            z15 = false;
        }
        if ((i16 & 2) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: d60.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.c(((Boolean) obj).booleanValue());
                    }
                };
                rVar.v(objE);
            }
            lVar = (er.l) objE;
        }
        er.l<? super Boolean, i0> lVar2 = lVar;
        if (t.k()) {
            t.o(84974797, i15, -1, "pl.gov.coi.common.ui.focus.createFocusHost (FocusHost.kt:51)");
        }
        Object objE2 = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE2 == companion.a()) {
            objE2 = Function0.i(tq.j.f191408a, rVar);
            rVar.v(objE2);
        }
        p0 p0Var = (p0) objE2;
        Object objE3 = rVar.E();
        if (objE3 == companion.a()) {
            objE3 = new d0();
            rVar.v(objE3);
        }
        d0 d0Var = (d0) objE3;
        o oVar = (o) rVar.N(g1.g());
        Object objE4 = rVar.E();
        if (objE4 == companion.a()) {
            objE4 = j1.e.a();
            rVar.v(objE4);
        }
        j1.a aVar = (j1.a) objE4;
        Object objE5 = rVar.E();
        if (objE5 == companion.a()) {
            c cVar = new c(lVar2, d0Var, oVar, aVar, p0Var);
            rVar.v(cVar);
            objE5 = cVar;
        }
        c cVar2 = (c) objE5;
        Boolean boolValueOf = Boolean.valueOf(z15);
        int i17 = i15 & 14;
        boolean z16 = ((i17 ^ 6) > 4 && rVar.a(z15)) || (i15 & 6) == 4;
        Object objE6 = rVar.E();
        if (z16 || objE6 == companion.a()) {
            objE6 = new a(z15, cVar2, null);
            rVar.v(objE6);
        }
        Function0.d(boolValueOf, (p) objE6, rVar, i17);
        if (t.k()) {
            t.n();
        }
        return cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(boolean z15) {
        return i0.f148189a;
    }
}
