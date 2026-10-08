package wa3;

import java.util.List;
import p071kotlin.Metadata;
import v93.Country;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwa3/k;", "", "a", "Lwa3/k$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lwa3/k$a;", "Lwa3/k;", "Lwa3/k$a$a;", "a", "()Lwa3/k$a$a;", "contentData", "b", "c", "Lwa3/k$a$b;", "Lwa3/k$a$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends k {

        /* JADX INFO: renamed from: wa3.k$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lwa3/k$a$b;", "Lwa3/k$a;", "Lwa3/k$a$a;", "contentData", "<init>", "(Lwa3/k$a$a;)V", "b", "(Lwa3/k$a$a;)Lwa3/k$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwa3/k$a$a;", "()Lwa3/k$a$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContentData contentData;

            public Screen(ContentData contentData) {
                this.contentData = contentData;
            }

            @Override // wa3.k.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public ContentData getContentData() {
                return this.contentData;
            }

            public final Screen b(ContentData contentData) {
                return new Screen(contentData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Screen) && fr.t.c(this.contentData, ((Screen) other).contentData);
            }

            public int hashCode() {
                return this.contentData.hashCode();
            }

            public String toString() {
                return "Screen(contentData=" + this.contentData + ')';
            }
        }

        /* JADX INFO: renamed from: wa3.k$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwa3/k$a$c;", "Lwa3/k$a;", "", "searchQuery", "Lwa3/k$a$a;", "contentData", "<init>", "(Ljava/lang/String;Lwa3/k$a$a;)V", "b", "(Ljava/lang/String;Lwa3/k$a$a;)Lwa3/k$a$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "Lwa3/k$a$a;", "()Lwa3/k$a$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Search implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String searchQuery;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContentData contentData;

            public Search(String str, ContentData contentData) {
                this.searchQuery = str;
                this.contentData = contentData;
            }

            public static /* synthetic */ Search c(Search search, String str, ContentData contentData, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    str = search.searchQuery;
                }
                if ((i15 & 2) != 0) {
                    contentData = search.contentData;
                }
                return search.b(str, contentData);
            }

            @Override // wa3.k.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public ContentData getContentData() {
                return this.contentData;
            }

            public final Search b(String searchQuery, ContentData contentData) {
                return new Search(searchQuery, contentData);
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getSearchQuery() {
                return this.searchQuery;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Search)) {
                    return false;
                }
                Search search = (Search) other;
                return fr.t.c(this.searchQuery, search.searchQuery) && fr.t.c(this.contentData, search.contentData);
            }

            public int hashCode() {
                return (this.searchQuery.hashCode() * 31) + this.contentData.hashCode();
            }

            public String toString() {
                return "Search(searchQuery=" + this.searchQuery + ", contentData=" + this.contentData + ')';
            }
        }

        /* JADX INFO: renamed from: a */
        ContentData getContentData();

        /* JADX INFO: renamed from: wa3.k$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJJ\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lwa3/k$a$a;", "", "Lwa3/k$a$a$a;", "activeTab", "", "Lv93/c;", "allCountries", "followedCountries", "searchCountries", "<init>", "(Lwa3/k$a$a$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "(Lwa3/k$a$a$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lwa3/k$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwa3/k$a$a$a;", "c", "()Lwa3/k$a$a$a;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "f", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ContentData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC5568a activeTab;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Country> allCountries;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Country> followedCountries;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<Country> searchCountries;

            /* JADX INFO: renamed from: wa3.k$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwa3/k$a$a$a;", "", "a", "b", "Lwa3/k$a$a$a$a;", "Lwa3/k$a$a$a$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface InterfaceC5568a {

                /* JADX INFO: renamed from: wa3.k$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwa3/k$a$a$a$a;", "Lwa3/k$a$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class C5569a implements InterfaceC5568a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C5569a f211635a = new C5569a();

                    private C5569a() {
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof C5569a);
                    }

                    public int hashCode() {
                        return 1041367334;
                    }

                    public String toString() {
                        return "All";
                    }
                }

                /* JADX INFO: renamed from: wa3.k$a$a$a$b */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwa3/k$a$a$a$b;", "Lwa3/k$a$a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class b implements InterfaceC5568a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final b f211636a = new b();

                    private b() {
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof b);
                    }

                    public int hashCode() {
                        return 1595769771;
                    }

                    public String toString() {
                        return "Followed";
                    }
                }
            }

            public ContentData(InterfaceC5568a interfaceC5568a, List<Country> list, List<Country> list2, List<Country> list3) {
                this.activeTab = interfaceC5568a;
                this.allCountries = list;
                this.followedCountries = list2;
                this.searchCountries = list3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ContentData b(ContentData contentData, InterfaceC5568a interfaceC5568a, List list, List list2, List list3, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    interfaceC5568a = contentData.activeTab;
                }
                if ((i15 & 2) != 0) {
                    list = contentData.allCountries;
                }
                if ((i15 & 4) != 0) {
                    list2 = contentData.followedCountries;
                }
                if ((i15 & 8) != 0) {
                    list3 = contentData.searchCountries;
                }
                return contentData.a(interfaceC5568a, list, list2, list3);
            }

            public final ContentData a(InterfaceC5568a activeTab, List<Country> allCountries, List<Country> followedCountries, List<Country> searchCountries) {
                return new ContentData(activeTab, allCountries, followedCountries, searchCountries);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final InterfaceC5568a getActiveTab() {
                return this.activeTab;
            }

            public final List<Country> d() {
                return this.allCountries;
            }

            public final List<Country> e() {
                return this.followedCountries;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContentData)) {
                    return false;
                }
                ContentData contentData = (ContentData) other;
                return fr.t.c(this.activeTab, contentData.activeTab) && fr.t.c(this.allCountries, contentData.allCountries) && fr.t.c(this.followedCountries, contentData.followedCountries) && fr.t.c(this.searchCountries, contentData.searchCountries);
            }

            public final List<Country> f() {
                return this.searchCountries;
            }

            public int hashCode() {
                return (((((this.activeTab.hashCode() * 31) + this.allCountries.hashCode()) * 31) + this.followedCountries.hashCode()) * 31) + this.searchCountries.hashCode();
            }

            public String toString() {
                return "ContentData(activeTab=" + this.activeTab + ", allCountries=" + this.allCountries + ", followedCountries=" + this.followedCountries + ", searchCountries=" + this.searchCountries + ')';
            }

            public /* synthetic */ ContentData(InterfaceC5568a interfaceC5568a, List list, List list2, List list3, int i15, fr.k kVar) {
                this((i15 & 1) != 0 ? InterfaceC5568a.C5569a.f211635a : interfaceC5568a, list, list2, list3);
            }
        }
    }
}
