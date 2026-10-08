package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f149176c;
    private long cL;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f149177x0;
    private long x0L;

    public GOST3410ValidationParameters(int i15, int i16) {
        this.f149177x0 = i15;
        this.f149176c = i16;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f149176c == this.f149176c && gOST3410ValidationParameters.f149177x0 == this.f149177x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f149176c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f149177x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i15 = this.f149177x0 ^ this.f149176c;
        long j15 = this.x0L;
        int i16 = (i15 ^ ((int) j15)) ^ ((int) (j15 >> 32));
        long j16 = this.cL;
        return (i16 ^ ((int) j16)) ^ ((int) (j16 >> 32));
    }

    public GOST3410ValidationParameters(long j15, long j16) {
        this.x0L = j15;
        this.cL = j16;
    }
}
