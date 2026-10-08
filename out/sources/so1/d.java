package so1;

import a50.RadioButtonData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lso1/d;", "Ll00/e;", "Lso1/d$a;", "Loq/i0;", "d", "()V", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: so1.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b+\u0010#R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010#R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Lso1/d$a;", "", "Li50/a;", "baseScaffoldData", "Lh30/a;", "verifyButton", "Lv50/c;", "aliasInput", "La50/a;", "generateKeyTypeRadio", "generateButton", "importButton", "exportButton", "wrapButton", "unwrapButton", "Lmx/a;", "info", "<init>", "(Li50/a;Lh30/a;Lv50/c;La50/a;Lh30/a;Lh30/a;Lh30/a;Lh30/a;Lh30/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lh30/a;", "i", "()Lh30/a;", "c", "Lv50/c;", "()Lv50/c;", "d", "La50/a;", "e", "()La50/a;", "f", "g", "h", "j", "Lmx/a;", "()Lmx/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f183036k = (RadioButtonData.f3462h | v50.c.f203957t) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData verifyButton;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c aliasInput;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData generateKeyTypeRadio;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData generateButton;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData importButton;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData exportButton;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData wrapButton;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData unwrapButton;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label info;

        public Data(BaseScaffoldData baseScaffoldData, ButtonData buttonData, v50.c cVar, RadioButtonData radioButtonData, ButtonData buttonData2, ButtonData buttonData3, ButtonData buttonData4, ButtonData buttonData5, ButtonData buttonData6, Label label) {
            this.baseScaffoldData = baseScaffoldData;
            this.verifyButton = buttonData;
            this.aliasInput = cVar;
            this.generateKeyTypeRadio = radioButtonData;
            this.generateButton = buttonData2;
            this.importButton = buttonData3;
            this.exportButton = buttonData4;
            this.wrapButton = buttonData5;
            this.unwrapButton = buttonData6;
            this.info = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final v50.c getAliasInput() {
            return this.aliasInput;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getExportButton() {
            return this.exportButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getGenerateButton() {
            return this.generateButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final RadioButtonData getGenerateKeyTypeRadio() {
            return this.generateKeyTypeRadio;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.verifyButton, data.verifyButton) && fr.t.c(this.aliasInput, data.aliasInput) && fr.t.c(this.generateKeyTypeRadio, data.generateKeyTypeRadio) && fr.t.c(this.generateButton, data.generateButton) && fr.t.c(this.importButton, data.importButton) && fr.t.c(this.exportButton, data.exportButton) && fr.t.c(this.wrapButton, data.wrapButton) && fr.t.c(this.unwrapButton, data.unwrapButton) && fr.t.c(this.info, data.info);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ButtonData getImportButton() {
            return this.importButton;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getInfo() {
            return this.info;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final ButtonData getUnwrapButton() {
            return this.unwrapButton;
        }

        public int hashCode() {
            return (((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.verifyButton.hashCode()) * 31) + this.aliasInput.hashCode()) * 31) + this.generateKeyTypeRadio.hashCode()) * 31) + this.generateButton.hashCode()) * 31) + this.importButton.hashCode()) * 31) + this.exportButton.hashCode()) * 31) + this.wrapButton.hashCode()) * 31) + this.unwrapButton.hashCode()) * 31) + this.info.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ButtonData getVerifyButton() {
            return this.verifyButton;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ButtonData getWrapButton() {
            return this.wrapButton;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", verifyButton=" + this.verifyButton + ", aliasInput=" + this.aliasInput + ", generateKeyTypeRadio=" + this.generateKeyTypeRadio + ", generateButton=" + this.generateButton + ", importButton=" + this.importButton + ", exportButton=" + this.exportButton + ", wrapButton=" + this.wrapButton + ", unwrapButton=" + this.unwrapButton + ", info=" + this.info + ')';
        }
    }

    void d();
}
