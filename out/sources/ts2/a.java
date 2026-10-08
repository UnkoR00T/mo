package ts2;

import gu.b;
import gu.d;
import gu.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgu/b;", "a", "J", "()J", "RESTRICTION_INTERVAL", "peselrestriction_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f191873a;

    static {
        b.Companion companion = b.INSTANCE;
        f191873a = d.q(30, e.MINUTES);
    }

    public static final long a() {
        return f191873a;
    }
}
