package c8;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements w0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f24374b;

    public t0(Context context) {
        this.f24373a = context == null ? null : context.getApplicationContext();
    }

    private static i b(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z15) {
        return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? i.f24237d : new i.b().e(true).g(z15).d();
    }

    private static i c(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z15) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return i.f24237d;
        }
        return new i.b().e(true).f(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).g(z15).d();
    }

    private static i d(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z15) {
        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormat, audioAttributes);
        if ((directPlaybackSupport & 1) == 0) {
            return i.f24237d;
        }
        return new i.b().e(true).f((directPlaybackSupport & 3) == 3).g(z15).d();
    }

    private boolean e(Context context) {
        Boolean bool = this.f24374b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = u7.j.c(context).getParameters("offloadVariableRateSupported");
            this.f24374b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f24374b = Boolean.FALSE;
        }
        return this.f24374b.booleanValue();
    }

    @Override // c8.w0.b
    public i a(t7.p pVar, t7.b bVar) {
        zj.p.q(pVar);
        zj.p.q(bVar);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 29 || pVar.I == -1) {
            return i.f24237d;
        }
        boolean zE = e(this.f24373a);
        int iB = t7.w.b((String) zj.p.q(pVar.f188381p), pVar.f188376k);
        if (iB == 0 || i15 < w7.o0.J(iB)) {
            return i.f24237d;
        }
        int iL = w7.o0.L(pVar.H);
        if (iL == 0) {
            return i.f24237d;
        }
        try {
            AudioFormat audioFormatK = w7.o0.K(pVar.I, iL, iB);
            if (i15 >= 33) {
                return d(audioFormatK, bVar.a(), zE);
            }
            return i15 >= 31 ? c(audioFormatK, bVar.a(), zE) : b(audioFormatK, bVar.a(), zE);
        } catch (IllegalArgumentException unused) {
            return i.f24237d;
        }
    }
}
