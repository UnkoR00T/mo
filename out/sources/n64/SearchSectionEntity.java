package n64;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n64.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Ln64/c;", "", "", "id", "", "order", "Lo64/b;", "section", "", "serviceType", "documentType", "subType", "<init>", "(JILo64/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "I", "c", "Lo64/b;", "d", "()Lo64/b;", "Ljava/lang/String;", "e", "f", "mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchSectionEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int order;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final o64.b section;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subType;

    public SearchSectionEntity(long j15, int i15, o64.b bVar, String str, String str2, String str3) {
        this.id = j15;
        this.order = i15;
        this.section = bVar;
        this.serviceType = str;
        this.documentType = str2;
        this.subType = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o64.b getSection() {
        return this.section;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getServiceType() {
        return this.serviceType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchSectionEntity)) {
            return false;
        }
        SearchSectionEntity searchSectionEntity = (SearchSectionEntity) other;
        return this.id == searchSectionEntity.id && this.order == searchSectionEntity.order && this.section == searchSectionEntity.section && t.c(this.serviceType, searchSectionEntity.serviceType) && t.c(this.documentType, searchSectionEntity.documentType) && t.c(this.subType, searchSectionEntity.subType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.order)) * 31) + this.section.hashCode()) * 31;
        String str = this.serviceType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SearchSectionEntity(id=" + this.id + ", order=" + this.order + ", section=" + this.section + ", serviceType=" + this.serviceType + ", documentType=" + this.documentType + ", subType=" + this.subType + ')';
    }

    public /* synthetic */ SearchSectionEntity(long j15, int i15, o64.b bVar, String str, String str2, String str3, int i16, k kVar) {
        this((i16 & 1) != 0 ? 0L : j15, i15, bVar, str, str2, str3);
    }
}
