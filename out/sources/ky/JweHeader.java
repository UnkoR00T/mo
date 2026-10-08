package ky;

import fr.k;
import fr.t;
import java.util.Map;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ky.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u000eR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lky/b;", "", "", "alg", "enc", "apv", "apu", "kid", CMSAttributeTableGenerator.CONTENT_TYPE, "", "ephemeralPublicKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "f", "g", "Ljava/util/Map;", "getEphemeralPublicKey", "()Ljava/util/Map;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JweHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String alg;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String enc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apv;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apu;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String kid;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contentType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> ephemeralPublicKey;

    public JweHeader(String str, String str2, String str3, String str4, String str5, String str6, Map<String, ? extends Object> map) {
        this.alg = str;
        this.enc = str2;
        this.apv = str3;
        this.apu = str4;
        this.kid = str5;
        this.contentType = str6;
        this.ephemeralPublicKey = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlg() {
        return this.alg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApu() {
        return this.apu;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getApv() {
        return this.apv;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEnc() {
        return this.enc;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JweHeader)) {
            return false;
        }
        JweHeader jweHeader = (JweHeader) other;
        return t.c(this.alg, jweHeader.alg) && t.c(this.enc, jweHeader.enc) && t.c(this.apv, jweHeader.apv) && t.c(this.apu, jweHeader.apu) && t.c(this.kid, jweHeader.kid) && t.c(this.contentType, jweHeader.contentType) && t.c(this.ephemeralPublicKey, jweHeader.ephemeralPublicKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    public int hashCode() {
        String str = this.alg;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.enc.hashCode()) * 31;
        String str2 = this.apv;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.apu;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.kid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contentType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, Object> map = this.ephemeralPublicKey;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "JweHeader(alg=" + this.alg + ", enc=" + this.enc + ", apv=" + this.apv + ", apu=" + this.apu + ", kid=" + this.kid + ", contentType=" + this.contentType + ", ephemeralPublicKey=" + this.ephemeralPublicKey + ")";
    }

    public /* synthetic */ JweHeader(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i15, k kVar) {
        this(str, str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5, (i15 & 32) != 0 ? null : str6, (i15 & 64) != 0 ? null : map);
    }
}
