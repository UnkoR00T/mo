package zd2;

import fr.t;
import o04.UploadedFile;
import p071kotlin.Metadata;
import wx.i;

/* JADX INFO: renamed from: zd2.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzd2/d;", "", "Lwx/i$a;", "file", "Lo04/f;", "uploadedFile", "<init>", "(Lwx/i$a;Lo04/f;)V", "a", "(Lwx/i$a;Lo04/f;)Lzd2/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwx/i$a;", "c", "()Lwx/i$a;", "b", "Lo04/f;", "d", "()Lo04/f;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Photo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final i.Image file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UploadedFile uploadedFile;

    public Photo(i.Image image, UploadedFile fVar) {
        this.file = image;
        this.uploadedFile = fVar;
    }

    public static /* synthetic */ Photo b(Photo photo, i.Image image, UploadedFile fVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            image = photo.file;
        }
        if ((i15 & 2) != 0) {
            fVar = photo.uploadedFile;
        }
        return photo.a(image, fVar);
    }

    public final Photo a(i.Image file, UploadedFile uploadedFile) {
        return new Photo(file, uploadedFile);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i.Image getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UploadedFile getUploadedFile() {
        return this.uploadedFile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Photo)) {
            return false;
        }
        Photo photo = (Photo) other;
        return t.c(this.file, photo.file) && t.c(this.uploadedFile, photo.uploadedFile);
    }

    public int hashCode() {
        int iHashCode = this.file.hashCode() * 31;
        UploadedFile fVar = this.uploadedFile;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public String toString() {
        return "Photo(file=" + this.file + ", uploadedFile=" + this.uploadedFile + ')';
    }
}
