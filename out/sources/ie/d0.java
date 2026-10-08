package ie;

import CON.j0;
import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d0<T> implements zd.j<T, Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zd.g<Long> f91885d = zd.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zd.g<Integer> f91886e = zd.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f91887f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f91888g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e<T> f91889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.d f91890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f91891c;

    class a implements zd.g.b<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f91892a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // zd.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l15, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f91892a) {
                this.f91892a.position(0);
                messageDigest.update(this.f91892a.putLong(l15.longValue()).array());
            }
        }
    }

    class b implements zd.g.b<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f91893a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // zd.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f91893a) {
                this.f91893a.position(0);
                messageDigest.update(this.f91893a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        @Override // ie.d0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // ie.d0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static final class d implements e<ByteBuffer> {

        class a extends MediaDataSource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f91894a;

            a(ByteBuffer byteBuffer) {
                this.f91894a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f91894a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j15, byte[] bArr, int i15, int i16) {
                if (j15 >= this.f91894a.limit()) {
                    return -1;
                }
                this.f91894a.position((int) j15);
                int iMin = Math.min(i16, this.f91894a.remaining());
                this.f91894a.get(bArr, i15, iMin);
                return iMin;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // ie.d0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // ie.d0.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    interface e<T> {
        void a(MediaExtractor mediaExtractor, T t15);

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t15);
    }

    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // ie.d0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // ie.d0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    d0(ce.d dVar, e<T> eVar) {
        this(dVar, eVar, f91887f);
    }

    public static zd.j<AssetFileDescriptor, Bitmap> c(ce.d dVar) {
        return new d0(dVar, new c(null));
    }

    public static zd.j<ByteBuffer, Bitmap> d(ce.d dVar) {
        return new d0(dVar, new d());
    }

    @TargetApi(30)
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                return bitmap;
            }
        }
        return bitmap;
    }

    private Bitmap f(T t15, MediaMetadataRetriever mediaMetadataRetriever, long j15, int i15, int i16, int i17, n nVar) {
        if (l(t15, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (Build.VERSION.SDK_INT < 27 || i16 == Integer.MIN_VALUE || i17 == Integer.MIN_VALUE || nVar == n.f91914f) ? null : h(mediaMetadataRetriever, j15, i15, i16, i17, nVar);
        if (bitmapH == null) {
            bitmapH = g(mediaMetadataRetriever, j15, i15);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j15, int i15) {
        return mediaMetadataRetriever.getFrameAtTime(j15, i15);
    }

    @TargetApi(27)
    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j15, int i15, int i16, int i17, n nVar) {
        try {
            int i18 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i19 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i25 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i25 == 90 || i25 == 270) {
                i19 = i18;
                i18 = i19;
            }
            float fB = nVar.b(i18, i19, i16, i17);
            return mediaMetadataRetriever.getScaledFrameAtTime(j15, i15, Math.round(i18 * fB), Math.round(fB * i19));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i15 = Integer.parseInt(strExtractMetadata);
        return (i15 == 7 || i15 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i15 = Build.VERSION.SDK_INT;
        return i15 >= 30 && i15 < 33;
    }

    private static boolean k() {
        Iterator<String> it = f91888g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    private boolean l(T t15, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            MediaExtractor mediaExtractor = null;
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f91889a.a(mediaExtractor2, t15);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i15 = 0; i15 < trackCount; i15++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i15).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable unused) {
                    mediaExtractor = mediaExtractor2;
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                }
            } catch (Throwable unused2) {
            }
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
        }
        return false;
    }

    public static zd.j<ParcelFileDescriptor, Bitmap> m(ce.d dVar) {
        return new d0(dVar, new g());
    }

    @Override // zd.j
    public boolean a(T t15, zd.h hVar) {
        return true;
    }

    @Override // zd.j
    public be.v<Bitmap> b(T t15, int i15, int i16, zd.h hVar) throws Exception {
        long jLongValue = ((Long) hVar.c(f91885d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) hVar.c(f91886e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) hVar.c(n.f91916h);
        if (nVar == null) {
            nVar = n.f91915g;
        }
        n nVar2 = nVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f91891c.a();
        try {
            this.f91889a.b(mediaMetadataRetrieverA, t15);
            try {
                Bitmap bitmapF = f(t15, mediaMetadataRetrieverA, jLongValue, num.intValue(), i15, i16, nVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    j0.a(mediaMetadataRetrieverA);
                } else {
                    mediaMetadataRetrieverA.release();
                }
                return ie.f.e(bitmapF, this.f91890b);
            } catch (Throwable th4) {
                th = th4;
                Throwable th5 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    j0.a(mediaMetadataRetrieverA);
                    throw th5;
                }
                mediaMetadataRetrieverA.release();
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    d0(ce.d dVar, e<T> eVar, f fVar) {
        this.f91890b = dVar;
        this.f91889a = eVar;
        this.f91891c = fVar;
    }
}
