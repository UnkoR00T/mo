package xt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: xt0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lxt0/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "fileEncryptionKey", "Lxt0/b;", "b", "Lxt0/b;", "()Lxt0/b;", "jwtFileService", "c", "I", "maxFileAmount", "d", "sslPinningCert", "e", "urlToFileUpload", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AttachmentsInterventionConfigurationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileEncryptionKey")
    private final String fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("jwtFileService")
    private final AttachmentsInterventionConfigurationResponseJwtFileServiceDto jwtFileService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxFileAmount")
    private final int maxFileAmount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sslPinningCert")
    private final String sslPinningCert;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("urlToFileUpload")
    private final String urlToFileUpload;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AttachmentsInterventionConfigurationResponseJwtFileServiceDto getJwtFileService() {
        return this.jwtFileService;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxFileAmount() {
        return this.maxFileAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSslPinningCert() {
        return this.sslPinningCert;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUrlToFileUpload() {
        return this.urlToFileUpload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentsInterventionConfigurationResponse)) {
            return false;
        }
        AttachmentsInterventionConfigurationResponse attachmentsInterventionConfigurationResponse = (AttachmentsInterventionConfigurationResponse) other;
        return fr.t.c(this.fileEncryptionKey, attachmentsInterventionConfigurationResponse.fileEncryptionKey) && fr.t.c(this.jwtFileService, attachmentsInterventionConfigurationResponse.jwtFileService) && this.maxFileAmount == attachmentsInterventionConfigurationResponse.maxFileAmount && fr.t.c(this.sslPinningCert, attachmentsInterventionConfigurationResponse.sslPinningCert) && fr.t.c(this.urlToFileUpload, attachmentsInterventionConfigurationResponse.urlToFileUpload);
    }

    public int hashCode() {
        return (((((((this.fileEncryptionKey.hashCode() * 31) + this.jwtFileService.hashCode()) * 31) + Integer.hashCode(this.maxFileAmount)) * 31) + this.sslPinningCert.hashCode()) * 31) + this.urlToFileUpload.hashCode();
    }

    public String toString() {
        return "AttachmentsInterventionConfigurationResponse(fileEncryptionKey=" + this.fileEncryptionKey + ", jwtFileService=" + this.jwtFileService + ", maxFileAmount=" + this.maxFileAmount + ", sslPinningCert=" + this.sslPinningCert + ", urlToFileUpload=" + this.urlToFileUpload + ')';
    }
}
