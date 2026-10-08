package qq0;

import dx.i;
import iq0.AnonymousFeatureFlags;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lqq0/h;", "Ljq0/h;", "Lpq0/a;", "mobileSettingsControllerRepository", "<init>", "(Lpq0/a;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Liq0/f;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lpq0/a;", "mobilesettingsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements jq0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pq0.a mobileSettingsControllerRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f168064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f168065e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f168067g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f168065e = obj;
            this.f168067g |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(pq0.a aVar) {
        this.mobileSettingsControllerRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super i<? extends dx.b, AnonymousFeatureFlags>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f168067g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f168067g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objE = aVar.f168065e;
        Object objE2 = uq.b.e();
        int i16 = aVar.f168067g;
        if (i16 == 0) {
            u.b(objE);
            pq0.a aVar2 = this.mobileSettingsControllerRepository;
            aVar.f168064d = j.a(c1792a);
            aVar.f168067g = 1;
            objE = aVar2.e(aVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        i iVar = (i) objE;
        if (iVar instanceof i.Left) {
            dx.b bVar = (dx.b) ((i.Left) iVar).b();
            px.f.e(px.f.f163100a, "Network ERROR: " + bVar, null, px.c.a(this), 2, null);
        }
        return iVar;
    }
}
