package my;

import fr.k;
import fr.t;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: renamed from: my.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aBq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\u001a\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010!R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b\u001d\u0010(¨\u0006)"}, d2 = {"Lmy/c;", "Lmy/b;", "", "issuer", "subject", "Ljava/util/Date;", "expirationTime", "notBeforeTime", "Lmy/c$a;", "audienceType", "jwtID", "iat", "", "", "claims", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lmy/c$a;Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "h", "c", "Ljava/util/Date;", "()Ljava/util/Date;", "d", "g", "Lmy/c$a;", "()Lmy/c$a;", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JWSPayloadData implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date expirationTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date notBeforeTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a audienceType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String jwtID;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date iat;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> claims;

    /* JADX INFO: renamed from: my.c$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmy/c$a;", "", "b", "a", "Lmy/c$a$a;", "Lmy/c$a$b;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: my.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmy/c$a$a;", "Lmy/c$a;", "", "", "audiences", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Multiple implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> audiences;

            public Multiple(List<String> list) {
                this.audiences = list;
            }

            public final List<String> a() {
                return this.audiences;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Multiple) && t.c(this.audiences, ((Multiple) other).audiences);
            }

            public int hashCode() {
                return this.audiences.hashCode();
            }

            public String toString() {
                return "Multiple(audiences=" + this.audiences + ")";
            }
        }

        /* JADX INFO: renamed from: my.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lmy/c$a$b;", "Lmy/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "audience", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Single implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String audience;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAudience() {
                return this.audience;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Single) && t.c(this.audience, ((Single) other).audience);
            }

            public int hashCode() {
                return this.audience.hashCode();
            }

            public String toString() {
                return "Single(audience=" + this.audience + ")";
            }
        }
    }

    public JWSPayloadData() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAudienceType() {
        return this.audienceType;
    }

    public final Map<String, Object> b() {
        return this.claims;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Date getExpirationTime() {
        return this.expirationTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Date getIat() {
        return this.iat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JWSPayloadData)) {
            return false;
        }
        JWSPayloadData jWSPayloadData = (JWSPayloadData) other;
        return t.c(this.issuer, jWSPayloadData.issuer) && t.c(this.subject, jWSPayloadData.subject) && t.c(this.expirationTime, jWSPayloadData.expirationTime) && t.c(this.notBeforeTime, jWSPayloadData.notBeforeTime) && t.c(this.audienceType, jWSPayloadData.audienceType) && t.c(this.jwtID, jWSPayloadData.jwtID) && t.c(this.iat, jWSPayloadData.iat) && t.c(this.claims, jWSPayloadData.claims);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getJwtID() {
        return this.jwtID;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Date getNotBeforeTime() {
        return this.notBeforeTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        String str = this.issuer;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subject;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.expirationTime;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.notBeforeTime;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        a aVar = this.audienceType;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.jwtID;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Date date3 = this.iat;
        return ((iHashCode6 + (date3 != null ? date3.hashCode() : 0)) * 31) + this.claims.hashCode();
    }

    public String toString() {
        return "JWSPayloadData(issuer=" + this.issuer + ", subject=" + this.subject + ", expirationTime=" + this.expirationTime + ", notBeforeTime=" + this.notBeforeTime + ", audienceType=" + this.audienceType + ", jwtID=" + this.jwtID + ", iat=" + this.iat + ", claims=" + this.claims + ")";
    }

    public JWSPayloadData(String str, String str2, Date date, Date date2, a aVar, String str3, Date date3, Map<String, ? extends Object> map) {
        this.issuer = str;
        this.subject = str2;
        this.expirationTime = date;
        this.notBeforeTime = date2;
        this.audienceType = aVar;
        this.jwtID = str3;
        this.iat = date3;
        this.claims = map;
    }

    public /* synthetic */ JWSPayloadData(String str, String str2, Date date, Date date2, a aVar, String str3, Date date3, Map map, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : date, (i15 & 8) != 0 ? null : date2, (i15 & 16) != 0 ? null : aVar, (i15 & 32) != 0 ? null : str3, (i15 & 64) != 0 ? null : date3, (i15 & 128) != 0 ? v0.i() : map);
    }
}
