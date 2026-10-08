package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La44/b;", "Lq34/b;", "Lp34/a;", "repository", "Lpx/d;", "remoteLogger", "<init>", "(Lp34/a;Lpx/d;)V", "Lq34/b$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lq34/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp34/a;", "b", "Lpx/d;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements q34.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2983e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2985g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2983e = obj;
            this.f2985g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(p34.a aVar, px.d dVar) {
        this.repository = aVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.b.a aVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f2985g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f2985g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        a aVar3 = aVar2;
        Object objD = aVar3.f2983e;
        Object objE = uq.b.e();
        int i16 = aVar3.f2985g;
        if (i16 == 0) {
            oq.u.b(objD);
            p34.a aVar4 = this.repository;
            rq0.b documentType = aVar.getDocumentType();
            iy.b0 peselTicket = aVar.getPeselTicket();
            iy.a0 certPkcs12 = aVar.getCertPkcs12();
            iy.b0 password = aVar.getPassword();
            aVar3.f2982d = vq.j.a(aVar);
            aVar3.f2985g = 1;
            objD = aVar4.D(documentType, peselTicket, certPkcs12, password, aVar3);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objD);
        }
        dx.i iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            this.remoteLogger.F8("AddUserCertToContainerUseCase: new cert saving failed", px.d.a.ERROR);
        }
        return iVar;
    }
}
