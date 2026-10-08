package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import rd3.StoredFileDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011¨\u0006#"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhotoDto;", "", "Lrd3/c;", "image", "", "originalName", "originalUri", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;", "statementImage", "<init>", "(Lrd3/c;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;)V", "component1", "()Lrd3/c;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;", "copy", "(Lrd3/c;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhotoDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrd3/c;", "getImage", "Ljava/lang/String;", "getOriginalName", "getOriginalUri", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;", "getStatementImage", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftPhotoDto {
    public static final int $stable = 0;

    @c("image")
    private final StoredFileDto image;

    @c("originalName")
    private final String originalName;

    @c("originalUri")
    private final String originalUri;

    @c("statementImage")
    private final CollisionDraftStatementImageDto statementImage;

    public CollisionDraftPhotoDto(StoredFileDto storedFileDto, String str, String str2, CollisionDraftStatementImageDto collisionDraftStatementImageDto) {
        this.image = storedFileDto;
        this.originalName = str;
        this.originalUri = str2;
        this.statementImage = collisionDraftStatementImageDto;
    }

    public static /* synthetic */ CollisionDraftPhotoDto copy$default(CollisionDraftPhotoDto collisionDraftPhotoDto, StoredFileDto storedFileDto, String str, String str2, CollisionDraftStatementImageDto collisionDraftStatementImageDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            storedFileDto = collisionDraftPhotoDto.image;
        }
        if ((i15 & 2) != 0) {
            str = collisionDraftPhotoDto.originalName;
        }
        if ((i15 & 4) != 0) {
            str2 = collisionDraftPhotoDto.originalUri;
        }
        if ((i15 & 8) != 0) {
            collisionDraftStatementImageDto = collisionDraftPhotoDto.statementImage;
        }
        return collisionDraftPhotoDto.copy(storedFileDto, str, str2, collisionDraftStatementImageDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StoredFileDto getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginalName() {
        return this.originalName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOriginalUri() {
        return this.originalUri;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CollisionDraftStatementImageDto getStatementImage() {
        return this.statementImage;
    }

    public final CollisionDraftPhotoDto copy(StoredFileDto image, String originalName, String originalUri, CollisionDraftStatementImageDto statementImage) {
        return new CollisionDraftPhotoDto(image, originalName, originalUri, statementImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftPhotoDto)) {
            return false;
        }
        CollisionDraftPhotoDto collisionDraftPhotoDto = (CollisionDraftPhotoDto) other;
        return t.c(this.image, collisionDraftPhotoDto.image) && t.c(this.originalName, collisionDraftPhotoDto.originalName) && t.c(this.originalUri, collisionDraftPhotoDto.originalUri) && t.c(this.statementImage, collisionDraftPhotoDto.statementImage);
    }

    public final StoredFileDto getImage() {
        return this.image;
    }

    public final String getOriginalName() {
        return this.originalName;
    }

    public final String getOriginalUri() {
        return this.originalUri;
    }

    public final CollisionDraftStatementImageDto getStatementImage() {
        return this.statementImage;
    }

    public int hashCode() {
        int iHashCode = ((((this.image.hashCode() * 31) + this.originalName.hashCode()) * 31) + this.originalUri.hashCode()) * 31;
        CollisionDraftStatementImageDto collisionDraftStatementImageDto = this.statementImage;
        return iHashCode + (collisionDraftStatementImageDto == null ? 0 : collisionDraftStatementImageDto.hashCode());
    }

    public String toString() {
        return "CollisionDraftPhotoDto(image=" + this.image + ", originalName=" + this.originalName + ", originalUri=" + this.originalUri + ", statementImage=" + this.statementImage + ')';
    }
}
