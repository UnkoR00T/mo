package cl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcl0/g;", "", "Lcl0/i;", "attachmentType", "Liy/b0;", "fileEncryptionIV", "fileName", "<init>", "(Lcl0/i;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcl0/i;", "()Lcl0/i;", "b", "Liy/b0;", "()Liy/b0;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportChildApplicationAttachment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final i attachmentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionIV;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileName;

    public BEPassportChildApplicationAttachment(i iVar, iy.b0 b0Var, iy.b0 b0Var2) {
        this.attachmentType = iVar;
        this.fileEncryptionIV = b0Var;
        this.fileName = b0Var2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getAttachmentType() {
        return this.attachmentType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getFileEncryptionIV() {
        return this.fileEncryptionIV;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getFileName() {
        return this.fileName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportChildApplicationAttachment)) {
            return false;
        }
        BEPassportChildApplicationAttachment bEPassportChildApplicationAttachment = (BEPassportChildApplicationAttachment) other;
        return this.attachmentType == bEPassportChildApplicationAttachment.attachmentType && fr.t.c(this.fileEncryptionIV, bEPassportChildApplicationAttachment.fileEncryptionIV) && fr.t.c(this.fileName, bEPassportChildApplicationAttachment.fileName);
    }

    public int hashCode() {
        return (((this.attachmentType.hashCode() * 31) + this.fileEncryptionIV.hashCode()) * 31) + this.fileName.hashCode();
    }

    public String toString() {
        return "BEPassportChildApplicationAttachment(attachmentType=" + this.attachmentType + ", fileEncryptionIV=" + this.fileEncryptionIV + ", fileName=" + this.fileName + ")";
    }
}
