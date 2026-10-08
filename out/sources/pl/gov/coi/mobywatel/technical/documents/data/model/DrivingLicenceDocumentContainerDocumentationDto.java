package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceDocumentContainerDocumentationDto;", "", "drivingLicenceScope", "Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceScopeDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceScopeDto;)V", "getDrivingLicenceScope", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceScopeDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceDocumentContainerDocumentationDto {

    @c("drivingLicenceScope")
    private final DrivingLicenceScopeDto drivingLicenceScope;

    /* JADX WARN: Multi-variable type inference failed */
    public DrivingLicenceDocumentContainerDocumentationDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DrivingLicenceDocumentContainerDocumentationDto copy$default(DrivingLicenceDocumentContainerDocumentationDto drivingLicenceDocumentContainerDocumentationDto, DrivingLicenceScopeDto drivingLicenceScopeDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            drivingLicenceScopeDto = drivingLicenceDocumentContainerDocumentationDto.drivingLicenceScope;
        }
        return drivingLicenceDocumentContainerDocumentationDto.copy(drivingLicenceScopeDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DrivingLicenceScopeDto getDrivingLicenceScope() {
        return this.drivingLicenceScope;
    }

    public final DrivingLicenceDocumentContainerDocumentationDto copy(DrivingLicenceScopeDto drivingLicenceScope) {
        return new DrivingLicenceDocumentContainerDocumentationDto(drivingLicenceScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DrivingLicenceDocumentContainerDocumentationDto) && t.c(this.drivingLicenceScope, ((DrivingLicenceDocumentContainerDocumentationDto) other).drivingLicenceScope);
    }

    public final DrivingLicenceScopeDto getDrivingLicenceScope() {
        return this.drivingLicenceScope;
    }

    public int hashCode() {
        DrivingLicenceScopeDto drivingLicenceScopeDto = this.drivingLicenceScope;
        if (drivingLicenceScopeDto == null) {
            return 0;
        }
        return drivingLicenceScopeDto.hashCode();
    }

    public String toString() {
        return "DrivingLicenceDocumentContainerDocumentationDto(drivingLicenceScope=" + this.drivingLicenceScope + ')';
    }

    public DrivingLicenceDocumentContainerDocumentationDto(DrivingLicenceScopeDto drivingLicenceScopeDto) {
        this.drivingLicenceScope = drivingLicenceScopeDto;
    }

    public /* synthetic */ DrivingLicenceDocumentContainerDocumentationDto(DrivingLicenceScopeDto drivingLicenceScopeDto, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : drivingLicenceScopeDto);
    }
}
