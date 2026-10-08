package gr1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gr1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lgr1/b;", "", "Lgr1/c;", "mode", "", "dataToSign", "pin", "newPin", "can", "puk", "<init>", "(Lgr1/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lgr1/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lgr1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgr1/c;", "e", "()Lgr1/c;", "b", "Ljava/lang/String;", "d", "c", "g", "f", "h", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataToSign;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String newPin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String can;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String puk;

    public FormData(c cVar, String str, String str2, String str3, String str4, String str5) {
        this.mode = cVar;
        this.dataToSign = str;
        this.pin = str2;
        this.newPin = str3;
        this.can = str4;
        this.puk = str5;
    }

    public static /* synthetic */ FormData b(FormData formData, c cVar, String str, String str2, String str3, String str4, String str5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            cVar = formData.mode;
        }
        if ((i15 & 2) != 0) {
            str = formData.dataToSign;
        }
        if ((i15 & 4) != 0) {
            str2 = formData.pin;
        }
        if ((i15 & 8) != 0) {
            str3 = formData.newPin;
        }
        if ((i15 & 16) != 0) {
            str4 = formData.can;
        }
        if ((i15 & 32) != 0) {
            str5 = formData.puk;
        }
        String str6 = str4;
        String str7 = str5;
        return formData.a(cVar, str, str2, str3, str6, str7);
    }

    public final FormData a(c mode, String dataToSign, String pin, String newPin, String can, String puk) {
        return new FormData(mode, dataToSign, pin, newPin, can, puk);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCan() {
        return this.can;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDataToSign() {
        return this.dataToSign;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getMode() {
        return this.mode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormData)) {
            return false;
        }
        FormData formData = (FormData) other;
        return this.mode == formData.mode && fr.t.c(this.dataToSign, formData.dataToSign) && fr.t.c(this.pin, formData.pin) && fr.t.c(this.newPin, formData.newPin) && fr.t.c(this.can, formData.can) && fr.t.c(this.puk, formData.puk);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNewPin() {
        return this.newPin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPuk() {
        return this.puk;
    }

    public int hashCode() {
        return (((((((((this.mode.hashCode() * 31) + this.dataToSign.hashCode()) * 31) + this.pin.hashCode()) * 31) + this.newPin.hashCode()) * 31) + this.can.hashCode()) * 31) + this.puk.hashCode();
    }

    public String toString() {
        return "FormData(mode=" + this.mode + ", dataToSign=" + this.dataToSign + ", pin=" + this.pin + ", newPin=" + this.newPin + ", can=" + this.can + ", puk=" + this.puk + ')';
    }
}
