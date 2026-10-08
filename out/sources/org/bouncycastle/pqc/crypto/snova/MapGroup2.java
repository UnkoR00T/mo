package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
class MapGroup2 {

    /* JADX INFO: renamed from: f11, reason: collision with root package name */
    public final byte[][][][] f149576f11;

    /* JADX INFO: renamed from: f12, reason: collision with root package name */
    public final byte[][][][] f149577f12;

    /* JADX INFO: renamed from: f21, reason: collision with root package name */
    public final byte[][][][] f149578f21;

    public MapGroup2(SnovaParameters snovaParameters) {
        int m15 = snovaParameters.getM();
        int v15 = snovaParameters.getV();
        int o15 = snovaParameters.getO();
        int lsq = snovaParameters.getLsq();
        Class cls = Byte.TYPE;
        this.f149576f11 = (byte[][][][]) Array.newInstance((Class<?>) cls, m15, v15, v15, lsq);
        this.f149577f12 = (byte[][][][]) Array.newInstance((Class<?>) cls, m15, v15, o15, lsq);
        this.f149578f21 = (byte[][][][]) Array.newInstance((Class<?>) cls, m15, o15, v15, lsq);
    }
}
