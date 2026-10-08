package rd1;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rd1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lrd1/b;", "", "Lrd1/c;", "selection", "Lrd1/a;", "createPublicAddressData", "Lrd1/d;", "notPublicAddressData", "<init>", "(Lrd1/c;Lrd1/a;Lrd1/d;)V", "a", "(Lrd1/c;Lrd1/a;Lrd1/d;)Lrd1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrd1/c;", "e", "()Lrd1/c;", "b", "Lrd1/a;", "c", "()Lrd1/a;", "Lrd1/d;", "d", "()Lrd1/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EdorAddressData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c selection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CreatePublicAddressData createPublicAddressData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final NotPublicAddressData notPublicAddressData;

    public EdorAddressData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EdorAddressData b(EdorAddressData edorAddressData, c cVar, CreatePublicAddressData createPublicAddressData, NotPublicAddressData notPublicAddressData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cVar = edorAddressData.selection;
        }
        if ((i15 & 2) != 0) {
            createPublicAddressData = edorAddressData.createPublicAddressData;
        }
        if ((i15 & 4) != 0) {
            notPublicAddressData = edorAddressData.notPublicAddressData;
        }
        return edorAddressData.a(cVar, createPublicAddressData, notPublicAddressData);
    }

    public final EdorAddressData a(c selection, CreatePublicAddressData createPublicAddressData, NotPublicAddressData notPublicAddressData) {
        return new EdorAddressData(selection, createPublicAddressData, notPublicAddressData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CreatePublicAddressData getCreatePublicAddressData() {
        return this.createPublicAddressData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final NotPublicAddressData getNotPublicAddressData() {
        return this.notPublicAddressData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getSelection() {
        return this.selection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdorAddressData)) {
            return false;
        }
        EdorAddressData edorAddressData = (EdorAddressData) other;
        return this.selection == edorAddressData.selection && t.c(this.createPublicAddressData, edorAddressData.createPublicAddressData) && t.c(this.notPublicAddressData, edorAddressData.notPublicAddressData);
    }

    public int hashCode() {
        c cVar = this.selection;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        CreatePublicAddressData createPublicAddressData = this.createPublicAddressData;
        int iHashCode2 = (iHashCode + (createPublicAddressData == null ? 0 : createPublicAddressData.hashCode())) * 31;
        NotPublicAddressData notPublicAddressData = this.notPublicAddressData;
        return iHashCode2 + (notPublicAddressData != null ? notPublicAddressData.hashCode() : 0);
    }

    public String toString() {
        return "EdorAddressData(selection=" + this.selection + ", createPublicAddressData=" + this.createPublicAddressData + ", notPublicAddressData=" + this.notPublicAddressData + ')';
    }

    public EdorAddressData(c cVar, CreatePublicAddressData createPublicAddressData, NotPublicAddressData notPublicAddressData) {
        this.selection = cVar;
        this.createPublicAddressData = createPublicAddressData;
        this.notPublicAddressData = notPublicAddressData;
    }

    public /* synthetic */ EdorAddressData(c cVar, CreatePublicAddressData createPublicAddressData, NotPublicAddressData notPublicAddressData, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : cVar, (i15 & 2) != 0 ? null : createPublicAddressData, (i15 & 4) != 0 ? null : notPublicAddressData);
    }
}
