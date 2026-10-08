package e;

import java.util.concurrent.TimeUnit;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\n\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0002¨\u0006\n"}, d2 = {"", "a", "J", "CHECK_FLASH_REQUIRED_TIMEOUT_IN_NS", "b", "CHECK_3A_TIMEOUT_IN_NS", "c", "CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS", "d", "CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f46012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f46013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f46014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f46015d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f46012a = timeUnit.toNanos(1L);
        f46013b = timeUnit.toNanos(1L);
        f46014c = timeUnit.toNanos(5L);
        f46015d = timeUnit.toNanos(2L);
    }
}
