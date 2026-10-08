package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.u2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lfw0/u2;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "fileEncryptionKey", "b", "fileSaveDirectoryUrlDomainCertificateBase64", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionFileServiceConfigDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileEncryptionKey")
    private final String fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileSaveDirectoryUrlDomainCertificateBase64")
    private final String fileSaveDirectoryUrlDomainCertificateBase64;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileSaveDirectoryUrlDomainCertificateBase64() {
        return this.fileSaveDirectoryUrlDomainCertificateBase64;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionFileServiceConfigDto)) {
            return false;
        }
        VehicleCollisionFileServiceConfigDto vehicleCollisionFileServiceConfigDto = (VehicleCollisionFileServiceConfigDto) other;
        return fr.t.c(this.fileEncryptionKey, vehicleCollisionFileServiceConfigDto.fileEncryptionKey) && fr.t.c(this.fileSaveDirectoryUrlDomainCertificateBase64, vehicleCollisionFileServiceConfigDto.fileSaveDirectoryUrlDomainCertificateBase64);
    }

    public int hashCode() {
        return (this.fileEncryptionKey.hashCode() * 31) + this.fileSaveDirectoryUrlDomainCertificateBase64.hashCode();
    }

    public String toString() {
        return "VehicleCollisionFileServiceConfigDto(fileEncryptionKey=" + this.fileEncryptionKey + ", fileSaveDirectoryUrlDomainCertificateBase64=" + this.fileSaveDirectoryUrlDomainCertificateBase64 + ')';
    }
}
