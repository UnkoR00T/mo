package ye3;

import android.graphics.Bitmap;
import fr.t;
import p071kotlin.Metadata;
import sv0.StatementVehicleDetails;

/* JADX INFO: renamed from: ye3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lye3/a;", "", "Lsv0/j0$a;", "fileToDownload", "Landroid/graphics/Bitmap;", "thumbnailFileContent", "<init>", "(Lsv0/j0$a;Landroid/graphics/Bitmap;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/j0$a;", "()Lsv0/j0$a;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadedThumbnail {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatementVehicleDetails.Image fileToDownload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Bitmap thumbnailFileContent;

    public DownloadedThumbnail(StatementVehicleDetails.Image image, Bitmap bitmap) {
        this.fileToDownload = image;
        this.thumbnailFileContent = bitmap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final StatementVehicleDetails.Image getFileToDownload() {
        return this.fileToDownload;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Bitmap getThumbnailFileContent() {
        return this.thumbnailFileContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadedThumbnail)) {
            return false;
        }
        DownloadedThumbnail downloadedThumbnail = (DownloadedThumbnail) other;
        return t.c(this.fileToDownload, downloadedThumbnail.fileToDownload) && t.c(this.thumbnailFileContent, downloadedThumbnail.thumbnailFileContent);
    }

    public int hashCode() {
        int iHashCode = this.fileToDownload.hashCode() * 31;
        Bitmap bitmap = this.thumbnailFileContent;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public String toString() {
        return "DownloadedThumbnail(fileToDownload=" + this.fileToDownload + ", thumbnailFileContent=" + this.thumbnailFileContent + ')';
    }
}
