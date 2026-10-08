package f8;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
class f implements n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f59962g = new ArrayDeque<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f59963h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f59964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f59965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f59966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f59967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.k f59968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f59969f;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f.this.j(message);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f59971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f59972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f59973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f59974d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f59975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f59976f;

        b() {
        }

        public void a(int i15, int i16, int i17, long j15, int i18) {
            this.f59971a = i15;
            this.f59972b = i16;
            this.f59973c = i17;
            this.f59975e = j15;
            this.f59976f = i18;
        }
    }

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new w7.k());
    }

    private void f() {
        this.f59968e.d();
        ((Handler) zj.p.q(this.f59966c)).obtainMessage(3).sendToTarget();
        this.f59968e.a();
    }

    private static void g(z7.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f233219f;
        cryptoInfo.numBytesOfClearData = i(cVar.f233217d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f233218e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) zj.p.q(h(cVar.f233215b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) zj.p.q(h(cVar.f233214a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f233216c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f233220g, cVar.f233221h));
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    public void j(Message message) {
        b bVar;
        b bVar2;
        int i15 = message.what;
        if (i15 != 1) {
            if (i15 != 2) {
                bVar2 = null;
                if (i15 == 3) {
                    this.f59968e.f();
                } else if (i15 != 4) {
                    androidx.camera.view.i.a(this.f59967d, null, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    m((Bundle) message.obj);
                }
            } else {
                bVar = (b) message.obj;
                l(bVar.f59971a, bVar.f59972b, bVar.f59974d, bVar.f59975e, bVar.f59976f);
            }
            if (bVar2 != null) {
                p(bVar2);
            }
        }
        bVar = (b) message.obj;
        k(bVar.f59971a, bVar.f59972b, bVar.f59973c, bVar.f59975e, bVar.f59976f);
        bVar2 = bVar;
        if (bVar2 != null) {
            p(bVar2);
        }
    }

    private void k(int i15, int i16, int i17, long j15, int i18) {
        try {
            this.f59964a.queueInputBuffer(i15, i16, i17, j15, i18);
        } catch (RuntimeException e15) {
            androidx.camera.view.i.a(this.f59967d, null, e15);
        }
    }

    private void l(int i15, int i16, MediaCodec.CryptoInfo cryptoInfo, long j15, int i17) {
        try {
            synchronized (f59963h) {
                this.f59964a.queueSecureInputBuffer(i15, i16, cryptoInfo, j15, i17);
            }
        } catch (RuntimeException e15) {
            androidx.camera.view.i.a(this.f59967d, null, e15);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f59964a.setParameters(bundle);
        } catch (RuntimeException e15) {
            androidx.camera.view.i.a(this.f59967d, null, e15);
        }
    }

    private void n() {
        ((Handler) zj.p.q(this.f59966c)).removeCallbacksAndMessages(null);
        f();
    }

    private static b o() {
        ArrayDeque<b> arrayDeque = f59962g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f59962g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    @Override // f8.n
    public void a(int i15, int i16, int i17, long j15, int i18) {
        b();
        b bVarO = o();
        bVarO.a(i15, i16, i17, j15, i18);
        ((Handler) o0.h(this.f59966c)).obtainMessage(1, bVarO).sendToTarget();
    }

    @Override // f8.n
    public void b() {
        RuntimeException andSet = this.f59967d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // f8.n
    public void c(int i15, int i16, z7.c cVar, long j15, int i17) {
        b();
        b bVarO = o();
        bVarO.a(i15, i16, 0, j15, i17);
        g(cVar, bVarO.f59974d);
        ((Handler) o0.h(this.f59966c)).obtainMessage(2, bVarO).sendToTarget();
    }

    @Override // f8.n
    public void d(Bundle bundle) {
        b();
        ((Handler) o0.h(this.f59966c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // f8.n
    public void flush() {
        if (this.f59969f) {
            try {
                n();
            } catch (InterruptedException e15) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e15);
            }
        }
    }

    @Override // f8.n
    public void shutdown() {
        if (this.f59969f) {
            flush();
            this.f59965b.quit();
        }
        this.f59969f = false;
    }

    @Override // f8.n
    public void start() {
        if (this.f59969f) {
            return;
        }
        this.f59965b.start();
        this.f59966c = new a(this.f59965b.getLooper());
        this.f59969f = true;
    }

    f(MediaCodec mediaCodec, HandlerThread handlerThread, w7.k kVar) {
        this.f59964a = mediaCodec;
        this.f59965b = handlerThread;
        this.f59968e = kVar;
        this.f59967d = new AtomicReference<>();
    }
}
