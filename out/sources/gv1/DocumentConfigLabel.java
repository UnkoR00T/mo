package gv1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gv1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"Lgv1/f;", "", "Lgv1/h;", "language", "", "value", "<init>", "(Lgv1/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgv1/h;", "getLanguage", "()Lgv1/h;", "b", "Ljava/lang/String;", "getValue", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentConfigLabel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    public DocumentConfigLabel(h hVar, String str) {
        this.language = hVar;
        this.value = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentConfigLabel)) {
            return false;
        }
        DocumentConfigLabel documentConfigLabel = (DocumentConfigLabel) other;
        return this.language == documentConfigLabel.language && fr.t.c(this.value, documentConfigLabel.value);
    }

    public int hashCode() {
        h hVar = this.language;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        String str = this.value;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DocumentConfigLabel(language=" + this.language + ", value=" + this.value + ")";
    }
}
