package p046f2;

import androidx.compose.material3.d;
import androidx.compose.ui.graphics.Color;
import b1.j;
import c5.h;
import d1.a3;
import d1.d3;
import er.p;
import er.q;
import f3.m;
import h2.g3;
import h2.h3;
import l2.d0;
import l2.k0;
import m1.c;
import m1.g;
import m1.u;
import m1.z;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q4.e;
import u0.j0;
import v4.TransformedText;
import v4.e1;
import y2.f;
import z1.SelectionColors;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u001c\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JU\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017Jû\u0001\u0010)\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020&2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u001aH\u0007¢\u0006\u0004\b)\u0010*J5\u0010/\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f¢\u0006\u0004\b/\u00100J5\u00101\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000f¢\u0006\u0004\b1\u00100J7\u00102\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\u000fH\u0000¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u00020\u000bH\u0007¢\u0006\u0004\b3\u00104J¿\u0003\u0010b\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u0002052\b\b\u0002\u00108\u001a\u0002052\b\b\u0002\u00109\u001a\u0002052\b\b\u0002\u0010:\u001a\u0002052\b\b\u0002\u0010;\u001a\u0002052\b\b\u0002\u0010<\u001a\u0002052\b\b\u0002\u0010=\u001a\u0002052\b\b\u0002\u0010>\u001a\u0002052\b\b\u0002\u0010?\u001a\u0002052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010B\u001a\u0002052\b\b\u0002\u0010C\u001a\u0002052\b\b\u0002\u0010D\u001a\u0002052\b\b\u0002\u0010E\u001a\u0002052\b\b\u0002\u0010F\u001a\u0002052\b\b\u0002\u0010G\u001a\u0002052\b\b\u0002\u0010H\u001a\u0002052\b\b\u0002\u0010I\u001a\u0002052\b\b\u0002\u0010J\u001a\u0002052\b\b\u0002\u0010K\u001a\u0002052\b\b\u0002\u0010L\u001a\u0002052\b\b\u0002\u0010M\u001a\u0002052\b\b\u0002\u0010N\u001a\u0002052\b\b\u0002\u0010O\u001a\u0002052\b\b\u0002\u0010P\u001a\u0002052\b\b\u0002\u0010Q\u001a\u0002052\b\b\u0002\u0010R\u001a\u0002052\b\b\u0002\u0010S\u001a\u0002052\b\b\u0002\u0010T\u001a\u0002052\b\b\u0002\u0010U\u001a\u0002052\b\b\u0002\u0010V\u001a\u0002052\b\b\u0002\u0010W\u001a\u0002052\b\b\u0002\u0010X\u001a\u0002052\b\b\u0002\u0010Y\u001a\u0002052\b\b\u0002\u0010Z\u001a\u0002052\b\b\u0002\u0010[\u001a\u0002052\b\b\u0002\u0010\\\u001a\u0002052\b\b\u0002\u0010]\u001a\u0002052\b\b\u0002\u0010^\u001a\u0002052\b\b\u0002\u0010_\u001a\u0002052\b\b\u0002\u0010`\u001a\u0002052\b\b\u0002\u0010a\u001a\u000205H\u0007¢\u0006\u0004\bb\u0010cJ\u001b\u0010f\u001a\u00020\u000b*\u00020d2\u0006\u0010e\u001a\u00020@H\u0000¢\u0006\u0004\bf\u0010gR\u0017\u0010l\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010o\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bm\u0010i\u001a\u0004\bn\u0010kR\u0017\u0010r\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bp\u0010i\u001a\u0004\bq\u0010kR\u0017\u0010u\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bs\u0010i\u001a\u0004\bt\u0010kR \u0010y\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010i\u0012\u0004\bx\u0010\u0003\u001a\u0004\bw\u0010kR \u0010}\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bz\u0010i\u0012\u0004\b|\u0010\u0003\u001a\u0004\b{\u0010kR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, d2 = {"Lf2/pn;", "", "<init>", "()V", "", "enabled", "isError", "Lb1/j;", "interactionSource", "Lf3/m;", "modifier", "Lf2/hn;", "colors", "Ln3/y2;", "shape", "Lc5/h;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "Loq/i0;", "h", "(ZZLb1/j;Lf3/m;Lf2/hn;Ln3/y2;FFLm2/r;II)V", "textFieldShape", "y", "(Lf3/m;ZZLb1/j;Lf2/hn;Ln3/y2;FF)Lf3/m;", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "Lv4/e1;", "visualTransformation", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Ld1/d3;", "contentPadding", "container", "m", "(Ljava/lang/String;Ler/p;ZZLv4/e1;Lb1/j;ZLer/p;Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;Ln3/y2;Lf2/hn;Ld1/d3;Ler/p;Lm2/r;III)V", "start", "end", "top", "bottom", "s", "(FFFF)Ld1/d3;", "u", "z", "q", "(Lm2/r;I)Lf2/hn;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Lz1/e3;", "selectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "r", "(JJJJJJJJJJLz1/e3;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLm2/r;IIIIIII)Lf2/hn;", "Lf2/e2;", "localTextSelectionColors", "w", "(Lf2/e2;Lz1/e3;)Lf2/hn;", "b", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "c", "getMinWidth-D9Ej5fM", "MinWidth", "d", "getUnfocusedIndicatorThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "e", "getFocusedIndicatorThickness-D9Ej5fM", "FocusedIndicatorThickness", "f", "getUnfocusedBorderThickness-D9Ej5fM", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "UnfocusedBorderThickness", "g", "getFocusedBorderThickness-D9Ej5fM", "getFocusedBorderThickness-D9Ej5fM$annotations", "FocusedBorderThickness", "x", "(Lm2/r;I)Ln3/y2;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pn f57316a = new pn();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight = h.n(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = h.n(280);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedIndicatorThickness;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedIndicatorThickness;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedBorderThickness;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness;

    static {
        float fN = h.n(1);
        UnfocusedIndicatorThickness = fN;
        float fN2 = h.n(2);
        FocusedIndicatorThickness = fN2;
        UnfocusedBorderThickness = fN;
        FocusedBorderThickness = fN2;
    }

    private pn() {
    }

    public static /* synthetic */ d3 A(pn pnVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = g3.q0();
        }
        if ((i15 & 2) != 0) {
            f16 = g3.p0();
        }
        if ((i15 & 4) != 0) {
            f17 = g3.q0();
        }
        if ((i15 & 8) != 0) {
            f18 = h.n(0);
        }
        return pnVar.z(f15, f16, f17, f18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(y2 y2Var, final hn hnVar, final boolean z15, final boolean z16, final j0 j0Var, u uVar) {
        uVar.h1(y2Var);
        uVar.H0(hnVar.b(z15, z16, false));
        z.b(uVar, new g() { // from class: f2.kn
            @Override // m1.g
            public final void a(u uVar2) {
                pn.j(j0Var, hnVar, z15, z16, uVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(j0 j0Var, final hn hnVar, final boolean z15, final boolean z16, u uVar) {
        uVar.I1(j0Var, new g() { // from class: f2.ln
            @Override // m1.g
            public final void a(u uVar2) {
                pn.k(hnVar, z15, z16, uVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(hn hnVar, boolean z15, boolean z16, u uVar) {
        uVar.H0(hnVar.b(z15, z16, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(pn pnVar, boolean z15, boolean z16, j jVar, m mVar, hn hnVar, y2 y2Var, float f15, float f16, int i15, int i16, r rVar, int i17) {
        pnVar.h(z15, z16, jVar, mVar, hnVar, y2Var, f15, f16, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(boolean z15, boolean z16, j jVar, hn hnVar, y2 y2Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(417908150, i15, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:392)");
            }
            f57316a.h(z15, z16, jVar, m.INSTANCE, hnVar, y2Var, FocusedIndicatorThickness, UnfocusedIndicatorThickness, rVar, 114822144, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(p pVar, un unVar, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1110058497, i15, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:417)");
            }
            pVar.B(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(pn pnVar, String str, p pVar, boolean z15, boolean z16, e1 e1Var, j jVar, boolean z17, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, y2 y2Var, hn hnVar, d3 d3Var, p pVar9, int i15, int i16, int i17, r rVar, int i18) {
        pnVar.m(str, pVar, z15, z16, e1Var, jVar, z17, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, y2Var, hnVar, d3Var, pVar9, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return i0.f148189a;
    }

    public static /* synthetic */ d3 t(pn pnVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = g3.q0();
        }
        if ((i15 & 2) != 0) {
            f16 = g3.q0();
        }
        if ((i15 & 4) != 0) {
            f17 = sn.f();
        }
        if ((i15 & 8) != 0) {
            f18 = sn.f();
        }
        return pnVar.s(f15, f16, f17, f18);
    }

    public static /* synthetic */ d3 v(pn pnVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = g3.q0();
        }
        if ((i15 & 2) != 0) {
            f16 = g3.q0();
        }
        if ((i15 & 4) != 0) {
            f17 = g3.q0();
        }
        if ((i15 & 8) != 0) {
            f18 = g3.q0();
        }
        return pnVar.u(f15, f16, f17, f18);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0139 A[PHI: r1 r5 r13 r14 r15
      0x0139: PHI (r1v20 n3.y2) = (r1v10 n3.y2), (r1v26 n3.y2) binds: [B:124:0x016b, B:108:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r5v20 int) = (r5v14 int), (r5v24 int) binds: [B:124:0x016b, B:108:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r13v7 f3.m) = (r13v4 f3.m), (r13v2 f3.m) binds: [B:124:0x016b, B:108:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r14v17 f2.hn) = (r14v7 f2.hn), (r14v6 f2.hn) binds: [B:124:0x016b, B:108:0x0138] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r15v13 float) = (r15v2 float), (r15v1 float) binds: [B:124:0x016b, B:108:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156  */
    /* JADX WARN: Code duplicated, block: B:119:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0164  */
    /* JADX WARN: Code duplicated, block: B:125:0x016d  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:168:0x0209  */
    /* JADX WARN: Code duplicated, block: B:171:0x023b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0245  */
    /* JADX WARN: Code duplicated, block: B:177:0x0254  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(final boolean z15, final boolean z16, final j jVar, m mVar, hn hnVar, y2 y2Var, float f15, float f16, r rVar, final int i15, final int i16) {
        boolean z17;
        int i17;
        boolean z18;
        m mVar2;
        hn hnVar2;
        y2 y2Var2;
        float f17;
        float f18;
        boolean z19;
        final hn hnVar3;
        final float f19;
        final float f25;
        final y2 y2Var3;
        final m mVar3;
        d5 d5VarM;
        y2 y2VarX;
        float f26;
        int i18;
        final hn hnVar4;
        boolean z25;
        Object objE;
        final j0 j0VarB;
        boolean z26;
        boolean zG;
        Object objE2;
        y2 y2Var4;
        int i19;
        int i25;
        int i26;
        int i27;
        r rVarH = rVar.h(-818661242);
        if ((i15 & 6) == 0) {
            z17 = z15;
            i17 = (rVarH.a(z17) ? 4 : 2) | i15;
        } else {
            z17 = z15;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            z18 = z16;
            i17 |= rVarH.a(z18) ? 32 : 16;
        } else {
            z18 = z16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(jVar) ? 256 : 128;
        }
        int i28 = i16 & 8;
        if (i28 == 0) {
            if ((i15 & 3072) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    hnVar2 = hnVar;
                    if (rVarH.W(hnVar2)) {
                        i27 = 16384;
                    }
                    i17 |= i27;
                } else {
                    hnVar2 = hnVar;
                }
                i27 = PKIFailureInfo.certRevoked;
                i17 |= i27;
            } else {
                hnVar2 = hnVar;
            }
            if ((i15 & 196608) == 0) {
                y2Var2 = y2Var;
                if ((i16 & 32) == 0 || !rVarH.W(y2Var2)) {
                    i26 = PKIFailureInfo.notAuthorized;
                } else {
                    i26 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i26;
            } else {
                y2Var2 = y2Var;
            }
            if ((i15 & 1572864) == 0) {
                f17 = f15;
                if ((i16 & 64) == 0 || !rVarH.b(f17)) {
                    i25 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i25 = PKIFailureInfo.badCertTemplate;
                }
                i17 |= i25;
            } else {
                f17 = f15;
            }
            if ((i15 & 12582912) == 0) {
                if ((i16 & 128) == 0) {
                    f18 = f16;
                    int i29 = rVarH.b(f18) ? 8388608 : 4194304;
                    i17 |= i29;
                } else {
                    f18 = f16;
                }
                i17 |= i29;
            } else {
                f18 = f16;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(this)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i17 |= i19;
            }
            if ((i17 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i28 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 16) != 0) {
                        hn hnVarQ = q(rVarH, (i17 >> 24) & 14);
                        i17 &= -57345;
                        hnVar2 = hnVarQ;
                    }
                    if ((i16 & 32) != 0) {
                        y2VarX = f57316a.x(rVarH, 6);
                        i17 &= -458753;
                    } else {
                        y2VarX = y2Var2;
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                        f17 = FocusedIndicatorThickness;
                    }
                    if ((i16 & 128) != 0) {
                        f26 = UnfocusedIndicatorThickness;
                        i18 = i17 & (-29360129);
                    }
                    hnVar4 = hnVar2;
                    float f27 = f17;
                    rVarH.y();
                    if (t.k()) {
                        t.o(-818661242, i18, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:239)");
                    }
                    if ((i18 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objE = rVarH.E();
                    if (z25 || objE == r.INSTANCE.a()) {
                        objE = new c(jVar);
                        rVarH.v(objE);
                    }
                    c cVar = (c) objE;
                    j0VarB = of.b(k0.FastEffects, rVarH, 6);
                    boolean z27 = ((((57344 & i18) ^ 24576) <= 16384 && rVarH.W(hnVar4)) || (i18 & 24576) == 16384) | ((((458752 & i18) ^ 196608) <= 131072 && rVarH.W(y2VarX)) || (i18 & 196608) == 131072);
                    if ((i18 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zG = z27 | z26 | ((i18 & 112) == 32) | rVarH.G(j0VarB);
                    objE2 = rVarH.E();
                    if (!zG || objE2 == r.INSTANCE.a()) {
                        final y2 y2Var5 = y2VarX;
                        final boolean z28 = z17;
                        final boolean z29 = z18;
                        objE2 = new g() { // from class: f2.in
                            @Override // m1.g
                            public final void a(u uVar) {
                                pn.i(y2Var5, hnVar4, z28, z29, j0VarB, uVar);
                            }
                        };
                        y2Var4 = y2Var5;
                        rVarH.v(objE2);
                    } else {
                        y2Var4 = y2VarX;
                    }
                    d1.r.b(y(m1.m.b(mVar2, cVar, (g) objE2), z15, z16, jVar, hnVar4, y2Var4, f27, f26), rVarH, 0);
                    if (t.k()) {
                        t.n();
                    }
                    f25 = f26;
                    f19 = f27;
                    y2Var3 = y2Var4;
                    hnVar3 = hnVar4;
                } else {
                    rVarH.O();
                    if ((i16 & 16) != 0) {
                        i17 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        i17 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        i17 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        i17 &= -29360129;
                    }
                    y2VarX = y2Var2;
                }
                i18 = i17;
                f26 = f18;
                hnVar4 = hnVar2;
                float f28 = f17;
                rVarH.y();
                if (t.k()) {
                    t.o(-818661242, i18, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:239)");
                }
                if ((i18 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objE = rVarH.E();
                if (z25) {
                    objE = new c(jVar);
                    rVarH.v(objE);
                } else {
                    objE = new c(jVar);
                    rVarH.v(objE);
                }
                c cVar2 = (c) objE;
                j0VarB = of.b(k0.FastEffects, rVarH, 6);
                if (((458752 & i18) ^ 196608) <= 131072) {
                }
                boolean z210 = ((((57344 & i18) ^ 24576) <= 16384 && rVarH.W(hnVar4)) || (i18 & 24576) == 16384) | ((((458752 & i18) ^ 196608) <= 131072 && rVarH.W(y2VarX)) || (i18 & 196608) == 131072);
                if ((i18 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zG = z210 | z26 | ((i18 & 112) == 32) | rVarH.G(j0VarB);
                objE2 = rVarH.E();
                if (zG) {
                    final y2 y2Var6 = y2VarX;
                    final boolean z211 = z17;
                    final boolean z212 = z18;
                    objE2 = new g() { // from class: f2.in
                        @Override // m1.g
                        public final void a(u uVar) {
                            pn.i(y2Var6, hnVar4, z211, z212, j0VarB, uVar);
                        }
                    };
                    y2Var4 = y2Var6;
                    rVarH.v(objE2);
                } else {
                    final y2 y2Var7 = y2VarX;
                    final boolean z213 = z17;
                    final boolean z214 = z18;
                    objE2 = new g() { // from class: f2.in
                        @Override // m1.g
                        public final void a(u uVar) {
                            pn.i(y2Var7, hnVar4, z213, z214, j0VarB, uVar);
                        }
                    };
                    y2Var4 = y2Var7;
                    rVarH.v(objE2);
                }
                d1.r.b(y(m1.m.b(mVar2, cVar2, (g) objE2), z15, z16, jVar, hnVar4, y2Var4, f28, f26), rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                f25 = f26;
                f19 = f28;
                y2Var3 = y2Var4;
                hnVar3 = hnVar4;
            } else {
                rVarH.O();
                hnVar3 = hnVar2;
                f19 = f17;
                f25 = f18;
                y2Var3 = y2Var2;
            }
            mVar3 = mVar2;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.jn
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return pn.l(this.f56498a, z15, z16, jVar, mVar3, hnVar3, y2Var3, f19, f25, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        mVar2 = mVar;
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                hnVar2 = hnVar;
                if (rVarH.W(hnVar2)) {
                    i27 = 16384;
                }
                i17 |= i27;
            } else {
                hnVar2 = hnVar;
            }
            i27 = PKIFailureInfo.certRevoked;
            i17 |= i27;
        } else {
            hnVar2 = hnVar;
        }
        if ((i15 & 196608) == 0) {
            y2Var2 = y2Var;
            if ((i16 & 32) == 0) {
                i26 = PKIFailureInfo.notAuthorized;
            } else {
                i26 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i26;
        } else {
            y2Var2 = y2Var;
        }
        if ((i15 & 1572864) == 0) {
            f17 = f15;
            if ((i16 & 64) == 0) {
                i25 = PKIFailureInfo.signerNotTrusted;
            } else {
                i25 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i25;
        } else {
            f17 = f15;
        }
        if ((i15 & 12582912) == 0) {
            if ((i16 & 128) == 0) {
                f18 = f16;
                if (rVarH.b(f18)) {
                }
                i17 |= i29;
            } else {
                f18 = f16;
            }
            i17 |= i29;
        } else {
            f18 = f16;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.W(this)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i17 |= i19;
        }
        if ((i17 & 38347923) != 38347922) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (rVarH.r(z19, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i28 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 16) != 0) {
                    hn hnVarQ2 = q(rVarH, (i17 >> 24) & 14);
                    i17 &= -57345;
                    hnVar2 = hnVarQ2;
                }
                if ((i16 & 32) != 0) {
                    y2VarX = f57316a.x(rVarH, 6);
                    i17 &= -458753;
                } else {
                    y2VarX = y2Var2;
                }
                if ((i16 & 64) != 0) {
                    i17 &= -3670017;
                    f17 = FocusedIndicatorThickness;
                }
                if ((i16 & 128) != 0) {
                    f26 = UnfocusedIndicatorThickness;
                    i18 = i17 & (-29360129);
                } else {
                    i18 = i17;
                    f26 = f18;
                }
            } else {
                if (i28 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 16) != 0) {
                    hn hnVarQ3 = q(rVarH, (i17 >> 24) & 14);
                    i17 &= -57345;
                    hnVar2 = hnVarQ3;
                }
                if ((i16 & 32) != 0) {
                    y2VarX = f57316a.x(rVarH, 6);
                    i17 &= -458753;
                } else {
                    y2VarX = y2Var2;
                }
                if ((i16 & 64) != 0) {
                    i17 &= -3670017;
                    f17 = FocusedIndicatorThickness;
                }
                if ((i16 & 128) != 0) {
                    f26 = UnfocusedIndicatorThickness;
                    i18 = i17 & (-29360129);
                } else {
                    i18 = i17;
                    f26 = f18;
                }
            }
            hnVar4 = hnVar2;
            float f29 = f17;
            rVarH.y();
            if (t.k()) {
                t.o(-818661242, i18, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:239)");
            }
            if ((i18 & 896) == 256) {
                z25 = true;
            } else {
                z25 = false;
            }
            objE = rVarH.E();
            if (z25) {
                objE = new c(jVar);
                rVarH.v(objE);
            } else {
                objE = new c(jVar);
                rVarH.v(objE);
            }
            c cVar3 = (c) objE;
            j0VarB = of.b(k0.FastEffects, rVarH, 6);
            if (((458752 & i18) ^ 196608) <= 131072) {
            }
            boolean z215 = ((((57344 & i18) ^ 24576) <= 16384 && rVarH.W(hnVar4)) || (i18 & 24576) == 16384) | ((((458752 & i18) ^ 196608) <= 131072 && rVarH.W(y2VarX)) || (i18 & 196608) == 131072);
            if ((i18 & 14) == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            zG = z215 | z26 | ((i18 & 112) == 32) | rVarH.G(j0VarB);
            objE2 = rVarH.E();
            if (zG) {
                final y2 y2Var8 = y2VarX;
                final boolean z216 = z17;
                final boolean z217 = z18;
                objE2 = new g() { // from class: f2.in
                    @Override // m1.g
                    public final void a(u uVar) {
                        pn.i(y2Var8, hnVar4, z216, z217, j0VarB, uVar);
                    }
                };
                y2Var4 = y2Var8;
                rVarH.v(objE2);
            } else {
                final y2 y2Var9 = y2VarX;
                final boolean z218 = z17;
                final boolean z219 = z18;
                objE2 = new g() { // from class: f2.in
                    @Override // m1.g
                    public final void a(u uVar) {
                        pn.i(y2Var9, hnVar4, z218, z219, j0VarB, uVar);
                    }
                };
                y2Var4 = y2Var9;
                rVarH.v(objE2);
            }
            d1.r.b(y(m1.m.b(mVar2, cVar3, (g) objE2), z15, z16, jVar, hnVar4, y2Var4, f29, f26), rVarH, 0);
            if (t.k()) {
                t.n();
            }
            f25 = f26;
            f19 = f29;
            y2Var3 = y2Var4;
            hnVar3 = hnVar4;
        } else {
            rVarH.O();
            hnVar3 = hnVar2;
            f19 = f17;
            f25 = f18;
            y2Var3 = y2Var2;
        }
        mVar3 = mVar2;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.jn
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return pn.l(this.f56498a, z15, z16, jVar, mVar3, hnVar3, y2Var3, f19, f25, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:110:0x0155  */
    /* JADX WARN: Code duplicated, block: B:112:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0176  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191  */
    /* JADX WARN: Code duplicated, block: B:129:0x0197  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:152:0x01db  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x0200  */
    /* JADX WARN: Code duplicated, block: B:168:0x0205  */
    /* JADX WARN: Code duplicated, block: B:170:0x020b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0211  */
    /* JADX WARN: Code duplicated, block: B:173:0x0214  */
    /* JADX WARN: Code duplicated, block: B:177:0x021c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0222  */
    /* JADX WARN: Code duplicated, block: B:180:0x0225  */
    /* JADX WARN: Code duplicated, block: B:188:0x0245  */
    /* JADX WARN: Code duplicated, block: B:191:0x024e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x029b  */
    /* JADX WARN: Code duplicated, block: B:209:0x029f  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:214:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:215:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:223:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:224:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:226:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:227:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:230:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:231:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02de  */
    /* JADX WARN: Code duplicated, block: B:235:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:238:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:240:0x0317  */
    /* JADX WARN: Code duplicated, block: B:242:0x033b  */
    /* JADX WARN: Code duplicated, block: B:244:0x033f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0379  */
    /* JADX WARN: Code duplicated, block: B:249:0x038b  */
    /* JADX WARN: Code duplicated, block: B:252:0x0398  */
    /* JADX WARN: Code duplicated, block: B:253:0x039a  */
    /* JADX WARN: Code duplicated, block: B:256:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:263:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:266:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:267:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:270:0x047c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0494  */
    /* JADX WARN: Code duplicated, block: B:275:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:93:0x011d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    public final void m(final String str, final p<? super r, ? super Integer, i0> pVar, final boolean z15, final boolean z16, final e1 e1Var, final j jVar, boolean z17, p<? super r, ? super Integer, i0> pVar2, p<? super r, ? super Integer, i0> pVar3, p<? super r, ? super Integer, i0> pVar4, p<? super r, ? super Integer, i0> pVar5, p<? super r, ? super Integer, i0> pVar6, p<? super r, ? super Integer, i0> pVar7, p<? super r, ? super Integer, i0> pVar8, y2 y2Var, hn hnVar, d3 d3Var, p<? super r, ? super Integer, i0> pVar9, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        p<? super r, ? super Integer, i0> pVar10;
        boolean z18;
        j jVar2;
        boolean z19;
        p<? super r, ? super Integer, i0> pVar11;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        boolean z25;
        r rVar2;
        final p<? super r, ? super Integer, i0> pVar12;
        final p<? super r, ? super Integer, i0> pVar13;
        final p<? super r, ? super Integer, i0> pVar14;
        final p<? super r, ? super Integer, i0> pVar15;
        final y2 y2Var2;
        final hn hnVar2;
        final d3 d3Var2;
        final p<? super r, ? super Integer, i0> pVar16;
        final p<? super r, ? super Integer, i0> pVar17;
        final boolean z26;
        final p<? super r, ? super Integer, i0> pVar18;
        final p<? super r, ? super Integer, i0> pVar19;
        d5 d5VarM;
        p<? super r, ? super Integer, i0> pVar20;
        p<? super r, ? super Integer, i0> pVar21;
        p<? super r, ? super Integer, i0> pVar22;
        p<? super r, ? super Integer, i0> pVar23;
        p<? super r, ? super Integer, i0> pVar24;
        p<? super r, ? super Integer, i0> pVar25;
        y2 y2VarX;
        hn hnVarQ;
        d3 d3VarT;
        p<? super r, ? super Integer, i0> pVar26;
        p<? super r, ? super Integer, i0> pVarD;
        hn hnVar3;
        y2 y2Var3;
        final p<? super r, ? super Integer, i0> pVar27;
        boolean z27;
        int i48;
        p<? super r, ? super Integer, i0> pVar28;
        p<? super r, ? super Integer, i0> pVar29;
        p<? super r, ? super Integer, i0> pVar30;
        p<? super r, ? super Integer, i0> pVar31;
        d3 d3Var3;
        p<? super r, ? super Integer, i0> pVar32;
        boolean z28;
        boolean z29;
        Object objE;
        f fVar;
        int i49;
        int i55;
        int i56;
        r rVarH = rVar.h(1806980801);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            pVar10 = pVar;
            i18 |= rVarH.G(pVar10) ? 32 : 16;
        } else {
            pVar10 = pVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            z18 = z15;
            i18 |= rVarH.a(z18) ? 256 : 128;
        } else {
            z18 = z15;
        }
        if ((i15 & 3072) == 0) {
            i18 |= rVarH.a(z16) ? 2048 : 1024;
        }
        int i57 = i15 & 24576;
        int i58 = PKIFailureInfo.certRevoked;
        if (i57 == 0) {
            i18 |= rVarH.W(e1Var) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            jVar2 = jVar;
            i18 |= rVarH.W(jVar2) ? 131072 : 65536;
        } else {
            jVar2 = jVar;
        }
        int i59 = i17 & 64;
        if (i59 != 0) {
            i18 |= 1572864;
            z19 = z17;
        } else {
            z19 = z17;
            if ((i15 & 1572864) == 0) {
                i18 |= rVarH.a(z19) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
        }
        int i65 = i17 & 128;
        if (i65 != 0) {
            i18 |= 12582912;
            pVar11 = pVar2;
        } else {
            pVar11 = pVar2;
            if ((i15 & 12582912) == 0) {
                i18 |= rVarH.G(pVar11) ? 8388608 : 4194304;
            }
        }
        int i66 = i17 & 256;
        if (i66 != 0) {
            i18 |= 100663296;
        } else if ((i15 & 100663296) == 0) {
            i18 |= rVarH.G(pVar3) ? 67108864 : 33554432;
        }
        int i67 = i17 & 512;
        if (i67 == 0) {
            if ((i15 & 805306368) == 0) {
                i18 |= rVarH.G(pVar4) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            i19 = i17 & 1024;
            if (i19 != 0) {
                i25 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.G(pVar5)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i16 | i26;
            } else {
                i25 = i16;
            }
            i27 = i17 & 2048;
            if (i27 != 0) {
                i25 |= 48;
            } else if ((i16 & 48) != 0) {
                if (rVarH.G(pVar6)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i25 |= i28;
            }
            i29 = i25;
            i35 = i17 & PKIFailureInfo.certConfirmed;
            if (i35 != 0) {
                i36 = i29 | MLKEMEngine.KyberPolyBytes;
            } else if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(pVar7)) {
                    i37 = 256;
                } else {
                    i37 = 128;
                }
                i36 = i29 | i37;
            } else {
                i36 = i29;
            }
            i38 = i17 & PKIFailureInfo.certRevoked;
            if (i38 != 0) {
                i45 = i36 | 3072;
            } else {
                i39 = i36;
                if ((i16 & 3072) == 0) {
                    i45 = i39 | (rVarH.G(pVar8) ? 2048 : 1024);
                } else {
                    i45 = i39;
                }
            }
            if ((i16 & 24576) != 0) {
                if ((i17 & 16384) == 0 && rVarH.W(y2Var)) {
                    i58 = 16384;
                }
                i45 |= i58;
            }
            if ((i16 & 196608) != 0) {
                if ((i17 & 32768) == 0 || !rVarH.W(hnVar)) {
                    i56 = 65536;
                } else {
                    i56 = 131072;
                }
                i45 |= i56;
            }
            if ((i16 & 1572864) != 0) {
                if ((i17 & PKIFailureInfo.notAuthorized) == 0 || !rVarH.W(d3Var)) {
                    i55 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i55 = PKIFailureInfo.badCertTemplate;
                }
                i45 |= i55;
            }
            i46 = i17 & PKIFailureInfo.unsupportedVersion;
            if (i46 != 0) {
                i45 |= 12582912;
            } else if ((i16 & 12582912) == 0) {
                if (rVarH.G(pVar9)) {
                    i47 = 8388608;
                } else {
                    i47 = 4194304;
                }
                i45 |= i47;
            }
            if ((i16 & 100663296) == 0) {
                if (rVarH.W(this)) {
                    i49 = 67108864;
                } else {
                    i49 = 33554432;
                }
                i45 |= i49;
            }
            if ((i18 & 306783379) == 306783378 || (i45 & 38347923) != 38347922) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (rVarH.r(z25, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i59 != 0) {
                        z19 = false;
                    }
                    if (i65 != 0) {
                        pVar11 = null;
                    }
                    if (i66 != 0) {
                        pVar20 = null;
                    } else {
                        pVar20 = pVar3;
                    }
                    if (i67 != 0) {
                        pVar21 = null;
                    } else {
                        pVar21 = pVar4;
                    }
                    if (i19 != 0) {
                        pVar22 = null;
                    } else {
                        pVar22 = pVar5;
                    }
                    if (i27 != 0) {
                        pVar23 = null;
                    } else {
                        pVar23 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar24 = null;
                    } else {
                        pVar24 = pVar7;
                    }
                    if (i38 != 0) {
                        pVar25 = null;
                    } else {
                        pVar25 = pVar8;
                    }
                    if ((i17 & 16384) != 0) {
                        y2VarX = f57316a.x(rVarH, 6);
                        i45 &= -57345;
                    } else {
                        y2VarX = y2Var;
                    }
                    if ((i17 & 32768) != 0) {
                        hnVarQ = q(rVarH, (i45 >> 24) & 14);
                        i45 &= -458753;
                    } else {
                        hnVarQ = hnVar;
                    }
                    if ((i17 & PKIFailureInfo.notAuthorized) != 0) {
                        if (pVar11 == null) {
                            d3VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i45 &= -3670017;
                    } else {
                        d3VarT = d3Var;
                    }
                    if (i46 != 0) {
                        final hn hnVar4 = hnVarQ;
                        final y2 y2Var4 = y2VarX;
                        final boolean z35 = z18;
                        final j jVar3 = jVar2;
                        final boolean z36 = z19;
                        pVar26 = pVar20;
                        pVarD = y2.m.d(417908150, true, new p() { // from class: f2.mn
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return pn.n(z35, z36, jVar3, hnVar4, y2Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                    } else {
                        pVar26 = pVar20;
                        pVarD = pVar9;
                    }
                    hnVar3 = hnVarQ;
                    y2Var3 = y2VarX;
                    pVar27 = pVar11;
                    z27 = z19;
                    i48 = i45;
                    pVar28 = pVar24;
                    pVar29 = pVar22;
                    pVar30 = pVar25;
                    pVar31 = pVar23;
                    d3Var3 = d3VarT;
                    pVar32 = pVar21;
                } else {
                    rVarH.O();
                    if ((i17 & 16384) != 0) {
                        i45 &= -57345;
                    }
                    if ((i17 & 32768) != 0) {
                        i45 &= -458753;
                    }
                    if ((i17 & PKIFailureInfo.notAuthorized) != 0) {
                        i45 &= -3670017;
                    }
                    pVar26 = pVar3;
                    pVar29 = pVar5;
                    pVar30 = pVar8;
                    y2Var3 = y2Var;
                    hnVar3 = hnVar;
                    d3Var3 = d3Var;
                    pVarD = pVar9;
                    pVar27 = pVar11;
                    z27 = z19;
                    i48 = i45;
                    pVar32 = pVar4;
                    pVar31 = pVar6;
                    pVar28 = pVar7;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1806980801, i18, i48, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:403)");
                }
                if ((i18 & 14) == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | ((57344 & i18) == 16384);
                objE = rVarH.E();
                if (z29 || objE == r.INSTANCE.a()) {
                    objE = e1Var.a(new e(str, null, 2, null));
                    rVarH.v(objE);
                }
                String text = ((TransformedText) objE).getText().getText();
                h3 h3Var = h3.Filled;
                tn.Attached attached = new tn.Attached(false, null, null, 7, null);
                if (pVar27 == null) {
                    rVarH.X(-1353147063);
                    rVarH.R();
                    fVar = null;
                } else {
                    rVarH.X(-1353147062);
                    f fVarD = y2.m.d(1110058497, true, new q() { // from class: f2.nn
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return pn.o(pVar27, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                    fVar = fVarD;
                }
                int i68 = i18 >> 9;
                int i69 = i48 << 21;
                rVar2 = rVarH;
                g3.C(h3Var, text, pVar10, attached, fVar, pVar26, pVar32, pVar29, pVar31, pVar28, pVar30, z16, z15, z27, jVar, d3Var3, hnVar3, pVarD, rVar2, ((i18 << 3) & 896) | 6 | (458752 & i68) | (3670016 & i68) | (i69 & 29360128) | (i69 & 234881024) | (i69 & 1879048192), ((i48 >> 9) & 14) | ((i18 >> 6) & 112) | (i18 & 896) | (i68 & 7168) | (57344 & (i18 >> 3)) | ((i48 >> 3) & 458752) | ((i48 << 3) & 3670016) | (29360128 & i48));
                if (t.k()) {
                    t.n();
                }
                pVar17 = pVar27;
                pVar12 = pVar26;
                pVar13 = pVar32;
                pVar14 = pVar29;
                pVar18 = pVar31;
                pVar15 = pVar28;
                pVar19 = pVar30;
                z26 = z27;
                d3Var2 = d3Var3;
                hnVar2 = hnVar3;
                pVar16 = pVarD;
                y2Var2 = y2Var3;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar12 = pVar3;
                pVar13 = pVar4;
                pVar14 = pVar5;
                pVar15 = pVar7;
                y2Var2 = y2Var;
                hnVar2 = hnVar;
                d3Var2 = d3Var;
                pVar16 = pVar9;
                pVar17 = pVar11;
                z26 = z19;
                pVar18 = pVar6;
                pVar19 = pVar8;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.on
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return pn.p(this.f57164a, str, pVar, z15, z16, e1Var, jVar, z26, pVar17, pVar12, pVar13, pVar14, pVar18, pVar15, pVar19, y2Var2, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 805306368;
        i19 = i17 & 1024;
        if (i19 != 0) {
            i25 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (rVarH.G(pVar5)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i16 | i26;
        } else {
            i25 = i16;
        }
        i27 = i17 & 2048;
        if (i27 != 0) {
            i25 |= 48;
        } else if ((i16 & 48) != 0) {
            if (rVarH.G(pVar6)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i25 |= i28;
        }
        i29 = i25;
        i35 = i17 & PKIFailureInfo.certConfirmed;
        if (i35 != 0) {
            i36 = i29 | MLKEMEngine.KyberPolyBytes;
        } else if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(pVar7)) {
                i37 = 256;
            } else {
                i37 = 128;
            }
            i36 = i29 | i37;
        } else {
            i36 = i29;
        }
        i38 = i17 & PKIFailureInfo.certRevoked;
        if (i38 != 0) {
            i45 = i36 | 3072;
        } else {
            i39 = i36;
            if ((i16 & 3072) == 0) {
                i45 = i39 | (rVarH.G(pVar8) ? 2048 : 1024);
            } else {
                i45 = i39;
            }
        }
        if ((i16 & 24576) != 0) {
            if ((i17 & 16384) == 0) {
                i58 = 16384;
            }
            i45 |= i58;
        }
        if ((i16 & 196608) != 0) {
            if ((i17 & 32768) == 0) {
                i56 = 65536;
            } else {
                i56 = 65536;
            }
            i45 |= i56;
        }
        if ((i16 & 1572864) != 0) {
            if ((i17 & PKIFailureInfo.notAuthorized) == 0) {
                i55 = PKIFailureInfo.signerNotTrusted;
            } else {
                i55 = PKIFailureInfo.signerNotTrusted;
            }
            i45 |= i55;
        }
        i46 = i17 & PKIFailureInfo.unsupportedVersion;
        if (i46 != 0) {
            i45 |= 12582912;
        } else if ((i16 & 12582912) == 0) {
            if (rVarH.G(pVar9)) {
                i47 = 8388608;
            } else {
                i47 = 4194304;
            }
            i45 |= i47;
        }
        if ((i16 & 100663296) == 0) {
            if (rVarH.W(this)) {
                i49 = 67108864;
            } else {
                i49 = 33554432;
            }
            i45 |= i49;
        }
        if ((i18 & 306783379) == 306783378) {
            z25 = true;
        } else {
            z25 = true;
        }
        if (rVarH.r(z25, i18 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i59 != 0) {
                    z19 = false;
                }
                if (i65 != 0) {
                    pVar11 = null;
                }
                if (i66 != 0) {
                    pVar20 = null;
                } else {
                    pVar20 = pVar3;
                }
                if (i67 != 0) {
                    pVar21 = null;
                } else {
                    pVar21 = pVar4;
                }
                if (i19 != 0) {
                    pVar22 = null;
                } else {
                    pVar22 = pVar5;
                }
                if (i27 != 0) {
                    pVar23 = null;
                } else {
                    pVar23 = pVar6;
                }
                if (i35 != 0) {
                    pVar24 = null;
                } else {
                    pVar24 = pVar7;
                }
                if (i38 != 0) {
                    pVar25 = null;
                } else {
                    pVar25 = pVar8;
                }
                if ((i17 & 16384) != 0) {
                    y2VarX = f57316a.x(rVarH, 6);
                    i45 &= -57345;
                } else {
                    y2VarX = y2Var;
                }
                if ((i17 & 32768) != 0) {
                    hnVarQ = q(rVarH, (i45 >> 24) & 14);
                    i45 &= -458753;
                } else {
                    hnVarQ = hnVar;
                }
                if ((i17 & PKIFailureInfo.notAuthorized) != 0) {
                    if (pVar11 == null) {
                        d3VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i45 &= -3670017;
                } else {
                    d3VarT = d3Var;
                }
                if (i46 != 0) {
                    final hn hnVar5 = hnVarQ;
                    final y2 y2Var5 = y2VarX;
                    final boolean z37 = z18;
                    final j jVar4 = jVar2;
                    final boolean z38 = z19;
                    pVar26 = pVar20;
                    pVarD = y2.m.d(417908150, true, new p() { // from class: f2.mn
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return pn.n(z37, z38, jVar4, hnVar5, y2Var5, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    pVar26 = pVar20;
                    pVarD = pVar9;
                }
                hnVar3 = hnVarQ;
                y2Var3 = y2VarX;
                pVar27 = pVar11;
                z27 = z19;
                i48 = i45;
                pVar28 = pVar24;
                pVar29 = pVar22;
                pVar30 = pVar25;
                pVar31 = pVar23;
                d3Var3 = d3VarT;
                pVar32 = pVar21;
            } else {
                if (i59 != 0) {
                    z19 = false;
                }
                if (i65 != 0) {
                    pVar11 = null;
                }
                if (i66 != 0) {
                    pVar20 = null;
                } else {
                    pVar20 = pVar3;
                }
                if (i67 != 0) {
                    pVar21 = null;
                } else {
                    pVar21 = pVar4;
                }
                if (i19 != 0) {
                    pVar22 = null;
                } else {
                    pVar22 = pVar5;
                }
                if (i27 != 0) {
                    pVar23 = null;
                } else {
                    pVar23 = pVar6;
                }
                if (i35 != 0) {
                    pVar24 = null;
                } else {
                    pVar24 = pVar7;
                }
                if (i38 != 0) {
                    pVar25 = null;
                } else {
                    pVar25 = pVar8;
                }
                if ((i17 & 16384) != 0) {
                    y2VarX = f57316a.x(rVarH, 6);
                    i45 &= -57345;
                } else {
                    y2VarX = y2Var;
                }
                if ((i17 & 32768) != 0) {
                    hnVarQ = q(rVarH, (i45 >> 24) & 14);
                    i45 &= -458753;
                } else {
                    hnVarQ = hnVar;
                }
                if ((i17 & PKIFailureInfo.notAuthorized) != 0) {
                    if (pVar11 == null) {
                        d3VarT = v(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i45 &= -3670017;
                } else {
                    d3VarT = d3Var;
                }
                if (i46 != 0) {
                    final hn hnVar6 = hnVarQ;
                    final y2 y2Var6 = y2VarX;
                    final boolean z39 = z18;
                    final j jVar5 = jVar2;
                    final boolean z310 = z19;
                    pVar26 = pVar20;
                    pVarD = y2.m.d(417908150, true, new p() { // from class: f2.mn
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return pn.n(z39, z310, jVar5, hnVar6, y2Var6, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                } else {
                    pVar26 = pVar20;
                    pVarD = pVar9;
                }
                hnVar3 = hnVarQ;
                y2Var3 = y2VarX;
                pVar27 = pVar11;
                z27 = z19;
                i48 = i45;
                pVar28 = pVar24;
                pVar29 = pVar22;
                pVar30 = pVar25;
                pVar31 = pVar23;
                d3Var3 = d3VarT;
                pVar32 = pVar21;
            }
            rVarH.y();
            if (t.k()) {
                t.o(1806980801, i18, i48, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:403)");
            }
            if ((i18 & 14) == 4) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z28 | ((57344 & i18) == 16384);
            objE = rVarH.E();
            if (z29) {
                objE = e1Var.a(new e(str, null, 2, null));
                rVarH.v(objE);
            } else {
                objE = e1Var.a(new e(str, null, 2, null));
                rVarH.v(objE);
            }
            String text2 = ((TransformedText) objE).getText().getText();
            h3 h3Var2 = h3.Filled;
            tn.Attached attached2 = new tn.Attached(false, null, null, 7, null);
            if (pVar27 == null) {
                rVarH.X(-1353147063);
                rVarH.R();
                fVar = null;
            } else {
                rVarH.X(-1353147062);
                f fVarD2 = y2.m.d(1110058497, true, new q() { // from class: f2.nn
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return pn.o(pVar27, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54);
                rVarH.R();
                fVar = fVarD2;
            }
            int i610 = i18 >> 9;
            int i611 = i48 << 21;
            rVar2 = rVarH;
            g3.C(h3Var2, text2, pVar10, attached2, fVar, pVar26, pVar32, pVar29, pVar31, pVar28, pVar30, z16, z15, z27, jVar, d3Var3, hnVar3, pVarD, rVar2, ((i18 << 3) & 896) | 6 | (458752 & i610) | (3670016 & i610) | (i611 & 29360128) | (i611 & 234881024) | (i611 & 1879048192), ((i48 >> 9) & 14) | ((i18 >> 6) & 112) | (i18 & 896) | (i610 & 7168) | (57344 & (i18 >> 3)) | ((i48 >> 3) & 458752) | ((i48 << 3) & 3670016) | (29360128 & i48));
            if (t.k()) {
                t.n();
            }
            pVar17 = pVar27;
            pVar12 = pVar26;
            pVar13 = pVar32;
            pVar14 = pVar29;
            pVar18 = pVar31;
            pVar15 = pVar28;
            pVar19 = pVar30;
            z26 = z27;
            d3Var2 = d3Var3;
            hnVar2 = hnVar3;
            pVar16 = pVarD;
            y2Var2 = y2Var3;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            pVar12 = pVar3;
            pVar13 = pVar4;
            pVar14 = pVar5;
            pVar15 = pVar7;
            y2Var2 = y2Var;
            hnVar2 = hnVar;
            d3Var2 = d3Var;
            pVar16 = pVar9;
            pVar17 = pVar11;
            z26 = z19;
            pVar18 = pVar6;
            pVar19 = pVar8;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.on
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return pn.p(this.f57164a, str, pVar, z15, z16, e1Var, jVar, z26, pVar17, pVar12, pVar13, pVar14, pVar18, pVar15, pVar19, y2Var2, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final hn q(r rVar, int i15) {
        if (t.k()) {
            t.o(831731228, i15, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:480)");
        }
        hn hnVarW = w(d.f9816a.a(rVar, 6), (SelectionColors) rVar.N(z1.g3.c()));
        if (t.k()) {
            t.n();
        }
        return hnVarW;
    }

    public final hn r(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, SelectionColors selectionColors, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, r rVar, int i15, int i16, int i17, int i18, int i19, int i25, int i26) {
        long jH = (i25 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jH2 = (i25 & 2) != 0 ? Color.INSTANCE.h() : j16;
        long jH3 = (i25 & 4) != 0 ? Color.INSTANCE.h() : j17;
        long jH4 = (i25 & 8) != 0 ? Color.INSTANCE.h() : j18;
        long jH5 = (i25 & 16) != 0 ? Color.INSTANCE.h() : j19;
        long jH6 = (i25 & 32) != 0 ? Color.INSTANCE.h() : j25;
        long jH7 = (i25 & 64) != 0 ? Color.INSTANCE.h() : j26;
        long j97 = jH;
        long jH8 = (i25 & 128) != 0 ? Color.INSTANCE.h() : j27;
        long jH9 = (i25 & 256) != 0 ? Color.INSTANCE.h() : j28;
        long jH10 = (i25 & 512) != 0 ? Color.INSTANCE.h() : j29;
        SelectionColors selectionColors2 = (i25 & 1024) != 0 ? null : selectionColors;
        long jH11 = (i25 & 2048) != 0 ? Color.INSTANCE.h() : j35;
        long jH12 = (i25 & PKIFailureInfo.certConfirmed) != 0 ? Color.INSTANCE.h() : j36;
        long jH13 = (i25 & PKIFailureInfo.certRevoked) != 0 ? Color.INSTANCE.h() : j37;
        long jH14 = (i25 & 16384) != 0 ? Color.INSTANCE.h() : j38;
        long jH15 = (32768 & i25) != 0 ? Color.INSTANCE.h() : j39;
        long jH16 = (65536 & i25) != 0 ? Color.INSTANCE.h() : j45;
        long jH17 = (131072 & i25) != 0 ? Color.INSTANCE.h() : j46;
        long jH18 = (262144 & i25) != 0 ? Color.INSTANCE.h() : j47;
        long jH19 = (524288 & i25) != 0 ? Color.INSTANCE.h() : j48;
        long jH20 = (1048576 & i25) != 0 ? Color.INSTANCE.h() : j49;
        long jH21 = (2097152 & i25) != 0 ? Color.INSTANCE.h() : j55;
        long jH22 = (4194304 & i25) != 0 ? Color.INSTANCE.h() : j56;
        long jH23 = (8388608 & i25) != 0 ? Color.INSTANCE.h() : j57;
        long jH24 = (16777216 & i25) != 0 ? Color.INSTANCE.h() : j58;
        long jH25 = (33554432 & i25) != 0 ? Color.INSTANCE.h() : j59;
        long jH26 = (67108864 & i25) != 0 ? Color.INSTANCE.h() : j65;
        long jH27 = (134217728 & i25) != 0 ? Color.INSTANCE.h() : j66;
        long jH28 = (268435456 & i25) != 0 ? Color.INSTANCE.h() : j67;
        long jH29 = (536870912 & i25) != 0 ? Color.INSTANCE.h() : j68;
        long jH30 = (i25 & 1073741824) != 0 ? Color.INSTANCE.h() : j69;
        long jH31 = (i26 & 1) != 0 ? Color.INSTANCE.h() : j75;
        long jH32 = (i26 & 2) != 0 ? Color.INSTANCE.h() : j76;
        long jH33 = (i26 & 4) != 0 ? Color.INSTANCE.h() : j77;
        long jH34 = (i26 & 8) != 0 ? Color.INSTANCE.h() : j78;
        long jH35 = (i26 & 16) != 0 ? Color.INSTANCE.h() : j79;
        long jH36 = (i26 & 32) != 0 ? Color.INSTANCE.h() : j85;
        long jH37 = (i26 & 64) != 0 ? Color.INSTANCE.h() : j86;
        long jH38 = (i26 & 128) != 0 ? Color.INSTANCE.h() : j87;
        long jH39 = (i26 & 256) != 0 ? Color.INSTANCE.h() : j88;
        long jH40 = (i26 & 512) != 0 ? Color.INSTANCE.h() : j89;
        long jH41 = (i26 & 1024) != 0 ? Color.INSTANCE.h() : j95;
        long jH42 = (i26 & 2048) != 0 ? Color.INSTANCE.h() : j96;
        if (t.k()) {
            t.o(1513344955, i15, i16, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:582)");
        }
        hn hnVarC = w(d.f9816a.a(rVar, 6), (SelectionColors) rVar.N(z1.g3.c())).c(j97, jH2, jH3, jH4, jH5, jH6, jH7, jH8, jH9, jH10, selectionColors2, jH11, jH12, jH13, jH14, jH15, jH16, jH17, jH18, jH19, jH20, jH21, jH22, jH23, jH24, jH25, jH26, jH27, jH28, jH29, jH30, jH31, jH32, jH33, jH34, jH35, jH36, jH37, jH38, jH39, jH40, jH41, jH42);
        if (t.k()) {
            t.n();
        }
        return hnVarC;
    }

    public final d3 s(float start, float end, float top, float bottom) {
        return a3.h(start, top, end, bottom);
    }

    public final d3 u(float start, float top, float end, float bottom) {
        return a3.h(start, top, end, bottom);
    }

    public final hn w(ColorScheme colorScheme, SelectionColors selectionColors) {
        hn defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        if (defaultTextFieldColorsCached != null) {
            if (!fr.t.c(defaultTextFieldColorsCached.getTextSelectionColors(), selectionColors)) {
                defaultTextFieldColorsCached = defaultTextFieldColorsCached.c(((-1025) & 1) != 0 ? defaultTextFieldColorsCached.focusedTextColor : 0L, ((-1025) & 2) != 0 ? defaultTextFieldColorsCached.unfocusedTextColor : 0L, ((-1025) & 4) != 0 ? defaultTextFieldColorsCached.disabledTextColor : 0L, ((-1025) & 8) != 0 ? defaultTextFieldColorsCached.errorTextColor : 0L, ((-1025) & 16) != 0 ? defaultTextFieldColorsCached.focusedContainerColor : 0L, ((-1025) & 32) != 0 ? defaultTextFieldColorsCached.unfocusedContainerColor : 0L, ((-1025) & 64) != 0 ? defaultTextFieldColorsCached.disabledContainerColor : 0L, ((-1025) & 128) != 0 ? defaultTextFieldColorsCached.errorContainerColor : 0L, ((-1025) & 256) != 0 ? defaultTextFieldColorsCached.cursorColor : 0L, ((-1025) & 512) != 0 ? defaultTextFieldColorsCached.errorCursorColor : 0L, ((-1025) & 1024) != 0 ? defaultTextFieldColorsCached.textSelectionColors : selectionColors, ((-1025) & 2048) != 0 ? defaultTextFieldColorsCached.focusedIndicatorColor : 0L, ((-1025) & PKIFailureInfo.certConfirmed) != 0 ? defaultTextFieldColorsCached.unfocusedIndicatorColor : 0L, ((-1025) & PKIFailureInfo.certRevoked) != 0 ? defaultTextFieldColorsCached.disabledIndicatorColor : 0L, ((-1025) & 16384) != 0 ? defaultTextFieldColorsCached.errorIndicatorColor : 0L, ((-1025) & 32768) != 0 ? defaultTextFieldColorsCached.focusedLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.notAuthorized) != 0 ? defaultTextFieldColorsCached.unfocusedLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.unsupportedVersion) != 0 ? defaultTextFieldColorsCached.disabledLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.transactionIdInUse) != 0 ? defaultTextFieldColorsCached.errorLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.signerNotTrusted) != 0 ? defaultTextFieldColorsCached.focusedTrailingIconColor : 0L, ((-1025) & PKIFailureInfo.badCertTemplate) != 0 ? defaultTextFieldColorsCached.unfocusedTrailingIconColor : 0L, ((-1025) & PKIFailureInfo.badSenderNonce) != 0 ? defaultTextFieldColorsCached.disabledTrailingIconColor : 0L, ((-1025) & 4194304) != 0 ? defaultTextFieldColorsCached.errorTrailingIconColor : 0L, ((-1025) & 8388608) != 0 ? defaultTextFieldColorsCached.focusedLabelColor : 0L, ((-1025) & 16777216) != 0 ? defaultTextFieldColorsCached.unfocusedLabelColor : 0L, ((-1025) & 33554432) != 0 ? defaultTextFieldColorsCached.disabledLabelColor : 0L, ((-1025) & 67108864) != 0 ? defaultTextFieldColorsCached.errorLabelColor : 0L, ((-1025) & 134217728) != 0 ? defaultTextFieldColorsCached.focusedPlaceholderColor : 0L, ((-1025) & 268435456) != 0 ? defaultTextFieldColorsCached.unfocusedPlaceholderColor : 0L, ((-1025) & PKIFailureInfo.duplicateCertReq) != 0 ? defaultTextFieldColorsCached.disabledPlaceholderColor : 0L, ((-1025) & 1073741824) != 0 ? defaultTextFieldColorsCached.errorPlaceholderColor : 0L, ((-1025) & PKIFailureInfo.systemUnavail) != 0 ? defaultTextFieldColorsCached.focusedSupportingTextColor : 0L, (2047 & 1) != 0 ? defaultTextFieldColorsCached.unfocusedSupportingTextColor : 0L, (2047 & 2) != 0 ? defaultTextFieldColorsCached.disabledSupportingTextColor : 0L, (2047 & 4) != 0 ? defaultTextFieldColorsCached.errorSupportingTextColor : 0L, (2047 & 8) != 0 ? defaultTextFieldColorsCached.focusedPrefixColor : 0L, (2047 & 16) != 0 ? defaultTextFieldColorsCached.unfocusedPrefixColor : 0L, (2047 & 32) != 0 ? defaultTextFieldColorsCached.disabledPrefixColor : 0L, (2047 & 64) != 0 ? defaultTextFieldColorsCached.errorPrefixColor : 0L, (2047 & 128) != 0 ? defaultTextFieldColorsCached.focusedSuffixColor : 0L, (2047 & 256) != 0 ? defaultTextFieldColorsCached.unfocusedSuffixColor : 0L, (2047 & 512) != 0 ? defaultTextFieldColorsCached.disabledSuffixColor : 0L, (2047 & 1024) != 0 ? defaultTextFieldColorsCached.errorSuffixColor : 0L);
                colorScheme.v0(defaultTextFieldColorsCached);
            }
            if (defaultTextFieldColorsCached != null) {
                return defaultTextFieldColorsCached;
            }
        }
        d0 d0Var = d0.f114374a;
        hn hnVar = new hn(g2.h(colorScheme, d0Var.y()), g2.h(colorScheme, d0Var.D()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.g()), d0Var.h(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.s()), g2.h(colorScheme, d0Var.c()), g2.h(colorScheme, d0Var.c()), g2.h(colorScheme, d0Var.c()), g2.h(colorScheme, d0Var.c()), g2.h(colorScheme, d0Var.b()), g2.h(colorScheme, d0Var.r()), selectionColors, g2.h(colorScheme, d0Var.x()), g2.h(colorScheme, d0Var.a()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.e()), d0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.q()), g2.h(colorScheme, d0Var.A()), g2.h(colorScheme, d0Var.I()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.k()), d0Var.l(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.u()), g2.h(colorScheme, d0Var.C()), g2.h(colorScheme, d0Var.K()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.o()), d0Var.p(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.w()), g2.h(colorScheme, d0Var.z()), g2.h(colorScheme, d0Var.H()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.i()), d0Var.j(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.t()), g2.h(colorScheme, d0Var.E()), g2.h(colorScheme, d0Var.E()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.g()), d0Var.h(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.E()), g2.h(colorScheme, d0Var.B()), g2.h(colorScheme, d0Var.J()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.m()), d0Var.n(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.v()), g2.h(colorScheme, d0Var.F()), g2.h(colorScheme, d0Var.F()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.F()), d0Var.h(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.F()), g2.h(colorScheme, d0Var.G()), g2.h(colorScheme, d0Var.G()), Color.m9copywmQWz5c$default(g2.h(colorScheme, d0Var.G()), d0Var.h(), 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, d0Var.G()), null);
        colorScheme.v0(hnVar);
        return hnVar;
    }

    public final y2 x(r rVar, int i15) {
        if (t.k()) {
            t.o(-1941327459, i15, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:68)");
        }
        y2 y2VarH = ui.h(d0.f114374a.d(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }

    public final m y(m mVar, boolean z15, boolean z16, j jVar, hn hnVar, y2 y2Var, float f15, float f16) {
        return mVar.u(new IndicatorLineElement(z15, z16, jVar, hnVar, y2Var, f15, f16, null));
    }

    public final d3 z(float start, float top, float end, float bottom) {
        return a3.h(start, top, end, bottom);
    }
}
