package iq3;

import oo0.IdeasRoundDetails;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Liq3/e;", "", "b", "a", "c", "Liq3/e$a;", "Liq3/e$b;", "Liq3/e$c;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: iq3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Liq3/e$a;", "Liq3/e;", "", "isVoteIdeaDevFFEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isVoteIdeaDevFFEnabled;

        public Empty(boolean z15) {
            this.isVoteIdeaDevFFEnabled = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsVoteIdeaDevFFEnabled() {
            return this.isVoteIdeaDevFFEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && this.isVoteIdeaDevFFEnabled == ((Empty) other).isVoteIdeaDevFFEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isVoteIdeaDevFFEnabled);
        }

        public String toString() {
            return "Empty(isVoteIdeaDevFFEnabled=" + this.isVoteIdeaDevFFEnabled + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liq3/e$b;", "Liq3/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f96567a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 32299211;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: iq3.e$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b$\u0010!¨\u0006%"}, d2 = {"Liq3/e$c;", "Liq3/e;", "Lkq3/a;", "selectedFilterCategory", "Loo0/r;", "ideasRoundDetails", "", "isSearchActive", "", "searchQuery", "isVoteIdeaDevFFEnabled", "<init>", "(Lkq3/a;Loo0/r;ZLjava/lang/String;Z)V", "a", "(Lkq3/a;Loo0/r;ZLjava/lang/String;Z)Liq3/e$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkq3/a;", "e", "()Lkq3/a;", "b", "Loo0/r;", "c", "()Loo0/r;", "Z", "f", "()Z", "d", "Ljava/lang/String;", "g", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kq3.a selectedFilterCategory;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdeasRoundDetails ideasRoundDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSearchActive;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchQuery;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isVoteIdeaDevFFEnabled;

        public Initialized(kq3.a aVar, IdeasRoundDetails ideasRoundDetails, boolean z15, String str, boolean z16) {
            this.selectedFilterCategory = aVar;
            this.ideasRoundDetails = ideasRoundDetails;
            this.isSearchActive = z15;
            this.searchQuery = str;
            this.isVoteIdeaDevFFEnabled = z16;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, kq3.a aVar, IdeasRoundDetails ideasRoundDetails, boolean z15, String str, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = initialized.selectedFilterCategory;
            }
            if ((i15 & 2) != 0) {
                ideasRoundDetails = initialized.ideasRoundDetails;
            }
            if ((i15 & 4) != 0) {
                z15 = initialized.isSearchActive;
            }
            if ((i15 & 8) != 0) {
                str = initialized.searchQuery;
            }
            if ((i15 & 16) != 0) {
                z16 = initialized.isVoteIdeaDevFFEnabled;
            }
            boolean z17 = z16;
            boolean z18 = z15;
            return initialized.a(aVar, ideasRoundDetails, z18, str, z17);
        }

        public final Initialized a(kq3.a selectedFilterCategory, IdeasRoundDetails ideasRoundDetails, boolean isSearchActive, String searchQuery, boolean isVoteIdeaDevFFEnabled) {
            return new Initialized(selectedFilterCategory, ideasRoundDetails, isSearchActive, searchQuery, isVoteIdeaDevFFEnabled);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final IdeasRoundDetails getIdeasRoundDetails() {
            return this.ideasRoundDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final kq3.a getSelectedFilterCategory() {
            return this.selectedFilterCategory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.selectedFilterCategory == initialized.selectedFilterCategory && fr.t.c(this.ideasRoundDetails, initialized.ideasRoundDetails) && this.isSearchActive == initialized.isSearchActive && fr.t.c(this.searchQuery, initialized.searchQuery) && this.isVoteIdeaDevFFEnabled == initialized.isVoteIdeaDevFFEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSearchActive() {
            return this.isSearchActive;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsVoteIdeaDevFFEnabled() {
            return this.isVoteIdeaDevFFEnabled;
        }

        public int hashCode() {
            return (((((((this.selectedFilterCategory.hashCode() * 31) + this.ideasRoundDetails.hashCode()) * 31) + Boolean.hashCode(this.isSearchActive)) * 31) + this.searchQuery.hashCode()) * 31) + Boolean.hashCode(this.isVoteIdeaDevFFEnabled);
        }

        public String toString() {
            return "Initialized(selectedFilterCategory=" + this.selectedFilterCategory + ", ideasRoundDetails=" + this.ideasRoundDetails + ", isSearchActive=" + this.isSearchActive + ", searchQuery=" + this.searchQuery + ", isVoteIdeaDevFFEnabled=" + this.isVoteIdeaDevFFEnabled + ')';
        }
    }
}
