package i61;

import p071kotlin.Metadata;
import wx.FilePickerMetadata;

/* JADX INFO: renamed from: i61.i, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Li61/i;", "", "Lwx/k;", "file", "Lwx/e;", "pickedFileMetadata", "", "isFaceCoveringPhotoOptionChecked", "isPhotoWithGlassesOptionChecked", "<init>", "(Lwx/k;Lwx/e;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/k;", "()Lwx/k;", "b", "Lwx/e;", "()Lwx/e;", "c", "Z", "()Z", "d", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationStoredPhotoData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.k file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FilePickerMetadata pickedFileMetadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFaceCoveringPhotoOptionChecked;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPhotoWithGlassesOptionChecked;

    public ChildPassportApplicationStoredPhotoData(wx.k kVar, FilePickerMetadata filePickerMetadata, boolean z15, boolean z16) {
        this.file = kVar;
        this.pickedFileMetadata = filePickerMetadata;
        this.isFaceCoveringPhotoOptionChecked = z15;
        this.isPhotoWithGlassesOptionChecked = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final wx.k getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FilePickerMetadata getPickedFileMetadata() {
        return this.pickedFileMetadata;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsFaceCoveringPhotoOptionChecked() {
        return this.isFaceCoveringPhotoOptionChecked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsPhotoWithGlassesOptionChecked() {
        return this.isPhotoWithGlassesOptionChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationStoredPhotoData)) {
            return false;
        }
        ChildPassportApplicationStoredPhotoData childPassportApplicationStoredPhotoData = (ChildPassportApplicationStoredPhotoData) other;
        return fr.t.c(this.file, childPassportApplicationStoredPhotoData.file) && fr.t.c(this.pickedFileMetadata, childPassportApplicationStoredPhotoData.pickedFileMetadata) && this.isFaceCoveringPhotoOptionChecked == childPassportApplicationStoredPhotoData.isFaceCoveringPhotoOptionChecked && this.isPhotoWithGlassesOptionChecked == childPassportApplicationStoredPhotoData.isPhotoWithGlassesOptionChecked;
    }

    public int hashCode() {
        return (((((this.file.hashCode() * 31) + this.pickedFileMetadata.hashCode()) * 31) + Boolean.hashCode(this.isFaceCoveringPhotoOptionChecked)) * 31) + Boolean.hashCode(this.isPhotoWithGlassesOptionChecked);
    }

    public String toString() {
        return "ChildPassportApplicationStoredPhotoData(file=" + this.file + ", pickedFileMetadata=" + this.pickedFileMetadata + ", isFaceCoveringPhotoOptionChecked=" + this.isFaceCoveringPhotoOptionChecked + ", isPhotoWithGlassesOptionChecked=" + this.isPhotoWithGlassesOptionChecked + ')';
    }
}
