package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.v3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2;
import dn.a;
import io.sentry.android.core.c2;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class BarhopperV3 implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31524b = "BarhopperV3";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f31525a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j15);

    private native long createNativeWithClientOptions(byte[] bArr);

    private static a r(byte[] bArr) {
        bArr.getClass();
        try {
            return a.K(bArr, w2.a());
        } catch (v3 e15) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e15);
        }
    }

    private native byte[] recognizeBitmapNative(long j15, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j15, int i15, int i16, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j15, int i15, int i16, byte[] bArr, RecognitionOptions recognitionOptions);

    public void b(yj.a aVar) {
        if (this.f31525a != 0) {
            c2.g(f31524b, "Native pointer already exists.");
            return;
        }
        long jCreateNativeWithClientOptions = createNativeWithClientOptions(aVar.e());
        this.f31525a = jCreateNativeWithClientOptions;
        if (jCreateNativeWithClientOptions == 0) {
            throw new IllegalArgumentException("Failed to create native pointer with client options.");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j15 = this.f31525a;
        if (j15 != 0) {
            closeNative(j15);
            this.f31525a = 0L;
        }
    }

    public a h(int i15, int i16, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j15 = this.f31525a;
        if (j15 != 0) {
            return r(recognizeBufferNative(j15, i15, i16, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public a m(int i15, int i16, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j15 = this.f31525a;
        if (j15 != 0) {
            return r(recognizeNative(j15, i15, i16, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native pointer does not exist.");
    }

    public a p(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f31525a == 0) {
            throw new IllegalStateException("Native pointer does not exist.");
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig()));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return r(recognizeBitmapNative(this.f31525a, bitmap, recognitionOptions));
    }
}
