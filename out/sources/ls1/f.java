package ls1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lls1/f;", "Ll00/e;", "Lls1/f$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: ls1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0019\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b \u0010'¨\u0006("}, d2 = {"Lls1/f$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "Lv50/c;", "textInputData", "Lh30/a;", "backWithDataButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lmx/a;Lv50/c;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "e", "()Lmx/a;", "c", "Lv50/c;", "d", "()Lv50/c;", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f120037f = v50.c.f203957t | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c textInputData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData backWithDataButtonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Data(BaseScaffoldData baseScaffoldData, Label label, v50.c cVar, ButtonData buttonData, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.title = label;
            this.textInputData = cVar;
            this.backWithDataButtonData = buttonData;
            this.onBack = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getBackWithDataButtonData() {
            return this.backWithDataButtonData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        public final er.a<i0> c() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final v50.c getTextInputData() {
            return this.textInputData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.textInputData, data.textInputData) && fr.t.c(this.backWithDataButtonData, data.backWithDataButtonData) && fr.t.c(this.onBack, data.onBack);
        }

        public int hashCode() {
            return (((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.textInputData.hashCode()) * 31) + this.backWithDataButtonData.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", textInputData=" + this.textInputData + ", backWithDataButtonData=" + this.backWithDataButtonData + ", onBack=" + this.onBack + ')';
        }
    }
}
