package p024c42;

import d42.PaymentCardsSetupData;
import p071kotlin.Metadata;
import zx.a;
import zx.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0015\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lc42/i2;", "", "Lzx/c;", "Ld42/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "e", "()Z", "consumeNavigationData", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i2 implements a, c<PaymentCardsSetupData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2 f23211a = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String route = "epayments/cards";

    private i2() {
    }

    @Override // zx.a
    /* JADX INFO: renamed from: b */
    public String getRoute() {
        return route;
    }

    @Override // zx.a
    public boolean e() {
        return false;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof i2);
    }

    public int hashCode() {
        return 1843175426;
    }

    public String toString() {
        return "PaymentsCards";
    }
}
