package fh;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg.y f63773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f63774b = new AtomicLong(-1);

    zj(Context context, String str) {
        this.f63773a = jg.x.b(context, jg.z.c().b("mlkit:vision").a());
    }

    public static zj a(Context context) {
        return new zj(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j15, Exception exc) {
        this.f63774b.set(j15);
    }

    public final synchronized void c(int i15, int i16, long j15, long j16) {
        AtomicLong atomicLong = this.f63774b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f63774b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f63773a.g(new jg.w(0, Arrays.asList(new jg.q(i15, i16, 0, j15, j16, null, null, 0, -1)))).e(new vh.g() { // from class: fh.yj
            @Override // vh.g
            public final void c(Exception exc) {
                this.f63749a.b(jElapsedRealtime, exc);
            }
        });
    }
}
