package ox2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lox2/c;", "Ll00/e;", "Lox2/c$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lox2/c$a;", "", "<init>", "()V", "a", "b", "Lox2/c$a$a;", "Lox2/c$a$b;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: ox2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lox2/c$a$a;", "Lox2/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C3712a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3712a f150501a = new C3712a();

            private C3712a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C3712a);
            }

            public int hashCode() {
                return -1827956542;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: ox2.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\u001d\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b%\u00101¨\u00062"}, d2 = {"Lox2/c$a$b;", "Lox2/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "Lj40/a;", "reasonDropDownButtonData", "Lc30/b;", "alertData", "Lh30/a;", "buttonData", "", "scrollToDropdownField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToDropdownField", "<init>", "(Li50/a;Lmx/a;Lj40/a;Lc30/b;Lh30/a;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "Lj40/a;", "d", "()Lj40/a;", "Lc30/b;", "()Lc30/b;", "Lh30/a;", "()Lh30/a;", "f", "Z", "()Z", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f150502h = (c30.b.f22944i | DropDownButtonData.f99359i) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownButtonData reasonDropDownButtonData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToDropdownField;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onScrolledToDropdownField;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, DropDownButtonData dropDownButtonData, c30.b bVar, ButtonData buttonData, boolean z15, er.a<i0> aVar) {
                super(null);
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.reasonDropDownButtonData = dropDownButtonData;
                this.alertData = bVar;
                this.buttonData = buttonData;
                this.scrollToDropdownField = z15;
                this.onScrolledToDropdownField = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            public final er.a<i0> c() {
                return this.onScrolledToDropdownField;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final DropDownButtonData getReasonDropDownButtonData() {
                return this.reasonDropDownButtonData;
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
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.reasonDropDownButtonData, initialized.reasonDropDownButtonData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.buttonData, initialized.buttonData) && this.scrollToDropdownField == initialized.scrollToDropdownField && fr.t.c(this.onScrolledToDropdownField, initialized.onScrolledToDropdownField);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final boolean getScrollToDropdownField() {
                return this.scrollToDropdownField;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.reasonDropDownButtonData.hashCode()) * 31;
                c30.b bVar = this.alertData;
                return ((((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.buttonData.hashCode()) * 31) + Boolean.hashCode(this.scrollToDropdownField)) * 31) + this.onScrolledToDropdownField.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", reasonDropDownButtonData=" + this.reasonDropDownButtonData + ", alertData=" + this.alertData + ", buttonData=" + this.buttonData + ", scrollToDropdownField=" + this.scrollToDropdownField + ", onScrolledToDropdownField=" + this.onScrolledToDropdownField + ')';
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
