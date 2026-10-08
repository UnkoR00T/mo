package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;
import wq.a;
import wq.b;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;", "", "type", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto$Type;", "metadata", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredMetadataDto;", "<init>", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto$Type;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredMetadataDto;)V", "getType", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto$Type;", "getMetadata", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredMetadataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Type", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationStoredFileDto {
    public static final int $stable = 0;

    @c("metadata")
    private final ChildPassportApplicationStoredMetadataDto metadata;

    @c("type")
    private final Type type;

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Image", "Regular", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum Type {
        Image,
        Regular;

        private static final /* synthetic */ a $ENTRIES = b.a(values());

        public static a<Type> getEntries() {
            return $ENTRIES;
        }
    }

    public ChildPassportApplicationStoredFileDto(Type type, ChildPassportApplicationStoredMetadataDto childPassportApplicationStoredMetadataDto) {
        this.type = type;
        this.metadata = childPassportApplicationStoredMetadataDto;
    }

    public static /* synthetic */ ChildPassportApplicationStoredFileDto copy$default(ChildPassportApplicationStoredFileDto childPassportApplicationStoredFileDto, Type type, ChildPassportApplicationStoredMetadataDto childPassportApplicationStoredMetadataDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            type = childPassportApplicationStoredFileDto.type;
        }
        if ((i15 & 2) != 0) {
            childPassportApplicationStoredMetadataDto = childPassportApplicationStoredFileDto.metadata;
        }
        return childPassportApplicationStoredFileDto.copy(type, childPassportApplicationStoredMetadataDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChildPassportApplicationStoredMetadataDto getMetadata() {
        return this.metadata;
    }

    public final ChildPassportApplicationStoredFileDto copy(Type type, ChildPassportApplicationStoredMetadataDto metadata) {
        return new ChildPassportApplicationStoredFileDto(type, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationStoredFileDto)) {
            return false;
        }
        ChildPassportApplicationStoredFileDto childPassportApplicationStoredFileDto = (ChildPassportApplicationStoredFileDto) other;
        return this.type == childPassportApplicationStoredFileDto.type && t.c(this.metadata, childPassportApplicationStoredFileDto.metadata);
    }

    public final ChildPassportApplicationStoredMetadataDto getMetadata() {
        return this.metadata;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "ChildPassportApplicationStoredFileDto(type=" + this.type + ", metadata=" + this.metadata + ')';
    }
}
