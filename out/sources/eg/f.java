package eg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.m5;
import com.google.android.gms.internal.clearcut.x5;
import java.util.Arrays;
import jg.r;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends kg.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x5 f49953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f49954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f49955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String[] f49956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f49957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[][] f49958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private qh.a[] f49959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49960h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m5 f49961j;

    public f(x5 x5Var, m5 m5Var, a.c cVar, a.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, qh.a[] aVarArr, boolean z15) {
        this.f49953a = x5Var;
        this.f49961j = m5Var;
        this.f49955c = iArr;
        this.f49956d = null;
        this.f49957e = iArr2;
        this.f49958f = null;
        this.f49959g = null;
        this.f49960h = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (r.a(this.f49953a, fVar.f49953a) && Arrays.equals(this.f49954b, fVar.f49954b) && Arrays.equals(this.f49955c, fVar.f49955c) && Arrays.equals(this.f49956d, fVar.f49956d) && r.a(this.f49961j, fVar.f49961j) && r.a(null, null) && r.a(null, null) && Arrays.equals(this.f49957e, fVar.f49957e) && Arrays.deepEquals(this.f49958f, fVar.f49958f) && Arrays.equals(this.f49959g, fVar.f49959g) && this.f49960h == fVar.f49960h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return r.b(this.f49953a, this.f49954b, this.f49955c, this.f49956d, this.f49961j, null, null, this.f49957e, this.f49958f, this.f49959g, Boolean.valueOf(this.f49960h));
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder("LogEventParcelable[");
        sb5.append(this.f49953a);
        sb5.append(", LogEventBytes: ");
        byte[] bArr = this.f49954b;
        sb5.append(bArr == null ? null : new String(bArr));
        sb5.append(", TestCodes: ");
        sb5.append(Arrays.toString(this.f49955c));
        sb5.append(", MendelPackages: ");
        sb5.append(Arrays.toString(this.f49956d));
        sb5.append(", LogEvent: ");
        sb5.append(this.f49961j);
        sb5.append(", ExtensionProducer: ");
        sb5.append((Object) null);
        sb5.append(", VeProducer: ");
        sb5.append((Object) null);
        sb5.append(", ExperimentIDs: ");
        sb5.append(Arrays.toString(this.f49957e));
        sb5.append(", ExperimentTokens: ");
        sb5.append(Arrays.toString(this.f49958f));
        sb5.append(", ExperimentTokensParcelables: ");
        sb5.append(Arrays.toString(this.f49959g));
        sb5.append(", AddPhenotypeExperimentTokens: ");
        sb5.append(this.f49960h);
        sb5.append("]");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, this.f49953a, i15, false);
        kg.c.f(parcel, 3, this.f49954b, false);
        kg.c.n(parcel, 4, this.f49955c, false);
        kg.c.v(parcel, 5, this.f49956d, false);
        kg.c.n(parcel, 6, this.f49957e, false);
        kg.c.g(parcel, 7, this.f49958f, false);
        kg.c.c(parcel, 8, this.f49960h);
        kg.c.x(parcel, 9, this.f49959g, i15, false);
        kg.c.b(parcel, iA);
    }

    f(x5 x5Var, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z15, qh.a[] aVarArr) {
        this.f49953a = x5Var;
        this.f49954b = bArr;
        this.f49955c = iArr;
        this.f49956d = strArr;
        this.f49961j = null;
        this.f49957e = iArr2;
        this.f49958f = bArr2;
        this.f49959g = aVarArr;
        this.f49960h = z15;
    }
}
