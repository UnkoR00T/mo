package p079n1;

import a4.w;
import a4.x;
import androidx.compose.ui.platform.g1;
import b5.TextGeometricTransform;
import c3.SnapshotStateList;
import c5.d;
import c5.q;
import c5.t;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import f3.m;
import fr.u0;
import java.util.List;
import ju.p0;
import m3.g;
import n3.Shadow;
import n3.a2;
import n3.i2;
import n3.m2;
import n3.y2;
import n3.z1;
import n4.c0;
import n4.h0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;
import pq.v;
import q4.SpanStyle;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.e;
import q4.j0;
import q4.n;
import q4.u3;
import u4.FontWeight;
import u4.y;
import u4.z;
import vq.k;
import w0.d1;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J;\u0010&\u001a\u00020\u001e2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010!\"\u0004\u0018\u00010\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#H\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010+R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010/\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010-\u001a\u0004\b7\u0010+\"\u0004\b8\u0010\u0005R&\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Ln1/z6;", "", "Lq4/e;", "initialText", "<init>", "(Lq4/e;)V", "Lf3/m;", "Lq4/e$d;", "Lq4/m;", "Landroidx/compose/foundation/text/LinkRange;", "link", "J", "(Lf3/m;Lq4/e$d;)Lf3/m;", "A", "Ln3/y2;", "I", "(Lq4/e$d;)Ln3/y2;", "Ln3/m2;", "G", "(Lq4/e$d;)Ln3/m2;", "Lq4/t3;", "textLayoutResult", "z", "(Lq4/e$d;Lq4/t3;)Lq4/e$d;", "Lq4/h3;", "other", "F", "(Lq4/h3;Lq4/h3;)Lq4/h3;", "Landroidx/compose/ui/platform/y2;", "uriHandler", "Loq/i0;", "E", "(Lq4/m;Landroidx/compose/ui/platform/y2;)V", "", "keys", "Lkotlin/Function1;", "Ln1/g4;", "block", "s", "([Ljava/lang/Object;Ler/l;Lm2/r;I)V", "n", "(Lm2/r;I)V", "y", "()Lq4/e;", "a", "Lq4/e;", "getInitialText$foundation", "<set-?>", "b", "Lm2/a3;", ip.a.f96138c, "()Lq4/t3;", i.f37087n, "(Lq4/t3;)V", "c", "getText$foundation", "setText$foundation", "text", "Lc3/f0;", "d", "Lc3/f0;", "annotators", "Lkotlin/Function0;", "", "C", "()Ler/a;", "shouldMeasureLinks", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e initialText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private e text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 textLayoutResult = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<l<g4, i0>> annotators = x5.f();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ t3 f130582f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t3 t3Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f130582f = t3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f130581e;
            if (i15 == 0) {
                u.b(obj);
                t3 t3Var = this.f130582f;
                this.f130581e = 1;
                if (t3Var.e(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f130582f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n1/z6$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f130584b;

        public b(l lVar) {
            this.f130584b = lVar;
        }

        @Override // p076m2.r0
        public void j() {
            z6.this.annotators.remove(this.f130584b);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"n1/z6$c", "Ln3/y2;", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ln3/i2;", "a", "(JLc5/t;Lc5/d;)Ln3/i2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements y2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2 f130585b;

        c(m2 m2Var) {
            this.f130585b = m2Var;
        }

        @Override // n3.y2
        public i2 a(long size, t layoutDirection, d density) {
            return new i2.a(this.f130585b);
        }
    }

    public z6(e eVar) {
        this.initialText = eVar;
        this.text = eVar.a(new l() { // from class: n1.m6
            @Override // er.l
            public final Object b(Object obj) {
                return z6.w((e.Range) obj);
            }
        });
    }

    private final m A(m mVar, final e.Range<q4.m> range) {
        return z1.c(mVar, new l() { // from class: n1.v6
            @Override // er.l
            public final Object b(Object obj) {
                return z6.B(this.f130501a, range, (a2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(z6 z6Var, e.Range range, a2 a2Var) {
        y2 y2VarI = z6Var.I(range);
        if (y2VarI != null) {
            a2Var.k0(y2VarI);
            a2Var.u(true);
        }
        return i0.f148189a;
    }

    private final void E(q4.m link, androidx.compose.ui.platform.y2 uriHandler) {
        n linkInteractionListener;
        if (!(link instanceof q4.m.b)) {
            if (!(link instanceof q4.m.a) || (linkInteractionListener = ((q4.m.a) link).getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.a(link);
            return;
        }
        n linkInteractionListener2 = ((q4.m.b) link).getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.a(link);
        } else {
            try {
                uriHandler.a(((q4.m.b) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private final SpanStyle F(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle spanStyleY;
        return (spanStyle == null || (spanStyleY = spanStyle.y(spanStyle2)) == null) ? spanStyle2 : spanStyleY;
    }

    private final m2 G(e.Range<q4.m> link) {
        m2 m2VarZ = null;
        if (!C().a().booleanValue()) {
            return null;
        }
        TextLayoutResult textLayoutResultD = D();
        if (textLayoutResultD != null) {
            e.Range<q4.m> rangeZ = z(link, textLayoutResultD);
            if (rangeZ == null) {
                return null;
            }
            m2VarZ = textLayoutResultD.z(rangeZ.h(), rangeZ.f());
            g gVarD = textLayoutResultD.d(rangeZ.h());
            m2VarZ.m(m3.e.e(m3.e.e((((long) Float.floatToRawIntBits(textLayoutResultD.q(rangeZ.h()) == textLayoutResultD.q(rangeZ.f() + (-1)) ? Math.min(textLayoutResultD.d(rangeZ.f() - 1).getLeft(), gVarD.getLeft()) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(gVarD.getTop())) & BodyPartID.bodyIdMax)) ^ (-9223372034707292160L)));
        }
        return m2VarZ;
    }

    private final y2 I(e.Range<q4.m> link) {
        m2 m2VarG = G(link);
        if (m2VarG != null) {
            return new c(m2VarG);
        }
        return null;
    }

    private final m J(m mVar, final e.Range<q4.m> range) {
        return mVar.u(new g7(new h7() { // from class: n1.y6
            @Override // p079n1.h7
            public final e7 a(f7 f7Var) {
                return z6.K(this.f130565a, range, f7Var);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e7 K(z6 z6Var, e.Range range, f7 f7Var) {
        TextLayoutResult textLayoutResultD = z6Var.D();
        if (textLayoutResultD == null) {
            return f7Var.a(0, 0, new er.a() { // from class: n1.n6
                @Override // er.a
                public final Object a() {
                    return z6.L();
                }
            });
        }
        e.Range<q4.m> rangeZ = z6Var.z(range, textLayoutResultD);
        if (rangeZ == null) {
            return f7Var.a(0, 0, new er.a() { // from class: n1.o6
                @Override // er.a
                public final Object a() {
                    return z6.M();
                }
            });
        }
        final c5.p pVarB = q.b(textLayoutResultD.z(rangeZ.h(), rangeZ.f()).getBounds());
        return f7Var.a(pVarB.k(), pVarB.f(), new er.a() { // from class: n1.p6
            @Override // er.a
            public final Object a() {
                return z6.N(pVarB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n L() {
        return c5.n.c(c5.n.INSTANCE.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n M() {
        return c5.n.c(c5.n.INSTANCE.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n N(c5.p pVar) {
        return c5.n.c(pVar.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(n4.i0 i0Var) {
        h0<i0> h0VarZ = c0.f131174a.z();
        i0 i0Var2 = i0.f148189a;
        i0Var.e(h0VarZ, i0Var2);
        return i0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(z6 z6Var, e.Range range, androidx.compose.ui.platform.y2 y2Var) {
        z6Var.E((q4.m) range.g(), y2Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(z6 z6Var, e.Range range, t3 t3Var, g4 g4Var) {
        u3 styles;
        u3 styles2;
        u3 styles3;
        u3 styles4 = ((q4.m) range.g()).getStyles();
        SpanStyle pressedStyle = null;
        SpanStyle spanStyleF = z6Var.F(z6Var.F(styles4 != null ? styles4.getStyle() : null, (!t3Var.f() || (styles3 = ((q4.m) range.g()).getStyles()) == null) ? null : styles3.getFocusedStyle()), (!t3Var.g() || (styles2 = ((q4.m) range.g()).getStyles()) == null) ? null : styles2.getHoveredStyle());
        if (t3Var.h() && (styles = ((q4.m) range.g()).getStyles()) != null) {
            pressedStyle = styles.getPressedStyle();
        }
        g4Var.c(range, z6Var.F(spanStyleF, pressedStyle));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(z6 z6Var, int i15, r rVar, int i16) {
        z6Var.n(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private final void s(final Object[] objArr, final l<? super g4, i0> lVar, r rVar, final int i15) {
        r rVarH = rVar.h(-2083052099);
        int i16 = (i15 & 48) == 0 ? (rVarH.G(lVar) ? 32 : 16) | i15 : i15;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(this) ? 256 : 128;
        }
        rVarH.J(-358306546, Integer.valueOf(objArr.length));
        int i17 = i16 | (rVarH.c(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i17 |= rVarH.G(obj) ? 4 : 0;
        }
        rVarH.U();
        if ((i17 & 14) == 0) {
            i17 |= 2;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2083052099, i17, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            u0 u0Var = new u0(2);
            u0Var.a(lVar);
            u0Var.b(objArr);
            Object[] objArrD = u0Var.d(new Object[u0Var.c()]);
            boolean zG = rVarH.G(this) | ((i17 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: n1.w6
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z6.t(this.f130515a, lVar, (s0) obj2);
                    }
                };
                rVarH.v(objE);
            }
            Function0.c(objArrD, (l) objE, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.x6
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return z6.u(this.f130546a, objArr, lVar, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 t(z6 z6Var, l lVar, s0 s0Var) {
        z6Var.annotators.add(lVar);
        return z6Var.new b(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(z6 z6Var, Object[] objArr, l lVar, int i15, r rVar, int i16) {
        z6Var.s(objArr, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(z6 z6Var) {
        TextLayoutInput layoutInput;
        e eVar = z6Var.text;
        TextLayoutResult textLayoutResultD = z6Var.D();
        return fr.t.c(eVar, (textLayoutResultD == null || (layoutInput = textLayoutResultD.getLayoutInput()) == null) ? null : layoutInput.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(e.Range range) {
        SpanStyle spanStyle;
        if (!(range.g() instanceof q4.m) || a7.b(((q4.m) range.g()).getStyles())) {
            return v.g(range);
        }
        u3 styles = ((q4.m) range.g()).getStyles();
        if (styles == null || (spanStyle = styles.getStyle()) == null) {
            spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (y) null, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65535, (fr.k) null);
        }
        return v.g(range, new e.Range(spanStyle, range.h(), range.f()));
    }

    private final e.Range<q4.m> z(e.Range<q4.m> link, TextLayoutResult textLayoutResult) {
        int iP = TextLayoutResult.p(textLayoutResult, textLayoutResult.n() - 1, false, 2, null);
        if (link.h() < iP) {
            return e.Range.e(link, null, 0, Math.min(link.f(), iP), null, 11, null);
        }
        return null;
    }

    public final er.a<Boolean> C() {
        return new er.a() { // from class: n1.u6
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(z6.v(this.f130487a));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult D() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void H(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }

    public final void n(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1154651354);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        int i17 = 1;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1154651354, i16, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            final androidx.compose.ui.platform.y2 y2Var = (androidx.compose.ui.platform.y2) rVarH.N(g1.t());
            e eVar = this.text;
            List<e.Range<q4.m>> listE = eVar.e(0, eVar.length());
            int size = listE.size();
            int i18 = 0;
            while (i18 < size) {
                final e.Range<q4.m> range = listE.get(i18);
                if (range.h() != range.f()) {
                    rVarH.X(725478935);
                    Object objE = rVarH.E();
                    r.Companion companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = b1.k.a();
                        rVarH.v(objE);
                    }
                    b1.l lVar = (b1.l) objE;
                    m mVarA = A(m.INSTANCE, range);
                    Object objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = new l() { // from class: n1.q6
                            @Override // er.l
                            public final Object b(Object obj) {
                                return z6.o((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    m mVarB = x.b(d1.b(J(n4.v.d(mVarA, false, (l) objE2, i17, null), range), lVar, false, 2, null), w.INSTANCE.b(), false, 2, null);
                    boolean zG = rVarH.G(this) | rVarH.W(range) | rVarH.G(y2Var);
                    Object objE3 = rVarH.E();
                    if (zG || objE3 == companion.a()) {
                        objE3 = new er.a() { // from class: n1.r6
                            @Override // er.a
                            public final Object a() {
                                return z6.p(this.f130376a, range, y2Var);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    d1.r.b(androidx.compose.foundation.b.p(mVarB, lVar, null, false, null, null, null, null, null, false, (er.a) objE3, 508, null), rVarH, 0);
                    if (a7.b(range.g().getStyles())) {
                        rVarH.X(728331710);
                        rVarH.R();
                    } else {
                        rVarH.X(726303039);
                        Object objE4 = rVarH.E();
                        if (objE4 == companion.a()) {
                            objE4 = new t3(lVar);
                            rVarH.v(objE4);
                        }
                        final t3 t3Var = (t3) objE4;
                        i0 i0Var = i0.f148189a;
                        Object objE5 = rVarH.E();
                        if (objE5 == companion.a()) {
                            objE5 = new a(t3Var, null);
                            rVarH.v(objE5);
                        }
                        Function0.d(i0Var, (p) objE5, rVarH, 6);
                        Boolean boolValueOf = Boolean.valueOf(t3Var.g());
                        Boolean boolValueOf2 = Boolean.valueOf(t3Var.f());
                        Boolean boolValueOf3 = Boolean.valueOf(t3Var.h());
                        u3 styles = range.g().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        u3 styles2 = range.g().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        u3 styles3 = range.g().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        u3 styles4 = range.g().getStyles();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean zG2 = rVarH.G(this) | rVarH.W(range);
                        Object objE6 = rVarH.E();
                        if (zG2 || objE6 == companion.a()) {
                            objE6 = new l() { // from class: n1.s6
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return z6.q(this.f130420a, range, t3Var, (g4) obj);
                                }
                            };
                            rVarH.v(objE6);
                        }
                        s(objArr, (l) objE6, rVarH, (i16 << 6) & 896);
                        rVarH.R();
                    }
                    rVarH.R();
                } else {
                    rVarH.X(728345598);
                    rVarH.R();
                }
                i18++;
                i17 = 1;
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.t6
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z6.r(this.f130457a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final e y() {
        e styledText;
        if (this.annotators.isEmpty()) {
            styledText = this.text;
        } else {
            g4 g4Var = new g4(this.text);
            SnapshotStateList<l<g4, i0>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i15 = 0; i15 < size; i15++) {
                snapshotStateList.get(i15).b(g4Var);
            }
            styledText = g4Var.getStyledText();
        }
        this.text = styledText;
        return styledText;
    }
}
