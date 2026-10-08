package sb0;

import android.graphics.Bitmap;
import fr.t;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: sb0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lsb0/a;", "", "", "", "Landroid/graphics/Bitmap;", "barcodeBitmaps", "qrCodeBitmaps", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BitmapsByFieldReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Bitmap> barcodeBitmaps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Bitmap> qrCodeBitmaps;

    public BitmapsByFieldReference(Map<String, Bitmap> map, Map<String, Bitmap> map2) {
        this.barcodeBitmaps = map;
        this.qrCodeBitmaps = map2;
    }

    public final Map<String, Bitmap> a() {
        return this.barcodeBitmaps;
    }

    public final Map<String, Bitmap> b() {
        return this.qrCodeBitmaps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapsByFieldReference)) {
            return false;
        }
        BitmapsByFieldReference bitmapsByFieldReference = (BitmapsByFieldReference) other;
        return t.c(this.barcodeBitmaps, bitmapsByFieldReference.barcodeBitmaps) && t.c(this.qrCodeBitmaps, bitmapsByFieldReference.qrCodeBitmaps);
    }

    public int hashCode() {
        return (this.barcodeBitmaps.hashCode() * 31) + this.qrCodeBitmaps.hashCode();
    }

    public String toString() {
        return "BitmapsByFieldReference(barcodeBitmaps=" + this.barcodeBitmaps + ", qrCodeBitmaps=" + this.qrCodeBitmaps + ')';
    }
}
