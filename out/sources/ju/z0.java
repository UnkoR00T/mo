package ju;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "a", "(Ltq/e;)Ljava/lang/Object;", "", "timeMillis", "Loq/i0;", "b", "(JLtq/e;)Ljava/lang/Object;", "Lgu/b;", "duration", "c", "e", "(J)J", "Ltq/i;", "Lju/y0;", "d", "(Ltq/i;)Lju/y0;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f105797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105798e;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105797d = obj;
            this.f105798e |= PKIFailureInfo.systemUnavail;
            return z0.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(tq.e<?> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f105798e;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f105798e = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f105797d;
        Object objE = uq.b.e();
        int i16 = aVar.f105798e;
        if (i16 == 0) {
            oq.u.b(obj);
            aVar.f105798e = 1;
            p pVar = new p(uq.b.c(aVar), 1);
            pVar.D();
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                vq.g.c(aVar);
            }
            if (objX == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        throw new oq.g();
    }

    public static final Object b(long j15, tq.e<? super oq.i0> eVar) {
        if (j15 <= 0) {
            return oq.i0.f148189a;
        }
        p pVar = new p(uq.b.c(eVar), 1);
        pVar.D();
        if (j15 < Long.MAX_VALUE) {
            d(pVar.getContext()).E(j15, pVar);
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : oq.i0.f148189a;
    }

    public static final Object c(long j15, tq.e<? super oq.i0> eVar) {
        Object objB = b(e(j15), eVar);
        return objB == uq.b.e() ? objB : oq.i0.f148189a;
    }

    public static final y0 d(tq.i iVar) {
        tq.i.b bVarM = iVar.m(tq.f.INSTANCE);
        y0 y0Var = bVarM instanceof y0 ? (y0) bVarM : null;
        return y0Var == null ? v0.a() : y0Var;
    }

    public static final long e(long j15) {
        boolean zT = gu.b.T(j15);
        if (zT) {
            return gu.b.A(gu.b.W(j15, gu.d.r(999999L, gu.e.NANOSECONDS)));
        }
        if (zT) {
            throw new oq.p();
        }
        return 0L;
    }
}
