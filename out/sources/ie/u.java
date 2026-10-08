package ie;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
interface u {

    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f91947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f91948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ce.b f91949c;

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, ce.b bVar) {
            this.f91947a = byteBuffer;
            this.f91948b = list;
            this.f91949c = bVar;
        }

        private InputStream e() {
            return ve.a.g(ve.a.d(this.f91947a));
        }

        @Override // ie.u
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // ie.u
        public void b() {
        }

        @Override // ie.u
        public int c() {
            return com.bumptech.glide.load.a.c(this.f91948b, ve.a.d(this.f91947a), this.f91949c);
        }

        @Override // ie.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f91948b, ve.a.d(this.f91947a));
        }
    }

    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f91950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ce.b f91951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f91952c;

        b(InputStream inputStream, List<ImageHeaderParser> list, ce.b bVar) {
            this.f91951b = (ce.b) ve.k.d(bVar);
            this.f91952c = (List) ve.k.d(list);
            this.f91950a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // ie.u
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f91950a.a(), null, options);
        }

        @Override // ie.u
        public void b() {
            this.f91950a.c();
        }

        @Override // ie.u
        public int c() {
            return com.bumptech.glide.load.a.b(this.f91952c, this.f91950a.a(), this.f91951b);
        }

        @Override // ie.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f91952c, this.f91950a.a(), this.f91951b);
        }
    }

    public static final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ce.b f91953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f91954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f91955c;

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ce.b bVar) {
            this.f91953a = (ce.b) ve.k.d(bVar);
            this.f91954b = (List) ve.k.d(list);
            this.f91955c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // ie.u
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f91955c.a().getFileDescriptor(), null, options);
        }

        @Override // ie.u
        public void b() {
        }

        @Override // ie.u
        public int c() {
            return com.bumptech.glide.load.a.a(this.f91954b, this.f91955c, this.f91953a);
        }

        @Override // ie.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f91954b, this.f91955c, this.f91953a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
