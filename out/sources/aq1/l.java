package aq1;

import g30.v;
import j40.DropDownButtonData;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003\u0007\b\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\nÀ\u0006\u0003"}, d2 = {"Laq1/l;", "", "Lmu/p0;", "Laq1/l$c;", "getState", "()Lmu/p0;", "state", "c", "a", "b", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Laq1/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        DROPDOWN_1,
        DROPDOWN_2,
        DROPDOWN_3;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f14049e = wq.b.a(b());
    }

    /* JADX INFO: renamed from: aq1.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Laq1/l$b;", "", "Lj40/a;", "dropDownData", "Laq1/l$a;", "openedDropType", "<init>", "(Lj40/a;Laq1/l$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj40/a;", "()Lj40/a;", "b", "Laq1/l$a;", "()Laq1/l$a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenedDropDownState {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f14050c = DropDownButtonData.f99359i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownButtonData dropDownData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a openedDropType;

        public OpenedDropDownState(DropDownButtonData dropDownButtonData, a aVar) {
            this.dropDownData = dropDownButtonData;
            this.openedDropType = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DropDownButtonData getDropDownData() {
            return this.dropDownData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getOpenedDropType() {
            return this.openedDropType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenedDropDownState)) {
                return false;
            }
            OpenedDropDownState openedDropDownState = (OpenedDropDownState) other;
            return fr.t.c(this.dropDownData, openedDropDownState.dropDownData) && this.openedDropType == openedDropDownState.openedDropType;
        }

        public int hashCode() {
            int iHashCode = this.dropDownData.hashCode() * 31;
            a aVar = this.openedDropType;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "OpenedDropDownState(dropDownData=" + this.dropDownData + ", openedDropType=" + this.openedDropType + ')';
        }
    }

    /* JADX INFO: renamed from: aq1.l$c, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000f\u0010\u0010Jp\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b+\u0010'¨\u0006,"}, d2 = {"Laq1/l$c;", "", "Lj40/a;", "dropDownData1", "dropDownData2", "dropDownData3", "Laq1/l$b;", "openedDropDownState", "Lkotlin/Function1;", "", "Loq/i0;", "onItemSelected", "Lg30/v;", "sheetValue", "onSheetValueChanged", "<init>", "(Lj40/a;Lj40/a;Lj40/a;Laq1/l$b;Ler/l;Lg30/v;Ler/l;)V", "a", "(Lj40/a;Lj40/a;Lj40/a;Laq1/l$b;Ler/l;Lg30/v;Ler/l;)Laq1/l$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj40/a;", "c", "()Lj40/a;", "b", "d", "e", "Laq1/l$b;", "h", "()Laq1/l$b;", "Ler/l;", "f", "()Ler/l;", "Lg30/v;", "i", "()Lg30/v;", "g", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class State {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f14053h = DropDownButtonData.f99359i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownButtonData dropDownData1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownButtonData dropDownData2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDownButtonData dropDownData3;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenedDropDownState openedDropDownState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Integer, i0> onItemSelected;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final v sheetValue;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<v, i0> onSheetValueChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public State(DropDownButtonData dropDownButtonData, DropDownButtonData dropDownButtonData2, DropDownButtonData dropDownButtonData3, OpenedDropDownState openedDropDownState, er.l<? super Integer, i0> lVar, v vVar, er.l<? super v, i0> lVar2) {
            this.dropDownData1 = dropDownButtonData;
            this.dropDownData2 = dropDownButtonData2;
            this.dropDownData3 = dropDownButtonData3;
            this.openedDropDownState = openedDropDownState;
            this.onItemSelected = lVar;
            this.sheetValue = vVar;
            this.onSheetValueChanged = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State b(State state, DropDownButtonData dropDownButtonData, DropDownButtonData dropDownButtonData2, DropDownButtonData dropDownButtonData3, OpenedDropDownState openedDropDownState, er.l lVar, v vVar, er.l lVar2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                dropDownButtonData = state.dropDownData1;
            }
            if ((i15 & 2) != 0) {
                dropDownButtonData2 = state.dropDownData2;
            }
            if ((i15 & 4) != 0) {
                dropDownButtonData3 = state.dropDownData3;
            }
            if ((i15 & 8) != 0) {
                openedDropDownState = state.openedDropDownState;
            }
            if ((i15 & 16) != 0) {
                lVar = state.onItemSelected;
            }
            if ((i15 & 32) != 0) {
                vVar = state.sheetValue;
            }
            if ((i15 & 64) != 0) {
                lVar2 = state.onSheetValueChanged;
            }
            v vVar2 = vVar;
            er.l lVar3 = lVar2;
            er.l lVar4 = lVar;
            DropDownButtonData dropDownButtonData4 = dropDownButtonData3;
            return state.a(dropDownButtonData, dropDownButtonData2, dropDownButtonData4, openedDropDownState, lVar4, vVar2, lVar3);
        }

        public final State a(DropDownButtonData dropDownData1, DropDownButtonData dropDownData2, DropDownButtonData dropDownData3, OpenedDropDownState openedDropDownState, er.l<? super Integer, i0> onItemSelected, v sheetValue, er.l<? super v, i0> onSheetValueChanged) {
            return new State(dropDownData1, dropDownData2, dropDownData3, openedDropDownState, onItemSelected, sheetValue, onSheetValueChanged);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DropDownButtonData getDropDownData1() {
            return this.dropDownData1;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DropDownButtonData getDropDownData2() {
            return this.dropDownData2;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final DropDownButtonData getDropDownData3() {
            return this.dropDownData3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return fr.t.c(this.dropDownData1, state.dropDownData1) && fr.t.c(this.dropDownData2, state.dropDownData2) && fr.t.c(this.dropDownData3, state.dropDownData3) && fr.t.c(this.openedDropDownState, state.openedDropDownState) && fr.t.c(this.onItemSelected, state.onItemSelected) && this.sheetValue == state.sheetValue && fr.t.c(this.onSheetValueChanged, state.onSheetValueChanged);
        }

        public final er.l<Integer, i0> f() {
            return this.onItemSelected;
        }

        public final er.l<v, i0> g() {
            return this.onSheetValueChanged;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final OpenedDropDownState getOpenedDropDownState() {
            return this.openedDropDownState;
        }

        public int hashCode() {
            int iHashCode = ((((this.dropDownData1.hashCode() * 31) + this.dropDownData2.hashCode()) * 31) + this.dropDownData3.hashCode()) * 31;
            OpenedDropDownState openedDropDownState = this.openedDropDownState;
            return ((((((iHashCode + (openedDropDownState == null ? 0 : openedDropDownState.hashCode())) * 31) + this.onItemSelected.hashCode()) * 31) + this.sheetValue.hashCode()) * 31) + this.onSheetValueChanged.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final v getSheetValue() {
            return this.sheetValue;
        }

        public String toString() {
            return "State(dropDownData1=" + this.dropDownData1 + ", dropDownData2=" + this.dropDownData2 + ", dropDownData3=" + this.dropDownData3 + ", openedDropDownState=" + this.openedDropDownState + ", onItemSelected=" + this.onItemSelected + ", sheetValue=" + this.sheetValue + ", onSheetValueChanged=" + this.onSheetValueChanged + ')';
        }
    }

    p0<State> getState();
}
