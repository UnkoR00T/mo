package k73;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k73.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk73/d;", "", "Lk73/a;", "document", "Lk73/f;", "scope", "<init>", "(Lk73/a;Lk73/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk73/a;", "()Lk73/a;", "b", "Lk73/f;", "()Lk73/f;", "studentcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final StudentCardScope scope;

    public StudentCardData(Document document, StudentCardScope studentCardScope) {
        this.document = document;
        this.scope = studentCardScope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final StudentCardScope getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StudentCardData)) {
            return false;
        }
        StudentCardData studentCardData = (StudentCardData) other;
        return t.c(this.document, studentCardData.document) && t.c(this.scope, studentCardData.scope);
    }

    public int hashCode() {
        Document document = this.document;
        return ((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode();
    }

    public String toString() {
        return "StudentCardData(document=" + this.document + ", scope=" + this.scope + ')';
    }
}
