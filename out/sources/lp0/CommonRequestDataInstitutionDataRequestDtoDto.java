package lp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Llp0/f;", "", "Llp0/a0;", "data", "Llp0/t;", "header", "Llp0/u;", "identity", "", "signed", "<init>", "(Llp0/a0;Llp0/t;Llp0/u;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llp0/a0;", "getData", "()Llp0/a0;", "b", "Llp0/t;", "getHeader", "()Llp0/t;", "c", "Llp0/u;", "getIdentity", "()Llp0/u;", "d", "Ljava/lang/String;", "getSigned", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommonRequestDataInstitutionDataRequestDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("data")
    private final InstitutionDataRequestDtoDto data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("header")
    private final HeaderDto header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("identity")
    private final IdentityContextDto identity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("signed")
    private final String signed;

    public CommonRequestDataInstitutionDataRequestDtoDto() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequestDataInstitutionDataRequestDtoDto)) {
            return false;
        }
        CommonRequestDataInstitutionDataRequestDtoDto commonRequestDataInstitutionDataRequestDtoDto = (CommonRequestDataInstitutionDataRequestDtoDto) other;
        return fr.t.c(this.data, commonRequestDataInstitutionDataRequestDtoDto.data) && fr.t.c(this.header, commonRequestDataInstitutionDataRequestDtoDto.header) && fr.t.c(this.identity, commonRequestDataInstitutionDataRequestDtoDto.identity) && fr.t.c(this.signed, commonRequestDataInstitutionDataRequestDtoDto.signed);
    }

    public int hashCode() {
        InstitutionDataRequestDtoDto institutionDataRequestDtoDto = this.data;
        int iHashCode = (institutionDataRequestDtoDto == null ? 0 : institutionDataRequestDtoDto.hashCode()) * 31;
        HeaderDto headerDto = this.header;
        int iHashCode2 = (iHashCode + (headerDto == null ? 0 : headerDto.hashCode())) * 31;
        IdentityContextDto identityContextDto = this.identity;
        int iHashCode3 = (iHashCode2 + (identityContextDto == null ? 0 : identityContextDto.hashCode())) * 31;
        String str = this.signed;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CommonRequestDataInstitutionDataRequestDtoDto(data=" + this.data + ", header=" + this.header + ", identity=" + this.identity + ", signed=" + this.signed + ')';
    }

    public CommonRequestDataInstitutionDataRequestDtoDto(InstitutionDataRequestDtoDto institutionDataRequestDtoDto, HeaderDto headerDto, IdentityContextDto identityContextDto, String str) {
        this.data = institutionDataRequestDtoDto;
        this.header = headerDto;
        this.identity = identityContextDto;
        this.signed = str;
    }

    public /* synthetic */ CommonRequestDataInstitutionDataRequestDtoDto(InstitutionDataRequestDtoDto institutionDataRequestDtoDto, HeaderDto headerDto, IdentityContextDto identityContextDto, String str, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : institutionDataRequestDtoDto, (i15 & 2) != 0 ? null : headerDto, (i15 & 4) != 0 ? null : identityContextDto, (i15 & 8) != 0 ? null : str);
    }
}
