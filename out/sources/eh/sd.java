package eh;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg.y f51065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f51066b = new AtomicLong(-1);

    sd(Context context, String str) {
        this.f51065a = jg.x.b(context, jg.z.c().b("mlkit:vision").a());
    }

    public static sd a(Context context) {
        return new sd(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j15, Exception exc) {
        this.f51066b.set(j15);
    }

    public final synchronized void c(int i15, int i16, long j15, long j16) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f51066b.get() != -1 && jElapsedRealtime - this.f51066b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f51065a.g(new jg.w(0, Arrays.asList(new jg.q(i15, i16, 0, j15, j16, null, null, 0)))).e(new vh.g() { // from class: eh.rd
            @Override // vh.g
            public final void c(Exception exc) {
                this.f51025a.b(jElapsedRealtime, exc);
            }
        });
    }
}
