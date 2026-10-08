package cc0;

import bc0.FamilyCardBottomSheetData;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import o20.BaseDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcc0/m;", "Ll00/e;", "Lcc0/m$a;", "Li70/n;", "a", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcc0/m$a;", "", "b", "c", "a", "Lcc0/m$a$a;", "Lcc0/m$a$b;", "Lcc0/m$a$c;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: cc0.m$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcc0/m$a$a;", "Lcc0/m$a;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c error;

            public Error(hb4.c cVar) {
                this.error = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcc0/m$a$b;", "Lcc0/m$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f25238a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1254817777;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: cc0.m$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b'\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b#\u00106R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b,\u0010:\u001a\u0004\b.\u0010;R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b4\u0010=¨\u0006>"}, d2 = {"Lcc0/m$a$c;", "Lcc0/m$a;", "Li50/a;", "scaffoldData", "Ly30/n$b;", "controllersData", "Lo20/k;", "screenData", "", "Ln50/k;", "familyMembers", "Lg30/n;", "bottomSheetData", "Lbc0/c;", "bottomSheetContentData", "Lkotlin/Function1;", "", "Loq/i0;", "showCodeBottomSheet", "Lcb4/i;", "dialogVMSAdapter", "Lkotlin/Function0;", "onBack", "<init>", "(Li50/a;Ly30/n$b;Lo20/k;Ljava/util/List;Lg30/n;Lbc0/c;Ler/l;Lcb4/i;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Ly30/n$b;", "c", "()Ly30/n$b;", "Lo20/k;", "h", "()Lo20/k;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lg30/n;", "()Lg30/n;", "f", "Lbc0/c;", "()Lbc0/c;", "Ler/l;", "i", "()Ler/l;", "Lcb4/i;", "()Lcb4/i;", "Ler/a;", "()Ler/a;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseDocumentData screenData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> familyMembers;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final FamilyCardBottomSheetData bottomSheetContentData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, oq.i0> showCodeBottomSheet;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, BaseDocumentData baseDocumentData, List<? extends n50.k> list, ModalBottomSheetData modalBottomSheetData, FamilyCardBottomSheetData familyCardBottomSheetData, er.l<? super Boolean, oq.i0> lVar, cb4.i iVar, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.controllersData = r15;
                this.screenData = baseDocumentData;
                this.familyMembers = list;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = familyCardBottomSheetData;
                this.showCodeBottomSheet = lVar;
                this.dialogVMSAdapter = iVar;
                this.onBack = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FamilyCardBottomSheetData getBottomSheetContentData() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public final List<n50.k> e() {
                return this.familyMembers;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.controllersData, initialized.controllersData) && fr.t.c(this.screenData, initialized.screenData) && fr.t.c(this.familyMembers, initialized.familyMembers) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData) && fr.t.c(this.showCodeBottomSheet, initialized.showCodeBottomSheet) && fr.t.c(this.dialogVMSAdapter, initialized.dialogVMSAdapter) && fr.t.c(this.onBack, initialized.onBack);
            }

            public final er.a<oq.i0> f() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final BaseDocumentData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                int iHashCode = this.scaffoldData.hashCode() * 31;
                y30.n.Switch r15 = this.controllersData;
                int iHashCode2 = (((((((((((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.screenData.hashCode()) * 31) + this.familyMembers.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.onBack.hashCode();
            }

            public final er.l<Boolean, oq.i0> i() {
                return this.showCodeBottomSheet;
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", controllersData=" + this.controllersData + ", screenData=" + this.screenData + ", familyMembers=" + this.familyMembers + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", onBack=" + this.onBack + ')';
            }
        }
    }
}
