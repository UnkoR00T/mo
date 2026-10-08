package n3;

import androidx.compose.ui.graphics.Color;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u0000*\u00020\u0007H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "red", "green", "blue", "alpha", "Lo3/c;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "a", "(FFFFLo3/c;)J", "f", "", "color", "b", "(I)J", "", "d", "(J)J", "c", "(IIII)J", "start", "stop", "fraction", "h", "(JJF)J", "background", "g", "(JJ)J", "i", "(J)F", "j", "(J)I", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o1 {
    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0157  */
    /* JADX WARN: Code duplicated, block: B:110:0x016f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:117:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x019f  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x0129  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    public static final long a(float f15, float f16, float f17, float f18, o3.c cVar) {
        int i15;
        int i16;
        int i17;
        float f19;
        float fE;
        int iFloatToRawIntBits;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        float f25;
        float fE2;
        int iFloatToRawIntBits2;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        float f26;
        if (cVar.getIsSrgb()) {
            float f27 = f18 < 0.0f ? 0.0f : f18;
            if (f27 > 1.0f) {
                f27 = 1.0f;
            }
            int i49 = ((int) ((f27 * 255.0f) + 0.5f)) << 24;
            float f28 = f15 < 0.0f ? 0.0f : f15;
            if (f28 > 1.0f) {
                f28 = 1.0f;
            }
            int i55 = i49 | (((int) ((f28 * 255.0f) + 0.5f)) << 16);
            float f29 = f16 < 0.0f ? 0.0f : f16;
            if (f29 > 1.0f) {
                f29 = 1.0f;
            }
            int i56 = i55 | (((int) ((f29 * 255.0f) + 0.5f)) << 8);
            f26 = f17 >= 0.0f ? f17 : 0.0f;
            return Color.m6constructorimpl(oq.d0.e(oq.d0.e(i56 | ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        int i57 = 0;
        if (!(cVar.c() == 3)) {
            e2.a("Color only works with ColorSpaces with 3 components");
        }
        int iD = cVar.getId();
        if (!(iD != -1)) {
            e2.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float f35 = cVar.f(0);
        float fE3 = cVar.e(0);
        if (f15 >= f35) {
            f35 = f15;
        }
        if (f35 <= fE3) {
            fE3 = f35;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fE3);
        int i58 = iFloatToRawIntBits3 >>> 31;
        int i59 = (iFloatToRawIntBits3 >>> 23) & GF2Field.MASK;
        int i65 = iFloatToRawIntBits3 & 8388607;
        if (i59 == 255) {
            i16 = i65 != 0 ? 512 : 0;
            i15 = 31;
        } else {
            i15 = i59 - 112;
            if (i15 >= 31) {
                i16 = 0;
                i15 = 49;
            } else {
                if (i15 > 0) {
                    int i66 = i65 >> 13;
                    if ((iFloatToRawIntBits3 & PKIFailureInfo.certConfirmed) != 0) {
                        i17 = (((i15 << 10) | i66) + 1) | (i58 << 15);
                    } else {
                        i16 = i66;
                    }
                    short s15 = (short) i17;
                    f19 = cVar.f(1);
                    fE = cVar.e(1);
                    if (f16 >= f19) {
                        f19 = f16;
                    }
                    if (f19 <= fE) {
                        fE = f19;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fE);
                    i18 = iFloatToRawIntBits >>> 31;
                    i19 = (iFloatToRawIntBits >>> 23) & GF2Field.MASK;
                    i25 = iFloatToRawIntBits & 8388607;
                    if (i19 == 255) {
                        if (i25 != 0) {
                            i28 = 512;
                        } else {
                            i28 = 0;
                        }
                        i26 = 31;
                    } else {
                        i26 = i19 - 112;
                        if (i26 >= 31) {
                            i28 = 0;
                            i26 = 49;
                        } else {
                            if (i26 <= 0) {
                                i27 = i25 >> 13;
                                if ((iFloatToRawIntBits & PKIFailureInfo.certConfirmed) != 0) {
                                    i29 = (((i26 << 10) | i27) + 1) | (i18 << 15);
                                } else {
                                    i28 = i27;
                                }
                                short s16 = (short) i29;
                                f25 = cVar.f(2);
                                fE2 = cVar.e(2);
                                if (f17 >= f25) {
                                    f25 = f17;
                                }
                                if (f25 <= fE2) {
                                    fE2 = f25;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                                i36 = iFloatToRawIntBits2 >>> 31;
                                i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
                                i38 = 8388607 & iFloatToRawIntBits2;
                                if (i37 == 255) {
                                    i46 = i38 != 0 ? 512 : 0;
                                    i57 = 31;
                                } else {
                                    i39 = i37 - 112;
                                    if (i39 >= 31) {
                                        i46 = 0;
                                        i57 = 49;
                                    } else {
                                        if (i39 <= 0) {
                                            i45 = i38 >> 13;
                                            if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                                                i47 = (((i39 << 10) | i45) + 1) | (i36 << 15);
                                            } else {
                                                i46 = i45;
                                                i57 = i39;
                                            }
                                            short s17 = (short) i47;
                                            f26 = f18 >= 0.0f ? f18 : 0.0f;
                                            return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((65535 & ((long) s17)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                                        }
                                        if (i39 >= -10) {
                                            i48 = (i38 | 8388608) >> (1 - i39);
                                            if ((i48 & PKIFailureInfo.certConfirmed) != 0) {
                                                i48 += PKIFailureInfo.certRevoked;
                                            }
                                            i46 = i48 >> 13;
                                        } else {
                                            i46 = 0;
                                        }
                                    }
                                }
                                i47 = i46 | (i36 << 15) | (i57 << 10);
                                short s18 = (short) i47;
                                if (f18 >= 0.0f) {
                                }
                                return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((65535 & ((long) s18)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i26 >= -10) {
                                i35 = (i25 | 8388608) >> (1 - i26);
                                if ((i35 & PKIFailureInfo.certConfirmed) != 0) {
                                    i35 += PKIFailureInfo.certRevoked;
                                }
                                i28 = i35 >> 13;
                                i26 = 0;
                            } else {
                                i28 = 0;
                                i26 = 0;
                            }
                        }
                    }
                    i29 = i28 | (i18 << 15) | (i26 << 10);
                    short s19 = (short) i29;
                    f25 = cVar.f(2);
                    fE2 = cVar.e(2);
                    if (f17 >= f25) {
                        f25 = f17;
                    }
                    if (f25 <= fE2) {
                        fE2 = f25;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                    i36 = iFloatToRawIntBits2 >>> 31;
                    i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
                    i38 = 8388607 & iFloatToRawIntBits2;
                    if (i37 == 255) {
                        i46 = i38 != 0 ? 512 : 0;
                        i57 = 31;
                    } else {
                        i39 = i37 - 112;
                        if (i39 >= 31) {
                            i46 = 0;
                            i57 = 49;
                        } else {
                            if (i39 <= 0) {
                                i45 = i38 >> 13;
                                if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                                    i47 = (((i39 << 10) | i45) + 1) | (i36 << 15);
                                } else {
                                    i46 = i45;
                                    i57 = i39;
                                }
                                short s110 = (short) i47;
                                if (f18 >= 0.0f) {
                                }
                                return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s19) & 65535) << 32) | ((65535 & ((long) s110)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i39 >= -10) {
                                i48 = (i38 | 8388608) >> (1 - i39);
                                if ((i48 & PKIFailureInfo.certConfirmed) != 0) {
                                    i48 += PKIFailureInfo.certRevoked;
                                }
                                i46 = i48 >> 13;
                            } else {
                                i46 = 0;
                            }
                        }
                    }
                    i47 = i46 | (i36 << 15) | (i57 << 10);
                    short s111 = (short) i47;
                    if (f18 >= 0.0f) {
                    }
                    return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s15) & 65535) << 48) | ((((long) s19) & 65535) << 32) | ((65535 & ((long) s111)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i15 >= -10) {
                    int i67 = (i65 | 8388608) >> (1 - i15);
                    if ((i67 & PKIFailureInfo.certConfirmed) != 0) {
                        i67 += PKIFailureInfo.certRevoked;
                    }
                    i16 = i67 >> 13;
                    i15 = 0;
                } else {
                    i16 = 0;
                    i15 = 0;
                }
            }
        }
        i17 = i16 | (i58 << 15) | (i15 << 10);
        short s112 = (short) i17;
        f19 = cVar.f(1);
        fE = cVar.e(1);
        if (f16 >= f19) {
            f19 = f16;
        }
        if (f19 <= fE) {
            fE = f19;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fE);
        i18 = iFloatToRawIntBits >>> 31;
        i19 = (iFloatToRawIntBits >>> 23) & GF2Field.MASK;
        i25 = iFloatToRawIntBits & 8388607;
        if (i19 == 255) {
            if (i25 != 0) {
                i28 = 512;
            } else {
                i28 = 0;
            }
            i26 = 31;
        } else {
            i26 = i19 - 112;
            if (i26 >= 31) {
                i28 = 0;
                i26 = 49;
            } else {
                if (i26 <= 0) {
                    i27 = i25 >> 13;
                    if ((iFloatToRawIntBits & PKIFailureInfo.certConfirmed) != 0) {
                        i29 = (((i26 << 10) | i27) + 1) | (i18 << 15);
                    } else {
                        i28 = i27;
                    }
                    short s113 = (short) i29;
                    f25 = cVar.f(2);
                    fE2 = cVar.e(2);
                    if (f17 >= f25) {
                        f25 = f17;
                    }
                    if (f25 <= fE2) {
                        fE2 = f25;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
                    i36 = iFloatToRawIntBits2 >>> 31;
                    i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
                    i38 = 8388607 & iFloatToRawIntBits2;
                    if (i37 == 255) {
                        i46 = i38 != 0 ? 512 : 0;
                        i57 = 31;
                    } else {
                        i39 = i37 - 112;
                        if (i39 >= 31) {
                            i46 = 0;
                            i57 = 49;
                        } else {
                            if (i39 <= 0) {
                                i45 = i38 >> 13;
                                if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                                    i47 = (((i39 << 10) | i45) + 1) | (i36 << 15);
                                } else {
                                    i46 = i45;
                                    i57 = i39;
                                }
                                short s114 = (short) i47;
                                if (f18 >= 0.0f) {
                                }
                                return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s112) & 65535) << 48) | ((((long) s113) & 65535) << 32) | ((65535 & ((long) s114)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                            }
                            if (i39 >= -10) {
                                i48 = (i38 | 8388608) >> (1 - i39);
                                if ((i48 & PKIFailureInfo.certConfirmed) != 0) {
                                    i48 += PKIFailureInfo.certRevoked;
                                }
                                i46 = i48 >> 13;
                            } else {
                                i46 = 0;
                            }
                        }
                    }
                    i47 = i46 | (i36 << 15) | (i57 << 10);
                    short s115 = (short) i47;
                    if (f18 >= 0.0f) {
                    }
                    return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s112) & 65535) << 48) | ((((long) s113) & 65535) << 32) | ((65535 & ((long) s115)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i26 >= -10) {
                    i35 = (i25 | 8388608) >> (1 - i26);
                    if ((i35 & PKIFailureInfo.certConfirmed) != 0) {
                        i35 += PKIFailureInfo.certRevoked;
                    }
                    i28 = i35 >> 13;
                    i26 = 0;
                } else {
                    i28 = 0;
                    i26 = 0;
                }
            }
        }
        i29 = i28 | (i18 << 15) | (i26 << 10);
        short s116 = (short) i29;
        f25 = cVar.f(2);
        fE2 = cVar.e(2);
        if (f17 >= f25) {
            f25 = f17;
        }
        if (f25 <= fE2) {
            fE2 = f25;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fE2);
        i36 = iFloatToRawIntBits2 >>> 31;
        i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
        i38 = 8388607 & iFloatToRawIntBits2;
        if (i37 == 255) {
            i46 = i38 != 0 ? 512 : 0;
            i57 = 31;
        } else {
            i39 = i37 - 112;
            if (i39 >= 31) {
                i46 = 0;
                i57 = 49;
            } else {
                if (i39 <= 0) {
                    i45 = i38 >> 13;
                    if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                        i47 = (((i39 << 10) | i45) + 1) | (i36 << 15);
                    } else {
                        i46 = i45;
                        i57 = i39;
                    }
                    short s117 = (short) i47;
                    if (f18 >= 0.0f) {
                    }
                    return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s112) & 65535) << 48) | ((((long) s116) & 65535) << 32) | ((65535 & ((long) s117)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
                }
                if (i39 >= -10) {
                    i48 = (i38 | 8388608) >> (1 - i39);
                    if ((i48 & PKIFailureInfo.certConfirmed) != 0) {
                        i48 += PKIFailureInfo.certRevoked;
                    }
                    i46 = i48 >> 13;
                } else {
                    i46 = 0;
                }
            }
        }
        i47 = i46 | (i36 << 15) | (i57 << 10);
        short s118 = (short) i47;
        if (f18 >= 0.0f) {
        }
        return Color.m6constructorimpl(oq.d0.e((((long) iD) & 63) | ((((long) s112) & 65535) << 48) | ((((long) s116) & 65535) << 32) | ((65535 & ((long) s118)) << 16) | ((((long) ((int) (((f26 <= 1.0f ? f26 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6)));
    }

    public static final long b(int i15) {
        return Color.m6constructorimpl(oq.d0.e(oq.d0.e(i15) << 32));
    }

    public static final long c(int i15, int i16, int i17, int i18) {
        return b(((i15 & GF2Field.MASK) << 16) | ((i18 & GF2Field.MASK) << 24) | ((i16 & GF2Field.MASK) << 8) | (i17 & GF2Field.MASK));
    }

    public static final long d(long j15) {
        return Color.m6constructorimpl(oq.d0.e(j15 << 32));
    }

    public static /* synthetic */ long e(int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 8) != 0) {
            i18 = GF2Field.MASK;
        }
        return c(i15, i16, i17, i18);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    public static final long f(float f15, float f16, float f17, float f18, o3.c cVar) {
        int i15;
        int i16;
        int i17;
        int iFloatToRawIntBits;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int iFloatToRawIntBits2;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        if (cVar.getIsSrgb()) {
            return Color.m6constructorimpl(oq.d0.e(oq.d0.e((((((int) ((f18 * 255.0f) + 0.5f)) << 24) | (((int) ((f15 * 255.0f) + 0.5f)) << 16)) | (((int) ((f16 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f17) + 0.5f))) << 32));
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f15);
        int i47 = iFloatToRawIntBits3 >>> 31;
        int i48 = (iFloatToRawIntBits3 >>> 23) & GF2Field.MASK;
        int i49 = iFloatToRawIntBits3 & 8388607;
        int i55 = 49;
        int i56 = 0;
        if (i48 == 255) {
            i16 = i49 != 0 ? 512 : 0;
            i15 = 31;
        } else {
            i15 = i48 - 112;
            if (i15 >= 31) {
                i15 = 49;
                i16 = 0;
            } else {
                if (i15 > 0) {
                    int i57 = i49 >> 13;
                    if ((iFloatToRawIntBits3 & PKIFailureInfo.certConfirmed) != 0) {
                        i17 = (((i15 << 10) | i57) + 1) | (i47 << 15);
                    } else {
                        i16 = i57;
                    }
                    short s15 = (short) i17;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f16);
                    i18 = iFloatToRawIntBits >>> 31;
                    i19 = (iFloatToRawIntBits >>> 23) & GF2Field.MASK;
                    i25 = iFloatToRawIntBits & 8388607;
                    if (i19 == 255) {
                        if (i25 != 0) {
                            i28 = 512;
                        } else {
                            i28 = 0;
                        }
                        i26 = 31;
                    } else {
                        i26 = i19 - 112;
                        if (i26 >= 31) {
                            i26 = 49;
                            i28 = 0;
                        } else {
                            if (i26 <= 0) {
                                i27 = i25 >> 13;
                                if ((iFloatToRawIntBits & PKIFailureInfo.certConfirmed) != 0) {
                                    i29 = (((i26 << 10) | i27) + 1) | (i18 << 15);
                                } else {
                                    i28 = i27;
                                }
                                short s16 = (short) i29;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f17);
                                i36 = iFloatToRawIntBits2 >>> 31;
                                i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
                                i38 = 8388607 & iFloatToRawIntBits2;
                                if (i37 == 255) {
                                    i39 = i37 - 112;
                                    if (i39 < 31) {
                                        if (i39 <= 0) {
                                            i56 = i38 >> 13;
                                            if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                                                i45 = (((i39 << 10) | i56) + 1) | (i36 << 15);
                                            } else {
                                                i55 = i39;
                                            }
                                        } else if (i39 >= -10) {
                                            i46 = (i38 | 8388608) >> (1 - i39);
                                            if ((i46 & PKIFailureInfo.certConfirmed) != 0) {
                                                i46 += PKIFailureInfo.certRevoked;
                                            }
                                            i55 = 0;
                                            i56 = i46 >> 13;
                                        } else {
                                            i55 = 0;
                                        }
                                    }
                                    return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                                }
                                i56 = i38 == 0 ? 0 : 512;
                                i55 = 31;
                                i45 = (i36 << 15) | (i55 << 10) | i56;
                                return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s15) & 65535) << 48) | ((((long) s16) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                            }
                            if (i26 >= -10) {
                                i35 = (i25 | 8388608) >> (1 - i26);
                                if ((i35 & PKIFailureInfo.certConfirmed) != 0) {
                                    i35 += PKIFailureInfo.certRevoked;
                                }
                                i28 = i35 >> 13;
                                i26 = 0;
                            } else {
                                i28 = 0;
                                i26 = 0;
                            }
                        }
                    }
                    i29 = i28 | (i18 << 15) | (i26 << 10);
                    short s17 = (short) i29;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f17);
                    i36 = iFloatToRawIntBits2 >>> 31;
                    i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
                    i38 = 8388607 & iFloatToRawIntBits2;
                    if (i37 == 255) {
                        i39 = i37 - 112;
                        if (i39 < 31) {
                            if (i39 <= 0) {
                                i56 = i38 >> 13;
                                if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                                    i45 = (((i39 << 10) | i56) + 1) | (i36 << 15);
                                } else {
                                    i55 = i39;
                                }
                            } else if (i39 >= -10) {
                                i46 = (i38 | 8388608) >> (1 - i39);
                                if ((i46 & PKIFailureInfo.certConfirmed) != 0) {
                                    i46 += PKIFailureInfo.certRevoked;
                                }
                                i55 = 0;
                                i56 = i46 >> 13;
                            } else {
                                i55 = 0;
                            }
                        }
                        return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s15) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                    }
                    i56 = i38 == 0 ? 0 : 512;
                    i55 = 31;
                    i45 = (i36 << 15) | (i55 << 10) | i56;
                    return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s15) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                }
                if (i15 >= -10) {
                    int i58 = (i49 | 8388608) >> (1 - i15);
                    if ((i58 & PKIFailureInfo.certConfirmed) != 0) {
                        i58 += PKIFailureInfo.certRevoked;
                    }
                    i16 = i58 >> 13;
                    i15 = 0;
                } else {
                    i16 = 0;
                    i15 = 0;
                }
            }
        }
        i17 = i16 | (i47 << 15) | (i15 << 10);
        short s18 = (short) i17;
        iFloatToRawIntBits = Float.floatToRawIntBits(f16);
        i18 = iFloatToRawIntBits >>> 31;
        i19 = (iFloatToRawIntBits >>> 23) & GF2Field.MASK;
        i25 = iFloatToRawIntBits & 8388607;
        if (i19 == 255) {
            if (i25 != 0) {
                i28 = 512;
            } else {
                i28 = 0;
            }
            i26 = 31;
        } else {
            i26 = i19 - 112;
            if (i26 >= 31) {
                i26 = 49;
                i28 = 0;
            } else {
                if (i26 <= 0) {
                    i27 = i25 >> 13;
                    if ((iFloatToRawIntBits & PKIFailureInfo.certConfirmed) != 0) {
                        i29 = (((i26 << 10) | i27) + 1) | (i18 << 15);
                    } else {
                        i28 = i27;
                    }
                    short s19 = (short) i29;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f17);
                    i36 = iFloatToRawIntBits2 >>> 31;
                    i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
                    i38 = 8388607 & iFloatToRawIntBits2;
                    if (i37 == 255) {
                        i39 = i37 - 112;
                        if (i39 < 31) {
                            if (i39 <= 0) {
                                i56 = i38 >> 13;
                                if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                                    i45 = (((i39 << 10) | i56) + 1) | (i36 << 15);
                                } else {
                                    i55 = i39;
                                }
                            } else if (i39 >= -10) {
                                i46 = (i38 | 8388608) >> (1 - i39);
                                if ((i46 & PKIFailureInfo.certConfirmed) != 0) {
                                    i46 += PKIFailureInfo.certRevoked;
                                }
                                i55 = 0;
                                i56 = i46 >> 13;
                            } else {
                                i55 = 0;
                            }
                        }
                        return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s18) & 65535) << 48) | ((((long) s19) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                    }
                    i56 = i38 == 0 ? 0 : 512;
                    i55 = 31;
                    i45 = (i36 << 15) | (i55 << 10) | i56;
                    return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s18) & 65535) << 48) | ((((long) s19) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
                }
                if (i26 >= -10) {
                    i35 = (i25 | 8388608) >> (1 - i26);
                    if ((i35 & PKIFailureInfo.certConfirmed) != 0) {
                        i35 += PKIFailureInfo.certRevoked;
                    }
                    i28 = i35 >> 13;
                    i26 = 0;
                } else {
                    i28 = 0;
                    i26 = 0;
                }
            }
        }
        i29 = i28 | (i18 << 15) | (i26 << 10);
        short s110 = (short) i29;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f17);
        i36 = iFloatToRawIntBits2 >>> 31;
        i37 = (iFloatToRawIntBits2 >>> 23) & GF2Field.MASK;
        i38 = 8388607 & iFloatToRawIntBits2;
        if (i37 == 255) {
            i39 = i37 - 112;
            if (i39 < 31) {
                if (i39 <= 0) {
                    i56 = i38 >> 13;
                    if ((iFloatToRawIntBits2 & PKIFailureInfo.certConfirmed) != 0) {
                        i45 = (((i39 << 10) | i56) + 1) | (i36 << 15);
                    } else {
                        i55 = i39;
                    }
                } else if (i39 >= -10) {
                    i46 = (i38 | 8388608) >> (1 - i39);
                    if ((i46 & PKIFailureInfo.certConfirmed) != 0) {
                        i46 += PKIFailureInfo.certRevoked;
                    }
                    i55 = 0;
                    i56 = i46 >> 13;
                } else {
                    i55 = 0;
                }
            }
            return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s18) & 65535) << 48) | ((((long) s110) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
        }
        i56 = i38 == 0 ? 0 : 512;
        i55 = 31;
        i45 = (i36 << 15) | (i55 << 10) | i56;
        return Color.m6constructorimpl(oq.d0.e(((((long) ((short) i45)) & 65535) << 16) | ((((long) s18) & 65535) << 48) | ((((long) s110) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f18, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.getId()) & 63)));
    }

    public static final long g(long j15, long j16) {
        long jM7convertvNxB06k = Color.m7convertvNxB06k(j15, Color.m14getColorSpaceimpl(j16));
        float fM12getAlphaimpl = Color.m12getAlphaimpl(j16);
        float fM12getAlphaimpl2 = Color.m12getAlphaimpl(jM7convertvNxB06k);
        float f15 = 1.0f - fM12getAlphaimpl2;
        float f16 = (fM12getAlphaimpl * f15) + fM12getAlphaimpl2;
        return f(f16 == 0.0f ? 0.0f : ((Color.m16getRedimpl(jM7convertvNxB06k) * fM12getAlphaimpl2) + ((Color.m16getRedimpl(j16) * fM12getAlphaimpl) * f15)) / f16, f16 == 0.0f ? 0.0f : ((Color.m15getGreenimpl(jM7convertvNxB06k) * fM12getAlphaimpl2) + ((Color.m15getGreenimpl(j16) * fM12getAlphaimpl) * f15)) / f16, f16 != 0.0f ? ((Color.m13getBlueimpl(jM7convertvNxB06k) * fM12getAlphaimpl2) + ((Color.m13getBlueimpl(j16) * fM12getAlphaimpl) * f15)) / f16 : 0.0f, f16, Color.m14getColorSpaceimpl(j16));
    }

    public static final long h(long j15, long j16, float f15) {
        o3.c cVarD = o3.k.f141750a.D();
        long jM7convertvNxB06k = Color.m7convertvNxB06k(j15, cVarD);
        long jM7convertvNxB06k2 = Color.m7convertvNxB06k(j16, cVarD);
        float fM12getAlphaimpl = Color.m12getAlphaimpl(jM7convertvNxB06k);
        float fM16getRedimpl = Color.m16getRedimpl(jM7convertvNxB06k);
        float fM15getGreenimpl = Color.m15getGreenimpl(jM7convertvNxB06k);
        float fM13getBlueimpl = Color.m13getBlueimpl(jM7convertvNxB06k);
        float fM12getAlphaimpl2 = Color.m12getAlphaimpl(jM7convertvNxB06k2);
        float fM16getRedimpl2 = Color.m16getRedimpl(jM7convertvNxB06k2);
        float fM15getGreenimpl2 = Color.m15getGreenimpl(jM7convertvNxB06k2);
        float fM13getBlueimpl2 = Color.m13getBlueimpl(jM7convertvNxB06k2);
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        return Color.m7convertvNxB06k(f(e5.c.b(fM16getRedimpl, fM16getRedimpl2, f15), e5.c.b(fM15getGreenimpl, fM15getGreenimpl2, f15), e5.c.b(fM13getBlueimpl, fM13getBlueimpl2, f15), e5.c.b(fM12getAlphaimpl, fM12getAlphaimpl2, f15), cVarD), Color.m14getColorSpaceimpl(j16));
    }

    public static final float i(long j15) {
        o3.c cVarM14getColorSpaceimpl = Color.m14getColorSpaceimpl(j15);
        if (!o3.b.e(cVarM14getColorSpaceimpl.getModel(), o3.b.INSTANCE.b())) {
            e2.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) o3.b.h(cVarM14getColorSpaceimpl.getModel())));
        }
        o3.n nVarA = ((o3.f0) cVarM14getColorSpaceimpl).getEotfFunc();
        float fA = (float) ((nVarA.a(Color.m16getRedimpl(j15)) * 0.2126d) + (nVarA.a(Color.m15getGreenimpl(j15)) * 0.7152d) + (nVarA.a(Color.m13getBlueimpl(j15)) * 0.0722d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int j(long j15) {
        return (int) oq.d0.e(Color.m7convertvNxB06k(j15, o3.k.f141750a.G()) >>> 32);
    }
}
