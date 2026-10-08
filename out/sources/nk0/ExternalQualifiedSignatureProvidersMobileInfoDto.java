package nk0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nk0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0007R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lnk0/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "availableFreeSignatures", "", "Lnk0/j;", "b", "Ljava/util/List;", "()Ljava/util/List;", "providers", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalQualifiedSignatureProvidersMobileInfoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("availableFreeSignatures")
    private final int availableFreeSignatures;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("providers")
    private final List<ExternalQualifiedSignatureProviderMobileDto> providers;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAvailableFreeSignatures() {
        return this.availableFreeSignatures;
    }

    public final List<ExternalQualifiedSignatureProviderMobileDto> b() {
        return this.providers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalQualifiedSignatureProvidersMobileInfoDto)) {
            return false;
        }
        ExternalQualifiedSignatureProvidersMobileInfoDto externalQualifiedSignatureProvidersMobileInfoDto = (ExternalQualifiedSignatureProvidersMobileInfoDto) other;
        return this.availableFreeSignatures == externalQualifiedSignatureProvidersMobileInfoDto.availableFreeSignatures && t.c(this.providers, externalQualifiedSignatureProvidersMobileInfoDto.providers);
    }

    public int hashCode() {
        return (Integer.hashCode(this.availableFreeSignatures) * 31) + this.providers.hashCode();
    }

    public String toString() {
        return "ExternalQualifiedSignatureProvidersMobileInfoDto(availableFreeSignatures=" + this.availableFreeSignatures + ", providers=" + this.providers + ')';
    }
}
