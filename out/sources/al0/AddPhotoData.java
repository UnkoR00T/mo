package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001b"}, d2 = {"Lal0/b;", "", "Lwx/i$a;", "file", "", "isFaceCoveringPhotoOptionChecked", "isPhotoWithGlassesOptionChecked", "<init>", "(Lwx/i$a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i$a;", "()Lwx/i$a;", "b", "Z", "c", "()Z", "d", "isAnyAdditionalPhotoSelected", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddPhotoData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.i.Image file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFaceCoveringPhotoOptionChecked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPhotoWithGlassesOptionChecked;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isAnyAdditionalPhotoSelected;

    public AddPhotoData(wx.i.Image image, boolean z15, boolean z16) {
        this.file = image;
        this.isFaceCoveringPhotoOptionChecked = z15;
        this.isPhotoWithGlassesOptionChecked = z16;
        this.isAnyAdditionalPhotoSelected = z15 || z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final wx.i.Image getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsAnyAdditionalPhotoSelected() {
        return this.isAnyAdditionalPhotoSelected;
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
        if (!(other instanceof AddPhotoData)) {
            return false;
        }
        AddPhotoData addPhotoData = (AddPhotoData) other;
        return fr.t.c(this.file, addPhotoData.file) && this.isFaceCoveringPhotoOptionChecked == addPhotoData.isFaceCoveringPhotoOptionChecked && this.isPhotoWithGlassesOptionChecked == addPhotoData.isPhotoWithGlassesOptionChecked;
    }

    public int hashCode() {
        return (((this.file.hashCode() * 31) + Boolean.hashCode(this.isFaceCoveringPhotoOptionChecked)) * 31) + Boolean.hashCode(this.isPhotoWithGlassesOptionChecked);
    }

    public String toString() {
        return "AddPhotoData(file=" + this.file + ", isFaceCoveringPhotoOptionChecked=" + this.isFaceCoveringPhotoOptionChecked + ", isPhotoWithGlassesOptionChecked=" + this.isPhotoWithGlassesOptionChecked + ")";
    }
}
