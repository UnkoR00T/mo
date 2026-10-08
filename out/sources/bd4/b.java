package bd4;

import dx.i;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lbd4/b;", "Lz64/b;", "Lo14/a;", "clearApplicationFilesUC", "Lc54/b;", "isFeatureEnabledUseCase", "<init>", "(Lo14/a;Lc54/b;)V", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "a", "()Z", "Lo14/a;", "Lc54/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements z64.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o14.a clearApplicationFilesUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    public b(o14.a aVar, c54.b bVar) {
        this.clearApplicationFilesUC = aVar;
        this.isFeatureEnabledUseCase = bVar;
    }

    @Override // z64.b
    public boolean a() {
        return this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
    }

    @Override // z64.b
    public Object b(tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.clearApplicationFilesUC.c(gz.b.a.C1792a.f78542a, eVar);
    }
}
