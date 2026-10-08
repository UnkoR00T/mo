package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/StatusChangedReasonContainerDto;", "", "cSC", "", "cSD", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCSC", "()Ljava/lang/String;", "getCSD", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatusChangedReasonContainerDto {

    @c("cSC")
    private final String cSC;

    @c("cSD")
    private final String cSD;

    /* JADX WARN: Multi-variable type inference failed */
    public StatusChangedReasonContainerDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StatusChangedReasonContainerDto copy$default(StatusChangedReasonContainerDto statusChangedReasonContainerDto, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = statusChangedReasonContainerDto.cSC;
        }
        if ((i15 & 2) != 0) {
            str2 = statusChangedReasonContainerDto.cSD;
        }
        return statusChangedReasonContainerDto.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCSC() {
        return this.cSC;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCSD() {
        return this.cSD;
    }

    public final StatusChangedReasonContainerDto copy(String cSC, String cSD) {
        return new StatusChangedReasonContainerDto(cSC, cSD);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusChangedReasonContainerDto)) {
            return false;
        }
        StatusChangedReasonContainerDto statusChangedReasonContainerDto = (StatusChangedReasonContainerDto) other;
        return t.c(this.cSC, statusChangedReasonContainerDto.cSC) && t.c(this.cSD, statusChangedReasonContainerDto.cSD);
    }

    public final String getCSC() {
        return this.cSC;
    }

    public final String getCSD() {
        return this.cSD;
    }

    public int hashCode() {
        String str = this.cSC;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cSD;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StatusChangedReasonContainerDto(cSC=" + this.cSC + ", cSD=" + this.cSD + ')';
    }

    public StatusChangedReasonContainerDto(String str, String str2) {
        this.cSC = str;
        this.cSD = str2;
    }

    public /* synthetic */ StatusChangedReasonContainerDto(String str, String str2, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2);
    }
}
