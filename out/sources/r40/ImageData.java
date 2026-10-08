package r40;

import android.graphics.Bitmap;
import d40.i;
import er.p;
import fr.t;
import mx.Label;
import n3.y2;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: renamed from: r40.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lr40/a;", "", "Landroid/graphics/Bitmap;", "image", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ld40/i;", "size", "Ln3/y2;", "shapeProvider", "Lmx/a;", "contentDescription", "<init>", "(Landroid/graphics/Bitmap;Ler/a;Ld40/i;Ler/p;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ler/a;", "getOnClick", "()Ler/a;", "c", "Ld40/i;", "getSize", "()Ld40/i;", "d", "Ler/p;", "getShapeProvider", "()Ler/p;", "e", "Lmx/a;", "getContentDescription", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImageData {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f171563f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<r, Integer, y2> shapeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageData(Bitmap bitmap, er.a<i0> aVar, i iVar, p<? super r, ? super Integer, ? extends y2> pVar, Label label) {
        this.image = bitmap;
        this.onClick = aVar;
        this.size = iVar;
        this.shapeProvider = pVar;
        this.contentDescription = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageData)) {
            return false;
        }
        ImageData imageData = (ImageData) other;
        return t.c(this.image, imageData.image) && t.c(this.onClick, imageData.onClick) && t.c(this.size, imageData.size) && t.c(this.shapeProvider, imageData.shapeProvider) && t.c(this.contentDescription, imageData.contentDescription);
    }

    public int hashCode() {
        return (((((((this.image.hashCode() * 31) + this.onClick.hashCode()) * 31) + this.size.hashCode()) * 31) + this.shapeProvider.hashCode()) * 31) + this.contentDescription.hashCode();
    }

    public String toString() {
        return "ImageData(image=" + this.image + ", onClick=" + this.onClick + ", size=" + this.size + ", shapeProvider=" + this.shapeProvider + ", contentDescription=" + this.contentDescription + ')';
    }
}
