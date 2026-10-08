package p046f2;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.u1;
import c3.l;
import c5.h;
import d1.a3;
import d1.c2;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.x;
import er.q;
import f3.j;
import f3.m;
import l2.g0;
import l2.k0;
import n3.a2;
import n3.e3;
import n3.y2;
import n3.z1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import u0.d1;
import u0.j0;
import u0.k2;
import u0.p;
import u0.s3;
import u0.v2;
import w0.BorderStroke;
import w0.f3;
import w0.u2;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0007\n\u0002\b\u0004\u001ay\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001au\u0010%\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0001¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+\"\u001a\u00100\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u001a\u00103\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/\"\u0014\u00105\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010-\"\u001a\u00108\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/\"\u001a\u0010;\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/\"\u0014\u0010>\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=\"\u0014\u0010@\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=\"\u0014\u0010B\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010-\"\u001a\u0010E\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u0010/\"\u001a\u0010H\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010/\"\u001a\u0010J\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\bI\u0010/\"\u001a\u0010M\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\bL\u0010/¨\u0006T²\u0006\f\u0010N\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\u000e\u0010O\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\f\u0010Q\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010Q\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010S\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lf3/m;", "modifier", "Lu0/d1;", "", "expandedState", "Lm2/a3;", "Ln3/d3;", "transformOriginState", "Lw0/f3;", "scrollState", "Ln3/y2;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Lc5/h;", "tonalElevation", "shadowElevation", "Lw0/w;", "border", "Lkotlin/Function1;", "Ld1/h0;", "Loq/i0;", "content", "k", "(Lf3/m;Lu0/d1;Lm2/a3;Lw0/f3;Ln3/y2;JFFLw0/w;Ler/q;Lm2/r;I)V", "Lkotlin/Function0;", "text", "onClick", "leadingIcon", "trailingIcon", "enabled", "Lf2/ae;", "colors", "Ld1/d3;", "contentPadding", "Lb1/l;", "interactionSource", "s", "(Ler/p;Ler/a;Lf3/m;Ler/p;Ler/p;ZLf2/ae;Ld1/d3;Lb1/l;Lm2/r;I)V", "Lc5/p;", "anchorBounds", "menuBounds", "y", "(Lc5/p;Lc5/p;)J", "a", "F", "C", "()F", "MenuVerticalMargin", "b", "B", "MenuHorizontalMargin", "c", "MenuListItemContainerHeight", "d", "A", "DropdownMenuItemHorizontalPadding", "e", "z", "DropdownMenuGroupVerticalPadding", "f", "Ld1/d3;", "DropdownMenuSelectableItemPadding", "g", "DropdownMenuSelectableItemWithSupportTexPadding", "h", "DropdownMenuIconTextPadding", "i", "getDropdownMenuVerticalPadding", "DropdownMenuVerticalPadding", "j", "getDropdownMenuItemDefaultMinWidth", "DropdownMenuItemDefaultMinWidth", "getDropdownMenuItemDefaultMaxWidth", "DropdownMenuItemDefaultMaxWidth", "l", "getDropdownMenuGroupDefaultMinHeight", "DropdownMenuGroupDefaultMinHeight", "hovered", "hasBeenHovered", "", "scale", "alpha", "animatedContainerColor", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f56719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f56720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f56721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d3 f56722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d3 f56723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f56724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f56725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f56726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f56727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f56728l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements er.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56729a;

        public a(k2 k2Var) {
            this.f56729a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
        @Override // er.a
        public final Boolean a() {
            return this.f56729a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements er.a<k2.b<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56730a;

        public b(k2 k2Var) {
            this.f56730a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final k2.b<Boolean> a() {
            return this.f56730a.u();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements er.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56731a;

        public c(k2 k2Var) {
            this.f56731a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
        @Override // er.a
        public final Boolean a() {
            return this.f56731a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements er.a<k2.b<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56732a;

        public d(k2 k2Var) {
            this.f56732a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final k2.b<Boolean> a() {
            return this.f56732a.u();
        }
    }

    static {
        float f15 = 48;
        f56717a = h.n(f15);
        float f16 = 8;
        f56718b = h.n(f16);
        f56719c = h.n(f15);
        float f17 = 12;
        f56720d = h.n(f17);
        float f18 = 2;
        f56721e = h.n(f18);
        float f19 = 4;
        f56722f = a3.g(h.n(f19), 0.0f, 2, null);
        f56723g = a3.f(h.n(f19), h.n(f18));
        f56724h = sg.a().getValue().booleanValue() ? h.n(f17) : h.n(f16);
        f56725i = h.n(f16);
        f56726j = h.n(112);
        f56727k = h.n(280);
        f56728l = h.n(32);
    }

    public static final float A() {
        return f56720d;
    }

    public static final float B() {
        return f56718b;
    }

    public static final float C() {
        return f56717a;
    }

    public static final void k(final m mVar, final d1<Boolean> d1Var, final p076m2.a3<n3.d3> a3Var, final f3 f3Var, final y2 y2Var, final long j15, final float f15, final float f16, final BorderStroke borderStroke, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15) throws Throwable {
        int i16;
        r rVar2;
        Object objP;
        Object objP2;
        boolean z15;
        Object obj;
        int i17;
        r rVarH = rVar.h(848986741);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(d1Var) : rVarH.G(d1Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(a3Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(f3Var) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(y2Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.d(j15) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i16 |= rVarH.b(f15) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i16 |= rVarH.b(f16) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i16 |= rVarH.W(borderStroke) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i16 |= rVarH.G(qVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (rVarH.r((i16 & 306783379) != 306783378, i16 & 1)) {
            if (t.k()) {
                t.o(848986741, i16, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:1209)");
            }
            k2 k2VarY = v2.y(d1Var, "DropDownMenu", rVarH, d1.f193575d | 48 | ((i16 >> 3) & 14), 0);
            final j0 j0VarB = of.b(k0.FastSpatial, rVarH, 6);
            final j0 j0VarB2 = of.b(k0.FastEffects, rVarH, 6);
            q qVar2 = new q() { // from class: f2.ge
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return le.l(j0VarB, (k2.b) obj2, (r) obj3, ((Integer) obj4).intValue());
                }
            };
            fr.m mVar2 = fr.m.f66405a;
            u0.y2<Float, p> y2VarP = s3.P(mVar2);
            if (k2VarY.B()) {
                rVarH.X(1666827533);
                rVarH.R();
                objP = k2VarY.p();
            } else {
                rVarH.X(1666573488);
                boolean zW = rVarH.W(k2VarY);
                objP = rVarH.E();
                if (zW || objP == r.INSTANCE.a()) {
                    l.Companion companion = l.INSTANCE;
                    l lVarD = companion.d();
                    er.l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
                    l lVarE = companion.e(lVarD);
                    try {
                        Object objP3 = k2VarY.p();
                        companion.l(lVarD, lVarE, lVarG);
                        rVarH.v(objP3);
                        objP = objP3;
                    } catch (Throwable th4) {
                        companion.l(lVarD, lVarE, lVarG);
                        throw th4;
                    }
                }
                rVarH.R();
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            rVarH.X(143964305);
            if (t.k()) {
                t.o(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1217)");
            }
            float f17 = zBooleanValue ? 1.0f : 0.8f;
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf = Float.valueOf(f17);
            boolean zW2 = rVarH.W(k2VarY);
            Object objE = rVarH.E();
            if (zW2 || objE == r.INSTANCE.a()) {
                objE = x5.d(new a(k2VarY));
                rVarH.v(objE);
            }
            boolean zBooleanValue2 = ((Boolean) ((f6) objE).getValue()).booleanValue();
            rVarH.X(143964305);
            if (t.k()) {
                t.o(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1217)");
            }
            float f18 = zBooleanValue2 ? 1.0f : 0.8f;
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf2 = Float.valueOf(f18);
            boolean zW3 = rVarH.W(k2VarY);
            Object objE2 = rVarH.E();
            if (zW3 || objE2 == r.INSTANCE.a()) {
                objE2 = x5.d(new b(k2VarY));
                rVarH.v(objE2);
            }
            final f6 f6VarR = v2.r(k2VarY, fValueOf, fValueOf2, (j0) qVar2.w(((f6) objE2).getValue(), rVarH, 0), y2VarP, "FloatAnimation", rVarH, 0);
            q qVar3 = new q() { // from class: f2.he
                @Override // er.q
                public final Object w(Object obj2, Object obj3, Object obj4) {
                    return le.n(j0VarB2, (k2.b) obj2, (r) obj3, ((Integer) obj4).intValue());
                }
            };
            u0.y2<Float, p> y2VarP2 = s3.P(mVar2);
            if (k2VarY.B()) {
                rVarH.X(1666827533);
                rVarH.R();
                objP2 = k2VarY.p();
            } else {
                rVarH.X(1666573488);
                boolean zW4 = rVarH.W(k2VarY);
                objP2 = rVarH.E();
                if (zW4 || objP2 == r.INSTANCE.a()) {
                    l.Companion companion2 = l.INSTANCE;
                    l lVarD2 = companion2.d();
                    er.l<Object, i0> lVarG2 = lVarD2 != null ? lVarD2.g() : null;
                    l lVarE2 = companion2.e(lVarD2);
                    try {
                        Object objP4 = k2VarY.p();
                        companion2.l(lVarD2, lVarE2, lVarG2);
                        rVarH.v(objP4);
                        objP2 = objP4;
                    } catch (Throwable th5) {
                        companion2.l(lVarD2, lVarE2, lVarG2);
                        throw th5;
                    }
                }
                rVarH.R();
            }
            boolean zBooleanValue3 = ((Boolean) objP2).booleanValue();
            rVarH.X(892761509);
            if (t.k()) {
                t.o(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1222)");
            }
            float f19 = zBooleanValue3 ? 1.0f : 0.0f;
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf3 = Float.valueOf(f19);
            boolean zW5 = rVarH.W(k2VarY);
            Object objE3 = rVarH.E();
            if (zW5 || objE3 == r.INSTANCE.a()) {
                objE3 = x5.d(new c(k2VarY));
                rVarH.v(objE3);
            }
            boolean zBooleanValue4 = ((Boolean) ((f6) objE3).getValue()).booleanValue();
            rVarH.X(892761509);
            if (t.k()) {
                z15 = false;
                t.o(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1222)");
            } else {
                z15 = false;
            }
            float f25 = zBooleanValue4 ? 1.0f : 0.0f;
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf4 = Float.valueOf(f25);
            boolean zW6 = rVarH.W(k2VarY);
            Object objE4 = rVarH.E();
            if (zW6 || objE4 == r.INSTANCE.a()) {
                objE4 = x5.d(new d(k2VarY));
                rVarH.v(objE4);
            }
            boolean z16 = z15;
            final f6 f6VarR2 = v2.r(k2VarY, fValueOf3, fValueOf4, (j0) qVar3.w(((f6) objE4).getValue(), rVarH, 0), y2VarP2, "FloatAnimation", rVarH, 0);
            final boolean zBooleanValue5 = ((Boolean) rVarH.N(u1.a())).booleanValue();
            m.Companion companion3 = m.INSTANCE;
            boolean zA = rVarH.a(zBooleanValue5) | rVarH.W(f6VarR) | (((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(d1Var))) ? true : z16) | rVarH.W(f6VarR2);
            if ((i16 & 896) == 256) {
                z16 = true;
            }
            boolean z17 = zA | z16;
            Object objE5 = rVarH.E();
            if (z17 || objE5 == r.INSTANCE.a()) {
                i17 = i16;
                obj = new er.l() { // from class: f2.ie
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return le.p(zBooleanValue5, d1Var, a3Var, f6VarR, f6VarR2, (a2) obj2);
                    }
                };
                rVarH.v(obj);
            } else {
                obj = objE5;
                i17 = i16;
            }
            int i18 = i17 >> 9;
            int i19 = i17 >> 6;
            androidx.compose.material3.l.g(z1.c(companion3, (er.l) obj), y2Var, j15, 0L, f15, f16, borderStroke, y2.m.d(-1463404422, true, new er.p() { // from class: f2.je
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return le.q(mVar, f3Var, qVar, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, (i18 & 896) | (i18 & 112) | 12582912 | (57344 & i19) | (458752 & i19) | (i19 & 3670016), 8);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f2.ke
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return le.r(mVar, d1Var, a3Var, f3Var, y2Var, j15, f15, f16, borderStroke, qVar, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 l(j0 j0Var, k2.b bVar, r rVar, int i15) {
        rVar.X(-745957716);
        if (t.k()) {
            t.o(-745957716, i15, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1216)");
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return j0Var;
    }

    private static final float m(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 n(j0 j0Var, k2.b bVar, r rVar, int i15) {
        rVar.X(2839488);
        if (t.k()) {
            t.o(2839488, i15, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1221)");
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return j0Var;
    }

    private static final float o(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(boolean z15, d1 d1Var, p076m2.a3 a3Var, f6 f6Var, f6 f6Var2, a2 a2Var) {
        float fM;
        float fM2 = 0.8f;
        float fO = 1.0f;
        if (z15) {
            fM = ((Boolean) d1Var.b()).booleanValue() ? 1.0f : 0.8f;
        } else {
            fM = m(f6Var);
        }
        a2Var.s(fM);
        if (!z15) {
            fM2 = m(f6Var);
        } else if (((Boolean) d1Var.b()).booleanValue()) {
            fM2 = 1.0f;
        }
        a2Var.D(fM2);
        if (!z15) {
            fO = o(f6Var2);
        } else if (!((Boolean) d1Var.b()).booleanValue()) {
            fO = 0.0f;
        }
        a2Var.g(fO);
        a2Var.Y0(((n3.d3) a3Var.getValue()).getPackedValue());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(m mVar, f3 f3Var, q qVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1463404422, i15, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1246)");
            }
            m mVarG = u2.g(d1.a2.b(a3.p(mVar, 0.0f, f56725i, 1, null), c2.Max), f3Var, false, null, false, 14, null);
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarG);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            qVar.w(d1.i0.f39176a, rVar, 6);
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
    public static final i0 r(m mVar, d1 d1Var, p076m2.a3 a3Var, f3 f3Var, y2 y2Var, long j15, float f15, float f16, BorderStroke borderStroke, q qVar, int i15, r rVar, int i16) throws Throwable {
        k(mVar, d1Var, a3Var, f3Var, y2Var, j15, f15, f16, borderStroke, qVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void s(final er.p<? super r, ? super Integer, i0> pVar, final er.a<i0> aVar, final m mVar, final er.p<? super r, ? super Integer, i0> pVar2, final er.p<? super r, ? super Integer, i0> pVar3, final boolean z15, final ae aeVar, final d3 d3Var, final b1.l lVar, r rVar, final int i15) {
        er.p<? super r, ? super Integer, i0> pVar4;
        int i16;
        er.a<i0> aVar2;
        er.p<? super r, ? super Integer, i0> pVar5;
        er.p<? super r, ? super Integer, i0> pVar6;
        ae aeVar2;
        b1.l lVar2;
        r rVarH = rVar.h(-1325192924);
        if ((i15 & 6) == 0) {
            pVar4 = pVar;
            i16 = (rVarH.G(pVar4) ? 4 : 2) | i15;
        } else {
            pVar4 = pVar;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar2 = aVar;
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(mVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            pVar5 = pVar2;
            i16 |= rVarH.G(pVar5) ? 2048 : 1024;
        } else {
            pVar5 = pVar2;
        }
        if ((i15 & 24576) == 0) {
            pVar6 = pVar3;
            i16 |= rVarH.G(pVar6) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            pVar6 = pVar3;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.a(z15) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            aeVar2 = aeVar;
            i16 |= rVarH.W(aeVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            aeVar2 = aeVar;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.W(d3Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            lVar2 = lVar;
            i16 |= rVarH.W(lVar2) ? 67108864 : 33554432;
        } else {
            lVar2 = lVar;
        }
        if (rVarH.r((38347923 & i16) != 38347922, i16 & 1)) {
            if (t.k()) {
                t.o(-1325192924, i16, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:1493)");
            }
            m mVarL = a3.l(androidx.compose.foundation.layout.d.x(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.b.l(mVar, lVar2, androidx.compose.material3.i.h(true, 0.0f, 0L, null, false, false, false, false, 254, null), z15, null, null, aVar2, 24, null), 0.0f, 1, null), f56726j, f56719c, f56727k, 0.0f, 8, null), d3Var);
            w0 w0VarB = m3.b(i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarL);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            final q3 q3Var = q3.f39261a;
            final er.p<? super r, ? super Integer, i0> pVar7 = pVar4;
            final er.p<? super r, ? super Integer, i0> pVar8 = pVar6;
            final ae aeVar3 = aeVar2;
            final er.p<? super r, ? super Integer, i0> pVar9 = pVar5;
            oo.h(androidx.compose.material3.d.f9816a.e(rVarH, 6).getLabelLarge(), y2.m.d(865999929, true, new er.p() { // from class: f2.be
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return le.t(pVar9, aeVar3, z15, pVar8, q3Var, pVar7, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f2.ce
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return le.x(pVar, aVar, mVar, pVar2, pVar3, z15, aeVar, d3Var, lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final er.p pVar, ae aeVar, boolean z15, final er.p pVar2, final p3 p3Var, final er.p pVar3, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(865999929, i15, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:1515)");
            }
            if (pVar != null) {
                rVar.X(-864613344);
                d0.c(h4.a().d(Color.m0boximpl(ae.b(aeVar, z15, false, 2, null))), y2.m.d(1241781204, true, new er.p() { // from class: f2.de
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return le.u(pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, c4.f122821i | 48);
                rVar.R();
            } else {
                rVar.X(-864297175);
                rVar.R();
            }
            c4<Color> c4VarD = h4.a().d(Color.m0boximpl(ae.d(aeVar, z15, false, 2, null)));
            f fVarD = y2.m.d(-893579015, true, new er.p() { // from class: f2.ee
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return le.v(p3Var, pVar, pVar2, pVar3, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54);
            int i16 = c4.f122821i;
            d0.c(c4VarD, fVarD, rVar, i16 | 48);
            if (pVar2 != null) {
                rVar.X(-863399043);
                d0.c(h4.a().d(Color.m0boximpl(ae.f(aeVar, z15, false, 2, null))), y2.m.d(-782441013, true, new er.p() { // from class: f2.fe
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return le.w(pVar2, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, i16 | 48);
                rVar.R();
            } else {
                rVar.X(-863079991);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1241781204, i15, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1519)");
            }
            m mVarB = androidx.compose.foundation.layout.d.b(m.INSTANCE, g0.f114547a.i(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarB);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
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
    public static final i0 v(p3 p3Var, er.p pVar, er.p pVar2, er.p pVar3, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-893579015, i15, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1525)");
            }
            m mVarR = a3.r(p3.c(p3Var, m.INSTANCE, 1.0f, false, 2, null), pVar != null ? f56720d : h.n(0), 0.0f, pVar2 != null ? f56720d : h.n(0), 0.0f, 10, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            pVar3.B(rVar, 0);
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
    public static final i0 w(er.p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-782441013, i15, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1549)");
            }
            m mVarB = androidx.compose.foundation.layout.d.b(m.INSTANCE, g0.f114547a.k(), 0.0f, 2, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarB);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
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
    public static final i0 x(er.p pVar, er.a aVar, m mVar, er.p pVar2, er.p pVar3, boolean z15, ae aeVar, d3 d3Var, b1.l lVar, int i15, r rVar, int i16) {
        s(pVar, aVar, mVar, pVar2, pVar3, z15, aeVar, d3Var, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static final long y(c5.p pVar, c5.p pVar2) {
        float fMax;
        float fMax2 = 1.0f;
        if (pVar2.getLeft() >= pVar.getRight()) {
            fMax = 0.0f;
        } else if (pVar2.getRight() <= pVar.getLeft()) {
            fMax = 1.0f;
        } else if (pVar2.k() == 0) {
            fMax = 0.0f;
        } else {
            fMax = (((Math.max(pVar.getLeft(), pVar2.getLeft()) + Math.min(pVar.getRight(), pVar2.getRight())) / 2) - pVar2.getLeft()) / pVar2.k();
        }
        if (pVar2.getTop() >= pVar.getBottom()) {
            fMax2 = 0.0f;
        } else if (pVar2.getBottom() > pVar.getTop()) {
            if (pVar2.f() == 0) {
                fMax2 = 0.0f;
            } else {
                fMax2 = (((Math.max(pVar.getTop(), pVar2.getTop()) + Math.min(pVar.getBottom(), pVar2.getBottom())) / 2) - pVar2.getTop()) / pVar2.f();
            }
        }
        return e3.a(fMax, fMax2);
    }

    public static final float z() {
        return f56721e;
    }
}
