package com.bumptech.glide.load;

import ce.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28808a;

        ImageType(boolean z15) {
            this.f28808a = z15;
        }

        public boolean hasAlpha() {
            return this.f28808a;
        }

        public boolean isWebp() {
            int i15 = a.f28809a[ordinal()];
            return i15 == 1 || i15 == 2 || i15 == 3;
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28809a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f28809a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28809a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28809a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int a(ByteBuffer byteBuffer, b bVar);

    ImageType b(ByteBuffer byteBuffer);

    ImageType c(InputStream inputStream);

    int d(InputStream inputStream, b bVar);
}
