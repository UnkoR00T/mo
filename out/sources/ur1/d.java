package ur1;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.List;
import p071kotlin.Metadata;
import vr1.DropDownDocumentListData;
import vr1.LocalNotificationItem;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lur1/d;", "Ll00/e;", "Lur1/d$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lur1/d$a;", "", "<init>", "()V", "b", "a", "Lur1/d$a$a;", "Lur1/d$a$b;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: ur1.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b0\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010A\u001a\u0004\bB\u0010CR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u00108\u0006¢\u0006\f\n\u0004\bB\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bG\u0010MR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b2\u0010N\u001a\u0004\b:\u0010OR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bE\u0010P\u001a\u0004\b4\u0010QR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b9\u0010R\u001a\u0004\b8\u0010SR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b6\u0010T\u001a\u0004\bK\u0010$R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bI\u0010U\u001a\u0004\b=\u0010V¨\u0006W"}, d2 = {"Lur1/d$a$a;", "Lur1/d$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lh30/a;", "sendButton", "removeButton", "Lg30/n;", "bottomSheetData", "Lj40/a;", "dropDownButtonData", "Lvr1/c;", "dropDownDocumentListData", "Lkotlin/Function1;", "Lg30/v;", "onSheetValueChange", "sheetValue", "", "Lvr1/e;", "localNotifications", "Lhz/b;", "dataInputError", "Lvr1/d;", "configSection", "Ly30/n$b;", "controllersData", "", "nextCheck", "Lcb4/i;", "dialogVMS", "<init>", "(Li50/a;Ler/a;Lh30/a;Lh30/a;Lg30/n;Lj40/a;Lvr1/c;Ler/l;Lg30/v;Ljava/util/List;Lhz/b;Lvr1/d;Ly30/n$b;Ljava/lang/String;Lcb4/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ler/a;", "k", "()Ler/a;", "c", "Lh30/a;", "n", "()Lh30/a;", "d", "m", "e", "Lg30/n;", "()Lg30/n;", "f", "Lj40/a;", "g", "()Lj40/a;", "Lvr1/c;", "h", "()Lvr1/c;", "Ler/l;", "l", "()Ler/l;", "i", "Lg30/v;", "o", "()Lg30/v;", "j", "Ljava/util/List;", "()Ljava/util/List;", "Lhz/b;", "()Lhz/b;", "Lvr1/d;", "()Lvr1/d;", "Ly30/n$b;", "()Ly30/n$b;", "Ljava/lang/String;", "Lcb4/i;", "()Lcb4/i;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DataSet extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData sendButton;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData removeButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownButtonData dropDownButtonData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownDocumentListData dropDownDocumentListData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<g30.v, oq.i0> onSheetValueChange;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final g30.v sheetValue;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<LocalNotificationItem> localNotifications;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final hz.b dataInputError;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final vr1.d configSection;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String nextCheck;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            /* JADX WARN: Multi-variable type inference failed */
            public DataSet(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, ButtonData buttonData, ButtonData buttonData2, ModalBottomSheetData modalBottomSheetData, DropDownButtonData dropDownButtonData, DropDownDocumentListData dropDownDocumentListData, er.l<? super g30.v, oq.i0> lVar, g30.v vVar, List<LocalNotificationItem> list, hz.b bVar, vr1.d dVar, y30.n.Switch r15, String str, cb4.i iVar) {
                super(null);
                this.baseScaffoldData = baseScaffoldData;
                this.onBackAction = aVar;
                this.sendButton = buttonData;
                this.removeButton = buttonData2;
                this.bottomSheetData = modalBottomSheetData;
                this.dropDownButtonData = dropDownButtonData;
                this.dropDownDocumentListData = dropDownDocumentListData;
                this.onSheetValueChange = lVar;
                this.sheetValue = vVar;
                this.localNotifications = list;
                this.dataInputError = bVar;
                this.configSection = dVar;
                this.controllersData = r15;
                this.nextCheck = str;
                this.dialogVMS = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final vr1.d getConfigSection() {
                return this.configSection;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final hz.b getDataInputError() {
                return this.dataInputError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataSet)) {
                    return false;
                }
                DataSet dataSet = (DataSet) other;
                return fr.t.c(this.baseScaffoldData, dataSet.baseScaffoldData) && fr.t.c(this.onBackAction, dataSet.onBackAction) && fr.t.c(this.sendButton, dataSet.sendButton) && fr.t.c(this.removeButton, dataSet.removeButton) && fr.t.c(this.bottomSheetData, dataSet.bottomSheetData) && fr.t.c(this.dropDownButtonData, dataSet.dropDownButtonData) && fr.t.c(this.dropDownDocumentListData, dataSet.dropDownDocumentListData) && fr.t.c(this.onSheetValueChange, dataSet.onSheetValueChange) && this.sheetValue == dataSet.sheetValue && fr.t.c(this.localNotifications, dataSet.localNotifications) && fr.t.c(this.dataInputError, dataSet.dataInputError) && fr.t.c(this.configSection, dataSet.configSection) && fr.t.c(this.controllersData, dataSet.controllersData) && fr.t.c(this.nextCheck, dataSet.nextCheck) && fr.t.c(this.dialogVMS, dataSet.dialogVMS);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final DropDownButtonData getDropDownButtonData() {
                return this.dropDownButtonData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final DropDownDocumentListData getDropDownDocumentListData() {
                return this.dropDownDocumentListData;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.sendButton.hashCode()) * 31) + this.removeButton.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.dropDownButtonData.hashCode()) * 31) + this.dropDownDocumentListData.hashCode()) * 31) + this.onSheetValueChange.hashCode()) * 31) + this.sheetValue.hashCode()) * 31) + this.localNotifications.hashCode()) * 31) + this.dataInputError.hashCode()) * 31) + this.configSection.hashCode()) * 31;
                y30.n.Switch r15 = this.controllersData;
                int iHashCode2 = (((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.nextCheck.hashCode()) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
            }

            public final List<LocalNotificationItem> i() {
                return this.localNotifications;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getNextCheck() {
                return this.nextCheck;
            }

            public final er.a<oq.i0> k() {
                return this.onBackAction;
            }

            public final er.l<g30.v, oq.i0> l() {
                return this.onSheetValueChange;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final ButtonData getRemoveButton() {
                return this.removeButton;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final ButtonData getSendButton() {
                return this.sendButton;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final g30.v getSheetValue() {
                return this.sheetValue;
            }

            public String toString() {
                return "DataSet(baseScaffoldData=" + this.baseScaffoldData + ", onBackAction=" + this.onBackAction + ", sendButton=" + this.sendButton + ", removeButton=" + this.removeButton + ", bottomSheetData=" + this.bottomSheetData + ", dropDownButtonData=" + this.dropDownButtonData + ", dropDownDocumentListData=" + this.dropDownDocumentListData + ", onSheetValueChange=" + this.onSheetValueChange + ", sheetValue=" + this.sheetValue + ", localNotifications=" + this.localNotifications + ", dataInputError=" + this.dataInputError + ", configSection=" + this.configSection + ", controllersData=" + this.controllersData + ", nextCheck=" + this.nextCheck + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lur1/d$a$b;", "Lur1/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f200202a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1949611070;
            }

            public String toString() {
                return "Initial";
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
