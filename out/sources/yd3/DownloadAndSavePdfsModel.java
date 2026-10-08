package yd3;

import fr.t;
import p071kotlin.Metadata;
import sv0.PdfFile;

/* JADX INFO: renamed from: yd3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lyd3/b;", "", "Lsv0/x;", "pdfFile", "", "fileNameToSaveAs", "<init>", "(Lsv0/x;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/x;", "b", "()Lsv0/x;", "Ljava/lang/String;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadAndSavePdfsModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PdfFile pdfFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileNameToSaveAs;

    public DownloadAndSavePdfsModel(PdfFile pdfFile, String str) {
        this.pdfFile = pdfFile;
        this.fileNameToSaveAs = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileNameToSaveAs() {
        return this.fileNameToSaveAs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PdfFile getPdfFile() {
        return this.pdfFile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadAndSavePdfsModel)) {
            return false;
        }
        DownloadAndSavePdfsModel downloadAndSavePdfsModel = (DownloadAndSavePdfsModel) other;
        return t.c(this.pdfFile, downloadAndSavePdfsModel.pdfFile) && t.c(this.fileNameToSaveAs, downloadAndSavePdfsModel.fileNameToSaveAs);
    }

    public int hashCode() {
        return (this.pdfFile.hashCode() * 31) + this.fileNameToSaveAs.hashCode();
    }

    public String toString() {
        return "DownloadAndSavePdfsModel(pdfFile=" + this.pdfFile + ", fileNameToSaveAs=" + this.fileNameToSaveAs + ')';
    }
}
