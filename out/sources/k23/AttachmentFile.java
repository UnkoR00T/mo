package k23;

import fr.t;
import o04.UploadedFile;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k23.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk23/a;", "", "Lwx/i;", "pickedFile", "Lo04/f;", "uploadedFile", "<init>", "(Lwx/i;Lo04/f;)V", "a", "(Lwx/i;Lo04/f;)Lk23/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwx/i;", "c", "()Lwx/i;", "b", "Lo04/f;", "d", "()Lo04/f;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AttachmentFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final wx.i pickedFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final UploadedFile uploadedFile;

    public AttachmentFile(wx.i iVar, UploadedFile uploadedFile) {
        this.pickedFile = iVar;
        this.uploadedFile = uploadedFile;
    }

    public static /* synthetic */ AttachmentFile b(AttachmentFile attachmentFile, wx.i iVar, UploadedFile uploadedFile, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = attachmentFile.pickedFile;
        }
        if ((i15 & 2) != 0) {
            uploadedFile = attachmentFile.uploadedFile;
        }
        return attachmentFile.a(iVar, uploadedFile);
    }

    public final AttachmentFile a(wx.i pickedFile, UploadedFile uploadedFile) {
        return new AttachmentFile(pickedFile, uploadedFile);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final wx.i getPickedFile() {
        return this.pickedFile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UploadedFile getUploadedFile() {
        return this.uploadedFile;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentFile)) {
            return false;
        }
        AttachmentFile attachmentFile = (AttachmentFile) other;
        return t.c(this.pickedFile, attachmentFile.pickedFile) && t.c(this.uploadedFile, attachmentFile.uploadedFile);
    }

    public int hashCode() {
        int iHashCode = this.pickedFile.hashCode() * 31;
        UploadedFile uploadedFile = this.uploadedFile;
        return iHashCode + (uploadedFile == null ? 0 : uploadedFile.hashCode());
    }

    public String toString() {
        return "AttachmentFile(pickedFile=" + this.pickedFile + ", uploadedFile=" + this.uploadedFile + ')';
    }

    public /* synthetic */ AttachmentFile(wx.i iVar, UploadedFile uploadedFile, int i15, fr.k kVar) {
        this(iVar, (i15 & 2) != 0 ? null : uploadedFile);
    }
}
