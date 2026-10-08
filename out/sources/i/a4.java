package i;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Li/a4;", "", "Li/d3;", "concurrentSequencer", "<init>", "(Li/d3;)V", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "b", "()V", "Li/d3;", "Liu/e;", "Li/a4$a;", "Liu/e;", "state", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d3 concurrentSequencer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iu.e<a> state = iu.b.g(a.PENDING);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Li/a4$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        PENDING,
        CREATING,
        CREATED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f87026e = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f87027d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f87029f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87027d = obj;
            this.f87029f |= PKIFailureInfo.systemUnavail;
            return a4.this.a(this);
        }
    }

    public a4(d3 d3Var) {
        this.concurrentSequencer = d3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f87029f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f87029f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f87027d;
        Object objE = uq.b.e();
        int i16 = bVar.f87029f;
        if (i16 == 0) {
            oq.u.b(obj);
            su.a sharedMutex = this.concurrentSequencer.getSharedMutex();
            bVar.f87029f = 1;
            if (su.a.C4762a.a(sharedMutex, null, bVar, 1, null) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        if (!this.state.a(a.PENDING, a.CREATING)) {
            su.a.C4762a.c(this.concurrentSequencer.getSharedMutex(), null, 1, null);
        }
        return oq.i0.f148189a;
    }

    public final void b() {
        if (this.state.b(a.CREATED) == a.CREATING) {
            su.a.C4762a.c(this.concurrentSequencer.getSharedMutex(), null, 1, null);
        }
    }
}
