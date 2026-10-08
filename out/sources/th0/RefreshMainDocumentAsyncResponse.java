package th0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lth0/p;", "", "Lth0/d;", "documentToGenerate", "Liy/b0;", "sourceDocumentAccessToken", "<init>", "(Lth0/d;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/d;", "()Lth0/d;", "b", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefreshMainDocumentAsyncResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AsyncDocumentToGenerate documentToGenerate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 sourceDocumentAccessToken;

    public RefreshMainDocumentAsyncResponse(AsyncDocumentToGenerate asyncDocumentToGenerate, b0 b0Var) {
        this.documentToGenerate = asyncDocumentToGenerate;
        this.sourceDocumentAccessToken = b0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AsyncDocumentToGenerate getDocumentToGenerate() {
        return this.documentToGenerate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getSourceDocumentAccessToken() {
        return this.sourceDocumentAccessToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefreshMainDocumentAsyncResponse)) {
            return false;
        }
        RefreshMainDocumentAsyncResponse refreshMainDocumentAsyncResponse = (RefreshMainDocumentAsyncResponse) other;
        return fr.t.c(this.documentToGenerate, refreshMainDocumentAsyncResponse.documentToGenerate) && fr.t.c(this.sourceDocumentAccessToken, refreshMainDocumentAsyncResponse.sourceDocumentAccessToken);
    }

    public int hashCode() {
        return (this.documentToGenerate.hashCode() * 31) + this.sourceDocumentAccessToken.hashCode();
    }

    public String toString() {
        return "RefreshMainDocumentAsyncResponse(documentToGenerate=" + this.documentToGenerate + ", sourceDocumentAccessToken=" + this.sourceDocumentAccessToken + ")";
    }
}
