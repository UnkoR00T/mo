package lb0;

import i50.BaseScaffoldData;
import n30.CardListData;
import o20.BaseDocumentData;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Llb0/n;", "Ll00/e;", "Llb0/n$a;", "Li70/n;", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Llb0/n$a;", "", "c", "d", "e", "b", "a", "Llb0/n$a$a;", "Llb0/n$a$b;", "Llb0/n$a$c;", "Llb0/n$a$d;", "Llb0/n$a$e;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: lb0.n$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Llb0/n$a$a;", "Llb0/n$a;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Llb0/n$a$b;", "Llb0/n$a;", "b", "a", "Llb0/n$a$b$a;", "Llb0/n$a$b$b;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface b extends a {

            /* JADX INFO: renamed from: lb0.n$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Llb0/n$a$b$a;", "Llb0/n$a$b;", "Li50/a;", "scaffoldData", "Lo20/k;", "screenData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lo20/k;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lo20/k;", "c", "()Lo20/k;", "Ler/a;", "()Ler/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Details implements b {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f117518d = BaseDocumentData.f140741h | BaseScaffoldData.f89350g;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData scaffoldData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseDocumentData screenData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackClick;

                public Details(BaseScaffoldData baseScaffoldData, BaseDocumentData baseDocumentData, er.a<oq.i0> aVar) {
                    this.scaffoldData = baseScaffoldData;
                    this.screenData = baseDocumentData;
                    this.onBackClick = aVar;
                }

                public final er.a<oq.i0> a() {
                    return this.onBackClick;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final BaseScaffoldData getScaffoldData() {
                    return this.scaffoldData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final BaseDocumentData getScreenData() {
                    return this.screenData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Details)) {
                        return false;
                    }
                    Details details = (Details) other;
                    return fr.t.c(this.scaffoldData, details.scaffoldData) && fr.t.c(this.screenData, details.screenData) && fr.t.c(this.onBackClick, details.onBackClick);
                }

                public int hashCode() {
                    return (((this.scaffoldData.hashCode() * 31) + this.screenData.hashCode()) * 31) + this.onBackClick.hashCode();
                }

                public String toString() {
                    return "Details(scaffoldData=" + this.scaffoldData + ", screenData=" + this.screenData + ", onBackClick=" + this.onBackClick + ')';
                }
            }

            /* JADX INFO: renamed from: lb0.n$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Llb0/n$a$b$b;", "Llb0/n$a$b;", "Li50/a;", "scaffoldData", "Ln30/b;", "drivingLicences", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Ln30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ln30/b;", "()Ln30/b;", "Ler/a;", "()Ler/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class List implements b {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f117522d = BaseScaffoldData.f89350g;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData scaffoldData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final CardListData drivingLicences;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackClick;

                public List(BaseScaffoldData baseScaffoldData, CardListData cardListData, er.a<oq.i0> aVar) {
                    this.scaffoldData = baseScaffoldData;
                    this.drivingLicences = cardListData;
                    this.onBackClick = aVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final CardListData getDrivingLicences() {
                    return this.drivingLicences;
                }

                public final er.a<oq.i0> b() {
                    return this.onBackClick;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final BaseScaffoldData getScaffoldData() {
                    return this.scaffoldData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof List)) {
                        return false;
                    }
                    List list = (List) other;
                    return fr.t.c(this.scaffoldData, list.scaffoldData) && fr.t.c(this.drivingLicences, list.drivingLicences) && fr.t.c(this.onBackClick, list.onBackClick);
                }

                public int hashCode() {
                    return (((this.scaffoldData.hashCode() * 31) + this.drivingLicences.hashCode()) * 31) + this.onBackClick.hashCode();
                }

                public String toString() {
                    return "List(scaffoldData=" + this.scaffoldData + ", drivingLicences=" + this.drivingLicences + ", onBackClick=" + this.onBackClick + ')';
                }
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llb0/n$a$c;", "Llb0/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f117526a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1508342031;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: lb0.n$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Llb0/n$a$d;", "Llb0/n$a;", "Li50/a;", "scaffoldData", "Lo20/k;", "screenData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Li50/a;Lo20/k;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lo20/k;", "c", "()Lo20/k;", "Lcb4/i;", "()Lcb4/i;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseDocumentData screenData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            public Initialized(BaseScaffoldData baseScaffoldData, BaseDocumentData baseDocumentData, cb4.i iVar) {
                this.scaffoldData = baseScaffoldData;
                this.screenData = baseDocumentData;
                this.dialogVMSAdapter = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseDocumentData getScreenData() {
                return this.screenData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.screenData, initialized.screenData) && fr.t.c(this.dialogVMSAdapter, initialized.dialogVMSAdapter);
            }

            public int hashCode() {
                int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.screenData.hashCode()) * 31;
                cb4.i iVar = this.dialogVMSAdapter;
                return iHashCode + (iVar == null ? 0 : iVar.hashCode());
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", screenData=" + this.screenData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: lb0.n$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Llb0/n$a$e;", "Llb0/n$a;", "Li50/a;", "scaffoldData", "Lt40/b;", "infoRowListData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lt40/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lt40/b;", "()Lt40/b;", "Ler/a;", "()Ler/a;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitializedInfoPage implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f117530d = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData infoRowListData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            public InitializedInfoPage(BaseScaffoldData baseScaffoldData, InfoRowListData infoRowListData, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.infoRowListData = infoRowListData;
                this.onBackClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InfoRowListData getInfoRowListData() {
                return this.infoRowListData;
            }

            public final er.a<oq.i0> b() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializedInfoPage)) {
                    return false;
                }
                InitializedInfoPage initializedInfoPage = (InitializedInfoPage) other;
                return fr.t.c(this.scaffoldData, initializedInfoPage.scaffoldData) && fr.t.c(this.infoRowListData, initializedInfoPage.infoRowListData) && fr.t.c(this.onBackClick, initializedInfoPage.onBackClick);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.infoRowListData.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "InitializedInfoPage(scaffoldData=" + this.scaffoldData + ", infoRowListData=" + this.infoRowListData + ", onBackClick=" + this.onBackClick + ')';
            }
        }
    }
}
