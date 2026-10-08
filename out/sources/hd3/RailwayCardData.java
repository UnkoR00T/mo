package hd3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: hd3.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010\r¨\u0006!"}, d2 = {"Lhd3/e;", "", "Lhd3/b;", "document", "Lhd3/g;", "scope", "Lhd3/c;", "documentStatus", "", "photo", "<init>", "(Lhd3/b;Lhd3/g;Lhd3/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhd3/b;", "getDocument", "()Lhd3/b;", "b", "Lhd3/g;", "c", "()Lhd3/g;", "Lhd3/c;", "()Lhd3/c;", "d", "Ljava/lang/String;", "uut_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RailwayCardData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83945e = fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RailwayCardScope scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c documentStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photo;

    public RailwayCardData(Document document, RailwayCardScope railwayCardScope, c cVar, String str) {
        this.document = document;
        this.scope = railwayCardScope;
        this.documentStatus = cVar;
        this.photo = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDocumentStatus() {
        return this.documentStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPhoto() {
        return this.photo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RailwayCardScope getScope() {
        return this.scope;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RailwayCardData)) {
            return false;
        }
        RailwayCardData railwayCardData = (RailwayCardData) other;
        return t.c(this.document, railwayCardData.document) && t.c(this.scope, railwayCardData.scope) && this.documentStatus == railwayCardData.documentStatus && t.c(this.photo, railwayCardData.photo);
    }

    public int hashCode() {
        Document document = this.document;
        int iHashCode = (((((document == null ? 0 : document.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.documentStatus.hashCode()) * 31;
        String str = this.photo;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "RailwayCardData(document=" + this.document + ", scope=" + this.scope + ", documentStatus=" + this.documentStatus + ", photo=" + this.photo + ')';
    }
}
