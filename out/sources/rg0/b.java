package rg0;

import iy.a0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrg0/b;", "Lrg0/a;", "Lwy/a;", "masterKeyProvider", "Lwy/b;", "networkSessionManager", "<init>", "(Lwy/a;Lwy/b;)V", "", "b", "()Z", "Loq/i0;", "a", "()V", "Liy/a0;", "key", "c", "(Liy/a0;)V", "Lwy/a;", "Lwy/b;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    public b(wy.a aVar, wy.b bVar) {
        this.masterKeyProvider = aVar;
        this.networkSessionManager = bVar;
    }

    @Override // rg0.a
    public void a() {
        this.masterKeyProvider.clear();
        this.networkSessionManager.R();
    }

    @Override // rg0.a
    public boolean b() {
        return !this.masterKeyProvider.c().b(a0.INSTANCE.a());
    }

    @Override // rg0.a
    public void c(a0 key) {
        this.masterKeyProvider.b(key);
    }
}
