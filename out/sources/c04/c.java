package c04;

import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vz3.AutoCertificateRenewalData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc04/c;", "Lgz/b;", "Lgz/b$a$a;", "", "Lb04/a;", "autoCertificateRenewalCache", "Lzz3/a;", "authenticationContainersInteractor", "<init>", "(Lb04/a;Lzz3/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lb04/a;", "b", "Lzz3/a;", "authentication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<gz.b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b04.a autoCertificateRenewalCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zz3.a authenticationContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f22380e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22382g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22380e = obj;
            this.f22382g |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    public c(b04.a aVar, zz3.a aVar2) {
        this.autoCertificateRenewalCache = aVar;
        this.authenticationContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f22382g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f22382g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objF = aVar.f22380e;
        Object objE = uq.b.e();
        int i16 = aVar.f22382g;
        boolean z15 = false;
        if (i16 == 0) {
            u.b(objF);
            zz3.a aVar2 = this.authenticationContainersInteractor;
            aVar.f22379d = vq.j.a(c1792a);
            aVar.f22382g = 1;
            objF = zz3.a.f(aVar2, false, aVar, 1, null);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objF);
        }
        dx.i iVar = (dx.i) objF;
        if (iVar instanceof dx.i.Left) {
            return vq.b.a(false);
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        k34.u uVar = (k34.u) ((dx.i.Right) iVar).b();
        AutoCertificateRenewalData autoRenewalData = this.autoCertificateRenewalCache.getAutoRenewalData();
        if (autoRenewalData != null && autoRenewalData.getFirstSessionRequest() && autoRenewalData.getCertificateRenewalRequired() && (uVar == k34.u.MOBYWATEL || uVar == k34.u.DIIA)) {
            z15 = true;
        }
        return vq.b.a(z15);
    }
}
