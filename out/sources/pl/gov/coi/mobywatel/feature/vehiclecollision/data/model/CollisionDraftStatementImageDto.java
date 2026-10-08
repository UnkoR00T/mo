package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import rd3.UploadedFileDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;", "", "Lrd3/e;", "original", "thumbnail", "<init>", "(Lrd3/e;Lrd3/e;)V", "component1", "()Lrd3/e;", "component2", "copy", "(Lrd3/e;Lrd3/e;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrd3/e;", "getOriginal", "getThumbnail", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftStatementImageDto {
    public static final int $stable = 0;

    @c("original")
    private final UploadedFileDto original;

    @c("thumbnail")
    private final UploadedFileDto thumbnail;

    public CollisionDraftStatementImageDto(UploadedFileDto uploadedFileDto, UploadedFileDto uploadedFileDto2) {
        this.original = uploadedFileDto;
        this.thumbnail = uploadedFileDto2;
    }

    public static /* synthetic */ CollisionDraftStatementImageDto copy$default(CollisionDraftStatementImageDto collisionDraftStatementImageDto, UploadedFileDto uploadedFileDto, UploadedFileDto uploadedFileDto2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            uploadedFileDto = collisionDraftStatementImageDto.original;
        }
        if ((i15 & 2) != 0) {
            uploadedFileDto2 = collisionDraftStatementImageDto.thumbnail;
        }
        return collisionDraftStatementImageDto.copy(uploadedFileDto, uploadedFileDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UploadedFileDto getOriginal() {
        return this.original;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UploadedFileDto getThumbnail() {
        return this.thumbnail;
    }

    public final CollisionDraftStatementImageDto copy(UploadedFileDto original, UploadedFileDto thumbnail) {
        return new CollisionDraftStatementImageDto(original, thumbnail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftStatementImageDto)) {
            return false;
        }
        CollisionDraftStatementImageDto collisionDraftStatementImageDto = (CollisionDraftStatementImageDto) other;
        return t.c(this.original, collisionDraftStatementImageDto.original) && t.c(this.thumbnail, collisionDraftStatementImageDto.thumbnail);
    }

    public final UploadedFileDto getOriginal() {
        return this.original;
    }

    public final UploadedFileDto getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        return (this.original.hashCode() * 31) + this.thumbnail.hashCode();
    }

    public String toString() {
        return "CollisionDraftStatementImageDto(original=" + this.original + ", thumbnail=" + this.thumbnail + ')';
    }
}
