package f70;

import fr.k;
import fr.t;
import i20.ScannerViewData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f70.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf70/c;", "", "Lc30/b;", "alertData", "Li20/i;", "scannerViewData", "<init>", "(Lc30/b;Li20/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc30/b;", "()Lc30/b;", "b", "Li20/i;", "()Li20/i;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrScannerData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f59729c = c30.b.f22944i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c30.b alertData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScannerViewData scannerViewData;

    public QrScannerData(c30.b bVar, ScannerViewData scannerViewData) {
        this.alertData = bVar;
        this.scannerViewData = scannerViewData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c30.b getAlertData() {
        return this.alertData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ScannerViewData getScannerViewData() {
        return this.scannerViewData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrScannerData)) {
            return false;
        }
        QrScannerData qrScannerData = (QrScannerData) other;
        return t.c(this.alertData, qrScannerData.alertData) && t.c(this.scannerViewData, qrScannerData.scannerViewData);
    }

    public int hashCode() {
        c30.b bVar = this.alertData;
        return ((bVar == null ? 0 : bVar.hashCode()) * 31) + this.scannerViewData.hashCode();
    }

    public String toString() {
        return "QrScannerData(alertData=" + this.alertData + ", scannerViewData=" + this.scannerViewData + ')';
    }

    public /* synthetic */ QrScannerData(c30.b bVar, ScannerViewData scannerViewData, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : bVar, (i15 & 2) != 0 ? new ScannerViewData(null, null, 3, null) : scannerViewData);
    }
}
