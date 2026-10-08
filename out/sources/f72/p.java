package f72;

import h72.SingleCardTextIconData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.List;
import java.util.Map;
import mx.Label;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lf72/p;", "Ll00/e;", "Lf72/p$a;", "a", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lf72/p$a;", "", "a", "b", "Lf72/p$a$a;", "Lf72/p$a$b;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: f72.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf72/p$a$a;", "Lf72/p$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1348a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1348a f59819a = new C1348a();

            private C1348a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1348a);
            }

            public int hashCode() {
                return 1846917683;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: f72.p$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b2\u00105R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b*\u00101R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b&\u00101R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b,\u00107\u001a\u0004\b.\u00108R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b6\u0010;R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)¨\u0006>"}, d2 = {"Lf72/p$a$b;", "Lf72/p$a;", "Lj40/a;", "dropDownButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "", "voivodeshipPickerVisible", "Lmx/a;", "voivodeshipPickerSectionHeader", "selectedVoivodeship", "", "", "Ln50/g;", "hydroWarnings", "emptyStateTitle", "emptyStateDescription", "Lh72/a;", "headerData", "Li50/a;", "scaffoldData", "openVoivodeshipPicker", "<init>", "(Lj40/a;Ler/a;ZLmx/a;Lmx/a;Ljava/util/Map;Lmx/a;Lmx/a;Lh72/a;Li50/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lj40/a;", "()Lj40/a;", "b", "Ler/a;", "f", "()Ler/a;", "c", "Z", "i", "()Z", "d", "Lmx/a;", "h", "()Lmx/a;", "e", "getSelectedVoivodeship", "Ljava/util/Map;", "()Ljava/util/Map;", "g", "Lh72/a;", "()Lh72/a;", "j", "Li50/a;", "()Li50/a;", "k", "getOpenVoivodeshipPicker", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownButtonData dropDownButtonData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean voivodeshipPickerVisible;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label voivodeshipPickerSectionHeader;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label selectedVoivodeship;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map<Label, List<DefaultSingleCardData>> hydroWarnings;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label emptyStateTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label emptyStateDescription;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final SingleCardTextIconData headerData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> openVoivodeshipPicker;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(DropDownButtonData dropDownButtonData, er.a<i0> aVar, boolean z15, Label label, Label label2, Map<Label, ? extends List<DefaultSingleCardData>> map, Label label3, Label label4, SingleCardTextIconData singleCardTextIconData, BaseScaffoldData baseScaffoldData, er.a<i0> aVar2) {
                this.dropDownButtonData = dropDownButtonData;
                this.onBackClick = aVar;
                this.voivodeshipPickerVisible = z15;
                this.voivodeshipPickerSectionHeader = label;
                this.selectedVoivodeship = label2;
                this.hydroWarnings = map;
                this.emptyStateTitle = label3;
                this.emptyStateDescription = label4;
                this.headerData = singleCardTextIconData;
                this.scaffoldData = baseScaffoldData;
                this.openVoivodeshipPicker = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DropDownButtonData getDropDownButtonData() {
                return this.dropDownButtonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getEmptyStateDescription() {
                return this.emptyStateDescription;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getEmptyStateTitle() {
                return this.emptyStateTitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final SingleCardTextIconData getHeaderData() {
                return this.headerData;
            }

            public final Map<Label, List<DefaultSingleCardData>> e() {
                return this.hydroWarnings;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.dropDownButtonData, initialized.dropDownButtonData) && fr.t.c(this.onBackClick, initialized.onBackClick) && this.voivodeshipPickerVisible == initialized.voivodeshipPickerVisible && fr.t.c(this.voivodeshipPickerSectionHeader, initialized.voivodeshipPickerSectionHeader) && fr.t.c(this.selectedVoivodeship, initialized.selectedVoivodeship) && fr.t.c(this.hydroWarnings, initialized.hydroWarnings) && fr.t.c(this.emptyStateTitle, initialized.emptyStateTitle) && fr.t.c(this.emptyStateDescription, initialized.emptyStateDescription) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.openVoivodeshipPicker, initialized.openVoivodeshipPicker);
            }

            public final er.a<i0> f() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getVoivodeshipPickerSectionHeader() {
                return this.voivodeshipPickerSectionHeader;
            }

            public int hashCode() {
                int iHashCode = ((((((this.dropDownButtonData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + Boolean.hashCode(this.voivodeshipPickerVisible)) * 31) + this.voivodeshipPickerSectionHeader.hashCode()) * 31;
                Label label = this.selectedVoivodeship;
                return ((((((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.hydroWarnings.hashCode()) * 31) + this.emptyStateTitle.hashCode()) * 31) + this.emptyStateDescription.hashCode()) * 31) + this.headerData.hashCode()) * 31) + this.scaffoldData.hashCode()) * 31) + this.openVoivodeshipPicker.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final boolean getVoivodeshipPickerVisible() {
                return this.voivodeshipPickerVisible;
            }

            public String toString() {
                return "Initialized(dropDownButtonData=" + this.dropDownButtonData + ", onBackClick=" + this.onBackClick + ", voivodeshipPickerVisible=" + this.voivodeshipPickerVisible + ", voivodeshipPickerSectionHeader=" + this.voivodeshipPickerSectionHeader + ", selectedVoivodeship=" + this.selectedVoivodeship + ", hydroWarnings=" + this.hydroWarnings + ", emptyStateTitle=" + this.emptyStateTitle + ", emptyStateDescription=" + this.emptyStateDescription + ", headerData=" + this.headerData + ", scaffoldData=" + this.scaffoldData + ", openVoivodeshipPicker=" + this.openVoivodeshipPicker + ')';
            }
        }
    }
}
