package f8;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import w7.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f59977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f59978b;

    public static class b implements m.b {
        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [f8.f0$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // f8.m.b
        @SuppressLint({"WrongConstant"})
        public m a(m.a aVar) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecC = c(aVar);
                try {
                    l0.a("configureCodec");
                    Surface surface = aVar.f60012d;
                    mediaCodecC.configure(aVar.f60010b, surface, aVar.f60013e, (surface == null && aVar.f60009a.f60029k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    l0.b();
                    l0.a("startCodec");
                    mediaCodecC.start();
                    l0.b();
                    return new f0(mediaCodecC, aVar.f60014f);
                } catch (IOException e15) {
                    e = e15;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e16) {
                    e = e16;
                    mediaCodec = mediaCodecC;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e17) {
                e = e17;
            } catch (RuntimeException e18) {
                e = e18;
            }
        }

        protected MediaCodec c(m.a aVar) throws IOException {
            zj.p.q(aVar.f60009a);
            String str = aVar.f60009a.f60019a;
            l0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            l0.b();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void u(f0 f0Var, m.d dVar, MediaCodec mediaCodec, long j15, long j16) {
        f0Var.getClass();
        dVar.a(f0Var, j15, j16);
    }

    @Override // f8.m
    public void a(int i15, int i16, int i17, long j15, int i18) {
        this.f59977a.queueInputBuffer(i15, i16, i17, j15, i18);
    }

    @Override // f8.m
    public void b() {
        k kVar;
        try {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30 && i15 < 33) {
                this.f59977a.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (kVar = this.f59978b) != null) {
                kVar.d(this.f59977a);
            }
            this.f59977a.release();
        }
    }

    @Override // f8.m
    public void c(int i15, int i16, z7.c cVar, long j15, int i17) {
        this.f59977a.queueSecureInputBuffer(i15, i16, cVar.a(), j15, i17);
    }

    @Override // f8.m
    public void d(Bundle bundle) {
        this.f59977a.setParameters(bundle);
    }

    @Override // f8.m
    public void e(List<String> list) {
        this.f59977a.subscribeToVendorParameters(list);
    }

    @Override // f8.m
    public void f(final m.d dVar, Handler handler) {
        this.f59977a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: f8.e0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j15, long j16) {
                f0.u(this.f59960a, dVar, mediaCodec, j15, j16);
            }
        }, handler);
    }

    @Override // f8.m
    public void flush() {
        this.f59977a.flush();
    }

    @Override // f8.m
    public MediaFormat g() {
        return this.f59977a.getOutputFormat();
    }

    @Override // f8.m
    public void h() {
        this.f59977a.detachOutputSurface();
    }

    @Override // f8.m
    public void i(List<String> list) {
        this.f59977a.unsubscribeFromVendorParameters(list);
    }

    @Override // f8.m
    public void j(int i15) {
        this.f59977a.setVideoScalingMode(i15);
    }

    @Override // f8.m
    public ByteBuffer k(int i15) {
        return this.f59977a.getInputBuffer(i15);
    }

    @Override // f8.m
    public void l(Surface surface) {
        this.f59977a.setOutputSurface(surface);
    }

    @Override // f8.m
    public boolean m() {
        return false;
    }

    @Override // f8.m
    public void o(int i15, long j15) {
        this.f59977a.releaseOutputBuffer(i15, j15);
    }

    @Override // f8.m
    public int p() {
        return this.f59977a.dequeueInputBuffer(0L);
    }

    @Override // f8.m
    public int q(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f59977a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // f8.m
    public void s(int i15, boolean z15) {
        this.f59977a.releaseOutputBuffer(i15, z15);
    }

    @Override // f8.m
    public ByteBuffer t(int i15) {
        return this.f59977a.getOutputBuffer(i15);
    }

    private f0(MediaCodec mediaCodec, k kVar) {
        this.f59977a = mediaCodec;
        this.f59978b = kVar;
        if (Build.VERSION.SDK_INT < 35 || kVar == null) {
            return;
        }
        kVar.b(mediaCodec);
    }
}
