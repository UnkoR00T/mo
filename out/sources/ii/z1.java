package ii;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
abstract class z1 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f92875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f92876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f92877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f92878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f92879e;

    z1(o oVar, o oVar2, Uri uri, String str, String str2) {
        this.f92875a = oVar;
        this.f92876b = oVar2;
        this.f92877c = uri;
        this.f92878d = str;
        this.f92879e = str2;
    }

    @Override // ii.f0
    public final o b() {
        return this.f92876b;
    }

    @Override // ii.f0
    public final String c() {
        return this.f92878d;
    }

    @Override // ii.f0
    public final String d() {
        return this.f92879e;
    }

    @Override // ii.f0
    public final Uri e() {
        return this.f92877c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            o oVar = this.f92875a;
            if (oVar != null ? oVar.equals(f0Var.f()) : f0Var.f() == null) {
                o oVar2 = this.f92876b;
                if (oVar2 != null ? oVar2.equals(f0Var.b()) : f0Var.b() == null) {
                    Uri uri = this.f92877c;
                    if (uri != null ? uri.equals(f0Var.e()) : f0Var.e() == null) {
                        String str = this.f92878d;
                        if (str != null ? str.equals(f0Var.c()) : f0Var.c() == null) {
                            String str2 = this.f92879e;
                            if (str2 != null ? str2.equals(f0Var.d()) : f0Var.d() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ii.f0
    public final o f() {
        return this.f92875a;
    }

    public final int hashCode() {
        o oVar = this.f92875a;
        int iHashCode = oVar == null ? 0 : oVar.hashCode();
        o oVar2 = this.f92876b;
        int iHashCode2 = oVar2 == null ? 0 : oVar2.hashCode();
        int i15 = iHashCode ^ 1000003;
        Uri uri = this.f92877c;
        int iHashCode3 = ((((i15 * 1000003) ^ iHashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str = this.f92878d;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f92879e;
        return iHashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.f92877c;
        o oVar = this.f92876b;
        String strValueOf = String.valueOf(this.f92875a);
        String strValueOf2 = String.valueOf(oVar);
        String strValueOf3 = String.valueOf(uri);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        String str = this.f92878d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f92879e;
        StringBuilder sb5 = new StringBuilder(length + 43 + length2 + 17 + length3 + 17 + length4 + 29 + String.valueOf(str2).length() + 1);
        sb5.append("NeighborhoodSummary{overview=");
        sb5.append(strValueOf);
        sb5.append(", description=");
        sb5.append(strValueOf2);
        sb5.append(", flagContentUri=");
        sb5.append(strValueOf3);
        sb5.append(", disclosureText=");
        sb5.append(str);
        sb5.append(", disclosureTextLanguageCode=");
        sb5.append(str2);
        sb5.append("}");
        return sb5.toString();
    }
}
