package hn0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hn0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lhn0/g;", "", "", "algorithm", "encoded", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAlgorithm", "b", "getEncoded", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PublicKeyDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("algorithm")
    private final String algorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("encoded")
    private final String encoded;

    public PublicKeyDto(String str, String str2) {
        this.algorithm = str;
        this.encoded = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublicKeyDto)) {
            return false;
        }
        PublicKeyDto publicKeyDto = (PublicKeyDto) other;
        return t.c(this.algorithm, publicKeyDto.algorithm) && t.c(this.encoded, publicKeyDto.encoded);
    }

    public int hashCode() {
        return (this.algorithm.hashCode() * 31) + this.encoded.hashCode();
    }

    public String toString() {
        return "PublicKeyDto(algorithm=" + this.algorithm + ", encoded=" + this.encoded + ')';
    }
}
