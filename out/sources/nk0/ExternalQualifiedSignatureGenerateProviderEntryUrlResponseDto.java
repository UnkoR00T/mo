package nk0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nk0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lnk0/i;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "providerEntryUrl", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("providerEntryUrl")
    private final String providerEntryUrl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getProviderEntryUrl() {
        return this.providerEntryUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto) && t.c(this.providerEntryUrl, ((ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto) other).providerEntryUrl);
    }

    public int hashCode() {
        return this.providerEntryUrl.hashCode();
    }

    public String toString() {
        return "ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto(providerEntryUrl=" + this.providerEntryUrl + ')';
    }
}
