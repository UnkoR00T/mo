package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationFileDto;", "", "pickedFileMetadata", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;", "storedFile", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;", "<init>", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;)V", "getPickedFileMetadata", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;", "getStoredFile", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationFileDto {
    public static final int $stable = 0;

    @c("pickedFileMetadata")
    private final FilePickerMetadataDto pickedFileMetadata;

    @c("storedFile")
    private final ChildPassportApplicationStoredFileDto storedFile;

    public ChildPassportApplicationFileDto(FilePickerMetadataDto filePickerMetadataDto, ChildPassportApplicationStoredFileDto childPassportApplicationStoredFileDto) {
        this.pickedFileMetadata = filePickerMetadataDto;
        this.storedFile = childPassportApplicationStoredFileDto;
    }

    public static /* synthetic */ ChildPassportApplicationFileDto copy$default(ChildPassportApplicationFileDto childPassportApplicationFileDto, FilePickerMetadataDto filePickerMetadataDto, ChildPassportApplicationStoredFileDto childPassportApplicationStoredFileDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            filePickerMetadataDto = childPassportApplicationFileDto.pickedFileMetadata;
        }
        if ((i15 & 2) != 0) {
            childPassportApplicationStoredFileDto = childPassportApplicationFileDto.storedFile;
        }
        return childPassportApplicationFileDto.copy(filePickerMetadataDto, childPassportApplicationStoredFileDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilePickerMetadataDto getPickedFileMetadata() {
        return this.pickedFileMetadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChildPassportApplicationStoredFileDto getStoredFile() {
        return this.storedFile;
    }

    public final ChildPassportApplicationFileDto copy(FilePickerMetadataDto pickedFileMetadata, ChildPassportApplicationStoredFileDto storedFile) {
        return new ChildPassportApplicationFileDto(pickedFileMetadata, storedFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationFileDto)) {
            return false;
        }
        ChildPassportApplicationFileDto childPassportApplicationFileDto = (ChildPassportApplicationFileDto) other;
        return t.c(this.pickedFileMetadata, childPassportApplicationFileDto.pickedFileMetadata) && t.c(this.storedFile, childPassportApplicationFileDto.storedFile);
    }

    public final FilePickerMetadataDto getPickedFileMetadata() {
        return this.pickedFileMetadata;
    }

    public final ChildPassportApplicationStoredFileDto getStoredFile() {
        return this.storedFile;
    }

    public int hashCode() {
        return (this.pickedFileMetadata.hashCode() * 31) + this.storedFile.hashCode();
    }

    public String toString() {
        return "ChildPassportApplicationFileDto(pickedFileMetadata=" + this.pickedFileMetadata + ", storedFile=" + this.storedFile + ')';
    }
}
