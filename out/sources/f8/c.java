package f8;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import w7.l0;

/* JADX INFO: loaded from: classes3.dex */
final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f59942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f59943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f59944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f59945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f59947f;

    public static final class b implements m.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final zj.w<HandlerThread> f59948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zj.w<HandlerThread> f59949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f59950d;

        public b(final int i15) {
            this(new zj.w() { // from class: f8.d
                @Override // zj.w
                public final Object get() {
                    return c.b.d(i15);
                }
            }, new zj.w() { // from class: f8.e
                @Override // zj.w
                public final Object get() {
                    return c.b.c(i15);
                }
            });
        }

        public static /* synthetic */ HandlerThread c(int i15) {
            return new HandlerThread(c.A(i15));
        }

        public static /* synthetic */ HandlerThread d(int i15) {
            return new HandlerThread(c.z(i15));
        }

        private static boolean g() {
            return Build.VERSION.SDK_INT >= 36;
        }

        @Override // f8.m.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c a(m.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            n fVar;
            int i15;
            String str = aVar.f60009a.f60019a;
            c cVar = null;
            try {
                l0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f59950d && g()) {
                        fVar = new g0(mediaCodecCreateByCodecName);
                        i15 = 4;
                    } else {
                        fVar = new f(mediaCodecCreateByCodecName, this.f59949c.get());
                        i15 = 0;
                    }
                    c cVar2 = new c(mediaCodecCreateByCodecName, this.f59948b.get(), fVar, aVar.f60014f);
                    try {
                        l0.b();
                        Surface surface = aVar.f60012d;
                        if (surface == null && aVar.f60009a.f60029k && Build.VERSION.SDK_INT >= 35) {
                            i15 |= 8;
                        }
                        cVar2.C(aVar.f60010b, surface, aVar.f60013e, i15);
                        return cVar2;
                    } catch (Exception e15) {
                        exc = e15;
                        cVar = cVar2;
                        if (cVar != null) {
                            cVar.b();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e16) {
                    exc = e16;
                }
            } catch (Exception e17) {
                exc = e17;
                mediaCodecCreateByCodecName = null;
            }
        }

        public void f(boolean z15) {
            this.f59950d = z15;
        }

        public b(zj.w<HandlerThread> wVar, zj.w<HandlerThread> wVar2) {
            this.f59948b = wVar;
            this.f59949c = wVar2;
            this.f59950d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String A(int i15) {
        return B(i15, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String B(int i15, String str) {
        StringBuilder sb5 = new StringBuilder(str);
        if (i15 == 1) {
            sb5.append("Audio");
        } else if (i15 == 2) {
            sb5.append("Video");
        } else {
            sb5.append("Unknown(");
            sb5.append(i15);
            sb5.append(")");
        }
        return sb5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i15) {
        k kVar;
        this.f59943b.h(this.f59942a);
        l0.a("configureCodec");
        this.f59942a.configure(mediaFormat, surface, mediaCrypto, i15);
        l0.b();
        this.f59944c.start();
        l0.a("startCodec");
        this.f59942a.start();
        l0.b();
        if (Build.VERSION.SDK_INT >= 35 && (kVar = this.f59945d) != null) {
            kVar.b(this.f59942a);
        }
        this.f59947f = 1;
    }

    public static /* synthetic */ void u(c cVar, m.d dVar, MediaCodec mediaCodec, long j15, long j16) {
        cVar.getClass();
        dVar.a(cVar, j15, j16);
    }

    public static /* synthetic */ void v(c cVar, Runnable runnable) {
        cVar.f59944c.b();
        cVar.f59943b.r(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String z(int i15) {
        return B(i15, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    @Override // f8.m
    public void a(int i15, int i16, int i17, long j15, int i18) {
        this.f59944c.a(i15, i16, i17, j15, i18);
    }

    @Override // f8.m
    public void b() {
        k kVar;
        k kVar2;
        try {
            if (this.f59947f == 1) {
                this.f59944c.shutdown();
                this.f59943b.q();
            }
            this.f59947f = 2;
            if (this.f59946e) {
                return;
            }
            try {
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 30 && i15 < 33) {
                    this.f59942a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (kVar2 = this.f59945d) != null) {
                    kVar2.d(this.f59942a);
                }
                this.f59942a.release();
                this.f59946e = true;
            }
        } catch (Throwable th4) {
            if (!this.f59946e) {
                try {
                    int i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 30 && i16 < 33) {
                        this.f59942a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (kVar = this.f59945d) != null) {
                        kVar.d(this.f59942a);
                    }
                    this.f59942a.release();
                    this.f59946e = true;
                }
            }
            throw th4;
        }
    }

    @Override // f8.m
    public void c(int i15, int i16, z7.c cVar, long j15, int i17) {
        this.f59944c.c(i15, i16, cVar, j15, i17);
    }

    @Override // f8.m
    public void d(Bundle bundle) {
        this.f59944c.d(bundle);
    }

    @Override // f8.m
    public void e(List<String> list) {
        this.f59942a.subscribeToVendorParameters(list);
    }

    @Override // f8.m
    public void f(final m.d dVar, Handler handler) {
        this.f59942a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: f8.b
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j15, long j16) {
                c.u(this.f59938a, dVar, mediaCodec, j15, j16);
            }
        }, handler);
    }

    @Override // f8.m
    public void flush() {
        this.f59944c.flush();
        this.f59942a.flush();
        this.f59943b.e();
        this.f59942a.start();
    }

    @Override // f8.m
    public MediaFormat g() {
        return this.f59943b.g();
    }

    @Override // f8.m
    public void h() {
        this.f59942a.detachOutputSurface();
    }

    @Override // f8.m
    public void i(List<String> list) {
        this.f59942a.unsubscribeFromVendorParameters(list);
    }

    @Override // f8.m
    public void j(int i15) {
        this.f59942a.setVideoScalingMode(i15);
    }

    @Override // f8.m
    public ByteBuffer k(int i15) {
        return this.f59942a.getInputBuffer(i15);
    }

    @Override // f8.m
    public void l(Surface surface) {
        this.f59942a.setOutputSurface(surface);
    }

    @Override // f8.m
    public boolean m() {
        return false;
    }

    @Override // f8.m
    public void n(final Runnable runnable) {
        this.f59943b.r(new Runnable() { // from class: f8.a
            @Override // java.lang.Runnable
            public final void run() {
                c.v(this.f59935a, runnable);
            }
        });
    }

    @Override // f8.m
    public void o(int i15, long j15) {
        this.f59942a.releaseOutputBuffer(i15, j15);
    }

    @Override // f8.m
    public int p() {
        this.f59944c.b();
        return this.f59943b.c();
    }

    @Override // f8.m
    public int q(MediaCodec.BufferInfo bufferInfo) {
        this.f59944c.b();
        return this.f59943b.d(bufferInfo);
    }

    @Override // f8.m
    public boolean r(m.c cVar) {
        this.f59943b.p(cVar);
        return true;
    }

    @Override // f8.m
    public void s(int i15, boolean z15) {
        this.f59942a.releaseOutputBuffer(i15, z15);
    }

    @Override // f8.m
    public ByteBuffer t(int i15) {
        return this.f59942a.getOutputBuffer(i15);
    }

    private c(MediaCodec mediaCodec, HandlerThread handlerThread, n nVar, k kVar) {
        this.f59942a = mediaCodec;
        this.f59943b = new h(handlerThread);
        this.f59944c = nVar;
        this.f59945d = kVar;
        this.f59947f = 0;
    }
}
