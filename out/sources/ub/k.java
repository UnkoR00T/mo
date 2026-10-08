package ub;

import android.app.Notification;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f197124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f197125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f197126c;

    public k(int i15, Notification notification, int i16) {
        this.f197124a = i15;
        this.f197126c = notification;
        this.f197125b = i16;
    }

    public int a() {
        return this.f197125b;
    }

    public Notification b() {
        return this.f197126c;
    }

    public int c() {
        return this.f197124a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f197124a == kVar.f197124a && this.f197125b == kVar.f197125b) {
            return this.f197126c.equals(kVar.f197126c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f197124a * 31) + this.f197125b) * 31) + this.f197126c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f197124a + ", mForegroundServiceType=" + this.f197125b + ", mNotification=" + this.f197126c + '}';
    }
}
