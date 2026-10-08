package ch;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg.y f26266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f26267b = new AtomicLong(-1);

    pk(Context context, String str) {
        this.f26266a = jg.x.b(context, jg.z.c().b("mlkit:vision").a());
    }

    public static pk a(Context context) {
        return new pk(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j15, Exception exc) {
        this.f26267b.set(j15);
    }

    public final synchronized void c(int i15, int i16, long j15, long j16) {
        AtomicLong atomicLong = this.f26267b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f26267b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f26266a.g(new jg.w(0, Arrays.asList(new jg.q(i15, i16, 0, j15, j16, null, null, 0, -1)))).e(new vh.g() { // from class: ch.ok
            @Override // vh.g
            public final void c(Exception exc) {
                this.f26235a.b(jElapsedRealtime, exc);
            }
        });
    }
}
