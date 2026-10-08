package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallerInitializer implements db.a<b> {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: ma.f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.f.h(context);
            }
        });
    }

    @Override // db.a
    public List<Class<? extends db.a<?>>> a() {
        return Collections.EMPTY_LIST;
    }

    @Override // db.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: ma.d
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j15) {
                this.f124990a.g(applicationContext);
            }
        });
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: ma.e
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.h(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
