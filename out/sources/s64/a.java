package s64;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls64/a;", "Lh64/a;", "Lq64/c;", "trustedCertificatesCache", "<init>", "(Lq64/c;)V", "Lh64/a$a;", "params", "Loq/i0;", "d", "(Lh64/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lq64/c;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements h64.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q64.c trustedCertificatesCache;

    public a(q64.c cVar) {
        this.trustedCertificatesCache = cVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(h64.a.Params params, tq.e<? super i0> eVar) {
        this.trustedCertificatesCache.a(params.getDomainCertificates());
        return i0.f148189a;
    }
}
