package zd2;

import android.graphics.Bitmap;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zd2.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lzd2/e;", "", "Lo04/c;", "thumbnail", "Landroid/graphics/Bitmap;", "bitmap", "", "name", "<init>", "(Lo04/c;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo04/c;", "c", "()Lo04/c;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "Ljava/lang/String;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThumbnailsWihName {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final o04.c thumbnail;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap bitmap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public ThumbnailsWihName(o04.c cVar, Bitmap bitmap, String str) {
        this.thumbnail = cVar;
        this.bitmap = bitmap;
        this.name = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o04.c getThumbnail() {
        return this.thumbnail;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbnailsWihName)) {
            return false;
        }
        ThumbnailsWihName thumbnailsWihName = (ThumbnailsWihName) other;
        return t.c(this.thumbnail, thumbnailsWihName.thumbnail) && t.c(this.bitmap, thumbnailsWihName.bitmap) && t.c(this.name, thumbnailsWihName.name);
    }

    public int hashCode() {
        int iHashCode = this.thumbnail.hashCode() * 31;
        Bitmap bitmap = this.bitmap;
        return ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "ThumbnailsWihName(thumbnail=" + this.thumbnail + ", bitmap=" + this.bitmap + ", name=" + this.name + ')';
    }
}
