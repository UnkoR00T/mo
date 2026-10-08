package te1;

import java.util.List;
import ld1.CompanyPkdCode;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: te1.p, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"Lte1/p;", "", "", "Lte1/p$a;", "pkdCodeItems", "", "isSearchActive", "", "searchQuery", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "a", "(Ljava/util/List;ZLjava/lang/String;)Lte1/p;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "e", "()Z", "Ljava/lang/String;", "d", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PkdCodeItem> pkdCodeItems;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSearchActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchQuery;

    /* JADX INFO: renamed from: te1.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lte1/p$a;", "", "Lld1/g;", "pkdCode", "", "isChecked", "<init>", "(Lld1/g;Z)V", "a", "(Lld1/g;Z)Lte1/p$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lld1/g;", "c", "()Lld1/g;", "b", "Z", "d", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PkdCodeItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanyPkdCode pkdCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isChecked;

        public PkdCodeItem(CompanyPkdCode companyPkdCode, boolean z15) {
            this.pkdCode = companyPkdCode;
            this.isChecked = z15;
        }

        public static /* synthetic */ PkdCodeItem b(PkdCodeItem pkdCodeItem, CompanyPkdCode companyPkdCode, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                companyPkdCode = pkdCodeItem.pkdCode;
            }
            if ((i15 & 2) != 0) {
                z15 = pkdCodeItem.isChecked;
            }
            return pkdCodeItem.a(companyPkdCode, z15);
        }

        public final PkdCodeItem a(CompanyPkdCode pkdCode, boolean isChecked) {
            return new PkdCodeItem(pkdCode, isChecked);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CompanyPkdCode getPkdCode() {
            return this.pkdCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PkdCodeItem)) {
                return false;
            }
            PkdCodeItem pkdCodeItem = (PkdCodeItem) other;
            return fr.t.c(this.pkdCode, pkdCodeItem.pkdCode) && this.isChecked == pkdCodeItem.isChecked;
        }

        public int hashCode() {
            return (this.pkdCode.hashCode() * 31) + Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "PkdCodeItem(pkdCode=" + this.pkdCode + ", isChecked=" + this.isChecked + ')';
        }
    }

    public FormData(List<PkdCodeItem> list, boolean z15, String str) {
        this.pkdCodeItems = list;
        this.isSearchActive = z15;
        this.searchQuery = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormData b(FormData formData, List list, boolean z15, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = formData.pkdCodeItems;
        }
        if ((i15 & 2) != 0) {
            z15 = formData.isSearchActive;
        }
        if ((i15 & 4) != 0) {
            str = formData.searchQuery;
        }
        return formData.a(list, z15, str);
    }

    public final FormData a(List<PkdCodeItem> pkdCodeItems, boolean isSearchActive, String searchQuery) {
        return new FormData(pkdCodeItems, isSearchActive, searchQuery);
    }

    public final List<PkdCodeItem> c() {
        return this.pkdCodeItems;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormData)) {
            return false;
        }
        FormData formData = (FormData) other;
        return fr.t.c(this.pkdCodeItems, formData.pkdCodeItems) && this.isSearchActive == formData.isSearchActive && fr.t.c(this.searchQuery, formData.searchQuery);
    }

    public int hashCode() {
        return (((this.pkdCodeItems.hashCode() * 31) + Boolean.hashCode(this.isSearchActive)) * 31) + this.searchQuery.hashCode();
    }

    public String toString() {
        return "FormData(pkdCodeItems=" + this.pkdCodeItems + ", isSearchActive=" + this.isSearchActive + ", searchQuery=" + this.searchQuery + ')';
    }
}
