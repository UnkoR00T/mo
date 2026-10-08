package c8;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import java.util.Objects;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f24318m = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BiConsumer<AudioTrack.Builder, k.g> f24320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w0.d f24321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w0.b f24322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f24323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f24324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w7.s<k.f> f24325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w7.h f24326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c8.b f24327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f24328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Looper f24329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f24330l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BiConsumer<AudioTrack.Builder, k.g> f24332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private w0.b f24333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w0.d f24334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c8.b f24335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f24336f;

        public b(Context context) {
            this.f24331a = context != null ? context.getApplicationContext() : null;
            this.f24334d = w0.d.f24417a;
            if (context == null) {
                this.f24335e = c8.b.f24130g;
            }
            this.f24336f = 8.0f;
        }

        static /* synthetic */ w0.e f(b bVar) {
            bVar.getClass();
            return null;
        }

        public q0 h() {
            if (this.f24333c == null) {
                this.f24333c = new t0(this.f24331a);
            }
            return new q0(this);
        }

        b i(c8.b bVar) {
            if (this.f24331a == null) {
                this.f24335e = bVar;
            }
            return this;
        }

        public b j(w0.b bVar) {
            this.f24333c = bVar;
            return this;
        }

        public b k(w0.d dVar) {
            this.f24334d = dVar;
            return this;
        }

        b l(w0.e eVar) {
            return this;
        }
    }

    private final class c implements g0.b {
        private c() {
        }

        @Override // c8.g0.b
        public void a() {
            if (q0.this.f24328j != null) {
                q0 q0Var = q0.this;
                c8.b bVar = c8.b.f24130g;
                q0Var.f24327i = bVar;
                q0.this.f24328j.j(bVar);
            }
        }

        @Override // c8.g0.b
        public void b(AudioDeviceInfo audioDeviceInfo) {
            if (q0.this.f24328j != null) {
                q0.this.f24328j.m(audioDeviceInfo);
            }
        }
    }

    private int k(int i15) {
        return w7.o0.L(i15);
    }

    private AudioAttributes l(t7.b bVar, boolean z15) {
        return z15 ? n() : bVar.a();
    }

    private int m(int i15, int i16, int i17) {
        int minBufferSize = AudioTrack.getMinBufferSize(i15, i16, i17);
        zj.p.w(minBufferSize != -2);
        return minBufferSize;
    }

    private AudioAttributes n() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private int o(k.c cVar) {
        t7.p pVar = cVar.f24250a;
        if (!Objects.equals(pVar.f188381p, "audio/raw")) {
            return this.f24327i.m(pVar, cVar.f24251b) ? 2 : 0;
        }
        int i15 = pVar.J;
        if (i15 == 2) {
            return 2;
        }
        if (!cVar.f24253d) {
            return 0;
        }
        if (w7.o0.y0(i15)) {
            return Build.VERSION.SDK_INT < w7.o0.J(pVar.J) ? 0 : 2;
        }
        w7.t.h("ATAudioOutputProvider", "Invalid PCM encoding: " + pVar.J);
        return 0;
    }

    private static String p(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    private void r(k.c cVar) {
        Context context;
        s();
        d dVar = this.f24328j;
        if (dVar == null && (context = this.f24319a) != null) {
            d dVar2 = new d(context, new d.e() { // from class: c8.p0
                @Override // c8.d.e
                public final void a(b bVar) {
                    this.f24315a.q(bVar);
                }
            }, cVar.f24251b, cVar.f24252c);
            this.f24328j = dVar2;
            this.f24327i = dVar2.k();
        } else if (dVar != null) {
            AudioDeviceInfo audioDeviceInfo = cVar.f24252c;
            if (audioDeviceInfo != null) {
                dVar.m(audioDeviceInfo);
            }
            this.f24328j.l(cVar.f24251b);
        }
        zj.p.q(this.f24327i);
    }

    private void s() {
        if (this.f24319a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f24329k;
        zj.p.C(looper == null || looper == looperMyLooper, "AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", p(looper), p(looperMyLooper));
        this.f24329k = looperMyLooper;
    }

    @Override // c8.k
    public void b() {
        w7.s<k.f> sVar = this.f24325g;
        if (sVar != null) {
            sVar.i();
        }
        d dVar = this.f24328j;
        if (dVar != null) {
            dVar.n();
        }
    }

    @Override // c8.k
    public void c(w7.h hVar) {
        this.f24326h = hVar;
    }

    @Override // c8.k
    public void d(k.f fVar) {
        s();
        if (this.f24325g == null) {
            this.f24325g = new w7.s<>(Thread.currentThread());
        }
        this.f24325g.c(fVar);
    }

    @Override // c8.k
    public k.d e(k.c cVar) {
        r(cVar);
        i iVarA = this.f24322d.a(cVar.f24250a, cVar.f24251b);
        return new k.d.a().f(o(cVar)).g(iVarA.f24238a).h(iVarA.f24239b).i(iVarA.f24240c).e();
    }

    @Override // c8.k
    public k.g f(k.c cVar) throws k.b {
        int i15;
        boolean z15;
        int i16;
        int i17;
        int iK;
        int iG0;
        boolean z16;
        t7.p pVar = cVar.f24250a;
        r(cVar);
        if (Objects.equals(pVar.f188381p, "audio/raw")) {
            zj.p.d(w7.o0.y0(pVar.J));
            int i18 = pVar.J;
            i15 = pVar.I;
            iK = k(pVar.H);
            iG0 = w7.o0.g0(i18, pVar.H);
            z15 = cVar.f24254e;
            i16 = i18;
            z16 = false;
            i17 = 0;
        } else {
            i15 = pVar.I;
            i iVarA = cVar.f24255f ? this.f24322d.a(pVar, cVar.f24251b) : i.f24237d;
            if (cVar.f24255f && iVarA.f24238a) {
                int iB = t7.w.b((String) zj.p.q(pVar.f188381p), pVar.f188376k);
                int iK2 = k(pVar.H);
                z16 = iVarA.f24239b;
                z15 = true;
                i17 = 1;
                i16 = iB;
                iK = iK2;
                iG0 = -1;
            } else {
                Pair<Integer, Integer> pairH = this.f24327i.h(pVar, cVar.f24251b);
                if (pairH == null) {
                    throw new k.b("Unable to configure passthrough for: " + pVar);
                }
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH.second).intValue();
                z15 = cVar.f24254e;
                i16 = iIntValue;
                i17 = 2;
                iK = iIntValue2;
                iG0 = -1;
                z16 = false;
            }
        }
        int i19 = pVar.f188375j;
        if (Objects.equals(pVar.f188381p, "audio/vnd.dts.hd;profile=lbr") && i19 == -1) {
            i19 = 768000;
        }
        int i25 = i19;
        int iA = cVar.f24259j;
        if (iA == -1) {
            iA = this.f24321c.a(m(i15, iK, i16), i16, i17, iG0 != -1 ? iG0 : 1, i15, i25, z15 ? this.f24324f : 1.0d);
            i15 = i15;
        }
        return new k.g.a().t(i15).p(iK).q(i16).o(iA).n(cVar.f24256g).m(cVar.f24251b).r(i17 == 1).s(cVar.f24258i).v(z15).u(z16).w(cVar.f24257h).l();
    }

    public c8.b i() {
        return this.f24327i;
    }

    @Override // c8.k
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public g0 g(k.g gVar) throws k.e {
        Context context;
        try {
            int i15 = gVar.f24286h;
            if (gVar.f24287i == -1 || this.f24319a == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context2 = this.f24330l;
                if (context2 == null || context2.getDeviceId() != gVar.f24287i) {
                    this.f24330l = this.f24319a.createDeviceContext(gVar.f24287i);
                }
                context = this.f24330l;
                i15 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(l(gVar.f24285g, gVar.f24282d)).setAudioFormat(new AudioFormat.Builder().setSampleRate(gVar.f24280b).setChannelMask(gVar.f24281c).setEncoding(gVar.f24279a).build()).setTransferMode(1).setBufferSizeInBytes(gVar.f24284f).setSessionId(i15);
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 29) {
                sessionId.setOffloadedPlayback(gVar.f24283e);
            }
            if (i16 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            BiConsumer<AudioTrack.Builder, k.g> biConsumer = this.f24320b;
            if (biConsumer != null) {
                biConsumer.accept(sessionId, gVar);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new g0(audioTrackBuild, gVar, this.f24323e, this.f24324f, this.f24326h);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new k.e();
        } catch (IllegalArgumentException e15) {
            e = e15;
            throw new k.e(e);
        } catch (UnsupportedOperationException e16) {
            e = e16;
            throw new k.e(e);
        }
    }

    void q(c8.b bVar) {
        s();
        c8.b bVar2 = this.f24327i;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        this.f24327i = bVar;
        w7.s<k.f> sVar = this.f24325g;
        if (sVar != null) {
            sVar.l(new w7.s.a() { // from class: c8.o0
                @Override // w7.s.a
                public final void b(Object obj) {
                    ((k.f) obj).a();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q0(b bVar) {
        this.f24319a = bVar.f24331a;
        this.f24320b = bVar.f24332b;
        this.f24322d = (w0.b) zj.p.q(bVar.f24333c);
        this.f24321c = bVar.f24334d;
        this.f24327i = bVar.f24335e;
        b.f(bVar);
        this.f24323e = bVar.f24331a != null ? new c() : null;
        this.f24324f = bVar.f24336f;
        this.f24326h = w7.h.f210683a;
    }
}
