package f73;

import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lf73/c;", "Ll00/e;", "Lf73/c$a;", "a", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: f73.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\u001c\u0010'¨\u0006("}, d2 = {"Lf73/c$a;", "", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lv50/c;", "passwordTextInputData", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "closeButtonAction", "<init>", "(Li50/a;Lo40/a;Lv50/c;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Lv50/c;", "e", "()Lv50/c;", "d", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c passwordTextInputData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeButtonAction;

        public Data(BaseScaffoldData baseScaffoldData, o40.a aVar, v50.c cVar, ButtonData buttonData, er.a<i0> aVar2) {
            this.baseScaffoldData = baseScaffoldData;
            this.headerData = aVar;
            this.passwordTextInputData = cVar;
            this.nextButtonData = buttonData;
            this.closeButtonAction = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        public final er.a<i0> b() {
            return this.closeButtonAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final v50.c getPasswordTextInputData() {
            return this.passwordTextInputData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.headerData, data.headerData) && fr.t.c(this.passwordTextInputData, data.passwordTextInputData) && fr.t.c(this.nextButtonData, data.nextButtonData) && fr.t.c(this.closeButtonAction, data.closeButtonAction);
        }

        public int hashCode() {
            return (((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.passwordTextInputData.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.closeButtonAction.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", passwordTextInputData=" + this.passwordTextInputData + ", nextButtonData=" + this.nextButtonData + ", closeButtonAction=" + this.closeButtonAction + ')';
        }
    }
}
