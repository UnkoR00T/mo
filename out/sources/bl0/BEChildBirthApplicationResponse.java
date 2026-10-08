package bl0;

import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"Lbl0/a;", "", "", "Lbl0/a$a;", "results", "", "institutionName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthApplicationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEXmlResult> results;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: bl0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lbl0/a$a;", "", "Lbl0/t;", "status", "Liy/b0;", "xmlId", "<init>", "(Lbl0/t;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbl0/t;", "()Lbl0/t;", "b", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BEXmlResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t status;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 xmlId;

        public BEXmlResult(t tVar, b0 b0Var) {
            this.status = tVar;
            this.xmlId = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getXmlId() {
            return this.xmlId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BEXmlResult)) {
                return false;
            }
            BEXmlResult bEXmlResult = (BEXmlResult) other;
            return this.status == bEXmlResult.status && fr.t.c(this.xmlId, bEXmlResult.xmlId);
        }

        public int hashCode() {
            return (this.status.hashCode() * 31) + this.xmlId.hashCode();
        }

        public String toString() {
            return "BEXmlResult(status=" + this.status + ", xmlId=" + this.xmlId + ")";
        }
    }

    public BEChildBirthApplicationResponse(List<BEXmlResult> list, String str) {
        this.results = list;
        this.institutionName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final List<BEXmlResult> b() {
        return this.results;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthApplicationResponse)) {
            return false;
        }
        BEChildBirthApplicationResponse bEChildBirthApplicationResponse = (BEChildBirthApplicationResponse) other;
        return fr.t.c(this.results, bEChildBirthApplicationResponse.results) && fr.t.c(this.institutionName, bEChildBirthApplicationResponse.institutionName);
    }

    public int hashCode() {
        int iHashCode = this.results.hashCode() * 31;
        String str = this.institutionName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BEChildBirthApplicationResponse(results=" + this.results + ", institutionName=" + this.institutionName + ")";
    }
}
