package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.g0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lfw0/g0;", "", "Lfw0/f0;", "fileOriginal", "fileThumbnail", "<init>", "(Lfw0/f0;Lfw0/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfw0/f0;", "getFileOriginal", "()Lfw0/f0;", "b", "getFileThumbnail", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FillVehicleCollisionParticipantImageWithThumbnailDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileOriginal")
    private final FillVehicleCollisionParticipantImageDto fileOriginal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileThumbnail")
    private final FillVehicleCollisionParticipantImageDto fileThumbnail;

    public FillVehicleCollisionParticipantImageWithThumbnailDto(FillVehicleCollisionParticipantImageDto fillVehicleCollisionParticipantImageDto, FillVehicleCollisionParticipantImageDto fillVehicleCollisionParticipantImageDto2) {
        this.fileOriginal = fillVehicleCollisionParticipantImageDto;
        this.fileThumbnail = fillVehicleCollisionParticipantImageDto2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FillVehicleCollisionParticipantImageWithThumbnailDto)) {
            return false;
        }
        FillVehicleCollisionParticipantImageWithThumbnailDto fillVehicleCollisionParticipantImageWithThumbnailDto = (FillVehicleCollisionParticipantImageWithThumbnailDto) other;
        return fr.t.c(this.fileOriginal, fillVehicleCollisionParticipantImageWithThumbnailDto.fileOriginal) && fr.t.c(this.fileThumbnail, fillVehicleCollisionParticipantImageWithThumbnailDto.fileThumbnail);
    }

    public int hashCode() {
        return (this.fileOriginal.hashCode() * 31) + this.fileThumbnail.hashCode();
    }

    public String toString() {
        return "FillVehicleCollisionParticipantImageWithThumbnailDto(fileOriginal=" + this.fileOriginal + ", fileThumbnail=" + this.fileThumbnail + ')';
    }
}
