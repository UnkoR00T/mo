package f8;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class h extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f59982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f59983c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaFormat f59988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaFormat f59989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f59990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f59991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f59992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f59993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IllegalStateException f59994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m.c f59995o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f59981a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w7.g f59984d = new w7.g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.g f59985e = new w7.g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f59986f = new ArrayDeque<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f59987g = new ArrayDeque<>();

    h(HandlerThread handlerThread) {
        this.f59982b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f59985e.a(-2);
        this.f59987g.add(mediaFormat);
    }

    private void f() {
        if (!this.f59987g.isEmpty()) {
            this.f59989i = this.f59987g.getLast();
        }
        this.f59984d.b();
        this.f59985e.b();
        this.f59986f.clear();
        this.f59987g.clear();
    }

    private boolean i() {
        return this.f59992l > 0 || this.f59993m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f59994n;
        if (illegalStateException == null) {
            return;
        }
        this.f59994n = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f59991k;
        if (cryptoException == null) {
            return;
        }
        this.f59991k = null;
        throw cryptoException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f59990j;
        if (codecException == null) {
            return;
        }
        this.f59990j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        synchronized (this.f59981a) {
            try {
                if (this.f59993m) {
                    return;
                }
                long j15 = this.f59992l - 1;
                this.f59992l = j15;
                if (j15 > 0) {
                    return;
                }
                if (j15 < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f59981a) {
            this.f59994n = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f59981a) {
            try {
                j();
                int iE = -1;
                if (i()) {
                    return -1;
                }
                if (!this.f59984d.d()) {
                    iE = this.f59984d.e();
                }
                return iE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f59981a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.f59985e.d()) {
                    return -1;
                }
                int iE = this.f59985e.e();
                if (iE >= 0) {
                    zj.p.q(this.f59988h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f59986f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iE == -2) {
                    this.f59988h = this.f59987g.remove();
                }
                return iE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void e() {
        synchronized (this.f59981a) {
            this.f59992l++;
            ((Handler) o0.h(this.f59983c)).post(new Runnable() { // from class: f8.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59979a.n();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f59981a) {
            try {
                mediaFormat = this.f59988h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        zj.p.w(this.f59983c == null);
        this.f59982b.start();
        Handler handler = new Handler(this.f59982b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f59983c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f59981a) {
            this.f59991k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f59981a) {
            this.f59990j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i15) {
        synchronized (this.f59981a) {
            try {
                this.f59984d.a(i15);
                m.c cVar = this.f59995o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i15, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f59981a) {
            try {
                MediaFormat mediaFormat = this.f59989i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f59989i = null;
                }
                this.f59985e.a(i15);
                this.f59986f.add(bufferInfo);
                m.c cVar = this.f59995o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f59981a) {
            b(mediaFormat);
            this.f59989i = null;
        }
    }

    public void p(m.c cVar) {
        synchronized (this.f59981a) {
            this.f59995o = cVar;
        }
    }

    public void q() {
        synchronized (this.f59981a) {
            this.f59993m = true;
            this.f59982b.quit();
            f();
        }
    }

    public void r(Runnable runnable) {
        synchronized (this.f59981a) {
            j();
            runnable.run();
        }
    }
}
