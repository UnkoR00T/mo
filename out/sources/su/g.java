package su;

import ou.e0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "locked", "Lsu/a;", "a", "(Z)Lsu/a;", "Lou/e0;", "Lou/e0;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f184345a = new e0("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f184346b = new e0("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z15) {
        return new f(z15);
    }

    public static /* synthetic */ a b(boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        return a(z15);
    }
}
