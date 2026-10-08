package l8;

import ak.n0;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c8.l0;
import java.util.List;
import java.util.Objects;
import u7.j;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Spatializer f116933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f116934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f116935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Spatializer$OnSpatializerStateChangedListener f116936d;

    class a implements Spatializer$OnSpatializerStateChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f116937a;

        a(Runnable runnable) {
            this.f116937a = runnable;
        }

        public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z15) {
            this.f116937a.run();
        }

        public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z15) {
            this.f116937a.run();
        }
    }

    public c(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerC = context == null ? null : j.c(context);
        if (audioManagerC == null || (bool != null && bool.booleanValue())) {
            this.f116933a = null;
            this.f116934b = false;
            this.f116935c = null;
            this.f116936d = null;
            return;
        }
        Spatializer spatializer = audioManagerC.getSpatializer();
        this.f116933a = spatializer;
        this.f116934b = spatializer.getImmersiveAudioLevel() != 0;
        if (runnable == null) {
            this.f116935c = null;
            this.f116936d = null;
            return;
        }
        Handler handler = new Handler((Looper) p.q(Looper.myLooper()));
        this.f116935c = handler;
        a aVar = new a(runnable);
        this.f116936d = aVar;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new l0(handler), aVar);
    }

    public boolean a(t7.b bVar, t7.p pVar) {
        int i15;
        if (!f()) {
            return false;
        }
        if (Objects.equals(pVar.f188381p, "audio/eac3-joc")) {
            i15 = pVar.H;
            if (i15 == 16) {
                i15 = 12;
            }
        } else if (Objects.equals(pVar.f188381p, "audio/iamf")) {
            i15 = pVar.H;
            if (i15 == -1) {
                i15 = 6;
            }
        } else if (Objects.equals(pVar.f188381p, "audio/ac4")) {
            i15 = pVar.H;
            if (i15 == 18 || i15 == 21) {
                i15 = 24;
            }
        } else {
            i15 = pVar.H;
        }
        int iL = o0.L(i15);
        if (iL == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iL);
        int i16 = pVar.I;
        if (i16 != -1) {
            channelMask.setSampleRate(i16);
        }
        return b.a(p.q(this.f116933a)).canBeSpatialized(bVar.a(), channelMask.build());
    }

    public List<Integer> b() {
        if (f()) {
            return Build.VERSION.SDK_INT >= 36 ? b.a(p.q(this.f116933a)).getSpatializedChannelMasks() : n0.E(252);
        }
        return n0.C();
    }

    public boolean c() {
        Spatializer spatializer = this.f116933a;
        return spatializer != null && spatializer.isAvailable();
    }

    public boolean d() {
        Spatializer spatializer = this.f116933a;
        return spatializer != null && spatializer.isEnabled();
    }

    public boolean e() {
        return this.f116934b;
    }

    public boolean f() {
        return this.f116933a != null && this.f116934b && c() && d();
    }

    public void g() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Spatializer spatializer = this.f116933a;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f116936d) == null || this.f116935c == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        this.f116935c.removeCallbacksAndMessages(null);
    }
}
