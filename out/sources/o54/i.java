package o54;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo54/i;", "Lk54/j;", "Ln54/b;", "repository", "<init>", "(Ln54/b;)V", "Lk54/j$a;", "params", "Loq/i0;", "b", "(Lk54/j$a;)V", "a", "Ln54/b;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements k54.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n54.b repository;

    public i(n54.b bVar) {
        this.repository = bVar;
    }

    @Override // gz.a
    public /* bridge */ /* synthetic */ i0 a(gz.b.a aVar) {
        b((k54.j.Params) aVar);
        return i0.f148189a;
    }

    public void b(k54.j.Params params) {
        this.repository.h(params.getToken());
    }
}
