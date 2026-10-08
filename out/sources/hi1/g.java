package hi1;

import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import java.util.Set;
import k40.EmptyStateData;
import m50.ServiceWidgetData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\u0007J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lhi1/g;", "Ll00/e;", "Lhi1/g$b;", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()V", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "b", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<b> {

    /* JADX INFO: renamed from: hi1.g$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhi1/g$a;", "", "Lmx/a;", "name", "", "Ln50/k;", "services", "<init>", "(Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CategoryItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<n50.k> services;

        /* JADX WARN: Multi-variable type inference failed */
        public CategoryItem(Label label, List<? extends n50.k> list) {
            this.name = label;
            this.services = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getName() {
            return this.name;
        }

        public final List<n50.k> b() {
            return this.services;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CategoryItem)) {
                return false;
            }
            CategoryItem categoryItem = (CategoryItem) other;
            return fr.t.c(this.name, categoryItem.name) && fr.t.c(this.services, categoryItem.services);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.services.hashCode();
        }

        public String toString() {
            return "CategoryItem(name=" + this.name + ", services=" + this.services + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lhi1/g$b;", "", "b", "c", "a", "Lhi1/g$b$a;", "Lhi1/g$b$b;", "Lhi1/g$b$c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: hi1.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhi1/g$b$a;", "Lhi1/g$b;", "Lk40/a;", "content", "Li50/a;", "scaffoldData", "<init>", "(Lk40/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk40/a;", "()Lk40/a;", "b", "Li50/a;", "()Li50/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EmptyState implements b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f84827c = BaseScaffoldData.f89350g | EmptyStateData.f108236d;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData content;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public EmptyState(EmptyStateData emptyStateData, BaseScaffoldData baseScaffoldData) {
                this.content = emptyStateData;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final EmptyStateData getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyState)) {
                    return false;
                }
                EmptyState emptyState = (EmptyState) other;
                return fr.t.c(this.content, emptyState.content) && fr.t.c(this.scaffoldData, emptyState.scaffoldData);
            }

            public int hashCode() {
                return (this.content.hashCode() * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "EmptyState(content=" + this.content + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }

        /* JADX INFO: renamed from: hi1.g$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhi1/g$b$b;", "Lhi1/g$b;", "Li50/a;", "scaffoldData", "<init>", "(Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loading implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f84830b = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Loading(BaseScaffoldData baseScaffoldData) {
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && fr.t.c(this.scaffoldData, ((Loading) other).scaffoldData);
            }

            public int hashCode() {
                return this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Loading(scaffoldData=" + this.scaffoldData + ')';
            }
        }

        /* JADX INFO: renamed from: hi1.g$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Lhi1/g$b$c;", "Lhi1/g$b;", "Lmx/a;", "favouriteServicesTitle", "", "Ln50/k;", "favouritesList", "Lhi1/g$a;", "categoriesList", "Lj30/a;", "editButtonData", "Li50/a;", "scaffoldData", "", "Lm50/a;", "widgetsData", "<init>", "(Lmx/a;Ljava/util/List;Ljava/util/List;Lj30/a;Li50/a;Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lj30/a;", "()Lj30/a;", "e", "Li50/a;", "()Li50/a;", "f", "Ljava/util/Set;", "()Ljava/util/Set;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ServicesLoaded implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label favouriteServicesTitle;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> favouritesList;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CategoryItem> categoriesList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData editButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<ServiceWidgetData> widgetsData;

            /* JADX WARN: Multi-variable type inference failed */
            public ServicesLoaded(Label label, List<? extends n50.k> list, List<CategoryItem> list2, ButtonTextData buttonTextData, BaseScaffoldData baseScaffoldData, Set<ServiceWidgetData> set) {
                this.favouriteServicesTitle = label;
                this.favouritesList = list;
                this.categoriesList = list2;
                this.editButtonData = buttonTextData;
                this.scaffoldData = baseScaffoldData;
                this.widgetsData = set;
            }

            public final List<CategoryItem> a() {
                return this.categoriesList;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonTextData getEditButtonData() {
                return this.editButtonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getFavouriteServicesTitle() {
                return this.favouriteServicesTitle;
            }

            public final List<n50.k> d() {
                return this.favouritesList;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServicesLoaded)) {
                    return false;
                }
                ServicesLoaded servicesLoaded = (ServicesLoaded) other;
                return fr.t.c(this.favouriteServicesTitle, servicesLoaded.favouriteServicesTitle) && fr.t.c(this.favouritesList, servicesLoaded.favouritesList) && fr.t.c(this.categoriesList, servicesLoaded.categoriesList) && fr.t.c(this.editButtonData, servicesLoaded.editButtonData) && fr.t.c(this.scaffoldData, servicesLoaded.scaffoldData) && fr.t.c(this.widgetsData, servicesLoaded.widgetsData);
            }

            public final Set<ServiceWidgetData> f() {
                return this.widgetsData;
            }

            public int hashCode() {
                return (((((((((this.favouriteServicesTitle.hashCode() * 31) + this.favouritesList.hashCode()) * 31) + this.categoriesList.hashCode()) * 31) + this.editButtonData.hashCode()) * 31) + this.scaffoldData.hashCode()) * 31) + this.widgetsData.hashCode();
            }

            public String toString() {
                return "ServicesLoaded(favouriteServicesTitle=" + this.favouriteServicesTitle + ", favouritesList=" + this.favouritesList + ", categoriesList=" + this.categoriesList + ", editButtonData=" + this.editButtonData + ", scaffoldData=" + this.scaffoldData + ", widgetsData=" + this.widgetsData + ')';
            }
        }
    }

    void P();

    oz.j a();
}
