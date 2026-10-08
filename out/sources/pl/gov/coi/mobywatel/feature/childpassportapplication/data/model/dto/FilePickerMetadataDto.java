package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/FilePickerMetadataDto;", "", "name", "", "extension", "sizeInBytes", "", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getExtension", "getSizeInBytes", "()F", "getUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FilePickerMetadataDto {
    public static final int $stable = 0;

    @c("extension")
    private final String extension;

    @c("name")
    private final String name;

    @c("sizeInBytes")
    private final float sizeInBytes;

    @c("uri")
    private final String uri;

    public FilePickerMetadataDto(String str, String str2, float f15, String str3) {
        this.name = str;
        this.extension = str2;
        this.sizeInBytes = f15;
        this.uri = str3;
    }

    public static /* synthetic */ FilePickerMetadataDto copy$default(FilePickerMetadataDto filePickerMetadataDto, String str, String str2, float f15, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = filePickerMetadataDto.name;
        }
        if ((i15 & 2) != 0) {
            str2 = filePickerMetadataDto.extension;
        }
        if ((i15 & 4) != 0) {
            f15 = filePickerMetadataDto.sizeInBytes;
        }
        if ((i15 & 8) != 0) {
            str3 = filePickerMetadataDto.uri;
        }
        return filePickerMetadataDto.copy(str, str2, f15, str3);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final FilePickerMetadataDto copy(String name, String extension, float sizeInBytes, String uri) {
        return new FilePickerMetadataDto(name, extension, sizeInBytes, uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilePickerMetadataDto)) {
            return false;
        }
        FilePickerMetadataDto filePickerMetadataDto = (FilePickerMetadataDto) other;
        return t.c(this.name, filePickerMetadataDto.name) && t.c(this.extension, filePickerMetadataDto.extension) && Float.compare(this.sizeInBytes, filePickerMetadataDto.sizeInBytes) == 0 && t.c(this.uri, filePickerMetadataDto.uri);
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

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.extension.hashCode()) * 31) + Float.hashCode(this.sizeInBytes)) * 31) + this.uri.hashCode();
    }

    public String toString() {
        return "FilePickerMetadataDto(name=" + this.name + ", extension=" + this.extension + ", sizeInBytes=" + this.sizeInBytes + ", uri=" + this.uri + ')';
    }
}
