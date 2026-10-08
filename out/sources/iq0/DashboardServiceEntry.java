package iq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Liq0/p;", "", "", "name", "Lrq0/c;", "type", "supplementOrigin", "webUrl", "Liq0/r;", "entryMod", "Liq0/g0;", "temporaryInterruption", "<init>", "(Ljava/lang/String;Lrq0/c;Ljava/lang/String;Ljava/lang/String;Liq0/r;Liq0/g0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrq0/c;", "d", "()Lrq0/c;", "c", "e", "Liq0/g0;", "()Liq0/g0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DashboardServiceEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.c type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String supplementOrigin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TemporaryInterruption temporaryInterruption;

    public DashboardServiceEntry(String str, rq0.c cVar, String str2, String str3, r rVar, TemporaryInterruption temporaryInterruption) {
        this.name = str;
        this.type = cVar;
        this.supplementOrigin = str2;
        this.webUrl = str3;
        this.temporaryInterruption = temporaryInterruption;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSupplementOrigin() {
        return this.supplementOrigin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TemporaryInterruption getTemporaryInterruption() {
        return this.temporaryInterruption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final rq0.c getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardServiceEntry)) {
            return false;
        }
        DashboardServiceEntry dashboardServiceEntry = (DashboardServiceEntry) other;
        return fr.t.c(this.name, dashboardServiceEntry.name) && this.type == dashboardServiceEntry.type && fr.t.c(this.supplementOrigin, dashboardServiceEntry.supplementOrigin) && fr.t.c(this.webUrl, dashboardServiceEntry.webUrl) && fr.t.c(null, null) && fr.t.c(this.temporaryInterruption, dashboardServiceEntry.temporaryInterruption);
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.supplementOrigin;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961;
        TemporaryInterruption temporaryInterruption = this.temporaryInterruption;
        return iHashCode3 + (temporaryInterruption != null ? temporaryInterruption.hashCode() : 0);
    }

    public String toString() {
        return "DashboardServiceEntry(name=" + this.name + ", type=" + this.type + ", supplementOrigin=" + this.supplementOrigin + ", webUrl=" + this.webUrl + ", entryMod=" + ((Object) null) + ", temporaryInterruption=" + this.temporaryInterruption + ")";
    }

    public /* synthetic */ DashboardServiceEntry(String str, rq0.c cVar, String str2, String str3, r rVar, TemporaryInterruption temporaryInterruption, int i15, fr.k kVar) {
        this(str, cVar, str2, str3, (i15 & 16) != 0 ? null : rVar, (i15 & 32) != 0 ? null : temporaryInterruption);
    }
}
