package w24;

import java.util.Map;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lw24/g;", "", "Lw24/g$a;", "Lw24/g$b;", "a", "b", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends gz.b {

    /* JADX INFO: renamed from: w24.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lw24/g$a;", "Lgz/b$a;", "", "scopesData", "Lry/c;", "certificateKeyPair", "<init>", "(Ljava/lang/String;Lry/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lry/c;", "()Lry/c;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scopesData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certificateKeyPair;

        public Params(String str, CertKeyPair certKeyPair) {
            this.scopesData = str;
            this.certificateKeyPair = certKeyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertificateKeyPair() {
            return this.certificateKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScopesData() {
            return this.scopesData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.scopesData, params.scopesData) && fr.t.c(this.certificateKeyPair, params.certificateKeyPair);
        }

        public int hashCode() {
            return (this.scopesData.hashCode() * 31) + this.certificateKeyPair.hashCode();
        }

        public String toString() {
            return "Params(scopesData=" + this.scopesData + ", certificateKeyPair=" + this.certificateKeyPair + ')';
        }
    }

    /* JADX INFO: renamed from: w24.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw24/g$b;", "", "", "", "Lorg/bouncycastle/cms/CMSSignedData;", "mapOfScopes", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, CMSSignedData> mapOfScopes;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(Map<String, ? extends CMSSignedData> map) {
            this.mapOfScopes = map;
        }

        public final Map<String, CMSSignedData> a() {
            return this.mapOfScopes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && fr.t.c(this.mapOfScopes, ((Result) other).mapOfScopes);
        }

        public int hashCode() {
            return this.mapOfScopes.hashCode();
        }

        public String toString() {
            return "Result(mapOfScopes=" + this.mapOfScopes + ')';
        }
    }
}
