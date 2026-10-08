package sy2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sy2.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsy2/c;", "", "Lkotlin/Function0;", "Loq/i0;", "onDocumentUpdate", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "getOnDocumentUpdate", "()Ler/a;", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentVerification implements n20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<oq.i0> onDocumentUpdate;

    public DocumentVerification(er.a<oq.i0> aVar) {
        this.onDocumentUpdate = aVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentVerification) && fr.t.c(this.onDocumentUpdate, ((DocumentVerification) other).onDocumentUpdate);
    }

    public int hashCode() {
        return this.onDocumentUpdate.hashCode();
    }

    public String toString() {
        return "DocumentVerification(onDocumentUpdate=" + this.onDocumentUpdate + ')';
    }
}
