package pc4;

import ay.DomainCertificates;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpc4/b2;", "", "<init>", "()V", "Lh64/a;", "appendTrustedDomainCertificateUseCase", "Ld14/a;", "getFileContentUseCase", "Ln04/a;", "a", "(Lh64/a;Ld14/a;)Ln04/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b2 {

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"pc4/b2$a", "Ln04/a;", "Lwx/k;", "storedFile", "Ldx/i;", "Ldx/b;", "Lwx/c;", "b", "(Lwx/k;Ltq/e;)Ljava/lang/Object;", "Lay/f;", "domainCertificates", "Loq/i0;", "a", "(Lay/f;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements n04.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d14.a f154387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h64.a f154388b;

        /* JADX INFO: renamed from: pc4.b2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3828a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f154389d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f154390e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f154392g;

            C3828a(tq.e<? super C3828a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f154390e = obj;
                this.f154392g |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        a(d14.a aVar, h64.a aVar2) {
            this.f154387a = aVar;
            this.f154388b = aVar2;
        }

        @Override // n04.a
        public Object a(DomainCertificates domainCertificates, tq.e<? super oq.i0> eVar) {
            Object objC = this.f154388b.c(new h64.a.Params(domainCertificates), eVar);
            return objC == uq.b.e() ? objC : oq.i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // n04.a
        public Object b(wx.k kVar, tq.e<? super dx.i<? extends dx.b, FileContent>> eVar) throws Throwable {
            C3828a c3828a;
            if (eVar instanceof C3828a) {
                c3828a = (C3828a) eVar;
                int i15 = c3828a.f154392g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3828a.f154392g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3828a = new C3828a(eVar);
                }
            } else {
                c3828a = new C3828a(eVar);
            }
            Object objC = c3828a.f154390e;
            Object objE = uq.b.e();
            int i16 = c3828a.f154392g;
            if (i16 == 0) {
                oq.u.b(objC);
                d14.a aVar = this.f154387a;
                d14.a.Params params = new d14.a.Params(kVar);
                c3828a.f154389d = vq.j.a(kVar);
                c3828a.f154392g = 1;
                objC = aVar.c(params, c3828a);
                if (objC == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(objC);
            }
            dx.i iVar = (dx.i) objC;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(((d14.a.Result) ((dx.i.Right) iVar).b()).getFileContent());
            }
            throw new oq.p();
        }
    }

    public final n04.a a(h64.a appendTrustedDomainCertificateUseCase, d14.a getFileContentUseCase) {
        return new a(getFileContentUseCase, appendTrustedDomainCertificateUseCase);
    }
}
