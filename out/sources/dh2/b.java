package dh2;

import java.util.List;
import p071kotlin.Metadata;
import tq0.OrderedDocumentByNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ldh2/b;", "", "d", "b", "a", "c", "Ldh2/b$a;", "Ldh2/b$b;", "Ldh2/b$c;", "Ldh2/b$d;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: dh2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Ldh2/b$a;", "Ldh2/b;", "", "query", "", "isSearchActive", "", "Ltq0/v;", "filteredList", "originalList", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "a", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)Ldh2/b$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Z", "f", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String query;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSearchActive;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderedDocumentByNumber> filteredList;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderedDocumentByNumber> originalList;

        public Content(String str, boolean z15, List<OrderedDocumentByNumber> list, List<OrderedDocumentByNumber> list2) {
            this.query = str;
            this.isSearchActive = z15;
            this.filteredList = list;
            this.originalList = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content b(Content content, String str, boolean z15, List list, List list2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = content.query;
            }
            if ((i15 & 2) != 0) {
                z15 = content.isSearchActive;
            }
            if ((i15 & 4) != 0) {
                list = content.filteredList;
            }
            if ((i15 & 8) != 0) {
                list2 = content.originalList;
            }
            return content.a(str, z15, list, list2);
        }

        public final Content a(String query, boolean isSearchActive, List<OrderedDocumentByNumber> filteredList, List<OrderedDocumentByNumber> originalList) {
            return new Content(query, isSearchActive, filteredList, originalList);
        }

        public final List<OrderedDocumentByNumber> c() {
            return this.filteredList;
        }

        public final List<OrderedDocumentByNumber> d() {
            return this.originalList;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return fr.t.c(this.query, content.query) && this.isSearchActive == content.isSearchActive && fr.t.c(this.filteredList, content.filteredList) && fr.t.c(this.originalList, content.originalList);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSearchActive() {
            return this.isSearchActive;
        }

        public int hashCode() {
            return (((((this.query.hashCode() * 31) + Boolean.hashCode(this.isSearchActive)) * 31) + this.filteredList.hashCode()) * 31) + this.originalList.hashCode();
        }

        public String toString() {
            return "Content(query=" + this.query + ", isSearchActive=" + this.isSearchActive + ", filteredList=" + this.filteredList + ", originalList=" + this.originalList + ')';
        }
    }

    /* JADX INFO: renamed from: dh2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldh2/b$b;", "Ldh2/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0932b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0932b f42575a = new C0932b();

        private C0932b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C0932b);
        }

        public int hashCode() {
            return 2091319916;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: renamed from: dh2.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldh2/b$c;", "Ldh2/b;", "Lhb4/c;", "adapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c adapter;

        public Error(hb4.c cVar) {
            this.adapter = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getAdapter() {
            return this.adapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.adapter, ((Error) other).adapter);
        }

        public int hashCode() {
            return this.adapter.hashCode();
        }

        public String toString() {
            return "Error(adapter=" + this.adapter + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldh2/b$d;", "Ldh2/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f42577a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 206129169;
        }

        public String toString() {
            return "Init";
        }
    }
}
