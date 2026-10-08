package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddPhotoDto;", "", "file", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;", "pickedFileMetadata", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;", "isFaceCoveringPhotoOptionChecked", "", "isPhotoWithGlassesOptionChecked", "<init>", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;ZZ)V", "getFile", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationStoredFileDto;", "getPickedFileMetadata", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationAddPhotoDto {
    public static final int $stable = 0;

    @c("file")
    private final ChildPassportApplicationStoredFileDto file;

    @c("isFaceCoveringPhotoOptionChecked")
    private final boolean isFaceCoveringPhotoOptionChecked;

    @c("isPhotoWithGlassesOptionChecked")
    private final boolean isPhotoWithGlassesOptionChecked;

    @c("pickedFileMetadata")
    private final FilePickerMetadataDto pickedFileMetadata;

    public ChildPassportApplicationAddPhotoDto(ChildPassportApplicationStoredFileDto childPassportApplicationStoredFileDto, FilePickerMetadataDto filePickerMetadataDto, boolean z15, boolean z16) {
        this.file = childPassportApplicationStoredFileDto;
        this.pickedFileMetadata = filePickerMetadataDto;
        this.isFaceCoveringPhotoOptionChecked = z15;
        this.isPhotoWithGlassesOptionChecked = z16;
    }

    public static /* synthetic */ ChildPassportApplicationAddPhotoDto copy$default(ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDto, ChildPassportApplicationStoredFileDto childPassportApplicationStoredFileDto, FilePickerMetadataDto filePickerMetadataDto, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            childPassportApplicationStoredFileDto = childPassportApplicationAddPhotoDto.file;
        }
        if ((i15 & 2) != 0) {
            filePickerMetadataDto = childPassportApplicationAddPhotoDto.pickedFileMetadata;
        }
        if ((i15 & 4) != 0) {
            z15 = childPassportApplicationAddPhotoDto.isFaceCoveringPhotoOptionChecked;
        }
        if ((i15 & 8) != 0) {
            z16 = childPassportApplicationAddPhotoDto.isPhotoWithGlassesOptionChecked;
        }
        return childPassportApplicationAddPhotoDto.copy(childPassportApplicationStoredFileDto, filePickerMetadataDto, z15, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChildPassportApplicationStoredFileDto getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FilePickerMetadataDto getPickedFileMetadata() {
        return this.pickedFileMetadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFaceCoveringPhotoOptionChecked() {
        return this.isFaceCoveringPhotoOptionChecked;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPhotoWithGlassesOptionChecked() {
        return this.isPhotoWithGlassesOptionChecked;
    }

    public final ChildPassportApplicationAddPhotoDto copy(ChildPassportApplicationStoredFileDto file, FilePickerMetadataDto pickedFileMetadata, boolean isFaceCoveringPhotoOptionChecked, boolean isPhotoWithGlassesOptionChecked) {
        return new ChildPassportApplicationAddPhotoDto(file, pickedFileMetadata, isFaceCoveringPhotoOptionChecked, isPhotoWithGlassesOptionChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationAddPhotoDto)) {
            return false;
        }
        ChildPassportApplicationAddPhotoDto childPassportApplicationAddPhotoDto = (ChildPassportApplicationAddPhotoDto) other;
        return t.c(this.file, childPassportApplicationAddPhotoDto.file) && t.c(this.pickedFileMetadata, childPassportApplicationAddPhotoDto.pickedFileMetadata) && this.isFaceCoveringPhotoOptionChecked == childPassportApplicationAddPhotoDto.isFaceCoveringPhotoOptionChecked && this.isPhotoWithGlassesOptionChecked == childPassportApplicationAddPhotoDto.isPhotoWithGlassesOptionChecked;
    }

    public final ChildPassportApplicationStoredFileDto getFile() {
        return this.file;
    }

    public final FilePickerMetadataDto getPickedFileMetadata() {
        return this.pickedFileMetadata;
    }

    public int hashCode() {
        return (((((this.file.hashCode() * 31) + this.pickedFileMetadata.hashCode()) * 31) + Boolean.hashCode(this.isFaceCoveringPhotoOptionChecked)) * 31) + Boolean.hashCode(this.isPhotoWithGlassesOptionChecked);
    }

    public final boolean isFaceCoveringPhotoOptionChecked() {
        return this.isFaceCoveringPhotoOptionChecked;
    }

    public final boolean isPhotoWithGlassesOptionChecked() {
        return this.isPhotoWithGlassesOptionChecked;
    }

    public String toString() {
        return "ChildPassportApplicationAddPhotoDto(file=" + this.file + ", pickedFileMetadata=" + this.pickedFileMetadata + ", isFaceCoveringPhotoOptionChecked=" + this.isFaceCoveringPhotoOptionChecked + ", isPhotoWithGlassesOptionChecked=" + this.isPhotoWithGlassesOptionChecked + ')';
    }
}
