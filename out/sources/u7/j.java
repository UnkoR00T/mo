package u7;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f195954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f195955b;

    public static /* synthetic */ void a(Context context, w7.k kVar) {
        f195954a = (AudioManager) context.getSystemService("audio");
        kVar.f();
    }

    public static int b(AudioManager audioManager, h hVar) {
        return audioManager.abandonAudioFocusRequest(hVar.c());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f195955b != applicationContext) {
                f195954a = null;
            }
            AudioManager audioManager = f195954a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final w7.k kVar = new w7.k();
                w7.a.a().execute(new Runnable() { // from class: u7.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.a(applicationContext, kVar);
                    }
                });
                kVar.b();
                return (AudioManager) zj.p.q(f195954a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f195954a = audioManager2;
            return (AudioManager) zj.p.q(audioManager2);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static int d(AudioManager audioManager, int i15) {
        return audioManager.getStreamMaxVolume(i15);
    }

    public static int e(AudioManager audioManager, int i15) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i15);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int i15) {
        try {
            return audioManager.getStreamVolume(i15);
        } catch (RuntimeException e15) {
            t.i("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i15, e15);
            return audioManager.getStreamMaxVolume(i15);
        }
    }

    public static boolean g(AudioManager audioManager, int i15) {
        return audioManager.isStreamMute(i15);
    }

    public static int h(AudioManager audioManager, h hVar) {
        return audioManager.requestAudioFocus(hVar.c());
    }
}
