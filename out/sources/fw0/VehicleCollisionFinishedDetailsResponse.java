package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.v2, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\u0004R\u001a\u0010'\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0017\u0010-¨\u0006/"}, d2 = {"Lfw0/v2;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/b2;", "a", "Lfw0/b2;", "()Lfw0/b2;", "circumstances", "Lfw0/u2;", "b", "Lfw0/u2;", "()Lfw0/u2;", "fileServiceConfig", "Lfw0/y2;", "c", "Lfw0/y2;", "d", "()Lfw0/y2;", "perpetrator", "Z", "e", "()Z", "regenerateStatement", "Ljava/lang/String;", "f", "statementNumber", "Lfw0/h3;", "Lfw0/h3;", "getUserInRole", "()Lfw0/h3;", "userInRole", "g", "victim", "Lfw0/t2;", "h", "Lfw0/t2;", "()Lfw0/t2;", "pdfStatementFile", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionFinishedDetailsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("circumstances")
    private final VehicleCollisionCircumstancesDto circumstances;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileServiceConfig")
    private final VehicleCollisionFileServiceConfigDto fileServiceConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("perpetrator")
    private final VehicleCollisionParticipantDetailsDto perpetrator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("regenerateStatement")
    private final boolean regenerateStatement;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statementNumber")
    private final String statementNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("userInRole")
    private final h3 userInRole;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("victim")
    private final VehicleCollisionParticipantDetailsDto victim;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pdfStatementFile")
    private final VehicleCollisionFileDto pdfStatementFile;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final VehicleCollisionCircumstancesDto getCircumstances() {
        return this.circumstances;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleCollisionFileServiceConfigDto getFileServiceConfig() {
        return this.fileServiceConfig;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VehicleCollisionFileDto getPdfStatementFile() {
        return this.pdfStatementFile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final VehicleCollisionParticipantDetailsDto getPerpetrator() {
        return this.perpetrator;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRegenerateStatement() {
        return this.regenerateStatement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionFinishedDetailsResponse)) {
            return false;
        }
        VehicleCollisionFinishedDetailsResponse vehicleCollisionFinishedDetailsResponse = (VehicleCollisionFinishedDetailsResponse) other;
        return fr.t.c(this.circumstances, vehicleCollisionFinishedDetailsResponse.circumstances) && fr.t.c(this.fileServiceConfig, vehicleCollisionFinishedDetailsResponse.fileServiceConfig) && fr.t.c(this.perpetrator, vehicleCollisionFinishedDetailsResponse.perpetrator) && this.regenerateStatement == vehicleCollisionFinishedDetailsResponse.regenerateStatement && fr.t.c(this.statementNumber, vehicleCollisionFinishedDetailsResponse.statementNumber) && this.userInRole == vehicleCollisionFinishedDetailsResponse.userInRole && fr.t.c(this.victim, vehicleCollisionFinishedDetailsResponse.victim) && fr.t.c(this.pdfStatementFile, vehicleCollisionFinishedDetailsResponse.pdfStatementFile);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatementNumber() {
        return this.statementNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final VehicleCollisionParticipantDetailsDto getVictim() {
        return this.victim;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.circumstances.hashCode() * 31) + this.fileServiceConfig.hashCode()) * 31) + this.perpetrator.hashCode()) * 31) + Boolean.hashCode(this.regenerateStatement)) * 31) + this.statementNumber.hashCode()) * 31) + this.userInRole.hashCode()) * 31) + this.victim.hashCode()) * 31;
        VehicleCollisionFileDto vehicleCollisionFileDto = this.pdfStatementFile;
        return iHashCode + (vehicleCollisionFileDto == null ? 0 : vehicleCollisionFileDto.hashCode());
    }

    public String toString() {
        return "VehicleCollisionFinishedDetailsResponse(circumstances=" + this.circumstances + ", fileServiceConfig=" + this.fileServiceConfig + ", perpetrator=" + this.perpetrator + ", regenerateStatement=" + this.regenerateStatement + ", statementNumber=" + this.statementNumber + ", userInRole=" + this.userInRole + ", victim=" + this.victim + ", pdfStatementFile=" + this.pdfStatementFile + ')';
    }
}
