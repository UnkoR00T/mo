package lr1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Llr1/c;", "Ll00/e;", "Llr1/c$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: lr1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b1\u00104R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b/\u00104R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b-\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b\"\u00107R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b+\u00108\u001a\u0004\b)\u00109R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b:\u00109¨\u0006;"}, d2 = {"Llr1/c$a;", "", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lv50/c;", "secretInput", "keyAliasInput", "keyTimeoutInput", "Lmx/a;", "encryptionTitle", "encryptedData", "decryptionTitle", "decryptedData", "Lh30/a;", "rsaKeyguardButton", "aesKeyguardButton", "Ls50/a;", "biometricSwitch", "skipKeyCreationSwitch", "<init>", "(Li50/a;Ler/a;Lv50/c;Lv50/c;Lv50/c;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lh30/a;Lh30/a;Ls50/a;Ls50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ler/a;", "j", "()Ler/a;", "c", "Lv50/c;", "l", "()Lv50/c;", "d", "h", "e", "i", "f", "Lmx/a;", "g", "()Lmx/a;", "Lh30/a;", "k", "()Lh30/a;", "Ls50/a;", "()Ls50/a;", "m", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f119732n;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c secretInput;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c keyAliasInput;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c keyTimeoutInput;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label encryptionTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label encryptedData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label decryptionTitle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label decryptedData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData rsaKeyguardButton;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData aesKeyguardButton;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final s50.a biometricSwitch;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final s50.a skipKeyCreationSwitch;

        static {
            int i15 = s50.a.f177982i;
            int i16 = v50.c.f203957t;
            f119732n = i15 | i16 | i16 | i16 | BaseScaffoldData.f89350g;
        }

        public Data(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, v50.c cVar, v50.c cVar2, v50.c cVar3, Label label, Label label2, Label label3, Label label4, ButtonData buttonData, ButtonData buttonData2, s50.a aVar2, s50.a aVar3) {
            this.baseScaffoldData = baseScaffoldData;
            this.onBackAction = aVar;
            this.secretInput = cVar;
            this.keyAliasInput = cVar2;
            this.keyTimeoutInput = cVar3;
            this.encryptionTitle = label;
            this.encryptedData = label2;
            this.decryptionTitle = label3;
            this.decryptedData = label4;
            this.rsaKeyguardButton = buttonData;
            this.aesKeyguardButton = buttonData2;
            this.biometricSwitch = aVar2;
            this.skipKeyCreationSwitch = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getAesKeyguardButton() {
            return this.aesKeyguardButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final s50.a getBiometricSwitch() {
            return this.biometricSwitch;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getDecryptedData() {
            return this.decryptedData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getDecryptionTitle() {
            return this.decryptionTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.onBackAction, data.onBackAction) && fr.t.c(this.secretInput, data.secretInput) && fr.t.c(this.keyAliasInput, data.keyAliasInput) && fr.t.c(this.keyTimeoutInput, data.keyTimeoutInput) && fr.t.c(this.encryptionTitle, data.encryptionTitle) && fr.t.c(this.encryptedData, data.encryptedData) && fr.t.c(this.decryptionTitle, data.decryptionTitle) && fr.t.c(this.decryptedData, data.decryptedData) && fr.t.c(this.rsaKeyguardButton, data.rsaKeyguardButton) && fr.t.c(this.aesKeyguardButton, data.aesKeyguardButton) && fr.t.c(this.biometricSwitch, data.biometricSwitch) && fr.t.c(this.skipKeyCreationSwitch, data.skipKeyCreationSwitch);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getEncryptedData() {
            return this.encryptedData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getEncryptionTitle() {
            return this.encryptionTitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final v50.c getKeyAliasInput() {
            return this.keyAliasInput;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.secretInput.hashCode()) * 31) + this.keyAliasInput.hashCode()) * 31) + this.keyTimeoutInput.hashCode()) * 31) + this.encryptionTitle.hashCode()) * 31) + this.encryptedData.hashCode()) * 31) + this.decryptionTitle.hashCode()) * 31) + this.decryptedData.hashCode()) * 31) + this.rsaKeyguardButton.hashCode()) * 31) + this.aesKeyguardButton.hashCode()) * 31) + this.biometricSwitch.hashCode()) * 31) + this.skipKeyCreationSwitch.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final v50.c getKeyTimeoutInput() {
            return this.keyTimeoutInput;
        }

        public final er.a<i0> j() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ButtonData getRsaKeyguardButton() {
            return this.rsaKeyguardButton;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final v50.c getSecretInput() {
            return this.secretInput;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final s50.a getSkipKeyCreationSwitch() {
            return this.skipKeyCreationSwitch;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", onBackAction=" + this.onBackAction + ", secretInput=" + this.secretInput + ", keyAliasInput=" + this.keyAliasInput + ", keyTimeoutInput=" + this.keyTimeoutInput + ", encryptionTitle=" + this.encryptionTitle + ", encryptedData=" + this.encryptedData + ", decryptionTitle=" + this.decryptionTitle + ", decryptedData=" + this.decryptedData + ", rsaKeyguardButton=" + this.rsaKeyguardButton + ", aesKeyguardButton=" + this.aesKeyguardButton + ", biometricSwitch=" + this.biometricSwitch + ", skipKeyCreationSwitch=" + this.skipKeyCreationSwitch + ')';
        }
    }
}
