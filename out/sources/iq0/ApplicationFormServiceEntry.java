package iq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: iq0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Liq0/g;", "", "", "description", "name", "Liq0/i;", "type", "Liq0/h;", "nativeType", "supplementOrigin", "webUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Liq0/i;Liq0/h;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Liq0/i;", "e", "()Liq0/i;", "d", "Liq0/h;", "()Liq0/h;", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicationFormServiceEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final h nativeType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String supplementOrigin;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webUrl;

    public ApplicationFormServiceEntry(String str, String str2, i iVar, h hVar, String str3, String str4) {
        this.description = str;
        this.name = str2;
        this.type = iVar;
        this.nativeType = hVar;
        this.supplementOrigin = str3;
        this.webUrl = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getNativeType() {
        return this.nativeType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSupplementOrigin() {
        return this.supplementOrigin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationFormServiceEntry)) {
            return false;
        }
        ApplicationFormServiceEntry applicationFormServiceEntry = (ApplicationFormServiceEntry) other;
        return fr.t.c(this.description, applicationFormServiceEntry.description) && fr.t.c(this.name, applicationFormServiceEntry.name) && this.type == applicationFormServiceEntry.type && this.nativeType == applicationFormServiceEntry.nativeType && fr.t.c(this.supplementOrigin, applicationFormServiceEntry.supplementOrigin) && fr.t.c(this.webUrl, applicationFormServiceEntry.webUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        int iHashCode = ((((this.description.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31;
        h hVar = this.nativeType;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.supplementOrigin;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webUrl;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApplicationFormServiceEntry(description=" + this.description + ", name=" + this.name + ", type=" + this.type + ", nativeType=" + this.nativeType + ", supplementOrigin=" + this.supplementOrigin + ", webUrl=" + this.webUrl + ")";
    }
}
