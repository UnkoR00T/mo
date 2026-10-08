package n;

import android.media.Image;
import android.os.Build;
import fr.q0;
import h.o1;
import i.w;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Ln/a;", "Ln/o;", "Landroid/media/Image;", "image", "<init>", "(Landroid/media/Image;)V", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Loq/i0;", "close", "()V", "a", "Landroid/media/Image;", "b", "Ljava/lang/Object;", "lock", "", "c", "I", "getFormat", "()I", "format", "d", "l", "width", "e", "getHeight", "height", "", "f", "J", "d1", "()J", "timestamp", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Image image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int format;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    public a(Image image) {
        this.image = image;
        this.format = image.getFormat();
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.timestamp = image.getTimestamp();
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, q0.c(Image.class))) {
            return (T) this.image;
        }
        if (Build.VERSION.SDK_INT > 27) {
            return (T) w.m(this.image, type);
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.image.close();
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    public long getTimestamp() {
        return this.timestamp;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "Image-" + o1.g(o1.d(getFormat())) + "-w" + getWidth() + 'h' + getHeight() + "-t" + getTimestamp();
    }
}
