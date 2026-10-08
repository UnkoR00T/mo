package zr1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lzr1/e;", "Ll00/e;", "Lzr1/e$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: zr1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b\u001c\u0010)¨\u0006*"}, d2 = {"Lzr1/e$a;", "", "Li50/a;", "baseScaffoldData", "Lv50/c$g;", "urlInputData", "Lh30/a;", "sendButtonData", "", "resultText", "", "isSending", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lv50/c$g;Lh30/a;Ljava/lang/String;ZLer/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lv50/c$g;", "e", "()Lv50/c$g;", "c", "Lh30/a;", "d", "()Lh30/a;", "Ljava/lang/String;", "Z", "f", "()Z", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f236440g = v50.c.Text.P | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text urlInputData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData sendButtonData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String resultText;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSending;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Data(BaseScaffoldData baseScaffoldData, v50.c.Text text, ButtonData buttonData, String str, boolean z15, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.urlInputData = text;
            this.sendButtonData = buttonData;
            this.resultText = str;
            this.isSending = z15;
            this.onBack = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getResultText() {
            return this.resultText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getSendButtonData() {
            return this.sendButtonData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final v50.c.Text getUrlInputData() {
            return this.urlInputData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.urlInputData, data.urlInputData) && fr.t.c(this.sendButtonData, data.sendButtonData) && fr.t.c(this.resultText, data.resultText) && this.isSending == data.isSending && fr.t.c(this.onBack, data.onBack);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSending() {
            return this.isSending;
        }

        public int hashCode() {
            int iHashCode = ((((this.baseScaffoldData.hashCode() * 31) + this.urlInputData.hashCode()) * 31) + this.sendButtonData.hashCode()) * 31;
            String str = this.resultText;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSending)) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", urlInputData=" + this.urlInputData + ", sendButtonData=" + this.sendButtonData + ", resultText=" + this.resultText + ", isSending=" + this.isSending + ", onBack=" + this.onBack + ')';
        }
    }
}
