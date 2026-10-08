package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/JuniorSchoolCardDto;", "", "container", "Lpl/gov/coi/mobywatel/technical/documents/data/model/JuniorSchoolCardContainerDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/JuniorSchoolCardContainerDto;)V", "getContainer", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/JuniorSchoolCardContainerDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorSchoolCardDto {

    @c("container")
    private final JuniorSchoolCardContainerDto container;

    public JuniorSchoolCardDto(JuniorSchoolCardContainerDto juniorSchoolCardContainerDto) {
        this.container = juniorSchoolCardContainerDto;
    }

    public static /* synthetic */ JuniorSchoolCardDto copy$default(JuniorSchoolCardDto juniorSchoolCardDto, JuniorSchoolCardContainerDto juniorSchoolCardContainerDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            juniorSchoolCardContainerDto = juniorSchoolCardDto.container;
        }
        return juniorSchoolCardDto.copy(juniorSchoolCardContainerDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JuniorSchoolCardContainerDto getContainer() {
        return this.container;
    }

    public final JuniorSchoolCardDto copy(JuniorSchoolCardContainerDto container) {
        return new JuniorSchoolCardDto(container);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JuniorSchoolCardDto) && t.c(this.container, ((JuniorSchoolCardDto) other).container);
    }

    public final JuniorSchoolCardContainerDto getContainer() {
        return this.container;
    }

    public int hashCode() {
        return this.container.hashCode();
    }

    public String toString() {
        return "JuniorSchoolCardDto(container=" + this.container + ')';
    }
}
