package vg2;

import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvg2/c;", "Ll00/e;", "Lvg2/c$a;", "a", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\u0004\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lvg2/c$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBack", "c", "b", "Lvg2/c$a$a;", "Lvg2/c$a$b;", "Lvg2/c$a$c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: vg2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lvg2/c$a$a;", "Lvg2/c$a;", "Li50/a;", "b", "()Li50/a;", "baseScaffoldData", "a", "Lvg2/c$a$a$a;", "Lvg2/c$a$a$b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC5408a extends a {

            /* JADX INFO: renamed from: vg2.c$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b'\u00100¨\u00061"}, d2 = {"Lvg2/c$a$a$a;", "Lvg2/c$a$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lc30/b;", "info", "", "Ln50/k;", "registriesCards", "Lj50/e;", "searchBarData", "Lmx/a;", "noSearchResultLabelTitle", "noSearchResultLabelSubtitle", "<init>", "(Ler/a;Li50/a;Lc30/b;Ljava/util/List;Lj50/e;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lc30/b;", "()Lc30/b;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Lj50/e;", "g", "()Lj50/e;", "Lmx/a;", "()Lmx/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Cards implements InterfaceC5408a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<i0> onBack;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final c30.b info;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<n50.k> registriesCards;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final SearchBarData searchBarData;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label noSearchResultLabelTitle;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label noSearchResultLabelSubtitle;

                /* JADX WARN: Multi-variable type inference failed */
                public Cards(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, c30.b bVar, List<? extends n50.k> list, SearchBarData searchBarData, Label label, Label label2) {
                    this.onBack = aVar;
                    this.baseScaffoldData = baseScaffoldData;
                    this.info = bVar;
                    this.registriesCards = list;
                    this.searchBarData = searchBarData;
                    this.noSearchResultLabelTitle = label;
                    this.noSearchResultLabelSubtitle = label2;
                }

                @Override // vg2.c.a
                public er.a<i0> a() {
                    return this.onBack;
                }

                @Override // vg2.c.a.InterfaceC5408a
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final c30.b getInfo() {
                    return this.info;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final Label getNoSearchResultLabelSubtitle() {
                    return this.noSearchResultLabelSubtitle;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final Label getNoSearchResultLabelTitle() {
                    return this.noSearchResultLabelTitle;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Cards)) {
                        return false;
                    }
                    Cards cards = (Cards) other;
                    return fr.t.c(this.onBack, cards.onBack) && fr.t.c(this.baseScaffoldData, cards.baseScaffoldData) && fr.t.c(this.info, cards.info) && fr.t.c(this.registriesCards, cards.registriesCards) && fr.t.c(this.searchBarData, cards.searchBarData) && fr.t.c(this.noSearchResultLabelTitle, cards.noSearchResultLabelTitle) && fr.t.c(this.noSearchResultLabelSubtitle, cards.noSearchResultLabelSubtitle);
                }

                public final List<n50.k> f() {
                    return this.registriesCards;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final SearchBarData getSearchBarData() {
                    return this.searchBarData;
                }

                public int hashCode() {
                    int iHashCode = ((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31;
                    c30.b bVar = this.info;
                    return ((((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.registriesCards.hashCode()) * 31) + this.searchBarData.hashCode()) * 31) + this.noSearchResultLabelTitle.hashCode()) * 31) + this.noSearchResultLabelSubtitle.hashCode();
                }

                public String toString() {
                    return "Cards(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", info=" + this.info + ", registriesCards=" + this.registriesCards + ", searchBarData=" + this.searchBarData + ", noSearchResultLabelTitle=" + this.noSearchResultLabelTitle + ", noSearchResultLabelSubtitle=" + this.noSearchResultLabelSubtitle + ')';
                }
            }

            /* JADX INFO: renamed from: vg2.c$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvg2/c$a$a$b;", "Lvg2/c$a$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lq40/g;", "iconPageData", "<init>", "(Ler/a;Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lq40/g;", "()Lq40/g;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Empty implements InterfaceC5408a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<i0> onBack;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final IconPageData<?, ?> iconPageData;

                public Empty(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, IconPageData<?, ?> iconPageData) {
                    this.onBack = aVar;
                    this.baseScaffoldData = baseScaffoldData;
                    this.iconPageData = iconPageData;
                }

                @Override // vg2.c.a
                public er.a<i0> a() {
                    return this.onBack;
                }

                @Override // vg2.c.a.InterfaceC5408a
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                public final IconPageData<?, ?> c() {
                    return this.iconPageData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Empty)) {
                        return false;
                    }
                    Empty empty = (Empty) other;
                    return fr.t.c(this.onBack, empty.onBack) && fr.t.c(this.baseScaffoldData, empty.baseScaffoldData) && fr.t.c(this.iconPageData, empty.iconPageData);
                }

                public int hashCode() {
                    return (((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.iconPageData.hashCode();
                }

                public String toString() {
                    return "Empty(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ')';
                }
            }

            /* JADX INFO: renamed from: b */
            BaseScaffoldData getBaseScaffoldData();
        }

        /* JADX INFO: renamed from: vg2.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lvg2/c$a$b;", "Lvg2/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lhb4/c;", "adapter", "<init>", "(Ler/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lhb4/c;", "c", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c adapter;

            public Error(er.a<i0> aVar, hb4.c cVar) {
                this.onBack = aVar;
                this.adapter = cVar;
            }

            @Override // vg2.c.a
            public er.a<i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final hb4.c getAdapter() {
                return this.adapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.onBack, error.onBack) && fr.t.c(this.adapter, error.adapter);
            }

            public int hashCode() {
                return (this.onBack.hashCode() * 31) + this.adapter.hashCode();
            }

            public String toString() {
                return "Error(onBack=" + this.onBack + ", adapter=" + this.adapter + ')';
            }
        }

        /* JADX INFO: renamed from: vg2.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvg2/c$a$c;", "Lvg2/c$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            public Initial(er.a<i0> aVar) {
                this.onBack = aVar;
            }

            @Override // vg2.c.a
            public er.a<i0> a() {
                return this.onBack;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initial) && fr.t.c(this.onBack, ((Initial) other).onBack);
            }

            public int hashCode() {
                return this.onBack.hashCode();
            }

            public String toString() {
                return "Initial(onBack=" + this.onBack + ')';
            }
        }

        er.a<i0> a();
    }
}
