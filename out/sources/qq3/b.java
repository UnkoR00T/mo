package qq3;

import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Lqq3/b;", "Lsq3/c;", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "shouldCheckWhatsNew", "whatsnew_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements sq3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean shouldCheckWhatsNew = new AtomicBoolean(true);

    @Override // sq3.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public AtomicBoolean getShouldCheckWhatsNew() {
        return this.shouldCheckWhatsNew;
    }
}
