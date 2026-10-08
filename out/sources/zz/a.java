package zz;

import android.graphics.Bitmap;
import fr.t;
import java.io.File;
import p071kotlin.Metadata;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lzz/a;", "", "Lwx/e;", "e", "()Lwx/e;", "metadata", "Ljava/io/File;", "a", "()Ljava/io/File;", "file", "", "b", "()Ljava/lang/String;", "mimeType", "Lzz/a$a;", "Lzz/a$b;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: zz.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Lzz/a$a;", "Lzz/a;", "Lwx/e;", "metadata", "Ljava/io/File;", "file", "", "mimeType", "Landroid/graphics/Bitmap;", "thumbnail", "<init>", "(Lwx/e;Ljava/io/File;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/e;", "e", "()Lwx/e;", "b", "Ljava/io/File;", "()Ljava/io/File;", "c", "Ljava/lang/String;", "d", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Image implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerMetadata metadata;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final File file;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mimeType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap thumbnail;

        public Image(FilePickerMetadata filePickerMetadata, File file, String str, Bitmap bitmap) {
            this.metadata = filePickerMetadata;
            this.file = file;
            this.mimeType = str;
            this.thumbnail = bitmap;
        }

        @Override // zz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public File getFile() {
            return this.file;
        }

        @Override // zz.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getMimeType() {
            return this.mimeType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bitmap getThumbnail() {
            return this.thumbnail;
        }

        @Override // zz.a
        /* JADX INFO: renamed from: e, reason: from getter */
        public FilePickerMetadata getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return t.c(this.metadata, image.metadata) && t.c(this.file, image.file) && t.c(this.mimeType, image.mimeType) && t.c(this.thumbnail, image.thumbnail);
        }

        public int hashCode() {
            int iHashCode = ((this.metadata.hashCode() * 31) + this.file.hashCode()) * 31;
            String str = this.mimeType;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.thumbnail.hashCode();
        }

        public String toString() {
            return "Image(metadata=" + this.metadata + ", file=" + this.file + ", mimeType=" + this.mimeType + ", thumbnail=" + this.thumbnail + ')';
        }
    }

    /* JADX INFO: renamed from: zz.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001d"}, d2 = {"Lzz/a$b;", "Lzz/a;", "Lwx/e;", "metadata", "Ljava/io/File;", "file", "", "mimeType", "<init>", "(Lwx/e;Ljava/io/File;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/e;", "e", "()Lwx/e;", "b", "Ljava/io/File;", "()Ljava/io/File;", "c", "Ljava/lang/String;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Regular implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerMetadata metadata;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final File file;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mimeType;

        public Regular(FilePickerMetadata filePickerMetadata, File file, String str) {
            this.metadata = filePickerMetadata;
            this.file = file;
            this.mimeType = str;
        }

        @Override // zz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public File getFile() {
            return this.file;
        }

        @Override // zz.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getMimeType() {
            return this.mimeType;
        }

        @Override // zz.a
        /* JADX INFO: renamed from: e, reason: from getter */
        public FilePickerMetadata getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Regular)) {
                return false;
            }
            Regular regular = (Regular) other;
            return t.c(this.metadata, regular.metadata) && t.c(this.file, regular.file) && t.c(this.mimeType, regular.mimeType);
        }

        public int hashCode() {
            int iHashCode = ((this.metadata.hashCode() * 31) + this.file.hashCode()) * 31;
            String str = this.mimeType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Regular(metadata=" + this.metadata + ", file=" + this.file + ", mimeType=" + this.mimeType + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    File getFile();

    /* JADX INFO: renamed from: b */
    String getMimeType();

    /* JADX INFO: renamed from: e */
    FilePickerMetadata getMetadata();
}
