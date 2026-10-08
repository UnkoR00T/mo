package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.n3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lgm0/n3;", "", "Lgm0/o3;", "agreementAttachmentType", "", "fileEncryptionIV", "fileName", "<init>", "(Lgm0/o3;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/o3;", "getAgreementAttachmentType", "()Lgm0/o3;", "b", "Ljava/lang/String;", "getFileEncryptionIV", "c", "getFileName", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildAgreementAttachmentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("agreementAttachmentType")
    private final o3 agreementAttachmentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileEncryptionIV")
    private final String fileEncryptionIV;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileName")
    private final String fileName;

    public PassportChildAgreementAttachmentDto(o3 o3Var, String str, String str2) {
        this.agreementAttachmentType = o3Var;
        this.fileEncryptionIV = str;
        this.fileName = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildAgreementAttachmentDto)) {
            return false;
        }
        PassportChildAgreementAttachmentDto passportChildAgreementAttachmentDto = (PassportChildAgreementAttachmentDto) other;
        return this.agreementAttachmentType == passportChildAgreementAttachmentDto.agreementAttachmentType && fr.t.c(this.fileEncryptionIV, passportChildAgreementAttachmentDto.fileEncryptionIV) && fr.t.c(this.fileName, passportChildAgreementAttachmentDto.fileName);
    }

    public int hashCode() {
        return (((this.agreementAttachmentType.hashCode() * 31) + this.fileEncryptionIV.hashCode()) * 31) + this.fileName.hashCode();
    }

    public String toString() {
        return "PassportChildAgreementAttachmentDto(agreementAttachmentType=" + this.agreementAttachmentType + ", fileEncryptionIV=" + this.fileEncryptionIV + ", fileName=" + this.fileName + ')';
    }
}
