package i24;

import f24.Document;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i24.k, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Li24/k;", "", "Lf24/e;", "document", "", "scopeName", "Li24/m;", "scope", "<init>", "(Lf24/e;Ljava/lang/String;Li24/m;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf24/e;", "()Lf24/e;", "b", "Ljava/lang/String;", "c", "Li24/m;", "()Li24/m;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scopeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DrivingLicenceScope scope;

    public DrivingLicenceData(Document document, String str, DrivingLicenceScope drivingLicenceScope) {
        this.document = document;
        this.scopeName = str;
        this.scope = drivingLicenceScope;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DrivingLicenceScope getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScopeName() {
        return this.scopeName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceData)) {
            return false;
        }
        DrivingLicenceData drivingLicenceData = (DrivingLicenceData) other;
        return fr.t.c(this.document, drivingLicenceData.document) && fr.t.c(this.scopeName, drivingLicenceData.scopeName) && fr.t.c(this.scope, drivingLicenceData.scope);
    }

    public int hashCode() {
        return (((this.document.hashCode() * 31) + this.scopeName.hashCode()) * 31) + this.scope.hashCode();
    }

    public String toString() {
        return "DrivingLicenceData(document=" + this.document + ", scopeName=" + this.scopeName + ", scope=" + this.scope + ")";
    }
}
