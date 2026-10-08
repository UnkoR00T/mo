package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.mw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl;
import java.nio.ByteBuffer;
import qi.c2;
import qi.d1;
import qi.e1;
import qi.f1;
import qi.g0;
import qi.h0;
import qi.z0;

/* JADX INFO: loaded from: classes4.dex */
public class c implements z0, f1, e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f34639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f34640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f34642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f34643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f34644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f34645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final lv f34646h;

    public c(d1 d1Var, String str) {
        lv lvVarB = lv.b();
        lv lvVarA = lvVarB == null ? lv.a() : lvVarB;
        if (d1Var.K()) {
            this.f34640b = new b(this);
        } else if (d1Var.J()) {
            this.f34640b = new NativePipelineImpl(this, this, this, lvVarA);
        } else {
            this.f34640b = new NativePipelineImpl("mlkit_google_ocr_pipeline", this, this, this, lvVarA);
        }
        if (d1Var.M()) {
            this.f34639a = new h0(d1Var.E());
        } else {
            this.f34639a = new h0(10);
        }
        this.f34646h = lvVarA;
        long jInitializeFrameManager = this.f34640b.initializeFrameManager();
        this.f34642d = jInitializeFrameManager;
        long jInitializeFrameBufferReleaseCallback = this.f34640b.initializeFrameBufferReleaseCallback(jInitializeFrameManager);
        this.f34643e = jInitializeFrameBufferReleaseCallback;
        long jInitializeResultsCallback = this.f34640b.initializeResultsCallback();
        this.f34644f = jInitializeResultsCallback;
        long jInitializeIsolationCallback = this.f34640b.initializeIsolationCallback();
        this.f34645g = jInitializeIsolationCallback;
        this.f34641c = this.f34640b.initialize(d1Var.d(), jInitializeFrameBufferReleaseCallback, jInitializeResultsCallback, jInitializeIsolationCallback, 0L, 0L);
    }

    @Override // qi.f1
    public final void a(c2 c2Var) {
        sd.f30625b.b(this, "Pipeline received results: ".concat(String.valueOf(c2Var)), new Object[0]);
    }

    @Override // qi.e1
    public final void b(int i15) {
        io.sentry.android.core.c2.g("VKP", "closeFileDescriptor called but is not available for this pipeline. Ignoring call.");
    }

    @Override // qi.z0
    public final void c(long j15) {
        this.f34639a.a(j15);
    }

    @Override // qi.e1
    public final int d(String str) {
        io.sentry.android.core.c2.g("VKP", "openFileDescriptor called but is not available for this pipeline. Ignoring call.");
        return -1;
    }

    public final tl e(g0 g0Var) {
        byte[] bArrProcess;
        if (this.f34641c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!this.f34639a.b(g0Var, g0Var.a()) || (bArrProcess = this.f34640b.process(this.f34641c, this.f34642d, g0Var.a(), g0Var.c(), g0Var.b().b(), g0Var.b().a(), g0Var.d() - 1, g0Var.e() - 1)) == null) {
            return tl.d();
        }
        try {
            return tl.e(c2.H(bArrProcess, this.f34646h));
        } catch (mw e15) {
            throw new IllegalStateException("Could not parse results", e15);
        }
    }

    public final synchronized void f() {
        long j15 = this.f34641c;
        if (j15 != 0) {
            this.f34640b.stop(j15);
            this.f34640b.close(this.f34641c, this.f34642d, this.f34643e, this.f34644f, this.f34645g);
            this.f34641c = 0L;
            this.f34640b.m();
        }
    }

    public final void g() throws PipelineException {
        long j15 = this.f34641c;
        if (j15 == 0) {
            throw new PipelineException(d.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
        }
        try {
            this.f34640b.start(j15);
            this.f34640b.waitUntilIdle(this.f34641c);
        } catch (PipelineException e15) {
            this.f34640b.stop(this.f34641c);
            throw e15;
        }
    }

    public final void h() {
        long j15 = this.f34641c;
        if (j15 == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!this.f34640b.stop(j15)) {
            throw new IllegalStateException("Pipeline did not stop successfully.");
        }
    }

    public final tl i(long j15, Bitmap bitmap, int i15) {
        if (this.f34641c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException("Unsupported bitmap config ".concat(String.valueOf(bitmap.getConfig())));
        }
        byte[] bArrProcessBitmap = this.f34640b.processBitmap(this.f34641c, j15, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i15 - 1);
        if (bArrProcessBitmap == null) {
            return tl.d();
        }
        try {
            return tl.e(c2.H(bArrProcessBitmap, this.f34646h));
        } catch (mw e15) {
            throw new IllegalStateException("Could not parse results", e15);
        }
    }

    public final tl j(long j15, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15, int i16, int i17, int i18, int i19, int i25) {
        if (this.f34641c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalStateException("Byte buffers are not direct.");
        }
        byte[] bArrProcessYuvFrame = this.f34640b.processYuvFrame(this.f34641c, j15, byteBuffer, byteBuffer2, byteBuffer3, i15, i16, i17, i18, i19, i25 - 1);
        if (bArrProcessYuvFrame == null) {
            return tl.d();
        }
        try {
            return tl.e(c2.H(bArrProcessYuvFrame, this.f34646h));
        } catch (mw e15) {
            throw new IllegalStateException("Could not parse results", e15);
        }
    }
}
