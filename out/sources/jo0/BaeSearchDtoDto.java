package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.q, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljo0/q;", "", "Ljo0/p;", "baeSearchData", "Ljo0/n1;", "recipientEda", "<init>", "(Ljo0/p;Ljo0/n1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljo0/p;", "()Ljo0/p;", "b", "Ljo0/n1;", "()Ljo0/n1;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaeSearchDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("baeSearchData")
    private final BaeSearchDataDtoDto baeSearchData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("recipientEda")
    private final RecipientEdaDtoDto recipientEda;

    /* JADX WARN: Multi-variable type inference failed */
    public BaeSearchDtoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BaeSearchDataDtoDto getBaeSearchData() {
        return this.baeSearchData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RecipientEdaDtoDto getRecipientEda() {
        return this.recipientEda;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaeSearchDtoDto)) {
            return false;
        }
        BaeSearchDtoDto baeSearchDtoDto = (BaeSearchDtoDto) other;
        return fr.t.c(this.baeSearchData, baeSearchDtoDto.baeSearchData) && fr.t.c(this.recipientEda, baeSearchDtoDto.recipientEda);
    }

    public int hashCode() {
        BaeSearchDataDtoDto baeSearchDataDtoDto = this.baeSearchData;
        int iHashCode = (baeSearchDataDtoDto == null ? 0 : baeSearchDataDtoDto.hashCode()) * 31;
        RecipientEdaDtoDto recipientEdaDtoDto = this.recipientEda;
        return iHashCode + (recipientEdaDtoDto != null ? recipientEdaDtoDto.hashCode() : 0);
    }

    public String toString() {
        return "BaeSearchDtoDto(baeSearchData=" + this.baeSearchData + ", recipientEda=" + this.recipientEda + ')';
    }

    public BaeSearchDtoDto(BaeSearchDataDtoDto baeSearchDataDtoDto, RecipientEdaDtoDto recipientEdaDtoDto) {
        this.baeSearchData = baeSearchDataDtoDto;
        this.recipientEda = recipientEdaDtoDto;
    }

    public /* synthetic */ BaeSearchDtoDto(BaeSearchDataDtoDto baeSearchDataDtoDto, RecipientEdaDtoDto recipientEdaDtoDto, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : baeSearchDataDtoDto, (i15 & 2) != 0 ? null : recipientEdaDtoDto);
    }
}
