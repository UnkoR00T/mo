package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class vs extends az implements i00 {
    private static final vs zzk;
    private static volatile p00 zzl;
    private int zzb;
    private int zze;
    private double zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private f10 zzj;

    static {
        vs vsVar = new vs();
        zzk = vsVar;
        az.r(vs.class, vsVar);
    }

    private vs() {
    }

    public final zs I() {
        zs zsVar;
        switch (this.zze) {
            case 0:
                zsVar = zs.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                zsVar = zs.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                zsVar = zs.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                zsVar = zs.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                zsVar = zs.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                zsVar = zs.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                zsVar = zs.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                zsVar = zs.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                zsVar = zs.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                zsVar = zs.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            case 10:
                zsVar = zs.EV_CONNECTOR_TYPE_NACS;
                break;
            default:
                zsVar = null;
                break;
        }
        return zsVar == null ? zs.UNRECOGNIZED : zsVar;
    }

    public final double J() {
        return this.zzf;
    }

    public final int K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzb & 1) != 0;
    }

    public final int M() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zzb & 2) != 0;
    }

    public final int O() {
        return this.zzi;
    }

    public final boolean P() {
        return (this.zzb & 4) != 0;
    }

    public final f10 Q() {
        f10 f10Var = this.zzj;
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
            return az.s(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0004\u0004င\u0000\u0005င\u0001\u0006ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new vs();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new us(bArr);
        }
        if (i16 == 5) {
            return zzk;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzl;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (vs.class) {
            try {
                vyVar = zzl;
                if (vyVar == null) {
                    vyVar = new vy(zzk);
                    zzl = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
