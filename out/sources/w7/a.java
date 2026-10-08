package w7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Executor f210604a;

    public static synchronized Executor a() {
        try {
            if (f210604a == null) {
                f210604a = o0.K0("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f210604a;
    }
}
