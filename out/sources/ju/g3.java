package ju;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\f\u0010\t\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001aD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\u000e\u0010\t\u001aY\u0010\u0012\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lju/p0;", "Ltq/e;", "", "block", "c", "(JLer/p;Ltq/e;)Ljava/lang/Object;", "Lgu/b;", "timeout", "d", "e", "f", "U", "Lju/f3;", "coroutine", "b", "(Lju/f3;Ler/p;)Ljava/lang/Object;", "time", "Lju/y0;", "delay", "Lju/d2;", "Lju/e3;", "a", "(JLju/y0;Lju/d2;)Lju/e3;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g3 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f105696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f105697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f105698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f105699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f105700h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f105699g = obj;
            this.f105700h |= PKIFailureInfo.systemUnavail;
            return g3.e(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    public static final e3 a(long j15, y0 y0Var, d2 d2Var) {
        String strT0;
        a1 a1Var = y0Var instanceof a1 ? (a1) y0Var : null;
        if (a1Var != null) {
            gu.b.Companion companion = gu.b.INSTANCE;
            strT0 = a1Var.t0(gu.d.r(j15, gu.e.MILLISECONDS));
            if (strT0 == null) {
                strT0 = "Timed out waiting for " + j15 + " ms";
            }
        } else {
            strT0 = "Timed out waiting for " + j15 + " ms";
        }
        return new e3(strT0, d2Var);
    }

    private static final <U, T extends U> Object b(f3<U, ? super T> f3Var, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar) {
        g2.h(f3Var, z0.d(f3Var.uCont.getContext()).O0(f3Var.time, f3Var, f3Var.getContext()));
        return pu.b.e(f3Var, f3Var, pVar);
    }

    public static final <T> Object c(long j15, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        if (j15 <= 0) {
            throw new e3("Timed out immediately");
        }
        Object objB = b(new f3(j15, eVar), pVar);
        if (objB == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objB;
    }

    public static final <T> Object d(long j15, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return c(z0.e(j15), pVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ju.f3] */
    public static final <T> Object e(long j15, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
        a aVar;
        fr.p0 p0Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f105700h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f105700h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f105699g;
        Object objE = uq.b.e();
        int i16 = aVar.f105700h;
        if (i16 == 0) {
            oq.u.b(obj);
            if (j15 <= 0) {
                return null;
            }
            fr.p0 p0Var2 = new fr.p0();
            try {
                aVar.f105697e = pVar;
                aVar.f105698f = p0Var2;
                aVar.f105696d = j15;
                aVar.f105700h = 1;
                ?? r15 = (T) new f3(j15, aVar);
                p0Var2.f66410a = r15;
                Object objB = b(r15, pVar);
                if (objB == uq.b.e()) {
                    vq.g.c(aVar);
                }
                return objB == objE ? objE : objB;
            } catch (e3 e15) {
                e = e15;
                p0Var = p0Var2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0Var = (fr.p0) aVar.f105698f;
            try {
                oq.u.b(obj);
                return obj;
            } catch (e3 e16) {
                e = e16;
            }
        }
        if (e.coroutine == p0Var.f66410a) {
            return null;
        }
        throw e;
    }

    public static final <T> Object f(long j15, er.p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return e(z0.e(j15), pVar, eVar);
    }
}
