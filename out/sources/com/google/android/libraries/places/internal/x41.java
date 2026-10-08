package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class x41 extends a51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ak.n0 f34228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii.l0 f34229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ii.h f34230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ii.i f34231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Status f34232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f34233g;

    /* synthetic */ x41(int i15, String str, ak.n0 n0Var, ii.l0 l0Var, ii.h hVar, ii.i iVar, Status status, byte[] bArr) {
        this.f34233g = i15;
        this.f34227a = str;
        this.f34228b = n0Var;
        this.f34229c = l0Var;
        this.f34230d = hVar;
        this.f34231e = iVar;
        this.f34232f = status;
    }

    @Override // com.google.android.libraries.places.internal.a51
    public final String a() {
        return this.f34227a;
    }

    @Override // com.google.android.libraries.places.internal.a51
    public final ak.n0 b() {
        return this.f34228b;
    }

    @Override // com.google.android.libraries.places.internal.a51
    public final ii.l0 c() {
        return this.f34229c;
    }

    @Override // com.google.android.libraries.places.internal.a51
    public final ii.h d() {
        return this.f34230d;
    }

    @Override // com.google.android.libraries.places.internal.a51
    public final ii.i e() {
        return this.f34231e;
    }

    public final boolean equals(Object obj) {
        String str;
        ak.n0 n0Var;
        ii.l0 l0Var;
        ii.h hVar;
        ii.i iVar;
        Status status;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a51) {
            a51 a51Var = (a51) obj;
            if (this.f34233g == a51Var.g() && ((str = this.f34227a) != null ? str.equals(a51Var.a()) : a51Var.a() == null) && ((n0Var = this.f34228b) != null ? n0Var.equals(a51Var.b()) : a51Var.b() == null) && ((l0Var = this.f34229c) != null ? l0Var.equals(a51Var.c()) : a51Var.c() == null) && ((hVar = this.f34230d) != null ? hVar.equals(a51Var.d()) : a51Var.d() == null) && ((iVar = this.f34231e) != null ? iVar.equals(a51Var.e()) : a51Var.e() == null) && ((status = this.f34232f) != null ? status.equals(a51Var.f()) : a51Var.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.a51
    public final Status f() {
        return this.f34232f;
    }

    @Override // com.google.android.libraries.places.internal.a51
    public final int g() {
        return this.f34233g;
    }

    public final int hashCode() {
        String str = this.f34227a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i15 = this.f34233g;
        ak.n0 n0Var = this.f34228b;
        int iHashCode2 = n0Var == null ? 0 : n0Var.hashCode();
        int i16 = iHashCode ^ ((i15 ^ 1000003) * 1000003);
        ii.l0 l0Var = this.f34229c;
        int iHashCode3 = ((((i16 * 1000003) ^ iHashCode2) * 1000003) ^ (l0Var == null ? 0 : l0Var.hashCode())) * 1000003;
        ii.h hVar = this.f34230d;
        int iHashCode4 = (iHashCode3 ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        ii.i iVar = this.f34231e;
        int iHashCode5 = (iHashCode4 ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        Status status = this.f34232f;
        return iHashCode5 ^ (status != null ? status.hashCode() : 0);
    }

    public final String toString() {
        String str;
        switch (this.f34233g) {
            case 1:
                str = "START";
                break;
            case 2:
                str = "RESET";
                break;
            case 3:
                str = "LOADING";
                break;
            case 4:
                str = "TRY_AGAIN_PROGRESS_LOADING";
                break;
            case 5:
                str = "SUCCESS_PREDICTIONS";
                break;
            case 6:
                str = "FAILURE_NO_PREDICTIONS";
                break;
            case 7:
                str = "FAILURE_PREDICTIONS";
                break;
            case 8:
                str = "SUCCESS_SELECTION";
                break;
            case 9:
                str = "FAILURE_SELECTION";
                break;
            default:
                str = "FAILURE_UNRESOLVABLE";
                break;
        }
        String str2 = this.f34227a;
        ak.n0 n0Var = this.f34228b;
        ii.l0 l0Var = this.f34229c;
        ii.h hVar = this.f34230d;
        ii.i iVar = this.f34231e;
        Status status = this.f34232f;
        int length = str.length();
        String strValueOf = String.valueOf(n0Var);
        String strValueOf2 = String.valueOf(l0Var);
        String strValueOf3 = String.valueOf(hVar);
        String strValueOf4 = String.valueOf(iVar);
        String strValueOf5 = String.valueOf(status);
        StringBuilder sb5 = new StringBuilder(length + 31 + String.valueOf(str2).length() + 14 + strValueOf.length() + 8 + strValueOf2.length() + 13 + strValueOf3.length() + 15 + strValueOf4.length() + 9 + strValueOf5.length() + 1);
        sb5.append("AutocompleteState{type=");
        sb5.append(str);
        sb5.append(", query=");
        sb5.append(str2);
        sb5.append(", predictions=");
        sb5.append(strValueOf);
        sb5.append(", place=");
        sb5.append(strValueOf2);
        sb5.append(", prediction=");
        sb5.append(strValueOf3);
        sb5.append(", sessionToken=");
        sb5.append(strValueOf4);
        sb5.append(", status=");
        sb5.append(strValueOf5);
        sb5.append("}");
        return sb5.toString();
    }
}
