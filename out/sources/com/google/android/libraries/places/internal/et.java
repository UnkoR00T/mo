package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class et extends az implements i00 {
    private static final et zzh;
    private static volatile p00 zzi;
    private int zzb;
    private int zze;
    private k30 zzf;
    private f10 zzg;

    static {
        et etVar = new et();
        zzh = etVar;
        az.r(et.class, etVar);
    }

    private et() {
    }

    public final dt I() {
        dt dtVar;
        switch (this.zze) {
            case 0:
                dtVar = dt.FUEL_TYPE_UNSPECIFIED;
                break;
            case 1:
                dtVar = dt.DIESEL;
                break;
            case 2:
                dtVar = dt.REGULAR_UNLEADED;
                break;
            case 3:
                dtVar = dt.MIDGRADE;
                break;
            case 4:
                dtVar = dt.PREMIUM;
                break;
            case 5:
                dtVar = dt.SP91;
                break;
            case 6:
                dtVar = dt.SP91_E10;
                break;
            case 7:
                dtVar = dt.SP92;
                break;
            case 8:
                dtVar = dt.SP95;
                break;
            case 9:
                dtVar = dt.SP95_E10;
                break;
            case 10:
                dtVar = dt.SP98;
                break;
            case 11:
                dtVar = dt.SP99;
                break;
            case 12:
                dtVar = dt.SP100;
                break;
            case 13:
                dtVar = dt.LPG;
                break;
            case 14:
                dtVar = dt.E80;
                break;
            case 15:
                dtVar = dt.E85;
                break;
            case 16:
                dtVar = dt.METHANE;
                break;
            case 17:
                dtVar = dt.BIO_DIESEL;
                break;
            case 18:
                dtVar = dt.TRUCK_DIESEL;
                break;
            case 19:
                dtVar = dt.DIESEL_PLUS;
                break;
            case 20:
                dtVar = dt.E100;
                break;
            default:
                dtVar = null;
                break;
        }
        return dtVar == null ? dt.UNRECOGNIZED : dtVar;
    }

    public final k30 J() {
        k30 k30Var = this.zzf;
        return k30Var == null ? k30.L() : k30Var;
    }

    public final f10 K() {
        f10 f10Var = this.zzg;
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
            return az.s(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new et();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ct(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (et.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
