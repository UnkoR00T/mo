package n90;

import fr.t;
import gz.b;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ln90/a;", "Lgz/a;", "Lgz/b$a$a;", "", "Lqg0/b;", "activationInfo", "<init>", "(Lqg0/b;)V", "params", "b", "(Lgz/b$a$a;)Ljava/lang/Boolean;", "a", "Lqg0/b;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<b.a.C1792a, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final qg0.b activationInfo;

    public a(qg0.b bVar) {
        this.activationInfo = bVar;
    }

    public Boolean b(b.a.C1792a params) {
        boolean z15;
        qg0.b.a aVarA = this.activationInfo.a(b.a.C1792a.f78542a);
        if (t.c(aVarA, qg0.b.a.C4172a.f166360a)) {
            z15 = true;
        } else {
            if (!t.c(aVarA, qg0.b.a.C4173b.f166361a)) {
                throw new p();
            }
            z15 = false;
        }
        return Boolean.valueOf(z15);
    }
}
