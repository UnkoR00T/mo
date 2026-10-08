package n;

import CON.j0;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import fr.q0;
import h.o1;
import h.y0;
import i.x;
import io.sentry.android.core.c2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010)¨\u0006/"}, d2 = {"Ln/b;", "Ln/p;", "Landroid/media/ImageWriter$OnImageReleasedListener;", "Landroid/media/ImageWriter;", "imageWriter", "Lh/y0;", "inputStreamId", "<init>", "(Landroid/media/ImageWriter;I)V", "Ln/o;", "image", "", "G3", "(Ln/o;)Z", "writer", "Loq/i0;", "onImageReleased", "(Landroid/media/ImageWriter;)V", "close", "()V", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "a", "Landroid/media/ImageWriter;", "b", "I", "Liu/e;", "Ln/p$a;", "c", "Liu/e;", "onImageReleasedListener", "", "d", "getMaxImages", "()I", "maxImages", "e", "getFormat", "format", "f", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements p, ImageWriter.OnImageReleasedListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageWriter imageWriter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int inputStreamId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iu.e<p.a> onImageReleasedListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxImages;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int format;

    /* JADX INFO: renamed from: n.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ln/b$a;", "", "<init>", "()V", "Landroid/view/Surface;", "surface", "Lh/y0;", "inputStreamId", "", "maxImages", "Lh/o1;", "format", "Landroid/os/Handler;", "handler", "Ln/p;", "a", "(Landroid/view/Surface;IILh/o1;Landroid/os/Handler;)Ln/p;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final p a(Surface surface, int inputStreamId, int maxImages, o1 format, Handler handler) {
            ImageWriter imageWriterNewInstance;
            if (maxImages <= 0) {
                throw new IllegalArgumentException(("Max images (" + maxImages + ") must be > 0").toString());
            }
            if (maxImages > 54) {
                throw new IllegalArgumentException("Max images for ImageWriters is restricted to 54 to prevent overloading downstream consumer components.");
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 < 29 || format == null) {
                if (format != null && k.k.f107055a.d()) {
                    c2.g("CXCP", "Ignoring format (" + ((Object) o1.i(format.getValue())) + ") for " + ((Object) y0.b(inputStreamId)) + ". Android " + i15 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
                }
                imageWriterNewInstance = ImageWriter.newInstance(surface, maxImages);
            } else {
                imageWriterNewInstance = x.a(surface, maxImages, format.getValue());
            }
            b bVar = new b(imageWriterNewInstance, inputStreamId, null);
            imageWriterNewInstance.setOnImageReleasedListener(bVar, handler);
            return bVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(ImageWriter imageWriter, int i15, fr.k kVar) {
        this(imageWriter, i15);
    }

    @Override // n.p
    public boolean G3(o image) throws Exception {
        try {
            Image image2 = (Image) image.c0(q0.c(Image.class));
            if (image2 != null) {
                this.imageWriter.queueInputImage(image2);
                return true;
            }
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "Failed to unwrap image wrapper " + image);
            }
            return false;
        } catch (Throwable th4) {
            if (k.k.f107055a.d()) {
                c2.g("CXCP", "Failed to queue image to " + this + " due to error " + th4.getMessage() + ". Ignoring failure and closing " + image);
            }
            j0.a(image);
            return false;
        }
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, q0.c(ImageWriter.class))) {
            return (T) this.imageWriter;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.imageWriter.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public void onImageReleased(ImageWriter writer) {
        p.a aVarC = this.onImageReleasedListener.c();
        if (aVarC != null) {
            aVarC.a(this.inputStreamId);
        }
    }

    public String toString() {
        return "ImageWriter-" + o1.g(o1.d(this.imageWriter.getFormat())) + '-' + ((Object) y0.b(this.inputStreamId));
    }

    private b(ImageWriter imageWriter, int i15) {
        this.imageWriter = imageWriter;
        this.inputStreamId = i15;
        this.onImageReleasedListener = iu.b.g(null);
        this.maxImages = imageWriter.getMaxImages();
        this.format = imageWriter.getFormat();
    }
}
