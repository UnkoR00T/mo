package q90;

import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lq90/e;", "Li84/b;", "Ldy/a;", "systemNotificationsManager", "Lt74/b;", "updateNotDisplayedPushCountUC", "<init>", "(Ldy/a;Lt74/b;)V", "Li84/b$b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Li84/b$a;", "operation", "Loq/i0;", "c", "(Li84/b$a;Ltq/e;)Ljava/lang/Object;", "Ldy/a;", "b", "Lt74/b;", "Lw74/a;", "Lw74/a;", "()Lw74/a;", "featureConfig", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements i84.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dy.a systemNotificationsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t74.b updateNotDisplayedPushCountUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w74.a featureConfig = w74.a.MJUNIOR;

    public e(dy.a aVar, t74.b bVar) {
        this.systemNotificationsManager = aVar;
        this.updateNotDisplayedPushCountUC = bVar;
    }

    @Override // i84.b
    public Object a(tq.e<? super i84.b.InterfaceC2143b> eVar) {
        if (this.systemNotificationsManager.e()) {
            return !this.systemNotificationsManager.c(s74.b.MAIN_GENERAL_CHANNEL.getId()) ? i84.b.InterfaceC2143b.a.f90327a : i84.b.InterfaceC2143b.C2144b.f90328a;
        }
        return i84.b.InterfaceC2143b.c.f90329a;
    }

    @Override // i84.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public w74.a getFeatureConfig() {
        return this.featureConfig;
    }

    @Override // i84.b
    public Object c(i84.b.a aVar, tq.e<? super i0> eVar) {
        t74.b.a overwrite;
        if (t.c(aVar, i84.b.a.C2142b.f90325a)) {
            overwrite = t74.b.a.C4900b.f188826a;
        } else if (t.c(aVar, i84.b.a.C2141a.f90324a)) {
            overwrite = t74.b.a.C4899a.f188825a;
        } else {
            if (!(aVar instanceof i84.b.a.Overwrite)) {
                throw new p();
            }
            overwrite = new t74.b.a.Overwrite(((i84.b.a.Overwrite) aVar).getNewValue());
        }
        this.updateNotDisplayedPushCountUC.a(new t74.b.Params(overwrite));
        return i0.f148189a;
    }
}
