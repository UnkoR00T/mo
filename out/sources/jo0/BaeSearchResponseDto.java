package jo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, d2 = {"Ljo0/s;", "", "", "Ljo0/q;", "baeSearchResponses", "", "nextPageId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaeSearchResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("baeSearchResponses")
    private final List<BaeSearchDtoDto> baeSearchResponses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("nextPageId")
    private final String nextPageId;

    /* JADX WARN: Multi-variable type inference failed */
    public BaeSearchResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<BaeSearchDtoDto> a() {
        return this.baeSearchResponses;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaeSearchResponseDto)) {
            return false;
        }
        BaeSearchResponseDto baeSearchResponseDto = (BaeSearchResponseDto) other;
        return fr.t.c(this.baeSearchResponses, baeSearchResponseDto.baeSearchResponses) && fr.t.c(this.nextPageId, baeSearchResponseDto.nextPageId);
    }

    public int hashCode() {
        List<BaeSearchDtoDto> list = this.baeSearchResponses;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextPageId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BaeSearchResponseDto(baeSearchResponses=" + this.baeSearchResponses + ", nextPageId=" + this.nextPageId + ')';
    }

    public BaeSearchResponseDto(List<BaeSearchDtoDto> list, String str) {
        this.baeSearchResponses = list;
        this.nextPageId = str;
    }

    public /* synthetic */ BaeSearchResponseDto(List list, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : str);
    }
}
