package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class g31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ak.p0 f32361a = ak.p0.a().g(hw0.NONE, "NONE").g(hw0.PSK, "WPA_PSK").g(hw0.EAP, "WPA_EAP").g(hw0.OTHER, "SECURED_NONE").d();

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(ak.n0 n0Var, int i15) {
        zj.p.e(true, "maxLength must not be negative");
        StringBuilder sb5 = new StringBuilder();
        int size = n0Var.size();
        for (int i16 = 0; i16 < size; i16++) {
            iw0 iw0Var = (iw0) n0Var.get(i16);
            int length = sb5.length();
            String strValueOf = String.valueOf(zj.i.h(",").k("=").f(ak.p0.a().g("mac", iw0Var.a()).g("strength_dbm", Integer.valueOf(iw0Var.b())).g("wifi_auth_type", f32361a.get(iw0Var.c())).g("is_connected", Boolean.valueOf(iw0Var.d())).g("frequency_mhz", Integer.valueOf(iw0Var.e())).d()));
            int length2 = sb5.length();
            String strConcat = (length > 0 ? "|" : "").concat(strValueOf);
            if (length2 + strConcat.length() > 4000) {
                break;
            }
            sb5.append(strConcat);
        }
        return sb5.toString();
    }

    public static String b(Location location) {
        if (location == null) {
            return null;
        }
        return f(location.getLatitude(), location.getLongitude());
    }

    public static String c(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return f(latLng.f31423a, latLng.f31424b);
    }

    public static String d(ii.c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        if (c0Var instanceof ii.q0) {
            return g((ii.q0) c0Var);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String e(ii.d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        if (d0Var instanceof ii.q0) {
            return g((ii.q0) d0Var);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    private static String f(double d15, double d16) {
        return String.format(Locale.US, "%.15f,%.15f", Double.valueOf(d15), Double.valueOf(d16));
    }

    private static String g(ii.q0 q0Var) {
        LatLng latLngB = q0Var.b();
        double d15 = latLngB.f31423a;
        double d16 = latLngB.f31424b;
        LatLng latLngA = q0Var.a();
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", Double.valueOf(d15), Double.valueOf(d16), Double.valueOf(latLngA.f31423a), Double.valueOf(latLngA.f31424b));
    }
}
