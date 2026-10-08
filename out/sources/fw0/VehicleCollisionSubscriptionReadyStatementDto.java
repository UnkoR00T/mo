package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.j3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\f\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b\u0012\u0010#R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b\u001d\u0010\u0004¨\u0006'"}, d2 = {"Lfw0/j3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "regenerateStatement", "Lfw0/a3;", "b", "Lfw0/a3;", "e", "()Lfw0/a3;", "status", "Lfw0/h3;", "Lfw0/h3;", "f", "()Lfw0/h3;", "userInRole", "Lfw0/u2;", "d", "Lfw0/u2;", "()Lfw0/u2;", "fileServiceConfig", "Lfw0/t2;", "Lfw0/t2;", "()Lfw0/t2;", "pdfStatementFile", "Ljava/lang/String;", "statementNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionSubscriptionReadyStatementDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("regenerateStatement")
    private final boolean regenerateStatement;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final a3 status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("userInRole")
    private final h3 userInRole;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileServiceConfig")
    private final VehicleCollisionFileServiceConfigDto fileServiceConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pdfStatementFile")
    private final VehicleCollisionFileDto pdfStatementFile;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statementNumber")
    private final String statementNumber;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final VehicleCollisionFileServiceConfigDto getFileServiceConfig() {
        return this.fileServiceConfig;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleCollisionFileDto getPdfStatementFile() {
        return this.pdfStatementFile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRegenerateStatement() {
        return this.regenerateStatement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatementNumber() {
        return this.statementNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a3 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionSubscriptionReadyStatementDto)) {
            return false;
        }
        VehicleCollisionSubscriptionReadyStatementDto vehicleCollisionSubscriptionReadyStatementDto = (VehicleCollisionSubscriptionReadyStatementDto) other;
        return this.regenerateStatement == vehicleCollisionSubscriptionReadyStatementDto.regenerateStatement && this.status == vehicleCollisionSubscriptionReadyStatementDto.status && this.userInRole == vehicleCollisionSubscriptionReadyStatementDto.userInRole && fr.t.c(this.fileServiceConfig, vehicleCollisionSubscriptionReadyStatementDto.fileServiceConfig) && fr.t.c(this.pdfStatementFile, vehicleCollisionSubscriptionReadyStatementDto.pdfStatementFile) && fr.t.c(this.statementNumber, vehicleCollisionSubscriptionReadyStatementDto.statementNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h3 getUserInRole() {
        return this.userInRole;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.regenerateStatement) * 31) + this.status.hashCode()) * 31) + this.userInRole.hashCode()) * 31;
        VehicleCollisionFileServiceConfigDto vehicleCollisionFileServiceConfigDto = this.fileServiceConfig;
        int iHashCode2 = (iHashCode + (vehicleCollisionFileServiceConfigDto == null ? 0 : vehicleCollisionFileServiceConfigDto.hashCode())) * 31;
        VehicleCollisionFileDto vehicleCollisionFileDto = this.pdfStatementFile;
        int iHashCode3 = (iHashCode2 + (vehicleCollisionFileDto == null ? 0 : vehicleCollisionFileDto.hashCode())) * 31;
        String str = this.statementNumber;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VehicleCollisionSubscriptionReadyStatementDto(regenerateStatement=" + this.regenerateStatement + ", status=" + this.status + ", userInRole=" + this.userInRole + ", fileServiceConfig=" + this.fileServiceConfig + ", pdfStatementFile=" + this.pdfStatementFile + ", statementNumber=" + this.statementNumber + ')';
    }
}
