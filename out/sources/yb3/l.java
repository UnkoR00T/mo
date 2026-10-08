package yb3;

import cc3.ScrollableField;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lyb3/l;", "Ll00/e;", "Lyb3/l$a;", "a", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lyb3/l$a;", "", "b", "a", "Lyb3/l$a$a;", "Lyb3/l$a$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: yb3.l$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b\"\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b\u001e\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b&\u00100¨\u00061"}, d2 = {"Lyb3/l$a$a;", "Lyb3/l$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "header", "description", "", "Lyb3/l$a$a$a;", "stages", "Lh30/a;", "buttonData", "Lcc3/a;", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ljava/util/List;Lh30/a;Lcc3/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "Lh30/a;", "()Lh30/a;", "f", "Lcc3/a;", "()Lcc3/a;", "Ler/a;", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<StageData> stages;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ScrollableField scrollToField;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onScrolledToField;

            /* JADX INFO: renamed from: yb3.l$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b\u001a\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b \u0010\u001f¨\u0006,"}, d2 = {"Lyb3/l$a$a$a;", "", "", "id", "Lmx/a;", "header", "Lj30/a;", "removeButton", "Lv40/a;", "input", "Lyb3/l$a$a$a$a;", "placeData", "Lh30/a;", "addNextButton", "helperText", "<init>", "(Ljava/lang/String;Lmx/a;Lj30/a;Lv40/a;Lyb3/l$a$a$a$a;Lh30/a;Lmx/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lmx/a;", "()Lmx/a;", "c", "Lj30/a;", "g", "()Lj30/a;", "Lv40/a;", "e", "()Lv40/a;", "Lyb3/l$a$a$a$a;", "f", "()Lyb3/l$a$a$a$a;", "Lh30/a;", "()Lh30/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class StageData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String id;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label header;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonTextData removeButton;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final InputDateTimeData input;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final PlaceData placeData;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData addNextButton;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label helperText;

                /* JADX INFO: renamed from: yb3.l$a$a$a$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lyb3/l$a$a$a$a;", "", "Ln50/k;", "card", "Lmx/a;", "errorLabel", "<init>", "(Ln50/k;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln50/k;", "()Ln50/k;", "b", "Lmx/a;", "()Lmx/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class PlaceData {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final n50.k card;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label errorLabel;

                    public PlaceData(n50.k kVar, Label label) {
                        this.card = kVar;
                        this.errorLabel = label;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final n50.k getCard() {
                        return this.card;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final Label getErrorLabel() {
                        return this.errorLabel;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof PlaceData)) {
                            return false;
                        }
                        PlaceData placeData = (PlaceData) other;
                        return fr.t.c(this.card, placeData.card) && fr.t.c(this.errorLabel, placeData.errorLabel);
                    }

                    public int hashCode() {
                        int iHashCode = this.card.hashCode() * 31;
                        Label label = this.errorLabel;
                        return iHashCode + (label == null ? 0 : label.hashCode());
                    }

                    public String toString() {
                        return "PlaceData(card=" + this.card + ", errorLabel=" + this.errorLabel + ')';
                    }
                }

                public StageData(String str, Label label, ButtonTextData buttonTextData, InputDateTimeData inputDateTimeData, PlaceData placeData, ButtonData buttonData, Label label2) {
                    this.id = str;
                    this.header = label;
                    this.removeButton = buttonTextData;
                    this.input = inputDateTimeData;
                    this.placeData = placeData;
                    this.addNextButton = buttonData;
                    this.helperText = label2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final ButtonData getAddNextButton() {
                    return this.addNextButton;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getHeader() {
                    return this.header;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Label getHelperText() {
                    return this.helperText;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final InputDateTimeData getInput() {
                    return this.input;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof StageData)) {
                        return false;
                    }
                    StageData stageData = (StageData) other;
                    return fr.t.c(this.id, stageData.id) && fr.t.c(this.header, stageData.header) && fr.t.c(this.removeButton, stageData.removeButton) && fr.t.c(this.input, stageData.input) && fr.t.c(this.placeData, stageData.placeData) && fr.t.c(this.addNextButton, stageData.addNextButton) && fr.t.c(this.helperText, stageData.helperText);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final PlaceData getPlaceData() {
                    return this.placeData;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final ButtonTextData getRemoveButton() {
                    return this.removeButton;
                }

                public int hashCode() {
                    int iHashCode = ((this.id.hashCode() * 31) + this.header.hashCode()) * 31;
                    ButtonTextData buttonTextData = this.removeButton;
                    int iHashCode2 = (((((iHashCode + (buttonTextData == null ? 0 : buttonTextData.hashCode())) * 31) + this.input.hashCode()) * 31) + this.placeData.hashCode()) * 31;
                    ButtonData buttonData = this.addNextButton;
                    int iHashCode3 = (iHashCode2 + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
                    Label label = this.helperText;
                    return iHashCode3 + (label != null ? label.hashCode() : 0);
                }

                public String toString() {
                    return "StageData(id=" + this.id + ", header=" + this.header + ", removeButton=" + this.removeButton + ", input=" + this.input + ", placeData=" + this.placeData + ", addNextButton=" + this.addNextButton + ", helperText=" + this.helperText + ')';
                }
            }

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, List<StageData> list, ButtonData buttonData, ScrollableField scrollableField, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.header = label;
                this.description = label2;
                this.stages = list;
                this.buttonData = buttonData;
                this.scrollToField = scrollableField;
                this.onScrolledToField = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            public final er.a<oq.i0> d() {
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
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.header, initialized.header) && fr.t.c(this.description, initialized.description) && fr.t.c(this.stages, initialized.stages) && fr.t.c(this.buttonData, initialized.buttonData) && fr.t.c(this.scrollToField, initialized.scrollToField) && fr.t.c(this.onScrolledToField, initialized.onScrolledToField);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ScrollableField getScrollToField() {
                return this.scrollToField;
            }

            public final List<StageData> g() {
                return this.stages;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.scaffoldData.hashCode() * 31) + this.header.hashCode()) * 31) + this.description.hashCode()) * 31) + this.stages.hashCode()) * 31) + this.buttonData.hashCode()) * 31;
                ScrollableField scrollableField = this.scrollToField;
                return ((iHashCode + (scrollableField == null ? 0 : scrollableField.hashCode())) * 31) + this.onScrolledToField.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", header=" + this.header + ", description=" + this.description + ", stages=" + this.stages + ", buttonData=" + this.buttonData + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyb3/l$a$b;", "Lyb3/l$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f226262a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 714334452;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
