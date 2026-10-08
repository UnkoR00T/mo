package mr1;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmr1/f;", "Ll00/e;", "Lmr1/f$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: mr1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b \u0010.R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lmr1/f$a;", "", "Li50/a;", "baseScaffoldData", "Lg30/n;", "modalBottomSheetData", "", "Lmx/a;", "items", "selectedItem", "Lkotlin/Function1;", "Loq/i0;", "onItemSelected", "Lj40/a;", "dropDownButtonData", "Lkotlin/Function0;", "onCloseClick", "<init>", "(Li50/a;Lg30/n;Ljava/util/List;Lmx/a;Ler/l;Lj40/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lg30/n;", "d", "()Lg30/n;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lmx/a;", "f", "()Lmx/a;", "e", "Ler/l;", "()Ler/l;", "Lj40/a;", "()Lj40/a;", "g", "Ler/a;", "getOnCloseClick", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ModalBottomSheetData modalBottomSheetData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Label> items;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label selectedItem;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Label, i0> onItemSelected;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownButtonData dropDownButtonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, ModalBottomSheetData modalBottomSheetData, List<Label> list, Label label, er.l<? super Label, i0> lVar, DropDownButtonData dropDownButtonData, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.modalBottomSheetData = modalBottomSheetData;
            this.items = list;
            this.selectedItem = label;
            this.onItemSelected = lVar;
            this.dropDownButtonData = dropDownButtonData;
            this.onCloseClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DropDownButtonData getDropDownButtonData() {
            return this.dropDownButtonData;
        }

        public final List<Label> c() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ModalBottomSheetData getModalBottomSheetData() {
            return this.modalBottomSheetData;
        }

        public final er.l<Label, i0> e() {
            return this.onItemSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.modalBottomSheetData, data.modalBottomSheetData) && fr.t.c(this.items, data.items) && fr.t.c(this.selectedItem, data.selectedItem) && fr.t.c(this.onItemSelected, data.onItemSelected) && fr.t.c(this.dropDownButtonData, data.dropDownButtonData) && fr.t.c(this.onCloseClick, data.onCloseClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getSelectedItem() {
            return this.selectedItem;
        }

        public int hashCode() {
            int iHashCode = ((((this.baseScaffoldData.hashCode() * 31) + this.modalBottomSheetData.hashCode()) * 31) + this.items.hashCode()) * 31;
            Label label = this.selectedItem;
            return ((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.onItemSelected.hashCode()) * 31) + this.dropDownButtonData.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", modalBottomSheetData=" + this.modalBottomSheetData + ", items=" + this.items + ", selectedItem=" + this.selectedItem + ", onItemSelected=" + this.onItemSelected + ", dropDownButtonData=" + this.dropDownButtonData + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }
}
