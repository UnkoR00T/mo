package h31;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lh31/e;", "Ll00/e;", "Lh31/e$a;", "a", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lh31/e$a;", "", "b", "a", "Lh31/e$a$a;", "Lh31/e$a$b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: h31.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh31/e$a$a;", "Lh31/e$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(hb4.c cVar) {
                this.vmsAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.vmsAdapter, ((Error) other).vmsAdapter);
            }

            public int hashCode() {
                return this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: h31.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\u001dBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b(\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b\u001d\u00101¨\u00062"}, d2 = {"Lh31/e$a$b;", "Lh31/e$a;", "Li50/a;", "scaffoldData", "Lo40/a;", "headerData", "Lh31/e$a$b$b;", "typeSection", "Lh31/e$a$b$a;", "dataSection", "", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "Lh30/a;", "buttonData", "<init>", "(Li50/a;Lo40/a;Lh31/e$a$b$b;Lh31/e$a$b$a;ZLer/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Lh31/e$a$b$b;", "g", "()Lh31/e$a$b$b;", "d", "Lh31/e$a$b$a;", "()Lh31/e$a$b$a;", "Z", "f", "()Z", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Screen implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final TypeSection typeSection;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final DataSection dataSection;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToField;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onScrolledToField;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: h31.e$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lh31/e$a$b$a;", "", "Lmx/a;", "title", "Lv50/c;", "field", "Lv40/a;", "date", "<init>", "(Lmx/a;Lv50/c;Lv40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Lv50/c;", "()Lv50/c;", "Lv40/a;", "()Lv40/a;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DataSection {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f80400d = InputDateTimeData.f203769m | v50.c.f203957t;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final v50.c field;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final InputDateTimeData date;

                public DataSection(Label label, v50.c cVar, InputDateTimeData inputDateTimeData) {
                    this.title = label;
                    this.field = cVar;
                    this.date = inputDateTimeData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final InputDateTimeData getDate() {
                    return this.date;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final v50.c getField() {
                    return this.field;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DataSection)) {
                        return false;
                    }
                    DataSection dataSection = (DataSection) other;
                    return fr.t.c(this.title, dataSection.title) && fr.t.c(this.field, dataSection.field) && fr.t.c(this.date, dataSection.date);
                }

                public int hashCode() {
                    return (((this.title.hashCode() * 31) + this.field.hashCode()) * 31) + this.date.hashCode();
                }

                public String toString() {
                    return "DataSection(title=" + this.title + ", field=" + this.field + ", date=" + this.date + ')';
                }
            }

            /* JADX INFO: renamed from: h31.e$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh31/e$a$b$b;", "", "Lmx/a;", "title", "Ln30/b;", "cards", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TypeSection {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final CardListData cards;

                public TypeSection(Label label, CardListData cardListData) {
                    this.title = label;
                    this.cards = cardListData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final CardListData getCards() {
                    return this.cards;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TypeSection)) {
                        return false;
                    }
                    TypeSection typeSection = (TypeSection) other;
                    return fr.t.c(this.title, typeSection.title) && fr.t.c(this.cards, typeSection.cards);
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.cards.hashCode();
                }

                public String toString() {
                    return "TypeSection(title=" + this.title + ", cards=" + this.cards + ')';
                }
            }

            public Screen(BaseScaffoldData baseScaffoldData, o40.a aVar, TypeSection typeSection, DataSection dataSection, boolean z15, er.a<i0> aVar2, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.typeSection = typeSection;
                this.dataSection = dataSection;
                this.scrollToField = z15;
                this.onScrolledToField = aVar2;
                this.buttonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final DataSection getDataSection() {
                return this.dataSection;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            public final er.a<i0> d() {
                return this.onScrolledToField;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Screen)) {
                    return false;
                }
                Screen screen = (Screen) other;
                return fr.t.c(this.scaffoldData, screen.scaffoldData) && fr.t.c(this.headerData, screen.headerData) && fr.t.c(this.typeSection, screen.typeSection) && fr.t.c(this.dataSection, screen.dataSection) && this.scrollToField == screen.scrollToField && fr.t.c(this.onScrolledToField, screen.onScrolledToField) && fr.t.c(this.buttonData, screen.buttonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final boolean getScrollToField() {
                return this.scrollToField;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TypeSection getTypeSection() {
                return this.typeSection;
            }

            public int hashCode() {
                return (((((((((((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.typeSection.hashCode()) * 31) + this.dataSection.hashCode()) * 31) + Boolean.hashCode(this.scrollToField)) * 31) + this.onScrolledToField.hashCode()) * 31) + this.buttonData.hashCode();
            }

            public String toString() {
                return "Screen(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", typeSection=" + this.typeSection + ", dataSection=" + this.dataSection + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ", buttonData=" + this.buttonData + ')';
            }
        }
    }
}
