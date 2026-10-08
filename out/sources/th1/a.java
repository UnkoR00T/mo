package th1;

import fr.t;
import fr0.DocumentConfig;
import g64.c;
import g64.d;
import iq0.DashboardServiceEntry;
import k34.g;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u000b\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lth1/a;", "", "Lg64/d;", "b", "()Lg64/d;", "globalSearchType", "Lg64/c;", "a", "()Lg64/c;", "mainType", "", "c", "()I", "iconId", "Lth1/a$a;", "Lth1/a$b;", "Lth1/a$c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: th1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0015\u0010\"R\u001a\u0010%\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010\u000f¨\u0006&"}, d2 = {"Lth1/a$a;", "Lth1/a;", "Lg64/d;", "globalSearchType", "Lk34/g;", "document", "Lfr0/g;", "documentConfig", "<init>", "(Lg64/d;Lk34/g;Lfr0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg64/d;", "b", "()Lg64/d;", "Lk34/g;", "d", "()Lk34/g;", "c", "Lfr0/g;", "e", "()Lfr0/g;", "Lg64/c;", "Lg64/c;", "()Lg64/c;", "mainType", "I", "iconId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentItem implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d globalSearchType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g document;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentConfig documentConfig;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final c mainType = c.DOCUMENT;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int iconId;

        public DocumentItem(d dVar, g gVar, DocumentConfig documentConfig) {
            this.globalSearchType = dVar;
            this.document = gVar;
            this.documentConfig = documentConfig;
            this.iconId = gVar.getIcons().getIcon();
        }

        @Override // th1.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public c getMainType() {
            return this.mainType;
        }

        @Override // th1.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public d getGlobalSearchType() {
            return this.globalSearchType;
        }

        @Override // th1.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIconId() {
            return this.iconId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g getDocument() {
            return this.document;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DocumentConfig getDocumentConfig() {
            return this.documentConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentItem)) {
                return false;
            }
            DocumentItem documentItem = (DocumentItem) other;
            return this.globalSearchType == documentItem.globalSearchType && t.c(this.document, documentItem.document) && t.c(this.documentConfig, documentItem.documentConfig);
        }

        public int hashCode() {
            return (((this.globalSearchType.hashCode() * 31) + this.document.hashCode()) * 31) + this.documentConfig.hashCode();
        }

        public String toString() {
            return "DocumentItem(globalSearchType=" + this.globalSearchType + ", document=" + this.document + ", documentConfig=" + this.documentConfig + ')';
        }
    }

    /* JADX INFO: renamed from: th1.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0013\u0010\u001dR\u001a\u0010 \u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001b\u0010\r¨\u0006!"}, d2 = {"Lth1/a$b;", "Lth1/a;", "Lg64/d;", "globalSearchType", "Lah1/a;", "item", "<init>", "(Lg64/d;Lah1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg64/d;", "b", "()Lg64/d;", "Lah1/a;", "d", "()Lah1/a;", "Lg64/c;", "c", "Lg64/c;", "()Lg64/c;", "mainType", "I", "iconId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SearchAppMenuItem implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d globalSearchType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ah1.a item;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c mainType = c.MENU_ITEMS;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int iconId;

        public SearchAppMenuItem(d dVar, ah1.a aVar) {
            this.globalSearchType = dVar;
            this.item = aVar;
            this.iconId = aVar.getIcon();
        }

        @Override // th1.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public c getMainType() {
            return this.mainType;
        }

        @Override // th1.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public d getGlobalSearchType() {
            return this.globalSearchType;
        }

        @Override // th1.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIconId() {
            return this.iconId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ah1.a getItem() {
            return this.item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchAppMenuItem)) {
                return false;
            }
            SearchAppMenuItem searchAppMenuItem = (SearchAppMenuItem) other;
            return this.globalSearchType == searchAppMenuItem.globalSearchType && t.c(this.item, searchAppMenuItem.item);
        }

        public int hashCode() {
            return (this.globalSearchType.hashCode() * 31) + this.item.hashCode();
        }

        public String toString() {
            return "SearchAppMenuItem(globalSearchType=" + this.globalSearchType + ", item=" + this.item + ')';
        }
    }

    /* JADX INFO: renamed from: th1.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0015\u0010\"R\u001a\u0010%\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010\u000f¨\u0006&"}, d2 = {"Lth1/a$c;", "Lth1/a;", "Lg64/d;", "globalSearchType", "Liq0/p;", "dashboardServiceEntry", "Lji1/c;", "serviceTypeItem", "<init>", "(Lg64/d;Liq0/p;Lji1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg64/d;", "b", "()Lg64/d;", "Liq0/p;", "d", "()Liq0/p;", "c", "Lji1/c;", "e", "()Lji1/c;", "Lg64/c;", "Lg64/c;", "()Lg64/c;", "mainType", "I", "iconId", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ServiceItem implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d globalSearchType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DashboardServiceEntry dashboardServiceEntry;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ji1.c serviceTypeItem;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final c mainType = c.SERVICE;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int iconId;

        public ServiceItem(d dVar, DashboardServiceEntry dashboardServiceEntry, ji1.c cVar) {
            this.globalSearchType = dVar;
            this.dashboardServiceEntry = dashboardServiceEntry;
            this.serviceTypeItem = cVar;
            this.iconId = cVar.getIconRes();
        }

        @Override // th1.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public c getMainType() {
            return this.mainType;
        }

        @Override // th1.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public d getGlobalSearchType() {
            return this.globalSearchType;
        }

        @Override // th1.a
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getIconId() {
            return this.iconId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DashboardServiceEntry getDashboardServiceEntry() {
            return this.dashboardServiceEntry;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ji1.c getServiceTypeItem() {
            return this.serviceTypeItem;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceItem)) {
                return false;
            }
            ServiceItem serviceItem = (ServiceItem) other;
            return this.globalSearchType == serviceItem.globalSearchType && t.c(this.dashboardServiceEntry, serviceItem.dashboardServiceEntry) && t.c(this.serviceTypeItem, serviceItem.serviceTypeItem);
        }

        public int hashCode() {
            return (((this.globalSearchType.hashCode() * 31) + this.dashboardServiceEntry.hashCode()) * 31) + this.serviceTypeItem.hashCode();
        }

        public String toString() {
            return "ServiceItem(globalSearchType=" + this.globalSearchType + ", dashboardServiceEntry=" + this.dashboardServiceEntry + ", serviceTypeItem=" + this.serviceTypeItem + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    c getMainType();

    /* JADX INFO: renamed from: b */
    d getGlobalSearchType();

    /* JADX INFO: renamed from: c */
    int getIconId();
}
