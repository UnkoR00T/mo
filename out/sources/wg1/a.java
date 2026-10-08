package wg1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lwg1/a;", "Lbh1/a;", "<init>", "()V", "", "a", "Z", "c", "()Z", "d", "(Z)V", "wasUpdateRecommendationDisplayed", "b", "displayCertificateUpdateRecommendation", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements bh1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean wasUpdateRecommendationDisplayed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean displayCertificateUpdateRecommendation = true;

    @Override // bh1.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getDisplayCertificateUpdateRecommendation() {
        return this.displayCertificateUpdateRecommendation;
    }

    @Override // bh1.a
    public void b(boolean z15) {
        this.displayCertificateUpdateRecommendation = z15;
    }

    @Override // bh1.a
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getWasUpdateRecommendationDisplayed() {
        return this.wasUpdateRecommendationDisplayed;
    }

    @Override // bh1.a
    public void d(boolean z15) {
        this.wasUpdateRecommendationDisplayed = z15;
    }
}
