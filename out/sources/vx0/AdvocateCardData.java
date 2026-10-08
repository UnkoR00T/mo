package vx0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vx0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lvx0/b;", "", "Lvx0/e;", "document", "Lvx0/c;", "scope", "Lvx0/f;", "status", "Lvx0/g;", "userData", "<init>", "(Lvx0/e;Lvx0/c;Lvx0/f;Lvx0/g;)V", "", "e", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvx0/e;", "()Lvx0/e;", "b", "Lvx0/c;", "()Lvx0/c;", "c", "Lvx0/f;", "()Lvx0/f;", "d", "Lvx0/g;", "()Lvx0/g;", "advocatecard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvocateCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdvocateCardScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserDocumentData userData;

    public AdvocateCardData(Document document, AdvocateCardScope advocateCardScope, f fVar, UserDocumentData userDocumentData) {
        this.document = document;
        this.scope = advocateCardScope;
        this.status = fVar;
        this.userData = userDocumentData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AdvocateCardScope getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final UserDocumentData getUserData() {
        return this.userData;
    }

    public final String e() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.userData.getFirstName());
        String secondName = this.userData.getSecondName();
        if (secondName != null) {
            sb5.append(" ");
            sb5.append(secondName);
        }
        return sb5.toString();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvocateCardData)) {
            return false;
        }
        AdvocateCardData advocateCardData = (AdvocateCardData) other;
        return t.c(this.document, advocateCardData.document) && t.c(this.scope, advocateCardData.scope) && this.status == advocateCardData.status && t.c(this.userData, advocateCardData.userData);
    }

    public int hashCode() {
        Document document = this.document;
        return ((((((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.status.hashCode()) * 31) + this.userData.hashCode();
    }

    public String toString() {
        return "AdvocateCardData(document=" + this.document + ", scope=" + this.scope + ", status=" + this.status + ", userData=" + this.userData + ')';
    }
}
