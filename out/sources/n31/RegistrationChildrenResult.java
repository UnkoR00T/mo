package n31;

import bl0.BEGeneratedXmlChildBirth;
import bl0.t;
import java.util.List;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n31.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u001b\u0010\u001b\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ln31/b;", "", "", "Ln31/b$a;", "results", "", "institutionName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "Loq/k;", "d", "()Z", "isAllSuccess", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegistrationChildrenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Child> results;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k isAllSuccess = l.a(new er.a() { // from class: n31.a
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(RegistrationChildrenResult.e(this.f131142a));
        }
    });

    /* JADX INFO: renamed from: n31.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln31/b$a;", "", "Lbl0/t;", "status", "Lbl0/u;", "xml", "<init>", "(Lbl0/t;Lbl0/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbl0/t;", "()Lbl0/t;", "b", "Lbl0/u;", "()Lbl0/u;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Child {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t status;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEGeneratedXmlChildBirth xml;

        public Child(t tVar, BEGeneratedXmlChildBirth bEGeneratedXmlChildBirth) {
            this.status = tVar;
            this.xml = bEGeneratedXmlChildBirth;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEGeneratedXmlChildBirth getXml() {
            return this.xml;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Child)) {
                return false;
            }
            Child child = (Child) other;
            return this.status == child.status && fr.t.c(this.xml, child.xml);
        }

        public int hashCode() {
            return (this.status.hashCode() * 31) + this.xml.hashCode();
        }

        public String toString() {
            return "Child(status=" + this.status + ", xml=" + this.xml + ')';
        }
    }

    public RegistrationChildrenResult(List<Child> list, String str) {
        this.results = list;
        this.institutionName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
    public static final boolean e(RegistrationChildrenResult registrationChildrenResult) {
        for (Object obj : registrationChildrenResult.results) {
            if (((Child) obj).getStatus() == t.Error) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final List<Child> c() {
        return this.results;
    }

    public final boolean d() {
        return ((Boolean) this.isAllSuccess.getValue()).booleanValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationChildrenResult)) {
            return false;
        }
        RegistrationChildrenResult registrationChildrenResult = (RegistrationChildrenResult) other;
        return fr.t.c(this.results, registrationChildrenResult.results) && fr.t.c(this.institutionName, registrationChildrenResult.institutionName);
    }

    public int hashCode() {
        int iHashCode = this.results.hashCode() * 31;
        String str = this.institutionName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RegistrationChildrenResult(results=" + this.results + ", institutionName=" + this.institutionName + ')';
    }
}
