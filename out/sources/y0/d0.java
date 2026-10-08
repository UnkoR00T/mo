package y0;

import androidx.compose.ui.graphics.Color;
import d1.a2;
import d1.a3;
import d1.c2;
import d1.h0;
import d1.m3;
import d1.q3;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p079n1.k0;
import w0.u2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001aC\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aK\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0014\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aW\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001a\u0010'\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/window/t;", "popupPositionProvider", "Lkotlin/Function0;", "Loq/i0;", "onDismiss", "Lf3/m;", "modifier", "Lkotlin/Function1;", "Ly0/r;", "contextMenuBuilderBlock", "q", "(Landroidx/compose/ui/window/t;Ler/a;Lf3/m;Ler/l;Lm2/r;II)V", "Ly0/j;", "colors", "r", "(Landroidx/compose/ui/window/t;Ler/a;Lf3/m;Ly0/j;Ler/l;Lm2/r;II)V", "k", "(Lf3/m;Ly0/j;Ler/l;Lm2/r;II)V", "Ld1/h0;", "content", "i", "(Ly0/j;Lf3/m;Ler/q;Lm2/r;II)V", "", AnnotatedPrivateKey.LABEL, "", "enabled", "Landroidx/compose/ui/graphics/Color;", "leadingIcon", "onClick", "n", "(Ljava/lang/String;ZLy0/j;Lf3/m;Ler/q;Ler/a;Lm2/r;II)V", "Landroidx/compose/ui/window/u;", "a", "Landroidx/compose/ui/window/u;", "DefaultPopupProperties", "b", "Ly0/j;", "v", "()Ly0/j;", "DefaultContextMenuColors", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.compose.ui.window.u f222536a = new androidx.compose.ui.window.u(true, false, false, false, false, 30, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ContextMenuColors f222537b;

    static {
        Color.Companion companion = Color.INSTANCE;
        f222537b = new ContextMenuColors(companion.i(), companion.a(), companion.a(), Color.m9copywmQWz5c$default(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(companion.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:50:0x0145  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void i(ContextMenuColors contextMenuColors, f3.m mVar, final er.q<? super h0, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, final int i15, final int i16) {
        ContextMenuColors contextMenuColors2;
        int i17;
        f3.m mVar2;
        boolean z15;
        f3.m mVar3;
        d5 d5VarM;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i18;
        p076m2.r rVarH = rVar.h(-527864079);
        if ((i15 & 6) == 0) {
            contextMenuColors2 = contextMenuColors;
            i17 = (rVarH.W(contextMenuColors2) ? 4 : 2) | i15;
        } else {
            contextMenuColors2 = contextMenuColors;
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(qVar)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i17 |= i18;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i19 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-527864079, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.kt:153)");
                }
                s sVar = s.f222582a;
                f3.m mVarG = u2.g(a3.p(a2.b(w0.i.d(k3.u.b(mVar3, sVar.j(), l1.h.f(sVar.c()), false, 0L, 0L, 28, null), contextMenuColors2.getBackgroundColor(), null, 2, null), c2.Max), 0.0f, sVar.k(), 1, null), u2.b(0, rVarH, 0, 1), false, null, false, 14, null);
                int i25 = (i17 << 3) & 7168;
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarG);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                qVar.w(d1.i0.f39176a, rVarH, Integer.valueOf(((i25 >> 6) & 112) | 6));
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final ContextMenuColors contextMenuColors3 = contextMenuColors2;
                final f3.m mVar4 = mVar3;
                d5VarM.a(new er.p() { // from class: y0.a0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.j(contextMenuColors3, mVar4, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(qVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i17 |= i18;
        }
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i19 != 0) {
                mVar3 = f3.m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-527864079, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.kt:153)");
            }
            s sVar2 = s.f222582a;
            f3.m mVarG2 = u2.g(a3.p(a2.b(w0.i.d(k3.u.b(mVar3, sVar2.j(), l1.h.f(sVar2.c()), false, 0L, 0L, 28, null), contextMenuColors2.getBackgroundColor(), null, 2, null), c2.Max), 0.0f, sVar2.k(), 1, null), u2.b(0, rVarH, 0, 1), false, null, false, 14, null);
            int i26 = (i17 << 3) & 7168;
            w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarG2);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            qVar.w(d1.i0.f39176a, rVarH, Integer.valueOf(((i26 >> 6) & 112) | 6));
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final ContextMenuColors contextMenuColors4 = contextMenuColors2;
            final f3.m mVar5 = mVar3;
            d5VarM.a(new er.p() { // from class: y0.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.j(contextMenuColors4, mVar5, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ContextMenuColors contextMenuColors, f3.m mVar, er.q qVar, int i15, int i16, p076m2.r rVar, int i17) {
        i(contextMenuColors, mVar, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void k(f3.m mVar, ContextMenuColors contextMenuColors, final er.l<? super r, i0> lVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final f3.m mVar2;
        final ContextMenuColors contextMenuColors2;
        p076m2.r rVarH = rVar.h(-625529233);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i19 = i16 & 2;
        if (i19 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(contextMenuColors) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            f3.m mVar3 = mVar;
            if (i19 != 0) {
                contextMenuColors = f222537b;
            }
            final ContextMenuColors contextMenuColors3 = contextMenuColors;
            if (p076m2.t.k()) {
                p076m2.t.o(-625529233, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder (ContextMenuUi.kt:132)");
            }
            i(contextMenuColors3, mVar3, y2.m.d(-250345048, true, new er.q() { // from class: y0.y
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.l(lVar, contextMenuColors3, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, ((i17 >> 3) & 14) | MLKEMEngine.KyberPolyBytes | ((i17 << 3) & 112), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            contextMenuColors2 = contextMenuColors3;
            mVar2 = mVar3;
        } else {
            rVarH.O();
            mVar2 = mVar;
            contextMenuColors2 = contextMenuColors;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y0.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.m(mVar2, contextMenuColors2, lVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.l lVar, ContextMenuColors contextMenuColors, h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-250345048, i15, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder.<anonymous> (ContextMenuUi.kt:134)");
            }
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new r(c.f222525a.d());
                rVar.v(objE);
            }
            r rVar2 = (r) objE;
            rVar2.e();
            lVar.b(rVar2);
            rVar2.c(contextMenuColors, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f3.m mVar, ContextMenuColors contextMenuColors, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        k(mVar, contextMenuColors, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0227  */
    /* JADX WARN: Code duplicated, block: B:101:0x022c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0243  */
    /* JADX WARN: Code duplicated, block: B:105:0x0248  */
    /* JADX WARN: Code duplicated, block: B:108:0x027d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0283  */
    /* JADX WARN: Code duplicated, block: B:113:0x0290  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:86:0x0160  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:90:0x0196  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f3  */
    public static final void n(final String str, final boolean z15, final ContextMenuColors contextMenuColors, f3.m mVar, er.q<? super Color, ? super p076m2.r, ? super Integer, i0> qVar, final er.a<i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        String str2;
        int i17;
        f3.m mVar2;
        int i18;
        er.q<? super Color, ? super p076m2.r, ? super Integer, i0> qVar2;
        int i19;
        int i25;
        boolean z16;
        p076m2.r rVar2;
        final f3.m mVar3;
        final er.q<? super Color, ? super p076m2.r, ? super Integer, i0> qVar3;
        d5 d5VarM;
        f3.m mVar4;
        s sVar;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objE;
        androidx.compose.ui.node.c.Companion companion;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        long disabledIconColor;
        long disabledTextColor;
        int i26;
        p076m2.r rVarH = rVar.h(-2001167027);
        if ((i15 & 6) == 0) {
            str2 = str;
            i17 = (rVarH.W(str2) ? 4 : 2) | i15;
        } else {
            str2 = str;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(contextMenuColors) ? 256 : 128;
        }
        int i27 = i16 & 8;
        if (i27 == 0) {
            if ((i15 & 3072) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    qVar2 = qVar;
                    if (rVarH.G(qVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                if ((196608 & i15) == 0) {
                    if (rVarH.G(aVar)) {
                        i26 = 131072;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i25 = i17;
                if ((74899 & i25) != 74898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i25 & 1)) {
                    if (i27 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i18 != 0) {
                        qVar2 = null;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-2001167027, i25, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
                    }
                    sVar = s.f222582a;
                    f3.c.InterfaceC1317c interfaceC1317cH = sVar.h();
                    d1.i.f fVarR = d1.i.f39152a.r(sVar.f());
                    if ((i25 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((458752 & i25) == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objE = rVarH.E();
                    if (z19 || objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: y0.b0
                            @Override // er.a
                            public final Object a() {
                                return d0.o(z15, aVar);
                            }
                        };
                        rVarH.v(objE);
                    }
                    f3.m mVar5 = mVar4;
                    f3.m mVarP = a3.p(androidx.compose.foundation.layout.d.w(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.b.n(mVar5, z15, str2, null, null, (er.a) objE, 12, null), 0.0f, 1, null), sVar.b(), sVar.i(), sVar.a(), sVar.i()), sVar.f(), 0.0f, 2, null);
                    w0 w0VarB = m3.b(fVarR, interfaceC1317cH, rVarH, 54);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT = rVarH.t();
                    f3.m mVarE = f3.j.e(rVarH, mVarP);
                    companion = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC = n6.c(rVarH);
                    n6.i(rVarC, w0VarB, companion.d());
                    n6.i(rVarC, e0VarT, companion.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                    n6.g(rVarC, companion.a());
                    n6.i(rVarC, mVarE, companion.e());
                    q3 q3Var = q3.f39261a;
                    if (qVar2 == null) {
                        rVarH.X(-1597947094);
                        rVarH.R();
                    } else {
                        rVarH.X(-1597947093);
                        f3.m mVarR = androidx.compose.foundation.layout.d.r(f3.m.INSTANCE, sVar.g(), 0.0f, sVar.g(), sVar.g(), 2, null);
                        w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                        int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                        p076m2.e0 e0VarT2 = rVarH.t();
                        f3.m mVarE2 = f3.j.e(rVarH, mVarR);
                        aVarB2 = companion.b();
                        if (rVarH.l() == null) {
                            p076m2.m.d();
                        }
                        rVarH.K();
                        if (rVarH.getInserting()) {
                            rVarH.H(aVarB2);
                        } else {
                            rVarH.u();
                        }
                        p076m2.r rVarC2 = n6.c(rVarH);
                        n6.i(rVarC2, w0VarI, companion.d());
                        n6.i(rVarC2, e0VarT2, companion.f());
                        n6.i(rVarC2, Integer.valueOf(iHashCode2), companion.c());
                        n6.g(rVarC2, companion.a());
                        n6.i(rVarC2, mVarE2, companion.e());
                        d1.x xVar = d1.x.f39368a;
                        if (z15) {
                            disabledIconColor = contextMenuColors.getIconColor();
                        } else {
                            disabledIconColor = contextMenuColors.getDisabledIconColor();
                        }
                        qVar2.w(Color.m0boximpl(disabledIconColor), rVarH, 0);
                        rVarH.x();
                        rVarH.R();
                    }
                    if (z15) {
                        disabledTextColor = contextMenuColors.getTextColor();
                    } else {
                        disabledTextColor = contextMenuColors.getDisabledTextColor();
                    }
                    er.q<? super Color, ? super p076m2.r, ? super Integer, i0> qVar4 = qVar2;
                    rVar2 = rVarH;
                    k0.q(str, q3Var.a(f3.m.INSTANCE, 1.0f, true), sVar.l(disabledTextColor), null, 0, false, 1, 0, null, null, rVar2, (i25 & 14) | 1572864, 952);
                    rVar2.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    mVar3 = mVar5;
                    qVar3 = qVar4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    qVar3 = qVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: y0.c0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return d0.p(str, z15, contextMenuColors, mVar3, qVar3, aVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            qVar2 = qVar;
            if ((196608 & i15) == 0) {
                if (rVarH.G(aVar)) {
                    i26 = 131072;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i25 = i17;
            if ((74899 & i25) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i25 & 1)) {
                if (i27 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    qVar2 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-2001167027, i25, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
                }
                sVar = s.f222582a;
                f3.c.InterfaceC1317c interfaceC1317cH2 = sVar.h();
                d1.i.f fVarR2 = d1.i.f39152a.r(sVar.f());
                if ((i25 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((458752 & i25) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objE = rVarH.E();
                if (z19) {
                    objE = new er.a() { // from class: y0.b0
                        @Override // er.a
                        public final Object a() {
                            return d0.o(z15, aVar);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: y0.b0
                        @Override // er.a
                        public final Object a() {
                            return d0.o(z15, aVar);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVar6 = mVar4;
                f3.m mVarP2 = a3.p(androidx.compose.foundation.layout.d.w(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.b.n(mVar6, z15, str2, null, null, (er.a) objE, 12, null), 0.0f, 1, null), sVar.b(), sVar.i(), sVar.a(), sVar.i()), sVar.f(), 0.0f, 2, null);
                w0 w0VarB2 = m3.b(fVarR2, interfaceC1317cH2, rVarH, 54);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, mVarP2);
                companion = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarB2, companion.d());
                n6.i(rVarC3, e0VarT3, companion.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion.c());
                n6.g(rVarC3, companion.a());
                n6.i(rVarC3, mVarE3, companion.e());
                q3 q3Var2 = q3.f39261a;
                if (qVar2 == null) {
                    rVarH.X(-1597947094);
                    rVarH.R();
                } else {
                    rVarH.X(-1597947093);
                    f3.m mVarR2 = androidx.compose.foundation.layout.d.r(f3.m.INSTANCE, sVar.g(), 0.0f, sVar.g(), sVar.g(), 2, null);
                    w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT4 = rVarH.t();
                    f3.m mVarE4 = f3.j.e(rVarH, mVarR2);
                    aVarB2 = companion.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC4 = n6.c(rVarH);
                    n6.i(rVarC4, w0VarI2, companion.d());
                    n6.i(rVarC4, e0VarT4, companion.f());
                    n6.i(rVarC4, Integer.valueOf(iHashCode4), companion.c());
                    n6.g(rVarC4, companion.a());
                    n6.i(rVarC4, mVarE4, companion.e());
                    d1.x xVar2 = d1.x.f39368a;
                    if (z15) {
                        disabledIconColor = contextMenuColors.getIconColor();
                    } else {
                        disabledIconColor = contextMenuColors.getDisabledIconColor();
                    }
                    qVar2.w(Color.m0boximpl(disabledIconColor), rVarH, 0);
                    rVarH.x();
                    rVarH.R();
                }
                if (z15) {
                    disabledTextColor = contextMenuColors.getTextColor();
                } else {
                    disabledTextColor = contextMenuColors.getDisabledTextColor();
                }
                er.q<? super Color, ? super p076m2.r, ? super Integer, i0> qVar5 = qVar2;
                rVar2 = rVarH;
                k0.q(str, q3Var2.a(f3.m.INSTANCE, 1.0f, true), sVar.l(disabledTextColor), null, 0, false, 1, 0, null, null, rVar2, (i25 & 14) | 1572864, 952);
                rVar2.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar6;
                qVar3 = qVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                qVar3 = qVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: y0.c0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.p(str, z15, contextMenuColors, mVar3, qVar3, aVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        mVar2 = mVar;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                qVar2 = qVar;
                if (rVarH.G(qVar2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            if ((196608 & i15) == 0) {
                if (rVarH.G(aVar)) {
                    i26 = 131072;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i25 = i17;
            if ((74899 & i25) != 74898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i25 & 1)) {
                if (i27 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i18 != 0) {
                    qVar2 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-2001167027, i25, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
                }
                sVar = s.f222582a;
                f3.c.InterfaceC1317c interfaceC1317cH3 = sVar.h();
                d1.i.f fVarR3 = d1.i.f39152a.r(sVar.f());
                if ((i25 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((458752 & i25) == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objE = rVarH.E();
                if (z19) {
                    objE = new er.a() { // from class: y0.b0
                        @Override // er.a
                        public final Object a() {
                            return d0.o(z15, aVar);
                        }
                    };
                    rVarH.v(objE);
                } else {
                    objE = new er.a() { // from class: y0.b0
                        @Override // er.a
                        public final Object a() {
                            return d0.o(z15, aVar);
                        }
                    };
                    rVarH.v(objE);
                }
                f3.m mVar7 = mVar4;
                f3.m mVarP3 = a3.p(androidx.compose.foundation.layout.d.w(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.b.n(mVar7, z15, str2, null, null, (er.a) objE, 12, null), 0.0f, 1, null), sVar.b(), sVar.i(), sVar.a(), sVar.i()), sVar.f(), 0.0f, 2, null);
                w0 w0VarB3 = m3.b(fVarR3, interfaceC1317cH3, rVarH, 54);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT5 = rVarH.t();
                f3.m mVarE5 = f3.j.e(rVarH, mVarP3);
                companion = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC5 = n6.c(rVarH);
                n6.i(rVarC5, w0VarB3, companion.d());
                n6.i(rVarC5, e0VarT5, companion.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion.c());
                n6.g(rVarC5, companion.a());
                n6.i(rVarC5, mVarE5, companion.e());
                q3 q3Var3 = q3.f39261a;
                if (qVar2 == null) {
                    rVarH.X(-1597947094);
                    rVarH.R();
                } else {
                    rVarH.X(-1597947093);
                    f3.m mVarR3 = androidx.compose.foundation.layout.d.r(f3.m.INSTANCE, sVar.g(), 0.0f, sVar.g(), sVar.g(), 2, null);
                    w0 w0VarI3 = d1.r.i(f3.c.INSTANCE.o(), false);
                    int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT6 = rVarH.t();
                    f3.m mVarE6 = f3.j.e(rVarH, mVarR3);
                    aVarB2 = companion.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC6 = n6.c(rVarH);
                    n6.i(rVarC6, w0VarI3, companion.d());
                    n6.i(rVarC6, e0VarT6, companion.f());
                    n6.i(rVarC6, Integer.valueOf(iHashCode6), companion.c());
                    n6.g(rVarC6, companion.a());
                    n6.i(rVarC6, mVarE6, companion.e());
                    d1.x xVar3 = d1.x.f39368a;
                    if (z15) {
                        disabledIconColor = contextMenuColors.getIconColor();
                    } else {
                        disabledIconColor = contextMenuColors.getDisabledIconColor();
                    }
                    qVar2.w(Color.m0boximpl(disabledIconColor), rVarH, 0);
                    rVarH.x();
                    rVarH.R();
                }
                if (z15) {
                    disabledTextColor = contextMenuColors.getTextColor();
                } else {
                    disabledTextColor = contextMenuColors.getDisabledTextColor();
                }
                er.q<? super Color, ? super p076m2.r, ? super Integer, i0> qVar6 = qVar2;
                rVar2 = rVarH;
                k0.q(str, q3Var3.a(f3.m.INSTANCE, 1.0f, true), sVar.l(disabledTextColor), null, 0, false, 1, 0, null, null, rVar2, (i25 & 14) | 1572864, 952);
                rVar2.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar3 = mVar7;
                qVar3 = qVar6;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                qVar3 = qVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: y0.c0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.p(str, z15, contextMenuColors, mVar3, qVar3, aVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        qVar2 = qVar;
        if ((196608 & i15) == 0) {
            if (rVarH.G(aVar)) {
                i26 = 131072;
            } else {
                i26 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i26;
        }
        i25 = i17;
        if ((74899 & i25) != 74898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i25 & 1)) {
            if (i27 != 0) {
                mVar4 = f3.m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (i18 != 0) {
                qVar2 = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-2001167027, i25, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
            }
            sVar = s.f222582a;
            f3.c.InterfaceC1317c interfaceC1317cH4 = sVar.h();
            d1.i.f fVarR4 = d1.i.f39152a.r(sVar.f());
            if ((i25 & 112) == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((458752 & i25) == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z17 | z18;
            objE = rVarH.E();
            if (z19) {
                objE = new er.a() { // from class: y0.b0
                    @Override // er.a
                    public final Object a() {
                        return d0.o(z15, aVar);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: y0.b0
                    @Override // er.a
                    public final Object a() {
                        return d0.o(z15, aVar);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVar8 = mVar4;
            f3.m mVarP4 = a3.p(androidx.compose.foundation.layout.d.w(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.b.n(mVar8, z15, str2, null, null, (er.a) objE, 12, null), 0.0f, 1, null), sVar.b(), sVar.i(), sVar.a(), sVar.i()), sVar.f(), 0.0f, 2, null);
            w0 w0VarB4 = m3.b(fVarR4, interfaceC1317cH4, rVarH, 54);
            int iHashCode7 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT7 = rVarH.t();
            f3.m mVarE7 = f3.j.e(rVarH, mVarP4);
            companion = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC7 = n6.c(rVarH);
            n6.i(rVarC7, w0VarB4, companion.d());
            n6.i(rVarC7, e0VarT7, companion.f());
            n6.i(rVarC7, Integer.valueOf(iHashCode7), companion.c());
            n6.g(rVarC7, companion.a());
            n6.i(rVarC7, mVarE7, companion.e());
            q3 q3Var4 = q3.f39261a;
            if (qVar2 == null) {
                rVarH.X(-1597947094);
                rVarH.R();
            } else {
                rVarH.X(-1597947093);
                f3.m mVarR4 = androidx.compose.foundation.layout.d.r(f3.m.INSTANCE, sVar.g(), 0.0f, sVar.g(), sVar.g(), 2, null);
                w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode8 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT8 = rVarH.t();
                f3.m mVarE8 = f3.j.e(rVarH, mVarR4);
                aVarB2 = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC8 = n6.c(rVarH);
                n6.i(rVarC8, w0VarI4, companion.d());
                n6.i(rVarC8, e0VarT8, companion.f());
                n6.i(rVarC8, Integer.valueOf(iHashCode8), companion.c());
                n6.g(rVarC8, companion.a());
                n6.i(rVarC8, mVarE8, companion.e());
                d1.x xVar4 = d1.x.f39368a;
                if (z15) {
                    disabledIconColor = contextMenuColors.getIconColor();
                } else {
                    disabledIconColor = contextMenuColors.getDisabledIconColor();
                }
                qVar2.w(Color.m0boximpl(disabledIconColor), rVarH, 0);
                rVarH.x();
                rVarH.R();
            }
            if (z15) {
                disabledTextColor = contextMenuColors.getTextColor();
            } else {
                disabledTextColor = contextMenuColors.getDisabledTextColor();
            }
            er.q<? super Color, ? super p076m2.r, ? super Integer, i0> qVar7 = qVar2;
            rVar2 = rVarH;
            k0.q(str, q3Var4.a(f3.m.INSTANCE, 1.0f, true), sVar.l(disabledTextColor), null, 0, false, 1, 0, null, null, rVar2, (i25 & 14) | 1572864, 952);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar8;
            qVar3 = qVar7;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            qVar3 = qVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y0.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.p(str, z15, contextMenuColors, mVar3, qVar3, aVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(boolean z15, er.a aVar) {
        if (z15) {
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(String str, boolean z15, ContextMenuColors contextMenuColors, f3.m mVar, er.q qVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        n(str, z15, contextMenuColors, mVar, qVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void q(androidx.compose.ui.window.t tVar, er.a<i0> aVar, f3.m mVar, er.l<? super r, i0> lVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.a<i0> aVar2;
        final er.l<? super r, i0> lVar2;
        final androidx.compose.ui.window.t tVar2;
        final f3.m mVar2;
        p076m2.r rVarH = rVar.h(307841774);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(tVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(mVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            f3.m mVar3 = mVar;
            if (p076m2.t.k()) {
                p076m2.t.o(307841774, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:99)");
            }
            aVar2 = aVar;
            r(tVar, aVar2, mVar3, e0.b(rVarH, 0), lVar, rVarH, (i17 & 1022) | ((i17 << 3) & 57344), 0);
            tVar2 = tVar;
            lVar2 = lVar;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar2 = mVar3;
        } else {
            aVar2 = aVar;
            lVar2 = lVar;
            tVar2 = tVar;
            rVarH.O();
            mVar2 = mVar;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final er.a<i0> aVar3 = aVar2;
            d5VarM.a(new er.p() { // from class: y0.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.s(tVar2, aVar3, mVar2, lVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void r(final androidx.compose.ui.window.t tVar, final er.a<i0> aVar, f3.m mVar, final ContextMenuColors contextMenuColors, final er.l<? super r, i0> lVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final f3.m mVar2;
        boolean z15;
        d5 d5VarM;
        final f3.m mVar3;
        int i18;
        int i19;
        p076m2.r rVarH = rVar.h(-305401220);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(tVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(aVar) ? 32 : 16;
        }
        int i25 = i16 & 4;
        if (i25 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.W(contextMenuColors)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            if ((i15 & 24576) == 0) {
                if (rVarH.G(lVar)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i17 |= i18;
            }
            if ((i17 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i25 != 0) {
                    mVar3 = f3.m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-305401220, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:117)");
                }
                androidx.compose.ui.window.b.a(tVar, aVar, f222536a, y2.m.d(-1271367778, true, new er.p() { // from class: y0.w
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.t(mVar3, contextMenuColors, lVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, (i17 & 14) | 3456 | (i17 & 112), 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                mVar2 = mVar3;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: y0.x
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.u(tVar, aVar, mVar2, contextMenuColors, lVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        if ((i15 & 3072) == 0) {
            if (rVarH.W(contextMenuColors)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i17 |= i19;
        }
        if ((i15 & 24576) == 0) {
            if (rVarH.G(lVar)) {
                i18 = 16384;
            } else {
                i18 = PKIFailureInfo.certRevoked;
            }
            i17 |= i18;
        }
        if ((i17 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i25 != 0) {
                mVar3 = f3.m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-305401220, i17, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:117)");
            }
            androidx.compose.ui.window.b.a(tVar, aVar, f222536a, y2.m.d(-1271367778, true, new er.p() { // from class: y0.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.t(mVar3, contextMenuColors, lVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, (i17 & 14) | 3456 | (i17 & 112), 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar2 = mVar3;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y0.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.u(tVar, aVar, mVar2, contextMenuColors, lVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(androidx.compose.ui.window.t tVar, er.a aVar, f3.m mVar, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        q(tVar, aVar, mVar, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(f3.m mVar, ContextMenuColors contextMenuColors, er.l lVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1271367778, i15, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.kt:123)");
            }
            k(mVar, contextMenuColors, lVar, rVar, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(androidx.compose.ui.window.t tVar, er.a aVar, f3.m mVar, ContextMenuColors contextMenuColors, er.l lVar, int i15, int i16, p076m2.r rVar, int i17) {
        r(tVar, aVar, mVar, contextMenuColors, lVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final ContextMenuColors v() {
        return f222537b;
    }
}
