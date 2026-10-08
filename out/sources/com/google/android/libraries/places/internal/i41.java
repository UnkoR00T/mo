package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class i41 extends l41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k41 f32528c;

    /* synthetic */ i41(String str, int i15, k41 k41Var, byte[] bArr) {
        this.f32526a = str;
        this.f32527b = i15;
        this.f32528c = k41Var;
    }

    @Override // com.google.android.libraries.places.internal.l41
    public final String a() {
        return this.f32526a;
    }

    @Override // com.google.android.libraries.places.internal.l41
    public final int b() {
        return this.f32527b;
    }

    @Override // com.google.android.libraries.places.internal.l41
    public final k41 c() {
        return this.f32528c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l41) {
            l41 l41Var = (l41) obj;
            if (this.f32526a.equals(l41Var.a()) && this.f32527b == l41Var.b() && this.f32528c.equals(l41Var.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f32526a.hashCode() ^ 1000003) * 1000003) ^ this.f32527b) * 1000003) ^ this.f32528c.hashCode();
    }

    public final String toString() {
        String string = this.f32528c.toString();
        int i15 = this.f32527b;
        int length = String.valueOf(i15).length();
        int length2 = string.length();
        String str = this.f32526a;
        StringBuilder sb5 = new StringBuilder(str.length() + 40 + length + 16 + length2 + 1);
        sb5.append("ClientProfile{packageName=");
        sb5.append(str);
        sb5.append(", versionCode=");
        sb5.append(i15);
        sb5.append(", requestSource=");
        sb5.append(string);
        sb5.append("}");
        return sb5.toString();
    }
}
