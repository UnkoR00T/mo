package o40;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import er.p;
import fr.k;
import fr.t;
import mx.Label;
import n3.y2;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lo40/a;", "", "Lmx/a;", "getTitle", "()Lmx/a;", "title", "a", "message", "Lj70/a;", "b", "()Lj70/a;", "accessibilityReadMode", "Lo40/a$a;", "Lo40/a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: o40.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f#Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b1\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b'\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b.\u0010\"¨\u00065"}, d2 = {"Lo40/a$b;", "Lo40/a;", "Lmx/a;", "title", "message", "Lj70/a;", "accessibilityReadMode", "Lo40/a$b$b;", "resource", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "backgroundColorProvider", "Ld40/i;", "backgroundSize", "iconSize", "Lo40/a$b$a;", "backgroundShape", "contentDescription", "<init>", "(Lmx/a;Lmx/a;Lj70/a;Lo40/a$b$b;Ler/p;Ld40/i;Ld40/i;Lo40/a$b$a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "getTitle", "()Lmx/a;", "b", "c", "Lj70/a;", "()Lj70/a;", "d", "Lo40/a$b$b;", "h", "()Lo40/a$b$b;", "e", "Ler/p;", "()Ler/p;", "f", "Ld40/i;", "()Ld40/i;", "g", "Lo40/a$b$a;", "()Lo40/a$b$a;", "i", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f142240j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC3511b resource;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<r, Integer, Color> backgroundColorProvider;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final d40.i backgroundSize;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final d40.i iconSize;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC3508a backgroundShape;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: o40.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lo40/a$b$a;", "", "a", "c", "b", "Lo40/a$b$a$a;", "Lo40/a$b$a$b;", "Lo40/a$b$a$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC3508a {

            /* JADX INFO: renamed from: o40.a$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo40/a$b$a$a;", "Lo40/a$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C3509a implements InterfaceC3508a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C3509a f142250a = new C3509a();

                private C3509a() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C3509a);
                }

                public int hashCode() {
                    return -1399333883;
                }

                public String toString() {
                    return "Rounded";
                }
            }

            /* JADX INFO: renamed from: o40.a$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lo40/a$b$a$b;", "Lo40/a$b$a;", "Lkotlin/Function0;", "Ln3/y2;", "a", "Ler/p;", "()Ler/p;", "shape", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class C3510b implements InterfaceC3508a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final p<r, Integer, y2> shape;

                public final p<r, Integer, y2> a() {
                    return this.shape;
                }
            }

            /* JADX INFO: renamed from: o40.a$b$a$c */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo40/a$b$a$c;", "Lo40/a$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class c implements InterfaceC3508a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f142252a = new c();

                private c() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                public int hashCode() {
                    return 955155653;
                }

                public String toString() {
                    return com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37050m;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Image(Label label, Label label2, j70.a aVar, InterfaceC3511b interfaceC3511b, p<? super r, ? super Integer, Color> pVar, d40.i iVar, d40.i iVar2, InterfaceC3508a interfaceC3508a, Label label3) {
            this.title = label;
            this.message = label2;
            this.accessibilityReadMode = aVar;
            this.resource = interfaceC3511b;
            this.backgroundColorProvider = pVar;
            this.backgroundSize = iVar;
            this.iconSize = iVar2;
            this.backgroundShape = interfaceC3508a;
            this.contentDescription = label3;
        }

        @Override // o40.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getMessage() {
            return this.message;
        }

        @Override // o40.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public j70.a getAccessibilityReadMode() {
            return this.accessibilityReadMode;
        }

        public final p<r, Integer, Color> c() {
            return this.backgroundColorProvider;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC3508a getBackgroundShape() {
            return this.backgroundShape;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final d40.i getBackgroundSize() {
            return this.backgroundSize;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return t.c(this.title, image.title) && t.c(this.message, image.message) && this.accessibilityReadMode == image.accessibilityReadMode && t.c(this.resource, image.resource) && t.c(this.backgroundColorProvider, image.backgroundColorProvider) && t.c(this.backgroundSize, image.backgroundSize) && t.c(this.iconSize, image.iconSize) && t.c(this.backgroundShape, image.backgroundShape) && t.c(this.contentDescription, image.contentDescription);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d40.i getIconSize() {
            return this.iconSize;
        }

        @Override // o40.a
        public Label getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC3511b getResource() {
            return this.resource;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Label label = this.message;
            int iHashCode2 = (((((((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.accessibilityReadMode.hashCode()) * 31) + this.resource.hashCode()) * 31) + this.backgroundColorProvider.hashCode()) * 31) + this.backgroundSize.hashCode()) * 31) + this.iconSize.hashCode()) * 31) + this.backgroundShape.hashCode()) * 31;
            Label label2 = this.contentDescription;
            return iHashCode2 + (label2 != null ? label2.hashCode() : 0);
        }

        public String toString() {
            return "Image(title=" + this.title + ", message=" + this.message + ", accessibilityReadMode=" + this.accessibilityReadMode + ", resource=" + this.resource + ", backgroundColorProvider=" + this.backgroundColorProvider + ", backgroundSize=" + this.backgroundSize + ", iconSize=" + this.iconSize + ", backgroundShape=" + this.backgroundShape + ", contentDescription=" + this.contentDescription + ')';
        }

        /* JADX INFO: renamed from: o40.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lo40/a$b$b;", "", "b", "a", "c", "Lo40/a$b$b$a;", "Lo40/a$b$b$b;", "Lo40/a$b$b$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC3511b {

            /* JADX INFO: renamed from: o40.a$b$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo40/a$b$b$a;", "Lo40/a$b$b;", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Bitmap;", "a", "()Landroid/graphics/Bitmap;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C3512a implements InterfaceC3511b {
                public final Bitmap a() {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: o40.a$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo40/a$b$b$b;", "Lo40/a$b$b;", "", "resId", "I", "a", "()I", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C3513b implements InterfaceC3511b {
                public final int a() {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: o40.a$b$b$c, reason: from toString */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lo40/a$b$b$c;", "Lo40/a$b$b;", "", "url", "", "placeHolder", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Url implements InterfaceC3511b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String url;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Integer placeHolder;

                public Url(String str, Integer num) {
                    this.url = str;
                    this.placeHolder = num;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Integer getPlaceHolder() {
                    return this.placeHolder;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
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
                    return t.c(this.url, url.url) && t.c(this.placeHolder, url.placeHolder);
                }

                public int hashCode() {
                    int iHashCode = this.url.hashCode() * 31;
                    Integer num = this.placeHolder;
                    return iHashCode + (num == null ? 0 : num.hashCode());
                }

                public String toString() {
                    return "Url(url=" + this.url + ", placeHolder=" + this.placeHolder + ')';
                }

                public /* synthetic */ Url(String str, Integer num, int i15, k kVar) {
                    this(str, (i15 & 2) != 0 ? null : num);
                }
            }
        }

        public /* synthetic */ Image(Label label, Label label2, j70.a aVar, InterfaceC3511b interfaceC3511b, p pVar, d40.i iVar, d40.i iVar2, InterfaceC3508a interfaceC3508a, Label label3, int i15, k kVar) {
            this(label, label2, (i15 & 4) != 0 ? j70.a.LOWER_CASE : aVar, interfaceC3511b, pVar, (i15 & 32) != 0 ? d40.i.l.f39715e : iVar, (i15 & 64) != 0 ? d40.i.h.f39711e : iVar2, (i15 & 128) != 0 ? InterfaceC3508a.C3509a.f142250a : interfaceC3508a, (i15 & 256) != 0 ? null : label3);
        }
    }

    /* JADX INFO: renamed from: a */
    Label getMessage();

    /* JADX INFO: renamed from: b */
    j70.a getAccessibilityReadMode();

    Label getTitle();

    /* JADX INFO: renamed from: o40.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\\\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001b\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001e\u0010*R\u001a\u0010/\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b'\u0010.¨\u00060"}, d2 = {"Lo40/a$a;", "Lo40/a;", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "iconBackgroundColorProvider", "Lmx/a;", "title", "message", "Lj70/a;", "accessibilityReadMode", "<init>", "(ILer/p;Ler/p;Lmx/a;Lmx/a;Lj70/a;)V", "c", "(ILer/p;Ler/p;Lmx/a;Lmx/a;Lj70/a;)Lo40/a$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIconResId", "b", "Ler/p;", "getIconColorProvider", "()Ler/p;", "getIconBackgroundColorProvider", "d", "Lmx/a;", "getTitle", "()Lmx/a;", "e", "f", "Lj70/a;", "()Lj70/a;", "Ld40/b;", "g", "Ld40/b;", "()Ld40/b;", "iconData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Icon implements a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f142232h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<r, Integer, Color> iconColorProvider;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<r, Integer, Color> iconBackgroundColorProvider;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label message;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final d40.b iconData;

        /* JADX WARN: Multi-variable type inference failed */
        public Icon(int i15, p<? super r, ? super Integer, Color> pVar, p<? super r, ? super Integer, Color> pVar2, Label label, Label label2, j70.a aVar) {
            this.iconResId = i15;
            this.iconColorProvider = pVar;
            this.iconBackgroundColorProvider = pVar2;
            this.title = label;
            this.message = label2;
            this.accessibilityReadMode = aVar;
            String str = null;
            this.iconData = new d40.b.a(str, i15, d40.i.h.f39711e, pVar, d40.i.l.f39715e, pVar2, d40.a.C0863a.f39673a, null, null, 257, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Icon d(Icon icon, int i15, p pVar, p pVar2, Label label, Label label2, j70.a aVar, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i15 = icon.iconResId;
            }
            if ((i16 & 2) != 0) {
                pVar = icon.iconColorProvider;
            }
            if ((i16 & 4) != 0) {
                pVar2 = icon.iconBackgroundColorProvider;
            }
            if ((i16 & 8) != 0) {
                label = icon.title;
            }
            if ((i16 & 16) != 0) {
                label2 = icon.message;
            }
            if ((i16 & 32) != 0) {
                aVar = icon.accessibilityReadMode;
            }
            Label label3 = label2;
            j70.a aVar2 = aVar;
            return icon.c(i15, pVar, pVar2, label, label3, aVar2);
        }

        @Override // o40.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getMessage() {
            return this.message;
        }

        @Override // o40.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public j70.a getAccessibilityReadMode() {
            return this.accessibilityReadMode;
        }

        public final Icon c(int iconResId, p<? super r, ? super Integer, Color> iconColorProvider, p<? super r, ? super Integer, Color> iconBackgroundColorProvider, Label title, Label message, j70.a accessibilityReadMode) {
            return new Icon(iconResId, iconColorProvider, iconBackgroundColorProvider, title, message, accessibilityReadMode);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final d40.b getIconData() {
            return this.iconData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return this.iconResId == icon.iconResId && t.c(this.iconColorProvider, icon.iconColorProvider) && t.c(this.iconBackgroundColorProvider, icon.iconBackgroundColorProvider) && t.c(this.title, icon.title) && t.c(this.message, icon.message) && this.accessibilityReadMode == icon.accessibilityReadMode;
        }

        @Override // o40.a
        public Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.iconResId) * 31;
            p<r, Integer, Color> pVar = this.iconColorProvider;
            int iHashCode2 = (((((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + this.iconBackgroundColorProvider.hashCode()) * 31) + this.title.hashCode()) * 31;
            Label label = this.message;
            return ((iHashCode2 + (label != null ? label.hashCode() : 0)) * 31) + this.accessibilityReadMode.hashCode();
        }

        public String toString() {
            return "Icon(iconResId=" + this.iconResId + ", iconColorProvider=" + this.iconColorProvider + ", iconBackgroundColorProvider=" + this.iconBackgroundColorProvider + ", title=" + this.title + ", message=" + this.message + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
        }

        public /* synthetic */ Icon(int i15, p pVar, p pVar2, Label label, Label label2, j70.a aVar, int i16, k kVar) {
            this(i15, (i16 & 2) != 0 ? null : pVar, pVar2, label, label2, (i16 & 32) != 0 ? j70.a.LOWER_CASE : aVar);
        }
    }
}
