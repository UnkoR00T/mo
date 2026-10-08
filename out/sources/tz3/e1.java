package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltz3/e1;", "Lmz3/a0;", "Lsz3/a;", "downloadDocumentRepository", "<init>", "(Lsz3/a;)V", "Lmz3/a0$a;", "params", "Loq/i0;", "d", "(Lmz3/a0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lsz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e1 implements mz3.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sz3.a downloadDocumentRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193066e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193068g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193066e = obj;
            this.f193068g |= PKIFailureInfo.systemUnavail;
            return e1.this.c(null, this);
        }
    }

    public e1(sz3.a aVar) {
        this.downloadDocumentRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.a0.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f193068g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f193068g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f193066e;
        Object objE = uq.b.e();
        int i16 = aVar.f193068g;
        if (i16 == 0) {
            oq.u.b(obj);
            sz3.a aVar2 = this.downloadDocumentRepository;
            rq0.b documentType = params.getDocumentType();
            lz3.h status = params.getStatus();
            String documentIID = params.getDocumentIID();
            aVar.f193065d = vq.j.a(params);
            aVar.f193068g = 1;
            if (aVar2.k(documentType, status, documentIID, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return oq.i0.f148189a;
    }
}
