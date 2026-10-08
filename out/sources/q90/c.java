package q90;

import dx.i;
import h90.BEPushHistory;
import j84.NotificationsHistoryData;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lq90/c;", "Li84/a;", "Lj90/c;", "beGetPushHistoryUC", "<init>", "(Lj90/c;)V", "Ldx/i;", "Ldx/b;", "Lj84/a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lj90/c;", "Lw74/a;", "b", "Lw74/a;", "()Lw74/a;", "featureConfig", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements i84.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j90.c beGetPushHistoryUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig = w74.a.MJUNIOR;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f165381d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f165383f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165381d = obj;
            this.f165383f |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    public c(j90.c cVar) {
        this.beGetPushHistoryUC = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // i84.a
    public Object a(tq.e<? super i<? extends dx.b, NotificationsHistoryData>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f165383f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f165383f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objA = aVar.f165381d;
        Object objE = uq.b.e();
        int i16 = aVar.f165383f;
        if (i16 == 0) {
            u.b(objA);
            j90.c cVar = this.beGetPushHistoryUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f165383f = 1;
            objA = cVar.a(c1792a, aVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objA);
        }
        i iVar = (i) objA;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(d.b((BEPushHistory) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // i84.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public w74.a getFeatureConfig() {
        return this.featureConfig;
    }
}
