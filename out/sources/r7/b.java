package r7;

import ju.h2;
import ju.p0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr7/b;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lju/p0;", "Ltq/i;", "coroutineContext", "<init>", "(Ltq/i;)V", "Loq/i0;", "close", "()V", "a", "Ltq/i;", "getCoroutineContext", "()Ltq/i;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements AutoCloseable, p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tq.i coroutineContext;

    public b(tq.i iVar) {
        this.coroutineContext = iVar;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        h2.f(getCoroutineContext(), null, 1, null);
    }

    @Override // ju.p0
    public tq.i getCoroutineContext() {
        return this.coroutineContext;
    }
}
