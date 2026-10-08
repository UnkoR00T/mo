package oz;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Loz/e;", "Loz/d;", "Lnx/b;", "Loz/q;", "ownerViewLifecycleManager", "<init>", "(Loz/q;)V", "LCON/p;", "activity", "Loq/i0;", "e", "(LCON/p;)V", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "a", "Loz/q;", "lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d, nx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q ownerViewLifecycleManager;

    public e(q qVar) {
        this.ownerViewLifecycleManager = qVar;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // oz.c
    public void e(CON.p activity) {
        this.ownerViewLifecycleManager.R(activity);
    }
}
