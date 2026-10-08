package wv;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvv/h;", "Lvv/e;", "buffer", "", "offset", "byteCount", "Loq/i0;", "c", "(Lvv/h;Lvv/e;II)V", "", "s", "codePointCount", "b", "([BI)I", "", "a", "[C", "d", "()[C", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f215228a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(byte[] bArr, int i15) {
        byte b15;
        int i16;
        int length = bArr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < length) {
            byte b16 = bArr[i17];
            if (b16 >= 0) {
                int i25 = i19 + 1;
                if (i19 == i15) {
                    break;
                }
                if ((b16 != 10 && b16 != 13 && ((b16 >= 0 && b16 < 32) || (127 <= b16 && b16 < 160))) || b16 == 65533) {
                    return -1;
                }
                i18 += b16 < 65536 ? 1 : 2;
                i17++;
                while (true) {
                    i19 = i25;
                    if (i17 >= length || (b15 = bArr[i17]) < 0) {
                        break;
                    }
                    i17++;
                    i25 = i19 + 1;
                    if (i19 == i15) {
                        return i18;
                    }
                    if ((b15 != 10 && b15 != 13 && ((b15 >= 0 && b15 < 32) || (127 <= b15 && b15 < 160))) || b15 == 65533) {
                        return -1;
                    }
                    i18 += b15 < 65536 ? 1 : 2;
                }
                i0 i0Var = i0.f148189a;
            } else if ((b16 >> 5) == -2) {
                int i26 = i17 + 1;
                if (length <= i26) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                byte b17 = bArr[i26];
                if ((b17 & 192) != 128) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                int i27 = (b16 << 6) ^ (b17 ^ 3968);
                if (i27 < 128) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                int i28 = i19 + 1;
                if (i19 == i15) {
                    break;
                }
                if ((i27 != 10 && i27 != 13 && ((i27 >= 0 && i27 < 32) || (127 <= i27 && i27 < 160))) || i27 == 65533) {
                    return -1;
                }
                i18 += i27 < 65536 ? 1 : 2;
                i0 i0Var2 = i0.f148189a;
                i17 += 2;
                i19 = i28;
            } else if ((b16 >> 4) == -2) {
                int i29 = i17 + 2;
                if (length <= i29) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                byte b18 = bArr[i17 + 1];
                if ((b18 & 192) != 128) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                byte b19 = bArr[i29];
                if ((b19 & 192) != 128) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                int i35 = (b16 << 12) ^ ((b19 ^ (-123008)) ^ (b18 << 6));
                if (i35 < 2048) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i35 && i35 < 57344) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                i16 = i19 + 1;
                if (i19 == i15) {
                    break;
                }
                if ((i35 != 10 && i35 != 13 && ((i35 >= 0 && i35 < 32) || (127 <= i35 && i35 < 160))) || i35 == 65533) {
                    return -1;
                }
                i18 += i35 < 65536 ? 1 : 2;
                i0 i0Var3 = i0.f148189a;
                i17 += 3;
                i19 = i16;
            } else {
                if ((b16 >> 3) != -2) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                int i36 = i17 + 3;
                if (length <= i36) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                byte b25 = bArr[i17 + 1];
                if ((b25 & 192) != 128) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                byte b26 = bArr[i17 + 2];
                if ((b26 & 192) != 128) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                byte b27 = bArr[i36];
                if ((b27 & 192) != 128) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                int i37 = (b16 << 18) ^ (((b27 ^ 3678080) ^ (b26 << 6)) ^ (b25 << 12));
                if (i37 > 1114111) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i37 && i37 < 57344) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                if (i37 < 65536) {
                    if (i19 == i15) {
                        break;
                    }
                    return -1;
                }
                i16 = i19 + 1;
                if (i19 == i15) {
                    break;
                }
                if ((i37 != 10 && i37 != 13 && ((i37 >= 0 && i37 < 32) || (127 <= i37 && i37 < 160))) || i37 == 65533) {
                    return -1;
                }
                i18 += i37 < 65536 ? 1 : 2;
                i0 i0Var4 = i0.f148189a;
                i17 += 4;
                i19 = i16;
            }
        }
        return i18;
    }

    public static final void c(vv.h hVar, vv.e eVar, int i15, int i16) {
        eVar.write(hVar.getData(), i15, i16);
    }

    public static final char[] d() {
        return f215228a;
    }
}
