package tz3;

import lz3.DocumentDownloadSingleStatus;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltz3/a;", "Lmz3/a;", "Lsz3/a;", "downloadDocumentRepository", "<init>", "(Lsz3/a;)V", "Lmz3/a$a;", "params", "Loq/i0;", "d", "(Lmz3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lsz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements mz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sz3.a downloadDocumentRepository;

    /* JADX INFO: renamed from: tz3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5045a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f192890e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192892g;

        C5045a(tq.e<? super C5045a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192890e = obj;
            this.f192892g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(sz3.a aVar) {
        this.downloadDocumentRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.a.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        C5045a c5045a;
        if (eVar instanceof C5045a) {
            c5045a = (C5045a) eVar;
            int i15 = c5045a.f192892g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5045a.f192892g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5045a = new C5045a(eVar);
            }
        } else {
            c5045a = new C5045a(eVar);
        }
        Object obj = c5045a.f192890e;
        Object objE = uq.b.e();
        int i16 = c5045a.f192892g;
        if (i16 == 0) {
            oq.u.b(obj);
            sz3.a aVar = this.downloadDocumentRepository;
            DocumentDownloadSingleStatus status = params.getStatus();
            c5045a.f192889d = vq.j.a(params);
            c5045a.f192892g = 1;
            if (aVar.h(status, c5045a) == objE) {
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
