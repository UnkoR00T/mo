package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.lv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.mw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sd;
import java.nio.ByteBuffer;
import qi.c2;
import qi.e1;
import qi.f1;
import qi.z0;

/* JADX INFO: loaded from: classes4.dex */
class NativePipelineImpl implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lv f34635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z0 f34636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1 f34637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e1 f34638d;

    public NativePipelineImpl(z0 z0Var, f1 f1Var, e1 e1Var, lv lvVar) {
        this.f34636b = z0Var;
        this.f34637c = f1Var;
        this.f34638d = e1Var;
        this.f34635a = lvVar;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void close(long j15, long j16, long j17, long j18, long j19);

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void closeFileDescriptor(int i15) {
        this.f34638d.b(i15);
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initialize(byte[] bArr, long j15, long j16, long j17, long j18, long j19);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeFrameBufferReleaseCallback(long j15);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeFrameManager();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeIsolationCallback();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native long initializeResultsCallback();

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void m() {
        this.f34635a = null;
        this.f34636b = null;
        this.f34637c = null;
        this.f34638d = null;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onReleaseAtTimestampUs(long j15) {
        this.f34636b.c(j15);
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public void onResult(byte[] bArr) {
        try {
            this.f34637c.a(c2.H(bArr, this.f34635a));
        } catch (mw e15) {
            sd.f30625b.a(e15, "Error in result from JNI layer", new Object[0]);
        }
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public int openFileDescriptor(String str) {
        this.f34638d.d(str);
        return -1;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] process(long j15, long j16, long j17, byte[] bArr, int i15, int i16, int i17, int i18);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] processBitmap(long j15, long j16, Bitmap bitmap, int i15, int i16, int i17, int i18);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native byte[] processYuvFrame(long j15, long j16, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15, int i16, int i17, int i18, int i19, int i25);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void start(long j15);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native boolean stop(long j15);

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public native void waitUntilIdle(long j15);

    public NativePipelineImpl(String str, z0 z0Var, f1 f1Var, e1 e1Var, lv lvVar) {
        this(z0Var, f1Var, e1Var, lvVar);
        System.loadLibrary("mlkit_google_ocr_pipeline");
    }
}
