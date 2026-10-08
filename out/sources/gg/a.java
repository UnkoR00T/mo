package gg;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f72706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f72708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f72709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f72710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f72705f = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new p();

    a(int i15, int i16, PendingIntent pendingIntent, String str, Integer num) {
        this.f72706a = i15;
        this.f72707b = i16;
        this.f72708c = pendingIntent;
        this.f72709d = str;
        this.f72710e = num;
    }

    static String C(int i15) {
        if (i15 == 99) {
            return "UNFINISHED";
        }
        if (i15 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i15) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i15) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 20);
                        sb5.append("UNKNOWN_ERROR_CODE(");
                        sb5.append(i15);
                        sb5.append(")");
                        return sb5.toString();
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f72707b == aVar.f72707b && jg.r.a(this.f72708c, aVar.f72708c) && jg.r.a(this.f72709d, aVar.f72709d) && jg.r.a(this.f72710e, aVar.f72710e);
    }

    public Integer h() {
        return this.f72710e;
    }

    public int hashCode() {
        return jg.r.b(Integer.valueOf(this.f72707b), this.f72708c, this.f72709d, this.f72710e);
    }

    public int m() {
        return this.f72707b;
    }

    public String p() {
        return this.f72709d;
    }

    public PendingIntent r() {
        return this.f72708c;
    }

    public String toString() {
        jg.r.a aVarC = jg.r.c(this);
        aVarC.a("statusCode", C(this.f72707b));
        aVarC.a("resolution", this.f72708c);
        aVarC.a("message", this.f72709d);
        aVarC.a("clientMethodKey", this.f72710e);
        return aVarC.toString();
    }

    public boolean u() {
        return (this.f72707b == 0 || this.f72708c == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f72706a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.m(parcel, 2, m());
        kg.c.t(parcel, 3, r(), i15, false);
        kg.c.u(parcel, 4, p(), false);
        kg.c.p(parcel, 5, h(), false);
        kg.c.b(parcel, iA);
    }

    public boolean y() {
        return this.f72707b == 0;
    }

    public a(int i15) {
        this(i15, null, null);
    }

    public a(int i15, PendingIntent pendingIntent) {
        this(i15, pendingIntent, null);
    }

    public a(int i15, PendingIntent pendingIntent, String str) {
        this(1, i15, pendingIntent, str, null);
    }
}
