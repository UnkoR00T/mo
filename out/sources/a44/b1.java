package a44;

import fr0.DocumentConfig;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La44/b1;", "Lq34/b1;", "Lg34/b;", "documentRemoteResourcesMapper", "Lr34/c;", "getSavedDocumentConfigUseCase", "<init>", "(Lg34/b;Lr34/c;)V", "Lq34/b1$a;", "params", "", "d", "(Lq34/b1$a;Ltq/e;)Ljava/lang/Object;", "a", "Lg34/b;", "b", "Lr34/c;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b1 implements q34.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g34.b documentRemoteResourcesMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r34.c getSavedDocumentConfigUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2989d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2990e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2992g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2990e = obj;
            this.f2992g |= PKIFailureInfo.systemUnavail;
            return b1.this.c(null, this);
        }
    }

    public b1(g34.b bVar, r34.c cVar) {
        this.documentRemoteResourcesMapper = bVar;
        this.getSavedDocumentConfigUseCase = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.b1.Params params, tq.e<? super String> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f2992g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f2992g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f2990e;
        Object objE = uq.b.e();
        int i16 = aVar.f2992g;
        if (i16 == 0) {
            oq.u.b(objC);
            r34.c cVar = this.getSavedDocumentConfigUseCase;
            r34.c.Params params2 = new r34.c.Params(params.getDocumentType());
            aVar.f2989d = vq.j.a(params);
            aVar.f2992g = 1;
            objC = cVar.c(params2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        DocumentConfig documentConfig = (DocumentConfig) ((dx.i) objC).a();
        if (documentConfig != null) {
            return this.documentRemoteResourcesMapper.a(documentConfig.g());
        }
        return null;
    }
}
