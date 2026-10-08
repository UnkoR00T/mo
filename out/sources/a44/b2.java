package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La44/b2;", "Lq34/a2;", "Lp34/b;", "dataSource", "Lez/a;", "currentTimeProvider", "<init>", "(Lp34/b;Lez/a;)V", "Lq34/a2$a;", "params", "Loq/i0;", "d", "(Lq34/a2$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp34/b;", "b", "Lez/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b2 implements q34.a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.b dataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f2995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2996e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2998g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f2996e = obj;
            this.f2998g |= PKIFailureInfo.systemUnavail;
            return b2.this.c(null, this);
        }
    }

    public b2(p34.b bVar, ez.a aVar) {
        this.dataSource = bVar;
        this.currentTimeProvider = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.a2.Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f2998g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f2998g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f2996e;
        Object objE = uq.b.e();
        int i16 = aVar.f2998g;
        if (i16 == 0) {
            oq.u.b(obj);
            p34.b bVar = this.dataSource;
            long jA = this.currentTimeProvider.a();
            String tag = params.getTag();
            aVar.f2995d = vq.j.a(params);
            aVar.f2998g = 1;
            if (bVar.a(jA, tag, aVar) == objE) {
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
