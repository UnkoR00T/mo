package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleCardDataDto;", "", "dataHeader", "Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderVehicleDto;", "owner", "Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerDto;", "documentSets", "Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleCardDocumentDataSetsDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderVehicleDto;Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerDto;Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleCardDocumentDataSetsDto;)V", "getDataHeader", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderVehicleDto;", "getOwner", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/OwnerDto;", "getDocumentSets", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleCardDocumentDataSetsDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCardDataDto {

    @c("dataHeader")
    private final DataHeaderVehicleDto dataHeader;

    @c("documentSets")
    private final VehicleCardDocumentDataSetsDto documentSets;

    @c("owner")
    private final OwnerDto owner;

    public VehicleCardDataDto(DataHeaderVehicleDto dataHeaderVehicleDto, OwnerDto ownerDto, VehicleCardDocumentDataSetsDto vehicleCardDocumentDataSetsDto) {
        this.dataHeader = dataHeaderVehicleDto;
        this.owner = ownerDto;
        this.documentSets = vehicleCardDocumentDataSetsDto;
    }

    public static /* synthetic */ VehicleCardDataDto copy$default(VehicleCardDataDto vehicleCardDataDto, DataHeaderVehicleDto dataHeaderVehicleDto, OwnerDto ownerDto, VehicleCardDocumentDataSetsDto vehicleCardDocumentDataSetsDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            dataHeaderVehicleDto = vehicleCardDataDto.dataHeader;
        }
        if ((i15 & 2) != 0) {
            ownerDto = vehicleCardDataDto.owner;
        }
        if ((i15 & 4) != 0) {
            vehicleCardDocumentDataSetsDto = vehicleCardDataDto.documentSets;
        }
        return vehicleCardDataDto.copy(dataHeaderVehicleDto, ownerDto, vehicleCardDocumentDataSetsDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DataHeaderVehicleDto getDataHeader() {
        return this.dataHeader;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OwnerDto getOwner() {
        return this.owner;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VehicleCardDocumentDataSetsDto getDocumentSets() {
        return this.documentSets;
    }

    public final VehicleCardDataDto copy(DataHeaderVehicleDto dataHeader, OwnerDto owner, VehicleCardDocumentDataSetsDto documentSets) {
        return new VehicleCardDataDto(dataHeader, owner, documentSets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCardDataDto)) {
            return false;
        }
        VehicleCardDataDto vehicleCardDataDto = (VehicleCardDataDto) other;
        return t.c(this.dataHeader, vehicleCardDataDto.dataHeader) && t.c(this.owner, vehicleCardDataDto.owner) && t.c(this.documentSets, vehicleCardDataDto.documentSets);
    }

    public final DataHeaderVehicleDto getDataHeader() {
        return this.dataHeader;
    }

    public final VehicleCardDocumentDataSetsDto getDocumentSets() {
        return this.documentSets;
    }

    public final OwnerDto getOwner() {
        return this.owner;
    }

    public int hashCode() {
        return (((this.dataHeader.hashCode() * 31) + this.owner.hashCode()) * 31) + this.documentSets.hashCode();
    }

    public String toString() {
        return "VehicleCardDataDto(dataHeader=" + this.dataHeader + ", owner=" + this.owner + ", documentSets=" + this.documentSets + ')';
    }
}
