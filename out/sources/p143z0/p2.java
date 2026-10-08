package p143z0;

import c5.y;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Lz0/p2;", "Lz3/a;", "Lz0/g2;", "scrollingLogic", "", "enabled", "<init>", "(Lz0/g2;Z)V", "Lm3/e;", "consumed", "available", "Lz3/g;", "source", "d1", "(JJI)J", "Lc5/y;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "a", "Lz0/g2;", "getScrollingLogic", "()Lz0/g2;", "b", "Z", "getEnabled", "()Z", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p2 implements z3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g2 scrollingLogic;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f231562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f231563e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231565g;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f231563e = obj;
            this.f231565g |= PKIFailureInfo.systemUnavail;
            return p2.this.W0(0L, 0L, this);
        }
    }

    public p2(g2 g2Var, boolean z15) {
        this.scrollingLogic = g2Var;
        this.enabled = z15;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z3.a
    public Object W0(long j15, long j16, e<? super y> eVar) throws Throwable {
        a aVar;
        long jA;
        long jA2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f231565g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f231565g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f231563e;
        Object objE = b.e();
        int i16 = aVar.f231565g;
        if (i16 == 0) {
            u.b(objC);
            if (this.enabled) {
                if (this.scrollingLogic.a()) {
                    jA2 = y.INSTANCE.a();
                } else {
                    g2 g2Var = this.scrollingLogic;
                    aVar.f231562d = j16;
                    aVar.f231565g = 1;
                    objC = g2Var.c(j16, aVar);
                    if (objC == objE) {
                        return objE;
                    }
                }
                jA = y.k(j16, jA2);
            } else {
                jA = y.INSTANCE.a();
            }
            return y.b(jA);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j16 = aVar.f231562d;
        u.b(objC);
        jA2 = ((y) objC).getPackedValue();
        jA = y.k(j16, jA2);
        return y.b(jA);
    }

    public final void a(boolean z15) {
        this.enabled = z15;
    }

    @Override // z3.a
    public long d1(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.b(available) : m3.e.INSTANCE.c();
    }
}
