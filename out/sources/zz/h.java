package zz;

import android.graphics.Bitmap;
import fr.t;
import p071kotlin.Metadata;
import wx.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lzz/h;", "", "Lwx/i;", "a", "()Lwx/i;", "file", "b", "Lzz/h$a;", "Lzz/h$b;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: zz.h$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lzz/h$a;", "Lzz/h;", "Lwx/i$a;", "file", "Landroid/graphics/Bitmap;", "thumbnail", "", "originalHeight", "originalWidth", "<init>", "(Lwx/i$a;Landroid/graphics/Bitmap;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "b", "()Lwx/i$a;", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "c", "I", "d", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i.Image file;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap thumbnail;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int originalHeight;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int originalWidth;

        public Image(i.Image image, Bitmap bitmap, int i15, int i16) {
            this.file = image;
            this.thumbnail = bitmap;
            this.originalHeight = i15;
            this.originalWidth = i16;
        }

        @Override // zz.h
        /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
        public i.Image a() {
            return this.file;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getOriginalHeight() {
            return this.originalHeight;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getOriginalWidth() {
            return this.originalWidth;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Bitmap getThumbnail() {
            return this.thumbnail;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return t.c(this.file, image.file) && t.c(this.thumbnail, image.thumbnail) && this.originalHeight == image.originalHeight && this.originalWidth == image.originalWidth;
        }

        public int hashCode() {
            return (((((this.file.hashCode() * 31) + this.thumbnail.hashCode()) * 31) + Integer.hashCode(this.originalHeight)) * 31) + Integer.hashCode(this.originalWidth);
        }

        public String toString() {
            return "Image(file=" + this.file + ", thumbnail=" + this.thumbnail + ", originalHeight=" + this.originalHeight + ", originalWidth=" + this.originalWidth + ')';
        }
    }

    /* JADX INFO: renamed from: zz.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzz/h$b;", "Lzz/h;", "Lwx/i$b;", "file", "<init>", "(Lwx/i$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$b;", "b", "()Lwx/i$b;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i.Regular file;

        public Regular(i.Regular regular) {
            this.file = regular;
        }

        @Override // zz.h
        /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
        public i.Regular a() {
            return this.file;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Regular) && t.c(this.file, ((Regular) other).file);
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "Regular(file=" + this.file + ')';
        }
    }

    i a();
}
