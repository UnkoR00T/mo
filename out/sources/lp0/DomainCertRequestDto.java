package lp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Llp0/n;", "", "", "", "domain", "", "signed", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getDomain", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "getSigned", "()Ljava/lang/Boolean;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DomainCertRequestDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("domain")
    private final List<String> domain;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("signed")
    private final Boolean signed;

    /* JADX WARN: Multi-variable type inference failed */
    public DomainCertRequestDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainCertRequestDto)) {
            return false;
        }
        DomainCertRequestDto domainCertRequestDto = (DomainCertRequestDto) other;
        return fr.t.c(this.domain, domainCertRequestDto.domain) && fr.t.c(this.signed, domainCertRequestDto.signed);
    }

    public int hashCode() {
        List<String> list = this.domain;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.signed;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "DomainCertRequestDto(domain=" + this.domain + ", signed=" + this.signed + ')';
    }

    public DomainCertRequestDto(List<String> list, Boolean bool) {
        this.domain = list;
        this.signed = bool;
    }

    public /* synthetic */ DomainCertRequestDto(List list, Boolean bool, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : bool);
    }
}
