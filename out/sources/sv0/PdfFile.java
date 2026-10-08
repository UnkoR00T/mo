package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.x, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lsv0/x;", "", "Lsv0/p0;", "configuration", "Lsv0/r0;", "file", "<init>", "(Lsv0/p0;Lsv0/r0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/p0;", "()Lsv0/p0;", "b", "Lsv0/r0;", "()Lsv0/r0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PdfFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Download configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleCollisionFileToDownload file;

    public PdfFile(Download download, VehicleCollisionFileToDownload vehicleCollisionFileToDownload) {
        this.configuration = download;
        this.file = vehicleCollisionFileToDownload;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Download getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleCollisionFileToDownload getFile() {
        return this.file;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfFile)) {
            return false;
        }
        PdfFile pdfFile = (PdfFile) other;
        return fr.t.c(this.configuration, pdfFile.configuration) && fr.t.c(this.file, pdfFile.file);
    }

    public int hashCode() {
        return (this.configuration.hashCode() * 31) + this.file.hashCode();
    }

    public String toString() {
        return "PdfFile(configuration=" + this.configuration + ", file=" + this.file + ")";
    }
}
