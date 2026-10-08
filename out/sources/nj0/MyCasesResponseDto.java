package nj0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.e0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"Lnj0/e0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "last", "", "Lnj0/d0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "myCases", "c", "Ljava/lang/String;", "nextPageId", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MyCasesResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("last")
    private final boolean last;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("myCases")
    private final List<MyCaseDataDto> myCases;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextPageId")
    private final String nextPageId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getLast() {
        return this.last;
    }

    public final List<MyCaseDataDto> b() {
        return this.myCases;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyCasesResponseDto)) {
            return false;
        }
        MyCasesResponseDto myCasesResponseDto = (MyCasesResponseDto) other;
        return this.last == myCasesResponseDto.last && fr.t.c(this.myCases, myCasesResponseDto.myCases) && fr.t.c(this.nextPageId, myCasesResponseDto.nextPageId);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.last) * 31) + this.myCases.hashCode()) * 31;
        String str = this.nextPageId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MyCasesResponseDto(last=" + this.last + ", myCases=" + this.myCases + ", nextPageId=" + this.nextPageId + ')';
    }
}
