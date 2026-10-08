package z1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p079n1.a4;
import p079n1.b4;
import p079n1.i4;
import p079n1.j4;
import p079n1.k6;
import p079n1.l4;
import p079n1.s3;
import q4.TextLayoutResult;
import q4.z3;
import y0.ContextMenuState;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "isStartHandle", "Lb5/i;", "direction", "Lz1/c2;", "manager", "Loq/i0;", "h", "(ZLb5/i;Lz1/c2;Lm2/r;I)V", "s", "(Lz1/c2;Z)Z", "Lc5/r;", "magnifierSize", "Lm3/e;", "j", "(Lz1/c2;J)J", "Ly0/t;", "contextMenuState", "Lm2/f6;", "Ln1/b4;", "itemsAvailability", "Lkotlin/Function1;", "Ly0/r;", "k", "(Lz1/c2;Ly0/t;Lm2/f6;)Ler/l;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c2 f232163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f232164b;

        a(c2 c2Var, boolean z15) {
            this.f232163a = c2Var;
            this.f232164b = z15;
        }

        @Override // z1.w
        public final long a() {
            return this.f232163a.b0(this.f232164b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l4 f232165a;

        b(l4 l4Var) {
            this.f232165a = l4Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(a4.k0 k0Var, tq.e<? super oq.i0> eVar) {
            Object objG = a4.g(k0Var, this.f232165a, eVar);
            return objG == uq.b.e() ? objG : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f232166a;

        static {
            int[] iArr = new int[p079n1.q2.values().length];
            try {
                iArr[p079n1.q2.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p079n1.q2.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p079n1.q2.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f232166a = iArr;
        }
    }

    public static final void h(final boolean z15, final b5.i iVar, final c2 c2Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1344558920);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.c(iVar.ordinal()) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(c2Var) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1344558920, i16, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1365)");
            }
            int i17 = i16 & 14;
            boolean zW = (i17 == 4) | rVarH.W(c2Var);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = c2Var.q0(z15);
                rVarH.v(objE);
            }
            l4 l4Var = (l4) objE;
            boolean zG = rVarH.G(c2Var) | (i17 == 4);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(c2Var, z15);
                rVarH.v(objE2);
            }
            w wVar = (w) objE2;
            boolean zM = z3.m(c2Var.p0().getSelection());
            float fA0 = c2Var.a0(z15);
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean zG2 = rVarH.G(l4Var);
            Object objE3 = rVarH.E();
            if (zG2 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new b(l4Var);
                rVarH.v(objE3);
            }
            l.n(wVar, z15, iVar, zM, 0L, fA0, a4.w0.c(companion, l4Var, (PointerInputEventHandler) objE3), rVarH, (i16 << 3) & 1008, 16);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z1.j2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p2.i(z15, iVar, c2Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(boolean z15, b5.i iVar, c2 c2Var, int i15, p076m2.r rVar, int i16) {
        h(z15, iVar, c2Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final long j(c2 c2Var, long j15) {
        int iN;
        k6 k6VarN;
        j4 textDelegate;
        q4.e text;
        m3.e eVarU = c2Var.U();
        if (eVarU == null) {
            return m3.e.INSTANCE.b();
        }
        long packedValue = eVarU.getPackedValue();
        q4.e eVarO0 = c2Var.o0();
        if (eVarO0 == null || eVarO0.length() == 0) {
            return m3.e.INSTANCE.b();
        }
        p079n1.q2 q2VarW = c2Var.W();
        int i15 = q2VarW == null ? -1 : c.f232166a[q2VarW.ordinal()];
        if (i15 == -1) {
            return m3.e.INSTANCE.b();
        }
        if (i15 == 1 || i15 == 2) {
            iN = z3.n(c2Var.p0().getSelection());
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            iN = z3.i(c2Var.p0().getSelection());
        }
        s3 state = c2Var.getState();
        if (state == null || (k6VarN = state.n()) == null) {
            return m3.e.INSTANCE.b();
        }
        s3 state2 = c2Var.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return m3.e.INSTANCE.b();
        }
        int iN2 = lr.m.n(c2Var.getOffsetMapping().e(iN), 0, text.length());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (k6VarN.j(packedValue) >> 32));
        TextLayoutResult value = k6VarN.getValue();
        int iQ = value.q(iN2);
        float fS = value.s(iQ);
        float fT = value.t(iQ);
        float fM = lr.m.m(fIntBitsToFloat, Math.min(fS, fT), Math.max(fS, fT));
        if (!c5.r.e(j15, c5.r.INSTANCE.a()) && Math.abs(fIntBitsToFloat - fM) > ((int) (j15 >> 32)) / 2) {
            return m3.e.INSTANCE.b();
        }
        float fV = value.v(iQ);
        return m3.e.e((((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(((value.m(iQ) - fV) / 2) + fV)) & BodyPartID.bodyIdMax));
    }

    public static final er.l<y0.r, oq.i0> k(final c2 c2Var, final ContextMenuState contextMenuState, final f6<b4> f6Var) {
        return new er.l() { // from class: z1.i2
            @Override // er.l
            public final Object b(Object obj) {
                return p2.l(f6Var, c2Var, contextMenuState, (y0.r) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(f6 f6Var, final c2 c2Var, ContextMenuState contextMenuState, y0.r rVar) {
        int value = ((b4) f6Var.getValue()).getValue();
        r(rVar, contextMenuState, i4.f130089d, b4.h(value), new er.a() { // from class: z1.k2
            @Override // er.a
            public final Object a() {
                return p2.m(c2Var);
            }
        });
        r(rVar, contextMenuState, i4.f130090e, b4.g(value), new er.a() { // from class: z1.l2
            @Override // er.a
            public final Object a() {
                return p2.n(c2Var);
            }
        });
        r(rVar, contextMenuState, i4.f130091f, b4.i(value), new er.a() { // from class: z1.m2
            @Override // er.a
            public final Object a() {
                return p2.o(c2Var);
            }
        });
        r(rVar, contextMenuState, i4.f130092g, b4.j(value), new er.a() { // from class: z1.n2
            @Override // er.a
            public final Object a() {
                return p2.p(c2Var);
            }
        });
        if (c1.i.a()) {
            r(rVar, contextMenuState, i4.f130093h, b4.f(value), new er.a() { // from class: z1.o2
                @Override // er.a
                public final Object a() {
                    return p2.q(c2Var);
                }
            });
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(c2 c2Var) {
        c2Var.I();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(c2 c2Var) {
        c2Var.C(false);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(c2 c2Var) {
        c2Var.w0();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(c2 c2Var) {
        c2Var.y0();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(c2 c2Var) {
        c2Var.v();
        return oq.i0.f148189a;
    }

    private static final void r(y0.r rVar, ContextMenuState contextMenuState, i4 i4Var, boolean z15, er.a<oq.i0> aVar) {
        if (z15) {
            y0.r.g(rVar, new p079n1.y0(i4Var), null, false, null, new p079n1.z0(aVar, contextMenuState), 14, null);
        }
    }

    public static final boolean s(c2 c2Var, boolean z15) {
        p036e4.b0 b0VarM;
        m3.g gVarB;
        s3 state = c2Var.getState();
        if (state == null || (b0VarM = state.m()) == null || (gVarB = n1.b(b0VarM)) == null) {
            return false;
        }
        return n1.a(gVarB, c2Var.b0(z15));
    }
}
