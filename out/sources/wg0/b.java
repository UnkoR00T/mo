package wg0;

import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwg0/b;", "Lqg0/b;", "Lvg0/a;", "userRepository", "<init>", "(Lvg0/a;)V", "Lgz/b$a$a;", "params", "Lqg0/b$a;", "b", "(Lgz/b$a$a;)Lqg0/b$a;", "a", "Lvg0/a;", "getUserRepository", "()Lvg0/a;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements qg0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vg0.a userRepository;

    public b(vg0.a aVar) {
        this.userRepository = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public qg0.b.a a(gz.b.a.C1792a params) {
        boolean zC = this.userRepository.c();
        if (zC) {
            return qg0.b.a.C4172a.f166360a;
        }
        if (zC) {
            throw new p();
        }
        return qg0.b.a.C4173b.f166361a;
    }
}
