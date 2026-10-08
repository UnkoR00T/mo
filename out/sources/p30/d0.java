package p30;

import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import q4.TextStyle;
import u0.i0;
import u0.i1;
import u0.q0;
import u0.s0;
import u0.s3;
import u0.x0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aS\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\f\u0010\u0016\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lmx/a;", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/graphics/Color;", "color", "Lq4/b4;", "textStyle", "Lu4/y;", "fontStyle", "", "minDots", "maxDots", "Lgu/b;", "cycleDuration", "Loq/i0;", "b", "(Lmx/a;JLq4/b4;IIIJLm2/r;II)V", "n", "e", "(Lmx/a;I)Lmx/a;", "a", "Lmx/a;", "DOT_LABEL", "visibleDots", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Label f152640a = mx.b.b(".", "dot");

    /* JADX WARN: Code duplicated, block: B:101:0x0111  */
    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:105:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x014c  */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x0234  */
    /* JADX WARN: Code duplicated, block: B:127:0x0242  */
    /* JADX WARN: Code duplicated, block: B:130:0x0254  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void b(final Label label, long j15, TextStyle textStyle, int i15, int i16, int i17, long j16, p076m2.r rVar, final int i18, final int i19) {
        int i25;
        long j17;
        TextStyle textStyle2;
        int i26;
        int i27;
        int i28;
        int i29;
        long j18;
        boolean z15;
        p076m2.r rVar2;
        final long j19;
        final TextStyle textStyle3;
        final int i35;
        final int i36;
        final long j25;
        final int i37;
        d5 d5VarM;
        long jB;
        TextStyle textStyleB;
        int iA;
        int i38;
        TextStyle textStyle4;
        int i39;
        long jQ;
        int i45;
        p076m2.r rVarH = rVar.h(-1596359890);
        if ((i18 & 6) == 0) {
            i25 = (rVarH.W(label) ? 4 : 2) | i18;
        } else {
            i25 = i18;
        }
        if ((i18 & 48) == 0) {
            if ((i19 & 2) == 0) {
                j17 = j15;
                int i46 = rVarH.d(j17) ? 32 : 16;
                i25 |= i46;
            } else {
                j17 = j15;
            }
            i25 |= i46;
        } else {
            j17 = j15;
        }
        if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i19 & 4) == 0) {
                textStyle2 = textStyle;
                int i47 = rVarH.W(textStyle2) ? 256 : 128;
                i25 |= i47;
            } else {
                textStyle2 = textStyle;
            }
            i25 |= i47;
        } else {
            textStyle2 = textStyle;
        }
        if ((i18 & 3072) == 0) {
            if ((i19 & 8) == 0) {
                i26 = i15;
                int i48 = rVarH.c(i26) ? 2048 : 1024;
                i25 |= i48;
            } else {
                i26 = i15;
            }
            i25 |= i48;
        } else {
            i26 = i15;
        }
        int i49 = i19 & 16;
        if (i49 == 0) {
            if ((i18 & 24576) == 0) {
                i27 = i16;
                i25 |= rVarH.c(i27) ? 16384 : PKIFailureInfo.certRevoked;
            }
            i28 = i19 & 32;
            if (i28 != 0) {
                if ((i18 & 196608) == 0) {
                    if (rVarH.c(i17)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i25 |= i29;
                }
                if ((1572864 & i18) == 0) {
                    j18 = j16;
                    if ((i19 & 64) == 0 || !rVarH.d(j18)) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.badCertTemplate;
                    }
                    i25 |= i45;
                } else {
                    j18 = j16;
                }
                if ((599187 & i25) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i25 & 1)) {
                    rVarH.I();
                    if ((i18 & 1) != 0 || rVarH.Q()) {
                        if ((i19 & 2) != 0) {
                            jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().b();
                            i25 &= -113;
                        } else {
                            jB = j17;
                        }
                        if ((i19 & 4) != 0) {
                            textStyleB = k70.a.f108864a.f(rVarH, k70.a.f108865b).b();
                            i25 &= -897;
                        } else {
                            textStyleB = textStyle2;
                        }
                        if ((i19 & 8) != 0) {
                            iA = u4.y.INSTANCE.a();
                            i25 &= -7169;
                        } else {
                            iA = i26;
                        }
                        if (i49 != 0) {
                            i27 = 0;
                        }
                        if (i28 != 0) {
                            i38 = 3;
                        } else {
                            i38 = i17;
                        }
                        if ((i19 & 64) != 0) {
                            gu.b.Companion companion = gu.b.INSTANCE;
                            i25 &= -3670017;
                            textStyle4 = textStyleB;
                            i39 = i27;
                            jQ = gu.d.q(1, gu.e.SECONDS);
                        } else {
                            textStyle4 = textStyleB;
                            i39 = i27;
                            jQ = j18;
                        }
                    } else {
                        rVarH.O();
                        if ((i19 & 2) != 0) {
                            i25 &= -113;
                        }
                        if ((i19 & 4) != 0) {
                            i25 &= -897;
                        }
                        if ((i19 & 8) != 0) {
                            i25 &= -7169;
                        }
                        if ((i19 & 64) != 0) {
                            i25 &= -3670017;
                        }
                        jB = j17;
                        textStyle4 = textStyle2;
                        iA = i26;
                        i39 = i27;
                        jQ = j18;
                        i38 = i17;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1596359890, i25, -1, "pl.gov.coi.common.ui.ds.chatbubble.TextWithAnimatedDots (TextWithAnimatedDots.kt:40)");
                    }
                    int i55 = i39;
                    rVar2 = rVarH;
                    long j26 = jB;
                    j70.h.g(null, null, label.o(e(f152640a, c(x0.d(x0.g("dotsTransition", rVarH, 6, 0), Integer.valueOf(i39), Integer.valueOf(i38 + 1), s3.Q(fr.s.f66413a), u0.m.e(u0.m.l((int) gu.b.A(jQ), 0, i0.e(), 2, null), i1.Restart, 0L, 4, null), "visibleDots", rVar2, s0.f193856f | 196608 | ((i25 >> 9) & 112) | (q0.f193832d << 12), 0)))), null, null, j26, 0L, u4.y.c(iA), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, null, null, false, false, null, rVar2, (i25 << 12) & 29818880, (i25 << 21) & 1879048192, 0, 33029979);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    i35 = iA;
                    i37 = i38;
                    j19 = j26;
                    textStyle3 = textStyle4;
                    j25 = jQ;
                    i36 = i55;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    j19 = j17;
                    textStyle3 = textStyle2;
                    i35 = i26;
                    i36 = i27;
                    j25 = j18;
                    i37 = i17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: p30.c0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return d0.d(label, j19, textStyle3, i35, i36, i37, j25, i18, i19, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 196608;
            if ((1572864 & i18) == 0) {
                j18 = j16;
                if ((i19 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i25 |= i45;
            } else {
                j18 = j16;
            }
            if ((599187 & i25) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i25 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if ((i19 & 2) != 0) {
                        jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().b();
                        i25 &= -113;
                    } else {
                        jB = j17;
                    }
                    if ((i19 & 4) != 0) {
                        textStyleB = k70.a.f108864a.f(rVarH, k70.a.f108865b).b();
                        i25 &= -897;
                    } else {
                        textStyleB = textStyle2;
                    }
                    if ((i19 & 8) != 0) {
                        iA = u4.y.INSTANCE.a();
                        i25 &= -7169;
                    } else {
                        iA = i26;
                    }
                    if (i49 != 0) {
                        i27 = 0;
                    }
                    if (i28 != 0) {
                        i38 = 3;
                    } else {
                        i38 = i17;
                    }
                    if ((i19 & 64) != 0) {
                        gu.b.Companion companion2 = gu.b.INSTANCE;
                        i25 &= -3670017;
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = gu.d.q(1, gu.e.SECONDS);
                    } else {
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = j18;
                    }
                } else {
                    if ((i19 & 2) != 0) {
                        jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().b();
                        i25 &= -113;
                    } else {
                        jB = j17;
                    }
                    if ((i19 & 4) != 0) {
                        textStyleB = k70.a.f108864a.f(rVarH, k70.a.f108865b).b();
                        i25 &= -897;
                    } else {
                        textStyleB = textStyle2;
                    }
                    if ((i19 & 8) != 0) {
                        iA = u4.y.INSTANCE.a();
                        i25 &= -7169;
                    } else {
                        iA = i26;
                    }
                    if (i49 != 0) {
                        i27 = 0;
                    }
                    if (i28 != 0) {
                        i38 = 3;
                    } else {
                        i38 = i17;
                    }
                    if ((i19 & 64) != 0) {
                        gu.b.Companion companion3 = gu.b.INSTANCE;
                        i25 &= -3670017;
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = gu.d.q(1, gu.e.SECONDS);
                    } else {
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = j18;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1596359890, i25, -1, "pl.gov.coi.common.ui.ds.chatbubble.TextWithAnimatedDots (TextWithAnimatedDots.kt:40)");
                }
                int i56 = i39;
                rVar2 = rVarH;
                long j27 = jB;
                j70.h.g(null, null, label.o(e(f152640a, c(x0.d(x0.g("dotsTransition", rVarH, 6, 0), Integer.valueOf(i39), Integer.valueOf(i38 + 1), s3.Q(fr.s.f66413a), u0.m.e(u0.m.l((int) gu.b.A(jQ), 0, i0.e(), 2, null), i1.Restart, 0L, 4, null), "visibleDots", rVar2, s0.f193856f | 196608 | ((i25 >> 9) & 112) | (q0.f193832d << 12), 0)))), null, null, j27, 0L, u4.y.c(iA), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, null, null, false, false, null, rVar2, (i25 << 12) & 29818880, (i25 << 21) & 1879048192, 0, 33029979);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                i35 = iA;
                i37 = i38;
                j19 = j27;
                textStyle3 = textStyle4;
                j25 = jQ;
                i36 = i56;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                j19 = j17;
                textStyle3 = textStyle2;
                i35 = i26;
                i36 = i27;
                j25 = j18;
                i37 = i17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: p30.c0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.d(label, j19, textStyle3, i35, i36, i37, j25, i18, i19, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 24576;
        i27 = i16;
        i28 = i19 & 32;
        if (i28 != 0) {
            if ((i18 & 196608) == 0) {
                if (rVarH.c(i17)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i29 = PKIFailureInfo.notAuthorized;
                }
                i25 |= i29;
            }
            if ((1572864 & i18) == 0) {
                j18 = j16;
                if ((i19 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i25 |= i45;
            } else {
                j18 = j16;
            }
            if ((599187 & i25) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i25 & 1)) {
                rVarH.I();
                if ((i18 & 1) != 0) {
                    if ((i19 & 2) != 0) {
                        jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().b();
                        i25 &= -113;
                    } else {
                        jB = j17;
                    }
                    if ((i19 & 4) != 0) {
                        textStyleB = k70.a.f108864a.f(rVarH, k70.a.f108865b).b();
                        i25 &= -897;
                    } else {
                        textStyleB = textStyle2;
                    }
                    if ((i19 & 8) != 0) {
                        iA = u4.y.INSTANCE.a();
                        i25 &= -7169;
                    } else {
                        iA = i26;
                    }
                    if (i49 != 0) {
                        i27 = 0;
                    }
                    if (i28 != 0) {
                        i38 = 3;
                    } else {
                        i38 = i17;
                    }
                    if ((i19 & 64) != 0) {
                        gu.b.Companion companion4 = gu.b.INSTANCE;
                        i25 &= -3670017;
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = gu.d.q(1, gu.e.SECONDS);
                    } else {
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = j18;
                    }
                } else {
                    if ((i19 & 2) != 0) {
                        jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().b();
                        i25 &= -113;
                    } else {
                        jB = j17;
                    }
                    if ((i19 & 4) != 0) {
                        textStyleB = k70.a.f108864a.f(rVarH, k70.a.f108865b).b();
                        i25 &= -897;
                    } else {
                        textStyleB = textStyle2;
                    }
                    if ((i19 & 8) != 0) {
                        iA = u4.y.INSTANCE.a();
                        i25 &= -7169;
                    } else {
                        iA = i26;
                    }
                    if (i49 != 0) {
                        i27 = 0;
                    }
                    if (i28 != 0) {
                        i38 = 3;
                    } else {
                        i38 = i17;
                    }
                    if ((i19 & 64) != 0) {
                        gu.b.Companion companion5 = gu.b.INSTANCE;
                        i25 &= -3670017;
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = gu.d.q(1, gu.e.SECONDS);
                    } else {
                        textStyle4 = textStyleB;
                        i39 = i27;
                        jQ = j18;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-1596359890, i25, -1, "pl.gov.coi.common.ui.ds.chatbubble.TextWithAnimatedDots (TextWithAnimatedDots.kt:40)");
                }
                int i57 = i39;
                rVar2 = rVarH;
                long j28 = jB;
                j70.h.g(null, null, label.o(e(f152640a, c(x0.d(x0.g("dotsTransition", rVarH, 6, 0), Integer.valueOf(i39), Integer.valueOf(i38 + 1), s3.Q(fr.s.f66413a), u0.m.e(u0.m.l((int) gu.b.A(jQ), 0, i0.e(), 2, null), i1.Restart, 0L, 4, null), "visibleDots", rVar2, s0.f193856f | 196608 | ((i25 >> 9) & 112) | (q0.f193832d << 12), 0)))), null, null, j28, 0L, u4.y.c(iA), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, null, null, false, false, null, rVar2, (i25 << 12) & 29818880, (i25 << 21) & 1879048192, 0, 33029979);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                i35 = iA;
                i37 = i38;
                j19 = j28;
                textStyle3 = textStyle4;
                j25 = jQ;
                i36 = i57;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                j19 = j17;
                textStyle3 = textStyle2;
                i35 = i26;
                i36 = i27;
                j25 = j18;
                i37 = i17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: p30.c0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.d(label, j19, textStyle3, i35, i36, i37, j25, i18, i19, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 196608;
        if ((1572864 & i18) == 0) {
            j18 = j16;
            if ((i19 & 64) == 0) {
                i45 = PKIFailureInfo.signerNotTrusted;
            } else {
                i45 = PKIFailureInfo.signerNotTrusted;
            }
            i25 |= i45;
        } else {
            j18 = j16;
        }
        if ((599187 & i25) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i25 & 1)) {
            rVarH.I();
            if ((i18 & 1) != 0) {
                if ((i19 & 2) != 0) {
                    jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().b();
                    i25 &= -113;
                } else {
                    jB = j17;
                }
                if ((i19 & 4) != 0) {
                    textStyleB = k70.a.f108864a.f(rVarH, k70.a.f108865b).b();
                    i25 &= -897;
                } else {
                    textStyleB = textStyle2;
                }
                if ((i19 & 8) != 0) {
                    iA = u4.y.INSTANCE.a();
                    i25 &= -7169;
                } else {
                    iA = i26;
                }
                if (i49 != 0) {
                    i27 = 0;
                }
                if (i28 != 0) {
                    i38 = 3;
                } else {
                    i38 = i17;
                }
                if ((i19 & 64) != 0) {
                    gu.b.Companion companion6 = gu.b.INSTANCE;
                    i25 &= -3670017;
                    textStyle4 = textStyleB;
                    i39 = i27;
                    jQ = gu.d.q(1, gu.e.SECONDS);
                } else {
                    textStyle4 = textStyleB;
                    i39 = i27;
                    jQ = j18;
                }
            } else {
                if ((i19 & 2) != 0) {
                    jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().b();
                    i25 &= -113;
                } else {
                    jB = j17;
                }
                if ((i19 & 4) != 0) {
                    textStyleB = k70.a.f108864a.f(rVarH, k70.a.f108865b).b();
                    i25 &= -897;
                } else {
                    textStyleB = textStyle2;
                }
                if ((i19 & 8) != 0) {
                    iA = u4.y.INSTANCE.a();
                    i25 &= -7169;
                } else {
                    iA = i26;
                }
                if (i49 != 0) {
                    i27 = 0;
                }
                if (i28 != 0) {
                    i38 = 3;
                } else {
                    i38 = i17;
                }
                if ((i19 & 64) != 0) {
                    gu.b.Companion companion7 = gu.b.INSTANCE;
                    i25 &= -3670017;
                    textStyle4 = textStyleB;
                    i39 = i27;
                    jQ = gu.d.q(1, gu.e.SECONDS);
                } else {
                    textStyle4 = textStyleB;
                    i39 = i27;
                    jQ = j18;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-1596359890, i25, -1, "pl.gov.coi.common.ui.ds.chatbubble.TextWithAnimatedDots (TextWithAnimatedDots.kt:40)");
            }
            int i58 = i39;
            rVar2 = rVarH;
            long j29 = jB;
            j70.h.g(null, null, label.o(e(f152640a, c(x0.d(x0.g("dotsTransition", rVarH, 6, 0), Integer.valueOf(i39), Integer.valueOf(i38 + 1), s3.Q(fr.s.f66413a), u0.m.e(u0.m.l((int) gu.b.A(jQ), 0, i0.e(), 2, null), i1.Restart, 0L, 4, null), "visibleDots", rVar2, s0.f193856f | 196608 | ((i25 >> 9) & 112) | (q0.f193832d << 12), 0)))), null, null, j29, 0L, u4.y.c(iA), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, null, null, false, false, null, rVar2, (i25 << 12) & 29818880, (i25 << 21) & 1879048192, 0, 33029979);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            i35 = iA;
            i37 = i38;
            j19 = j29;
            textStyle3 = textStyle4;
            j25 = jQ;
            i36 = i58;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            j19 = j17;
            textStyle3 = textStyle2;
            i35 = i26;
            i36 = i27;
            j25 = j18;
            i37 = i17;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p30.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.d(label, j19, textStyle3, i35, i36, i37, j25, i18, i19, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int c(f6<Integer> f6Var) {
        return f6Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(Label label, long j15, TextStyle textStyle, int i15, int i16, int i17, long j16, int i18, int i19, p076m2.r rVar, int i25) {
        b(label, j15, textStyle, i15, i16, i17, j16, rVar, g4.a(i18 | 1), i19);
        return oq.i0.f148189a;
    }

    private static final Label e(Label label, int i15) {
        return new Label(fu.r.L(label.getText(), i15), label.getTag());
    }
}
