package xu1;

import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import zu1.DrivingLicenceBottomSheetData;
import zu1.EmptyDrivingLicenceData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lxu1/x;", "Ll00/e;", "Lxu1/x$a;", "Li70/n;", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface x extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lxu1/x$a;", "", "a", "b", "c", "Lxu1/x$a$a;", "Lxu1/x$a$b;", "Lxu1/x$a$c;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: xu1.x$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxu1/x$a$a;", "Lxu1/x$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5920a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5920a f221423a = new C5920a();

            private C5920a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5920a);
            }

            public int hashCode() {
                return 922751690;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: xu1.x$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u0010/\u001a\u0004\b,\u00100R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b1\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u001e\u00103¨\u00064"}, d2 = {"Lxu1/x$a$b;", "Lxu1/x$a;", "Li50/a;", "scaffoldData", "Lzu1/a;", "bottomSheetData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Ly30/n$b;", "controllersData", "", "controllerPairVisible", "Lzu1/c;", "emptyDrivingLicence", "showEmptyDrivingLicenceState", "Lo20/k;", "baseDocumentData", "<init>", "(Li50/a;Lzu1/a;Ler/a;Ly30/n$b;ZLzu1/c;ZLo20/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lzu1/a;", "()Lzu1/a;", "c", "Ler/a;", "f", "()Ler/a;", "d", "Ly30/n$b;", "()Ly30/n$b;", "e", "Z", "()Z", "Lzu1/c;", "()Lzu1/c;", "h", "Lo20/k;", "()Lo20/k;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f221424i = ((BaseDocumentData.f140741h | y30.n.Switch.f223693f) | ModalBottomSheetData.f70192e) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DrivingLicenceBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean controllerPairVisible;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyDrivingLicenceData emptyDrivingLicence;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showEmptyDrivingLicenceState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseDocumentData baseDocumentData;

            public Initialized(BaseScaffoldData baseScaffoldData, DrivingLicenceBottomSheetData drivingLicenceBottomSheetData, er.a<oq.i0> aVar, y30.n.Switch r15, boolean z15, EmptyDrivingLicenceData emptyDrivingLicenceData, boolean z16, BaseDocumentData baseDocumentData) {
                this.scaffoldData = baseScaffoldData;
                this.bottomSheetData = drivingLicenceBottomSheetData;
                this.onBackAction = aVar;
                this.controllersData = r15;
                this.controllerPairVisible = z15;
                this.emptyDrivingLicence = emptyDrivingLicenceData;
                this.showEmptyDrivingLicenceState = z16;
                this.baseDocumentData = baseDocumentData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseDocumentData getBaseDocumentData() {
                return this.baseDocumentData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final DrivingLicenceBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getControllerPairVisible() {
                return this.controllerPairVisible;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final EmptyDrivingLicenceData getEmptyDrivingLicence() {
                return this.emptyDrivingLicence;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.onBackAction, initialized.onBackAction) && fr.t.c(this.controllersData, initialized.controllersData) && this.controllerPairVisible == initialized.controllerPairVisible && fr.t.c(this.emptyDrivingLicence, initialized.emptyDrivingLicence) && this.showEmptyDrivingLicenceState == initialized.showEmptyDrivingLicenceState && fr.t.c(this.baseDocumentData, initialized.baseDocumentData);
            }

            public final er.a<oq.i0> f() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getShowEmptyDrivingLicenceState() {
                return this.showEmptyDrivingLicenceState;
            }

            public int hashCode() {
                return (((((((((((((this.scaffoldData.hashCode() * 31) + this.bottomSheetData.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.controllersData.hashCode()) * 31) + Boolean.hashCode(this.controllerPairVisible)) * 31) + this.emptyDrivingLicence.hashCode()) * 31) + Boolean.hashCode(this.showEmptyDrivingLicenceState)) * 31) + this.baseDocumentData.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", bottomSheetData=" + this.bottomSheetData + ", onBackAction=" + this.onBackAction + ", controllersData=" + this.controllersData + ", controllerPairVisible=" + this.controllerPairVisible + ", emptyDrivingLicence=" + this.emptyDrivingLicence + ", showEmptyDrivingLicenceState=" + this.showEmptyDrivingLicenceState + ", baseDocumentData=" + this.baseDocumentData + ')';
            }
        }

        /* JADX INFO: renamed from: xu1.x$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxu1/x$a$c;", "Lxu1/x$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "noDrivingLicences", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NoData implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f221433c = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> noDrivingLicences;

            public NoData(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData) {
                this.scaffoldData = baseScaffoldData;
                this.noDrivingLicences = iconPageData;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> a() {
                return this.noDrivingLicences;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoData)) {
                    return false;
                }
                NoData noData = (NoData) other;
                return fr.t.c(this.scaffoldData, noData.scaffoldData) && fr.t.c(this.noDrivingLicences, noData.noDrivingLicences);
            }

            public int hashCode() {
                return (this.scaffoldData.hashCode() * 31) + this.noDrivingLicences.hashCode();
            }

            public String toString() {
                return "NoData(scaffoldData=" + this.scaffoldData + ", noDrivingLicences=" + this.noDrivingLicences + ')';
            }
        }
    }
}
