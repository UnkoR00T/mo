package gc4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lgc4/b;", "Lac4/b;", "Ls00/a;", "androidNfcManager", "<init>", "(Ls00/a;)V", "Lgz/b$a$a;", "params", "Lac4/b$a;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ls00/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements ac4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s00.a androidNfcManager;

    public b(s00.a aVar) {
        this.androidNfcManager = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super ac4.b.a> eVar) {
        return (this.androidNfcManager.j() && this.androidNfcManager.isEnabled()) ? ac4.b.a.C0108b.f5391a : ac4.b.a.C0107a.f5390a;
    }
}
