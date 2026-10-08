package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/CategoryContainerDto;", "", "cN", "", "fRD", "Ljava/time/LocalDate;", "eD", "resC", "", "cS", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;Ljava/lang/String;)V", "getCN", "()Ljava/lang/String;", "getFRD", "()Ljava/time/LocalDate;", "getED", "getResC", "()Ljava/util/List;", "getCS", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryContainerDto {

    @c("cN")
    private final String cN;

    @c("cS")
    private final String cS;

    @c("eD")
    private final LocalDate eD;

    @c("fRD")
    private final LocalDate fRD;

    @c("resC")
    private final List<String> resC;

    public CategoryContainerDto() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryContainerDto copy$default(CategoryContainerDto categoryContainerDto, String str, LocalDate localDate, LocalDate localDate2, List list, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = categoryContainerDto.cN;
        }
        if ((i15 & 2) != 0) {
            localDate = categoryContainerDto.fRD;
        }
        if ((i15 & 4) != 0) {
            localDate2 = categoryContainerDto.eD;
        }
        if ((i15 & 8) != 0) {
            list = categoryContainerDto.resC;
        }
        if ((i15 & 16) != 0) {
            str2 = categoryContainerDto.cS;
        }
        String str3 = str2;
        LocalDate localDate3 = localDate2;
        return categoryContainerDto.copy(str, localDate, localDate3, list, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCN() {
        return this.cN;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDate getFRD() {
        return this.fRD;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LocalDate getED() {
        return this.eD;
    }

    public final List<String> component4() {
        return this.resC;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCS() {
        return this.cS;
    }

    public final CategoryContainerDto copy(String cN, LocalDate fRD, LocalDate eD, List<String> resC, String cS) {
        return new CategoryContainerDto(cN, fRD, eD, resC, cS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryContainerDto)) {
            return false;
        }
        CategoryContainerDto categoryContainerDto = (CategoryContainerDto) other;
        return t.c(this.cN, categoryContainerDto.cN) && t.c(this.fRD, categoryContainerDto.fRD) && t.c(this.eD, categoryContainerDto.eD) && t.c(this.resC, categoryContainerDto.resC) && t.c(this.cS, categoryContainerDto.cS);
    }

    public final String getCN() {
        return this.cN;
    }

    public final String getCS() {
        return this.cS;
    }

    public final LocalDate getED() {
        return this.eD;
    }

    public final LocalDate getFRD() {
        return this.fRD;
    }

    public final List<String> getResC() {
        return this.resC;
    }

    public int hashCode() {
        String str = this.cN;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalDate localDate = this.fRD;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.eD;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List<String> list = this.resC;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.cS;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CategoryContainerDto(cN=" + this.cN + ", fRD=" + this.fRD + ", eD=" + this.eD + ", resC=" + this.resC + ", cS=" + this.cS + ')';
    }

    public CategoryContainerDto(String str, LocalDate localDate, LocalDate localDate2, List<String> list, String str2) {
        this.cN = str;
        this.fRD = localDate;
        this.eD = localDate2;
        this.resC = list;
        this.cS = str2;
    }

    public /* synthetic */ CategoryContainerDto(String str, LocalDate localDate, LocalDate localDate2, List list, String str2, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : localDate, (i15 & 4) != 0 ? null : localDate2, (i15 & 8) != 0 ? null : list, (i15 & 16) != 0 ? null : str2);
    }
}
