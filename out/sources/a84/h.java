package a84;

import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La84/h;", "Lt74/b;", "Lz74/b;", "pushNotificationDataSource", "<init>", "(Lz74/b;)V", "Lt74/b$b;", "params", "Loq/i0;", "b", "(Lt74/b$b;)V", "a", "Lz74/b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements t74.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z74.b pushNotificationDataSource;

    public h(z74.b bVar) {
        this.pushNotificationDataSource = bVar;
    }

    @Override // gz.a
    public /* bridge */ /* synthetic */ i0 a(gz.b.a aVar) {
        b((t74.b.Params) aVar);
        return i0.f148189a;
    }

    public void b(t74.b.Params params) {
        t74.b.a operation = params.getOperation();
        if (t.c(operation, t74.b.a.C4900b.f188826a)) {
            this.pushNotificationDataSource.c();
        } else if (t.c(operation, t74.b.a.C4899a.f188825a)) {
            this.pushNotificationDataSource.d();
        } else {
            if (!(operation instanceof t74.b.a.Overwrite)) {
                throw new p();
            }
            this.pushNotificationDataSource.a(((t74.b.a.Overwrite) operation).getNewValue());
        }
    }
}
