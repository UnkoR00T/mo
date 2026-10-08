package wc0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwc0/a;", "Lsc0/a;", "Lvc0/a;", "repository", "<init>", "(Lvc0/a;)V", "Lsc0/a$a;", "params", "Lrc0/b;", "d", "(Lsc0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvc0/a;", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements sc0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vc0.a repository;

    public a(vc0.a aVar) {
        this.repository = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(sc0.a.Params params, tq.e<? super rc0.b> eVar) {
        return this.repository.a(params.getAuthenticationType(), eVar);
    }
}
