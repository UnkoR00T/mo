package p049fm;

import er.p;
import er.q;
import ju.p0;
import lh.c;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import tq.e;
import uq.b;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "key1", "Lkotlin/Function3;", "Lju/p0;", "Llh/c;", "Ltq/e;", "Loq/i0;", "block", "b", "(Ljava/lang/Object;Ler/q;Lm2/r;I)V", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class v1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 3, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f65326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<p0, c, e<? super i0>, Object> f65327g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c f65328h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q<? super p0, ? super c, ? super e<? super i0>, ? extends Object> qVar, c cVar, e<? super a> eVar) {
            super(2, eVar);
            this.f65327g = qVar;
            this.f65328h = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f65326f;
            Object objE = b.e();
            int i15 = this.f65325e;
            if (i15 == 0) {
                u.b(obj);
                q<p0, c, e<? super i0>, Object> qVar = this.f65327g;
                c cVar = this.f65328h;
                this.f65326f = j.a(p0Var);
                this.f65325e = 1;
                if (qVar.w(p0Var, cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f65327g, this.f65328h, eVar);
            aVar.f65326f = obj;
            return aVar;
        }
    }

    public static final void b(final Object obj, final q<? super p0, ? super c, ? super e<? super i0>, ? extends Object> qVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-357282938);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(obj) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(qVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-357282938, i16, -1, "com.google.maps.android.compose.MapEffect (MapEffect.kt:22)");
            }
            c map = ((g1) rVarH.l()).getMap();
            boolean zG = rVarH.G(qVar) | rVarH.G(map);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a(qVar, map, null);
                rVarH.v(objE);
            }
            Function0.d(obj, (p) objE, rVarH, i16 & 14);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: fm.u1
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return v1.c(obj, qVar, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(Object obj, q qVar, int i15, r rVar, int i16) {
        b(obj, qVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
