package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleCardDocumentDataSetsDto;", "", "BASIC", "Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleBasicDocumentDto;", "FULL", "Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleFullDocumentDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleBasicDocumentDto;Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleFullDocumentDto;)V", "getBASIC", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleBasicDocumentDto;", "getFULL", "()Lpl/gov/coi/mobywatel/technical/containers/data/model/VehicleFullDocumentDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCardDocumentDataSetsDto {

    @c("BASIC")
    private final VehicleBasicDocumentDto BASIC;

    @c("FULL")
    private final VehicleFullDocumentDto FULL;

    /* JADX WARN: Multi-variable type inference failed */
    public VehicleCardDocumentDataSetsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VehicleCardDocumentDataSetsDto copy$default(VehicleCardDocumentDataSetsDto vehicleCardDocumentDataSetsDto, VehicleBasicDocumentDto vehicleBasicDocumentDto, VehicleFullDocumentDto vehicleFullDocumentDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            vehicleBasicDocumentDto = vehicleCardDocumentDataSetsDto.BASIC;
        }
        if ((i15 & 2) != 0) {
            vehicleFullDocumentDto = vehicleCardDocumentDataSetsDto.FULL;
        }
        return vehicleCardDocumentDataSetsDto.copy(vehicleBasicDocumentDto, vehicleFullDocumentDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VehicleBasicDocumentDto getBASIC() {
        return this.BASIC;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VehicleFullDocumentDto getFULL() {
        return this.FULL;
    }

    public final VehicleCardDocumentDataSetsDto copy(VehicleBasicDocumentDto BASIC, VehicleFullDocumentDto FULL) {
        return new VehicleCardDocumentDataSetsDto(BASIC, FULL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCardDocumentDataSetsDto)) {
            return false;
        }
        VehicleCardDocumentDataSetsDto vehicleCardDocumentDataSetsDto = (VehicleCardDocumentDataSetsDto) other;
        return t.c(this.BASIC, vehicleCardDocumentDataSetsDto.BASIC) && t.c(this.FULL, vehicleCardDocumentDataSetsDto.FULL);
    }

    public final VehicleBasicDocumentDto getBASIC() {
        return this.BASIC;
    }

    public final VehicleFullDocumentDto getFULL() {
        return this.FULL;
    }

    public int hashCode() {
        VehicleBasicDocumentDto vehicleBasicDocumentDto = this.BASIC;
        int iHashCode = (vehicleBasicDocumentDto == null ? 0 : vehicleBasicDocumentDto.hashCode()) * 31;
        VehicleFullDocumentDto vehicleFullDocumentDto = this.FULL;
        return iHashCode + (vehicleFullDocumentDto != null ? vehicleFullDocumentDto.hashCode() : 0);
    }

    public String toString() {
        return "VehicleCardDocumentDataSetsDto(BASIC=" + this.BASIC + ", FULL=" + this.FULL + ')';
    }

    public VehicleCardDocumentDataSetsDto(VehicleBasicDocumentDto vehicleBasicDocumentDto, VehicleFullDocumentDto vehicleFullDocumentDto) {
        this.BASIC = vehicleBasicDocumentDto;
        this.FULL = vehicleFullDocumentDto;
    }

    public /* synthetic */ VehicleCardDocumentDataSetsDto(VehicleBasicDocumentDto vehicleBasicDocumentDto, VehicleFullDocumentDto vehicleFullDocumentDto, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : vehicleBasicDocumentDto, (i15 & 2) != 0 ? null : vehicleFullDocumentDto);
    }
}
