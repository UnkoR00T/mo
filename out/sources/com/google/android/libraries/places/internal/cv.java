package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cv extends az implements i00 {
    private static final cv zzl;
    private static volatile p00 zzm;
    private int zzb;
    private boolean zze;
    private int zzh;
    private f10 zzj;
    private f10 zzk;
    private iz zzf = az.z();
    private iz zzg = az.z();
    private iz zzi = az.z();

    static {
        cv cvVar = new cv();
        zzl = cvVar;
        az.r(cv.class, cvVar);
    }

    private cv() {
    }

    public static cv S() {
        return zzl;
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final boolean J() {
        return this.zze;
    }

    public final List K() {
        return this.zzf;
    }

    public final List L() {
        return this.zzg;
    }

    public final zu M() {
        zu zuVar;
        switch (this.zzh) {
            case 0:
                zuVar = zu.SECONDARY_HOURS_TYPE_UNSPECIFIED;
                break;
            case 1:
                zuVar = zu.DRIVE_THROUGH;
                break;
            case 2:
                zuVar = zu.HAPPY_HOUR;
                break;
            case 3:
                zuVar = zu.DELIVERY;
                break;
            case 4:
                zuVar = zu.TAKEOUT;
                break;
            case 5:
                zuVar = zu.KITCHEN;
                break;
            case 6:
                zuVar = zu.BREAKFAST;
                break;
            case 7:
                zuVar = zu.LUNCH;
                break;
            case 8:
                zuVar = zu.DINNER;
                break;
            case 9:
                zuVar = zu.BRUNCH;
                break;
            case 10:
                zuVar = zu.PICKUP;
                break;
            case 11:
                zuVar = zu.ACCESS;
                break;
            case 12:
                zuVar = zu.SENIOR_HOURS;
                break;
            case 13:
                zuVar = zu.ONLINE_SERVICE_HOURS;
                break;
            default:
                zuVar = null;
                break;
        }
        return zuVar == null ? zu.UNRECOGNIZED : zuVar;
    }

    public final List N() {
        return this.zzi;
    }

    public final boolean O() {
        return (this.zzb & 2) != 0;
    }

    public final f10 P() {
        f10 f10Var = this.zzj;
        return f10Var == null ? f10.L() : f10Var;
    }

    public final boolean Q() {
        return (this.zzb & 4) != 0;
    }

    public final f10 R() {
        f10 f10Var = this.zzk;
        return f10Var == null ? f10.L() : f10Var;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001b\u0003Ț\u0004\f\u0005\u001b\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"zzb", "zze", "zzf", yu.class, "zzg", "zzh", "zzi", bv.class, "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new cv();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new uu(bArr);
        }
        if (i16 == 5) {
            return zzl;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzm;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (cv.class) {
            try {
                vyVar = zzm;
                if (vyVar == null) {
                    vyVar = new vy(zzl);
                    zzm = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
