package zs1;

import bt1.RefugeeChildrenListEntry;
import java.util.List;
import p071kotlin.Metadata;
import ws1.RefugeeCardData;

/* JADX INFO: renamed from: zs1.r0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J~\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b3\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b'\u0010\u0019R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b+\u00107¨\u00068"}, d2 = {"Lzs1/r0;", "", "Ly30/n$b$b;", "selectedItem", "Lws1/d;", "data", "Lws1/b;", "status", "", "isMainDocument", "showDiiaPlPeselZoom", "Lo20/s2;", "documentVMS", "isRestrictPeselAvailable", "", "shortName", "bundleId", "", "Lbt1/b;", "children", "<init>", "(Ly30/n$b$b;Lws1/d;Lws1/b;ZZLo20/s2;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "(Ly30/n$b$b;Lws1/d;Lws1/b;ZZLo20/s2;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lzs1/r0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ly30/n$b$b;", "g", "()Ly30/n$b$b;", "b", "Lws1/d;", "e", "()Lws1/d;", "c", "Lws1/b;", "j", "()Lws1/b;", "d", "Z", "k", "()Z", "i", "f", "Lo20/s2;", "()Lo20/s2;", "l", "h", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "diia_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentStateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final y30.n.Switch.EnumC5973b selectedItem;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final RefugeeCardData data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ws1.b status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMainDocument;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showDiiaPlPeselZoom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final o20.s2 documentVMS;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRestrictPeselAvailable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortName;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bundleId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<RefugeeChildrenListEntry> children;

    public DocumentStateData(y30.n.Switch.EnumC5973b enumC5973b, RefugeeCardData refugeeCardData, ws1.b bVar, boolean z15, boolean z16, o20.s2 s2Var, boolean z17, String str, String str2, List<RefugeeChildrenListEntry> list) {
        this.selectedItem = enumC5973b;
        this.data = refugeeCardData;
        this.status = bVar;
        this.isMainDocument = z15;
        this.showDiiaPlPeselZoom = z16;
        this.documentVMS = s2Var;
        this.isRestrictPeselAvailable = z17;
        this.shortName = str;
        this.bundleId = str2;
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentStateData b(DocumentStateData documentStateData, y30.n.Switch.EnumC5973b enumC5973b, RefugeeCardData refugeeCardData, ws1.b bVar, boolean z15, boolean z16, o20.s2 s2Var, boolean z17, String str, String str2, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            enumC5973b = documentStateData.selectedItem;
        }
        if ((i15 & 2) != 0) {
            refugeeCardData = documentStateData.data;
        }
        if ((i15 & 4) != 0) {
            bVar = documentStateData.status;
        }
        if ((i15 & 8) != 0) {
            z15 = documentStateData.isMainDocument;
        }
        if ((i15 & 16) != 0) {
            z16 = documentStateData.showDiiaPlPeselZoom;
        }
        if ((i15 & 32) != 0) {
            s2Var = documentStateData.documentVMS;
        }
        if ((i15 & 64) != 0) {
            z17 = documentStateData.isRestrictPeselAvailable;
        }
        if ((i15 & 128) != 0) {
            str = documentStateData.shortName;
        }
        if ((i15 & 256) != 0) {
            str2 = documentStateData.bundleId;
        }
        if ((i15 & 512) != 0) {
            list = documentStateData.children;
        }
        String str3 = str2;
        List list2 = list;
        boolean z18 = z17;
        String str4 = str;
        boolean z19 = z16;
        o20.s2 s2Var2 = s2Var;
        return documentStateData.a(enumC5973b, refugeeCardData, bVar, z15, z19, s2Var2, z18, str4, str3, list2);
    }

    public final DocumentStateData a(y30.n.Switch.EnumC5973b selectedItem, RefugeeCardData data, ws1.b status, boolean isMainDocument, boolean showDiiaPlPeselZoom, o20.s2 documentVMS, boolean isRestrictPeselAvailable, String shortName, String bundleId, List<RefugeeChildrenListEntry> children) {
        return new DocumentStateData(selectedItem, data, status, isMainDocument, showDiiaPlPeselZoom, documentVMS, isRestrictPeselAvailable, shortName, bundleId, children);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    public final List<RefugeeChildrenListEntry> d() {
        return this.children;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final RefugeeCardData getData() {
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentStateData)) {
            return false;
        }
        DocumentStateData documentStateData = (DocumentStateData) other;
        return this.selectedItem == documentStateData.selectedItem && fr.t.c(this.data, documentStateData.data) && this.status == documentStateData.status && this.isMainDocument == documentStateData.isMainDocument && this.showDiiaPlPeselZoom == documentStateData.showDiiaPlPeselZoom && fr.t.c(this.documentVMS, documentStateData.documentVMS) && this.isRestrictPeselAvailable == documentStateData.isRestrictPeselAvailable && fr.t.c(this.shortName, documentStateData.shortName) && fr.t.c(this.bundleId, documentStateData.bundleId) && fr.t.c(this.children, documentStateData.children);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o20.s2 getDocumentVMS() {
        return this.documentVMS;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final y30.n.Switch.EnumC5973b getSelectedItem() {
        return this.selectedItem;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.selectedItem.hashCode() * 31) + this.data.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.isMainDocument)) * 31) + Boolean.hashCode(this.showDiiaPlPeselZoom)) * 31) + this.documentVMS.hashCode()) * 31) + Boolean.hashCode(this.isRestrictPeselAvailable)) * 31;
        String str = this.shortName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bundleId;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.children.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShowDiiaPlPeselZoom() {
        return this.showDiiaPlPeselZoom;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ws1.b getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsMainDocument() {
        return this.isMainDocument;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsRestrictPeselAvailable() {
        return this.isRestrictPeselAvailable;
    }

    public String toString() {
        return "DocumentStateData(selectedItem=" + this.selectedItem + ", data=" + this.data + ", status=" + this.status + ", isMainDocument=" + this.isMainDocument + ", showDiiaPlPeselZoom=" + this.showDiiaPlPeselZoom + ", documentVMS=" + this.documentVMS + ", isRestrictPeselAvailable=" + this.isRestrictPeselAvailable + ", shortName=" + this.shortName + ", bundleId=" + this.bundleId + ", children=" + this.children + ')';
    }
}
