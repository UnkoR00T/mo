package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardDataDto;", "", "dataContainer", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardContainerDto;", "dataHeader", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardContainerDto;Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;)V", "getDataContainer", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/DeputyCardContainerDto;", "getDataHeader", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeputyCardDataDto {

    @c("dc")
    private final DeputyCardContainerDto dataContainer;

    @c("dh")
    private final DataHeaderDto dataHeader;

    public DeputyCardDataDto(DeputyCardContainerDto deputyCardContainerDto, DataHeaderDto dataHeaderDto) {
        this.dataContainer = deputyCardContainerDto;
        this.dataHeader = dataHeaderDto;
    }

    public static /* synthetic */ DeputyCardDataDto copy$default(DeputyCardDataDto deputyCardDataDto, DeputyCardContainerDto deputyCardContainerDto, DataHeaderDto dataHeaderDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            deputyCardContainerDto = deputyCardDataDto.dataContainer;
        }
        if ((i15 & 2) != 0) {
            dataHeaderDto = deputyCardDataDto.dataHeader;
        }
        return deputyCardDataDto.copy(deputyCardContainerDto, dataHeaderDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeputyCardContainerDto getDataContainer() {
        return this.dataContainer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DataHeaderDto getDataHeader() {
        return this.dataHeader;
    }

    public final DeputyCardDataDto copy(DeputyCardContainerDto dataContainer, DataHeaderDto dataHeader) {
        return new DeputyCardDataDto(dataContainer, dataHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeputyCardDataDto)) {
            return false;
        }
        DeputyCardDataDto deputyCardDataDto = (DeputyCardDataDto) other;
        return t.c(this.dataContainer, deputyCardDataDto.dataContainer) && t.c(this.dataHeader, deputyCardDataDto.dataHeader);
    }

    public final DeputyCardContainerDto getDataContainer() {
        return this.dataContainer;
    }

    public final DataHeaderDto getDataHeader() {
        return this.dataHeader;
    }

    public int hashCode() {
        return (this.dataContainer.hashCode() * 31) + this.dataHeader.hashCode();
    }

    public String toString() {
        return "DeputyCardDataDto(dataContainer=" + this.dataContainer + ", dataHeader=" + this.dataHeader + ')';
    }
}
