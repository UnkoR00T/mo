package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
interface a {
    void close(long j15, long j16, long j17, long j18, long j19);

    long initialize(byte[] bArr, long j15, long j16, long j17, long j18, long j19);

    long initializeFrameBufferReleaseCallback(long j15);

    long initializeFrameManager();

    long initializeIsolationCallback();

    long initializeResultsCallback();

    void m();

    byte[] process(long j15, long j16, long j17, byte[] bArr, int i15, int i16, int i17, int i18);

    byte[] processBitmap(long j15, long j16, Bitmap bitmap, int i15, int i16, int i17, int i18);

    byte[] processYuvFrame(long j15, long j16, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15, int i16, int i17, int i18, int i19, int i25);

    void start(long j15);

    boolean stop(long j15);

    void waitUntilIdle(long j15);
}
