package u7;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import w7.t;
import zj.w;
import zj.x;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w<AudioManager> f195930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f195931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f195932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t7.b f195933d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f195935f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h f195937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f195938i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f195936g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f195934e = 0;

    public interface a {
        void e(float f15);

        void h(int i15);
    }

    public g(final Context context, Looper looper, a aVar) {
        this.f195930a = x.a(new w() { // from class: u7.f
            @Override // zj.w
            public final Object get() {
                return j.c(context);
            }
        });
        this.f195932c = aVar;
        this.f195931b = new Handler(looper);
    }

    private void c() {
        int i15 = this.f195934e;
        if (i15 == 1 || i15 == 0 || this.f195937h == null) {
            return;
        }
        j.b(this.f195930a.get(), this.f195937h);
    }

    private static int d(t7.b bVar) {
        if (bVar == null) {
            return 0;
        }
        switch (bVar.f188103c) {
            case 0:
                t.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (bVar.f188101a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                t.h("AudioFocusManager", "Unidentified audio usage: " + bVar.f188103c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i15) {
        a aVar = this.f195932c;
        if (aVar != null) {
            aVar.h(i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i15) {
        if (i15 == -3 || i15 == -2) {
            if (i15 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i15 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i15 == 1) {
            l(2);
            e(1);
        } else {
            t.h("AudioFocusManager", "Unknown focus change type: " + i15);
        }
    }

    private int i() {
        if (this.f195934e == 2) {
            return 1;
        }
        int iJ = j();
        if (iJ == 1 || iJ == 2) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        h hVar = this.f195937h;
        if (hVar == null || this.f195938i) {
            this.f195937h = (hVar == null ? new h.b(this.f195935f) : hVar.a()).c((t7.b) zj.p.q(this.f195933d)).e(o()).b(true).d(new AudioManager.OnAudioFocusChangeListener() { // from class: u7.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i15) {
                    this.f195928a.g(i15);
                }
            }, this.f195931b).a();
            this.f195938i = false;
        }
        return j.h(this.f195930a.get(), this.f195937h);
    }

    private void l(int i15) {
        if (this.f195934e == i15) {
            return;
        }
        this.f195934e = i15;
        float f15 = i15 == 4 ? 0.2f : 1.0f;
        if (this.f195936g == f15) {
            return;
        }
        this.f195936g = f15;
        a aVar = this.f195932c;
        if (aVar != null) {
            aVar.e(f15);
        }
    }

    private boolean m(int i15) {
        return i15 != 1 && this.f195935f == 1;
    }

    private boolean o() {
        t7.b bVar = this.f195933d;
        return bVar != null && bVar.f188101a == 1;
    }

    public float f() {
        return this.f195936g;
    }

    public void h() {
        this.f195932c = null;
        c();
        l(0);
    }

    public void k(t7.b bVar) {
        if (Objects.equals(this.f195933d, bVar)) {
            return;
        }
        this.f195933d = bVar;
        int iD = d(bVar);
        this.f195935f = iD;
        boolean z15 = true;
        if (iD != 1 && iD != 0) {
            z15 = false;
        }
        zj.p.e(z15, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int n(boolean z15, int i15) {
        if (!m(i15)) {
            c();
            l(0);
            return 1;
        }
        if (z15) {
            return i();
        }
        int i16 = this.f195934e;
        if (i16 != 1) {
            return i16 != 3 ? 1 : 0;
        }
        return -1;
    }
}
