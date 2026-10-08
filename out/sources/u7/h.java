package u7;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f195939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f195940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f195941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t7.b f195942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f195943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f195944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f195945g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f195946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f195947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f195948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t7.b f195949d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f195950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f195951f;

        public h a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f195947b;
            if (onAudioFocusChangeListener != null) {
                return new h(this.f195946a, onAudioFocusChangeListener, (Handler) zj.p.q(this.f195948c), this.f195949d, this.f195950e, this.f195951f);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(boolean z15) {
            this.f195951f = z15;
            return this;
        }

        public b c(t7.b bVar) {
            zj.p.q(bVar);
            this.f195949d = bVar;
            return this;
        }

        public b d(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            zj.p.q(onAudioFocusChangeListener);
            zj.p.q(handler);
            this.f195947b = onAudioFocusChangeListener;
            this.f195948c = handler;
            return this;
        }

        public b e(boolean z15) {
            this.f195950e = z15;
            return this;
        }

        public b(int i15) {
            this.f195949d = t7.b.f188093i;
            this.f195946a = i15;
        }

        private b(h hVar) {
            this.f195946a = hVar.e();
            this.f195947b = hVar.f();
            this.f195948c = hVar.d();
            this.f195949d = hVar.b();
            this.f195950e = hVar.g();
        }
    }

    h(int i15, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, t7.b bVar, boolean z15, boolean z16) {
        this.f195939a = i15;
        this.f195941c = handler;
        this.f195942d = bVar;
        this.f195943e = z15;
        this.f195944f = z16;
        this.f195940b = onAudioFocusChangeListener;
        this.f195945g = new AudioFocusRequest.Builder(i15).setAudioAttributes(bVar.a()).setWillPauseWhenDucked(z15).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z16).build();
    }

    public b a() {
        return new b();
    }

    public t7.b b() {
        return this.f195942d;
    }

    AudioFocusRequest c() {
        return (AudioFocusRequest) zj.p.q(this.f195945g);
    }

    public Handler d() {
        return this.f195941c;
    }

    public int e() {
        return this.f195939a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f195939a == hVar.f195939a && this.f195943e == hVar.f195943e && Objects.equals(this.f195940b, hVar.f195940b) && Objects.equals(this.f195941c, hVar.f195941c) && Objects.equals(this.f195942d, hVar.f195942d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f195940b;
    }

    public boolean g() {
        return this.f195943e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f195939a), this.f195940b, this.f195941c, this.f195942d, Boolean.valueOf(this.f195943e));
    }
}
