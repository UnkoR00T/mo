package b30;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import mx.Label;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: renamed from: b30.l, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb30/l;", "", "Lb30/l$a;", "content", "Lmx/a;", "contentDescription", "<init>", "(Lb30/l$a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lb30/l$a;", "()Lb30/l$a;", "b", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Resource {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    public Resource(a aVar, Label label) {
        this.content = aVar;
        this.contentDescription = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return t.c(this.content, resource.content) && t.c(this.contentDescription, resource.contentDescription);
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        Label label = this.contentDescription;
        return iHashCode + (label == null ? 0 : label.hashCode());
    }

    public String toString() {
        return "Resource(content=" + this.content + ", contentDescription=" + this.contentDescription + ')';
    }

    /* JADX INFO: renamed from: b30.l$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lb30/l$a;", "", "b", "a", "Lb30/l$a$a;", "Lb30/l$a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: b30.l$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lb30/l$a$a;", "Lb30/l$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "Ld40/i;", "b", "Ld40/i;", "()Ld40/i;", "iconSize", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BitmapResource implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap bitmap;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final d40.i iconSize;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Bitmap getBitmap() {
                return this.bitmap;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final d40.i getIconSize() {
                return this.iconSize;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BitmapResource)) {
                    return false;
                }
                BitmapResource bitmapResource = (BitmapResource) other;
                return t.c(this.bitmap, bitmapResource.bitmap) && t.c(this.iconSize, bitmapResource.iconSize);
            }

            public int hashCode() {
                int iHashCode = this.bitmap.hashCode() * 31;
                d40.i iVar = this.iconSize;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "BitmapResource(bitmap=" + this.bitmap + ", iconSize=" + this.iconSize + ')';
            }
        }

        /* JADX INFO: renamed from: b30.l$a$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb30/l$a$b;", "Lb30/l$a;", "", "resId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "tintProvider", "<init>", "(ILer/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DrawableResource implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int resId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final p<r, Integer, Color> tintProvider;

            /* JADX WARN: Multi-variable type inference failed */
            public DrawableResource(int i15, p<? super r, ? super Integer, Color> pVar) {
                this.resId = i15;
                this.tintProvider = pVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getResId() {
                return this.resId;
            }

            public final p<r, Integer, Color> b() {
                return this.tintProvider;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DrawableResource)) {
                    return false;
                }
                DrawableResource drawableResource = (DrawableResource) other;
                return this.resId == drawableResource.resId && t.c(this.tintProvider, drawableResource.tintProvider);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.resId) * 31;
                p<r, Integer, Color> pVar = this.tintProvider;
                return iHashCode + (pVar == null ? 0 : pVar.hashCode());
            }

            public String toString() {
                return "DrawableResource(resId=" + this.resId + ", tintProvider=" + this.tintProvider + ')';
            }

            public /* synthetic */ DrawableResource(int i15, p pVar, int i16, fr.k kVar) {
                this(i15, (i16 & 2) != 0 ? null : pVar);
            }
        }
    }

    public /* synthetic */ Resource(a aVar, Label label, int i15, fr.k kVar) {
        this(aVar, (i15 & 2) != 0 ? null : label);
    }
}
