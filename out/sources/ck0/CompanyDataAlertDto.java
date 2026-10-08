package ck0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.m0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lck0/m0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "message", "Lck0/n0;", "Lck0/n0;", "c", "()Lck0/n0;", "type", "Lck0/f1;", "Lck0/f1;", "()Lck0/f1;", "link", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyDataAlertDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("message")
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final n0 type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("link")
    private final LinkDto link;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LinkDto getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n0 getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyDataAlertDto)) {
            return false;
        }
        CompanyDataAlertDto companyDataAlertDto = (CompanyDataAlertDto) other;
        return fr.t.c(this.message, companyDataAlertDto.message) && this.type == companyDataAlertDto.type && fr.t.c(this.link, companyDataAlertDto.link);
    }

    public int hashCode() {
        int iHashCode = ((this.message.hashCode() * 31) + this.type.hashCode()) * 31;
        LinkDto linkDto = this.link;
        return iHashCode + (linkDto == null ? 0 : linkDto.hashCode());
    }

    public String toString() {
        return "CompanyDataAlertDto(message=" + this.message + ", type=" + this.type + ", link=" + this.link + ')';
    }
}
