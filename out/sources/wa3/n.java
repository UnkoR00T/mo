package wa3;

import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.Map;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwa3/n;", "Ll00/e;", "Lwa3/n$a;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lwa3/n$a;", "", "d", "c", "e", "b", "a", "f", "Lwa3/n$a$b;", "Lwa3/n$a$c;", "Lwa3/n$a$d;", "Lwa3/n$a$e;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: wa3.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwa3/n$a$a;", "", "a", "b", "Lwa3/n$a$a$a;", "Lwa3/n$a$a$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC5570a {

            /* JADX INFO: renamed from: wa3.n$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lwa3/n$a$a$a;", "Lwa3/n$a$a;", "", "Lmx/a;", "Ln30/b;", "countryList", "<init>", "(Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class All implements InterfaceC5570a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Map<Label, CardListData> countryList;

                public All(Map<Label, CardListData> map) {
                    this.countryList = map;
                }

                public final Map<Label, CardListData> a() {
                    return this.countryList;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof All) && fr.t.c(this.countryList, ((All) other).countryList);
                }

                public int hashCode() {
                    return this.countryList.hashCode();
                }

                public String toString() {
                    return "All(countryList=" + this.countryList + ')';
                }
            }

            /* JADX INFO: renamed from: wa3.n$a$a$b */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwa3/n$a$a$b;", "Lwa3/n$a$a;", "a", "b", "Lwa3/n$a$a$b$a;", "Lwa3/n$a$a$b$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface b extends InterfaceC5570a {

                /* JADX INFO: renamed from: wa3.n$a$a$b$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwa3/n$a$a$b$a;", "Lwa3/n$a$a$b;", "Lk40/a;", "emptyData", "<init>", "(Lk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk40/a;", "()Lk40/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Empty implements b {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final int f211646b = EmptyStateData.f108236d;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final EmptyStateData emptyData;

                    public Empty(EmptyStateData emptyStateData) {
                        this.emptyData = emptyStateData;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final EmptyStateData getEmptyData() {
                        return this.emptyData;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Empty) && fr.t.c(this.emptyData, ((Empty) other).emptyData);
                    }

                    public int hashCode() {
                        return this.emptyData.hashCode();
                    }

                    public String toString() {
                        return "Empty(emptyData=" + this.emptyData + ')';
                    }
                }

                /* JADX INFO: renamed from: wa3.n$a$a$b$b, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwa3/n$a$a$b$b;", "Lwa3/n$a$a$b;", "Ln30/b;", "countryList", "<init>", "(Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "()Ln30/b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class WithContent implements b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final CardListData countryList;

                    public WithContent(CardListData cardListData) {
                        this.countryList = cardListData;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final CardListData getCountryList() {
                        return this.countryList;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof WithContent) && fr.t.c(this.countryList, ((WithContent) other).countryList);
                    }

                    public int hashCode() {
                        return this.countryList.hashCode();
                    }

                    public String toString() {
                        return "WithContent(countryList=" + this.countryList + ')';
                    }
                }
            }
        }

        /* JADX INFO: renamed from: wa3.n$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwa3/n$a$b;", "Lwa3/n$a;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(hb4.c cVar) {
                this.errorVMSAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMSAdapter, ((Error) other).errorVMSAdapter);
            }

            public int hashCode() {
                return this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: wa3.n$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0019\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b\u001d\u0010'¨\u0006("}, d2 = {"Lwa3/n$a$c;", "Lwa3/n$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "Lj50/e;", "searchBarData", "Ly30/n$b;", "controllerData", "Lwa3/n$a$a;", "countriesListType", "<init>", "(Li50/a;Lmx/a;Lj50/e;Ly30/n$b;Lwa3/n$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Lj50/e;", "e", "()Lj50/e;", "Ly30/n$b;", "()Ly30/n$b;", "Lwa3/n$a$a;", "()Lwa3/n$a$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f211650f = y30.n.Switch.f223693f | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final SearchBarData searchBarData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllerData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC5570a countriesListType;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, SearchBarData searchBarData, y30.n.Switch r15, InterfaceC5570a interfaceC5570a) {
                this.scaffoldData = baseScaffoldData;
                this.description = label;
                this.searchBarData = searchBarData;
                this.controllerData = r15;
                this.countriesListType = interfaceC5570a;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final y30.n.Switch getControllerData() {
                return this.controllerData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final InterfaceC5570a getCountriesListType() {
                return this.countriesListType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final SearchBarData getSearchBarData() {
                return this.searchBarData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.description, initialized.description) && fr.t.c(this.searchBarData, initialized.searchBarData) && fr.t.c(this.controllerData, initialized.controllerData) && fr.t.c(this.countriesListType, initialized.countriesListType);
            }

            public int hashCode() {
                return (((((((this.scaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.searchBarData.hashCode()) * 31) + this.controllerData.hashCode()) * 31) + this.countriesListType.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", searchBarData=" + this.searchBarData + ", controllerData=" + this.controllerData + ", countriesListType=" + this.countriesListType + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwa3/n$a$d;", "Lwa3/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f211656a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 974166178;
            }

            public String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: renamed from: wa3.n$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lwa3/n$a$e;", "Lwa3/n$a;", "Li50/a;", "scaffoldData", "Lj50/e;", "searchBarData", "Lwa3/n$a$f;", "searchListData", "<init>", "(Li50/a;Lj50/e;Lwa3/n$a$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lj50/e;", "()Lj50/e;", "c", "Lwa3/n$a$f;", "()Lwa3/n$a$f;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Search implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f211657d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SearchBarData searchBarData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final f searchListData;

            public Search(BaseScaffoldData baseScaffoldData, SearchBarData searchBarData, f fVar) {
                this.scaffoldData = baseScaffoldData;
                this.searchBarData = searchBarData;
                this.searchListData = fVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final SearchBarData getSearchBarData() {
                return this.searchBarData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final f getSearchListData() {
                return this.searchListData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Search)) {
                    return false;
                }
                Search search = (Search) other;
                return fr.t.c(this.scaffoldData, search.scaffoldData) && fr.t.c(this.searchBarData, search.searchBarData) && fr.t.c(this.searchListData, search.searchListData);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.searchBarData.hashCode()) * 31) + this.searchListData.hashCode();
            }

            public String toString() {
                return "Search(scaffoldData=" + this.scaffoldData + ", searchBarData=" + this.searchBarData + ", searchListData=" + this.searchListData + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwa3/n$a$f;", "", "a", "b", "Lwa3/n$a$f$a;", "Lwa3/n$a$f$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface f {

            /* JADX INFO: renamed from: wa3.n$a$f$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwa3/n$a$f$a;", "Lwa3/n$a$f;", "Lk40/a;", "notFoundData", "<init>", "(Lk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk40/a;", "()Lk40/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class NotFound implements f {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f211661b = EmptyStateData.f108236d;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final EmptyStateData notFoundData;

                public NotFound(EmptyStateData emptyStateData) {
                    this.notFoundData = emptyStateData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final EmptyStateData getNotFoundData() {
                    return this.notFoundData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NotFound) && fr.t.c(this.notFoundData, ((NotFound) other).notFoundData);
                }

                public int hashCode() {
                    return this.notFoundData.hashCode();
                }

                public String toString() {
                    return "NotFound(notFoundData=" + this.notFoundData + ')';
                }
            }

            /* JADX INFO: renamed from: wa3.n$a$f$b, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwa3/n$a$f$b;", "Lwa3/n$a$f;", "Ln30/b;", "countryList", "<init>", "(Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "()Ln30/b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithContent implements f {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final CardListData countryList;

                public WithContent(CardListData cardListData) {
                    this.countryList = cardListData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final CardListData getCountryList() {
                    return this.countryList;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof WithContent) && fr.t.c(this.countryList, ((WithContent) other).countryList);
                }

                public int hashCode() {
                    return this.countryList.hashCode();
                }

                public String toString() {
                    return "WithContent(countryList=" + this.countryList + ')';
                }
            }
        }
    }
}
