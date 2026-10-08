package xc0;

import gu.b;
import gu.d;
import gu.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxc0/a;", "", "<init>", "()V", "Lgu/b;", "b", "J", "a", "()J", "LOGIN_LOCK_TIMER_START_DURATION", "loginlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f217927a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long LOGIN_LOCK_TIMER_START_DURATION;

    static {
        b.Companion companion = b.INSTANCE;
        LOGIN_LOCK_TIMER_START_DURATION = d.q(5, e.MINUTES);
    }

    private a() {
    }

    public final long a() {
        return LOGIN_LOCK_TIMER_START_DURATION;
    }
}
