package o4;

import oq.d0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\t\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"", "a", "J", "()J", "EverythingButLastChildOffset", "b", "EverythingButParentId", "c", "TombStone", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f142191a = d0.e(d0.e(d0.e(1023) << 50) ^ (-1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f142192b = d0.e((-1) ^ d0.e(d0.e(33554431) << 25));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f142193c;

    static {
        long j15 = 33554431;
        f142193c = j15 | (((long) Math.min(0, 1023)) << 50) | (j15 << 25);
    }

    public static final long a() {
        return f142191a;
    }

    public static final long b() {
        return f142192b;
    }

    public static final long c() {
        return f142193c;
    }
}
