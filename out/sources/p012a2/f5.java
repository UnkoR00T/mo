package p012a2;

import a4.k0;
import a4.w0;
import androidx.compose.foundation.b;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b1.l;
import c5.h;
import d1.x;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import k3.f;
import k3.u;
import n3.t2;
import n3.y2;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import tq.e;
import w0.BorderStroke;
import w0.i;
import w0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u007f\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lf3/m;", "modifier", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "contentColor", "Lw0/w;", "border", "Lc5/h;", "elevation", "Lkotlin/Function0;", "Loq/i0;", "content", "f", "(Lf3/m;Ln3/y2;JJLw0/w;FLer/p;Lm2/r;II)V", "onClick", "", "enabled", "Lb1/l;", "interactionSource", "g", "(Ler/a;Lf3/m;ZLn3/y2;JJLw0/w;FLb1/l;Ler/p;Lm2/r;II)V", "backgroundColor", "m", "(Lf3/m;Ln3/y2;JLw0/w;F)Lf3/m;", "La2/y1;", "elevationOverlay", "absoluteElevation", "n", "(JLa2/y1;FLm2/r;I)J", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f5 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1544a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, e<? super i0> eVar) {
            return i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0116  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010d  */
    public static final void f(m mVar, y2 y2Var, long j15, long j16, BorderStroke borderStroke, float f15, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        y2 y2VarA;
        long jL;
        long jD;
        int i18;
        BorderStroke borderStroke2;
        int i19;
        int i25;
        float f16;
        int i26;
        boolean z15;
        final m mVar2;
        final y2 y2Var2;
        final long j17;
        final BorderStroke borderStroke3;
        final float f17;
        final long j18;
        d5 d5VarM;
        m mVar3;
        final float fN;
        final y2 y2Var3;
        final long j19;
        final BorderStroke borderStroke4;
        int i27;
        int i28;
        r rVarH = rVar.h(174096871);
        int i29 = i16 & 1;
        if (i29 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i35 = i16 & 2;
        if (i35 == 0) {
            if ((i15 & 48) == 0) {
                y2VarA = y2Var;
                i17 |= rVarH.W(y2VarA) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) == 0) {
                    jL = j15;
                    int i36 = rVarH.d(jL) ? 256 : 128;
                    i17 |= i36;
                } else {
                    jL = j15;
                }
                i17 |= i36;
            } else {
                jL = j15;
            }
            if ((i15 & 3072) == 0) {
                jD = j16;
                if ((i16 & 8) == 0 || !rVarH.d(jD)) {
                    i28 = 1024;
                } else {
                    i28 = 2048;
                }
                i17 |= i28;
            } else {
                jD = j16;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    borderStroke2 = borderStroke;
                    if (rVarH.W(borderStroke2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    if ((196608 & i15) == 0) {
                        f16 = f15;
                        if (rVarH.b(f16)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.G(pVar)) {
                            i27 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i27 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i27;
                    }
                    if ((i17 & 599187) != 599186) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i29 != 0) {
                                mVar3 = m.INSTANCE;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i35 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 4) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i17 &= -897;
                            }
                            if ((i16 & 8) != 0) {
                                jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                                i17 &= -7169;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            }
                            if (i25 != 0) {
                                mVar2 = mVar3;
                                fN = h.n(0);
                                y2Var3 = y2VarA;
                                j19 = jL;
                                borderStroke4 = borderStroke2;
                            } else {
                                mVar2 = mVar3;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                            }
                            final float fN2 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                            d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN2))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.h(mVar2, y2Var3, j19, fN2, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (t.k()) {
                                t.n();
                            }
                            y2Var2 = y2Var3;
                            j17 = j19;
                            borderStroke3 = borderStroke4;
                            f17 = fN;
                        } else {
                            rVarH.O();
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                            }
                            if ((i16 & 8) != 0) {
                                i17 &= -7169;
                            }
                            mVar2 = mVar;
                        }
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                        fN = f16;
                        rVarH.y();
                        if (t.k()) {
                            t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                        }
                        final float fN3 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN3))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.h(mVar2, y2Var3, j19, fN3, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        y2Var2 = y2Var3;
                        j17 = j19;
                        borderStroke3 = borderStroke4;
                        f17 = fN;
                    } else {
                        rVarH.O();
                        mVar2 = mVar;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        borderStroke3 = borderStroke2;
                        f17 = f16;
                    }
                    j18 = jD;
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        final m mVar4 = mVar2;
                        d5VarM.a(new p() { // from class: a2.b5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.j(mVar4, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                f16 = f15;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i35 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 4) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                            i17 &= -7169;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        }
                        if (i25 != 0) {
                            mVar2 = mVar3;
                            fN = h.n(0);
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                        } else {
                            mVar2 = mVar3;
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                            fN = f16;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i35 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 4) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                            i17 &= -7169;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        }
                        if (i25 != 0) {
                            mVar2 = mVar3;
                            fN = h.n(0);
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                        } else {
                            mVar2 = mVar3;
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                            fN = f16;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                    }
                    final float fN4 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN4))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.h(mVar2, y2Var3, j19, fN4, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    y2Var2 = y2Var3;
                    j17 = j19;
                    borderStroke3 = borderStroke4;
                    f17 = fN;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    borderStroke3 = borderStroke2;
                    f17 = f16;
                }
                j18 = jD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar5 = mVar2;
                    d5VarM.a(new p() { // from class: a2.b5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.j(mVar5, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            borderStroke2 = borderStroke;
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i35 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 4) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                            i17 &= -7169;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        }
                        if (i25 != 0) {
                            mVar2 = mVar3;
                            fN = h.n(0);
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                        } else {
                            mVar2 = mVar3;
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                            fN = f16;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i35 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 4) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                            i17 &= -7169;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        }
                        if (i25 != 0) {
                            mVar2 = mVar3;
                            fN = h.n(0);
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                        } else {
                            mVar2 = mVar3;
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                            fN = f16;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                    }
                    final float fN5 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN5))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.h(mVar2, y2Var3, j19, fN5, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    y2Var2 = y2Var3;
                    j17 = j19;
                    borderStroke3 = borderStroke4;
                    f17 = fN;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    borderStroke3 = borderStroke2;
                    f17 = f16;
                }
                j18 = jD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar6 = mVar2;
                    d5VarM.a(new p() { // from class: a2.b5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.j(mVar6, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            f16 = f15;
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i35 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 4) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                        i17 &= -7169;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    }
                    if (i25 != 0) {
                        mVar2 = mVar3;
                        fN = h.n(0);
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                    } else {
                        mVar2 = mVar3;
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                        fN = f16;
                    }
                } else {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i35 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 4) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                        i17 &= -7169;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    }
                    if (i25 != 0) {
                        mVar2 = mVar3;
                        fN = h.n(0);
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                    } else {
                        mVar2 = mVar3;
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                        fN = f16;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                }
                final float fN6 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN6))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.h(mVar2, y2Var3, j19, fN6, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                y2Var2 = y2Var3;
                j17 = j19;
                borderStroke3 = borderStroke4;
                f17 = fN;
            } else {
                rVarH.O();
                mVar2 = mVar;
                y2Var2 = y2VarA;
                j17 = jL;
                borderStroke3 = borderStroke2;
                f17 = f16;
            }
            j18 = jD;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar7 = mVar2;
                d5VarM.a(new p() { // from class: a2.b5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.j(mVar7, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        y2VarA = y2Var;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                jL = j15;
                if (rVarH.d(jL)) {
                }
                i17 |= i36;
            } else {
                jL = j15;
            }
            i17 |= i36;
        } else {
            jL = j15;
        }
        if ((i15 & 3072) == 0) {
            jD = j16;
            if ((i16 & 8) == 0) {
                i28 = 1024;
            } else {
                i28 = 1024;
            }
            i17 |= i28;
        } else {
            jD = j16;
        }
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                borderStroke2 = borderStroke;
                if (rVarH.W(borderStroke2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    f16 = f15;
                    if (rVarH.b(f16)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((i15 & 1572864) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i27 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i27;
                }
                if ((i17 & 599187) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i35 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 4) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                            i17 &= -7169;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        }
                        if (i25 != 0) {
                            mVar2 = mVar3;
                            fN = h.n(0);
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                        } else {
                            mVar2 = mVar3;
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                            fN = f16;
                        }
                    } else {
                        if (i29 != 0) {
                            mVar3 = m.INSTANCE;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i35 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 4) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i17 &= -897;
                        }
                        if ((i16 & 8) != 0) {
                            jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                            i17 &= -7169;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        }
                        if (i25 != 0) {
                            mVar2 = mVar3;
                            fN = h.n(0);
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                        } else {
                            mVar2 = mVar3;
                            y2Var3 = y2VarA;
                            j19 = jL;
                            borderStroke4 = borderStroke2;
                            fN = f16;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                    }
                    final float fN7 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN7))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.h(mVar2, y2Var3, j19, fN7, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    y2Var2 = y2Var3;
                    j17 = j19;
                    borderStroke3 = borderStroke4;
                    f17 = fN;
                } else {
                    rVarH.O();
                    mVar2 = mVar;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    borderStroke3 = borderStroke2;
                    f17 = f16;
                }
                j18 = jD;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar8 = mVar2;
                    d5VarM.a(new p() { // from class: a2.b5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.j(mVar8, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            f16 = f15;
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i35 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 4) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                        i17 &= -7169;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    }
                    if (i25 != 0) {
                        mVar2 = mVar3;
                        fN = h.n(0);
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                    } else {
                        mVar2 = mVar3;
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                        fN = f16;
                    }
                } else {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i35 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 4) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                        i17 &= -7169;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    }
                    if (i25 != 0) {
                        mVar2 = mVar3;
                        fN = h.n(0);
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                    } else {
                        mVar2 = mVar3;
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                        fN = f16;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                }
                final float fN8 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN8))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.h(mVar2, y2Var3, j19, fN8, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                y2Var2 = y2Var3;
                j17 = j19;
                borderStroke3 = borderStroke4;
                f17 = fN;
            } else {
                rVarH.O();
                mVar2 = mVar;
                y2Var2 = y2VarA;
                j17 = jL;
                borderStroke3 = borderStroke2;
                f17 = f16;
            }
            j18 = jD;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar9 = mVar2;
                d5VarM.a(new p() { // from class: a2.b5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.j(mVar9, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        borderStroke2 = borderStroke;
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                f16 = f15;
                if (rVarH.b(f16)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            if ((i15 & 1572864) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = PKIFailureInfo.badCertTemplate;
                } else {
                    i27 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i27;
            }
            if ((i17 & 599187) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i35 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 4) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                        i17 &= -7169;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    }
                    if (i25 != 0) {
                        mVar2 = mVar3;
                        fN = h.n(0);
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                    } else {
                        mVar2 = mVar3;
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                        fN = f16;
                    }
                } else {
                    if (i29 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i35 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 4) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i17 &= -897;
                    }
                    if ((i16 & 8) != 0) {
                        jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                        i17 &= -7169;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    }
                    if (i25 != 0) {
                        mVar2 = mVar3;
                        fN = h.n(0);
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                    } else {
                        mVar2 = mVar3;
                        y2Var3 = y2VarA;
                        j19 = jL;
                        borderStroke4 = borderStroke2;
                        fN = f16;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
                }
                final float fN9 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN9))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.h(mVar2, y2Var3, j19, fN9, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                y2Var2 = y2Var3;
                j17 = j19;
                borderStroke3 = borderStroke4;
                f17 = fN;
            } else {
                rVarH.O();
                mVar2 = mVar;
                y2Var2 = y2VarA;
                j17 = jL;
                borderStroke3 = borderStroke2;
                f17 = f16;
            }
            j18 = jD;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar10 = mVar2;
                d5VarM.a(new p() { // from class: a2.b5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.j(mVar10, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        f16 = f15;
        if ((i15 & 1572864) == 0) {
            if (rVarH.G(pVar)) {
                i27 = PKIFailureInfo.badCertTemplate;
            } else {
                i27 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i27;
        }
        if ((i17 & 599187) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i29 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i35 != 0) {
                    y2VarA = t2.a();
                }
                if ((i16 & 4) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i17 &= -897;
                }
                if ((i16 & 8) != 0) {
                    jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                    i17 &= -7169;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                }
                if (i25 != 0) {
                    mVar2 = mVar3;
                    fN = h.n(0);
                    y2Var3 = y2VarA;
                    j19 = jL;
                    borderStroke4 = borderStroke2;
                } else {
                    mVar2 = mVar3;
                    y2Var3 = y2VarA;
                    j19 = jL;
                    borderStroke4 = borderStroke2;
                    fN = f16;
                }
            } else {
                if (i29 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar;
                }
                if (i35 != 0) {
                    y2VarA = t2.a();
                }
                if ((i16 & 4) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i17 &= -897;
                }
                if ((i16 & 8) != 0) {
                    jD = c1.d(jL, rVarH, (i17 >> 6) & 14);
                    i17 &= -7169;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                }
                if (i25 != 0) {
                    mVar2 = mVar3;
                    fN = h.n(0);
                    y2Var3 = y2VarA;
                    j19 = jL;
                    borderStroke4 = borderStroke2;
                } else {
                    mVar2 = mVar3;
                    y2Var3 = y2VarA;
                    j19 = jL;
                    borderStroke4 = borderStroke2;
                    fN = f16;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(174096871, i17, -1, "androidx.compose.material.Surface (Surface.kt:101)");
            }
            final float fN10 = h.n(((h) rVarH.N(b2.g())).getValue() + fN);
            d0.d(new c4[]{m1.a().d(Color.m0boximpl(jD)), b2.g().d(h.j(fN10))}, y2.m.d(-2004281689, true, new p() { // from class: a2.a5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f5.h(mVar2, y2Var3, j19, fN10, borderStroke4, fN, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
            y2Var2 = y2Var3;
            j17 = j19;
            borderStroke3 = borderStroke4;
            f17 = fN;
        } else {
            rVarH.O();
            mVar2 = mVar;
            y2Var2 = y2VarA;
            j17 = jL;
            borderStroke3 = borderStroke2;
            f17 = f16;
        }
        j18 = jD;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar11 = mVar2;
            d5VarM.a(new p() { // from class: a2.b5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f5.j(mVar11, y2Var2, j17, j18, borderStroke3, f17, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:121:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x016f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:132:0x0191  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:150:0x0228  */
    /* JADX WARN: Code duplicated, block: B:152:0x023b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0250  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    public static final void g(final er.a<i0> aVar, m mVar, boolean z15, y2 y2Var, long j15, long j16, BorderStroke borderStroke, float f15, l lVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        boolean z16;
        int i19;
        int i25;
        y2 y2VarA;
        int i26;
        long jL;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        boolean z17;
        final m mVar3;
        final boolean z18;
        final y2 y2Var2;
        final long j17;
        final long j18;
        final BorderStroke borderStroke2;
        final float f16;
        final l lVar2;
        d5 d5VarM;
        long jD;
        BorderStroke borderStroke3;
        float fN;
        final l lVar3;
        final BorderStroke borderStroke4;
        final float f17;
        final boolean z19;
        final y2 y2Var3;
        long j19;
        final long j25;
        int i39;
        int i45;
        int i46;
        r rVarH = rVar.h(2141308794);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i47 = i16 & 2;
        if (i47 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 8;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        y2VarA = y2Var;
                        if (rVarH.W(y2VarA)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 24576) == 0) {
                        if ((i16 & 16) == 0) {
                            jL = j15;
                            if (rVarH.d(jL)) {
                                i46 = 16384;
                            }
                            i17 |= i46;
                        } else {
                            jL = j15;
                        }
                        i46 = PKIFailureInfo.certRevoked;
                        i17 |= i46;
                    } else {
                        jL = j15;
                    }
                    if ((196608 & i15) == 0) {
                        int i48 = i17;
                        if ((i16 & 32) == 0 || !rVarH.d(j16)) {
                            i45 = PKIFailureInfo.notAuthorized;
                        } else {
                            i45 = PKIFailureInfo.unsupportedVersion;
                        }
                        i27 = i48 | i45;
                    } else {
                        i27 = i17;
                    }
                    i28 = i16 & 64;
                    if (i28 != 0) {
                        i27 |= 1572864;
                    } else if ((i15 & 1572864) == 0) {
                        if (rVarH.W(borderStroke)) {
                            i29 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i29 = PKIFailureInfo.signerNotTrusted;
                        }
                        i27 |= i29;
                    }
                    i35 = i16 & 128;
                    if (i35 != 0) {
                        if ((i15 & 12582912) == 0) {
                            if (rVarH.b(f15)) {
                                i36 = 8388608;
                            } else {
                                i36 = 4194304;
                            }
                            i27 |= i36;
                        }
                        i37 = i16 & 256;
                        if (i37 != 0) {
                            if ((i15 & 100663296) == 0) {
                                if (rVarH.W(lVar)) {
                                    i38 = 67108864;
                                } else {
                                    i38 = 33554432;
                                }
                                i27 |= i38;
                            }
                            if ((i15 & 805306368) == 0) {
                                if (rVarH.G(pVar)) {
                                    i39 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i39 = 268435456;
                                }
                                i27 |= i39;
                            }
                            if ((i27 & 306783379) != 306783378) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (rVarH.r(z17, i27 & 1)) {
                                rVarH.I();
                                if ((i15 & 1) != 0 || rVarH.Q()) {
                                    if (i47 != 0) {
                                        mVar2 = m.INSTANCE;
                                    }
                                    if (i18 != 0) {
                                        z16 = true;
                                    }
                                    if (i25 != 0) {
                                        y2VarA = t2.a();
                                    }
                                    if ((i16 & 16) != 0) {
                                        jL = m2.f1788a.a(rVarH, 6).l();
                                        i27 &= -57345;
                                    }
                                    if ((i16 & 32) != 0) {
                                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                        i27 &= -458753;
                                    } else {
                                        jD = j16;
                                    }
                                    if (i28 != 0) {
                                        borderStroke3 = null;
                                    } else {
                                        borderStroke3 = borderStroke;
                                    }
                                    if (i35 != 0) {
                                        fN = h.n(0);
                                    } else {
                                        fN = f15;
                                    }
                                    if (i37 != 0) {
                                        lVar3 = null;
                                    } else {
                                        lVar3 = lVar;
                                    }
                                    borderStroke4 = borderStroke3;
                                    f17 = fN;
                                    z19 = z16;
                                    y2Var3 = y2VarA;
                                    j19 = jD;
                                    j25 = jL;
                                } else {
                                    rVarH.O();
                                    if ((i16 & 16) != 0) {
                                        i27 &= -57345;
                                    }
                                    if ((i16 & 32) != 0) {
                                        i27 &= -458753;
                                    }
                                    borderStroke4 = borderStroke;
                                    f17 = f15;
                                    lVar3 = lVar;
                                    z19 = z16;
                                    y2Var3 = y2VarA;
                                    j25 = jL;
                                    j19 = j16;
                                }
                                rVarH.y();
                                if (t.k()) {
                                    t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                                }
                                final float fN2 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                                final m mVar4 = mVar2;
                                d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN2))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return f5.k(mVar4, y2Var3, j25, fN2, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54), rVarH, c4.f122821i | 48);
                                if (t.k()) {
                                    t.n();
                                }
                                j18 = j19;
                                mVar3 = mVar4;
                                y2Var2 = y2Var3;
                                j17 = j25;
                                borderStroke2 = borderStroke4;
                                f16 = f17;
                                lVar2 = lVar3;
                                z18 = z19;
                            } else {
                                rVarH.O();
                                mVar3 = mVar2;
                                z18 = z16;
                                y2Var2 = y2VarA;
                                j17 = jL;
                                j18 = j16;
                                borderStroke2 = borderStroke;
                                f16 = f15;
                                lVar2 = lVar;
                            }
                            d5VarM = rVarH.m();
                            if (d5VarM != null) {
                                d5VarM.a(new p() { // from class: a2.e5
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i27 |= 100663296;
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(pVar)) {
                                i39 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i39 = 268435456;
                            }
                            i27 |= i39;
                        }
                        if ((i27 & 306783379) != 306783378) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i27 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            } else {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                            }
                            final float fN3 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                            final m mVar5 = mVar2;
                            d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN3))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.k(mVar5, y2Var3, j25, fN3, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (t.k()) {
                                t.n();
                            }
                            j18 = j19;
                            mVar3 = mVar5;
                            y2Var2 = y2Var3;
                            j17 = j25;
                            borderStroke2 = borderStroke4;
                            f16 = f17;
                            lVar2 = lVar3;
                            z18 = z19;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            z18 = z16;
                            y2Var2 = y2VarA;
                            j17 = jL;
                            j18 = j16;
                            borderStroke2 = borderStroke;
                            f16 = f15;
                            lVar2 = lVar;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.e5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 12582912;
                    i37 = i16 & 256;
                    if (i37 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i38 = 67108864;
                            } else {
                                i38 = 33554432;
                            }
                            i27 |= i38;
                        }
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(pVar)) {
                                i39 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i39 = 268435456;
                            }
                            i27 |= i39;
                        }
                        if ((i27 & 306783379) != 306783378) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i27 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            } else {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                            }
                            final float fN4 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                            final m mVar6 = mVar2;
                            d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN4))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.k(mVar6, y2Var3, j25, fN4, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (t.k()) {
                                t.n();
                            }
                            j18 = j19;
                            mVar3 = mVar6;
                            y2Var2 = y2Var3;
                            j17 = j25;
                            borderStroke2 = borderStroke4;
                            f16 = f17;
                            lVar2 = lVar3;
                            z18 = z19;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            z18 = z16;
                            y2Var2 = y2VarA;
                            j17 = jL;
                            j18 = j16;
                            borderStroke2 = borderStroke;
                            f16 = f15;
                            lVar2 = lVar;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.e5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 100663296;
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN5 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar7 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN5))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar7, y2Var3, j25, fN5, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar7;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                y2VarA = y2Var;
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        jL = j15;
                        if (rVarH.d(jL)) {
                            i46 = 16384;
                        }
                        i17 |= i46;
                    } else {
                        jL = j15;
                    }
                    i46 = PKIFailureInfo.certRevoked;
                    i17 |= i46;
                } else {
                    jL = j15;
                }
                if ((196608 & i15) == 0) {
                    int i49 = i17;
                    if ((i16 & 32) == 0) {
                        i45 = PKIFailureInfo.notAuthorized;
                    } else {
                        i45 = PKIFailureInfo.notAuthorized;
                    }
                    i27 = i49 | i45;
                } else {
                    i27 = i17;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i27 |= i29;
                }
                i35 = i16 & 128;
                if (i35 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.b(f15)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i27 |= i36;
                    }
                    i37 = i16 & 256;
                    if (i37 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i38 = 67108864;
                            } else {
                                i38 = 33554432;
                            }
                            i27 |= i38;
                        }
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(pVar)) {
                                i39 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i39 = 268435456;
                            }
                            i27 |= i39;
                        }
                        if ((i27 & 306783379) != 306783378) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i27 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            } else {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                            }
                            final float fN6 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                            final m mVar8 = mVar2;
                            d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN6))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.k(mVar8, y2Var3, j25, fN6, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (t.k()) {
                                t.n();
                            }
                            j18 = j19;
                            mVar3 = mVar8;
                            y2Var2 = y2Var3;
                            j17 = j25;
                            borderStroke2 = borderStroke4;
                            f16 = f17;
                            lVar2 = lVar3;
                            z18 = z19;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            z18 = z16;
                            y2Var2 = y2VarA;
                            j17 = jL;
                            j18 = j16;
                            borderStroke2 = borderStroke;
                            f16 = f15;
                            lVar2 = lVar;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.e5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 100663296;
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN7 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar9 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN7))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar9, y2Var3, j25, fN7, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar9;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 12582912;
                i37 = i16 & 256;
                if (i37 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i38 = 67108864;
                        } else {
                            i38 = 33554432;
                        }
                        i27 |= i38;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN8 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar10 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN8))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar10, y2Var3, j25, fN8, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar10;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN9 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar11 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN9))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar11, y2Var3, j25, fN9, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar11;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    y2VarA = y2Var;
                    if (rVarH.W(y2VarA)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        jL = j15;
                        if (rVarH.d(jL)) {
                            i46 = 16384;
                        }
                        i17 |= i46;
                    } else {
                        jL = j15;
                    }
                    i46 = PKIFailureInfo.certRevoked;
                    i17 |= i46;
                } else {
                    jL = j15;
                }
                if ((196608 & i15) == 0) {
                    int i410 = i17;
                    if ((i16 & 32) == 0) {
                        i45 = PKIFailureInfo.notAuthorized;
                    } else {
                        i45 = PKIFailureInfo.notAuthorized;
                    }
                    i27 = i410 | i45;
                } else {
                    i27 = i17;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i27 |= i29;
                }
                i35 = i16 & 128;
                if (i35 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.b(f15)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i27 |= i36;
                    }
                    i37 = i16 & 256;
                    if (i37 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i38 = 67108864;
                            } else {
                                i38 = 33554432;
                            }
                            i27 |= i38;
                        }
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(pVar)) {
                                i39 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i39 = 268435456;
                            }
                            i27 |= i39;
                        }
                        if ((i27 & 306783379) != 306783378) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i27 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            } else {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                            }
                            final float fN10 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                            final m mVar12 = mVar2;
                            d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN10))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.k(mVar12, y2Var3, j25, fN10, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (t.k()) {
                                t.n();
                            }
                            j18 = j19;
                            mVar3 = mVar12;
                            y2Var2 = y2Var3;
                            j17 = j25;
                            borderStroke2 = borderStroke4;
                            f16 = f17;
                            lVar2 = lVar3;
                            z18 = z19;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            z18 = z16;
                            y2Var2 = y2VarA;
                            j17 = jL;
                            j18 = j16;
                            borderStroke2 = borderStroke;
                            f16 = f15;
                            lVar2 = lVar;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.e5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 100663296;
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN11 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar13 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN11))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar13, y2Var3, j25, fN11, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar13;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 12582912;
                i37 = i16 & 256;
                if (i37 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i38 = 67108864;
                        } else {
                            i38 = 33554432;
                        }
                        i27 |= i38;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN12 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar14 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN12))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar14, y2Var3, j25, fN12, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar14;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN13 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar15 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN13))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar15, y2Var3, j25, fN13, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar15;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            y2VarA = y2Var;
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jL = j15;
                    if (rVarH.d(jL)) {
                        i46 = 16384;
                    }
                    i17 |= i46;
                } else {
                    jL = j15;
                }
                i46 = PKIFailureInfo.certRevoked;
                i17 |= i46;
            } else {
                jL = j15;
            }
            if ((196608 & i15) == 0) {
                int i411 = i17;
                if ((i16 & 32) == 0) {
                    i45 = PKIFailureInfo.notAuthorized;
                } else {
                    i45 = PKIFailureInfo.notAuthorized;
                }
                i27 = i411 | i45;
            } else {
                i27 = i17;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(borderStroke)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i27 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f15)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i27 |= i36;
                }
                i37 = i16 & 256;
                if (i37 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i38 = 67108864;
                        } else {
                            i38 = 33554432;
                        }
                        i27 |= i38;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN14 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar16 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN14))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar16, y2Var3, j25, fN14, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar16;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN15 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar17 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN15))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar17, y2Var3, j25, fN15, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar17;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 12582912;
            i37 = i16 & 256;
            if (i37 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i27 |= i38;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN16 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar18 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN16))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar18, y2Var3, j25, fN16, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar18;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i27 |= i39;
            }
            if ((i27 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                } else {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                }
                final float fN17 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                final m mVar19 = mVar2;
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN17))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.k(mVar19, y2Var3, j25, fN17, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                j18 = j19;
                mVar3 = mVar19;
                y2Var2 = y2Var3;
                j17 = j25;
                borderStroke2 = borderStroke4;
                f16 = f17;
                lVar2 = lVar3;
                z18 = z19;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarA;
                j17 = jL;
                j18 = j16;
                borderStroke2 = borderStroke;
                f16 = f15;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.e5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 8;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    y2VarA = y2Var;
                    if (rVarH.W(y2VarA)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        jL = j15;
                        if (rVarH.d(jL)) {
                            i46 = 16384;
                        }
                        i17 |= i46;
                    } else {
                        jL = j15;
                    }
                    i46 = PKIFailureInfo.certRevoked;
                    i17 |= i46;
                } else {
                    jL = j15;
                }
                if ((196608 & i15) == 0) {
                    int i412 = i17;
                    if ((i16 & 32) == 0) {
                        i45 = PKIFailureInfo.notAuthorized;
                    } else {
                        i45 = PKIFailureInfo.notAuthorized;
                    }
                    i27 = i412 | i45;
                } else {
                    i27 = i17;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i27 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.W(borderStroke)) {
                        i29 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i29 = PKIFailureInfo.signerNotTrusted;
                    }
                    i27 |= i29;
                }
                i35 = i16 & 128;
                if (i35 != 0) {
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.b(f15)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i27 |= i36;
                    }
                    i37 = i16 & 256;
                    if (i37 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.W(lVar)) {
                                i38 = 67108864;
                            } else {
                                i38 = 33554432;
                            }
                            i27 |= i38;
                        }
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(pVar)) {
                                i39 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i39 = 268435456;
                            }
                            i27 |= i39;
                        }
                        if ((i27 & 306783379) != 306783378) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i27 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0) {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            } else {
                                if (i47 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    z16 = true;
                                }
                                if (i25 != 0) {
                                    y2VarA = t2.a();
                                }
                                if ((i16 & 16) != 0) {
                                    jL = m2.f1788a.a(rVarH, 6).l();
                                    i27 &= -57345;
                                }
                                if ((i16 & 32) != 0) {
                                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                    i27 &= -458753;
                                } else {
                                    jD = j16;
                                }
                                if (i28 != 0) {
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i35 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f15;
                                }
                                if (i37 != 0) {
                                    lVar3 = null;
                                } else {
                                    lVar3 = lVar;
                                }
                                borderStroke4 = borderStroke3;
                                f17 = fN;
                                z19 = z16;
                                y2Var3 = y2VarA;
                                j19 = jD;
                                j25 = jL;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                            }
                            final float fN18 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                            final m mVar110 = mVar2;
                            d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN18))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.k(mVar110, y2Var3, j25, fN18, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, c4.f122821i | 48);
                            if (t.k()) {
                                t.n();
                            }
                            j18 = j19;
                            mVar3 = mVar110;
                            y2Var2 = y2Var3;
                            j17 = j25;
                            borderStroke2 = borderStroke4;
                            f16 = f17;
                            lVar2 = lVar3;
                            z18 = z19;
                        } else {
                            rVarH.O();
                            mVar3 = mVar2;
                            z18 = z16;
                            y2Var2 = y2VarA;
                            j17 = jL;
                            j18 = j16;
                            borderStroke2 = borderStroke;
                            f16 = f15;
                            lVar2 = lVar;
                        }
                        d5VarM = rVarH.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: a2.e5
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 100663296;
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN19 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar111 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN19))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar111, y2Var3, j25, fN19, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar111;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 12582912;
                i37 = i16 & 256;
                if (i37 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i38 = 67108864;
                        } else {
                            i38 = 33554432;
                        }
                        i27 |= i38;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN110 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar112 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN110))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar112, y2Var3, j25, fN110, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar112;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN111 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar113 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN111))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar113, y2Var3, j25, fN111, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar113;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            y2VarA = y2Var;
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jL = j15;
                    if (rVarH.d(jL)) {
                        i46 = 16384;
                    }
                    i17 |= i46;
                } else {
                    jL = j15;
                }
                i46 = PKIFailureInfo.certRevoked;
                i17 |= i46;
            } else {
                jL = j15;
            }
            if ((196608 & i15) == 0) {
                int i413 = i17;
                if ((i16 & 32) == 0) {
                    i45 = PKIFailureInfo.notAuthorized;
                } else {
                    i45 = PKIFailureInfo.notAuthorized;
                }
                i27 = i413 | i45;
            } else {
                i27 = i17;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(borderStroke)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i27 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f15)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i27 |= i36;
                }
                i37 = i16 & 256;
                if (i37 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i38 = 67108864;
                        } else {
                            i38 = 33554432;
                        }
                        i27 |= i38;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN112 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar114 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN112))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar114, y2Var3, j25, fN112, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar114;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN113 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar115 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN113))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar115, y2Var3, j25, fN113, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar115;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 12582912;
            i37 = i16 & 256;
            if (i37 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i27 |= i38;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN114 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar116 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN114))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar116, y2Var3, j25, fN114, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar116;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i27 |= i39;
            }
            if ((i27 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                } else {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                }
                final float fN115 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                final m mVar117 = mVar2;
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN115))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.k(mVar117, y2Var3, j25, fN115, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                j18 = j19;
                mVar3 = mVar117;
                y2Var2 = y2Var3;
                j17 = j25;
                borderStroke2 = borderStroke4;
                f16 = f17;
                lVar2 = lVar3;
                z18 = z19;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarA;
                j17 = jL;
                j18 = j16;
                borderStroke2 = borderStroke;
                f16 = f15;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.e5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        i25 = i16 & 8;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                y2VarA = y2Var;
                if (rVarH.W(y2VarA)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    jL = j15;
                    if (rVarH.d(jL)) {
                        i46 = 16384;
                    }
                    i17 |= i46;
                } else {
                    jL = j15;
                }
                i46 = PKIFailureInfo.certRevoked;
                i17 |= i46;
            } else {
                jL = j15;
            }
            if ((196608 & i15) == 0) {
                int i414 = i17;
                if ((i16 & 32) == 0) {
                    i45 = PKIFailureInfo.notAuthorized;
                } else {
                    i45 = PKIFailureInfo.notAuthorized;
                }
                i27 = i414 | i45;
            } else {
                i27 = i17;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i27 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.W(borderStroke)) {
                    i29 = PKIFailureInfo.badCertTemplate;
                } else {
                    i29 = PKIFailureInfo.signerNotTrusted;
                }
                i27 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f15)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i27 |= i36;
                }
                i37 = i16 & 256;
                if (i37 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.W(lVar)) {
                            i38 = 67108864;
                        } else {
                            i38 = 33554432;
                        }
                        i27 |= i38;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i27 |= i39;
                    }
                    if ((i27 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i27 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        } else {
                            if (i47 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                y2VarA = t2.a();
                            }
                            if ((i16 & 16) != 0) {
                                jL = m2.f1788a.a(rVarH, 6).l();
                                i27 &= -57345;
                            }
                            if ((i16 & 32) != 0) {
                                jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                                i27 &= -458753;
                            } else {
                                jD = j16;
                            }
                            if (i28 != 0) {
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                            }
                            if (i35 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f15;
                            }
                            if (i37 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            borderStroke4 = borderStroke3;
                            f17 = fN;
                            z19 = z16;
                            y2Var3 = y2VarA;
                            j19 = jD;
                            j25 = jL;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                        }
                        final float fN116 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                        final m mVar118 = mVar2;
                        d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN116))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.k(mVar118, y2Var3, j25, fN116, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, c4.f122821i | 48);
                        if (t.k()) {
                            t.n();
                        }
                        j18 = j19;
                        mVar3 = mVar118;
                        y2Var2 = y2Var3;
                        j17 = j25;
                        borderStroke2 = borderStroke4;
                        f16 = f17;
                        lVar2 = lVar3;
                        z18 = z19;
                    } else {
                        rVarH.O();
                        mVar3 = mVar2;
                        z18 = z16;
                        y2Var2 = y2VarA;
                        j17 = jL;
                        j18 = j16;
                        borderStroke2 = borderStroke;
                        f16 = f15;
                        lVar2 = lVar;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.e5
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN117 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar119 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN117))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar119, y2Var3, j25, fN117, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar119;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 12582912;
            i37 = i16 & 256;
            if (i37 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i27 |= i38;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN118 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar1110 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN118))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar1110, y2Var3, j25, fN118, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar1110;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i27 |= i39;
            }
            if ((i27 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                } else {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                }
                final float fN119 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                final m mVar1111 = mVar2;
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN119))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.k(mVar1111, y2Var3, j25, fN119, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                j18 = j19;
                mVar3 = mVar1111;
                y2Var2 = y2Var3;
                j17 = j25;
                borderStroke2 = borderStroke4;
                f16 = f17;
                lVar2 = lVar3;
                z18 = z19;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarA;
                j17 = jL;
                j18 = j16;
                borderStroke2 = borderStroke;
                f16 = f15;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.e5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        y2VarA = y2Var;
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                jL = j15;
                if (rVarH.d(jL)) {
                    i46 = 16384;
                }
                i17 |= i46;
            } else {
                jL = j15;
            }
            i46 = PKIFailureInfo.certRevoked;
            i17 |= i46;
        } else {
            jL = j15;
        }
        if ((196608 & i15) == 0) {
            int i415 = i17;
            if ((i16 & 32) == 0) {
                i45 = PKIFailureInfo.notAuthorized;
            } else {
                i45 = PKIFailureInfo.notAuthorized;
            }
            i27 = i415 | i45;
        } else {
            i27 = i17;
        }
        i28 = i16 & 64;
        if (i28 != 0) {
            i27 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.W(borderStroke)) {
                i29 = PKIFailureInfo.badCertTemplate;
            } else {
                i29 = PKIFailureInfo.signerNotTrusted;
            }
            i27 |= i29;
        }
        i35 = i16 & 128;
        if (i35 != 0) {
            if ((i15 & 12582912) == 0) {
                if (rVarH.b(f15)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i27 |= i36;
            }
            i37 = i16 & 256;
            if (i37 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(lVar)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i27 |= i38;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i27 |= i39;
                }
                if ((i27 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i27 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    } else {
                        if (i47 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            y2VarA = t2.a();
                        }
                        if ((i16 & 16) != 0) {
                            jL = m2.f1788a.a(rVarH, 6).l();
                            i27 &= -57345;
                        }
                        if ((i16 & 32) != 0) {
                            jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                            i27 &= -458753;
                        } else {
                            jD = j16;
                        }
                        if (i28 != 0) {
                            borderStroke3 = null;
                        } else {
                            borderStroke3 = borderStroke;
                        }
                        if (i35 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f15;
                        }
                        if (i37 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        borderStroke4 = borderStroke3;
                        f17 = fN;
                        z19 = z16;
                        y2Var3 = y2VarA;
                        j19 = jD;
                        j25 = jL;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                    }
                    final float fN1110 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                    final m mVar1112 = mVar2;
                    d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN1110))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.k(mVar1112, y2Var3, j25, fN1110, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, c4.f122821i | 48);
                    if (t.k()) {
                        t.n();
                    }
                    j18 = j19;
                    mVar3 = mVar1112;
                    y2Var2 = y2Var3;
                    j17 = j25;
                    borderStroke2 = borderStroke4;
                    f16 = f17;
                    lVar2 = lVar3;
                    z18 = z19;
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                    z18 = z16;
                    y2Var2 = y2VarA;
                    j17 = jL;
                    j18 = j16;
                    borderStroke2 = borderStroke;
                    f16 = f15;
                    lVar2 = lVar;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.e5
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i27 |= i39;
            }
            if ((i27 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                } else {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                }
                final float fN1111 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                final m mVar1113 = mVar2;
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN1111))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.k(mVar1113, y2Var3, j25, fN1111, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                j18 = j19;
                mVar3 = mVar1113;
                y2Var2 = y2Var3;
                j17 = j25;
                borderStroke2 = borderStroke4;
                f16 = f17;
                lVar2 = lVar3;
                z18 = z19;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarA;
                j17 = jL;
                j18 = j16;
                borderStroke2 = borderStroke;
                f16 = f15;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.e5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i27 |= 12582912;
        i37 = i16 & 256;
        if (i37 != 0) {
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(lVar)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i27 |= i38;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i27 |= i39;
            }
            if ((i27 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i27 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                } else {
                    if (i47 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        y2VarA = t2.a();
                    }
                    if ((i16 & 16) != 0) {
                        jL = m2.f1788a.a(rVarH, 6).l();
                        i27 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                        i27 &= -458753;
                    } else {
                        jD = j16;
                    }
                    if (i28 != 0) {
                        borderStroke3 = null;
                    } else {
                        borderStroke3 = borderStroke;
                    }
                    if (i35 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f15;
                    }
                    if (i37 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    borderStroke4 = borderStroke3;
                    f17 = fN;
                    z19 = z16;
                    y2Var3 = y2VarA;
                    j19 = jD;
                    j25 = jL;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
                }
                final float fN1112 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
                final m mVar1114 = mVar2;
                d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN1112))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.k(mVar1114, y2Var3, j25, fN1112, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (t.k()) {
                    t.n();
                }
                j18 = j19;
                mVar3 = mVar1114;
                y2Var2 = y2Var3;
                j17 = j25;
                borderStroke2 = borderStroke4;
                f16 = f17;
                lVar2 = lVar3;
                z18 = z19;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                z18 = z16;
                y2Var2 = y2VarA;
                j17 = jL;
                j18 = j16;
                borderStroke2 = borderStroke;
                f16 = f15;
                lVar2 = lVar;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.e5
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i27 |= 100663296;
        if ((i15 & 805306368) == 0) {
            if (rVarH.G(pVar)) {
                i39 = PKIFailureInfo.duplicateCertReq;
            } else {
                i39 = 268435456;
            }
            i27 |= i39;
        }
        if ((i27 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i27 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i47 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i25 != 0) {
                    y2VarA = t2.a();
                }
                if ((i16 & 16) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i27 &= -57345;
                }
                if ((i16 & 32) != 0) {
                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                    i27 &= -458753;
                } else {
                    jD = j16;
                }
                if (i28 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i35 != 0) {
                    fN = h.n(0);
                } else {
                    fN = f15;
                }
                if (i37 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                borderStroke4 = borderStroke3;
                f17 = fN;
                z19 = z16;
                y2Var3 = y2VarA;
                j19 = jD;
                j25 = jL;
            } else {
                if (i47 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i25 != 0) {
                    y2VarA = t2.a();
                }
                if ((i16 & 16) != 0) {
                    jL = m2.f1788a.a(rVarH, 6).l();
                    i27 &= -57345;
                }
                if ((i16 & 32) != 0) {
                    jD = c1.d(jL, rVarH, (i27 >> 12) & 14);
                    i27 &= -458753;
                } else {
                    jD = j16;
                }
                if (i28 != 0) {
                    borderStroke3 = null;
                } else {
                    borderStroke3 = borderStroke;
                }
                if (i35 != 0) {
                    fN = h.n(0);
                } else {
                    fN = f15;
                }
                if (i37 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                borderStroke4 = borderStroke3;
                f17 = fN;
                z19 = z16;
                y2Var3 = y2VarA;
                j19 = jD;
                j25 = jL;
            }
            rVarH.y();
            if (t.k()) {
                t.o(2141308794, i27, -1, "androidx.compose.material.Surface (Surface.kt:207)");
            }
            final float fN1113 = h.n(((h) rVarH.N(b2.g())).getValue() + f17);
            final m mVar1115 = mVar2;
            d0.d(new c4[]{m1.a().d(Color.m0boximpl(j19)), b2.g().d(h.j(fN1113))}, y2.m.d(-1766606150, true, new p() { // from class: a2.d5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f5.k(mVar1115, y2Var3, j25, fN1113, borderStroke4, f17, lVar3, z19, aVar, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
            j18 = j19;
            mVar3 = mVar1115;
            y2Var2 = y2Var3;
            j17 = j25;
            borderStroke2 = borderStroke4;
            f16 = f17;
            lVar2 = lVar3;
            z18 = z19;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            z18 = z16;
            y2Var2 = y2VarA;
            j17 = jL;
            j18 = j16;
            borderStroke2 = borderStroke;
            f16 = f15;
            lVar2 = lVar;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.e5
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f5.l(aVar, mVar3, z18, y2Var2, j17, j18, borderStroke2, f16, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(m mVar, y2 y2Var, long j15, float f15, BorderStroke borderStroke, float f16, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-2004281689, i15, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:107)");
            }
            m mVarM = m(mVar, y2Var, n(j15, (y1) rVar.N(b2.h()), f15, rVar, 0), borderStroke, f16);
            Object objE = rVar.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.l() { // from class: a2.c5
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f5.i((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarC = v.c(mVarM, false, (er.l) objE);
            i0 i0Var = i0.f148189a;
            Object objE2 = rVar.E();
            if (objE2 == companion.a()) {
                objE2 = a.f1544a;
                rVar.v(objE2);
            }
            m mVarC2 = w0.c(mVarC, i0Var, (PointerInputEventHandler) objE2);
            p036e4.w0 w0VarI = d1.r.i(c.INSTANCE.o(), true);
            int iA = p076m2.m.a(rVar, 0);
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarC2);
            androidx.compose.ui.node.c.Companion aVar = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, aVar.d());
            n6.i(rVarC, e0VarT, aVar.f());
            p<androidx.compose.ui.node.c, Integer, i0> pVarC = aVar.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, aVar.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(n4.i0 i0Var) {
        f0.a0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(m mVar, y2 y2Var, long j15, long j16, BorderStroke borderStroke, float f15, p pVar, int i15, int i16, r rVar, int i17) {
        f(mVar, y2Var, j15, j16, borderStroke, f15, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(m mVar, y2 y2Var, long j15, float f15, BorderStroke borderStroke, float f16, l lVar, boolean z15, er.a aVar, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1766606150, i15, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:213)");
            }
            m mVarL = b.l(m(j2.e(mVar), y2Var, n(j15, (y1) rVar.N(b2.h()), f15, rVar, 0), borderStroke, f16), lVar, androidx.compose.material.c.h(false, 0.0f, 0L, 7, null), z15, null, null, aVar, 24, null);
            p036e4.w0 w0VarI = d1.r.i(c.INSTANCE.o(), true);
            int iA = p076m2.m.a(rVar, 0);
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion aVar2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, aVar2.d());
            n6.i(rVarC, e0VarT, aVar2.f());
            p<androidx.compose.ui.node.c, Integer, i0> pVarC = aVar2.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, aVar2.e());
            x xVar = x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.a aVar, m mVar, boolean z15, y2 y2Var, long j15, long j16, BorderStroke borderStroke, float f15, l lVar, p pVar, int i15, int i16, r rVar, int i17) {
        g(aVar, mVar, z15, y2Var, j15, j16, borderStroke, f15, lVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final m m(m mVar, y2 y2Var, long j15, BorderStroke borderStroke, float f15) {
        m mVarB = u.b(mVar, f15, y2Var, false, 0L, 0L, 24, null);
        m mVarG = m.INSTANCE;
        if (borderStroke != null) {
            mVarG = o.g(mVarG, borderStroke, y2Var);
        }
        return f.a(i.c(mVarB.u(mVarG), j15, y2Var), y2Var);
    }

    private static final long n(long j15, y1 y1Var, float f15, r rVar, int i15) {
        long jA;
        if (t.k()) {
            t.o(1561611256, i15, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:479)");
        }
        if (!Color.m11equalsimpl0(j15, m2.f1788a.a(rVar, 6).l()) || y1Var == null) {
            rVar.X(-1124546347);
            rVar.R();
            jA = j15;
        } else {
            rVar.X(-1124614454);
            jA = y1Var.a(j15, f15, rVar, (i15 & 14) | ((i15 >> 3) & 112) | ((i15 << 3) & 896));
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jA;
    }
}
