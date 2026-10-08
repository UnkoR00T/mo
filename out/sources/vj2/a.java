package vj2;

import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lvj2/a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "atomicBoolean", "", "value", "()Z", "b", "(Z)V", "isLoggingOut", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean atomicBoolean = new AtomicBoolean(false);

    public final boolean a() {
        return this.atomicBoolean.get();
    }

    public final void b(boolean z15) {
        this.atomicBoolean.set(z15);
    }
}
