package p076m2;

import er.l;
import er.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import tq.i;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lm2/r3;", "Lm2/l2;", "frameClock", "<init>", "(Lm2/l2;)V", "Loq/i0;", "a", "()V", "b", "R", "Lkotlin/Function1;", "", "onFrame", "x1", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Lm2/l2;", "Lm2/u1;", "Lm2/u1;", "latch", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r3 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l2 frameClock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u1 latch = new u1();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<R> extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f123117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f123118e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f123120g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f123118e = obj;
            this.f123120g |= PKIFailureInfo.systemUnavail;
            return r3.this.x1(null, this);
        }
    }

    public r3(l2 l2Var) {
        this.frameClock = l2Var;
    }

    @Override // tq.i
    public /* bridge */ i D1(i.c<?> cVar) {
        return l2.a.c(this, cVar);
    }

    public final void a() {
        this.latch.d();
    }

    public final void b() {
        this.latch.f();
    }

    @Override // tq.i.b, tq.i
    public /* bridge */ <E extends i.b> E m(i.c<E> cVar) {
        return (E) l2.a.b(this, cVar);
    }

    @Override // tq.i
    public /* bridge */ i n0(i iVar) {
        return l2.a.d(this, iVar);
    }

    @Override // tq.i
    public /* bridge */ <R> R s1(R r15, p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) l2.a.a(this, r15, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p076m2.l2
    public <R> Object x1(l<? super Long, ? extends R> lVar, e<? super R> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f123120g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f123120g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f123118e;
        Object objE = b.e();
        int i16 = aVar.f123120g;
        if (i16 == 0) {
            u.b(obj);
            u1 u1Var = this.latch;
            aVar.f123117d = lVar;
            aVar.f123120g = 1;
            if (u1Var.c(aVar) != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return obj;
        }
        lVar = (l) aVar.f123117d;
        u.b(obj);
        l2 l2Var = this.frameClock;
        aVar.f123117d = null;
        aVar.f123120g = 2;
        Object objX1 = l2Var.x1(lVar, aVar);
        return objX1 == objE ? objE : objX1;
    }
}
