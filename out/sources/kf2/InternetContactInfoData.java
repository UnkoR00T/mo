package kf2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: kf2.k, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lkf2/k;", "", "Liy/b0;", "email", "countryCode", "phoneNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;)V", "", "d", "()Ljava/lang/String;", "", "g", "()Z", "a", "f", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "e", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InternetContactInfoData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f110597d = iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 phoneNumber;

    public InternetContactInfoData(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3) {
        this.email = b0Var;
        this.countryCode = b0Var2;
        this.phoneNumber = b0Var3;
    }

    public final boolean a() {
        return iy.c0.e(this.email).length() > 0 && iy.c0.e(this.phoneNumber).length() == 0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getEmail() {
        return this.email;
    }

    public final String d() {
        return iy.c0.e(this.countryCode) + iy.c0.e(this.phoneNumber);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final iy.b0 getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetContactInfoData)) {
            return false;
        }
        InternetContactInfoData internetContactInfoData = (InternetContactInfoData) other;
        return fr.t.c(this.email, internetContactInfoData.email) && fr.t.c(this.countryCode, internetContactInfoData.countryCode) && fr.t.c(this.phoneNumber, internetContactInfoData.phoneNumber);
    }

    public final boolean f() {
        return iy.c0.e(this.email).length() > 0 && iy.c0.e(this.phoneNumber).length() > 0;
    }

    public final boolean g() {
        return iy.c0.e(this.email).length() == 0 && iy.c0.e(this.phoneNumber).length() > 0;
    }

    public int hashCode() {
        return (((this.email.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "InternetContactInfoData(email=" + this.email + ", countryCode=" + this.countryCode + ", phoneNumber=" + this.phoneNumber + ')';
    }
}
