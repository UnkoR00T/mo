package k41;

import h30.ButtonData;
import i50.BaseScaffoldData;
import n41.ChildDataScreenModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lk41/d;", "Ll00/e;", "Lk41/d$a;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: k41.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u0019\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b \u0010'¨\u0006("}, d2 = {"Lk41/d$a;", "", "Li50/a;", "baseScaffoldData", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lc30/b;", "alertData", "Ln41/a;", "childDataScreenModel", "<init>", "(Li50/a;Lh30/a;Ler/a;Lc30/b;Ln41/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lh30/a;", "d", "()Lh30/a;", "c", "Ler/a;", "e", "()Ler/a;", "Lc30/b;", "()Lc30/b;", "Ln41/a;", "()Ln41/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b alertData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChildDataScreenModel childDataScreenModel;

        public Data(BaseScaffoldData baseScaffoldData, ButtonData buttonData, er.a<oq.i0> aVar, c30.b bVar, ChildDataScreenModel childDataScreenModel) {
            this.baseScaffoldData = baseScaffoldData;
            this.nextButtonData = buttonData;
            this.onBack = aVar;
            this.alertData = bVar;
            this.childDataScreenModel = childDataScreenModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ChildDataScreenModel getChildDataScreenModel() {
            return this.childDataScreenModel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.a<oq.i0> e() {
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
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.nextButtonData, data.nextButtonData) && fr.t.c(this.onBack, data.onBack) && fr.t.c(this.alertData, data.alertData) && fr.t.c(this.childDataScreenModel, data.childDataScreenModel);
        }

        public int hashCode() {
            return (((((((this.baseScaffoldData.hashCode() * 31) + this.nextButtonData.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.childDataScreenModel.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", nextButtonData=" + this.nextButtonData + ", onBack=" + this.onBack + ", alertData=" + this.alertData + ", childDataScreenModel=" + this.childDataScreenModel + ')';
        }
    }
}
