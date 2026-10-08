package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La44/v;", "Lq34/v;", "Lxw/f;", "Lk34/u;", "Lrq0/b;", "identityTypeToDocumentTypeMapper", "Lq34/w;", "deleteDocumentUseCase", "<init>", "(Lxw/f;Lq34/w;)V", "Lq34/v$a;", "params", "Loq/i0;", "d", "(Lq34/v$a;Ltq/e;)Ljava/lang/Object;", "a", "Lxw/f;", "b", "Lq34/w;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements q34.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xw.f<k34.u, rq0.b> identityTypeToDocumentTypeMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.w deleteDocumentUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3247d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3248e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3250g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3248e = obj;
            this.f3250g |= PKIFailureInfo.systemUnavail;
            return v.this.c(null, this);
        }
    }

    public v(xw.f<k34.u, rq0.b> fVar, q34.w wVar) {
        this.identityTypeToDocumentTypeMapper = fVar;
        this.deleteDocumentUseCase = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.v.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f3250g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f3250g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f3248e;
        Object objE = uq.b.e();
        int i16 = aVar.f3250g;
        if (i16 == 0) {
            oq.u.b(obj);
            q34.w wVar = this.deleteDocumentUseCase;
            q34.w.Params params2 = new q34.w.Params(this.identityTypeToDocumentTypeMapper.b(params.getIdentityType()));
            aVar.f3247d = vq.j.a(params);
            aVar.f3250g = 1;
            if (wVar.c(params2, aVar) == objE) {
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
