package ne0;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import java.util.List;
import me0.UutCardBottomSheetData;
import o20.BaseDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lne0/q;", "Ll00/e;", "Lne0/q$a;", "Li70/n;", "a", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface q extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lne0/q$a;", "", "b", "c", "a", "Lne0/q$a$a;", "Lne0/q$a$b;", "Lne0/q$a$c;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ne0.q$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lne0/q$a$a;", "Lne0/q$a;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lne0/q$a$b;", "Lne0/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f135044a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 342249983;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: ne0.q$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b!\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b%\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b,\u00106R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b0\u00108¨\u00069"}, d2 = {"Lne0/q$a$c;", "Lne0/q$a;", "Li50/a;", "scaffoldData", "Ly30/n$b;", "controllersData", "Lo20/k;", "screenData", "", "Ln50/k;", "uutMembers", "Lg30/n;", "bottomSheetData", "Lme0/d;", "bottomSheetUUTDocumentData", "Lcb4/i;", "dialogVMSAdapter", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Ly30/n$b;Lo20/k;Ljava/util/List;Lg30/n;Lme0/d;Lcb4/i;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Ly30/n$b;", "c", "()Ly30/n$b;", "Lo20/k;", "g", "()Lo20/k;", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "e", "Lg30/n;", "()Lg30/n;", "Lme0/d;", "()Lme0/d;", "Lcb4/i;", "()Lcb4/i;", "Ler/a;", "()Ler/a;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseDocumentData screenData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> uutMembers;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final UutCardBottomSheetData bottomSheetUUTDocumentData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, BaseDocumentData baseDocumentData, List<? extends n50.k> list, ModalBottomSheetData modalBottomSheetData, UutCardBottomSheetData uutCardBottomSheetData, cb4.i iVar, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.controllersData = r15;
                this.screenData = baseDocumentData;
                this.uutMembers = list;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetUUTDocumentData = uutCardBottomSheetData;
                this.dialogVMSAdapter = iVar;
                this.onBack = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final UutCardBottomSheetData getBottomSheetUUTDocumentData() {
                return this.bottomSheetUUTDocumentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public final er.a<oq.i0> e() {
                return this.onBack;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.controllersData, initialized.controllersData) && fr.t.c(this.screenData, initialized.screenData) && fr.t.c(this.uutMembers, initialized.uutMembers) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.bottomSheetUUTDocumentData, initialized.bottomSheetUUTDocumentData) && fr.t.c(this.dialogVMSAdapter, initialized.dialogVMSAdapter) && fr.t.c(this.onBack, initialized.onBack);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseDocumentData getScreenData() {
                return this.screenData;
            }

            public final List<n50.k> h() {
                return this.uutMembers;
            }

            public int hashCode() {
                int iHashCode = this.scaffoldData.hashCode() * 31;
                y30.n.Switch r15 = this.controllersData;
                int iHashCode2 = (((((((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.screenData.hashCode()) * 31) + this.uutMembers.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31;
                UutCardBottomSheetData uutCardBottomSheetData = this.bottomSheetUUTDocumentData;
                int iHashCode3 = (iHashCode2 + (uutCardBottomSheetData == null ? 0 : uutCardBottomSheetData.hashCode())) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return ((iHashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.onBack.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", controllersData=" + this.controllersData + ", screenData=" + this.screenData + ", uutMembers=" + this.uutMembers + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetUUTDocumentData=" + this.bottomSheetUUTDocumentData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", onBack=" + this.onBack + ')';
            }
        }
    }
}
