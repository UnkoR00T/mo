package y73;

import fp0.e;
import fp0.h;
import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: y73.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Ly73/a;", "", "Lfp0/h;", "qrCode", "", "packageData", "Lfp0/e;", "institution", "<init>", "(Liy/b0;Ljava/lang/String;Lfp0/e;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "Ljava/lang/String;", "Lfp0/e;", "()Lfp0/e;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivateCodeSetupData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f225272d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 qrCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String packageData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e institution;

    public /* synthetic */ ActivateCodeSetupData(b0 b0Var, String str, e eVar, k kVar) {
        this(b0Var, str, eVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPackageData() {
        return this.packageData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getQrCode() {
        return this.qrCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivateCodeSetupData)) {
            return false;
        }
        ActivateCodeSetupData activateCodeSetupData = (ActivateCodeSetupData) other;
        return h.d(this.qrCode, activateCodeSetupData.qrCode) && t.c(this.packageData, activateCodeSetupData.packageData) && this.institution == activateCodeSetupData.institution;
    }

    public int hashCode() {
        return (((h.f(this.qrCode) * 31) + this.packageData.hashCode()) * 31) + this.institution.hashCode();
    }

    public String toString() {
        return "ActivateCodeSetupData(qrCode=" + ((Object) h.h(this.qrCode)) + ", packageData=" + this.packageData + ", institution=" + this.institution + ')';
    }

    private ActivateCodeSetupData(b0 b0Var, String str, e eVar) {
        this.qrCode = b0Var;
        this.packageData = str;
        this.institution = eVar;
    }
}
