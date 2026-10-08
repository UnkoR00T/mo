package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataDto;", "", "dataHeader", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;", "dataContainer", "Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataContainerDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataContainerDto;)V", "getDataHeader", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;", "getDataContainer", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataContainerDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WruLicenceDataDto {

    @c("dataContainer")
    private final WruLicenceDataContainerDto dataContainer;

    @c("dataHeader")
    private final DataHeaderDto dataHeader;

    public WruLicenceDataDto(DataHeaderDto dataHeaderDto, WruLicenceDataContainerDto wruLicenceDataContainerDto) {
        this.dataHeader = dataHeaderDto;
        this.dataContainer = wruLicenceDataContainerDto;
    }

    public static /* synthetic */ WruLicenceDataDto copy$default(WruLicenceDataDto wruLicenceDataDto, DataHeaderDto dataHeaderDto, WruLicenceDataContainerDto wruLicenceDataContainerDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            dataHeaderDto = wruLicenceDataDto.dataHeader;
        }
        if ((i15 & 2) != 0) {
            wruLicenceDataContainerDto = wruLicenceDataDto.dataContainer;
        }
        return wruLicenceDataDto.copy(dataHeaderDto, wruLicenceDataContainerDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataHeaderDto getDataHeader() {
        return this.dataHeader;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WruLicenceDataContainerDto getDataContainer() {
        return this.dataContainer;
    }

    public final WruLicenceDataDto copy(DataHeaderDto dataHeader, WruLicenceDataContainerDto dataContainer) {
        return new WruLicenceDataDto(dataHeader, dataContainer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WruLicenceDataDto)) {
            return false;
        }
        WruLicenceDataDto wruLicenceDataDto = (WruLicenceDataDto) other;
        return t.c(this.dataHeader, wruLicenceDataDto.dataHeader) && t.c(this.dataContainer, wruLicenceDataDto.dataContainer);
    }

    public final WruLicenceDataContainerDto getDataContainer() {
        return this.dataContainer;
    }

    public final DataHeaderDto getDataHeader() {
        return this.dataHeader;
    }

    public int hashCode() {
        return (this.dataHeader.hashCode() * 31) + this.dataContainer.hashCode();
    }

    public String toString() {
        return "WruLicenceDataDto(dataHeader=" + this.dataHeader + ", dataContainer=" + this.dataContainer + ')';
    }
}
