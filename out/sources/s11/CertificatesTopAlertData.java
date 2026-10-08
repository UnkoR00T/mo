package s11;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s11.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ls11/g;", "", "Lc30/b;", "alertData", "", "isVisible", "<init>", "(Lc30/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lc30/b;", "()Lc30/b;", "b", "Z", "()Z", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificatesTopAlertData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f177442c = c30.b.f22944i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c30.b alertData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    public CertificatesTopAlertData(c30.b bVar, boolean z15) {
        this.alertData = bVar;
        this.isVisible = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c30.b getAlertData() {
        return this.alertData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificatesTopAlertData)) {
            return false;
        }
        CertificatesTopAlertData certificatesTopAlertData = (CertificatesTopAlertData) other;
        return t.c(this.alertData, certificatesTopAlertData.alertData) && this.isVisible == certificatesTopAlertData.isVisible;
    }

    public int hashCode() {
        return (this.alertData.hashCode() * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "CertificatesTopAlertData(alertData=" + this.alertData + ", isVisible=" + this.isVisible + ')';
    }
}
