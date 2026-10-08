package p046f2;

import androidx.compose.ui.platform.g1;
import androidx.compose.ui.window.l;
import c5.h;
import c5.t;
import d1.a3;
import d1.d3;
import d1.i;
import d1.l1;
import d1.z0;
import er.p;
import er.q;
import f3.m;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;

/* JADX INFO: renamed from: f2.g, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a?\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0017\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014\"\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014\"\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0014\"\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$\"\u0014\u0010'\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$\"\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$\"\u0014\u0010*\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$\"&\u00103\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Lf3/m;", "modifier", "Landroidx/compose/ui/window/l;", "properties", "content", "m", "(Ler/a;Lf3/m;Landroidx/compose/ui/window/l;Ler/p;Lm2/r;II)V", "g", "Lc5/h;", "mainAxisSpacing", "crossAxisSpacing", "i", "(FFLer/p;Lm2/r;I)V", "Lc5/t;", "p", "(Lc5/t;)Lc5/t;", "a", "F", "r", "()F", "DialogMinWidth", "b", "q", "DialogMaxWidth", "c", "ButtonsMainAxisSpacing", "d", "ButtonsCrossAxisSpacing", "e", "DialogPaddingValue", "f", "TextPaddingValue", "Ld1/d3;", "Ld1/d3;", "DialogPadding", "h", "IconPadding", "TitlePadding", "j", "TextPadding", "Lm2/b4;", "Lf2/i0;", "k", "Lm2/b4;", "getLocalBasicAlertDialogOverride", "()Lm2/b4;", "getLocalBasicAlertDialogOverride$annotations", "()V", "LocalBasicAlertDialogOverride", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6455g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f55878a = h.n(280);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f55879b = h.n(560);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f55880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f55881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f55882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f55883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d3 f55884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d3 f55885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d3 f55886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d3 f55887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final b4<i0> f55888k;

    /* JADX INFO: renamed from: f2.g$a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55889a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f55889a = iArr;
        }
    }

    static {
        float f15 = 8;
        f55880c = h.n(f15);
        f55881d = h.n(f15);
        float fN = h.n(sg.a().getValue().booleanValue() ? 20 : 24);
        f55882e = fN;
        float fN2 = h.n(sg.a().getValue().booleanValue() ? 16 : 24);
        f55883f = fN2;
        f55884g = a3.e(fN);
        float f16 = 16;
        f55885h = a3.i(0.0f, 0.0f, 0.0f, h.n(f16), 7, null);
        f55886i = a3.i(0.0f, 0.0f, 0.0f, h.n(f16), 7, null);
        f55887j = a3.i(0.0f, 0.0f, 0.0f, fN2, 7, null);
        f55888k = d0.h(null, new er.a() { // from class: f2.b
            @Override // er.a
            public final Object a() {
                return C6455g.o();
            }
        }, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @oq.a
    public static final void g(final er.a<i0> aVar, m mVar, l lVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        er.a<i0> aVar2;
        int i17;
        m mVar2;
        int i18;
        int i19;
        boolean z15;
        final l lVar2;
        final m mVar3;
        d5 d5VarM;
        m mVar4;
        l lVar3;
        int i25;
        r rVarH = rVar.h(402506956);
        if ((i15 & 6) == 0) {
            aVar2 = aVar;
            i17 = (rVarH.G(aVar2) ? 4 : 2) | i15;
        } else {
            aVar2 = aVar;
            i17 = i15;
        }
        int i26 = i16 & 2;
        if (i26 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(lVar)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(pVar)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i26 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar3 = new l(false, false, false, 7, null);
                    } else {
                        lVar3 = lVar;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(402506956, i17, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:217)");
                    }
                    m(aVar2, mVar4, lVar3, pVar, rVarH, i17 & 8190, 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar4;
                    lVar2 = lVar3;
                } else {
                    rVarH.O();
                    lVar2 = lVar;
                    mVar3 = mVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6455g.h(aVar, mVar3, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    lVar3 = new l(false, false, false, 7, null);
                } else {
                    lVar3 = lVar;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(402506956, i17, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:217)");
                }
                m(aVar2, mVar4, lVar3, pVar, rVarH, i17 & 8190, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
                lVar2 = lVar3;
            } else {
                rVarH.O();
                lVar2 = lVar;
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6455g.h(aVar, mVar3, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.W(lVar)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    lVar3 = new l(false, false, false, 7, null);
                } else {
                    lVar3 = lVar;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(402506956, i17, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:217)");
                }
                m(aVar2, mVar4, lVar3, pVar, rVarH, i17 & 8190, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar4;
                lVar2 = lVar3;
            } else {
                rVarH.O();
                lVar2 = lVar;
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6455g.h(aVar, mVar3, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(pVar)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i17 |= i25;
        }
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i26 != 0) {
                mVar4 = m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                lVar3 = new l(false, false, false, 7, null);
            } else {
                lVar3 = lVar;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(402506956, i17, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:217)");
            }
            m(aVar2, mVar4, lVar3, pVar, rVarH, i17 & 8190, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar4;
            lVar2 = lVar3;
        } else {
            rVarH.O();
            lVar2 = lVar;
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6455g.h(aVar, mVar3, lVar2, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(er.a aVar, m mVar, l lVar, p pVar, int i15, int i16, r rVar, int i17) {
        g(aVar, mVar, lVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void i(final float f15, final float f16, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-917637668);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.b(f15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.b(f16) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-917637668, i16, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:400)");
            }
            final t tVar = (t) rVarH.N(g1.l());
            d0.c(g1.l().d(p(tVar)), y2.m.d(-1986402020, true, new p() { // from class: f2.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6455g.j(f15, f16, tVar, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6455g.l(f15, f16, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(float f15, float f16, final t tVar, final p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1986402020, i15, -1, "androidx.compose.material3.AlertDialogFlowRow.<anonymous> (AlertDialog.kt:405)");
            }
            i iVar = i.f39152a;
            z0.h(null, iVar.r(f15), iVar.r(f16), null, 0, 0, y2.m.d(879927511, true, new q() { // from class: f2.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return C6455g.k(tVar, pVar, (l1) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572864, 57);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(t tVar, p pVar, l1 l1Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(879927511, i15, -1, "androidx.compose.material3.AlertDialogFlowRow.<anonymous>.<anonymous> (AlertDialog.kt:409)");
            }
            d0.c(g1.l().d(tVar), pVar, rVar, c4.f122821i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(float f15, float f16, p pVar, int i15, r rVar, int i16) {
        i(f15, f16, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void m(final er.a<i0> aVar, m mVar, l lVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        l lVar2;
        int i19;
        boolean z15;
        m mVar3;
        final l lVar3;
        d5 d5VarM;
        int i25;
        r rVarH = rVar.h(24925658);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i26 = i16 & 2;
        if (i26 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    lVar2 = lVar;
                    if (rVarH.W(lVar2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(pVar)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i17 |= i25;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i26 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i18 != 0) {
                        lVar2 = new l(false, false, false, 7, null);
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(24925658, i17, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:144)");
                    }
                    ((i0) rVarH.N(f55888k)).a(new j0(aVar, mVar3, lVar2, pVar), rVarH, 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } else {
                    rVarH.O();
                    mVar3 = mVar2;
                }
                lVar3 = lVar2;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    final m mVar4 = mVar3;
                    d5VarM.a(new p() { // from class: f2.c
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return C6455g.n(aVar, mVar4, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            lVar2 = lVar;
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    lVar2 = new l(false, false, false, 7, null);
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(24925658, i17, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:144)");
                }
                ((i0) rVarH.N(f55888k)).a(new j0(aVar, mVar3, lVar2, pVar), rVarH, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar5 = mVar3;
                d5VarM.a(new p() { // from class: f2.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6455g.n(aVar, mVar5, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                lVar2 = lVar;
                if (rVarH.W(lVar2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i17 |= i25;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i18 != 0) {
                    lVar2 = new l(false, false, false, 7, null);
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(24925658, i17, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:144)");
                }
                ((i0) rVarH.N(f55888k)).a(new j0(aVar, mVar3, lVar2, pVar), rVarH, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            lVar3 = lVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar6 = mVar3;
                d5VarM.a(new p() { // from class: f2.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return C6455g.n(aVar, mVar6, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        lVar2 = lVar;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(pVar)) {
                i25 = 2048;
            } else {
                i25 = 1024;
            }
            i17 |= i25;
        }
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i26 != 0) {
                mVar3 = m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (i18 != 0) {
                lVar2 = new l(false, false, false, 7, null);
            }
            if (p076m2.t.k()) {
                p076m2.t.o(24925658, i17, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:144)");
            }
            ((i0) rVarH.N(f55888k)).a(new j0(aVar, mVar3, lVar2, pVar), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        lVar3 = lVar2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar7 = mVar3;
            d5VarM.a(new p() { // from class: f2.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6455g.n(aVar, mVar7, lVar3, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(er.a aVar, m mVar, l lVar, p pVar, int i15, int i16, r rVar, int i17) {
        m(aVar, mVar, lVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o() {
        return ra.f57515a;
    }

    private static final t p(t tVar) {
        int i15 = a.f55889a[tVar.ordinal()];
        if (i15 == 1) {
            return t.Rtl;
        }
        if (i15 == 2) {
            return t.Ltr;
        }
        throw new oq.p();
    }

    public static final float q() {
        return f55879b;
    }

    public static final float r() {
        return f55878a;
    }
}
