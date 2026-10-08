package hm2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhm2/j;", "Lgz/b;", "Lhm2/j$a;", "", "Lu04/a;", "commonEndpoints", "<init>", "(Lu04/a;)V", "params", "d", "(Lhm2/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lu04/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements gz.b<Params, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: hm2.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhm2/j$a;", "Lgz/b$a;", "", "privacyPolicyPdfUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String privacyPolicyPdfUrl;

        public Params(String str) {
            this.privacyPolicyPdfUrl = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPrivacyPolicyPdfUrl() {
            return this.privacyPolicyPdfUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.privacyPolicyPdfUrl, ((Params) other).privacyPolicyPdfUrl);
        }

        public int hashCode() {
            return this.privacyPolicyPdfUrl.hashCode();
        }

        public String toString() {
            return "Params(privacyPolicyPdfUrl=" + this.privacyPolicyPdfUrl + ')';
        }
    }

    public j(u04.a aVar) {
        this.commonEndpoints = aVar;
    }

    public Object d(Params params, tq.e<? super String> eVar) {
        return this.commonEndpoints.z() + params.getPrivacyPolicyPdfUrl();
    }
}
