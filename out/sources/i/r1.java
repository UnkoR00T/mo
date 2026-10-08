package i;

import android.annotation.SuppressLint;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Li/r1;", "", "<init>", "()V", "Lnq/a;", "Li/p;", "androidMProvider", "Li/o;", "androidMHighSpeedProvider", "Li/q;", "androidNProvider", "Li/s;", "androidPProvider", "Li/k;", "androidExtensionProvider", "Lh/s$b;", "graphConfig", "Li/y2;", "a", "(Lnq/a;Lnq/a;Lnq/a;Lnq/a;Lnq/a;Lh/s$b;)Li/y2;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f87392a = new r1();

    private r1() {
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final y2 a(nq.a<p> androidMProvider, nq.a<o> androidMHighSpeedProvider, nq.a<q> androidNProvider, nq.a<s> androidPProvider, nq.a<k> androidExtensionProvider, h.s.b graphConfig) {
        int sessionMode = graphConfig.getSessionMode();
        h.s.e.Companion companion = h.s.e.INSTANCE;
        if (h.s.e.f(sessionMode, companion.b())) {
            if (Build.VERSION.SDK_INT >= 31) {
                return androidExtensionProvider.get();
            }
            throw new IllegalStateException("Cannot use Extension sessions below Android S");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return androidPProvider.get();
        }
        return h.s.e.f(graphConfig.getSessionMode(), companion.c()) ? androidMHighSpeedProvider.get() : androidNProvider.get();
    }
}
