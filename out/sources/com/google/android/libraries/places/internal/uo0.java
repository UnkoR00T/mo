package com.google.android.libraries.places.internal;

import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
final class uo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char[] f33964g;

    public uo0(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f33958a = name;
        this.f33959b = name.length();
    }

    private final String b() {
        int i15;
        int i16;
        int i17;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        while (true) {
            i15 = this.f33960c;
            i16 = this.f33959b;
            if (i15 >= i16 || this.f33964g[i15] != ' ') {
                break;
            }
            this.f33960c = i15 + 1;
        }
        if (i15 == i16) {
            return null;
        }
        this.f33961d = i15;
        this.f33960c = i15 + 1;
        while (true) {
            i17 = this.f33960c;
            if (i17 >= i16 || (c19 = this.f33964g[i17]) == '=' || c19 == ' ') {
                break;
            }
            this.f33960c = i17 + 1;
        }
        if (i17 >= i16) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.f33958a)));
        }
        this.f33962e = i17;
        if (this.f33964g[i17] == ' ') {
            while (true) {
                i17 = this.f33960c;
                if (i17 >= i16 || (c18 = this.f33964g[i17]) == '=' || c18 != ' ') {
                    break;
                }
                this.f33960c = i17 + 1;
            }
            if (this.f33964g[i17] != '=' || i17 == i16) {
                throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.f33958a)));
            }
        }
        this.f33960c = i17 + 1;
        while (true) {
            int i18 = this.f33960c;
            if (i18 >= i16 || this.f33964g[i18] != ' ') {
                break;
            }
            this.f33960c = i18 + 1;
        }
        int i19 = this.f33962e;
        int i25 = this.f33961d;
        if (i19 - i25 > 4) {
            char[] cArr = this.f33964g;
            if (cArr[i25 + 3] == '.' && (((c15 = cArr[i25]) == 'O' || c15 == 'o') && (((c16 = cArr[i25 + 1]) == 'I' || c16 == 'i') && ((c17 = cArr[i25 + 2]) == 'D' || c17 == 'd')))) {
                i25 += 4;
                this.f33961d = i25;
            }
        }
        return new String(this.f33964g, i25, i19 - i25);
    }

    private final char c() {
        int i15;
        int i16;
        int i17 = this.f33960c + 1;
        this.f33960c = i17;
        int i18 = this.f33959b;
        if (i17 == i18) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.f33958a)));
        }
        char c15 = this.f33964g[i17];
        if (c15 != ' ' && c15 != '%' && c15 != '\\' && c15 != '_' && c15 != '\"' && c15 != '#') {
            switch (c15) {
                default:
                    switch (c15) {
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iD = d(i17);
                            this.f33960c++;
                            if (iD >= 128) {
                                if (iD < 192 || iD > 247) {
                                    iD = 63;
                                } else {
                                    if (iD <= 223) {
                                        i15 = iD & 31;
                                        i16 = 1;
                                    } else if (iD <= 239) {
                                        i15 = iD & 15;
                                        i16 = 2;
                                    } else {
                                        i15 = iD & 7;
                                        i16 = 3;
                                    }
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < i16) {
                                            int i25 = this.f33960c;
                                            int i26 = i25 + 1;
                                            this.f33960c = i26;
                                            if (i26 != i18 && this.f33964g[i26] == '\\') {
                                                int i27 = i25 + 2;
                                                this.f33960c = i27;
                                                int iD2 = d(i27);
                                                this.f33960c++;
                                                if ((iD2 & 192) == 128) {
                                                    i15 = (i15 << 6) + (iD2 & 63);
                                                    i19++;
                                                }
                                            }
                                            iD = 63;
                                        } else {
                                            iD = (char) i15;
                                        }
                                    }
                                }
                            }
                            return (char) iD;
                    }
                case EACTags.CURRENCY_CODE /* 42 */:
                case EACTags.DATE_OF_BIRTH /* 43 */:
                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                    return c15;
            }
        }
        return c15;
    }

    private final int d(int i15) {
        int i16;
        int i17;
        int i18 = i15 + 1;
        if (i18 >= this.f33959b) {
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f33958a)));
        }
        char[] cArr = this.f33964g;
        char c15 = cArr[i15];
        if (c15 >= '0' && c15 <= '9') {
            i16 = c15 - '0';
        } else if (c15 >= 'a' && c15 <= 'f') {
            i16 = c15 - 'W';
        } else {
            if (c15 < 'A' || c15 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f33958a)));
            }
            i16 = c15 - '7';
        }
        char c16 = cArr[i18];
        if (c16 >= '0' && c16 <= '9') {
            i17 = c16 - '0';
        } else if (c16 >= 'a' && c16 <= 'f') {
            i17 = c16 - 'W';
        } else {
            if (c16 < 'A' || c16 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f33958a)));
            }
            i17 = c16 - '7';
        }
        return (i16 << 4) + i17;
    }

    public final String a(String str) {
        String str2;
        char[] cArr;
        char c15;
        int i15;
        char c16;
        this.f33960c = 0;
        this.f33961d = 0;
        this.f33962e = 0;
        this.f33963f = 0;
        String str3 = this.f33958a;
        this.f33964g = str3.toCharArray();
        String strB = b();
        if (strB == null) {
            return null;
        }
        do {
            int i16 = this.f33960c;
            int i17 = this.f33959b;
            if (i16 == i17) {
                return null;
            }
            char c17 = this.f33964g[i16];
            if (c17 == '\"') {
                int i18 = i16 + 1;
                this.f33960c = i18;
                this.f33961d = i18;
                this.f33962e = i18;
                while (true) {
                    int i19 = this.f33960c;
                    if (i19 == i17) {
                        throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                    }
                    char[] cArr2 = this.f33964g;
                    char c18 = cArr2[i19];
                    if (c18 == '\"') {
                        this.f33960c = i19 + 1;
                        while (true) {
                            int i25 = this.f33960c;
                            if (i25 >= i17 || this.f33964g[i25] != ' ') {
                                break;
                            }
                            this.f33960c = i25 + 1;
                        }
                        char[] cArr3 = this.f33964g;
                        int i26 = this.f33961d;
                        str2 = new String(cArr3, i26, this.f33962e - i26);
                        break;
                    }
                    if (c18 == '\\') {
                        cArr2[this.f33962e] = c();
                    } else {
                        cArr2[this.f33962e] = c18;
                    }
                    this.f33960c++;
                    this.f33962e++;
                }
            } else if (c17 != '#') {
                if (c17 == '+' || c17 == ',' || c17 == ';') {
                    str2 = "";
                } else {
                    this.f33961d = i16;
                    this.f33962e = i16;
                    while (true) {
                        int i27 = this.f33960c;
                        if (i27 >= i17) {
                            char[] cArr4 = this.f33964g;
                            int i28 = this.f33961d;
                            str2 = new String(cArr4, i28, this.f33962e - i28);
                            break;
                        }
                        char[] cArr5 = this.f33964g;
                        char c19 = cArr5[i27];
                        if (c19 != ' ') {
                            if (c19 != ';') {
                                if (c19 == '\\') {
                                    int i29 = this.f33962e;
                                    this.f33962e = i29 + 1;
                                    cArr5[i29] = c();
                                    this.f33960c++;
                                } else if (c19 != '+' && c19 != ',') {
                                    int i35 = this.f33962e;
                                    this.f33962e = i35 + 1;
                                    cArr5[i35] = c19;
                                    this.f33960c = i27 + 1;
                                }
                            }
                            int i36 = this.f33961d;
                            str2 = new String(cArr5, i36, this.f33962e - i36);
                            break;
                        }
                        int i37 = this.f33962e;
                        this.f33963f = i37;
                        this.f33960c = i27 + 1;
                        this.f33962e = i37 + 1;
                        cArr5[i37] = ' ';
                        while (true) {
                            i15 = this.f33960c;
                            if (i15 >= i17) {
                                break;
                            }
                            char[] cArr6 = this.f33964g;
                            if (cArr6[i15] != ' ') {
                                break;
                            }
                            int i38 = this.f33962e;
                            this.f33962e = i38 + 1;
                            cArr6[i38] = ' ';
                            this.f33960c = i15 + 1;
                        }
                        if (i15 == i17 || (c16 = this.f33964g[i15]) == ',' || c16 == '+' || c16 == ';') {
                            char[] cArr7 = this.f33964g;
                            int i39 = this.f33961d;
                            str2 = new String(cArr7, i39, this.f33963f - i39);
                            break;
                        }
                    }
                }
            } else {
                if (i16 + 4 >= i17) {
                    throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                }
                this.f33961d = i16;
                this.f33960c = i16 + 1;
                while (true) {
                    int i45 = this.f33960c;
                    if (i45 == i17 || (c15 = (cArr = this.f33964g)[i45]) == '+' || c15 == ',' || c15 == ';') {
                        this.f33962e = i45;
                        break;
                    }
                    int i46 = i45 + 1;
                    if (c15 == ' ') {
                        this.f33962e = i45;
                        this.f33960c = i46;
                        while (true) {
                            int i47 = this.f33960c;
                            if (i47 >= i17 || this.f33964g[i47] != ' ') {
                                break;
                            }
                            this.f33960c = i47 + 1;
                        }
                    } else {
                        if (c15 >= 'A' && c15 <= 'F') {
                            cArr[i45] = (char) (c15 + ' ');
                        }
                        this.f33960c = i46;
                    }
                }
                int i48 = this.f33962e;
                int i49 = this.f33961d;
                int i55 = i48 - i49;
                if (i55 < 5 || (i55 & 1) == 0) {
                    throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                }
                int i56 = i55 >> 1;
                int i57 = i49 + 1;
                byte[] bArr = new byte[i56];
                int i58 = 0;
                while (i58 < i56) {
                    bArr[i58] = (byte) d(i57);
                    i58++;
                    i57 += 2;
                }
                str2 = new String(this.f33964g, this.f33961d, i55);
            }
            if ("cn".equalsIgnoreCase(strB)) {
                return str2;
            }
            int i59 = this.f33960c;
            if (i59 >= i17) {
                return null;
            }
            char c25 = this.f33964g[i59];
            if (c25 != ',' && c25 != ';' && c25 != '+') {
                throw new IllegalStateException("Malformed DN: ".concat(str3));
            }
            this.f33960c = i59 + 1;
            strB = b();
        } while (strB != null);
        throw new IllegalStateException("Malformed DN: ".concat(str3));
    }
}
