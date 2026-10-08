package o54;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo54/f;", "Lk54/g;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "Lk54/g$a;", "params", "", "b", "(Lk54/g$a;)Ljava/lang/Boolean;", "a", "Lez/a;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements k54.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    public f(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean a(k54.g.Params params) {
        return Boolean.valueOf(params.getToken().getExpiration().isAfter(this.currentTimeProvider.d()));
    }
}
