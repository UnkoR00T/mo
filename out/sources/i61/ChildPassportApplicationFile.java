package i61;

import p071kotlin.Metadata;
import wx.FilePickerMetadata;

/* JADX INFO: renamed from: i61.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Li61/g;", "", "Lwx/e;", "pickedFileMetadata", "Lwx/k;", "storedFile", "<init>", "(Lwx/e;Lwx/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/e;", "()Lwx/e;", "b", "Lwx/k;", "()Lwx/k;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FilePickerMetadata pickedFileMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.k storedFile;

    public ChildPassportApplicationFile(FilePickerMetadata filePickerMetadata, wx.k kVar) {
        this.pickedFileMetadata = filePickerMetadata;
        this.storedFile = kVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FilePickerMetadata getPickedFileMetadata() {
        return this.pickedFileMetadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final wx.k getStoredFile() {
        return this.storedFile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationFile)) {
            return false;
        }
        ChildPassportApplicationFile childPassportApplicationFile = (ChildPassportApplicationFile) other;
        return fr.t.c(this.pickedFileMetadata, childPassportApplicationFile.pickedFileMetadata) && fr.t.c(this.storedFile, childPassportApplicationFile.storedFile);
    }

    public int hashCode() {
        return (this.pickedFileMetadata.hashCode() * 31) + this.storedFile.hashCode();
    }

    public String toString() {
        return "ChildPassportApplicationFile(pickedFileMetadata=" + this.pickedFileMetadata + ", storedFile=" + this.storedFile + ')';
    }
}
