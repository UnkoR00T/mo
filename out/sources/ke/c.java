package ke;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import be.v;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import ve.l;
import zd.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f110235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.b f110236b;

    private static final class a implements v<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f110237a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f110237a = animatedImageDrawable;
        }

        @Override // be.v
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f110237a;
        }

        @Override // be.v
        public void c() {
            this.f110237a.stop();
            this.f110237a.clearAnimationCallbacks();
        }

        @Override // be.v
        public Class<Drawable> d() {
            return Drawable.class;
        }

        @Override // be.v
        public int getSize() {
            return this.f110237a.getIntrinsicWidth() * this.f110237a.getIntrinsicHeight() * l.i(Bitmap.Config.ARGB_8888) * 2;
        }
    }

    private static final class b implements j<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f110238a;

        b(c cVar) {
            this.f110238a = cVar;
        }

        @Override // zd.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v<Drawable> b(ByteBuffer byteBuffer, int i15, int i16, zd.h hVar) {
            return this.f110238a.b(ImageDecoder.createSource(byteBuffer), i15, i16, hVar);
        }

        @Override // zd.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, zd.h hVar) {
            return this.f110238a.d(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: ke.c$c, reason: collision with other inner class name */
    private static final class C2639c implements j<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f110239a;

        C2639c(c cVar) {
            this.f110239a = cVar;
        }

        @Override // zd.j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public v<Drawable> b(InputStream inputStream, int i15, int i16, zd.h hVar) {
            return this.f110239a.b(ImageDecoder.createSource(ve.a.b(inputStream)), i15, i16, hVar);
        }

        @Override // zd.j
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, zd.h hVar) {
            return this.f110239a.c(inputStream);
        }
    }

    private c(List<ImageHeaderParser> list, ce.b bVar) {
        this.f110235a = list;
        this.f110236b = bVar;
    }

    public static j<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, ce.b bVar) {
        return new b(new c(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    public static j<InputStream, Drawable> f(List<ImageHeaderParser> list, ce.b bVar) {
        return new C2639c(new c(list, bVar));
    }

    v<Drawable> b(ImageDecoder.Source source, int i15, int i16, zd.h hVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new he.a(i15, i16, hVar));
        if (ke.a.a(drawableDecodeDrawable)) {
            return new a(ke.b.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f110235a, inputStream, this.f110236b));
    }

    boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f110235a, byteBuffer));
    }
}
