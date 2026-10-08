package m00;

import fr.t;
import fv.e0;
import fv.v;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006$"}, d2 = {"Lm00/a;", "", "Lfv/v;", "url", "", "code", "", "message", "Lfv/e0;", "errorBody", "Lm00/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Lfv/v;ILjava/lang/String;Lfv/e0;Lm00/c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfv/v;", "getUrl", "()Lfv/v;", "b", "I", "c", "Ljava/lang/String;", "d", "Lfv/e0;", "()Lfv/e0;", "e", "Lm00/c;", "()Lm00/c;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e0 errorBody;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c contentType;

    public a(v vVar, int i15, String str, e0 e0Var, c cVar) {
        this.url = vVar;
        this.code = i15;
        this.message = str;
        this.errorBody = e0Var;
        this.contentType = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getErrorBody() {
        return this.errorBody;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return t.c(this.url, aVar.url) && this.code == aVar.code && t.c(this.message, aVar.message) && t.c(this.errorBody, aVar.errorBody) && this.contentType == aVar.contentType;
    }

    public int hashCode() {
        int iHashCode = ((((this.url.hashCode() * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode()) * 31;
        e0 e0Var = this.errorBody;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        c cVar = this.contentType;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "ErrorResponse{url=" + this.url + ", code=" + this.code + ", message=" + this.message + '}';
    }
}
