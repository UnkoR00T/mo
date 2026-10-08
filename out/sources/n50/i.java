package n50;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import mx.Label;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ln50/i;", "", "<init>", "()V", "a", "b", "c", "d", "Ln50/i$a;", "Ln50/i$b;", "Ln50/i$c;", "Ln50/i$d;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i {

    /* JADX INFO: renamed from: n50.i$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Ln50/i$c;", "Ln50/i;", "Ln50/i$c$a;", "content", "Lmx/a;", "contentDescription", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Ln50/i$c$a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/i$c$a;", "()Ln50/i$c$a;", "b", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Resource extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a content;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClick;

        public Resource(a aVar, Label label, er.a<oq.i0> aVar2) {
            super(null);
            this.content = aVar;
            this.contentDescription = label;
            this.onClick = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        public final er.a<oq.i0> c() {
            return this.onClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resource)) {
                return false;
            }
            Resource resource = (Resource) other;
            return fr.t.c(this.content, resource.content) && fr.t.c(this.contentDescription, resource.contentDescription) && fr.t.c(this.onClick, resource.onClick);
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            Label label = this.contentDescription;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            er.a<oq.i0> aVar = this.onClick;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "Resource(content=" + this.content + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
        }

        /* JADX INFO: renamed from: n50.i$c$a */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ln50/i$c$a;", "", "b", "a", "c", "Ln50/i$c$a$a;", "Ln50/i$c$a$b;", "Ln50/i$c$a$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface a {

            /* JADX INFO: renamed from: n50.i$c$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ln50/i$c$a$a;", "Ln50/i$c$a;", "Landroid/graphics/Bitmap;", "bitmap", "Ld40/i;", "iconSize", "<init>", "(Landroid/graphics/Bitmap;Ld40/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ld40/i;", "()Ld40/i;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class BitmapResource implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Bitmap bitmap;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final d40.i iconSize;

                public BitmapResource(Bitmap bitmap, d40.i iVar) {
                    this.bitmap = bitmap;
                    this.iconSize = iVar;
                }

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
                    return fr.t.c(this.bitmap, bitmapResource.bitmap) && fr.t.c(this.iconSize, bitmapResource.iconSize);
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

            /* JADX INFO: renamed from: n50.i$c$a$c, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Ln50/i$c$a$c;", "Ln50/i$c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "url", "Ld40/i;", "b", "Ld40/i;", "()Ld40/i;", "iconSize", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "placeHolder", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Url implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String url;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final d40.i iconSize;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final Integer placeHolder;

                /* JADX INFO: renamed from: a, reason: from getter */
                public final d40.i getIconSize() {
                    return this.iconSize;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Integer getPlaceHolder() {
                    return this.placeHolder;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Url)) {
                        return false;
                    }
                    Url url = (Url) other;
                    return fr.t.c(this.url, url.url) && fr.t.c(this.iconSize, url.iconSize) && fr.t.c(this.placeHolder, url.placeHolder);
                }

                public int hashCode() {
                    int iHashCode = ((this.url.hashCode() * 31) + this.iconSize.hashCode()) * 31;
                    Integer num = this.placeHolder;
                    return iHashCode + (num == null ? 0 : num.hashCode());
                }

                public String toString() {
                    return "Url(url=" + this.url + ", iconSize=" + this.iconSize + ", placeHolder=" + this.placeHolder + ')';
                }
            }

            /* JADX INFO: renamed from: n50.i$c$a$b, reason: from toString */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln50/i$c$a$b;", "Ln50/i$c$a;", "", "resId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "tintProvider", "<init>", "(ILer/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DrawableResource implements a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final int resId;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.p<p076m2.r, Integer, Color> tintProvider;

                /* JADX WARN: Multi-variable type inference failed */
                public DrawableResource(int i15, er.p<? super p076m2.r, ? super Integer, Color> pVar) {
                    this.resId = i15;
                    this.tintProvider = pVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final int getResId() {
                    return this.resId;
                }

                public final er.p<p076m2.r, Integer, Color> b() {
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
                    return this.resId == drawableResource.resId && fr.t.c(this.tintProvider, drawableResource.tintProvider);
                }

                public int hashCode() {
                    int iHashCode = Integer.hashCode(this.resId) * 31;
                    er.p<p076m2.r, Integer, Color> pVar = this.tintProvider;
                    return iHashCode + (pVar == null ? 0 : pVar.hashCode());
                }

                public String toString() {
                    return "DrawableResource(resId=" + this.resId + ", tintProvider=" + this.tintProvider + ')';
                }

                public /* synthetic */ DrawableResource(int i15, er.p pVar, int i16, fr.k kVar) {
                    this(i15, (i16 & 2) != 0 ? null : pVar);
                }
            }
        }

        public /* synthetic */ Resource(a aVar, Label label, er.a aVar2, int i15, fr.k kVar) {
            this(aVar, (i15 & 2) != 0 ? null : label, (i15 & 4) != 0 ? null : aVar2);
        }
    }

    public /* synthetic */ i(fr.k kVar) {
        this();
    }

    private i() {
    }

    /* JADX INFO: renamed from: n50.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Ln50/i$b;", "Ln50/i;", "Landroid/graphics/Bitmap;", "bitmap", "Lmx/a;", "contentDescription", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Landroid/graphics/Bitmap;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClick;

        public Image(Bitmap bitmap, Label label, er.a<oq.i0> aVar) {
            super(null);
            this.bitmap = bitmap;
            this.contentDescription = label;
            this.onClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        public final er.a<oq.i0> c() {
            return this.onClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return fr.t.c(this.bitmap, image.bitmap) && fr.t.c(this.contentDescription, image.contentDescription) && fr.t.c(this.onClick, image.onClick);
        }

        public int hashCode() {
            int iHashCode = this.bitmap.hashCode() * 31;
            Label label = this.contentDescription;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            er.a<oq.i0> aVar = this.onClick;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "Image(bitmap=" + this.bitmap + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
        }

        public /* synthetic */ Image(Bitmap bitmap, Label label, er.a aVar, int i15, fr.k kVar) {
            this(bitmap, (i15 & 2) != 0 ? null : label, (i15 & 4) != 0 ? null : aVar);
        }
    }

    /* JADX INFO: renamed from: n50.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Ln50/i$a;", "Ln50/i;", "", "iconResId", "Lmx/a;", "contentDescription", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColor", "Ld40/i;", "iconSize", "Ld40/j;", "iconState", "<init>", "(ILmx/a;Ler/p;Ld40/i;Ld40/j;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lmx/a;", "()Lmx/a;", "Ler/p;", "()Ler/p;", "d", "Ld40/i;", "()Ld40/i;", "e", "Ld40/j;", "()Ld40/j;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Icon extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Color> iconColor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final d40.i iconSize;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final d40.j iconState;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: n50.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3273a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3273a f132040a = new C3273a();

            C3273a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(339353342);
                if (p076m2.t.k()) {
                    p076m2.t.o(339353342, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.MediaSection.Icon.<init>.<anonymous> (SingleCardData.kt:124)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jB;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Icon(int i15, Label label, er.p<? super p076m2.r, ? super Integer, Color> pVar, d40.i iVar, d40.j jVar) {
            super(null);
            this.iconResId = i15;
            this.contentDescription = label;
            this.iconColor = pVar;
            this.iconSize = iVar;
            this.iconState = jVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        public final er.p<p076m2.r, Integer, Color> b() {
            return this.iconColor;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d40.i getIconSize() {
            return this.iconSize;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final d40.j getIconState() {
            return this.iconState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return this.iconResId == icon.iconResId && fr.t.c(this.contentDescription, icon.contentDescription) && fr.t.c(this.iconColor, icon.iconColor) && fr.t.c(this.iconSize, icon.iconSize) && this.iconState == icon.iconState;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.iconResId) * 31;
            Label label = this.contentDescription;
            return ((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.iconColor.hashCode()) * 31) + this.iconSize.hashCode()) * 31) + this.iconState.hashCode();
        }

        public String toString() {
            return "Icon(iconResId=" + this.iconResId + ", contentDescription=" + this.contentDescription + ", iconColor=" + this.iconColor + ", iconSize=" + this.iconSize + ", iconState=" + this.iconState + ')';
        }

        public /* synthetic */ Icon(int i15, Label label, er.p pVar, d40.i iVar, d40.j jVar, int i16, fr.k kVar) {
            this(i15, (i16 & 2) != 0 ? null : label, (i16 & 4) != 0 ? C3273a.f132040a : pVar, (i16 & 8) != 0 ? d40.i.f.f39709e : iVar, (i16 & 16) != 0 ? d40.j.ENABLED : jVar);
        }
    }

    /* JADX INFO: renamed from: n50.i$d, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010&R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b \u0010)R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&¨\u0006/"}, d2 = {"Ln50/i$d;", "Ln50/i;", "", "iconResId", "Lmx/a;", "contentDescription", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColor", "Ld40/i;", "iconSize", "backgroundColor", "backgroundSize", "Loq/i0;", "onClick", "Ln3/y2;", "radius", "<init>", "(ILmx/a;Ler/p;Ld40/i;Ler/p;Ld40/i;Ler/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "Lmx/a;", "c", "()Lmx/a;", "Ler/p;", "d", "()Ler/p;", "Ld40/i;", "f", "()Ld40/i;", "g", "Ler/a;", "()Ler/a;", "h", "getRadius", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoundedSquareIcon extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Color> iconColor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final d40.i iconSize;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Color> backgroundColor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final d40.i backgroundSize;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, y2> radius;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: n50.i$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f132062a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(-115225956);
                if (p076m2.t.k()) {
                    p076m2.t.o(-115225956, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.MediaSection.RoundedSquareIcon.<init>.<anonymous> (SingleCardData.kt:161)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jB;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: n50.i$d$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f132063a = new b();

            b() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(-447962351);
                if (p076m2.t.k()) {
                    p076m2.t.o(-447962351, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.MediaSection.RoundedSquareIcon.<init>.<anonymous> (SingleCardData.kt:163)");
                }
                long jH = Color.INSTANCE.h();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jH;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RoundedSquareIcon(int i15, Label label, er.p<? super p076m2.r, ? super Integer, Color> pVar, d40.i iVar, er.p<? super p076m2.r, ? super Integer, Color> pVar2, d40.i iVar2, er.a<oq.i0> aVar, er.p<? super p076m2.r, ? super Integer, ? extends y2> pVar3) {
            super(null);
            this.iconResId = i15;
            this.contentDescription = label;
            this.iconColor = pVar;
            this.iconSize = iVar;
            this.backgroundColor = pVar2;
            this.backgroundSize = iVar2;
            this.onClick = aVar;
            this.radius = pVar3;
        }

        public final er.p<p076m2.r, Integer, Color> a() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d40.i getBackgroundSize() {
            return this.backgroundSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        public final er.p<p076m2.r, Integer, Color> d() {
            return this.iconColor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundedSquareIcon)) {
                return false;
            }
            RoundedSquareIcon roundedSquareIcon = (RoundedSquareIcon) other;
            return this.iconResId == roundedSquareIcon.iconResId && fr.t.c(this.contentDescription, roundedSquareIcon.contentDescription) && fr.t.c(this.iconColor, roundedSquareIcon.iconColor) && fr.t.c(this.iconSize, roundedSquareIcon.iconSize) && fr.t.c(this.backgroundColor, roundedSquareIcon.backgroundColor) && fr.t.c(this.backgroundSize, roundedSquareIcon.backgroundSize) && fr.t.c(this.onClick, roundedSquareIcon.onClick) && fr.t.c(this.radius, roundedSquareIcon.radius);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d40.i getIconSize() {
            return this.iconSize;
        }

        public final er.a<oq.i0> g() {
            return this.onClick;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.iconResId) * 31;
            Label label = this.contentDescription;
            int iHashCode2 = (((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.iconColor.hashCode()) * 31) + this.iconSize.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.backgroundSize.hashCode()) * 31;
            er.a<oq.i0> aVar = this.onClick;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            er.p<p076m2.r, Integer, y2> pVar = this.radius;
            return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
        }

        public String toString() {
            return "RoundedSquareIcon(iconResId=" + this.iconResId + ", contentDescription=" + this.contentDescription + ", iconColor=" + this.iconColor + ", iconSize=" + this.iconSize + ", backgroundColor=" + this.backgroundColor + ", backgroundSize=" + this.backgroundSize + ", onClick=" + this.onClick + ", radius=" + this.radius + ')';
        }

        public /* synthetic */ RoundedSquareIcon(int i15, Label label, er.p pVar, d40.i iVar, er.p pVar2, d40.i iVar2, er.a aVar, er.p pVar3, int i16, fr.k kVar) {
            this(i15, (i16 & 2) != 0 ? null : label, (i16 & 4) != 0 ? a.f132062a : pVar, (i16 & 8) != 0 ? d40.i.f.f39709e : iVar, (i16 & 16) != 0 ? b.f132063a : pVar2, (i16 & 32) != 0 ? d40.i.C0865i.f39712e : iVar2, (i16 & 64) != 0 ? null : aVar, (i16 & 128) != 0 ? null : pVar3);
        }
    }
}
