package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import qi.c2;
import qi.z0;

/* JADX INFO: loaded from: classes4.dex */
final class b implements a {
    public b(z0 z0Var) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void close(long j15, long j16, long j17, long j18, long j19) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initialize(byte[] bArr, long j15, long j16, long j17, long j18, long j19) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeFrameBufferReleaseCallback(long j15) {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeIsolationCallback() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void m() {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final byte[] process(long j15, long j16, long j17, byte[] bArr, int i15, int i16, int i17, int i18) {
        return c2.G().d();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final byte[] processBitmap(long j15, long j16, Bitmap bitmap, int i15, int i16, int i17, int i18) {
        return c2.G().d();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final byte[] processYuvFrame(long j15, long j16, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15, int i16, int i17, int i18, int i19, int i25) {
        return c2.G().d();
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void start(long j15) {
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final boolean stop(long j15) {
        return true;
    }

    @Override // com.google.android.libraries.vision.visionkit.pipeline.alt.a
    public final void waitUntilIdle(long j15) {
    }
}
