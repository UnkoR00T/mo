package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredMetadataDto;", "", "name", "", "extension", "sizeInBytes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "getName", "()Ljava/lang/String;", "getExtension", "getSizeInBytes", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationStoredMetadataDto {
    public static final int $stable = 0;

    @c("extension")
    private final String extension;

    @c("name")
    private final String name;

    @c("sizeInBytes")
    private final float sizeInBytes;

    public ChildPassportApplicationStoredMetadataDto(String str, String str2, float f15) {
        this.name = str;
        this.extension = str2;
        this.sizeInBytes = f15;
    }

    public static /* synthetic */ ChildPassportApplicationStoredMetadataDto copy$default(ChildPassportApplicationStoredMetadataDto childPassportApplicationStoredMetadataDto, String str, String str2, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = childPassportApplicationStoredMetadataDto.name;
        }
        if ((i15 & 2) != 0) {
            str2 = childPassportApplicationStoredMetadataDto.extension;
        }
        if ((i15 & 4) != 0) {
            f15 = childPassportApplicationStoredMetadataDto.sizeInBytes;
        }
        return childPassportApplicationStoredMetadataDto.copy(str, str2, f15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final ChildPassportApplicationStoredMetadataDto copy(String name, String extension, float sizeInBytes) {
        return new ChildPassportApplicationStoredMetadataDto(name, extension, sizeInBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationStoredMetadataDto)) {
            return false;
        }
        ChildPassportApplicationStoredMetadataDto childPassportApplicationStoredMetadataDto = (ChildPassportApplicationStoredMetadataDto) other;
        return t.c(this.name, childPassportApplicationStoredMetadataDto.name) && t.c(this.extension, childPassportApplicationStoredMetadataDto.extension) && Float.compare(this.sizeInBytes, childPassportApplicationStoredMetadataDto.sizeInBytes) == 0;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getName() {
        return this.name;
    }

    public final float getSizeInBytes() {
        return this.sizeInBytes;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.extension.hashCode()) * 31) + Float.hashCode(this.sizeInBytes);
    }

    public String toString() {
        return "ChildPassportApplicationStoredMetadataDto(name=" + this.name + ", extension=" + this.extension + ", sizeInBytes=" + this.sizeInBytes + ')';
    }
}
