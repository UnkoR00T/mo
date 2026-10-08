package cx;

import dx.i;
import er.l;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import su.g;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcx/b;", "Lcx/a;", "<init>", "()V", "RESULT", "", "nextEventDelay", "Lkotlin/Function0;", "event", "Ldx/i;", "Loq/i0;", "c", "(JLer/a;)Ldx/i;", "Lkotlin/Function1;", "Ltq/e;", "", "b", "(JLer/l;Ltq/e;)Ljava/lang/Object;", "J", "nextAllowedEventTimestamp", "Lsu/a;", "Lsu/a;", "mutex", "e", "()J", "now", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements cx.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long nextAllowedEventTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex = g.b(false, 1, null);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a<RESULT> extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f38379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f38380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f38381f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f38382g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f38383h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f38384j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f38386l;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f38384j = obj;
            this.f38386l |= PKIFailureInfo.systemUnavail;
            return b.this.b(0L, null, this);
        }
    }

    private final long e() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // cx.a
    public <RESULT> Object b(long j15, l<? super e<? super RESULT>, ? extends Object> lVar, e<? super i<i0, ? extends RESULT>> eVar) throws Throwable {
        a aVar;
        long j16;
        su.a aVar2;
        l<? super e<? super RESULT>, ? extends Object> lVar2;
        int i15;
        su.a aVar3;
        Object left;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i16 = aVar.f38386l;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f38386l = i16 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f38384j;
        Object objE = uq.b.e();
        int i17 = aVar.f38386l;
        try {
            if (i17 == 0) {
                u.b(objB);
                su.a aVar4 = this.mutex;
                aVar.f38380e = lVar;
                aVar.f38381f = aVar4;
                j16 = j15;
                aVar.f38379d = j16;
                aVar.f38382g = 0;
                aVar.f38386l = 1;
                if (aVar4.h(null, aVar) != objE) {
                    aVar2 = aVar4;
                    lVar2 = lVar;
                    i15 = 0;
                }
                return objE;
            }
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (su.a) aVar.f38381f;
                try {
                    u.b(objB);
                    left = new i.Right(objB);
                    aVar2 = aVar3;
                    aVar2.r(null);
                    return left;
                } catch (Throwable th4) {
                    th = th4;
                    aVar3.r(null);
                    throw th;
                }
            }
            i15 = aVar.f38382g;
            j16 = aVar.f38379d;
            aVar2 = (su.a) aVar.f38381f;
            lVar2 = (l) aVar.f38380e;
            u.b(objB);
            if (e() >= this.nextAllowedEventTimestamp) {
                this.nextAllowedEventTimestamp = e() + j16;
                aVar.f38380e = j.a(lVar2);
                aVar.f38381f = aVar2;
                aVar.f38379d = j16;
                aVar.f38382g = i15;
                aVar.f38383h = 0;
                aVar.f38386l = 2;
                objB = lVar2.b(aVar);
                if (objB != objE) {
                    aVar3 = aVar2;
                    left = new i.Right(objB);
                    aVar2 = aVar3;
                }
                return objE;
            }
            left = new i.Left(i0.f148189a);
            aVar2.r(null);
            return left;
        } catch (Throwable th5) {
            th = th5;
            aVar3 = aVar2;
            aVar3.r(null);
            throw th;
        }
    }

    @Override // cx.a
    public <RESULT> i<i0, RESULT> c(long nextEventDelay, er.a<? extends RESULT> event) {
        if (e() < this.nextAllowedEventTimestamp) {
            return new i.Left(i0.f148189a);
        }
        this.nextAllowedEventTimestamp = e() + nextEventDelay;
        return new i.Right(event.a());
    }
}
