package o24;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u001f"}, d2 = {"Lo24/c;", "", "", "cN", "Ljava/time/LocalDate;", "fRD", "eD", "", "resC", "cS", "<init>", "(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CategoryContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cN")
    private final String cN;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fRD")
    private final LocalDate fRD;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("eD")
    private final LocalDate eD;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("resC")
    private final List<String> resC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cS")
    private final String cS;

    public CategoryContainer() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCN() {
        return this.cN;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCS() {
        return this.cS;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getED() {
        return this.eD;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getFRD() {
        return this.fRD;
    }

    public final List<String> e() {
        return this.resC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryContainer)) {
            return false;
        }
        CategoryContainer categoryContainer = (CategoryContainer) other;
        return fr.t.c(this.cN, categoryContainer.cN) && fr.t.c(this.fRD, categoryContainer.fRD) && fr.t.c(this.eD, categoryContainer.eD) && fr.t.c(this.resC, categoryContainer.resC) && fr.t.c(this.cS, categoryContainer.cS);
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
        return "CategoryContainer(cN=" + this.cN + ", fRD=" + this.fRD + ", eD=" + this.eD + ", resC=" + this.resC + ", cS=" + this.cS + ')';
    }

    public CategoryContainer(String str, LocalDate localDate, LocalDate localDate2, List<String> list, String str2) {
        this.cN = str;
        this.fRD = localDate;
        this.eD = localDate2;
        this.resC = list;
        this.cS = str2;
    }

    public /* synthetic */ CategoryContainer(String str, LocalDate localDate, LocalDate localDate2, List list, String str2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : localDate, (i15 & 4) != 0 ? null : localDate2, (i15 & 8) != 0 ? null : list, (i15 & 16) != 0 ? null : str2);
    }
}
