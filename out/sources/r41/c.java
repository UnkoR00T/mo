package r41;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lr41/c;", "Ll00/e;", "Lr41/c$a;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: r41.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b(\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b*\u00104R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b-\u00104¨\u00065"}, d2 = {"Lr41/c$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "subtitle", "titleEdor", "Lv50/c;", "emailInputData", "phoneInputData", "Ln50/k;", "edorCardData", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onPointerTouch", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lv50/c;Lv50/c;Ln50/k;Lh30/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "i", "()Lmx/a;", "c", "h", "d", "j", "e", "Lv50/c;", "()Lv50/c;", "f", "g", "Ln50/k;", "()Ln50/k;", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label subtitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label titleEdor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c emailInputData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c phoneInputData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k edorCardData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPointerTouch;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, v50.c cVar, v50.c cVar2, n50.k kVar, ButtonData buttonData, er.a<i0> aVar, er.a<i0> aVar2) {
            this.baseScaffoldData = baseScaffoldData;
            this.title = label;
            this.subtitle = label2;
            this.titleEdor = label3;
            this.emailInputData = cVar;
            this.phoneInputData = cVar2;
            this.edorCardData = kVar;
            this.nextButtonData = buttonData;
            this.onBack = aVar;
            this.onPointerTouch = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n50.k getEdorCardData() {
            return this.edorCardData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final v50.c getEmailInputData() {
            return this.emailInputData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.a<i0> e() {
            return this.onBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.subtitle, data.subtitle) && fr.t.c(this.titleEdor, data.titleEdor) && fr.t.c(this.emailInputData, data.emailInputData) && fr.t.c(this.phoneInputData, data.phoneInputData) && fr.t.c(this.edorCardData, data.edorCardData) && fr.t.c(this.nextButtonData, data.nextButtonData) && fr.t.c(this.onBack, data.onBack) && fr.t.c(this.onPointerTouch, data.onPointerTouch);
        }

        public final er.a<i0> f() {
            return this.onPointerTouch;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final v50.c getPhoneInputData() {
            return this.phoneInputData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int iHashCode = ((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            Label label = this.titleEdor;
            int iHashCode2 = (((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.emailInputData.hashCode()) * 31) + this.phoneInputData.hashCode()) * 31;
            n50.k kVar = this.edorCardData;
            return ((((((iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31) + this.nextButtonData.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onPointerTouch.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Label getTitleEdor() {
            return this.titleEdor;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleEdor=" + this.titleEdor + ", emailInputData=" + this.emailInputData + ", phoneInputData=" + this.phoneInputData + ", edorCardData=" + this.edorCardData + ", nextButtonData=" + this.nextButtonData + ", onBack=" + this.onBack + ", onPointerTouch=" + this.onPointerTouch + ')';
        }
    }
}
