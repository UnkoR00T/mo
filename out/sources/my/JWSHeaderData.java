package my;

import fr.k;
import fr.t;
import iy.h;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import ry.n;

/* JADX INFO: renamed from: my.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Lmy/a;", "Lmy/b;", "Lry/n;", "algorithm", "", "type", "", "certificates", "Lmy/a$a;", "jwkType", "<init>", "(Lry/n;Ljava/lang/String;Ljava/util/List;Lmy/a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lry/n;", "()Lry/n;", "b", "Ljava/lang/String;", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lmy/a$a;", "()Lmy/a$a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JWSHeaderData implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final n algorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> certificates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC3214a jwkType;

    /* JADX INFO: renamed from: my.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lmy/a$a;", "", "d", "b", "c", "a", "Lmy/a$a$a;", "Lmy/a$a$b;", "Lmy/a$a$c;", "Lmy/a$a$d;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC3214a {

        /* JADX INFO: renamed from: my.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lmy/a$a$a;", "Lmy/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "attestation", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Attestation implements InterfaceC3214a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String attestation;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAttestation() {
                return this.attestation;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Attestation) && t.c(this.attestation, ((Attestation) other).attestation);
            }

            public int hashCode() {
                return this.attestation.hashCode();
            }

            public String toString() {
                return "Attestation(attestation=" + this.attestation + ")";
            }
        }

        /* JADX INFO: renamed from: my.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmy/a$a$b;", "Lmy/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/security/cert/X509Certificate;", "a", "Ljava/security/cert/X509Certificate;", "b", "()Ljava/security/cert/X509Certificate;", "cert", "Liy/h;", "Liy/h;", "()Liy/h;", "algorithm", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Certificate implements InterfaceC3214a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final X509Certificate cert;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final h algorithm;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final h getAlgorithm() {
                return this.algorithm;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final X509Certificate getCert() {
                return this.cert;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Certificate)) {
                    return false;
                }
                Certificate certificate = (Certificate) other;
                return t.c(this.cert, certificate.cert) && t.c(this.algorithm, certificate.algorithm);
            }

            public int hashCode() {
                int iHashCode = this.cert.hashCode() * 31;
                h hVar = this.algorithm;
                return iHashCode + (hVar == null ? 0 : hVar.hashCode());
            }

            public String toString() {
                return "Certificate(cert=" + this.cert + ", algorithm=" + this.algorithm + ")";
            }
        }

        /* JADX INFO: renamed from: my.a$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lmy/a$a$c;", "Lmy/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "json", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Json implements InterfaceC3214a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String json;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getJson() {
                return this.json;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Json) && t.c(this.json, ((Json) other).json);
            }

            public int hashCode() {
                return this.json.hashCode();
            }

            public String toString() {
                return "Json(json=" + this.json + ")";
            }
        }

        /* JADX INFO: renamed from: my.a$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmy/a$a$d;", "Lmy/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "data", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MapStructure implements InterfaceC3214a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map<String, Object> data;

            public final Map<String, Object> a() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MapStructure) && t.c(this.data, ((MapStructure) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "MapStructure(data=" + this.data + ")";
            }
        }
    }

    public JWSHeaderData(n nVar, String str, List<String> list, InterfaceC3214a interfaceC3214a) {
        this.algorithm = nVar;
        this.type = str;
        this.certificates = list;
        this.jwkType = interfaceC3214a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAlgorithm() {
        return this.algorithm;
    }

    public final List<String> b() {
        return this.certificates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC3214a getJwkType() {
        return this.jwkType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JWSHeaderData)) {
            return false;
        }
        JWSHeaderData jWSHeaderData = (JWSHeaderData) other;
        return t.c(this.algorithm, jWSHeaderData.algorithm) && t.c(this.type, jWSHeaderData.type) && t.c(this.certificates, jWSHeaderData.certificates) && t.c(this.jwkType, jWSHeaderData.jwkType);
    }

    public int hashCode() {
        int iHashCode = this.algorithm.hashCode() * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.certificates;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        InterfaceC3214a interfaceC3214a = this.jwkType;
        return iHashCode3 + (interfaceC3214a != null ? interfaceC3214a.hashCode() : 0);
    }

    public String toString() {
        return "JWSHeaderData(algorithm=" + this.algorithm + ", type=" + this.type + ", certificates=" + this.certificates + ", jwkType=" + this.jwkType + ")";
    }

    public /* synthetic */ JWSHeaderData(n nVar, String str, List list, InterfaceC3214a interfaceC3214a, int i15, k kVar) {
        this(nVar, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : list, (i15 & 8) != 0 ? null : interfaceC3214a);
    }
}
