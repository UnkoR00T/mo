package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lfw0/o;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/n;", "a", "Lfw0/n;", "()Lfw0/n;", "fileOriginal", "b", "fileThumbnail", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionVehicleImageWithThumbnailFileDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileOriginal")
    private final CollisionVehicleImageFileDto fileOriginal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fileThumbnail")
    private final CollisionVehicleImageFileDto fileThumbnail;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CollisionVehicleImageFileDto getFileOriginal() {
        return this.fileOriginal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CollisionVehicleImageFileDto getFileThumbnail() {
        return this.fileThumbnail;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionVehicleImageWithThumbnailFileDto)) {
            return false;
        }
        CollisionVehicleImageWithThumbnailFileDto collisionVehicleImageWithThumbnailFileDto = (CollisionVehicleImageWithThumbnailFileDto) other;
        return fr.t.c(this.fileOriginal, collisionVehicleImageWithThumbnailFileDto.fileOriginal) && fr.t.c(this.fileThumbnail, collisionVehicleImageWithThumbnailFileDto.fileThumbnail);
    }

    public int hashCode() {
        int iHashCode = this.fileOriginal.hashCode() * 31;
        CollisionVehicleImageFileDto collisionVehicleImageFileDto = this.fileThumbnail;
        return iHashCode + (collisionVehicleImageFileDto == null ? 0 : collisionVehicleImageFileDto.hashCode());
    }

    public String toString() {
        return "CollisionVehicleImageWithThumbnailFileDto(fileOriginal=" + this.fileOriginal + ", fileThumbnail=" + this.fileThumbnail + ')';
    }
}
