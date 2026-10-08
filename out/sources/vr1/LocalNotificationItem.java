package vr1;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vr1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lvr1/e;", "", "", "name", "expirationDate", "notificationDate", "status", "Lkotlin/Function0;", "Loq/i0;", "onClickItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocalNotificationItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String notificationDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClickItem;

    public LocalNotificationItem(String str, String str2, String str3, String str4, er.a<i0> aVar) {
        this.name = str;
        this.expirationDate = str2;
        this.notificationDate = str3;
        this.status = str4;
        this.onClickItem = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNotificationDate() {
        return this.notificationDate;
    }

    public final er.a<i0> d() {
        return this.onClickItem;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalNotificationItem)) {
            return false;
        }
        LocalNotificationItem localNotificationItem = (LocalNotificationItem) other;
        return t.c(this.name, localNotificationItem.name) && t.c(this.expirationDate, localNotificationItem.expirationDate) && t.c(this.notificationDate, localNotificationItem.notificationDate) && t.c(this.status, localNotificationItem.status) && t.c(this.onClickItem, localNotificationItem.onClickItem);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + this.notificationDate.hashCode()) * 31) + this.status.hashCode()) * 31) + this.onClickItem.hashCode();
    }

    public String toString() {
        return "LocalNotificationItem(name=" + this.name + ", expirationDate=" + this.expirationDate + ", notificationDate=" + this.notificationDate + ", status=" + this.status + ", onClickItem=" + this.onClickItem + ')';
    }
}
