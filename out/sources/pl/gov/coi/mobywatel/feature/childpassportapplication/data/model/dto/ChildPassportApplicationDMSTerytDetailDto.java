package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDMSTerytDetailDto;", "", "id", "", "name", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationDMSTerytDetailDto {
    public static final int $stable = 0;

    @c("description")
    private final String description;

    @c("id")
    private final String id;

    @c("name")
    private final String name;

    public ChildPassportApplicationDMSTerytDetailDto(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.description = str3;
    }

    public static /* synthetic */ ChildPassportApplicationDMSTerytDetailDto copy$default(ChildPassportApplicationDMSTerytDetailDto childPassportApplicationDMSTerytDetailDto, String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = childPassportApplicationDMSTerytDetailDto.id;
        }
        if ((i15 & 2) != 0) {
            str2 = childPassportApplicationDMSTerytDetailDto.name;
        }
        if ((i15 & 4) != 0) {
            str3 = childPassportApplicationDMSTerytDetailDto.description;
        }
        return childPassportApplicationDMSTerytDetailDto.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ChildPassportApplicationDMSTerytDetailDto copy(String id5, String name, String description) {
        return new ChildPassportApplicationDMSTerytDetailDto(id5, name, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationDMSTerytDetailDto)) {
            return false;
        }
        ChildPassportApplicationDMSTerytDetailDto childPassportApplicationDMSTerytDetailDto = (ChildPassportApplicationDMSTerytDetailDto) other;
        return t.c(this.id, childPassportApplicationDMSTerytDetailDto.id) && t.c(this.name, childPassportApplicationDMSTerytDetailDto.name) && t.c(this.description, childPassportApplicationDMSTerytDetailDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChildPassportApplicationDMSTerytDetailDto(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ')';
    }
}
