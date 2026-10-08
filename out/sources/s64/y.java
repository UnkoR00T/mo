package s64;

import iq0.DashboardServiceEntry;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ls64/y;", "Lh64/u;", "Lh64/q;", "loadRemoteSettingsUseCase", "Lh64/r;", "loadServicesUseCase", "Lwy/b;", "networkSessionManager", "<init>", "(Lh64/q;Lh64/r;Lwy/b;)V", "Lh64/u$a;", "params", "", "Liq0/p;", "d", "(Lh64/u$a;Ltq/e;)Ljava/lang/Object;", "a", "Lh64/q;", "b", "Lh64/r;", "c", "Lwy/b;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements h64.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h64.q loadRemoteSettingsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178550e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178552g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178550e = obj;
            this.f178552g |= PKIFailureInfo.systemUnavail;
            return y.this.c(null, this);
        }
    }

    public y(h64.q qVar, h64.r rVar, wy.b bVar) {
        this.loadRemoteSettingsUseCase = qVar;
        this.loadServicesUseCase = rVar;
        this.networkSessionManager = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(h64.u.Params params, tq.e<? super List<DashboardServiceEntry>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178552g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178552g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f178550e;
        Object objE = uq.b.e();
        int i16 = aVar.f178552g;
        if (i16 == 0) {
            oq.u.b(obj);
            if (params.getWithTokenInvalidation()) {
                this.networkSessionManager.R();
            }
            h64.q qVar = this.loadRemoteSettingsUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f178549d = vq.j.a(params);
            aVar.f178552g = 1;
            if (qVar.c(c1792a, aVar) != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return obj;
        }
        params = (h64.u.Params) aVar.f178549d;
        oq.u.b(obj);
        h64.r rVar = this.loadServicesUseCase;
        gz.b.a.C1792a c1792a2 = gz.b.a.C1792a.f78542a;
        aVar.f178549d = vq.j.a(params);
        aVar.f178552g = 2;
        Object objC = rVar.c(c1792a2, aVar);
        return objC == objE ? objE : objC;
    }
}
