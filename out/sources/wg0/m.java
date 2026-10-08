package wg0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lwg0/m;", "Lqg0/i;", "Lvg0/a;", "userRepository", "Lrg0/a;", "appSessionManager", "<init>", "(Lvg0/a;Lrg0/a;)V", "Lgz/b$a$a;", "params", "Lqg0/i$a;", "b", "(Lgz/b$a$a;)Lqg0/i$a;", "a", "Lvg0/a;", "Lrg0/a;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements qg0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vg0.a userRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rg0.a appSessionManager;

    public m(vg0.a aVar, rg0.a aVar2) {
        this.userRepository = aVar;
        this.appSessionManager = aVar2;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public qg0.i.a a(gz.b.a.C1792a params) {
        if (this.appSessionManager.b()) {
            return qg0.i.a.b.f166366a;
        }
        return this.userRepository.c() ? qg0.i.a.C4174a.f166365a : qg0.i.a.c.f166367a;
    }
}
