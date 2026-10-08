package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class rr0 implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rr0 f33593d = new rr0(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f33595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f33596c;

    public rr0(byte[] bArr) {
        this.f33594a = bArr;
    }

    public boolean A(int i15, byte[] bArr, int i16, int i17) {
        if (i15 < 0) {
            return false;
        }
        byte[] bArr2 = this.f33594a;
        return i15 <= bArr2.length - i17 && i16 >= 0 && i16 <= bArr.length - i17 && jr0.b(bArr2, i15, bArr, i16, i17);
    }

    public final boolean B(rr0 rr0Var) {
        return y(0, rr0Var, 0, rr0Var.f33594a.length);
    }

    public final byte[] b() {
        return this.f33594a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        rr0 rr0Var = (rr0) obj;
        int iS = s();
        int iS2 = rr0Var.s();
        int iMin = Math.min(iS, iS2);
        for (int i15 = 0; i15 < iMin; i15++) {
            int iR = r(i15) & 255;
            int iR2 = rr0Var.r(i15) & 255;
            if (iR != iR2) {
                return iR >= iR2 ? 1 : -1;
            }
        }
        if (iS == iS2) {
            return 0;
        }
        return iS >= iS2 ? 1 : -1;
    }

    public final int e() {
        return this.f33595b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rr0) {
            rr0 rr0Var = (rr0) obj;
            int iS = rr0Var.s();
            byte[] bArr = this.f33594a;
            int length = bArr.length;
            return iS == length && rr0Var.A(0, bArr, 0, length);
        }
        return false;
    }

    public final void g(int i15) {
        this.f33595b = i15;
    }

    public int hashCode() {
        int i15 = this.f33595b;
        if (i15 != 0) {
            return i15;
        }
        int iHashCode = Arrays.hashCode(this.f33594a);
        this.f33595b = iHashCode;
        return iHashCode;
    }

    public final void j(String str) {
        this.f33596c = str;
    }

    public final String k() {
        String str = this.f33596c;
        if (str != null) {
            return str;
        }
        String strA = hs0.a(v());
        this.f33596c = strA;
        return strA;
    }

    public final String n() {
        return ir0.a(this.f33594a, null, 1, null);
    }

    public String o() {
        byte[] bArr = this.f33594a;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i15 = 0;
        for (byte b15 : bArr) {
            cArr[i15] = js0.a()[(b15 >> 4) & 15];
            cArr[i15 + 1] = js0.a()[b15 & 15];
            i15 += 2;
        }
        return fu.r.y(cArr);
    }

    public rr0 p() {
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f33594a;
            int length = bArr.length;
            if (i15 >= length) {
                return this;
            }
            int i16 = i15 + 1;
            byte b15 = bArr[i15];
            if (b15 >= 65 && b15 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                bArrCopyOf[i15] = (byte) (b15 + 32);
                while (i16 < bArrCopyOf.length) {
                    int i17 = i16 + 1;
                    byte b16 = bArrCopyOf[i16];
                    if (b16 >= 65 && b16 <= 90) {
                        bArrCopyOf[i16] = (byte) (b16 + 32);
                    }
                    i16 = i17;
                }
                return new rr0(bArrCopyOf);
            }
            i15 = i16;
        }
    }

    public byte r(int i15) {
        return this.f33594a[i15];
    }

    public int s() {
        return this.f33594a.length;
    }

    public byte[] t() {
        byte[] bArr = this.f33594a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0151  */
    /* JADX WARN: Code duplicated, block: B:132:0x0154  */
    /* JADX WARN: Code duplicated, block: B:134:0x0177  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x0219  */
    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a6  */
    public String toString() {
        String strK;
        String strP;
        int length;
        int i15;
        byte[] bArr = this.f33594a;
        int length2 = bArr.length;
        if (length2 == 0) {
            return "[size=0]";
        }
        int i16 = js0.f32675b;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i17 < length2) {
                byte b15 = bArr[i17];
                if (b15 >= 0) {
                    i15 = i18 + 1;
                    if (i18 != 64) {
                        if (b15 == 10 || b15 == 13 || (b15 >= 32 && b15 < 127)) {
                            i19++;
                            i17++;
                            while (true) {
                                if (i17 < length2) {
                                    byte b16 = bArr[i17];
                                    if (b16 >= 0) {
                                        i17++;
                                        int i25 = i15 + 1;
                                        if (i15 != 64) {
                                            if (b16 == 10 || b16 == 13 || (b16 >= 32 && b16 < 127)) {
                                                i19++;
                                                i15 = i25;
                                            }
                                        }
                                    }
                                }
                                oq.i0 i0Var = oq.i0.f148189a;
                                i18 = i15;
                            }
                        }
                        i19 = -1;
                    }
                } else {
                    if ((b15 >> 5) == -2) {
                        int i26 = i17 + 1;
                        if (length2 > i26) {
                            byte b17 = bArr[i26];
                            if ((b17 & 192) == 128) {
                                int i27 = (b15 << 6) ^ (b17 ^ 3968);
                                if (i27 >= 128) {
                                    i15 = i18 + 1;
                                    if (i18 != 64) {
                                        if (i27 >= 160 && i27 != 65533) {
                                            i17 += 2;
                                            i19 += i27 < 65536 ? 1 : 2;
                                            oq.i0 i0Var2 = oq.i0.f148189a;
                                        } else {
                                            i19 = -1;
                                        }
                                    }
                                } else if (i18 != 64) {
                                    i19 = -1;
                                }
                            } else if (i18 != 64) {
                                i19 = -1;
                            }
                        } else if (i18 != 64) {
                            i19 = -1;
                        }
                    } else if ((b15 >> 4) == -2) {
                        int i28 = i17 + 2;
                        if (length2 > i28) {
                            byte b18 = bArr[i17 + 1];
                            if ((b18 & 192) == 128) {
                                byte b19 = bArr[i28];
                                if ((b19 & 192) == 128) {
                                    int i29 = ((b19 ^ (-123008)) ^ (b18 << 6)) ^ (b15 << 12);
                                    if (i29 < 2048) {
                                        if (i18 != 64) {
                                            i19 = -1;
                                        }
                                    } else if (i29 < 55296 || i29 >= 57344) {
                                        i15 = i18 + 1;
                                        if (i18 != 64) {
                                            if (i29 == 65533) {
                                                i19 = -1;
                                            } else {
                                                i17 += 3;
                                                i19 += i29 < 65536 ? 1 : 2;
                                                oq.i0 i0Var3 = oq.i0.f148189a;
                                            }
                                        }
                                    } else if (i18 != 64) {
                                        i19 = -1;
                                    }
                                } else if (i18 != 64) {
                                    i19 = -1;
                                }
                            } else if (i18 != 64) {
                                i19 = -1;
                            }
                        } else if (i18 != 64) {
                            i19 = -1;
                        }
                    } else if ((b15 >> 3) == -2) {
                        int i35 = i17 + 3;
                        if (length2 > i35) {
                            byte b25 = bArr[i17 + 1];
                            if ((b25 & 192) == 128) {
                                byte b26 = bArr[i17 + 2];
                                if ((b26 & 192) == 128) {
                                    byte b27 = bArr[i35];
                                    if ((b27 & 192) == 128) {
                                        int i36 = (((b27 ^ 3678080) ^ (b26 << 6)) ^ (b25 << 12)) ^ (b15 << 18);
                                        if (i36 > 1114111) {
                                            if (i18 != 64) {
                                                i19 = -1;
                                            }
                                        } else if (i36 < 55296 || i36 >= 57344) {
                                            if (i36 >= 65536) {
                                                i15 = i18 + 1;
                                                if (i18 != 64) {
                                                    i19 += 2;
                                                    oq.i0 i0Var4 = oq.i0.f148189a;
                                                    i17 += 4;
                                                }
                                            } else if (i18 != 64) {
                                                i19 = -1;
                                            }
                                        } else if (i18 != 64) {
                                            i19 = -1;
                                        }
                                    } else if (i18 != 64) {
                                        i19 = -1;
                                    }
                                } else if (i18 != 64) {
                                    i19 = -1;
                                }
                            } else if (i18 != 64) {
                                i19 = -1;
                            }
                        } else if (i18 != 64) {
                            i19 = -1;
                        }
                    } else if (i18 != 64) {
                        i19 = -1;
                    }
                    i18 = i15;
                }
                if (i19 == -1) {
                    length = bArr.length;
                    if (length <= 64) {
                        String strO = o();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(strO).length() + 6);
                        sb5.append("[hex=");
                        sb5.append(strO);
                        sb5.append("]");
                        return sb5.toString();
                    }
                    String strO2 = new rr0(pq.n.t(bArr, 0, 64)).o();
                    StringBuilder sb6 = new StringBuilder(String.valueOf(length).length() + 11 + String.valueOf(strO2).length() + 2);
                    sb6.append("[size=");
                    sb6.append(length);
                    sb6.append(" hex=");
                    sb6.append(strO2);
                    sb6.append("…]");
                    return sb6.toString();
                }
                strK = k();
                strP = fu.r.P(fu.r.P(fu.r.P(strK.substring(0, i19), "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (i19 < strK.length()) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(strP).length() + 7);
                    sb7.append("[text=");
                    sb7.append(strP);
                    sb7.append("]");
                    return sb7.toString();
                }
                int length3 = bArr.length;
                StringBuilder sb8 = new StringBuilder(String.valueOf(length3).length() + 12 + String.valueOf(strP).length() + 2);
                sb8.append("[size=");
                sb8.append(length3);
                sb8.append(" text=");
                sb8.append(strP);
                sb8.append("…]");
                return sb8.toString();
            }
            if (i19 == -1) {
                length = bArr.length;
                if (length <= 64) {
                    String strO3 = o();
                    StringBuilder sb9 = new StringBuilder(String.valueOf(strO3).length() + 6);
                    sb9.append("[hex=");
                    sb9.append(strO3);
                    sb9.append("]");
                    return sb9.toString();
                }
                String strO4 = new rr0(pq.n.t(bArr, 0, 64)).o();
                StringBuilder sb10 = new StringBuilder(String.valueOf(length).length() + 11 + String.valueOf(strO4).length() + 2);
                sb10.append("[size=");
                sb10.append(length);
                sb10.append(" hex=");
                sb10.append(strO4);
                sb10.append("…]");
                return sb10.toString();
            }
            strK = k();
            strP = fu.r.P(fu.r.P(fu.r.P(strK.substring(0, i19), "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (i19 < strK.length()) {
                StringBuilder sb11 = new StringBuilder(String.valueOf(strP).length() + 7);
                sb11.append("[text=");
                sb11.append(strP);
                sb11.append("]");
                return sb11.toString();
            }
            int length4 = bArr.length;
            StringBuilder sb12 = new StringBuilder(String.valueOf(length4).length() + 12 + String.valueOf(strP).length() + 2);
            sb12.append("[size=");
            sb12.append(length4);
            sb12.append(" text=");
            sb12.append(strP);
            sb12.append("…]");
            return sb12.toString();
        }
    }

    public byte[] v() {
        return this.f33594a;
    }

    public void w(nr0 nr0Var, int i15, int i16) {
        int i17 = js0.f32675b;
        nr0Var.P1(this.f33594a, 0, i16);
    }

    public boolean y(int i15, rr0 rr0Var, int i16, int i17) {
        return rr0Var.A(0, this.f33594a, 0, i17);
    }
}
