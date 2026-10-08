package sy2;

import o20.s2;
import p071kotlin.Metadata;
import qy2.NipipCardData;

/* JADX INFO: renamed from: sy2.l, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lsy2/l;", "", "Lqy2/e;", "data", "Lo20/s2;", "documentVMS", "<init>", "(Lqy2/e;Lo20/s2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqy2/e;", "()Lqy2/e;", "b", "Lo20/s2;", "()Lo20/s2;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentStateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final NipipCardData data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s2 documentVMS;

    public DocumentStateData(NipipCardData eVar, s2 s2Var) {
        this.data = eVar;
        this.documentVMS = s2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final NipipCardData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s2 getDocumentVMS() {
        return this.documentVMS;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentStateData)) {
            return false;
        }
        DocumentStateData documentStateData = (DocumentStateData) other;
        return fr.t.c(this.data, documentStateData.data) && fr.t.c(this.documentVMS, documentStateData.documentVMS);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.documentVMS.hashCode();
    }

    public String toString() {
        return "DocumentStateData(data=" + this.data + ", documentVMS=" + this.documentVMS + ')';
    }
}
