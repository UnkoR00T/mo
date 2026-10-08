package tz3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ltz3/p0;", "Lmz3/t;", "Lsz3/a;", "downloadDocumentRepository", "<init>", "(Lsz3/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lsz3/a;", "getDownloadDocumentRepository", "()Lsz3/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 implements mz3.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sz3.a downloadDocumentRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f193195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f193196e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193198g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f193196e = obj;
            this.f193198g |= PKIFailureInfo.systemUnavail;
            return p0.this.c(null, this);
        }
    }

    public p0(sz3.a aVar) {
        this.downloadDocumentRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f193198g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f193198g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f193196e;
        Object objE = uq.b.e();
        int i16 = aVar.f193198g;
        if (i16 == 0) {
            oq.u.b(obj);
            sz3.a aVar2 = this.downloadDocumentRepository;
            aVar.f193195d = vq.j.a(c1792a);
            aVar.f193198g = 1;
            if (aVar2.g(aVar) == objE) {
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
