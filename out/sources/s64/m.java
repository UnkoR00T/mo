package s64;

import ay.DomainCertificates;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ls64/m;", "Lh64/m;", "Ly04/a;", "buildConfigRepository", "Lq64/c;", "cache", "<init>", "(Ly04/a;Lq64/c;)V", "Lh64/m$a;", "params", "Lay/f;", "d", "(Lh64/m$a;Ltq/e;)Ljava/lang/Object;", "a", "Ly04/a;", "b", "Lq64/c;", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements h64.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y04.a buildConfigRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q64.c cache;

    public m(y04.a aVar, q64.c cVar) {
        this.buildConfigRepository = aVar;
        this.cache = cVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(h64.m.Params params, tq.e<? super DomainCertificates> eVar) {
        return this.cache.b(fu.r.M0(params.getDomain(), this.buildConfigRepository.getTrustedDomainPrefix()));
    }
}
