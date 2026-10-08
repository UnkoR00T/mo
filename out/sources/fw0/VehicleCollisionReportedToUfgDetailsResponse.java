package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.g3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010)\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010\u0004R\u001a\u0010.\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b-\u0010#¨\u0006/"}, d2 = {"Lfw0/g3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/b2;", "a", "Lfw0/b2;", "()Lfw0/b2;", "circumstances", "Lfw0/a3;", "b", "Lfw0/a3;", "()Lfw0/a3;", "collisionStatus", "Lfw0/u2;", "c", "Lfw0/u2;", "()Lfw0/u2;", "fileServiceConfig", "Lfw0/t2;", "d", "Lfw0/t2;", "()Lfw0/t2;", "pdfStatementFile", "Lfw0/y2;", "e", "Lfw0/y2;", "()Lfw0/y2;", "perpetrator", "Lfw0/f3;", "f", "Lfw0/f3;", "()Lfw0/f3;", "reportedStatement", "g", "Ljava/lang/String;", "statementNumber", "h", "victim", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionReportedToUfgDetailsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("circumstances")
    private final VehicleCollisionCircumstancesDto circumstances;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("collisionStatus")
    private final a3 collisionStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileServiceConfig")
    private final VehicleCollisionFileServiceConfigDto fileServiceConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pdfStatementFile")
    private final VehicleCollisionFileDto pdfStatementFile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("perpetrator")
    private final VehicleCollisionParticipantDetailsDto perpetrator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reportedStatement")
    private final VehicleCollisionReportedStatementDetailsDto reportedStatement;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statementNumber")
    private final String statementNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("victim")
    private final VehicleCollisionParticipantDetailsDto victim;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final VehicleCollisionCircumstancesDto getCircumstances() {
        return this.circumstances;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a3 getCollisionStatus() {
        return this.collisionStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VehicleCollisionFileServiceConfigDto getFileServiceConfig() {
        return this.fileServiceConfig;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final VehicleCollisionFileDto getPdfStatementFile() {
        return this.pdfStatementFile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VehicleCollisionParticipantDetailsDto getPerpetrator() {
        return this.perpetrator;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionReportedToUfgDetailsResponse)) {
            return false;
        }
        VehicleCollisionReportedToUfgDetailsResponse vehicleCollisionReportedToUfgDetailsResponse = (VehicleCollisionReportedToUfgDetailsResponse) other;
        return fr.t.c(this.circumstances, vehicleCollisionReportedToUfgDetailsResponse.circumstances) && this.collisionStatus == vehicleCollisionReportedToUfgDetailsResponse.collisionStatus && fr.t.c(this.fileServiceConfig, vehicleCollisionReportedToUfgDetailsResponse.fileServiceConfig) && fr.t.c(this.pdfStatementFile, vehicleCollisionReportedToUfgDetailsResponse.pdfStatementFile) && fr.t.c(this.perpetrator, vehicleCollisionReportedToUfgDetailsResponse.perpetrator) && fr.t.c(this.reportedStatement, vehicleCollisionReportedToUfgDetailsResponse.reportedStatement) && fr.t.c(this.statementNumber, vehicleCollisionReportedToUfgDetailsResponse.statementNumber) && fr.t.c(this.victim, vehicleCollisionReportedToUfgDetailsResponse.victim);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final VehicleCollisionReportedStatementDetailsDto getReportedStatement() {
        return this.reportedStatement;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatementNumber() {
        return this.statementNumber;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final VehicleCollisionParticipantDetailsDto getVictim() {
        return this.victim;
    }

    public int hashCode() {
        return (((((((((((((this.circumstances.hashCode() * 31) + this.collisionStatus.hashCode()) * 31) + this.fileServiceConfig.hashCode()) * 31) + this.pdfStatementFile.hashCode()) * 31) + this.perpetrator.hashCode()) * 31) + this.reportedStatement.hashCode()) * 31) + this.statementNumber.hashCode()) * 31) + this.victim.hashCode();
    }

    public String toString() {
        return "VehicleCollisionReportedToUfgDetailsResponse(circumstances=" + this.circumstances + ", collisionStatus=" + this.collisionStatus + ", fileServiceConfig=" + this.fileServiceConfig + ", pdfStatementFile=" + this.pdfStatementFile + ", perpetrator=" + this.perpetrator + ", reportedStatement=" + this.reportedStatement + ", statementNumber=" + this.statementNumber + ", victim=" + this.victim + ')';
    }
}
