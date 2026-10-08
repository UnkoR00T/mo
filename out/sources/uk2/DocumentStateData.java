package uk2;

import java.util.List;
import lk2.MIdCardData;
import o20.s2;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: uk2.t, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0018\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Luk2/t;", "", "Llk2/c;", "data", "Llk2/b;", "status", "", "Lrq0/c;", "availableServices", "", "shortName", "Lo20/s2;", "documentVMS", "<init>", "(Llk2/c;Llk2/b;Ljava/util/List;Ljava/lang/String;Lo20/s2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llk2/c;", "b", "()Llk2/c;", "Llk2/b;", "e", "()Llk2/b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "Lo20/s2;", "()Lo20/s2;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentStateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final MIdCardData data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final lk2.b status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<rq0.c> availableServices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s2 documentVMS;

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentStateData(MIdCardData mIdCardData, lk2.b bVar, List<? extends rq0.c> list, String str, s2 s2Var) {
        this.data = mIdCardData;
        this.status = bVar;
        this.availableServices = list;
        this.shortName = str;
        this.documentVMS = s2Var;
    }

    public final List<rq0.c> a() {
        return this.availableServices;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MIdCardData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s2 getDocumentVMS() {
        return this.documentVMS;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final lk2.b getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentStateData)) {
            return false;
        }
        DocumentStateData documentStateData = (DocumentStateData) other;
        return fr.t.c(this.data, documentStateData.data) && this.status == documentStateData.status && fr.t.c(this.availableServices, documentStateData.availableServices) && fr.t.c(this.shortName, documentStateData.shortName) && fr.t.c(this.documentVMS, documentStateData.documentVMS);
    }

    public int hashCode() {
        int iHashCode = ((this.data.hashCode() * 31) + this.status.hashCode()) * 31;
        List<rq0.c> list = this.availableServices;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.shortName;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.documentVMS.hashCode();
    }

    public String toString() {
        return "DocumentStateData(data=" + this.data + ", status=" + this.status + ", availableServices=" + this.availableServices + ", shortName=" + this.shortName + ", documentVMS=" + this.documentVMS + ')';
    }
}
