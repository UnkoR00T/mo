package na0;

import dx.i;
import gz.b;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;
import x80.BEJuniorSettings;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lna0/a;", "Lgz/b;", "Lgz/b$a$a;", "Loq/i0;", "Ly80/b;", "getJuniorSettingsUC", "Lka0/a;", "juniorDashboardCache", "Lla0/b;", "dashboardServerTimeInteractor", "<init>", "(Ly80/b;Lka0/a;Lla0/b;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ly80/b;", "b", "Lka0/a;", "c", "Lla0/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b<b.a.C1792a, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y80.b getJuniorSettingsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ka0.a juniorDashboardCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final la0.b dashboardServerTimeInteractor;

    /* JADX INFO: renamed from: na0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3313a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f133697e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f133699g;

        C3313a(e<? super C3313a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f133697e = obj;
            this.f133699g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    public a(y80.b bVar, ka0.a aVar, la0.b bVar2) {
        this.getJuniorSettingsUC = bVar;
        this.juniorDashboardCache = aVar;
        this.dashboardServerTimeInteractor = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(b.a.C1792a c1792a, e<? super i0> eVar) throws Throwable {
        C3313a c3313a;
        if (eVar instanceof C3313a) {
            c3313a = (C3313a) eVar;
            int i15 = c3313a.f133699g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3313a.f133699g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3313a = new C3313a(eVar);
            }
        } else {
            c3313a = new C3313a(eVar);
        }
        Object objC = c3313a.f133697e;
        Object objE = uq.b.e();
        int i16 = c3313a.f133699g;
        if (i16 == 0) {
            u.b(objC);
            y80.b bVar = this.getJuniorSettingsUC;
            b.a.C1792a c1792a2 = b.a.C1792a.f78542a;
            c3313a.f133696d = j.a(c1792a);
            c3313a.f133699g = 1;
            objC = bVar.c(c1792a2, c3313a);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        BEJuniorSettings bEJuniorSettings = (BEJuniorSettings) ((i) objC).a();
        if (bEJuniorSettings != null) {
            this.juniorDashboardCache.a(bEJuniorSettings.getSchool());
            this.dashboardServerTimeInteractor.a(new fz.b.OffsetDateTime(bEJuniorSettings.getServerCurrentTime()));
        }
        return i0.f148189a;
    }
}
