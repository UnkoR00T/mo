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
import l2.k0;
import l2.n0;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014Jñ\u0001\u0010&\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020#2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0007¢\u0006\u0004\b&\u0010'J5\u0010,\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/J¿\u0003\u0010]\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00103\u001a\u0002002\b\b\u0002\u00104\u001a\u0002002\b\b\u0002\u00105\u001a\u0002002\b\b\u0002\u00106\u001a\u0002002\b\b\u0002\u00107\u001a\u0002002\b\b\u0002\u00108\u001a\u0002002\b\b\u0002\u00109\u001a\u0002002\b\b\u0002\u0010:\u001a\u0002002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010=\u001a\u0002002\b\b\u0002\u0010>\u001a\u0002002\b\b\u0002\u0010?\u001a\u0002002\b\b\u0002\u0010@\u001a\u0002002\b\b\u0002\u0010A\u001a\u0002002\b\b\u0002\u0010B\u001a\u0002002\b\b\u0002\u0010C\u001a\u0002002\b\b\u0002\u0010D\u001a\u0002002\b\b\u0002\u0010E\u001a\u0002002\b\b\u0002\u0010F\u001a\u0002002\b\b\u0002\u0010G\u001a\u0002002\b\b\u0002\u0010H\u001a\u0002002\b\b\u0002\u0010I\u001a\u0002002\b\b\u0002\u0010J\u001a\u0002002\b\b\u0002\u0010K\u001a\u0002002\b\b\u0002\u0010L\u001a\u0002002\b\b\u0002\u0010M\u001a\u0002002\b\b\u0002\u0010N\u001a\u0002002\b\b\u0002\u0010O\u001a\u0002002\b\b\u0002\u0010P\u001a\u0002002\b\b\u0002\u0010Q\u001a\u0002002\b\b\u0002\u0010R\u001a\u0002002\b\b\u0002\u0010S\u001a\u0002002\b\b\u0002\u0010T\u001a\u0002002\b\b\u0002\u0010U\u001a\u0002002\b\b\u0002\u0010V\u001a\u0002002\b\b\u0002\u0010W\u001a\u0002002\b\b\u0002\u0010X\u001a\u0002002\b\b\u0002\u0010Y\u001a\u0002002\b\b\u0002\u0010Z\u001a\u0002002\b\b\u0002\u0010[\u001a\u0002002\b\b\u0002\u0010\\\u001a\u000200H\u0007¢\u0006\u0004\b]\u0010^R\u0017\u0010c\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010f\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bd\u0010`\u001a\u0004\be\u0010bR\u0017\u0010i\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bg\u0010`\u001a\u0004\bh\u0010bR\u0017\u0010l\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bj\u0010`\u001a\u0004\bk\u0010bR\u0011\u0010\u000e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0018\u0010r\u001a\u00020\u000b*\u00020o8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lf2/wf;", "", "<init>", "()V", "", "enabled", "isError", "Lb1/j;", "interactionSource", "Lf3/m;", "modifier", "Lf2/hn;", "colors", "Ln3/y2;", "shape", "Lc5/h;", "focusedBorderThickness", "unfocusedBorderThickness", "Loq/i0;", "h", "(ZZLb1/j;Lf3/m;Lf2/hn;Ln3/y2;FFLm2/r;II)V", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "Lv4/e1;", "visualTransformation", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "Ld1/d3;", "contentPadding", "container", "m", "(Ljava/lang/String;Ler/p;ZZLv4/e1;Lb1/j;ZLer/p;Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;Lf2/hn;Ld1/d3;Ler/p;Lm2/r;III)V", "start", "top", "end", "bottom", "s", "(FFFF)Ld1/d3;", "q", "(Lm2/r;I)Lf2/hn;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Lz1/e3;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "r", "(JJJJJJJJJJLz1/e3;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLm2/r;IIIIIII)Lf2/hn;", "b", "F", "v", "()F", "MinHeight", "c", "w", "MinWidth", "d", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "e", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "x", "(Lm2/r;I)Ln3/y2;", "Lf2/e2;", "u", "(Lf2/e2;Lm2/r;I)Lf2/hn;", "defaultOutlinedTextFieldColors", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wf f58214a = new wf();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight = h.n(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = h.n(280);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedBorderThickness = h.n(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness = h.n(2);

    private wf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(y2 y2Var, final hn hnVar, final boolean z15, final boolean z16, float f15, final j0 j0Var, final float f16, u uVar) {
        uVar.h1(y2Var);
        uVar.H0(hnVar.b(z15, z16, false));
        uVar.i1(f15, hnVar.h(z15, z16, false));
        z.b(uVar, new g() { // from class: f2.uf
            @Override // m1.g
            public final void a(u uVar2) {
                wf.j(j0Var, hnVar, z15, z16, f16, uVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(j0 j0Var, final hn hnVar, final boolean z15, final boolean z16, final float f15, u uVar) {
        uVar.I1(j0Var, new g() { // from class: f2.vf
            @Override // m1.g
            public final void a(u uVar2) {
                wf.k(hnVar, z15, z16, f15, uVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(hn hnVar, boolean z15, boolean z16, float f15, u uVar) {
        uVar.H0(hnVar.b(z15, z16, true));
        uVar.i1(f15, hnVar.h(z15, z16, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(wf wfVar, boolean z15, boolean z16, j jVar, m mVar, hn hnVar, y2 y2Var, float f15, float f16, int i15, int i16, r rVar, int i17) {
        wfVar.h(z15, z16, jVar, mVar, hnVar, y2Var, f15, f16, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(boolean z15, boolean z16, j jVar, hn hnVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-896270173, i15, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1130)");
            }
            wf wfVar = f58214a;
            wfVar.h(z15, z16, jVar, m.INSTANCE, hnVar, wfVar.x(rVar, 6), FocusedBorderThickness, UnfocusedBorderThickness, rVar, 114822144, 0);
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
                t.o(-1459717586, i15, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:1155)");
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
    public static final i0 p(wf wfVar, String str, p pVar, boolean z15, boolean z16, e1 e1Var, j jVar, boolean z17, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, p pVar8, hn hnVar, d3 d3Var, p pVar9, int i15, int i16, int i17, r rVar, int i18) {
        wfVar.m(str, pVar, z15, z16, e1Var, jVar, z17, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, hnVar, d3Var, pVar9, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return i0.f148189a;
    }

    public static /* synthetic */ d3 t(wf wfVar, float f15, float f16, float f17, float f18, int i15, Object obj) {
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
        return wfVar.s(f15, f16, f17, f18);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013a A[PHI: r5 r12 r13 r14 r23
      0x013a: PHI (r5v9 n3.y2) = (r5v4 n3.y2), (r5v1 n3.y2), (r5v1 n3.y2) binds: [B:123:0x0173, B:106:0x0133, B:107:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r12v33 f3.m) = (r12v4 f3.m), (r12v2 f3.m), (r12v2 f3.m) binds: [B:123:0x0173, B:106:0x0133, B:107:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r13v11 f2.hn) = (r13v7 f2.hn), (r13v6 f2.hn), (r13v6 f2.hn) binds: [B:123:0x0173, B:106:0x0133, B:107:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r14v6 float) = (r14v2 float), (r14v1 float), (r14v1 float) binds: [B:123:0x0173, B:106:0x0133, B:107:0x0135] A[DONT_GENERATE, DONT_INLINE]
      0x013a: PHI (r23v4 int) = (r23v1 int), (r23v7 int), (r23v8 int) binds: [B:123:0x0173, B:106:0x0133, B:107:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0175  */
    /* JADX WARN: Code duplicated, block: B:127:0x018b  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:131:0x019d  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:159:0x0205  */
    /* JADX WARN: Code duplicated, block: B:160:0x0208  */
    /* JADX WARN: Code duplicated, block: B:163:0x0216  */
    /* JADX WARN: Code duplicated, block: B:165:0x021c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0236  */
    /* JADX WARN: Code duplicated, block: B:173:0x023c  */
    /* JADX WARN: Code duplicated, block: B:179:0x024b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0259  */
    /* JADX WARN: Code duplicated, block: B:186:0x027a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0285  */
    /* JADX WARN: Code duplicated, block: B:191:0x0293  */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
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
        int i17;
        boolean z17;
        m mVar2;
        hn hnVarQ;
        y2 y2VarX;
        float f17;
        float f18;
        int i18;
        boolean z18;
        boolean z19;
        final float f19;
        final hn hnVar2;
        final float f25;
        final y2 y2Var2;
        final m mVar3;
        d5 d5VarM;
        int i19;
        final y2 y2Var3;
        float f26;
        final hn hnVar3;
        int i25;
        boolean z25;
        Object objE;
        final j0 j0VarB;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objE2;
        final float f27;
        final float f28;
        int i26;
        int i27;
        int i28;
        int i29;
        r rVarH = rVar.h(1035477640);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            z17 = z16;
            i17 |= rVarH.a(z17) ? 32 : 16;
        } else {
            z17 = z16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(jVar) ? 256 : 128;
        }
        int i35 = i16 & 8;
        if (i35 == 0) {
            if ((i15 & 3072) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    hnVarQ = hnVar;
                    if (rVarH.W(hnVarQ)) {
                        i29 = 16384;
                    }
                    i17 |= i29;
                } else {
                    hnVarQ = hnVar;
                }
                i29 = PKIFailureInfo.certRevoked;
                i17 |= i29;
            } else {
                hnVarQ = hnVar;
            }
            if ((i15 & 196608) == 0) {
                y2VarX = y2Var;
                if ((i16 & 32) == 0 || !rVarH.W(y2VarX)) {
                    i28 = PKIFailureInfo.notAuthorized;
                } else {
                    i28 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i28;
            } else {
                y2VarX = y2Var;
            }
            if ((i15 & 1572864) == 0) {
                f17 = f15;
                if ((i16 & 64) == 0 || !rVarH.b(f17)) {
                    i27 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i27 = PKIFailureInfo.badCertTemplate;
                }
                i17 |= i27;
            } else {
                f17 = f15;
            }
            if ((i15 & 12582912) == 0) {
                if ((i16 & 128) == 0) {
                    f18 = f16;
                    int i36 = rVarH.b(f18) ? 8388608 : 4194304;
                    i17 |= i36;
                } else {
                    f18 = f16;
                }
                i17 |= i36;
            } else {
                f18 = f16;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(this)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i17 |= i26;
            }
            i18 = i17;
            z18 = true;
            if ((i17 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i35 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 16) != 0) {
                        i19 = i18 & (-57345);
                        hnVarQ = q(rVarH, (i18 >> 24) & 14);
                    } else {
                        i19 = i18;
                    }
                    if ((i16 & 32) != 0) {
                        i19 &= -458753;
                        y2VarX = f58214a.x(rVarH, 6);
                    }
                    if ((i16 & 64) != 0) {
                        i19 &= -3670017;
                        f17 = FocusedBorderThickness;
                    }
                    i18 = i19;
                    if ((i16 & 128) != 0) {
                        i18 &= -29360129;
                        hn hnVar4 = hnVarQ;
                        y2Var3 = y2VarX;
                        f26 = f17;
                        hnVar3 = hnVar4;
                        f18 = UnfocusedBorderThickness;
                    }
                    m mVar4 = mVar2;
                    i25 = i18;
                    rVarH.y();
                    if (t.k()) {
                        t.o(1035477640, i25, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1030)");
                    }
                    if ((i25 & 896) == 256) {
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
                    boolean z29 = ((((458752 & i25) ^ 196608) <= 131072 && rVarH.W(y2Var3)) || (i25 & 196608) == 131072) | ((((57344 & i25) ^ 24576) <= 16384 && rVarH.W(hnVar3)) || (i25 & 24576) == 16384);
                    if ((i25 & 14) == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z35 = z29 | z26;
                    if ((i25 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zG = z35 | z27 | ((((29360128 & i25) ^ 12582912) <= 8388608 && rVarH.b(f18)) || (i25 & 12582912) == 8388608) | rVarH.G(j0VarB);
                    if ((((3670016 & i25) ^ 1572864) > 1048576 || !rVarH.b(f26)) && (i25 & 1572864) != 1048576) {
                    }
                    z28 = zG | z18;
                    objE2 = rVarH.E();
                    if (!z28 || objE2 == r.INSTANCE.a()) {
                        f27 = f26;
                        final boolean z36 = z17;
                        f28 = f18;
                        Object obj = new g() { // from class: f2.pf
                            @Override // m1.g
                            public final void a(u uVar) {
                                wf.i(y2Var3, hnVar3, z15, z36, f28, j0VarB, f27, uVar);
                            }
                        };
                        rVarH.v(obj);
                        objE2 = obj;
                    } else {
                        f27 = f26;
                        f28 = f18;
                    }
                    d1.r.b(m1.m.b(mVar4, cVar, (g) objE2), rVarH, 0);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar4;
                    y2Var2 = y2Var3;
                    hnVar2 = hnVar3;
                    f19 = f28;
                    f25 = f27;
                } else {
                    rVarH.O();
                    if ((i16 & 16) != 0) {
                        i18 &= -57345;
                    }
                    if ((i16 & 32) != 0) {
                        i18 &= -458753;
                    }
                    if ((i16 & 64) != 0) {
                        i18 &= -3670017;
                    }
                    if ((i16 & 128) != 0) {
                        i18 &= -29360129;
                    }
                }
                hn hnVar5 = hnVarQ;
                y2Var3 = y2VarX;
                f26 = f17;
                hnVar3 = hnVar5;
                m mVar5 = mVar2;
                i25 = i18;
                rVarH.y();
                if (t.k()) {
                    t.o(1035477640, i25, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1030)");
                }
                if ((i25 & 896) == 256) {
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
                boolean z210 = ((((458752 & i25) ^ 196608) <= 131072 && rVarH.W(y2Var3)) || (i25 & 196608) == 131072) | ((((57344 & i25) ^ 24576) <= 16384 && rVarH.W(hnVar3)) || (i25 & 24576) == 16384);
                if ((i25 & 14) == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z37 = z210 | z26;
                if ((i25 & 112) == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zG2 = z37 | z27 | ((((29360128 & i25) ^ 12582912) <= 8388608 && rVarH.b(f18)) || (i25 & 12582912) == 8388608) | rVarH.G(j0VarB);
                z18 = ((3670016 & i25) ^ 1572864) > 1048576 ? false : false;
                z28 = zG2 | z18;
                objE2 = rVarH.E();
                if (z28) {
                    f27 = f26;
                    final boolean z38 = z17;
                    f28 = f18;
                    Object obj2 = new g() { // from class: f2.pf
                        @Override // m1.g
                        public final void a(u uVar) {
                            wf.i(y2Var3, hnVar3, z15, z38, f28, j0VarB, f27, uVar);
                        }
                    };
                    rVarH.v(obj2);
                    objE2 = obj2;
                } else {
                    f27 = f26;
                    final boolean z39 = z17;
                    f28 = f18;
                    Object obj3 = new g() { // from class: f2.pf
                        @Override // m1.g
                        public final void a(u uVar) {
                            wf.i(y2Var3, hnVar3, z15, z39, f28, j0VarB, f27, uVar);
                        }
                    };
                    rVarH.v(obj3);
                    objE2 = obj3;
                }
                d1.r.b(m1.m.b(mVar5, cVar2, (g) objE2), rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                y2Var2 = y2Var3;
                hnVar2 = hnVar3;
                f19 = f28;
                f25 = f27;
            } else {
                rVarH.O();
                f19 = f18;
                hnVar2 = hnVarQ;
                f25 = f17;
                y2Var2 = y2VarX;
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.qf
                    @Override // er.p
                    public final Object B(Object obj4, Object obj5) {
                        return wf.l(this.f57408a, z15, z16, jVar, mVar3, hnVar2, y2Var2, f25, f19, i15, i16, (r) obj4, ((Integer) obj5).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        mVar2 = mVar;
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                hnVarQ = hnVar;
                if (rVarH.W(hnVarQ)) {
                    i29 = 16384;
                }
                i17 |= i29;
            } else {
                hnVarQ = hnVar;
            }
            i29 = PKIFailureInfo.certRevoked;
            i17 |= i29;
        } else {
            hnVarQ = hnVar;
        }
        if ((i15 & 196608) == 0) {
            y2VarX = y2Var;
            if ((i16 & 32) == 0) {
                i28 = PKIFailureInfo.notAuthorized;
            } else {
                i28 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i28;
        } else {
            y2VarX = y2Var;
        }
        if ((i15 & 1572864) == 0) {
            f17 = f15;
            if ((i16 & 64) == 0) {
                i27 = PKIFailureInfo.signerNotTrusted;
            } else {
                i27 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i27;
        } else {
            f17 = f15;
        }
        if ((i15 & 12582912) == 0) {
            if ((i16 & 128) == 0) {
                f18 = f16;
                if (rVarH.b(f18)) {
                }
                i17 |= i36;
            } else {
                f18 = f16;
            }
            i17 |= i36;
        } else {
            f18 = f16;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.W(this)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i17 |= i26;
        }
        i18 = i17;
        z18 = true;
        if ((i17 & 38347923) != 38347922) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (rVarH.r(z19, i18 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i35 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 16) != 0) {
                    i19 = i18 & (-57345);
                    hnVarQ = q(rVarH, (i18 >> 24) & 14);
                } else {
                    i19 = i18;
                }
                if ((i16 & 32) != 0) {
                    i19 &= -458753;
                    y2VarX = f58214a.x(rVarH, 6);
                }
                if ((i16 & 64) != 0) {
                    i19 &= -3670017;
                    f17 = FocusedBorderThickness;
                }
                i18 = i19;
                if ((i16 & 128) != 0) {
                    i18 &= -29360129;
                    hn hnVar6 = hnVarQ;
                    y2Var3 = y2VarX;
                    f26 = f17;
                    hnVar3 = hnVar6;
                    f18 = UnfocusedBorderThickness;
                } else {
                    hn hnVar7 = hnVarQ;
                    y2Var3 = y2VarX;
                    f26 = f17;
                    hnVar3 = hnVar7;
                }
            } else {
                if (i35 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 16) != 0) {
                    i19 = i18 & (-57345);
                    hnVarQ = q(rVarH, (i18 >> 24) & 14);
                } else {
                    i19 = i18;
                }
                if ((i16 & 32) != 0) {
                    i19 &= -458753;
                    y2VarX = f58214a.x(rVarH, 6);
                }
                if ((i16 & 64) != 0) {
                    i19 &= -3670017;
                    f17 = FocusedBorderThickness;
                }
                i18 = i19;
                if ((i16 & 128) != 0) {
                    i18 &= -29360129;
                    hn hnVar8 = hnVarQ;
                    y2Var3 = y2VarX;
                    f26 = f17;
                    hnVar3 = hnVar8;
                    f18 = UnfocusedBorderThickness;
                } else {
                    hn hnVar9 = hnVarQ;
                    y2Var3 = y2VarX;
                    f26 = f17;
                    hnVar3 = hnVar9;
                }
            }
            m mVar6 = mVar2;
            i25 = i18;
            rVarH.y();
            if (t.k()) {
                t.o(1035477640, i25, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1030)");
            }
            if ((i25 & 896) == 256) {
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
            boolean z211 = ((((458752 & i25) ^ 196608) <= 131072 && rVarH.W(y2Var3)) || (i25 & 196608) == 131072) | ((((57344 & i25) ^ 24576) <= 16384 && rVarH.W(hnVar3)) || (i25 & 24576) == 16384);
            if ((i25 & 14) == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z310 = z211 | z26;
            if ((i25 & 112) == 32) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zG3 = z310 | z27 | ((((29360128 & i25) ^ 12582912) <= 8388608 && rVarH.b(f18)) || (i25 & 12582912) == 8388608) | rVarH.G(j0VarB);
            if (((3670016 & i25) ^ 1572864) > 1048576) {
            }
            z28 = zG3 | z18;
            objE2 = rVarH.E();
            if (z28) {
                f27 = f26;
                final boolean z311 = z17;
                f28 = f18;
                Object obj4 = new g() { // from class: f2.pf
                    @Override // m1.g
                    public final void a(u uVar) {
                        wf.i(y2Var3, hnVar3, z15, z311, f28, j0VarB, f27, uVar);
                    }
                };
                rVarH.v(obj4);
                objE2 = obj4;
            } else {
                f27 = f26;
                final boolean z312 = z17;
                f28 = f18;
                Object obj5 = new g() { // from class: f2.pf
                    @Override // m1.g
                    public final void a(u uVar) {
                        wf.i(y2Var3, hnVar3, z15, z312, f28, j0VarB, f27, uVar);
                    }
                };
                rVarH.v(obj5);
                objE2 = obj5;
            }
            d1.r.b(m1.m.b(mVar6, cVar3, (g) objE2), rVarH, 0);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar6;
            y2Var2 = y2Var3;
            hnVar2 = hnVar3;
            f19 = f28;
            f25 = f27;
        } else {
            rVarH.O();
            f19 = f18;
            hnVar2 = hnVarQ;
            f25 = f17;
            y2Var2 = y2VarX;
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.qf
                @Override // er.p
                public final Object B(Object obj6, Object obj7) {
                    return wf.l(this.f57408a, z15, z16, jVar, mVar3, hnVar2, y2Var2, f25, f19, i15, i16, (r) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x0151  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0174  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x019a  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:168:0x0202  */
    /* JADX WARN: Code duplicated, block: B:172:0x0214  */
    /* JADX WARN: Code duplicated, block: B:176:0x0222  */
    /* JADX WARN: Code duplicated, block: B:179:0x022b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:191:0x026b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x026d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0271  */
    /* JADX WARN: Code duplicated, block: B:195:0x0273  */
    /* JADX WARN: Code duplicated, block: B:197:0x0277  */
    /* JADX WARN: Code duplicated, block: B:198:0x0279  */
    /* JADX WARN: Code duplicated, block: B:200:0x027d  */
    /* JADX WARN: Code duplicated, block: B:201:0x027f  */
    /* JADX WARN: Code duplicated, block: B:203:0x0283  */
    /* JADX WARN: Code duplicated, block: B:204:0x0286  */
    /* JADX WARN: Code duplicated, block: B:206:0x028a  */
    /* JADX WARN: Code duplicated, block: B:207:0x028d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0291  */
    /* JADX WARN: Code duplicated, block: B:210:0x0294  */
    /* JADX WARN: Code duplicated, block: B:212:0x0298  */
    /* JADX WARN: Code duplicated, block: B:213:0x029b  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:217:0x02af  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:221:0x02db  */
    /* JADX WARN: Code duplicated, block: B:223:0x02df  */
    /* JADX WARN: Code duplicated, block: B:225:0x030a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0327  */
    /* JADX WARN: Code duplicated, block: B:231:0x0334  */
    /* JADX WARN: Code duplicated, block: B:232:0x0336  */
    /* JADX WARN: Code duplicated, block: B:235:0x0341  */
    /* JADX WARN: Code duplicated, block: B:236:0x0343  */
    /* JADX WARN: Code duplicated, block: B:239:0x034b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0356  */
    /* JADX WARN: Code duplicated, block: B:246:0x038d  */
    /* JADX WARN: Code duplicated, block: B:247:0x039a  */
    /* JADX WARN: Code duplicated, block: B:250:0x041d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0431  */
    /* JADX WARN: Code duplicated, block: B:255:0x0451  */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    public final void m(final String str, final p<? super r, ? super Integer, i0> pVar, final boolean z15, final boolean z16, final e1 e1Var, final j jVar, boolean z17, p<? super r, ? super Integer, i0> pVar2, p<? super r, ? super Integer, i0> pVar3, p<? super r, ? super Integer, i0> pVar4, p<? super r, ? super Integer, i0> pVar5, p<? super r, ? super Integer, i0> pVar6, p<? super r, ? super Integer, i0> pVar7, p<? super r, ? super Integer, i0> pVar8, hn hnVar, d3 d3Var, p<? super r, ? super Integer, i0> pVar9, r rVar, final int i15, final int i16, final int i17) {
        int i18;
        final boolean z18;
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
        boolean z19;
        r rVar2;
        final p<? super r, ? super Integer, i0> pVar10;
        final p<? super r, ? super Integer, i0> pVar11;
        final p<? super r, ? super Integer, i0> pVar12;
        final p<? super r, ? super Integer, i0> pVar13;
        final p<? super r, ? super Integer, i0> pVar14;
        final p<? super r, ? super Integer, i0> pVar15;
        final hn hnVar2;
        final d3 d3Var2;
        final p<? super r, ? super Integer, i0> pVar16;
        final boolean z25;
        final p<? super r, ? super Integer, i0> pVar17;
        d5 d5VarM;
        p<? super r, ? super Integer, i0> pVar18;
        p<? super r, ? super Integer, i0> pVar19;
        p<? super r, ? super Integer, i0> pVar20;
        p<? super r, ? super Integer, i0> pVar21;
        p<? super r, ? super Integer, i0> pVar22;
        p<? super r, ? super Integer, i0> pVar23;
        p<? super r, ? super Integer, i0> pVar24;
        final hn hnVarQ;
        d3 d3VarT;
        final p<? super r, ? super Integer, i0> pVar25;
        p<? super r, ? super Integer, i0> pVarD;
        boolean z26;
        hn hnVar3;
        p<? super r, ? super Integer, i0> pVar26;
        d3 d3Var3;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objE;
        f fVarD;
        int i48;
        int i49;
        r rVarH = rVar.h(-1732281618);
        if ((i15 & 6) == 0) {
            i18 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= rVarH.a(z16) ? 2048 : 1024;
        }
        int i55 = i15 & 24576;
        int i56 = PKIFailureInfo.certRevoked;
        if (i55 == 0) {
            i18 |= rVarH.W(e1Var) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i18 |= rVarH.W(jVar) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i57 = i17 & 64;
        if (i57 != 0) {
            i18 |= 1572864;
            z18 = z17;
        } else {
            z18 = z17;
            if ((i15 & 1572864) == 0) {
                i18 |= rVarH.a(z18) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
        }
        int i58 = i17 & 128;
        if (i58 != 0) {
            i18 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            i18 |= rVarH.G(pVar2) ? 8388608 : 4194304;
        }
        int i59 = i17 & 256;
        if (i59 == 0) {
            if ((i15 & 100663296) == 0) {
                i18 |= rVarH.G(pVar3) ? 67108864 : 33554432;
            }
            i19 = i17 & 512;
            if (i19 != 0) {
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar4)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i18 |= i25;
                }
                i26 = i17 & 1024;
                if (i26 != 0) {
                    i27 = i16 | 6;
                } else if ((i16 & 6) == 0) {
                    if (rVarH.G(pVar5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i16 | i28;
                } else {
                    i27 = i16;
                }
                i29 = i17 & 2048;
                if (i29 != 0) {
                    i27 |= 48;
                } else if ((i16 & 48) != 0) {
                    if (rVarH.G(pVar6)) {
                        i35 = 32;
                    } else {
                        i35 = 16;
                    }
                    i27 |= i35;
                }
                i36 = i27;
                i37 = i17 & PKIFailureInfo.certConfirmed;
                if (i37 != 0) {
                    i38 = i36 | MLKEMEngine.KyberPolyBytes;
                } else if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i38 = i36 | (rVarH.G(pVar7) ? 256 : 128);
                } else {
                    i38 = i36;
                }
                i39 = i17 & PKIFailureInfo.certRevoked;
                if (i39 != 0) {
                    i45 = i38;
                    if ((i16 & 3072) == 0) {
                        i45 |= rVarH.G(pVar8) ? 2048 : 1024;
                    }
                    if ((i16 & 24576) != 0) {
                        if ((i17 & 16384) == 0 && rVarH.W(hnVar)) {
                            i56 = 16384;
                        }
                        i45 |= i56;
                    }
                    if ((i16 & 196608) != 0) {
                        if ((i17 & 32768) == 0 || !rVarH.W(d3Var)) {
                            i49 = 65536;
                        } else {
                            i49 = PKIFailureInfo.unsupportedVersion;
                        }
                        i45 |= i49;
                    }
                    i46 = i17 & PKIFailureInfo.notAuthorized;
                    if (i46 != 0) {
                        i45 |= 1572864;
                    } else if ((i16 & 1572864) == 0) {
                        if (rVarH.G(pVar9)) {
                            i47 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i47 = PKIFailureInfo.signerNotTrusted;
                        }
                        i45 |= i47;
                    }
                    if ((i16 & 12582912) == 0) {
                        if (rVarH.W(this)) {
                            i48 = 8388608;
                        } else {
                            i48 = 4194304;
                        }
                        i45 |= i48;
                    }
                    if ((i18 & 306783379) == 306783378 || (i45 & 4793491) != 4793490) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (rVarH.r(z19, i18 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i57 != 0) {
                                z18 = false;
                            }
                            if (i58 != 0) {
                                pVar18 = null;
                            } else {
                                pVar18 = pVar2;
                            }
                            if (i59 != 0) {
                                pVar19 = null;
                            } else {
                                pVar19 = pVar3;
                            }
                            if (i19 != 0) {
                                pVar20 = null;
                            } else {
                                pVar20 = pVar4;
                            }
                            if (i26 != 0) {
                                pVar21 = null;
                            } else {
                                pVar21 = pVar5;
                            }
                            if (i29 != 0) {
                                pVar22 = null;
                            } else {
                                pVar22 = pVar6;
                            }
                            if (i37 != 0) {
                                pVar23 = null;
                            } else {
                                pVar23 = pVar7;
                            }
                            if (i39 != 0) {
                                pVar24 = null;
                            } else {
                                pVar24 = pVar8;
                            }
                            if ((i17 & 16384) != 0) {
                                hnVarQ = q(rVarH, (i45 >> 21) & 14);
                                i45 &= -57345;
                            } else {
                                hnVarQ = hnVar;
                            }
                            if ((i17 & 32768) != 0) {
                                d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i45 &= -458753;
                            } else {
                                d3VarT = d3Var;
                            }
                            if (i46 != 0) {
                                pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                pVar25 = pVar18;
                            } else {
                                pVar25 = pVar18;
                                pVarD = pVar9;
                            }
                            z26 = z18;
                            hnVar3 = hnVarQ;
                            pVar26 = pVar21;
                            d3Var3 = d3VarT;
                        } else {
                            rVarH.O();
                            if ((i17 & 16384) != 0) {
                                i45 &= -57345;
                            }
                            if ((i17 & 32768) != 0) {
                                i45 &= -458753;
                            }
                            pVar25 = pVar2;
                            pVar19 = pVar3;
                            pVar20 = pVar4;
                            pVar22 = pVar6;
                            pVar23 = pVar7;
                            pVar24 = pVar8;
                            d3Var3 = d3Var;
                            pVarD = pVar9;
                            z26 = z18;
                            i45 = i45;
                            pVar26 = pVar5;
                            hnVar3 = hnVar;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                        }
                        if ((i18 & 14) == 4) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        int i65 = i45;
                        if ((57344 & i18) == 16384) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z28 | z27;
                        objE = rVarH.E();
                        if (z29 || objE == r.INSTANCE.a()) {
                            objE = e1Var.a(new e(str, null, 2, null));
                            rVarH.v(objE);
                        }
                        String text = ((TransformedText) objE).getText().getText();
                        h3 h3Var = h3.Outlined;
                        tn.Attached attached = new tn.Attached(false, null, null, 7, null);
                        if (pVar25 == null) {
                            rVarH.X(1927042940);
                            rVarH.R();
                            fVarD = null;
                        } else {
                            rVarH.X(1927042941);
                            fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        }
                        int i66 = i18 >> 9;
                        int i67 = i65 << 21;
                        int i68 = ((i18 << 3) & 896) | 6 | (458752 & i66) | (3670016 & i66) | (i67 & 29360128) | (i67 & 234881024) | (i67 & 1879048192);
                        int i69 = (i18 & 896) | ((i65 >> 9) & 14) | ((i18 >> 6) & 112) | (i66 & 7168) | (57344 & (i18 >> 3)) | (i65 & 458752) | ((i65 << 6) & 3670016) | (29360128 & (i65 << 3));
                        rVar2 = rVarH;
                        p<? super r, ? super Integer, i0> pVar27 = pVar19;
                        p<? super r, ? super Integer, i0> pVar28 = pVar20;
                        p<? super r, ? super Integer, i0> pVar29 = pVar22;
                        g3.C(h3Var, text, pVar, attached, fVarD, pVar27, pVar28, pVar26, pVar29, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i68, i69);
                        if (t.k()) {
                            t.n();
                        }
                        pVar14 = pVar23;
                        pVar15 = pVar24;
                        d3Var2 = d3Var3;
                        pVar16 = pVarD;
                        pVar12 = pVar26;
                        pVar13 = pVar29;
                        pVar17 = pVar27;
                        pVar11 = pVar28;
                        z25 = z26;
                        hnVar2 = hnVar3;
                        pVar10 = pVar25;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        pVar10 = pVar2;
                        pVar11 = pVar4;
                        pVar12 = pVar5;
                        pVar13 = pVar6;
                        pVar14 = pVar7;
                        pVar15 = pVar8;
                        hnVar2 = hnVar;
                        d3Var2 = d3Var;
                        pVar16 = pVar9;
                        z25 = z18;
                        pVar17 = pVar3;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.tf
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i45 = i38 | 3072;
                if ((i16 & 24576) != 0) {
                    if ((i17 & 16384) == 0) {
                        i56 = 16384;
                    }
                    i45 |= i56;
                }
                if ((i16 & 196608) != 0) {
                    if ((i17 & 32768) == 0) {
                        i49 = 65536;
                    } else {
                        i49 = 65536;
                    }
                    i45 |= i49;
                }
                i46 = i17 & PKIFailureInfo.notAuthorized;
                if (i46 != 0) {
                    i45 |= 1572864;
                } else if ((i16 & 1572864) == 0) {
                    if (rVarH.G(pVar9)) {
                        i47 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i47 = PKIFailureInfo.signerNotTrusted;
                    }
                    i45 |= i47;
                }
                if ((i16 & 12582912) == 0) {
                    if (rVarH.W(this)) {
                        i48 = 8388608;
                    } else {
                        i48 = 4194304;
                    }
                    i45 |= i48;
                }
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i57 != 0) {
                            z18 = false;
                        }
                        if (i58 != 0) {
                            pVar18 = null;
                        } else {
                            pVar18 = pVar2;
                        }
                        if (i59 != 0) {
                            pVar19 = null;
                        } else {
                            pVar19 = pVar3;
                        }
                        if (i19 != 0) {
                            pVar20 = null;
                        } else {
                            pVar20 = pVar4;
                        }
                        if (i26 != 0) {
                            pVar21 = null;
                        } else {
                            pVar21 = pVar5;
                        }
                        if (i29 != 0) {
                            pVar22 = null;
                        } else {
                            pVar22 = pVar6;
                        }
                        if (i37 != 0) {
                            pVar23 = null;
                        } else {
                            pVar23 = pVar7;
                        }
                        if (i39 != 0) {
                            pVar24 = null;
                        } else {
                            pVar24 = pVar8;
                        }
                        if ((i17 & 16384) != 0) {
                            hnVarQ = q(rVarH, (i45 >> 21) & 14);
                            i45 &= -57345;
                        } else {
                            hnVarQ = hnVar;
                        }
                        if ((i17 & 32768) != 0) {
                            d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i45 &= -458753;
                        } else {
                            d3VarT = d3Var;
                        }
                        if (i46 != 0) {
                            pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            pVar25 = pVar18;
                        } else {
                            pVar25 = pVar18;
                            pVarD = pVar9;
                        }
                        z26 = z18;
                        hnVar3 = hnVarQ;
                        pVar26 = pVar21;
                        d3Var3 = d3VarT;
                    } else {
                        if (i57 != 0) {
                            z18 = false;
                        }
                        if (i58 != 0) {
                            pVar18 = null;
                        } else {
                            pVar18 = pVar2;
                        }
                        if (i59 != 0) {
                            pVar19 = null;
                        } else {
                            pVar19 = pVar3;
                        }
                        if (i19 != 0) {
                            pVar20 = null;
                        } else {
                            pVar20 = pVar4;
                        }
                        if (i26 != 0) {
                            pVar21 = null;
                        } else {
                            pVar21 = pVar5;
                        }
                        if (i29 != 0) {
                            pVar22 = null;
                        } else {
                            pVar22 = pVar6;
                        }
                        if (i37 != 0) {
                            pVar23 = null;
                        } else {
                            pVar23 = pVar7;
                        }
                        if (i39 != 0) {
                            pVar24 = null;
                        } else {
                            pVar24 = pVar8;
                        }
                        if ((i17 & 16384) != 0) {
                            hnVarQ = q(rVarH, (i45 >> 21) & 14);
                            i45 &= -57345;
                        } else {
                            hnVarQ = hnVar;
                        }
                        if ((i17 & 32768) != 0) {
                            d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i45 &= -458753;
                        } else {
                            d3VarT = d3Var;
                        }
                        if (i46 != 0) {
                            pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            pVar25 = pVar18;
                        } else {
                            pVar25 = pVar18;
                            pVarD = pVar9;
                        }
                        z26 = z18;
                        hnVar3 = hnVarQ;
                        pVar26 = pVar21;
                        d3Var3 = d3VarT;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                    }
                    if ((i18 & 14) == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    int i610 = i45;
                    if ((57344 & i18) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z27;
                    objE = rVarH.E();
                    if (z29) {
                        objE = e1Var.a(new e(str, null, 2, null));
                        rVarH.v(objE);
                    } else {
                        objE = e1Var.a(new e(str, null, 2, null));
                        rVarH.v(objE);
                    }
                    String text2 = ((TransformedText) objE).getText().getText();
                    h3 h3Var2 = h3.Outlined;
                    tn.Attached attached2 = new tn.Attached(false, null, null, 7, null);
                    if (pVar25 == null) {
                        rVarH.X(1927042940);
                        rVarH.R();
                        fVarD = null;
                    } else {
                        rVarH.X(1927042941);
                        fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i611 = i18 >> 9;
                    int i612 = i610 << 21;
                    int i613 = ((i18 << 3) & 896) | 6 | (458752 & i611) | (3670016 & i611) | (i612 & 29360128) | (i612 & 234881024) | (i612 & 1879048192);
                    int i614 = (i18 & 896) | ((i610 >> 9) & 14) | ((i18 >> 6) & 112) | (i611 & 7168) | (57344 & (i18 >> 3)) | (i610 & 458752) | ((i610 << 6) & 3670016) | (29360128 & (i610 << 3));
                    rVar2 = rVarH;
                    p<? super r, ? super Integer, i0> pVar210 = pVar19;
                    p<? super r, ? super Integer, i0> pVar211 = pVar20;
                    p<? super r, ? super Integer, i0> pVar212 = pVar22;
                    g3.C(h3Var2, text2, pVar, attached2, fVarD, pVar210, pVar211, pVar26, pVar212, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i613, i614);
                    if (t.k()) {
                        t.n();
                    }
                    pVar14 = pVar23;
                    pVar15 = pVar24;
                    d3Var2 = d3Var3;
                    pVar16 = pVarD;
                    pVar12 = pVar26;
                    pVar13 = pVar212;
                    pVar17 = pVar210;
                    pVar11 = pVar211;
                    z25 = z26;
                    hnVar2 = hnVar3;
                    pVar10 = pVar25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    pVar10 = pVar2;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    pVar13 = pVar6;
                    pVar14 = pVar7;
                    pVar15 = pVar8;
                    hnVar2 = hnVar;
                    d3Var2 = d3Var;
                    pVar16 = pVar9;
                    z25 = z18;
                    pVar17 = pVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.tf
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 805306368;
            i26 = i17 & 1024;
            if (i26 != 0) {
                i27 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.G(pVar5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i16 | i28;
            } else {
                i27 = i16;
            }
            i29 = i17 & 2048;
            if (i29 != 0) {
                i27 |= 48;
            } else if ((i16 & 48) != 0) {
                if (rVarH.G(pVar6)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i27 |= i35;
            }
            i36 = i27;
            i37 = i17 & PKIFailureInfo.certConfirmed;
            if (i37 != 0) {
                i38 = i36 | MLKEMEngine.KyberPolyBytes;
            } else if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                i38 = i36 | (rVarH.G(pVar7) ? 256 : 128);
            } else {
                i38 = i36;
            }
            i39 = i17 & PKIFailureInfo.certRevoked;
            if (i39 != 0) {
                i45 = i38;
                if ((i16 & 3072) == 0) {
                    i45 |= rVarH.G(pVar8) ? 2048 : 1024;
                }
                if ((i16 & 24576) != 0) {
                    if ((i17 & 16384) == 0) {
                        i56 = 16384;
                    }
                    i45 |= i56;
                }
                if ((i16 & 196608) != 0) {
                    if ((i17 & 32768) == 0) {
                        i49 = 65536;
                    } else {
                        i49 = 65536;
                    }
                    i45 |= i49;
                }
                i46 = i17 & PKIFailureInfo.notAuthorized;
                if (i46 != 0) {
                    i45 |= 1572864;
                } else if ((i16 & 1572864) == 0) {
                    if (rVarH.G(pVar9)) {
                        i47 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i47 = PKIFailureInfo.signerNotTrusted;
                    }
                    i45 |= i47;
                }
                if ((i16 & 12582912) == 0) {
                    if (rVarH.W(this)) {
                        i48 = 8388608;
                    } else {
                        i48 = 4194304;
                    }
                    i45 |= i48;
                }
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i57 != 0) {
                            z18 = false;
                        }
                        if (i58 != 0) {
                            pVar18 = null;
                        } else {
                            pVar18 = pVar2;
                        }
                        if (i59 != 0) {
                            pVar19 = null;
                        } else {
                            pVar19 = pVar3;
                        }
                        if (i19 != 0) {
                            pVar20 = null;
                        } else {
                            pVar20 = pVar4;
                        }
                        if (i26 != 0) {
                            pVar21 = null;
                        } else {
                            pVar21 = pVar5;
                        }
                        if (i29 != 0) {
                            pVar22 = null;
                        } else {
                            pVar22 = pVar6;
                        }
                        if (i37 != 0) {
                            pVar23 = null;
                        } else {
                            pVar23 = pVar7;
                        }
                        if (i39 != 0) {
                            pVar24 = null;
                        } else {
                            pVar24 = pVar8;
                        }
                        if ((i17 & 16384) != 0) {
                            hnVarQ = q(rVarH, (i45 >> 21) & 14);
                            i45 &= -57345;
                        } else {
                            hnVarQ = hnVar;
                        }
                        if ((i17 & 32768) != 0) {
                            d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i45 &= -458753;
                        } else {
                            d3VarT = d3Var;
                        }
                        if (i46 != 0) {
                            pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            pVar25 = pVar18;
                        } else {
                            pVar25 = pVar18;
                            pVarD = pVar9;
                        }
                        z26 = z18;
                        hnVar3 = hnVarQ;
                        pVar26 = pVar21;
                        d3Var3 = d3VarT;
                    } else {
                        if (i57 != 0) {
                            z18 = false;
                        }
                        if (i58 != 0) {
                            pVar18 = null;
                        } else {
                            pVar18 = pVar2;
                        }
                        if (i59 != 0) {
                            pVar19 = null;
                        } else {
                            pVar19 = pVar3;
                        }
                        if (i19 != 0) {
                            pVar20 = null;
                        } else {
                            pVar20 = pVar4;
                        }
                        if (i26 != 0) {
                            pVar21 = null;
                        } else {
                            pVar21 = pVar5;
                        }
                        if (i29 != 0) {
                            pVar22 = null;
                        } else {
                            pVar22 = pVar6;
                        }
                        if (i37 != 0) {
                            pVar23 = null;
                        } else {
                            pVar23 = pVar7;
                        }
                        if (i39 != 0) {
                            pVar24 = null;
                        } else {
                            pVar24 = pVar8;
                        }
                        if ((i17 & 16384) != 0) {
                            hnVarQ = q(rVarH, (i45 >> 21) & 14);
                            i45 &= -57345;
                        } else {
                            hnVarQ = hnVar;
                        }
                        if ((i17 & 32768) != 0) {
                            d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i45 &= -458753;
                        } else {
                            d3VarT = d3Var;
                        }
                        if (i46 != 0) {
                            pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            pVar25 = pVar18;
                        } else {
                            pVar25 = pVar18;
                            pVarD = pVar9;
                        }
                        z26 = z18;
                        hnVar3 = hnVarQ;
                        pVar26 = pVar21;
                        d3Var3 = d3VarT;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                    }
                    if ((i18 & 14) == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    int i615 = i45;
                    if ((57344 & i18) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z27;
                    objE = rVarH.E();
                    if (z29) {
                        objE = e1Var.a(new e(str, null, 2, null));
                        rVarH.v(objE);
                    } else {
                        objE = e1Var.a(new e(str, null, 2, null));
                        rVarH.v(objE);
                    }
                    String text3 = ((TransformedText) objE).getText().getText();
                    h3 h3Var3 = h3.Outlined;
                    tn.Attached attached3 = new tn.Attached(false, null, null, 7, null);
                    if (pVar25 == null) {
                        rVarH.X(1927042940);
                        rVarH.R();
                        fVarD = null;
                    } else {
                        rVarH.X(1927042941);
                        fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i616 = i18 >> 9;
                    int i617 = i615 << 21;
                    int i618 = ((i18 << 3) & 896) | 6 | (458752 & i616) | (3670016 & i616) | (i617 & 29360128) | (i617 & 234881024) | (i617 & 1879048192);
                    int i619 = (i18 & 896) | ((i615 >> 9) & 14) | ((i18 >> 6) & 112) | (i616 & 7168) | (57344 & (i18 >> 3)) | (i615 & 458752) | ((i615 << 6) & 3670016) | (29360128 & (i615 << 3));
                    rVar2 = rVarH;
                    p<? super r, ? super Integer, i0> pVar213 = pVar19;
                    p<? super r, ? super Integer, i0> pVar214 = pVar20;
                    p<? super r, ? super Integer, i0> pVar215 = pVar22;
                    g3.C(h3Var3, text3, pVar, attached3, fVarD, pVar213, pVar214, pVar26, pVar215, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i618, i619);
                    if (t.k()) {
                        t.n();
                    }
                    pVar14 = pVar23;
                    pVar15 = pVar24;
                    d3Var2 = d3Var3;
                    pVar16 = pVarD;
                    pVar12 = pVar26;
                    pVar13 = pVar215;
                    pVar17 = pVar213;
                    pVar11 = pVar214;
                    z25 = z26;
                    hnVar2 = hnVar3;
                    pVar10 = pVar25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    pVar10 = pVar2;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    pVar13 = pVar6;
                    pVar14 = pVar7;
                    pVar15 = pVar8;
                    hnVar2 = hnVar;
                    d3Var2 = d3Var;
                    pVar16 = pVar9;
                    z25 = z18;
                    pVar17 = pVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.tf
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i45 = i38 | 3072;
            if ((i16 & 24576) != 0) {
                if ((i17 & 16384) == 0) {
                    i56 = 16384;
                }
                i45 |= i56;
            }
            if ((i16 & 196608) != 0) {
                if ((i17 & 32768) == 0) {
                    i49 = 65536;
                } else {
                    i49 = 65536;
                }
                i45 |= i49;
            }
            i46 = i17 & PKIFailureInfo.notAuthorized;
            if (i46 != 0) {
                i45 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                if (rVarH.G(pVar9)) {
                    i47 = PKIFailureInfo.badCertTemplate;
                } else {
                    i47 = PKIFailureInfo.signerNotTrusted;
                }
                i45 |= i47;
            }
            if ((i16 & 12582912) == 0) {
                if (rVarH.W(this)) {
                    i48 = 8388608;
                } else {
                    i48 = 4194304;
                }
                i45 |= i48;
            }
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i57 != 0) {
                        z18 = false;
                    }
                    if (i58 != 0) {
                        pVar18 = null;
                    } else {
                        pVar18 = pVar2;
                    }
                    if (i59 != 0) {
                        pVar19 = null;
                    } else {
                        pVar19 = pVar3;
                    }
                    if (i19 != 0) {
                        pVar20 = null;
                    } else {
                        pVar20 = pVar4;
                    }
                    if (i26 != 0) {
                        pVar21 = null;
                    } else {
                        pVar21 = pVar5;
                    }
                    if (i29 != 0) {
                        pVar22 = null;
                    } else {
                        pVar22 = pVar6;
                    }
                    if (i37 != 0) {
                        pVar23 = null;
                    } else {
                        pVar23 = pVar7;
                    }
                    if (i39 != 0) {
                        pVar24 = null;
                    } else {
                        pVar24 = pVar8;
                    }
                    if ((i17 & 16384) != 0) {
                        hnVarQ = q(rVarH, (i45 >> 21) & 14);
                        i45 &= -57345;
                    } else {
                        hnVarQ = hnVar;
                    }
                    if ((i17 & 32768) != 0) {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i45 &= -458753;
                    } else {
                        d3VarT = d3Var;
                    }
                    if (i46 != 0) {
                        pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        pVar25 = pVar18;
                    } else {
                        pVar25 = pVar18;
                        pVarD = pVar9;
                    }
                    z26 = z18;
                    hnVar3 = hnVarQ;
                    pVar26 = pVar21;
                    d3Var3 = d3VarT;
                } else {
                    if (i57 != 0) {
                        z18 = false;
                    }
                    if (i58 != 0) {
                        pVar18 = null;
                    } else {
                        pVar18 = pVar2;
                    }
                    if (i59 != 0) {
                        pVar19 = null;
                    } else {
                        pVar19 = pVar3;
                    }
                    if (i19 != 0) {
                        pVar20 = null;
                    } else {
                        pVar20 = pVar4;
                    }
                    if (i26 != 0) {
                        pVar21 = null;
                    } else {
                        pVar21 = pVar5;
                    }
                    if (i29 != 0) {
                        pVar22 = null;
                    } else {
                        pVar22 = pVar6;
                    }
                    if (i37 != 0) {
                        pVar23 = null;
                    } else {
                        pVar23 = pVar7;
                    }
                    if (i39 != 0) {
                        pVar24 = null;
                    } else {
                        pVar24 = pVar8;
                    }
                    if ((i17 & 16384) != 0) {
                        hnVarQ = q(rVarH, (i45 >> 21) & 14);
                        i45 &= -57345;
                    } else {
                        hnVarQ = hnVar;
                    }
                    if ((i17 & 32768) != 0) {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i45 &= -458753;
                    } else {
                        d3VarT = d3Var;
                    }
                    if (i46 != 0) {
                        pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        pVar25 = pVar18;
                    } else {
                        pVar25 = pVar18;
                        pVarD = pVar9;
                    }
                    z26 = z18;
                    hnVar3 = hnVarQ;
                    pVar26 = pVar21;
                    d3Var3 = d3VarT;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                }
                if ((i18 & 14) == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                int i6110 = i45;
                if ((57344 & i18) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z27;
                objE = rVarH.E();
                if (z29) {
                    objE = e1Var.a(new e(str, null, 2, null));
                    rVarH.v(objE);
                } else {
                    objE = e1Var.a(new e(str, null, 2, null));
                    rVarH.v(objE);
                }
                String text4 = ((TransformedText) objE).getText().getText();
                h3 h3Var4 = h3.Outlined;
                tn.Attached attached4 = new tn.Attached(false, null, null, 7, null);
                if (pVar25 == null) {
                    rVarH.X(1927042940);
                    rVarH.R();
                    fVarD = null;
                } else {
                    rVarH.X(1927042941);
                    fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i6111 = i18 >> 9;
                int i6112 = i6110 << 21;
                int i6113 = ((i18 << 3) & 896) | 6 | (458752 & i6111) | (3670016 & i6111) | (i6112 & 29360128) | (i6112 & 234881024) | (i6112 & 1879048192);
                int i6114 = (i18 & 896) | ((i6110 >> 9) & 14) | ((i18 >> 6) & 112) | (i6111 & 7168) | (57344 & (i18 >> 3)) | (i6110 & 458752) | ((i6110 << 6) & 3670016) | (29360128 & (i6110 << 3));
                rVar2 = rVarH;
                p<? super r, ? super Integer, i0> pVar216 = pVar19;
                p<? super r, ? super Integer, i0> pVar217 = pVar20;
                p<? super r, ? super Integer, i0> pVar218 = pVar22;
                g3.C(h3Var4, text4, pVar, attached4, fVarD, pVar216, pVar217, pVar26, pVar218, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i6113, i6114);
                if (t.k()) {
                    t.n();
                }
                pVar14 = pVar23;
                pVar15 = pVar24;
                d3Var2 = d3Var3;
                pVar16 = pVarD;
                pVar12 = pVar26;
                pVar13 = pVar218;
                pVar17 = pVar216;
                pVar11 = pVar217;
                z25 = z26;
                hnVar2 = hnVar3;
                pVar10 = pVar25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar10 = pVar2;
                pVar11 = pVar4;
                pVar12 = pVar5;
                pVar13 = pVar6;
                pVar14 = pVar7;
                pVar15 = pVar8;
                hnVar2 = hnVar;
                d3Var2 = d3Var;
                pVar16 = pVar9;
                z25 = z18;
                pVar17 = pVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.tf
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 100663296;
        i19 = i17 & 512;
        if (i19 != 0) {
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar4)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i18 |= i25;
            }
            i26 = i17 & 1024;
            if (i26 != 0) {
                i27 = i16 | 6;
            } else if ((i16 & 6) == 0) {
                if (rVarH.G(pVar5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i16 | i28;
            } else {
                i27 = i16;
            }
            i29 = i17 & 2048;
            if (i29 != 0) {
                i27 |= 48;
            } else if ((i16 & 48) != 0) {
                if (rVarH.G(pVar6)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i27 |= i35;
            }
            i36 = i27;
            i37 = i17 & PKIFailureInfo.certConfirmed;
            if (i37 != 0) {
                i38 = i36 | MLKEMEngine.KyberPolyBytes;
            } else if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                i38 = i36 | (rVarH.G(pVar7) ? 256 : 128);
            } else {
                i38 = i36;
            }
            i39 = i17 & PKIFailureInfo.certRevoked;
            if (i39 != 0) {
                i45 = i38;
                if ((i16 & 3072) == 0) {
                    i45 |= rVarH.G(pVar8) ? 2048 : 1024;
                }
                if ((i16 & 24576) != 0) {
                    if ((i17 & 16384) == 0) {
                        i56 = 16384;
                    }
                    i45 |= i56;
                }
                if ((i16 & 196608) != 0) {
                    if ((i17 & 32768) == 0) {
                        i49 = 65536;
                    } else {
                        i49 = 65536;
                    }
                    i45 |= i49;
                }
                i46 = i17 & PKIFailureInfo.notAuthorized;
                if (i46 != 0) {
                    i45 |= 1572864;
                } else if ((i16 & 1572864) == 0) {
                    if (rVarH.G(pVar9)) {
                        i47 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i47 = PKIFailureInfo.signerNotTrusted;
                    }
                    i45 |= i47;
                }
                if ((i16 & 12582912) == 0) {
                    if (rVarH.W(this)) {
                        i48 = 8388608;
                    } else {
                        i48 = 4194304;
                    }
                    i45 |= i48;
                }
                if ((i18 & 306783379) == 306783378) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i57 != 0) {
                            z18 = false;
                        }
                        if (i58 != 0) {
                            pVar18 = null;
                        } else {
                            pVar18 = pVar2;
                        }
                        if (i59 != 0) {
                            pVar19 = null;
                        } else {
                            pVar19 = pVar3;
                        }
                        if (i19 != 0) {
                            pVar20 = null;
                        } else {
                            pVar20 = pVar4;
                        }
                        if (i26 != 0) {
                            pVar21 = null;
                        } else {
                            pVar21 = pVar5;
                        }
                        if (i29 != 0) {
                            pVar22 = null;
                        } else {
                            pVar22 = pVar6;
                        }
                        if (i37 != 0) {
                            pVar23 = null;
                        } else {
                            pVar23 = pVar7;
                        }
                        if (i39 != 0) {
                            pVar24 = null;
                        } else {
                            pVar24 = pVar8;
                        }
                        if ((i17 & 16384) != 0) {
                            hnVarQ = q(rVarH, (i45 >> 21) & 14);
                            i45 &= -57345;
                        } else {
                            hnVarQ = hnVar;
                        }
                        if ((i17 & 32768) != 0) {
                            d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i45 &= -458753;
                        } else {
                            d3VarT = d3Var;
                        }
                        if (i46 != 0) {
                            pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            pVar25 = pVar18;
                        } else {
                            pVar25 = pVar18;
                            pVarD = pVar9;
                        }
                        z26 = z18;
                        hnVar3 = hnVarQ;
                        pVar26 = pVar21;
                        d3Var3 = d3VarT;
                    } else {
                        if (i57 != 0) {
                            z18 = false;
                        }
                        if (i58 != 0) {
                            pVar18 = null;
                        } else {
                            pVar18 = pVar2;
                        }
                        if (i59 != 0) {
                            pVar19 = null;
                        } else {
                            pVar19 = pVar3;
                        }
                        if (i19 != 0) {
                            pVar20 = null;
                        } else {
                            pVar20 = pVar4;
                        }
                        if (i26 != 0) {
                            pVar21 = null;
                        } else {
                            pVar21 = pVar5;
                        }
                        if (i29 != 0) {
                            pVar22 = null;
                        } else {
                            pVar22 = pVar6;
                        }
                        if (i37 != 0) {
                            pVar23 = null;
                        } else {
                            pVar23 = pVar7;
                        }
                        if (i39 != 0) {
                            pVar24 = null;
                        } else {
                            pVar24 = pVar8;
                        }
                        if ((i17 & 16384) != 0) {
                            hnVarQ = q(rVarH, (i45 >> 21) & 14);
                            i45 &= -57345;
                        } else {
                            hnVarQ = hnVar;
                        }
                        if ((i17 & 32768) != 0) {
                            d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i45 &= -458753;
                        } else {
                            d3VarT = d3Var;
                        }
                        if (i46 != 0) {
                            pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            pVar25 = pVar18;
                        } else {
                            pVar25 = pVar18;
                            pVarD = pVar9;
                        }
                        z26 = z18;
                        hnVar3 = hnVarQ;
                        pVar26 = pVar21;
                        d3Var3 = d3VarT;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                    }
                    if ((i18 & 14) == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    int i6115 = i45;
                    if ((57344 & i18) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z28 | z27;
                    objE = rVarH.E();
                    if (z29) {
                        objE = e1Var.a(new e(str, null, 2, null));
                        rVarH.v(objE);
                    } else {
                        objE = e1Var.a(new e(str, null, 2, null));
                        rVarH.v(objE);
                    }
                    String text5 = ((TransformedText) objE).getText().getText();
                    h3 h3Var5 = h3.Outlined;
                    tn.Attached attached5 = new tn.Attached(false, null, null, 7, null);
                    if (pVar25 == null) {
                        rVarH.X(1927042940);
                        rVarH.R();
                        fVarD = null;
                    } else {
                        rVarH.X(1927042941);
                        fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    }
                    int i6116 = i18 >> 9;
                    int i6117 = i6115 << 21;
                    int i6118 = ((i18 << 3) & 896) | 6 | (458752 & i6116) | (3670016 & i6116) | (i6117 & 29360128) | (i6117 & 234881024) | (i6117 & 1879048192);
                    int i6119 = (i18 & 896) | ((i6115 >> 9) & 14) | ((i18 >> 6) & 112) | (i6116 & 7168) | (57344 & (i18 >> 3)) | (i6115 & 458752) | ((i6115 << 6) & 3670016) | (29360128 & (i6115 << 3));
                    rVar2 = rVarH;
                    p<? super r, ? super Integer, i0> pVar219 = pVar19;
                    p<? super r, ? super Integer, i0> pVar2110 = pVar20;
                    p<? super r, ? super Integer, i0> pVar2111 = pVar22;
                    g3.C(h3Var5, text5, pVar, attached5, fVarD, pVar219, pVar2110, pVar26, pVar2111, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i6118, i6119);
                    if (t.k()) {
                        t.n();
                    }
                    pVar14 = pVar23;
                    pVar15 = pVar24;
                    d3Var2 = d3Var3;
                    pVar16 = pVarD;
                    pVar12 = pVar26;
                    pVar13 = pVar2111;
                    pVar17 = pVar219;
                    pVar11 = pVar2110;
                    z25 = z26;
                    hnVar2 = hnVar3;
                    pVar10 = pVar25;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    pVar10 = pVar2;
                    pVar11 = pVar4;
                    pVar12 = pVar5;
                    pVar13 = pVar6;
                    pVar14 = pVar7;
                    pVar15 = pVar8;
                    hnVar2 = hnVar;
                    d3Var2 = d3Var;
                    pVar16 = pVar9;
                    z25 = z18;
                    pVar17 = pVar3;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.tf
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i45 = i38 | 3072;
            if ((i16 & 24576) != 0) {
                if ((i17 & 16384) == 0) {
                    i56 = 16384;
                }
                i45 |= i56;
            }
            if ((i16 & 196608) != 0) {
                if ((i17 & 32768) == 0) {
                    i49 = 65536;
                } else {
                    i49 = 65536;
                }
                i45 |= i49;
            }
            i46 = i17 & PKIFailureInfo.notAuthorized;
            if (i46 != 0) {
                i45 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                if (rVarH.G(pVar9)) {
                    i47 = PKIFailureInfo.badCertTemplate;
                } else {
                    i47 = PKIFailureInfo.signerNotTrusted;
                }
                i45 |= i47;
            }
            if ((i16 & 12582912) == 0) {
                if (rVarH.W(this)) {
                    i48 = 8388608;
                } else {
                    i48 = 4194304;
                }
                i45 |= i48;
            }
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i57 != 0) {
                        z18 = false;
                    }
                    if (i58 != 0) {
                        pVar18 = null;
                    } else {
                        pVar18 = pVar2;
                    }
                    if (i59 != 0) {
                        pVar19 = null;
                    } else {
                        pVar19 = pVar3;
                    }
                    if (i19 != 0) {
                        pVar20 = null;
                    } else {
                        pVar20 = pVar4;
                    }
                    if (i26 != 0) {
                        pVar21 = null;
                    } else {
                        pVar21 = pVar5;
                    }
                    if (i29 != 0) {
                        pVar22 = null;
                    } else {
                        pVar22 = pVar6;
                    }
                    if (i37 != 0) {
                        pVar23 = null;
                    } else {
                        pVar23 = pVar7;
                    }
                    if (i39 != 0) {
                        pVar24 = null;
                    } else {
                        pVar24 = pVar8;
                    }
                    if ((i17 & 16384) != 0) {
                        hnVarQ = q(rVarH, (i45 >> 21) & 14);
                        i45 &= -57345;
                    } else {
                        hnVarQ = hnVar;
                    }
                    if ((i17 & 32768) != 0) {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i45 &= -458753;
                    } else {
                        d3VarT = d3Var;
                    }
                    if (i46 != 0) {
                        pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        pVar25 = pVar18;
                    } else {
                        pVar25 = pVar18;
                        pVarD = pVar9;
                    }
                    z26 = z18;
                    hnVar3 = hnVarQ;
                    pVar26 = pVar21;
                    d3Var3 = d3VarT;
                } else {
                    if (i57 != 0) {
                        z18 = false;
                    }
                    if (i58 != 0) {
                        pVar18 = null;
                    } else {
                        pVar18 = pVar2;
                    }
                    if (i59 != 0) {
                        pVar19 = null;
                    } else {
                        pVar19 = pVar3;
                    }
                    if (i19 != 0) {
                        pVar20 = null;
                    } else {
                        pVar20 = pVar4;
                    }
                    if (i26 != 0) {
                        pVar21 = null;
                    } else {
                        pVar21 = pVar5;
                    }
                    if (i29 != 0) {
                        pVar22 = null;
                    } else {
                        pVar22 = pVar6;
                    }
                    if (i37 != 0) {
                        pVar23 = null;
                    } else {
                        pVar23 = pVar7;
                    }
                    if (i39 != 0) {
                        pVar24 = null;
                    } else {
                        pVar24 = pVar8;
                    }
                    if ((i17 & 16384) != 0) {
                        hnVarQ = q(rVarH, (i45 >> 21) & 14);
                        i45 &= -57345;
                    } else {
                        hnVarQ = hnVar;
                    }
                    if ((i17 & 32768) != 0) {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i45 &= -458753;
                    } else {
                        d3VarT = d3Var;
                    }
                    if (i46 != 0) {
                        pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        pVar25 = pVar18;
                    } else {
                        pVar25 = pVar18;
                        pVarD = pVar9;
                    }
                    z26 = z18;
                    hnVar3 = hnVarQ;
                    pVar26 = pVar21;
                    d3Var3 = d3VarT;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                }
                if ((i18 & 14) == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                int i61110 = i45;
                if ((57344 & i18) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z27;
                objE = rVarH.E();
                if (z29) {
                    objE = e1Var.a(new e(str, null, 2, null));
                    rVarH.v(objE);
                } else {
                    objE = e1Var.a(new e(str, null, 2, null));
                    rVarH.v(objE);
                }
                String text6 = ((TransformedText) objE).getText().getText();
                h3 h3Var6 = h3.Outlined;
                tn.Attached attached6 = new tn.Attached(false, null, null, 7, null);
                if (pVar25 == null) {
                    rVarH.X(1927042940);
                    rVarH.R();
                    fVarD = null;
                } else {
                    rVarH.X(1927042941);
                    fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i61111 = i18 >> 9;
                int i61112 = i61110 << 21;
                int i61113 = ((i18 << 3) & 896) | 6 | (458752 & i61111) | (3670016 & i61111) | (i61112 & 29360128) | (i61112 & 234881024) | (i61112 & 1879048192);
                int i61114 = (i18 & 896) | ((i61110 >> 9) & 14) | ((i18 >> 6) & 112) | (i61111 & 7168) | (57344 & (i18 >> 3)) | (i61110 & 458752) | ((i61110 << 6) & 3670016) | (29360128 & (i61110 << 3));
                rVar2 = rVarH;
                p<? super r, ? super Integer, i0> pVar2112 = pVar19;
                p<? super r, ? super Integer, i0> pVar2113 = pVar20;
                p<? super r, ? super Integer, i0> pVar2114 = pVar22;
                g3.C(h3Var6, text6, pVar, attached6, fVarD, pVar2112, pVar2113, pVar26, pVar2114, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i61113, i61114);
                if (t.k()) {
                    t.n();
                }
                pVar14 = pVar23;
                pVar15 = pVar24;
                d3Var2 = d3Var3;
                pVar16 = pVarD;
                pVar12 = pVar26;
                pVar13 = pVar2114;
                pVar17 = pVar2112;
                pVar11 = pVar2113;
                z25 = z26;
                hnVar2 = hnVar3;
                pVar10 = pVar25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar10 = pVar2;
                pVar11 = pVar4;
                pVar12 = pVar5;
                pVar13 = pVar6;
                pVar14 = pVar7;
                pVar15 = pVar8;
                hnVar2 = hnVar;
                d3Var2 = d3Var;
                pVar16 = pVar9;
                z25 = z18;
                pVar17 = pVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.tf
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 805306368;
        i26 = i17 & 1024;
        if (i26 != 0) {
            i27 = i16 | 6;
        } else if ((i16 & 6) == 0) {
            if (rVarH.G(pVar5)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i16 | i28;
        } else {
            i27 = i16;
        }
        i29 = i17 & 2048;
        if (i29 != 0) {
            i27 |= 48;
        } else if ((i16 & 48) != 0) {
            if (rVarH.G(pVar6)) {
                i35 = 32;
            } else {
                i35 = 16;
            }
            i27 |= i35;
        }
        i36 = i27;
        i37 = i17 & PKIFailureInfo.certConfirmed;
        if (i37 != 0) {
            i38 = i36 | MLKEMEngine.KyberPolyBytes;
        } else if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i38 = i36 | (rVarH.G(pVar7) ? 256 : 128);
        } else {
            i38 = i36;
        }
        i39 = i17 & PKIFailureInfo.certRevoked;
        if (i39 != 0) {
            i45 = i38;
            if ((i16 & 3072) == 0) {
                i45 |= rVarH.G(pVar8) ? 2048 : 1024;
            }
            if ((i16 & 24576) != 0) {
                if ((i17 & 16384) == 0) {
                    i56 = 16384;
                }
                i45 |= i56;
            }
            if ((i16 & 196608) != 0) {
                if ((i17 & 32768) == 0) {
                    i49 = 65536;
                } else {
                    i49 = 65536;
                }
                i45 |= i49;
            }
            i46 = i17 & PKIFailureInfo.notAuthorized;
            if (i46 != 0) {
                i45 |= 1572864;
            } else if ((i16 & 1572864) == 0) {
                if (rVarH.G(pVar9)) {
                    i47 = PKIFailureInfo.badCertTemplate;
                } else {
                    i47 = PKIFailureInfo.signerNotTrusted;
                }
                i45 |= i47;
            }
            if ((i16 & 12582912) == 0) {
                if (rVarH.W(this)) {
                    i48 = 8388608;
                } else {
                    i48 = 4194304;
                }
                i45 |= i48;
            }
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i57 != 0) {
                        z18 = false;
                    }
                    if (i58 != 0) {
                        pVar18 = null;
                    } else {
                        pVar18 = pVar2;
                    }
                    if (i59 != 0) {
                        pVar19 = null;
                    } else {
                        pVar19 = pVar3;
                    }
                    if (i19 != 0) {
                        pVar20 = null;
                    } else {
                        pVar20 = pVar4;
                    }
                    if (i26 != 0) {
                        pVar21 = null;
                    } else {
                        pVar21 = pVar5;
                    }
                    if (i29 != 0) {
                        pVar22 = null;
                    } else {
                        pVar22 = pVar6;
                    }
                    if (i37 != 0) {
                        pVar23 = null;
                    } else {
                        pVar23 = pVar7;
                    }
                    if (i39 != 0) {
                        pVar24 = null;
                    } else {
                        pVar24 = pVar8;
                    }
                    if ((i17 & 16384) != 0) {
                        hnVarQ = q(rVarH, (i45 >> 21) & 14);
                        i45 &= -57345;
                    } else {
                        hnVarQ = hnVar;
                    }
                    if ((i17 & 32768) != 0) {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i45 &= -458753;
                    } else {
                        d3VarT = d3Var;
                    }
                    if (i46 != 0) {
                        pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        pVar25 = pVar18;
                    } else {
                        pVar25 = pVar18;
                        pVarD = pVar9;
                    }
                    z26 = z18;
                    hnVar3 = hnVarQ;
                    pVar26 = pVar21;
                    d3Var3 = d3VarT;
                } else {
                    if (i57 != 0) {
                        z18 = false;
                    }
                    if (i58 != 0) {
                        pVar18 = null;
                    } else {
                        pVar18 = pVar2;
                    }
                    if (i59 != 0) {
                        pVar19 = null;
                    } else {
                        pVar19 = pVar3;
                    }
                    if (i19 != 0) {
                        pVar20 = null;
                    } else {
                        pVar20 = pVar4;
                    }
                    if (i26 != 0) {
                        pVar21 = null;
                    } else {
                        pVar21 = pVar5;
                    }
                    if (i29 != 0) {
                        pVar22 = null;
                    } else {
                        pVar22 = pVar6;
                    }
                    if (i37 != 0) {
                        pVar23 = null;
                    } else {
                        pVar23 = pVar7;
                    }
                    if (i39 != 0) {
                        pVar24 = null;
                    } else {
                        pVar24 = pVar8;
                    }
                    if ((i17 & 16384) != 0) {
                        hnVarQ = q(rVarH, (i45 >> 21) & 14);
                        i45 &= -57345;
                    } else {
                        hnVarQ = hnVar;
                    }
                    if ((i17 & 32768) != 0) {
                        d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i45 &= -458753;
                    } else {
                        d3VarT = d3Var;
                    }
                    if (i46 != 0) {
                        pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        pVar25 = pVar18;
                    } else {
                        pVar25 = pVar18;
                        pVarD = pVar9;
                    }
                    z26 = z18;
                    hnVar3 = hnVarQ;
                    pVar26 = pVar21;
                    d3Var3 = d3VarT;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
                }
                if ((i18 & 14) == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                int i61115 = i45;
                if ((57344 & i18) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z28 | z27;
                objE = rVarH.E();
                if (z29) {
                    objE = e1Var.a(new e(str, null, 2, null));
                    rVarH.v(objE);
                } else {
                    objE = e1Var.a(new e(str, null, 2, null));
                    rVarH.v(objE);
                }
                String text7 = ((TransformedText) objE).getText().getText();
                h3 h3Var7 = h3.Outlined;
                tn.Attached attached7 = new tn.Attached(false, null, null, 7, null);
                if (pVar25 == null) {
                    rVarH.X(1927042940);
                    rVarH.R();
                    fVarD = null;
                } else {
                    rVarH.X(1927042941);
                    fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                }
                int i61116 = i18 >> 9;
                int i61117 = i61115 << 21;
                int i61118 = ((i18 << 3) & 896) | 6 | (458752 & i61116) | (3670016 & i61116) | (i61117 & 29360128) | (i61117 & 234881024) | (i61117 & 1879048192);
                int i61119 = (i18 & 896) | ((i61115 >> 9) & 14) | ((i18 >> 6) & 112) | (i61116 & 7168) | (57344 & (i18 >> 3)) | (i61115 & 458752) | ((i61115 << 6) & 3670016) | (29360128 & (i61115 << 3));
                rVar2 = rVarH;
                p<? super r, ? super Integer, i0> pVar2115 = pVar19;
                p<? super r, ? super Integer, i0> pVar2116 = pVar20;
                p<? super r, ? super Integer, i0> pVar2117 = pVar22;
                g3.C(h3Var7, text7, pVar, attached7, fVarD, pVar2115, pVar2116, pVar26, pVar2117, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i61118, i61119);
                if (t.k()) {
                    t.n();
                }
                pVar14 = pVar23;
                pVar15 = pVar24;
                d3Var2 = d3Var3;
                pVar16 = pVarD;
                pVar12 = pVar26;
                pVar13 = pVar2117;
                pVar17 = pVar2115;
                pVar11 = pVar2116;
                z25 = z26;
                hnVar2 = hnVar3;
                pVar10 = pVar25;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar10 = pVar2;
                pVar11 = pVar4;
                pVar12 = pVar5;
                pVar13 = pVar6;
                pVar14 = pVar7;
                pVar15 = pVar8;
                hnVar2 = hnVar;
                d3Var2 = d3Var;
                pVar16 = pVar9;
                z25 = z18;
                pVar17 = pVar3;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.tf
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i45 = i38 | 3072;
        if ((i16 & 24576) != 0) {
            if ((i17 & 16384) == 0) {
                i56 = 16384;
            }
            i45 |= i56;
        }
        if ((i16 & 196608) != 0) {
            if ((i17 & 32768) == 0) {
                i49 = 65536;
            } else {
                i49 = 65536;
            }
            i45 |= i49;
        }
        i46 = i17 & PKIFailureInfo.notAuthorized;
        if (i46 != 0) {
            i45 |= 1572864;
        } else if ((i16 & 1572864) == 0) {
            if (rVarH.G(pVar9)) {
                i47 = PKIFailureInfo.badCertTemplate;
            } else {
                i47 = PKIFailureInfo.signerNotTrusted;
            }
            i45 |= i47;
        }
        if ((i16 & 12582912) == 0) {
            if (rVarH.W(this)) {
                i48 = 8388608;
            } else {
                i48 = 4194304;
            }
            i45 |= i48;
        }
        if ((i18 & 306783379) == 306783378) {
            z19 = true;
        } else {
            z19 = true;
        }
        if (rVarH.r(z19, i18 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i57 != 0) {
                    z18 = false;
                }
                if (i58 != 0) {
                    pVar18 = null;
                } else {
                    pVar18 = pVar2;
                }
                if (i59 != 0) {
                    pVar19 = null;
                } else {
                    pVar19 = pVar3;
                }
                if (i19 != 0) {
                    pVar20 = null;
                } else {
                    pVar20 = pVar4;
                }
                if (i26 != 0) {
                    pVar21 = null;
                } else {
                    pVar21 = pVar5;
                }
                if (i29 != 0) {
                    pVar22 = null;
                } else {
                    pVar22 = pVar6;
                }
                if (i37 != 0) {
                    pVar23 = null;
                } else {
                    pVar23 = pVar7;
                }
                if (i39 != 0) {
                    pVar24 = null;
                } else {
                    pVar24 = pVar8;
                }
                if ((i17 & 16384) != 0) {
                    hnVarQ = q(rVarH, (i45 >> 21) & 14);
                    i45 &= -57345;
                } else {
                    hnVarQ = hnVar;
                }
                if ((i17 & 32768) != 0) {
                    d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i45 &= -458753;
                } else {
                    d3VarT = d3Var;
                }
                if (i46 != 0) {
                    pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    pVar25 = pVar18;
                } else {
                    pVar25 = pVar18;
                    pVarD = pVar9;
                }
                z26 = z18;
                hnVar3 = hnVarQ;
                pVar26 = pVar21;
                d3Var3 = d3VarT;
            } else {
                if (i57 != 0) {
                    z18 = false;
                }
                if (i58 != 0) {
                    pVar18 = null;
                } else {
                    pVar18 = pVar2;
                }
                if (i59 != 0) {
                    pVar19 = null;
                } else {
                    pVar19 = pVar3;
                }
                if (i19 != 0) {
                    pVar20 = null;
                } else {
                    pVar20 = pVar4;
                }
                if (i26 != 0) {
                    pVar21 = null;
                } else {
                    pVar21 = pVar5;
                }
                if (i29 != 0) {
                    pVar22 = null;
                } else {
                    pVar22 = pVar6;
                }
                if (i37 != 0) {
                    pVar23 = null;
                } else {
                    pVar23 = pVar7;
                }
                if (i39 != 0) {
                    pVar24 = null;
                } else {
                    pVar24 = pVar8;
                }
                if ((i17 & 16384) != 0) {
                    hnVarQ = q(rVarH, (i45 >> 21) & 14);
                    i45 &= -57345;
                } else {
                    hnVarQ = hnVar;
                }
                if ((i17 & 32768) != 0) {
                    d3VarT = t(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i45 &= -458753;
                } else {
                    d3VarT = d3Var;
                }
                if (i46 != 0) {
                    pVarD = y2.m.d(-896270173, true, new p() { // from class: f2.rf
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return wf.n(z15, z18, jVar, hnVarQ, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    pVar25 = pVar18;
                } else {
                    pVar25 = pVar18;
                    pVarD = pVar9;
                }
                z26 = z18;
                hnVar3 = hnVarQ;
                pVar26 = pVar21;
                d3Var3 = d3VarT;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-1732281618, i18, i45, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1141)");
            }
            if ((i18 & 14) == 4) {
                z27 = true;
            } else {
                z27 = false;
            }
            int i611110 = i45;
            if ((57344 & i18) == 16384) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = z28 | z27;
            objE = rVarH.E();
            if (z29) {
                objE = e1Var.a(new e(str, null, 2, null));
                rVarH.v(objE);
            } else {
                objE = e1Var.a(new e(str, null, 2, null));
                rVarH.v(objE);
            }
            String text8 = ((TransformedText) objE).getText().getText();
            h3 h3Var8 = h3.Outlined;
            tn.Attached attached8 = new tn.Attached(false, null, null, 7, null);
            if (pVar25 == null) {
                rVarH.X(1927042940);
                rVarH.R();
                fVarD = null;
            } else {
                rVarH.X(1927042941);
                fVarD = y2.m.d(-1459717586, true, new q() { // from class: f2.sf
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return wf.o(pVar25, (un) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54);
                rVarH.R();
            }
            int i611111 = i18 >> 9;
            int i611112 = i611110 << 21;
            int i611113 = ((i18 << 3) & 896) | 6 | (458752 & i611111) | (3670016 & i611111) | (i611112 & 29360128) | (i611112 & 234881024) | (i611112 & 1879048192);
            int i611114 = (i18 & 896) | ((i611110 >> 9) & 14) | ((i18 >> 6) & 112) | (i611111 & 7168) | (57344 & (i18 >> 3)) | (i611110 & 458752) | ((i611110 << 6) & 3670016) | (29360128 & (i611110 << 3));
            rVar2 = rVarH;
            p<? super r, ? super Integer, i0> pVar2118 = pVar19;
            p<? super r, ? super Integer, i0> pVar2119 = pVar20;
            p<? super r, ? super Integer, i0> pVar21110 = pVar22;
            g3.C(h3Var8, text8, pVar, attached8, fVarD, pVar2118, pVar2119, pVar26, pVar21110, pVar23, pVar24, z16, z15, z26, jVar, d3Var3, hnVar3, pVarD, rVar2, i611113, i611114);
            if (t.k()) {
                t.n();
            }
            pVar14 = pVar23;
            pVar15 = pVar24;
            d3Var2 = d3Var3;
            pVar16 = pVarD;
            pVar12 = pVar26;
            pVar13 = pVar21110;
            pVar17 = pVar2118;
            pVar11 = pVar2119;
            z25 = z26;
            hnVar2 = hnVar3;
            pVar10 = pVar25;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            pVar10 = pVar2;
            pVar11 = pVar4;
            pVar12 = pVar5;
            pVar13 = pVar6;
            pVar14 = pVar7;
            pVar15 = pVar8;
            hnVar2 = hnVar;
            d3Var2 = d3Var;
            pVar16 = pVar9;
            z25 = z18;
            pVar17 = pVar3;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.tf
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return wf.p(this.f57840a, str, pVar, z15, z16, e1Var, jVar, z25, pVar10, pVar17, pVar11, pVar12, pVar13, pVar14, pVar15, hnVar2, d3Var2, pVar16, i15, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final hn q(r rVar, int i15) {
        if (t.k()) {
            t.o(-471651810, i15, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1188)");
        }
        hn hnVarU = u(d.f9816a.a(rVar, 6), rVar, (i15 << 3) & 112);
        if (t.k()) {
            t.n();
        }
        return hnVarU;
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
            t.o(1767617725, i15, i16, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1290)");
        }
        hn hnVarC = u(d.f9816a.a(rVar, 6), rVar, (i19 >> 6) & 112).c(j97, jH2, jH3, jH4, jH5, jH6, jH7, jH8, jH9, jH10, selectionColors2, jH11, jH12, jH13, jH14, jH15, jH16, jH17, jH18, jH19, jH20, jH21, jH22, jH23, jH24, jH25, jH26, jH27, jH28, jH29, jH30, jH31, jH32, jH33, jH34, jH35, jH36, jH37, jH38, jH39, jH40, jH41, jH42);
        if (t.k()) {
            t.n();
        }
        return hnVarC;
    }

    public final d3 s(float start, float top, float end, float bottom) {
        return a3.h(start, top, end, bottom);
    }

    public final hn u(ColorScheme colorScheme, r rVar, int i15) {
        hn hnVar;
        if (t.k()) {
            t.o(-292363577, i15, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1338)");
        }
        hn defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        if (defaultOutlinedTextFieldColorsCached == null) {
            rVar.X(390452338);
            rVar.R();
            hnVar = null;
        } else {
            rVar.X(390452339);
            SelectionColors selectionColors = (SelectionColors) rVar.N(z1.g3.c());
            if (!fr.t.c(defaultOutlinedTextFieldColorsCached.getTextSelectionColors(), selectionColors)) {
                defaultOutlinedTextFieldColorsCached = defaultOutlinedTextFieldColorsCached.c(((-1025) & 1) != 0 ? defaultOutlinedTextFieldColorsCached.focusedTextColor : 0L, ((-1025) & 2) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedTextColor : 0L, ((-1025) & 4) != 0 ? defaultOutlinedTextFieldColorsCached.disabledTextColor : 0L, ((-1025) & 8) != 0 ? defaultOutlinedTextFieldColorsCached.errorTextColor : 0L, ((-1025) & 16) != 0 ? defaultOutlinedTextFieldColorsCached.focusedContainerColor : 0L, ((-1025) & 32) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedContainerColor : 0L, ((-1025) & 64) != 0 ? defaultOutlinedTextFieldColorsCached.disabledContainerColor : 0L, ((-1025) & 128) != 0 ? defaultOutlinedTextFieldColorsCached.errorContainerColor : 0L, ((-1025) & 256) != 0 ? defaultOutlinedTextFieldColorsCached.cursorColor : 0L, ((-1025) & 512) != 0 ? defaultOutlinedTextFieldColorsCached.errorCursorColor : 0L, ((-1025) & 1024) != 0 ? defaultOutlinedTextFieldColorsCached.textSelectionColors : selectionColors, ((-1025) & 2048) != 0 ? defaultOutlinedTextFieldColorsCached.focusedIndicatorColor : 0L, ((-1025) & PKIFailureInfo.certConfirmed) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedIndicatorColor : 0L, ((-1025) & PKIFailureInfo.certRevoked) != 0 ? defaultOutlinedTextFieldColorsCached.disabledIndicatorColor : 0L, ((-1025) & 16384) != 0 ? defaultOutlinedTextFieldColorsCached.errorIndicatorColor : 0L, ((-1025) & 32768) != 0 ? defaultOutlinedTextFieldColorsCached.focusedLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.notAuthorized) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.unsupportedVersion) != 0 ? defaultOutlinedTextFieldColorsCached.disabledLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.transactionIdInUse) != 0 ? defaultOutlinedTextFieldColorsCached.errorLeadingIconColor : 0L, ((-1025) & PKIFailureInfo.signerNotTrusted) != 0 ? defaultOutlinedTextFieldColorsCached.focusedTrailingIconColor : 0L, ((-1025) & PKIFailureInfo.badCertTemplate) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedTrailingIconColor : 0L, ((-1025) & PKIFailureInfo.badSenderNonce) != 0 ? defaultOutlinedTextFieldColorsCached.disabledTrailingIconColor : 0L, ((-1025) & 4194304) != 0 ? defaultOutlinedTextFieldColorsCached.errorTrailingIconColor : 0L, ((-1025) & 8388608) != 0 ? defaultOutlinedTextFieldColorsCached.focusedLabelColor : 0L, ((-1025) & 16777216) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedLabelColor : 0L, ((-1025) & 33554432) != 0 ? defaultOutlinedTextFieldColorsCached.disabledLabelColor : 0L, ((-1025) & 67108864) != 0 ? defaultOutlinedTextFieldColorsCached.errorLabelColor : 0L, ((-1025) & 134217728) != 0 ? defaultOutlinedTextFieldColorsCached.focusedPlaceholderColor : 0L, ((-1025) & 268435456) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedPlaceholderColor : 0L, ((-1025) & PKIFailureInfo.duplicateCertReq) != 0 ? defaultOutlinedTextFieldColorsCached.disabledPlaceholderColor : 0L, ((-1025) & 1073741824) != 0 ? defaultOutlinedTextFieldColorsCached.errorPlaceholderColor : 0L, ((-1025) & PKIFailureInfo.systemUnavail) != 0 ? defaultOutlinedTextFieldColorsCached.focusedSupportingTextColor : 0L, (2047 & 1) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedSupportingTextColor : 0L, (2047 & 2) != 0 ? defaultOutlinedTextFieldColorsCached.disabledSupportingTextColor : 0L, (2047 & 4) != 0 ? defaultOutlinedTextFieldColorsCached.errorSupportingTextColor : 0L, (2047 & 8) != 0 ? defaultOutlinedTextFieldColorsCached.focusedPrefixColor : 0L, (2047 & 16) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedPrefixColor : 0L, (2047 & 32) != 0 ? defaultOutlinedTextFieldColorsCached.disabledPrefixColor : 0L, (2047 & 64) != 0 ? defaultOutlinedTextFieldColorsCached.errorPrefixColor : 0L, (2047 & 128) != 0 ? defaultOutlinedTextFieldColorsCached.focusedSuffixColor : 0L, (2047 & 256) != 0 ? defaultOutlinedTextFieldColorsCached.unfocusedSuffixColor : 0L, (2047 & 512) != 0 ? defaultOutlinedTextFieldColorsCached.disabledSuffixColor : 0L, (2047 & 1024) != 0 ? defaultOutlinedTextFieldColorsCached.errorSuffixColor : 0L);
                colorScheme.q0(defaultOutlinedTextFieldColorsCached);
            }
            rVar.R();
            hnVar = defaultOutlinedTextFieldColorsCached;
        }
        if (hnVar == null) {
            rVar.X(-1788321191);
            n0 n0Var = n0.f114976a;
            long jH = g2.h(colorScheme, n0Var.p());
            long jH2 = g2.h(colorScheme, n0Var.v());
            long jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jH3 = g2.h(colorScheme, n0Var.j());
            Color.Companion companion = Color.INSTANCE;
            hn hnVar2 = new hn(jH, jH2, jM9copywmQWz5c$default, jH3, companion.g(), companion.g(), companion.g(), companion.g(), g2.h(colorScheme, n0Var.a()), g2.h(colorScheme, n0Var.i()), (SelectionColors) rVar.N(z1.g3.c()), g2.h(colorScheme, n0Var.s()), g2.h(colorScheme, n0Var.B()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.f()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.m()), g2.h(colorScheme, n0Var.r()), g2.h(colorScheme, n0Var.A()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.l()), g2.h(colorScheme, n0Var.u()), g2.h(colorScheme, n0Var.D()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.h()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.o()), g2.h(colorScheme, n0Var.q()), g2.h(colorScheme, n0Var.z()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.k()), g2.h(colorScheme, n0Var.w()), g2.h(colorScheme, n0Var.w()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.c()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.w()), g2.h(colorScheme, n0Var.t()), g2.h(colorScheme, n0Var.C()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.g()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.n()), g2.h(colorScheme, n0Var.x()), g2.h(colorScheme, n0Var.x()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.x()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.x()), g2.h(colorScheme, n0Var.y()), g2.h(colorScheme, n0Var.y()), Color.m9copywmQWz5c$default(g2.h(colorScheme, n0Var.y()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), g2.h(colorScheme, n0Var.y()), null);
            colorScheme.q0(hnVar2);
            rVar.R();
            hnVar = hnVar2;
        } else {
            rVar.X(-1788515437);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return hnVar;
    }

    public final float v() {
        return MinHeight;
    }

    public final float w() {
        return MinWidth;
    }

    public final y2 x(r rVar, int i15) {
        if (t.k()) {
            t.o(-1066756961, i15, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:866)");
        }
        y2 y2VarH = ui.h(n0.f114976a.b(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return y2VarH;
    }
}
