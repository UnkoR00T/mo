package i61;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i61.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Li61/k;", "", "Li61/j;", "names", "surname", "birthPlace", "<init>", "(Li61/j;Li61/j;Li61/j;)V", "a", "(Li61/j;Li61/j;Li61/j;)Li61/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li61/j;", "d", "()Li61/j;", "b", "e", "c", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DataSplitData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f89762d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataSplit names;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataSplit surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataSplit birthPlace;

    public DataSplitData(DataSplit dataSplit, DataSplit dataSplit2, DataSplit dataSplit3) {
        this.names = dataSplit;
        this.surname = dataSplit2;
        this.birthPlace = dataSplit3;
    }

    public static /* synthetic */ DataSplitData b(DataSplitData dataSplitData, DataSplit dataSplit, DataSplit dataSplit2, DataSplit dataSplit3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            dataSplit = dataSplitData.names;
        }
        if ((i15 & 2) != 0) {
            dataSplit2 = dataSplitData.surname;
        }
        if ((i15 & 4) != 0) {
            dataSplit3 = dataSplitData.birthPlace;
        }
        return dataSplitData.a(dataSplit, dataSplit2, dataSplit3);
    }

    public final DataSplitData a(DataSplit names, DataSplit surname, DataSplit birthPlace) {
        return new DataSplitData(names, surname, birthPlace);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DataSplit getBirthPlace() {
        return this.birthPlace;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final DataSplit getNames() {
        return this.names;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DataSplit getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSplitData)) {
            return false;
        }
        DataSplitData dataSplitData = (DataSplitData) other;
        return fr.t.c(this.names, dataSplitData.names) && fr.t.c(this.surname, dataSplitData.surname) && fr.t.c(this.birthPlace, dataSplitData.birthPlace);
    }

    public int hashCode() {
        DataSplit dataSplit = this.names;
        int iHashCode = (dataSplit == null ? 0 : dataSplit.hashCode()) * 31;
        DataSplit dataSplit2 = this.surname;
        int iHashCode2 = (iHashCode + (dataSplit2 == null ? 0 : dataSplit2.hashCode())) * 31;
        DataSplit dataSplit3 = this.birthPlace;
        return iHashCode2 + (dataSplit3 != null ? dataSplit3.hashCode() : 0);
    }

    public String toString() {
        return "DataSplitData(names=" + this.names + ", surname=" + this.surname + ", birthPlace=" + this.birthPlace + ')';
    }
}
