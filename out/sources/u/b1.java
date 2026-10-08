package u;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import java.util.Objects;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements androidx.camera.core.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f193341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f193342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f193343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f193344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.camera.core.o.a[] f193345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o.w0 f193346f;

    class a implements androidx.camera.core.o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f193347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f193348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f193349c;

        a(int i15, int i16, ByteBuffer byteBuffer) {
            this.f193347a = i15;
            this.f193348b = i16;
            this.f193349c = byteBuffer;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer v() {
            return this.f193349c;
        }

        @Override // androidx.camera.core.o.a
        public int w() {
            return this.f193347a;
        }

        @Override // androidx.camera.core.o.a
        public int x() {
            return this.f193348b;
        }
    }

    class b implements o.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f193350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f193351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f193352c;

        b(long j15, int i15, Matrix matrix) {
            this.f193350a = j15;
            this.f193351b = i15;
            this.f193352c = matrix;
        }

        @Override // o.w0
        public void a(y.h.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // o.w0
        public t3 d() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // o.w0
        public int e() {
            return this.f193351b;
        }

        @Override // o.w0
        public long getTimestamp() {
            return this.f193350a;
        }
    }

    public b1(g0.b0<Bitmap> b0Var) {
        this(b0Var.c(), b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a().getTimestamp());
    }

    private void b() {
        synchronized (this.f193341a) {
            i6.i.j(this.f193345e != null, "The image is closed.");
        }
    }

    private static o.w0 h(long j15, int i15, Matrix matrix) {
        return new b(j15, i15, matrix);
    }

    private static androidx.camera.core.o.a m(ByteBuffer byteBuffer, int i15, int i16) {
        return new a(i15, i16, byteBuffer);
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f193341a) {
            b();
            this.f193345e = null;
        }
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        synchronized (this.f193341a) {
            b();
        }
        return 1;
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        int i15;
        synchronized (this.f193341a) {
            b();
            i15 = this.f193343c;
        }
        return i15;
    }

    @Override // androidx.camera.core.o
    public int l() {
        int i15;
        synchronized (this.f193341a) {
            b();
            i15 = this.f193342b;
        }
        return i15;
    }

    @Override // androidx.camera.core.o
    public Image m0() {
        synchronized (this.f193341a) {
            b();
        }
        return null;
    }

    @Override // androidx.camera.core.o
    public androidx.camera.core.o.a[] o2() {
        androidx.camera.core.o.a[] aVarArr;
        synchronized (this.f193341a) {
            b();
            androidx.camera.core.o.a[] aVarArr2 = this.f193345e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.o
    public o.w0 v3() {
        o.w0 w0Var;
        synchronized (this.f193341a) {
            b();
            w0Var = this.f193346f;
        }
        return w0Var;
    }

    @Override // androidx.camera.core.o
    public void y1(Rect rect) {
        synchronized (this.f193341a) {
            try {
                b();
                if (rect != null) {
                    this.f193344d.set(rect);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public b1(Bitmap bitmap, Rect rect, int i15, Matrix matrix, long j15) {
        this(f0.b.f(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i15, matrix, j15);
    }

    public b1(ByteBuffer byteBuffer, int i15, int i16, int i17, Rect rect, int i18, Matrix matrix, long j15) {
        this.f193341a = new Object();
        this.f193342b = i16;
        this.f193343c = i17;
        this.f193344d = rect;
        this.f193346f = h(j15, i18, matrix);
        byteBuffer.rewind();
        this.f193345e = new androidx.camera.core.o.a[]{m(byteBuffer, i16 * i15, i15)};
    }
}
