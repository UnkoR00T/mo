package wm;

import android.os.SystemClock;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import jg.k;
import jg.s;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final k f214071c = new k("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f214072a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f214073b = -1;

    public void a(vm.a aVar) {
        if (aVar.h() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f214072a.add(Long.valueOf(jElapsedRealtime));
        if (this.f214072a.size() > 5) {
            this.f214072a.removeFirst();
        }
        if (this.f214072a.size() != 5 || jElapsedRealtime - ((Long) s.l((Long) this.f214072a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j15 = this.f214073b;
        if (j15 == -1 || jElapsedRealtime - j15 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f214073b = jElapsedRealtime;
            f214071c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
