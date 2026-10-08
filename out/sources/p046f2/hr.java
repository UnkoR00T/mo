package p046f2;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.n3;
import c5.b;
import c5.h;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import d1.a3;
import d1.d3;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import h2.h0;
import h2.w;
import l2.k0;
import l2.p0;
import m3.e;
import m3.g;
import n3.g2;
import n3.y2;
import n3.z1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.b0;
import p036e4.c0;
import p036e4.l1;
import p036e4.m0;
import p036e4.v0;
import p036e4.w0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.c6;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import u0.d1;
import u0.j0;
import u0.k2;
import u0.s3;
import u0.v2;
import w0.b2;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a{\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001as\u0010\u001d\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010#\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a'\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001aO\u00107\u001a\u00020\b*\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u0001050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b7\u00108\"\u001a\u0010=\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u001a\u0010@\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<\"\u001a\u0010C\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<\"\u0014\u0010E\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010:\"\u0014\u0010G\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010:\"\u001a\u0010M\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u001a\u0010P\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010:\u001a\u0004\bO\u0010<\"\u001a\u0010S\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010:\u001a\u0004\bR\u0010<\"\u0014\u0010U\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010:\"\u0014\u0010W\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010:\"\u001a\u0010Z\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010:\u001a\u0004\bY\u0010<\"\u001a\u0010]\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010:\u001a\u0004\b\\\u0010<¨\u0006a²\u0006\f\u0010^\u001a\u00020'8\nX\u008a\u0084\u0002²\u0006\f\u0010_\u001a\u00020%8\nX\u008a\u0084\u0002²\u0006\f\u0010`\u001a\u00020%8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/t;", "positionProvider", "Lkotlin/Function1;", "Lf2/jr;", "Loq/i0;", "tooltip", "Lf2/lr;", "state", "Lf3/m;", "modifier", "Lkotlin/Function0;", "onDismissRequest", "", "focusable", "enableUserInput", "hasAction", "content", "t", "(Landroidx/compose/ui/window/t;Ler/q;Lf2/lr;Lf3/m;Ler/a;ZZZLer/p;Lm2/r;II)V", "Ln3/y2;", "caretShape", "Lc5/h;", "maxWidth", "shape", "Landroidx/compose/ui/graphics/Color;", "contentColor", "containerColor", "tonalElevation", "shadowElevation", "p", "(Lf2/jr;Lf3/m;Ln3/y2;FLn3/y2;JJFFLer/p;Lm2/r;II)V", "initialIsVisible", "isPersistent", "Lw0/b2;", "mutatorMutex", "M", "(ZZLw0/b2;Lm2/r;II)Lf2/lr;", "", "tooltipWidth", "", "screenWidthPx", "Lm3/g;", "anchorBounds", i.f37087n, "(FILm3/g;)F", "Lm2/a3;", "Ln3/g2;", "transformationMatrix", "Lc5/d;", "density", "Lc5/r;", "windowContainerSize", "Le4/y0;", "Le4/b0;", "getAnchorLayoutCoordinates", "J", "(Lf3/m;Lm2/a3;Lc5/d;JLer/l;Landroidx/compose/ui/window/t;)Lf3/m;", "a", "F", "I", "()F", "SpacingBetweenTooltipAndAnchor", "b", "getTooltipMinHeight", "TooltipMinHeight", "c", "getTooltipMinWidth", "TooltipMinWidth", "d", "PlainTooltipVerticalPadding", "e", "PlainTooltipHorizontalPadding", "Ld1/d3;", "f", "Ld1/d3;", "getPlainTooltipContentPadding", "()Ld1/d3;", "PlainTooltipContentPadding", "g", "getRichTooltipHorizontalPadding", "RichTooltipHorizontalPadding", "h", "getHeightToSubheadFirstLine", "HeightToSubheadFirstLine", "i", "HeightFromSubheadToTextFirstLine", "j", "TextBottomPadding", "k", "getActionLabelMinHeight", "ActionLabelMinHeight", "l", "getActionLabelBottomPadding", "ActionLabelBottomPadding", "tooltipSide", "scale", "alpha", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f56160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f56161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f56162c = h.n(40);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f56163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f56164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d3 f56165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f56166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f56167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f56168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f56169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f56170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f56171l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements er.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56172a;

        public a(k2 k2Var) {
            this.f56172a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
        @Override // er.a
        public final Boolean a() {
            return this.f56172a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements er.a<k2.b<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56173a;

        public b(k2 k2Var) {
            this.f56173a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final k2.b<Boolean> a() {
            return this.f56173a.u();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements er.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56174a;

        public c(k2 k2Var) {
            this.f56174a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
        @Override // er.a
        public final Boolean a() {
            return this.f56174a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements er.a<k2.b<Boolean>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f56175a;

        public d(k2 k2Var) {
            this.f56175a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final k2.b<Boolean> a() {
            return this.f56175a.u();
        }
    }

    static {
        float f15 = 4;
        f56160a = h.n(f15);
        float f16 = 24;
        f56161b = h.n(f16);
        float fN = h.n(f15);
        f56163d = fN;
        float f17 = 8;
        float fN2 = h.n(f17);
        f56164e = fN2;
        f56165f = a3.f(fN2, fN);
        float f18 = 16;
        f56166g = h.n(f18);
        f56167h = h.n(28);
        f56168i = h.n(f16);
        f56169j = h.n(f18);
        f56170k = h.n(36);
        f56171l = h.n(f17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(final p076m2.a3 a3Var, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-23901870, i15, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:177)");
            }
            m.Companion companion = m.INSTANCE;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.tq
                    @Override // er.l
                    public final Object b(Object obj) {
                        return hr.B(a3Var, (b0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarA = l1.a(companion, (l) objE);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarA);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
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
    public static final i0 B(p076m2.a3 a3Var, b0 b0Var) {
        a3Var.setValue(b0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(p076m2.a3 a3Var, p076m2.a3 a3Var2) {
        if (a3Var.getValue() == null || a3Var2.getValue() == null) {
            return 0;
        }
        long jI = c0.i((b0) a3Var.getValue());
        long packedValue = ((e) a3Var2.getValue()).getPackedValue();
        if (Float.intBitsToFloat((int) (packedValue >> 32)) <= Float.intBitsToFloat((int) (jI >> 32))) {
            return Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)) < Float.intBitsToFloat((int) (jI & BodyPartID.bodyIdMax)) ? 1 : 3;
        }
        return Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)) < Float.intBitsToFloat((int) (jI & BodyPartID.bodyIdMax)) ? 2 : 4;
    }

    private static final int D(f6<Integer> f6Var) {
        return f6Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 E(j0 j0Var, k2.b bVar, r rVar, int i15) {
        rVar.X(-1664496585);
        if (t.k()) {
            t.o(-1664496585, i15, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:213)");
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return j0Var;
    }

    private static final float F(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 G(j0 j0Var, k2.b bVar, r rVar, int i15) {
        rVar.X(-111222965);
        if (t.k()) {
            t.o(-111222965, i15, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:222)");
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return j0Var;
    }

    public static final float H(float f15, int i15, g gVar) {
        float fMin;
        float left = gVar.getLeft();
        float right = gVar.getRight();
        float f16 = 2;
        float f17 = (left + right) / f16;
        float f18 = i15;
        if (f15 >= f18) {
            return f17;
        }
        float f19 = f15 / f16;
        if (f17 - f19 < 0.0f) {
            fMin = Math.max(f15 - f18, -left);
        } else {
            if (f17 + f19 <= f18) {
                return f19;
            }
            fMin = Math.min(f15 - right, 0.0f);
        }
        return f17 + fMin;
    }

    public static final float I() {
        return f56160a;
    }

    private static final m J(m mVar, final p076m2.a3<g2> a3Var, final c5.d dVar, final long j15, final l<? super y0, ? extends b0> lVar, final androidx.compose.ui.window.t tVar) {
        return m0.a(mVar, new q() { // from class: f2.wq
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return hr.K(j15, lVar, dVar, tVar, a3Var, (y0) obj, (v0) obj2, (b) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x009d  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r6 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p036e4.x0 K(long r25, er.l r27, c5.d r28, androidx.compose.ui.window.t r29, p076m2.a3 r30, p036e4.y0 r31, p036e4.v0 r32, c5.b r33) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p046f2.hr.K(long, er.l, c5.d, androidx.compose.ui.window.t, m2.a3, e4.y0, e4.v0, c5.b):e4.x0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(a2 a2Var, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    public static final lr M(boolean z15, boolean z16, b2 b2Var, r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            z15 = false;
        }
        if ((i16 & 2) != 0) {
            z16 = false;
        }
        if ((i16 & 4) != 0) {
            b2Var = w.f80001a.a();
        }
        if (t.k()) {
            t.o(-1413230530, i15, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:825)");
        }
        boolean z17 = ((((i15 & 112) ^ 48) > 32 && rVar.a(z16)) || (i15 & 48) == 32) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(b2Var)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256);
        Object objE = rVar.E();
        if (z17 || objE == r.INSTANCE.a()) {
            objE = new mr(z15, z16, b2Var);
            rVar.v(objE);
        }
        mr mrVar = (mr) objE;
        if (t.k()) {
            t.n();
        }
        return mrVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:128:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:133:0x018e  */
    /* JADX WARN: Code duplicated, block: B:136:0x019a  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:158:0x020a  */
    /* JADX WARN: Code duplicated, block: B:161:0x023b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0248  */
    /* JADX WARN: Code duplicated, block: B:170:0x024f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0255  */
    /* JADX WARN: Code duplicated, block: B:175:0x0281  */
    /* JADX WARN: Code duplicated, block: B:177:0x0287  */
    /* JADX WARN: Code duplicated, block: B:183:0x0294  */
    /* JADX WARN: Code duplicated, block: B:184:0x0297  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:194:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:196:0x030a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0321  */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    public static final void p(final jr jrVar, m mVar, y2 y2Var, float f15, y2 y2Var2, long j15, long j16, float f16, float f17, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        y2 y2Var3;
        int i19;
        int i25;
        float fD;
        int i26;
        y2 y2VarB;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        boolean z15;
        r rVar2;
        final float f18;
        final m mVar3;
        final y2 y2Var4;
        final y2 y2Var5;
        final float f19;
        final long j17;
        final long j18;
        final float f25;
        d5 d5VarM;
        long jC;
        long jA;
        float fN;
        float fN2;
        final float f26;
        int i38;
        long j19;
        long j25;
        m mVar4;
        y2 y2Var6;
        Object objE;
        r.Companion companion;
        p076m2.a3 a3Var;
        boolean z16;
        Object objE2;
        boolean z17;
        boolean z18;
        Object objE3;
        int i39;
        int i45;
        int i46;
        int i47;
        r rVarH = rVar.h(-343758958);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(jrVar) : rVarH.G(jrVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i48 = i16 & 1;
        if (i48 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 2;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    y2Var3 = y2Var;
                    if (rVarH.W(y2Var3)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 4;
                if (i25 != 0) {
                    if ((i15 & 3072) == 0) {
                        fD = f15;
                        if (rVarH.b(fD)) {
                            i26 = 2048;
                        } else {
                            i26 = 1024;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 24576) == 0) {
                        if ((i16 & 8) == 0) {
                            y2VarB = y2Var2;
                            if (rVarH.W(y2VarB)) {
                                i47 = 16384;
                            }
                            i17 |= i47;
                        } else {
                            y2VarB = y2Var2;
                        }
                        i47 = PKIFailureInfo.certRevoked;
                        i17 |= i47;
                    } else {
                        y2VarB = y2Var2;
                    }
                    if ((i15 & 196608) == 0) {
                        if ((i16 & 16) == 0) {
                            i27 = i48;
                            if (rVarH.d(j15)) {
                                i46 = PKIFailureInfo.unsupportedVersion;
                            }
                            i17 |= i46;
                        } else {
                            i27 = i48;
                        }
                        i46 = PKIFailureInfo.notAuthorized;
                        i17 |= i46;
                    } else {
                        i27 = i48;
                    }
                    if ((i15 & 1572864) != 0) {
                        if ((i16 & 32) == 0 || !rVarH.d(j16)) {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        } else {
                            i45 = PKIFailureInfo.badCertTemplate;
                        }
                        i17 |= i45;
                    }
                    i28 = i16 & 64;
                    if (i28 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.b(f16)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i17 |= i29;
                    }
                    i35 = i16 & 128;
                    if (i35 != 0) {
                        if ((i15 & 100663296) == 0) {
                            if (rVarH.b(f17)) {
                                i36 = 67108864;
                            } else {
                                i36 = 33554432;
                            }
                            i17 |= i36;
                        }
                        if ((i15 & 805306368) == 0) {
                            if (rVarH.G(pVar)) {
                                i39 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i39 = 268435456;
                            }
                            i17 |= i39;
                        }
                        i37 = i17;
                        if ((i17 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (rVarH.r(z15, i37 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i27 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i18 != 0) {
                                    y2Var3 = null;
                                }
                                if (i25 != 0) {
                                    fD = rq.f57659a.d();
                                }
                                if ((i16 & 8) != 0) {
                                    i37 &= -57345;
                                    y2VarB = rq.f57659a.b(rVarH, 6);
                                }
                                if ((i16 & 16) != 0) {
                                    jC = rq.f57659a.c(rVarH, 6);
                                    i37 &= -458753;
                                } else {
                                    jC = j15;
                                }
                                if ((i16 & 32) != 0) {
                                    jA = rq.f57659a.a(rVarH, 6);
                                    i37 &= -3670017;
                                } else {
                                    jA = j16;
                                }
                                if (i28 != 0) {
                                    fN = h.n(0);
                                } else {
                                    fN = f16;
                                }
                                if (i35 != 0) {
                                    fN2 = h.n(0);
                                } else {
                                    fN2 = f17;
                                }
                                f26 = fD;
                                i38 = i37;
                                j19 = jA;
                                j25 = jC;
                            } else {
                                rVarH.O();
                                if ((i16 & 8) != 0) {
                                    i37 &= -57345;
                                }
                                if ((i16 & 16) != 0) {
                                    i37 &= -458753;
                                }
                                if ((i16 & 32) != 0) {
                                    i37 &= -3670017;
                                }
                                j25 = j15;
                                j19 = j16;
                                fN = f16;
                                fN2 = f17;
                                f26 = fD;
                                i38 = i37;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                            }
                            if (y2Var3 != null) {
                                rVarH.X(-1720514983);
                                objE = rVarH.E();
                                companion = r.INSTANCE;
                                if (objE == companion.a()) {
                                    objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                                    rVarH.v(objE);
                                }
                                a3Var = (p076m2.a3) objE;
                                c5.d dVar = (c5.d) rVarH.N(g1.f());
                                long jA2 = ((n3) rVarH.N(g1.v())).a();
                                m.Companion companion2 = m.INSTANCE;
                                if ((i38 & 14) != 4 || ((i38 & 8) != 0 && rVarH.G(jrVar))) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objE2 = rVarH.E();
                                if (z16 || objE2 == companion.a()) {
                                    objE2 = new l() { // from class: f2.er
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return hr.q(jrVar, (y0) obj);
                                        }
                                    };
                                    rVarH.v(objE2);
                                }
                                m mVarU = J(companion2, a3Var, dVar, jA2, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                                boolean z19 = (((57344 & i38) ^ 24576) <= 16384 && rVarH.W(y2VarB)) || (i38 & 24576) == 16384;
                                if ((i38 & 896) == 256) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z19 | z17;
                                objE3 = rVarH.E();
                                if (z18 || objE3 == companion.a()) {
                                    objE3 = new qq(a3Var, y2VarB, y2Var3);
                                    rVarH.v(objE3);
                                }
                                rVarH.R();
                                mVar4 = mVarU;
                                y2Var6 = (qq) objE3;
                            } else {
                                rVarH.X(-1719869687);
                                rVarH.R();
                                mVar4 = mVar2;
                                y2Var6 = y2VarB;
                            }
                            final long j26 = j25;
                            float f27 = f26;
                            int i49 = i38 >> 9;
                            rVar2 = rVarH;
                            androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return hr.r(f26, j26, pVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i49) | (i49 & 458752), 72);
                            if (t.k()) {
                                t.n();
                            }
                            mVar3 = mVar2;
                            y2Var5 = y2Var3;
                            f25 = fN;
                            f18 = fN2;
                            j17 = j26;
                            y2Var4 = y2VarB;
                            j18 = j19;
                            f19 = f27;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            f18 = f17;
                            mVar3 = mVar2;
                            y2Var4 = y2VarB;
                            y2Var5 = y2Var3;
                            f19 = fD;
                            j17 = j15;
                            j18 = j16;
                            f25 = f16;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.gr
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 100663296;
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i17 |= i39;
                    }
                    i37 = i17;
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i37 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        } else {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                        }
                        if (y2Var3 != null) {
                            rVarH.X(-1720514983);
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE == companion.a()) {
                                objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                                rVarH.v(objE);
                            }
                            a3Var = (p076m2.a3) objE;
                            c5.d dVar2 = (c5.d) rVarH.N(g1.f());
                            long jA3 = ((n3) rVarH.N(g1.v())).a();
                            m.Companion companion3 = m.INSTANCE;
                            if ((i38 & 14) != 4) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            m mVarU2 = J(companion3, a3Var, dVar2, jA3, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                            if (((57344 & i38) ^ 24576) <= 16384) {
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z19 | z17;
                            objE3 = rVarH.E();
                            if (z18) {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            }
                            rVarH.R();
                            mVar4 = mVarU2;
                            y2Var6 = (qq) objE3;
                        } else {
                            rVarH.X(-1719869687);
                            rVarH.R();
                            mVar4 = mVar2;
                            y2Var6 = y2VarB;
                        }
                        final long j27 = j25;
                        float f28 = f26;
                        int i410 = i38 >> 9;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.r(f26, j27, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i410) | (i410 & 458752), 72);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar2;
                        y2Var5 = y2Var3;
                        f25 = fN;
                        f18 = fN2;
                        j17 = j27;
                        y2Var4 = y2VarB;
                        j18 = j19;
                        f19 = f28;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f18 = f17;
                        mVar3 = mVar2;
                        y2Var4 = y2VarB;
                        y2Var5 = y2Var3;
                        f19 = fD;
                        j17 = j15;
                        j18 = j16;
                        f25 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.gr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 3072;
                fD = f15;
                if ((i15 & 24576) == 0) {
                    if ((i16 & 8) == 0) {
                        y2VarB = y2Var2;
                        if (rVarH.W(y2VarB)) {
                            i47 = 16384;
                        }
                        i17 |= i47;
                    } else {
                        y2VarB = y2Var2;
                    }
                    i47 = PKIFailureInfo.certRevoked;
                    i17 |= i47;
                } else {
                    y2VarB = y2Var2;
                }
                if ((i15 & 196608) == 0) {
                    if ((i16 & 16) == 0) {
                        i27 = i48;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i46;
                    } else {
                        i27 = i48;
                    }
                    i46 = PKIFailureInfo.notAuthorized;
                    i17 |= i46;
                } else {
                    i27 = i48;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 32) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i45;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f16)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                i35 = i16 & 128;
                if (i35 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.b(f17)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i17 |= i39;
                    }
                    i37 = i17;
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i37 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        } else {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                        }
                        if (y2Var3 != null) {
                            rVarH.X(-1720514983);
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE == companion.a()) {
                                objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                                rVarH.v(objE);
                            }
                            a3Var = (p076m2.a3) objE;
                            c5.d dVar3 = (c5.d) rVarH.N(g1.f());
                            long jA4 = ((n3) rVarH.N(g1.v())).a();
                            m.Companion companion4 = m.INSTANCE;
                            if ((i38 & 14) != 4) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            m mVarU3 = J(companion4, a3Var, dVar3, jA4, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                            if (((57344 & i38) ^ 24576) <= 16384) {
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z19 | z17;
                            objE3 = rVarH.E();
                            if (z18) {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            }
                            rVarH.R();
                            mVar4 = mVarU3;
                            y2Var6 = (qq) objE3;
                        } else {
                            rVarH.X(-1719869687);
                            rVarH.R();
                            mVar4 = mVar2;
                            y2Var6 = y2VarB;
                        }
                        final long j28 = j25;
                        float f29 = f26;
                        int i411 = i38 >> 9;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.r(f26, j28, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i411) | (i411 & 458752), 72);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar2;
                        y2Var5 = y2Var3;
                        f25 = fN;
                        f18 = fN2;
                        j17 = j28;
                        y2Var4 = y2VarB;
                        j18 = j19;
                        f19 = f29;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f18 = f17;
                        mVar3 = mVar2;
                        y2Var4 = y2VarB;
                        y2Var5 = y2Var3;
                        f19 = fD;
                        j17 = j15;
                        j18 = j16;
                        f25 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.gr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i17 |= i39;
                }
                i37 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i37 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    } else {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                    }
                    if (y2Var3 != null) {
                        rVarH.X(-1720514983);
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (p076m2.a3) objE;
                        c5.d dVar4 = (c5.d) rVarH.N(g1.f());
                        long jA5 = ((n3) rVarH.N(g1.v())).a();
                        m.Companion companion5 = m.INSTANCE;
                        if ((i38 & 14) != 4) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        m mVarU4 = J(companion5, a3Var, dVar4, jA5, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                        if (((57344 & i38) ^ 24576) <= 16384) {
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z19 | z17;
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        }
                        rVarH.R();
                        mVar4 = mVarU4;
                        y2Var6 = (qq) objE3;
                    } else {
                        rVarH.X(-1719869687);
                        rVarH.R();
                        mVar4 = mVar2;
                        y2Var6 = y2VarB;
                    }
                    final long j29 = j25;
                    float f210 = f26;
                    int i412 = i38 >> 9;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.r(f26, j29, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i412) | (i412 & 458752), 72);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar2;
                    y2Var5 = y2Var3;
                    f25 = fN;
                    f18 = fN2;
                    j17 = j29;
                    y2Var4 = y2VarB;
                    j18 = j19;
                    f19 = f210;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f18 = f17;
                    mVar3 = mVar2;
                    y2Var4 = y2VarB;
                    y2Var5 = y2Var3;
                    f19 = fD;
                    j17 = j15;
                    j18 = j16;
                    f25 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.gr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            y2Var3 = y2Var;
            i25 = i16 & 4;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    fD = f15;
                    if (rVarH.b(fD)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 8) == 0) {
                        y2VarB = y2Var2;
                        if (rVarH.W(y2VarB)) {
                            i47 = 16384;
                        }
                        i17 |= i47;
                    } else {
                        y2VarB = y2Var2;
                    }
                    i47 = PKIFailureInfo.certRevoked;
                    i17 |= i47;
                } else {
                    y2VarB = y2Var2;
                }
                if ((i15 & 196608) == 0) {
                    if ((i16 & 16) == 0) {
                        i27 = i48;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i46;
                    } else {
                        i27 = i48;
                    }
                    i46 = PKIFailureInfo.notAuthorized;
                    i17 |= i46;
                } else {
                    i27 = i48;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 32) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i45;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f16)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                i35 = i16 & 128;
                if (i35 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.b(f17)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i17 |= i39;
                    }
                    i37 = i17;
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i37 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        } else {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                        }
                        if (y2Var3 != null) {
                            rVarH.X(-1720514983);
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE == companion.a()) {
                                objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                                rVarH.v(objE);
                            }
                            a3Var = (p076m2.a3) objE;
                            c5.d dVar5 = (c5.d) rVarH.N(g1.f());
                            long jA6 = ((n3) rVarH.N(g1.v())).a();
                            m.Companion companion6 = m.INSTANCE;
                            if ((i38 & 14) != 4) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            m mVarU5 = J(companion6, a3Var, dVar5, jA6, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                            if (((57344 & i38) ^ 24576) <= 16384) {
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z19 | z17;
                            objE3 = rVarH.E();
                            if (z18) {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            }
                            rVarH.R();
                            mVar4 = mVarU5;
                            y2Var6 = (qq) objE3;
                        } else {
                            rVarH.X(-1719869687);
                            rVarH.R();
                            mVar4 = mVar2;
                            y2Var6 = y2VarB;
                        }
                        final long j210 = j25;
                        float f211 = f26;
                        int i413 = i38 >> 9;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.r(f26, j210, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i413) | (i413 & 458752), 72);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar2;
                        y2Var5 = y2Var3;
                        f25 = fN;
                        f18 = fN2;
                        j17 = j210;
                        y2Var4 = y2VarB;
                        j18 = j19;
                        f19 = f211;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f18 = f17;
                        mVar3 = mVar2;
                        y2Var4 = y2VarB;
                        y2Var5 = y2Var3;
                        f19 = fD;
                        j17 = j15;
                        j18 = j16;
                        f25 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.gr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i17 |= i39;
                }
                i37 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i37 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    } else {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                    }
                    if (y2Var3 != null) {
                        rVarH.X(-1720514983);
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (p076m2.a3) objE;
                        c5.d dVar6 = (c5.d) rVarH.N(g1.f());
                        long jA7 = ((n3) rVarH.N(g1.v())).a();
                        m.Companion companion7 = m.INSTANCE;
                        if ((i38 & 14) != 4) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        m mVarU6 = J(companion7, a3Var, dVar6, jA7, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                        if (((57344 & i38) ^ 24576) <= 16384) {
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z19 | z17;
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        }
                        rVarH.R();
                        mVar4 = mVarU6;
                        y2Var6 = (qq) objE3;
                    } else {
                        rVarH.X(-1719869687);
                        rVarH.R();
                        mVar4 = mVar2;
                        y2Var6 = y2VarB;
                    }
                    final long j211 = j25;
                    float f212 = f26;
                    int i414 = i38 >> 9;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.r(f26, j211, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i414) | (i414 & 458752), 72);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar2;
                    y2Var5 = y2Var3;
                    f25 = fN;
                    f18 = fN2;
                    j17 = j211;
                    y2Var4 = y2VarB;
                    j18 = j19;
                    f19 = f212;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f18 = f17;
                    mVar3 = mVar2;
                    y2Var4 = y2VarB;
                    y2Var5 = y2Var3;
                    f19 = fD;
                    j17 = j15;
                    j18 = j16;
                    f25 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.gr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            fD = f15;
            if ((i15 & 24576) == 0) {
                if ((i16 & 8) == 0) {
                    y2VarB = y2Var2;
                    if (rVarH.W(y2VarB)) {
                        i47 = 16384;
                    }
                    i17 |= i47;
                } else {
                    y2VarB = y2Var2;
                }
                i47 = PKIFailureInfo.certRevoked;
                i17 |= i47;
            } else {
                y2VarB = y2Var2;
            }
            if ((i15 & 196608) == 0) {
                if ((i16 & 16) == 0) {
                    i27 = i48;
                    if (rVarH.d(j15)) {
                        i46 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i46;
                } else {
                    i27 = i48;
                }
                i46 = PKIFailureInfo.notAuthorized;
                i17 |= i46;
            } else {
                i27 = i48;
            }
            if ((i15 & 1572864) != 0) {
                if ((i16 & 32) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i45;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.b(f16)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f17)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i17 |= i39;
                }
                i37 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i37 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    } else {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                    }
                    if (y2Var3 != null) {
                        rVarH.X(-1720514983);
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (p076m2.a3) objE;
                        c5.d dVar7 = (c5.d) rVarH.N(g1.f());
                        long jA8 = ((n3) rVarH.N(g1.v())).a();
                        m.Companion companion8 = m.INSTANCE;
                        if ((i38 & 14) != 4) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        m mVarU7 = J(companion8, a3Var, dVar7, jA8, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                        if (((57344 & i38) ^ 24576) <= 16384) {
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z19 | z17;
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        }
                        rVarH.R();
                        mVar4 = mVarU7;
                        y2Var6 = (qq) objE3;
                    } else {
                        rVarH.X(-1719869687);
                        rVarH.R();
                        mVar4 = mVar2;
                        y2Var6 = y2VarB;
                    }
                    final long j212 = j25;
                    float f213 = f26;
                    int i415 = i38 >> 9;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.r(f26, j212, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i415) | (i415 & 458752), 72);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar2;
                    y2Var5 = y2Var3;
                    f25 = fN;
                    f18 = fN2;
                    j17 = j212;
                    y2Var4 = y2VarB;
                    j18 = j19;
                    f19 = f213;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f18 = f17;
                    mVar3 = mVar2;
                    y2Var4 = y2VarB;
                    y2Var5 = y2Var3;
                    f19 = fD;
                    j17 = j15;
                    j18 = j16;
                    f25 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.gr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i17 |= i39;
            }
            i37 = i17;
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i37 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                } else {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                }
                if (y2Var3 != null) {
                    rVarH.X(-1720514983);
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (p076m2.a3) objE;
                    c5.d dVar8 = (c5.d) rVarH.N(g1.f());
                    long jA9 = ((n3) rVarH.N(g1.v())).a();
                    m.Companion companion9 = m.INSTANCE;
                    if ((i38 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    m mVarU8 = J(companion9, a3Var, dVar8, jA9, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                    if (((57344 & i38) ^ 24576) <= 16384) {
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    } else {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    }
                    rVarH.R();
                    mVar4 = mVarU8;
                    y2Var6 = (qq) objE3;
                } else {
                    rVarH.X(-1719869687);
                    rVarH.R();
                    mVar4 = mVar2;
                    y2Var6 = y2VarB;
                }
                final long j213 = j25;
                float f214 = f26;
                int i416 = i38 >> 9;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.r(f26, j213, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i416) | (i416 & 458752), 72);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar2;
                y2Var5 = y2Var3;
                f25 = fN;
                f18 = fN2;
                j17 = j213;
                y2Var4 = y2VarB;
                j18 = j19;
                f19 = f214;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f18 = f17;
                mVar3 = mVar2;
                y2Var4 = y2VarB;
                y2Var5 = y2Var3;
                f19 = fD;
                j17 = j15;
                j18 = j16;
                f25 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.gr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 2;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                y2Var3 = y2Var;
                if (rVarH.W(y2Var3)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            i25 = i16 & 4;
            if (i25 != 0) {
                if ((i15 & 3072) == 0) {
                    fD = f15;
                    if (rVarH.b(fD)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i17 |= i26;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 8) == 0) {
                        y2VarB = y2Var2;
                        if (rVarH.W(y2VarB)) {
                            i47 = 16384;
                        }
                        i17 |= i47;
                    } else {
                        y2VarB = y2Var2;
                    }
                    i47 = PKIFailureInfo.certRevoked;
                    i17 |= i47;
                } else {
                    y2VarB = y2Var2;
                }
                if ((i15 & 196608) == 0) {
                    if ((i16 & 16) == 0) {
                        i27 = i48;
                        if (rVarH.d(j15)) {
                            i46 = PKIFailureInfo.unsupportedVersion;
                        }
                        i17 |= i46;
                    } else {
                        i27 = i48;
                    }
                    i46 = PKIFailureInfo.notAuthorized;
                    i17 |= i46;
                } else {
                    i27 = i48;
                }
                if ((i15 & 1572864) != 0) {
                    if ((i16 & 32) == 0) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i45;
                }
                i28 = i16 & 64;
                if (i28 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f16)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                i35 = i16 & 128;
                if (i35 != 0) {
                    if ((i15 & 100663296) == 0) {
                        if (rVarH.b(f17)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i17 |= i36;
                    }
                    if ((i15 & 805306368) == 0) {
                        if (rVarH.G(pVar)) {
                            i39 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i39 = 268435456;
                        }
                        i17 |= i39;
                    }
                    i37 = i17;
                    if ((i17 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i37 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        } else {
                            if (i27 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i18 != 0) {
                                y2Var3 = null;
                            }
                            if (i25 != 0) {
                                fD = rq.f57659a.d();
                            }
                            if ((i16 & 8) != 0) {
                                i37 &= -57345;
                                y2VarB = rq.f57659a.b(rVarH, 6);
                            }
                            if ((i16 & 16) != 0) {
                                jC = rq.f57659a.c(rVarH, 6);
                                i37 &= -458753;
                            } else {
                                jC = j15;
                            }
                            if ((i16 & 32) != 0) {
                                jA = rq.f57659a.a(rVarH, 6);
                                i37 &= -3670017;
                            } else {
                                jA = j16;
                            }
                            if (i28 != 0) {
                                fN = h.n(0);
                            } else {
                                fN = f16;
                            }
                            if (i35 != 0) {
                                fN2 = h.n(0);
                            } else {
                                fN2 = f17;
                            }
                            f26 = fD;
                            i38 = i37;
                            j19 = jA;
                            j25 = jC;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                        }
                        if (y2Var3 != null) {
                            rVarH.X(-1720514983);
                            objE = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE == companion.a()) {
                                objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                                rVarH.v(objE);
                            }
                            a3Var = (p076m2.a3) objE;
                            c5.d dVar9 = (c5.d) rVarH.N(g1.f());
                            long jA10 = ((n3) rVarH.N(g1.v())).a();
                            m.Companion companion10 = m.INSTANCE;
                            if ((i38 & 14) != 4) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            objE2 = rVarH.E();
                            if (z16) {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            } else {
                                objE2 = new l() { // from class: f2.er
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return hr.q(jrVar, (y0) obj);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            m mVarU9 = J(companion10, a3Var, dVar9, jA10, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                            if (((57344 & i38) ^ 24576) <= 16384) {
                            }
                            if ((i38 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z19 | z17;
                            objE3 = rVarH.E();
                            if (z18) {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            } else {
                                objE3 = new qq(a3Var, y2VarB, y2Var3);
                                rVarH.v(objE3);
                            }
                            rVarH.R();
                            mVar4 = mVarU9;
                            y2Var6 = (qq) objE3;
                        } else {
                            rVarH.X(-1719869687);
                            rVarH.R();
                            mVar4 = mVar2;
                            y2Var6 = y2VarB;
                        }
                        final long j214 = j25;
                        float f215 = f26;
                        int i417 = i38 >> 9;
                        rVar2 = rVarH;
                        androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.r(f26, j214, pVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i417) | (i417 & 458752), 72);
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar2;
                        y2Var5 = y2Var3;
                        f25 = fN;
                        f18 = fN2;
                        j17 = j214;
                        y2Var4 = y2VarB;
                        j18 = j19;
                        f19 = f215;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f18 = f17;
                        mVar3 = mVar2;
                        y2Var4 = y2VarB;
                        y2Var5 = y2Var3;
                        f19 = fD;
                        j17 = j15;
                        j18 = j16;
                        f25 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.gr
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 100663296;
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i17 |= i39;
                }
                i37 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i37 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    } else {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                    }
                    if (y2Var3 != null) {
                        rVarH.X(-1720514983);
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (p076m2.a3) objE;
                        c5.d dVar10 = (c5.d) rVarH.N(g1.f());
                        long jA11 = ((n3) rVarH.N(g1.v())).a();
                        m.Companion companion11 = m.INSTANCE;
                        if ((i38 & 14) != 4) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        m mVarU10 = J(companion11, a3Var, dVar10, jA11, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                        if (((57344 & i38) ^ 24576) <= 16384) {
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z19 | z17;
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        }
                        rVarH.R();
                        mVar4 = mVarU10;
                        y2Var6 = (qq) objE3;
                    } else {
                        rVarH.X(-1719869687);
                        rVarH.R();
                        mVar4 = mVar2;
                        y2Var6 = y2VarB;
                    }
                    final long j215 = j25;
                    float f216 = f26;
                    int i418 = i38 >> 9;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.r(f26, j215, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i418) | (i418 & 458752), 72);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar2;
                    y2Var5 = y2Var3;
                    f25 = fN;
                    f18 = fN2;
                    j17 = j215;
                    y2Var4 = y2VarB;
                    j18 = j19;
                    f19 = f216;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f18 = f17;
                    mVar3 = mVar2;
                    y2Var4 = y2VarB;
                    y2Var5 = y2Var3;
                    f19 = fD;
                    j17 = j15;
                    j18 = j16;
                    f25 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.gr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            fD = f15;
            if ((i15 & 24576) == 0) {
                if ((i16 & 8) == 0) {
                    y2VarB = y2Var2;
                    if (rVarH.W(y2VarB)) {
                        i47 = 16384;
                    }
                    i17 |= i47;
                } else {
                    y2VarB = y2Var2;
                }
                i47 = PKIFailureInfo.certRevoked;
                i17 |= i47;
            } else {
                y2VarB = y2Var2;
            }
            if ((i15 & 196608) == 0) {
                if ((i16 & 16) == 0) {
                    i27 = i48;
                    if (rVarH.d(j15)) {
                        i46 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i46;
                } else {
                    i27 = i48;
                }
                i46 = PKIFailureInfo.notAuthorized;
                i17 |= i46;
            } else {
                i27 = i48;
            }
            if ((i15 & 1572864) != 0) {
                if ((i16 & 32) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i45;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.b(f16)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f17)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i17 |= i39;
                }
                i37 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i37 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    } else {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                    }
                    if (y2Var3 != null) {
                        rVarH.X(-1720514983);
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (p076m2.a3) objE;
                        c5.d dVar11 = (c5.d) rVarH.N(g1.f());
                        long jA12 = ((n3) rVarH.N(g1.v())).a();
                        m.Companion companion12 = m.INSTANCE;
                        if ((i38 & 14) != 4) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        m mVarU11 = J(companion12, a3Var, dVar11, jA12, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                        if (((57344 & i38) ^ 24576) <= 16384) {
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z19 | z17;
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        }
                        rVarH.R();
                        mVar4 = mVarU11;
                        y2Var6 = (qq) objE3;
                    } else {
                        rVarH.X(-1719869687);
                        rVarH.R();
                        mVar4 = mVar2;
                        y2Var6 = y2VarB;
                    }
                    final long j216 = j25;
                    float f217 = f26;
                    int i419 = i38 >> 9;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.r(f26, j216, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i419) | (i419 & 458752), 72);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar2;
                    y2Var5 = y2Var3;
                    f25 = fN;
                    f18 = fN2;
                    j17 = j216;
                    y2Var4 = y2VarB;
                    j18 = j19;
                    f19 = f217;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f18 = f17;
                    mVar3 = mVar2;
                    y2Var4 = y2VarB;
                    y2Var5 = y2Var3;
                    f19 = fD;
                    j17 = j15;
                    j18 = j16;
                    f25 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.gr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i17 |= i39;
            }
            i37 = i17;
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i37 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                } else {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                }
                if (y2Var3 != null) {
                    rVarH.X(-1720514983);
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (p076m2.a3) objE;
                    c5.d dVar12 = (c5.d) rVarH.N(g1.f());
                    long jA13 = ((n3) rVarH.N(g1.v())).a();
                    m.Companion companion13 = m.INSTANCE;
                    if ((i38 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    m mVarU12 = J(companion13, a3Var, dVar12, jA13, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                    if (((57344 & i38) ^ 24576) <= 16384) {
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    } else {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    }
                    rVarH.R();
                    mVar4 = mVarU12;
                    y2Var6 = (qq) objE3;
                } else {
                    rVarH.X(-1719869687);
                    rVarH.R();
                    mVar4 = mVar2;
                    y2Var6 = y2VarB;
                }
                final long j217 = j25;
                float f218 = f26;
                int i4110 = i38 >> 9;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.r(f26, j217, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i4110) | (i4110 & 458752), 72);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar2;
                y2Var5 = y2Var3;
                f25 = fN;
                f18 = fN2;
                j17 = j217;
                y2Var4 = y2VarB;
                j18 = j19;
                f19 = f218;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f18 = f17;
                mVar3 = mVar2;
                y2Var4 = y2VarB;
                y2Var5 = y2Var3;
                f19 = fD;
                j17 = j15;
                j18 = j16;
                f25 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.gr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        y2Var3 = y2Var;
        i25 = i16 & 4;
        if (i25 != 0) {
            if ((i15 & 3072) == 0) {
                fD = f15;
                if (rVarH.b(fD)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i17 |= i26;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 8) == 0) {
                    y2VarB = y2Var2;
                    if (rVarH.W(y2VarB)) {
                        i47 = 16384;
                    }
                    i17 |= i47;
                } else {
                    y2VarB = y2Var2;
                }
                i47 = PKIFailureInfo.certRevoked;
                i17 |= i47;
            } else {
                y2VarB = y2Var2;
            }
            if ((i15 & 196608) == 0) {
                if ((i16 & 16) == 0) {
                    i27 = i48;
                    if (rVarH.d(j15)) {
                        i46 = PKIFailureInfo.unsupportedVersion;
                    }
                    i17 |= i46;
                } else {
                    i27 = i48;
                }
                i46 = PKIFailureInfo.notAuthorized;
                i17 |= i46;
            } else {
                i27 = i48;
            }
            if ((i15 & 1572864) != 0) {
                if ((i16 & 32) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i45;
            }
            i28 = i16 & 64;
            if (i28 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.b(f16)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            i35 = i16 & 128;
            if (i35 != 0) {
                if ((i15 & 100663296) == 0) {
                    if (rVarH.b(f17)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.G(pVar)) {
                        i39 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i39 = 268435456;
                    }
                    i17 |= i39;
                }
                i37 = i17;
                if ((i17 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i37 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    } else {
                        if (i27 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            y2Var3 = null;
                        }
                        if (i25 != 0) {
                            fD = rq.f57659a.d();
                        }
                        if ((i16 & 8) != 0) {
                            i37 &= -57345;
                            y2VarB = rq.f57659a.b(rVarH, 6);
                        }
                        if ((i16 & 16) != 0) {
                            jC = rq.f57659a.c(rVarH, 6);
                            i37 &= -458753;
                        } else {
                            jC = j15;
                        }
                        if ((i16 & 32) != 0) {
                            jA = rq.f57659a.a(rVarH, 6);
                            i37 &= -3670017;
                        } else {
                            jA = j16;
                        }
                        if (i28 != 0) {
                            fN = h.n(0);
                        } else {
                            fN = f16;
                        }
                        if (i35 != 0) {
                            fN2 = h.n(0);
                        } else {
                            fN2 = f17;
                        }
                        f26 = fD;
                        i38 = i37;
                        j19 = jA;
                        j25 = jC;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                    }
                    if (y2Var3 != null) {
                        rVarH.X(-1720514983);
                        objE = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE == companion.a()) {
                            objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                            rVarH.v(objE);
                        }
                        a3Var = (p076m2.a3) objE;
                        c5.d dVar13 = (c5.d) rVarH.N(g1.f());
                        long jA14 = ((n3) rVarH.N(g1.v())).a();
                        m.Companion companion14 = m.INSTANCE;
                        if ((i38 & 14) != 4) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE2 = rVarH.E();
                        if (z16) {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new l() { // from class: f2.er
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return hr.q(jrVar, (y0) obj);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        m mVarU13 = J(companion14, a3Var, dVar13, jA14, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                        if (((57344 & i38) ^ 24576) <= 16384) {
                        }
                        if ((i38 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z19 | z17;
                        objE3 = rVarH.E();
                        if (z18) {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        } else {
                            objE3 = new qq(a3Var, y2VarB, y2Var3);
                            rVarH.v(objE3);
                        }
                        rVarH.R();
                        mVar4 = mVarU13;
                        y2Var6 = (qq) objE3;
                    } else {
                        rVarH.X(-1719869687);
                        rVarH.R();
                        mVar4 = mVar2;
                        y2Var6 = y2VarB;
                    }
                    final long j218 = j25;
                    float f219 = f26;
                    int i4111 = i38 >> 9;
                    rVar2 = rVarH;
                    androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.r(f26, j218, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i4111) | (i4111 & 458752), 72);
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar2;
                    y2Var5 = y2Var3;
                    f25 = fN;
                    f18 = fN2;
                    j17 = j218;
                    y2Var4 = y2VarB;
                    j18 = j19;
                    f19 = f219;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f18 = f17;
                    mVar3 = mVar2;
                    y2Var4 = y2VarB;
                    y2Var5 = y2Var3;
                    f19 = fD;
                    j17 = j15;
                    j18 = j16;
                    f25 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.gr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 100663296;
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i17 |= i39;
            }
            i37 = i17;
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i37 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                } else {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                }
                if (y2Var3 != null) {
                    rVarH.X(-1720514983);
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (p076m2.a3) objE;
                    c5.d dVar14 = (c5.d) rVarH.N(g1.f());
                    long jA15 = ((n3) rVarH.N(g1.v())).a();
                    m.Companion companion15 = m.INSTANCE;
                    if ((i38 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    m mVarU14 = J(companion15, a3Var, dVar14, jA15, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                    if (((57344 & i38) ^ 24576) <= 16384) {
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    } else {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    }
                    rVarH.R();
                    mVar4 = mVarU14;
                    y2Var6 = (qq) objE3;
                } else {
                    rVarH.X(-1719869687);
                    rVarH.R();
                    mVar4 = mVar2;
                    y2Var6 = y2VarB;
                }
                final long j219 = j25;
                float f2110 = f26;
                int i4112 = i38 >> 9;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.r(f26, j219, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i4112) | (i4112 & 458752), 72);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar2;
                y2Var5 = y2Var3;
                f25 = fN;
                f18 = fN2;
                j17 = j219;
                y2Var4 = y2VarB;
                j18 = j19;
                f19 = f2110;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f18 = f17;
                mVar3 = mVar2;
                y2Var4 = y2VarB;
                y2Var5 = y2Var3;
                f19 = fD;
                j17 = j15;
                j18 = j16;
                f25 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.gr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        fD = f15;
        if ((i15 & 24576) == 0) {
            if ((i16 & 8) == 0) {
                y2VarB = y2Var2;
                if (rVarH.W(y2VarB)) {
                    i47 = 16384;
                }
                i17 |= i47;
            } else {
                y2VarB = y2Var2;
            }
            i47 = PKIFailureInfo.certRevoked;
            i17 |= i47;
        } else {
            y2VarB = y2Var2;
        }
        if ((i15 & 196608) == 0) {
            if ((i16 & 16) == 0) {
                i27 = i48;
                if (rVarH.d(j15)) {
                    i46 = PKIFailureInfo.unsupportedVersion;
                }
                i17 |= i46;
            } else {
                i27 = i48;
            }
            i46 = PKIFailureInfo.notAuthorized;
            i17 |= i46;
        } else {
            i27 = i48;
        }
        if ((i15 & 1572864) != 0) {
            if ((i16 & 32) == 0) {
                i45 = PKIFailureInfo.signerNotTrusted;
            } else {
                i45 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i45;
        }
        i28 = i16 & 64;
        if (i28 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.b(f16)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i17 |= i29;
        }
        i35 = i16 & 128;
        if (i35 != 0) {
            if ((i15 & 100663296) == 0) {
                if (rVarH.b(f17)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.G(pVar)) {
                    i39 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i39 = 268435456;
                }
                i17 |= i39;
            }
            i37 = i17;
            if ((i17 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i37 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                } else {
                    if (i27 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        y2Var3 = null;
                    }
                    if (i25 != 0) {
                        fD = rq.f57659a.d();
                    }
                    if ((i16 & 8) != 0) {
                        i37 &= -57345;
                        y2VarB = rq.f57659a.b(rVarH, 6);
                    }
                    if ((i16 & 16) != 0) {
                        jC = rq.f57659a.c(rVarH, 6);
                        i37 &= -458753;
                    } else {
                        jC = j15;
                    }
                    if ((i16 & 32) != 0) {
                        jA = rq.f57659a.a(rVarH, 6);
                        i37 &= -3670017;
                    } else {
                        jA = j16;
                    }
                    if (i28 != 0) {
                        fN = h.n(0);
                    } else {
                        fN = f16;
                    }
                    if (i35 != 0) {
                        fN2 = h.n(0);
                    } else {
                        fN2 = f17;
                    }
                    f26 = fD;
                    i38 = i37;
                    j19 = jA;
                    j25 = jC;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
                }
                if (y2Var3 != null) {
                    rVarH.X(-1720514983);
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                        rVarH.v(objE);
                    }
                    a3Var = (p076m2.a3) objE;
                    c5.d dVar15 = (c5.d) rVarH.N(g1.f());
                    long jA16 = ((n3) rVarH.N(g1.v())).a();
                    m.Companion companion16 = m.INSTANCE;
                    if ((i38 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE2 = rVarH.E();
                    if (z16) {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new l() { // from class: f2.er
                            @Override // er.l
                            public final Object b(Object obj) {
                                return hr.q(jrVar, (y0) obj);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    m mVarU15 = J(companion16, a3Var, dVar15, jA16, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                    if (((57344 & i38) ^ 24576) <= 16384) {
                    }
                    if ((i38 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z19 | z17;
                    objE3 = rVarH.E();
                    if (z18) {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    } else {
                        objE3 = new qq(a3Var, y2VarB, y2Var3);
                        rVarH.v(objE3);
                    }
                    rVarH.R();
                    mVar4 = mVarU15;
                    y2Var6 = (qq) objE3;
                } else {
                    rVarH.X(-1719869687);
                    rVarH.R();
                    mVar4 = mVar2;
                    y2Var6 = y2VarB;
                }
                final long j2110 = j25;
                float f2111 = f26;
                int i4113 = i38 >> 9;
                rVar2 = rVarH;
                androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.r(f26, j2110, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i4113) | (i4113 & 458752), 72);
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar2;
                y2Var5 = y2Var3;
                f25 = fN;
                f18 = fN2;
                j17 = j2110;
                y2Var4 = y2VarB;
                j18 = j19;
                f19 = f2111;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f18 = f17;
                mVar3 = mVar2;
                y2Var4 = y2VarB;
                y2Var5 = y2Var3;
                f19 = fD;
                j17 = j15;
                j18 = j16;
                f25 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.gr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 100663296;
        if ((i15 & 805306368) == 0) {
            if (rVarH.G(pVar)) {
                i39 = PKIFailureInfo.duplicateCertReq;
            } else {
                i39 = 268435456;
            }
            i17 |= i39;
        }
        i37 = i17;
        if ((i17 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i37 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i27 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    y2Var3 = null;
                }
                if (i25 != 0) {
                    fD = rq.f57659a.d();
                }
                if ((i16 & 8) != 0) {
                    i37 &= -57345;
                    y2VarB = rq.f57659a.b(rVarH, 6);
                }
                if ((i16 & 16) != 0) {
                    jC = rq.f57659a.c(rVarH, 6);
                    i37 &= -458753;
                } else {
                    jC = j15;
                }
                if ((i16 & 32) != 0) {
                    jA = rq.f57659a.a(rVarH, 6);
                    i37 &= -3670017;
                } else {
                    jA = j16;
                }
                if (i28 != 0) {
                    fN = h.n(0);
                } else {
                    fN = f16;
                }
                if (i35 != 0) {
                    fN2 = h.n(0);
                } else {
                    fN2 = f17;
                }
                f26 = fD;
                i38 = i37;
                j19 = jA;
                j25 = jC;
            } else {
                if (i27 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    y2Var3 = null;
                }
                if (i25 != 0) {
                    fD = rq.f57659a.d();
                }
                if ((i16 & 8) != 0) {
                    i37 &= -57345;
                    y2VarB = rq.f57659a.b(rVarH, 6);
                }
                if ((i16 & 16) != 0) {
                    jC = rq.f57659a.c(rVarH, 6);
                    i37 &= -458753;
                } else {
                    jC = j15;
                }
                if ((i16 & 32) != 0) {
                    jA = rq.f57659a.a(rVarH, 6);
                    i37 &= -3670017;
                } else {
                    jA = j16;
                }
                if (i28 != 0) {
                    fN = h.n(0);
                } else {
                    fN = f16;
                }
                if (i35 != 0) {
                    fN2 = h.n(0);
                } else {
                    fN2 = f17;
                }
                f26 = fD;
                i38 = i37;
                j19 = jA;
                j25 = jC;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-343758958, i38, -1, "androidx.compose.material3.PlainTooltip (Tooltip.kt:325)");
            }
            if (y2Var3 != null) {
                rVarH.X(-1720514983);
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = c6.e(g2.a(g2.c(null, 1, null)), null, 2, null);
                    rVarH.v(objE);
                }
                a3Var = (p076m2.a3) objE;
                c5.d dVar16 = (c5.d) rVarH.N(g1.f());
                long jA17 = ((n3) rVarH.N(g1.v())).a();
                m.Companion companion17 = m.INSTANCE;
                if ((i38 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objE2 = rVarH.E();
                if (z16) {
                    objE2 = new l() { // from class: f2.er
                        @Override // er.l
                        public final Object b(Object obj) {
                            return hr.q(jrVar, (y0) obj);
                        }
                    };
                    rVarH.v(objE2);
                } else {
                    objE2 = new l() { // from class: f2.er
                        @Override // er.l
                        public final Object b(Object obj) {
                            return hr.q(jrVar, (y0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarU16 = J(companion17, a3Var, dVar16, jA17, (l) objE2, jrVar.getPositionProvider()).u(mVar2);
                if (((57344 & i38) ^ 24576) <= 16384) {
                }
                if ((i38 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z19 | z17;
                objE3 = rVarH.E();
                if (z18) {
                    objE3 = new qq(a3Var, y2VarB, y2Var3);
                    rVarH.v(objE3);
                } else {
                    objE3 = new qq(a3Var, y2VarB, y2Var3);
                    rVarH.v(objE3);
                }
                rVarH.R();
                mVar4 = mVarU16;
                y2Var6 = (qq) objE3;
            } else {
                rVarH.X(-1719869687);
                rVarH.R();
                mVar4 = mVar2;
                y2Var6 = y2VarB;
            }
            final long j2111 = j25;
            float f2112 = f26;
            int i4114 = i38 >> 9;
            rVar2 = rVarH;
            androidx.compose.material3.l.g(mVar4, y2Var6, j19, 0L, fN, fN2, null, y2.m.d(-1573998995, true, new p() { // from class: f2.fr
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hr.r(f26, j2111, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, ((i38 >> 12) & 896) | 12582912 | (57344 & i4114) | (i4114 & 458752), 72);
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar2;
            y2Var5 = y2Var3;
            f25 = fN;
            f18 = fN2;
            j17 = j2111;
            y2Var4 = y2VarB;
            j18 = j19;
            f19 = f2112;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            f18 = f17;
            mVar3 = mVar2;
            y2Var4 = y2VarB;
            y2Var5 = y2Var3;
            f19 = fD;
            j17 = j15;
            j18 = j16;
            f25 = f16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.gr
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hr.s(jrVar, mVar3, y2Var5, f19, y2Var4, j17, j18, f25, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 q(jr jrVar, y0 y0Var) {
        return jrVar.b(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(float f15, long j15, p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1573998995, i15, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.kt:357)");
            }
            m mVarL = a3.l(androidx.compose.foundation.layout.d.x(m.INSTANCE, f56162c, f56161b, f15, 0.0f, 8, null), f56165f);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarL);
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
            d0.d(new c4[]{h4.a().d(Color.m0boximpl(j15)), oo.q().d(ds.e(p0.f115149a.d(), rVar, 6))}, pVar, rVar, c4.f122821i);
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
    public static final i0 s(jr jrVar, m mVar, y2 y2Var, float f15, y2 y2Var2, long j15, long j16, float f16, float f17, p pVar, int i15, int i16, r rVar, int i17) {
        p(jrVar, mVar, y2Var, f15, y2Var2, j15, j16, f16, f17, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:109:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x019e  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:132:0x0205  */
    /* JADX WARN: Code duplicated, block: B:134:0x020d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0218  */
    /* JADX WARN: Code duplicated, block: B:144:0x0236  */
    /* JADX WARN: Code duplicated, block: B:147:0x025d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0266  */
    /* JADX WARN: Code duplicated, block: B:150:0x0269  */
    /* JADX WARN: Code duplicated, block: B:153:0x0272  */
    /* JADX WARN: Code duplicated, block: B:156:0x0286  */
    /* JADX WARN: Code duplicated, block: B:158:0x028c  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:173:0x02de  */
    /* JADX WARN: Code duplicated, block: B:176:0x0312  */
    /* JADX WARN: Code duplicated, block: B:178:0x0322  */
    /* JADX WARN: Code duplicated, block: B:180:0x0328  */
    /* JADX WARN: Code duplicated, block: B:182:0x0330  */
    /* JADX WARN: Code duplicated, block: B:183:0x0336  */
    /* JADX WARN: Code duplicated, block: B:191:0x034f  */
    /* JADX WARN: Code duplicated, block: B:194:0x036e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0377  */
    /* JADX WARN: Code duplicated, block: B:197:0x037a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0381  */
    /* JADX WARN: Code duplicated, block: B:203:0x0395  */
    /* JADX WARN: Code duplicated, block: B:205:0x039b  */
    /* JADX WARN: Code duplicated, block: B:208:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:214:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:217:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:222:0x045a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0463  */
    /* JADX WARN: Code duplicated, block: B:227:0x0472  */
    /* JADX WARN: Code duplicated, block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    public static final void t(final androidx.compose.ui.window.t tVar, final q<? super jr, ? super r, ? super Integer, i0> qVar, final lr lrVar, m mVar, er.a<i0> aVar, boolean z15, boolean z16, boolean z17, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        er.a<i0> aVar2;
        int i19;
        int i25;
        final boolean z18;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        boolean z19;
        final boolean z25;
        final boolean z26;
        final m mVar3;
        final er.a<i0> aVar3;
        d5 d5VarM;
        er.a<i0> aVar4;
        boolean z27;
        boolean z28;
        k2 k2VarY;
        Object objE;
        r.Companion companion;
        final p076m2.a3 a3Var;
        Object objE2;
        Object objE3;
        final p076m2.a3 a3Var2;
        Object objE4;
        Object objP;
        boolean zBooleanValue;
        float f15;
        boolean zW;
        Object objE5;
        boolean zBooleanValue2;
        byte b15;
        float f16;
        boolean zW2;
        Object objE6;
        Object objP2;
        boolean zBooleanValue3;
        float f17;
        boolean zW3;
        Object objE7;
        boolean zBooleanValue4;
        float f18;
        boolean zW4;
        Object objE8;
        boolean zW5;
        c3.l.Companion companion2;
        c3.l lVarD;
        l<Object, i0> lVarG;
        c3.l lVarE;
        boolean zW6;
        c3.l.Companion companion3;
        c3.l lVarD2;
        l<Object, i0> lVarG2;
        c3.l lVarE2;
        int i36;
        r rVarH = rVar.h(-293753984);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(tVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(qVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= (i15 & 512) == 0 ? rVarH.W(lrVar) : rVarH.G(lrVar) ? 256 : 128;
        }
        int i37 = i16 & 8;
        if (i37 == 0) {
            if ((i15 & 3072) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 2048 : 1024;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    i17 |= 196608;
                    z18 = z15;
                } else {
                    z18 = z15;
                    if ((i15 & 196608) == 0) {
                        if (rVarH.a(z18)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                } else if ((i15 & 1572864) == 0) {
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.a(z17)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.G(pVar)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i17 |= i36;
                }
                if ((i17 & 38347923) != 38347922) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i17 & 1)) {
                    if (i37 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i25 != 0) {
                        z18 = false;
                    }
                    boolean z29 = z18;
                    if (i27 != 0) {
                        z27 = true;
                    } else {
                        z27 = z16;
                    }
                    if (i29 != 0) {
                        z28 = false;
                    } else {
                        z28 = z17;
                    }
                    if (t.k()) {
                        t.o(-293753984, i17, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:170)");
                    }
                    k2VarY = v2.y(lrVar.c(), "tooltip transition", rVarH, d1.f193575d | 48, 0);
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        p076m2.a3 a3VarE = c6.e(null, null, 2, null);
                        rVarH.v(a3VarE);
                        objE = a3VarE;
                    }
                    a3Var = (p076m2.a3) objE;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = new kr(new er.a() { // from class: f2.sq
                            @Override // er.a
                            public final Object a() {
                                return hr.u(a3Var);
                            }
                        }, tVar);
                        rVarH.v(objE2);
                    }
                    final kr krVar = (kr) objE2;
                    f fVarD = y2.m.d(-23901870, true, new p() { // from class: f2.yq
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.A(a3Var, pVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    objE3 = rVarH.E();
                    if (objE3 == companion.a()) {
                        objE3 = c6.e(null, null, 2, null);
                        rVarH.v(objE3);
                    }
                    a3Var2 = (p076m2.a3) objE3;
                    objE4 = rVarH.E();
                    if (objE4 == companion.a()) {
                        objE4 = x5.d(new er.a() { // from class: f2.zq
                            @Override // er.a
                            public final Object a() {
                                return Integer.valueOf(hr.C(a3Var, a3Var2));
                            }
                        });
                        rVarH.v(objE4);
                    }
                    final f6 f6Var = (f6) objE4;
                    final j0 j0VarB = of.b(k0.FastSpatial, rVarH, 6);
                    final j0 j0VarB2 = of.b(k0.FastEffects, rVarH, 6);
                    q qVar2 = new q() { // from class: f2.ar
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return hr.E(j0VarB, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    };
                    fr.m mVar4 = fr.m.f66405a;
                    u0.y2<Float, u0.p> y2VarP = s3.P(mVar4);
                    if (k2VarY.B()) {
                        a3Var2 = a3Var2;
                        z27 = z27;
                        z28 = z28;
                        rVarH.X(1666827533);
                        rVarH.R();
                        objP = k2VarY.p();
                    } else {
                        rVarH.X(1666573488);
                        zW6 = rVarH.W(k2VarY);
                        objP = rVarH.E();
                        if (!zW6 || objP == companion.a()) {
                            companion3 = c3.l.INSTANCE;
                            lVarD2 = companion3.d();
                            if (lVarD2 != null) {
                                lVarG2 = lVarD2.g();
                            } else {
                                lVarG2 = null;
                            }
                            lVarE2 = companion3.e(lVarD2);
                            try {
                                Object objP3 = k2VarY.p();
                                companion3.l(lVarD2, lVarE2, lVarG2);
                                rVarH.v(objP3);
                                objP = objP3;
                            } catch (Throwable th4) {
                                companion3.l(lVarD2, lVarE2, lVarG2);
                                throw th4;
                            }
                        } else {
                            a3Var2 = a3Var2;
                        }
                        rVarH.R();
                    }
                    zBooleanValue = ((Boolean) objP).booleanValue();
                    rVarH.X(838300572);
                    if (t.k()) {
                        t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                    }
                    if (zBooleanValue) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.8f;
                    }
                    if (t.k()) {
                        t.n();
                    }
                    rVarH.R();
                    Float fValueOf = Float.valueOf(f15);
                    zW = rVarH.W(k2VarY);
                    objE5 = rVarH.E();
                    if (zW || objE5 == companion.a()) {
                        objE5 = x5.d(new a(k2VarY));
                        rVarH.v(objE5);
                    }
                    zBooleanValue2 = ((Boolean) ((f6) objE5).getValue()).booleanValue();
                    rVarH.X(838300572);
                    if (t.k()) {
                        b15 = -1;
                        t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                    } else {
                        b15 = -1;
                    }
                    if (zBooleanValue2) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.8f;
                    }
                    if (t.k()) {
                        t.n();
                    }
                    rVarH.R();
                    Float fValueOf2 = Float.valueOf(f16);
                    zW2 = rVarH.W(k2VarY);
                    objE6 = rVarH.E();
                    if (zW2 || objE6 == companion.a()) {
                        objE6 = x5.d(new b(k2VarY));
                        rVarH.v(objE6);
                    }
                    final f6 f6VarR = v2.r(k2VarY, fValueOf, fValueOf2, (j0) qVar2.w(((f6) objE6).getValue(), rVarH, 0), y2VarP, "tooltip transition: scaling", rVarH, 196608);
                    q qVar3 = new q() { // from class: f2.br
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return hr.G(j0VarB2, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    };
                    u0.y2<Float, u0.p> y2VarP2 = s3.P(mVar4);
                    if (k2VarY.B()) {
                        rVarH.X(1666827533);
                        rVarH.R();
                        objP2 = k2VarY.p();
                    } else {
                        rVarH.X(1666573488);
                        zW5 = rVarH.W(k2VarY);
                        objP2 = rVarH.E();
                        if (zW5 || objP2 == companion.a()) {
                            companion2 = c3.l.INSTANCE;
                            lVarD = companion2.d();
                            if (lVarD != null) {
                                lVarG = lVarD.g();
                            } else {
                                lVarG = null;
                            }
                            lVarE = companion2.e(lVarD);
                            try {
                                Object objP4 = k2VarY.p();
                                companion2.l(lVarD, lVarE, lVarG);
                                rVarH.v(objP4);
                                objP2 = objP4;
                            } catch (Throwable th5) {
                                companion2.l(lVarD, lVarE, lVarG);
                                throw th5;
                            }
                        }
                        rVarH.R();
                    }
                    zBooleanValue3 = ((Boolean) objP2).booleanValue();
                    rVarH.X(-1903393104);
                    if (t.k()) {
                        t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                    }
                    if (zBooleanValue3) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    if (t.k()) {
                        t.n();
                    }
                    rVarH.R();
                    Float fValueOf3 = Float.valueOf(f17);
                    zW3 = rVarH.W(k2VarY);
                    objE7 = rVarH.E();
                    if (zW3 || objE7 == companion.a()) {
                        objE7 = x5.d(new c(k2VarY));
                        rVarH.v(objE7);
                    }
                    zBooleanValue4 = ((Boolean) ((f6) objE7).getValue()).booleanValue();
                    rVarH.X(-1903393104);
                    if (t.k()) {
                        t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                    }
                    if (zBooleanValue4) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    if (t.k()) {
                        t.n();
                    }
                    rVarH.R();
                    Float fValueOf4 = Float.valueOf(f18);
                    zW4 = rVarH.W(k2VarY);
                    objE8 = rVarH.E();
                    if (zW4 || objE8 == companion.a()) {
                        objE8 = x5.d(new d(k2VarY));
                        rVarH.v(objE8);
                    }
                    final f6 f6VarR2 = v2.r(k2VarY, fValueOf3, fValueOf4, (j0) qVar3.w(((f6) objE8).getValue(), rVarH, 0), y2VarP2, "tooltip transition: alpha", rVarH, 196608);
                    final p076m2.a3 a3Var3 = a3Var2;
                    m mVar5 = mVar2;
                    er.a<i0> aVar5 = aVar4;
                    boolean z35 = z27;
                    boolean z36 = z28;
                    h0.k(tVar, y2.m.d(-527401546, true, new p() { // from class: f2.cr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.w(a3Var3, f6VarR, f6VarR2, f6Var, qVar, krVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), lrVar, mVar5, aVar5, z29, z35, z36, fVarD, rVarH, (i17 & 14) | 100663344 | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17), 0);
                    if (t.k()) {
                        t.n();
                    }
                    z26 = z36;
                    z25 = z35;
                    z18 = z29;
                    aVar3 = aVar5;
                    mVar3 = mVar5;
                } else {
                    rVarH.O();
                    z25 = z16;
                    z26 = z17;
                    mVar3 = mVar2;
                    aVar3 = aVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.dr
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return hr.z(tVar, qVar, lrVar, mVar3, aVar3, z18, z25, z26, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            aVar2 = aVar;
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
                z18 = z15;
            } else {
                z18 = z15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z18)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.a(z17)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(pVar)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            if ((i17 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i37 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                boolean z210 = z18;
                if (i27 != 0) {
                    z27 = true;
                } else {
                    z27 = z16;
                }
                if (i29 != 0) {
                    z28 = false;
                } else {
                    z28 = z17;
                }
                if (t.k()) {
                    t.o(-293753984, i17, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:170)");
                }
                k2VarY = v2.y(lrVar.c(), "tooltip transition", rVarH, d1.f193575d | 48, 0);
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    p076m2.a3 a3VarE2 = c6.e(null, null, 2, null);
                    rVarH.v(a3VarE2);
                    objE = a3VarE2;
                }
                a3Var = (p076m2.a3) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new kr(new er.a() { // from class: f2.sq
                        @Override // er.a
                        public final Object a() {
                            return hr.u(a3Var);
                        }
                    }, tVar);
                    rVarH.v(objE2);
                }
                final kr krVar2 = (kr) objE2;
                f fVarD2 = y2.m.d(-23901870, true, new p() { // from class: f2.yq
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.A(a3Var, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = c6.e(null, null, 2, null);
                    rVarH.v(objE3);
                }
                a3Var2 = (p076m2.a3) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = x5.d(new er.a() { // from class: f2.zq
                        @Override // er.a
                        public final Object a() {
                            return Integer.valueOf(hr.C(a3Var, a3Var2));
                        }
                    });
                    rVarH.v(objE4);
                }
                final f6 f6Var2 = (f6) objE4;
                final j0 j0VarB3 = of.b(k0.FastSpatial, rVarH, 6);
                final j0 j0VarB4 = of.b(k0.FastEffects, rVarH, 6);
                q qVar4 = new q() { // from class: f2.ar
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return hr.E(j0VarB3, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                };
                fr.m mVar6 = fr.m.f66405a;
                u0.y2<Float, u0.p> y2VarP3 = s3.P(mVar6);
                if (k2VarY.B()) {
                    rVarH.X(1666573488);
                    zW6 = rVarH.W(k2VarY);
                    objP = rVarH.E();
                    if (zW6) {
                        companion3 = c3.l.INSTANCE;
                        lVarD2 = companion3.d();
                        if (lVarD2 != null) {
                            lVarG2 = lVarD2.g();
                        } else {
                            lVarG2 = null;
                        }
                        lVarE2 = companion3.e(lVarD2);
                        Object objP5 = k2VarY.p();
                        companion3.l(lVarD2, lVarE2, lVarG2);
                        rVarH.v(objP5);
                        objP = objP5;
                    } else {
                        companion3 = c3.l.INSTANCE;
                        lVarD2 = companion3.d();
                        if (lVarD2 != null) {
                            lVarG2 = lVarD2.g();
                        } else {
                            lVarG2 = null;
                        }
                        lVarE2 = companion3.e(lVarD2);
                        Object objP6 = k2VarY.p();
                        companion3.l(lVarD2, lVarE2, lVarG2);
                        rVarH.v(objP6);
                        objP = objP6;
                    }
                    rVarH.R();
                } else {
                    a3Var2 = a3Var2;
                    z27 = z27;
                    z28 = z28;
                    rVarH.X(1666827533);
                    rVarH.R();
                    objP = k2VarY.p();
                }
                zBooleanValue = ((Boolean) objP).booleanValue();
                rVarH.X(838300572);
                if (t.k()) {
                    t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                }
                if (zBooleanValue) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.8f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf5 = Float.valueOf(f15);
                zW = rVarH.W(k2VarY);
                objE5 = rVarH.E();
                if (zW) {
                    objE5 = x5.d(new a(k2VarY));
                    rVarH.v(objE5);
                } else {
                    objE5 = x5.d(new a(k2VarY));
                    rVarH.v(objE5);
                }
                zBooleanValue2 = ((Boolean) ((f6) objE5).getValue()).booleanValue();
                rVarH.X(838300572);
                if (t.k()) {
                    b15 = -1;
                    t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                } else {
                    b15 = -1;
                }
                if (zBooleanValue2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.8f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf6 = Float.valueOf(f16);
                zW2 = rVarH.W(k2VarY);
                objE6 = rVarH.E();
                if (zW2) {
                    objE6 = x5.d(new b(k2VarY));
                    rVarH.v(objE6);
                } else {
                    objE6 = x5.d(new b(k2VarY));
                    rVarH.v(objE6);
                }
                final f6 f6VarR3 = v2.r(k2VarY, fValueOf5, fValueOf6, (j0) qVar4.w(((f6) objE6).getValue(), rVarH, 0), y2VarP3, "tooltip transition: scaling", rVarH, 196608);
                q qVar5 = new q() { // from class: f2.br
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return hr.G(j0VarB4, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                };
                u0.y2<Float, u0.p> y2VarP4 = s3.P(mVar6);
                if (k2VarY.B()) {
                    rVarH.X(1666573488);
                    zW5 = rVarH.W(k2VarY);
                    objP2 = rVarH.E();
                    if (zW5) {
                        companion2 = c3.l.INSTANCE;
                        lVarD = companion2.d();
                        if (lVarD != null) {
                            lVarG = lVarD.g();
                        } else {
                            lVarG = null;
                        }
                        lVarE = companion2.e(lVarD);
                        Object objP7 = k2VarY.p();
                        companion2.l(lVarD, lVarE, lVarG);
                        rVarH.v(objP7);
                        objP2 = objP7;
                    } else {
                        companion2 = c3.l.INSTANCE;
                        lVarD = companion2.d();
                        if (lVarD != null) {
                            lVarG = lVarD.g();
                        } else {
                            lVarG = null;
                        }
                        lVarE = companion2.e(lVarD);
                        Object objP8 = k2VarY.p();
                        companion2.l(lVarD, lVarE, lVarG);
                        rVarH.v(objP8);
                        objP2 = objP8;
                    }
                    rVarH.R();
                } else {
                    rVarH.X(1666827533);
                    rVarH.R();
                    objP2 = k2VarY.p();
                }
                zBooleanValue3 = ((Boolean) objP2).booleanValue();
                rVarH.X(-1903393104);
                if (t.k()) {
                    t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                }
                if (zBooleanValue3) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf7 = Float.valueOf(f17);
                zW3 = rVarH.W(k2VarY);
                objE7 = rVarH.E();
                if (zW3) {
                    objE7 = x5.d(new c(k2VarY));
                    rVarH.v(objE7);
                } else {
                    objE7 = x5.d(new c(k2VarY));
                    rVarH.v(objE7);
                }
                zBooleanValue4 = ((Boolean) ((f6) objE7).getValue()).booleanValue();
                rVarH.X(-1903393104);
                if (t.k()) {
                    t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                }
                if (zBooleanValue4) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf8 = Float.valueOf(f18);
                zW4 = rVarH.W(k2VarY);
                objE8 = rVarH.E();
                if (zW4) {
                    objE8 = x5.d(new d(k2VarY));
                    rVarH.v(objE8);
                } else {
                    objE8 = x5.d(new d(k2VarY));
                    rVarH.v(objE8);
                }
                final f6 f6VarR4 = v2.r(k2VarY, fValueOf7, fValueOf8, (j0) qVar5.w(((f6) objE8).getValue(), rVarH, 0), y2VarP4, "tooltip transition: alpha", rVarH, 196608);
                final p076m2.a3 a3Var4 = a3Var2;
                m mVar7 = mVar2;
                er.a<i0> aVar6 = aVar4;
                boolean z37 = z27;
                boolean z38 = z28;
                h0.k(tVar, y2.m.d(-527401546, true, new p() { // from class: f2.cr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.w(a3Var4, f6VarR3, f6VarR4, f6Var2, qVar, krVar2, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), lrVar, mVar7, aVar6, z210, z37, z38, fVarD2, rVarH, (i17 & 14) | 100663344 | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17), 0);
                if (t.k()) {
                    t.n();
                }
                z26 = z38;
                z25 = z37;
                z18 = z210;
                aVar3 = aVar6;
                mVar3 = mVar7;
            } else {
                rVarH.O();
                z25 = z16;
                z26 = z17;
                mVar3 = mVar2;
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.dr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.z(tVar, qVar, lrVar, mVar3, aVar3, z18, z25, z26, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        mVar2 = mVar;
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                aVar2 = aVar;
                if (rVarH.G(aVar2)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
                z18 = z15;
            } else {
                z18 = z15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z18)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
            } else if ((i15 & 1572864) == 0) {
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.a(z17)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.G(pVar)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i17 |= i36;
            }
            if ((i17 & 38347923) != 38347922) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (rVarH.r(z19, i17 & 1)) {
                if (i37 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i25 != 0) {
                    z18 = false;
                }
                boolean z211 = z18;
                if (i27 != 0) {
                    z27 = true;
                } else {
                    z27 = z16;
                }
                if (i29 != 0) {
                    z28 = false;
                } else {
                    z28 = z17;
                }
                if (t.k()) {
                    t.o(-293753984, i17, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:170)");
                }
                k2VarY = v2.y(lrVar.c(), "tooltip transition", rVarH, d1.f193575d | 48, 0);
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    p076m2.a3 a3VarE3 = c6.e(null, null, 2, null);
                    rVarH.v(a3VarE3);
                    objE = a3VarE3;
                }
                a3Var = (p076m2.a3) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new kr(new er.a() { // from class: f2.sq
                        @Override // er.a
                        public final Object a() {
                            return hr.u(a3Var);
                        }
                    }, tVar);
                    rVarH.v(objE2);
                }
                final kr krVar3 = (kr) objE2;
                f fVarD3 = y2.m.d(-23901870, true, new p() { // from class: f2.yq
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.A(a3Var, pVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = c6.e(null, null, 2, null);
                    rVarH.v(objE3);
                }
                a3Var2 = (p076m2.a3) objE3;
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = x5.d(new er.a() { // from class: f2.zq
                        @Override // er.a
                        public final Object a() {
                            return Integer.valueOf(hr.C(a3Var, a3Var2));
                        }
                    });
                    rVarH.v(objE4);
                }
                final f6 f6Var3 = (f6) objE4;
                final j0 j0VarB5 = of.b(k0.FastSpatial, rVarH, 6);
                final j0 j0VarB6 = of.b(k0.FastEffects, rVarH, 6);
                q qVar6 = new q() { // from class: f2.ar
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return hr.E(j0VarB5, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                };
                fr.m mVar8 = fr.m.f66405a;
                u0.y2<Float, u0.p> y2VarP5 = s3.P(mVar8);
                if (k2VarY.B()) {
                    rVarH.X(1666573488);
                    zW6 = rVarH.W(k2VarY);
                    objP = rVarH.E();
                    if (zW6) {
                        companion3 = c3.l.INSTANCE;
                        lVarD2 = companion3.d();
                        if (lVarD2 != null) {
                            lVarG2 = lVarD2.g();
                        } else {
                            lVarG2 = null;
                        }
                        lVarE2 = companion3.e(lVarD2);
                        Object objP9 = k2VarY.p();
                        companion3.l(lVarD2, lVarE2, lVarG2);
                        rVarH.v(objP9);
                        objP = objP9;
                    } else {
                        companion3 = c3.l.INSTANCE;
                        lVarD2 = companion3.d();
                        if (lVarD2 != null) {
                            lVarG2 = lVarD2.g();
                        } else {
                            lVarG2 = null;
                        }
                        lVarE2 = companion3.e(lVarD2);
                        Object objP10 = k2VarY.p();
                        companion3.l(lVarD2, lVarE2, lVarG2);
                        rVarH.v(objP10);
                        objP = objP10;
                    }
                    rVarH.R();
                } else {
                    a3Var2 = a3Var2;
                    z27 = z27;
                    z28 = z28;
                    rVarH.X(1666827533);
                    rVarH.R();
                    objP = k2VarY.p();
                }
                zBooleanValue = ((Boolean) objP).booleanValue();
                rVarH.X(838300572);
                if (t.k()) {
                    t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                }
                if (zBooleanValue) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.8f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf9 = Float.valueOf(f15);
                zW = rVarH.W(k2VarY);
                objE5 = rVarH.E();
                if (zW) {
                    objE5 = x5.d(new a(k2VarY));
                    rVarH.v(objE5);
                } else {
                    objE5 = x5.d(new a(k2VarY));
                    rVarH.v(objE5);
                }
                zBooleanValue2 = ((Boolean) ((f6) objE5).getValue()).booleanValue();
                rVarH.X(838300572);
                if (t.k()) {
                    b15 = -1;
                    t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
                } else {
                    b15 = -1;
                }
                if (zBooleanValue2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.8f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf10 = Float.valueOf(f16);
                zW2 = rVarH.W(k2VarY);
                objE6 = rVarH.E();
                if (zW2) {
                    objE6 = x5.d(new b(k2VarY));
                    rVarH.v(objE6);
                } else {
                    objE6 = x5.d(new b(k2VarY));
                    rVarH.v(objE6);
                }
                final f6 f6VarR5 = v2.r(k2VarY, fValueOf9, fValueOf10, (j0) qVar6.w(((f6) objE6).getValue(), rVarH, 0), y2VarP5, "tooltip transition: scaling", rVarH, 196608);
                q qVar7 = new q() { // from class: f2.br
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return hr.G(j0VarB6, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                    }
                };
                u0.y2<Float, u0.p> y2VarP6 = s3.P(mVar8);
                if (k2VarY.B()) {
                    rVarH.X(1666573488);
                    zW5 = rVarH.W(k2VarY);
                    objP2 = rVarH.E();
                    if (zW5) {
                        companion2 = c3.l.INSTANCE;
                        lVarD = companion2.d();
                        if (lVarD != null) {
                            lVarG = lVarD.g();
                        } else {
                            lVarG = null;
                        }
                        lVarE = companion2.e(lVarD);
                        Object objP11 = k2VarY.p();
                        companion2.l(lVarD, lVarE, lVarG);
                        rVarH.v(objP11);
                        objP2 = objP11;
                    } else {
                        companion2 = c3.l.INSTANCE;
                        lVarD = companion2.d();
                        if (lVarD != null) {
                            lVarG = lVarD.g();
                        } else {
                            lVarG = null;
                        }
                        lVarE = companion2.e(lVarD);
                        Object objP12 = k2VarY.p();
                        companion2.l(lVarD, lVarE, lVarG);
                        rVarH.v(objP12);
                        objP2 = objP12;
                    }
                    rVarH.R();
                } else {
                    rVarH.X(1666827533);
                    rVarH.R();
                    objP2 = k2VarY.p();
                }
                zBooleanValue3 = ((Boolean) objP2).booleanValue();
                rVarH.X(-1903393104);
                if (t.k()) {
                    t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                }
                if (zBooleanValue3) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf11 = Float.valueOf(f17);
                zW3 = rVarH.W(k2VarY);
                objE7 = rVarH.E();
                if (zW3) {
                    objE7 = x5.d(new c(k2VarY));
                    rVarH.v(objE7);
                } else {
                    objE7 = x5.d(new c(k2VarY));
                    rVarH.v(objE7);
                }
                zBooleanValue4 = ((Boolean) ((f6) objE7).getValue()).booleanValue();
                rVarH.X(-1903393104);
                if (t.k()) {
                    t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
                }
                if (zBooleanValue4) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                if (t.k()) {
                    t.n();
                }
                rVarH.R();
                Float fValueOf12 = Float.valueOf(f18);
                zW4 = rVarH.W(k2VarY);
                objE8 = rVarH.E();
                if (zW4) {
                    objE8 = x5.d(new d(k2VarY));
                    rVarH.v(objE8);
                } else {
                    objE8 = x5.d(new d(k2VarY));
                    rVarH.v(objE8);
                }
                final f6 f6VarR6 = v2.r(k2VarY, fValueOf11, fValueOf12, (j0) qVar7.w(((f6) objE8).getValue(), rVarH, 0), y2VarP6, "tooltip transition: alpha", rVarH, 196608);
                final p076m2.a3 a3Var5 = a3Var2;
                m mVar9 = mVar2;
                er.a<i0> aVar7 = aVar4;
                boolean z39 = z27;
                boolean z310 = z28;
                h0.k(tVar, y2.m.d(-527401546, true, new p() { // from class: f2.cr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.w(a3Var5, f6VarR5, f6VarR6, f6Var3, qVar, krVar3, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), lrVar, mVar9, aVar7, z211, z39, z310, fVarD3, rVarH, (i17 & 14) | 100663344 | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17), 0);
                if (t.k()) {
                    t.n();
                }
                z26 = z310;
                z25 = z39;
                z18 = z211;
                aVar3 = aVar7;
                mVar3 = mVar9;
            } else {
                rVarH.O();
                z25 = z16;
                z26 = z17;
                mVar3 = mVar2;
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.dr
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return hr.z(tVar, qVar, lrVar, mVar3, aVar3, z18, z25, z26, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        aVar2 = aVar;
        i25 = i16 & 32;
        if (i25 != 0) {
            i17 |= 196608;
            z18 = z15;
        } else {
            z18 = z15;
            if ((i15 & 196608) == 0) {
                if (rVarH.a(z18)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
        }
        i27 = i16 & 64;
        if (i27 != 0) {
            i17 |= 1572864;
        } else if ((i15 & 1572864) == 0) {
            if (rVarH.a(z16)) {
                i28 = PKIFailureInfo.badCertTemplate;
            } else {
                i28 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i28;
        }
        i29 = i16 & 128;
        if (i29 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.a(z17)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i17 |= i35;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.G(pVar)) {
                i36 = 67108864;
            } else {
                i36 = 33554432;
            }
            i17 |= i36;
        }
        if ((i17 & 38347923) != 38347922) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (rVarH.r(z19, i17 & 1)) {
            if (i37 != 0) {
                mVar2 = m.INSTANCE;
            }
            if (i18 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (i25 != 0) {
                z18 = false;
            }
            boolean z212 = z18;
            if (i27 != 0) {
                z27 = true;
            } else {
                z27 = z16;
            }
            if (i29 != 0) {
                z28 = false;
            } else {
                z28 = z17;
            }
            if (t.k()) {
                t.o(-293753984, i17, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:170)");
            }
            k2VarY = v2.y(lrVar.c(), "tooltip transition", rVarH, d1.f193575d | 48, 0);
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                p076m2.a3 a3VarE4 = c6.e(null, null, 2, null);
                rVarH.v(a3VarE4);
                objE = a3VarE4;
            }
            a3Var = (p076m2.a3) objE;
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new kr(new er.a() { // from class: f2.sq
                    @Override // er.a
                    public final Object a() {
                        return hr.u(a3Var);
                    }
                }, tVar);
                rVarH.v(objE2);
            }
            final kr krVar4 = (kr) objE2;
            f fVarD4 = y2.m.d(-23901870, true, new p() { // from class: f2.yq
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hr.A(a3Var, pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54);
            objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = c6.e(null, null, 2, null);
                rVarH.v(objE3);
            }
            a3Var2 = (p076m2.a3) objE3;
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = x5.d(new er.a() { // from class: f2.zq
                    @Override // er.a
                    public final Object a() {
                        return Integer.valueOf(hr.C(a3Var, a3Var2));
                    }
                });
                rVarH.v(objE4);
            }
            final f6 f6Var4 = (f6) objE4;
            final j0 j0VarB7 = of.b(k0.FastSpatial, rVarH, 6);
            final j0 j0VarB8 = of.b(k0.FastEffects, rVarH, 6);
            q qVar8 = new q() { // from class: f2.ar
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return hr.E(j0VarB7, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            };
            fr.m mVar10 = fr.m.f66405a;
            u0.y2<Float, u0.p> y2VarP7 = s3.P(mVar10);
            if (k2VarY.B()) {
                rVarH.X(1666573488);
                zW6 = rVarH.W(k2VarY);
                objP = rVarH.E();
                if (zW6) {
                    companion3 = c3.l.INSTANCE;
                    lVarD2 = companion3.d();
                    if (lVarD2 != null) {
                        lVarG2 = lVarD2.g();
                    } else {
                        lVarG2 = null;
                    }
                    lVarE2 = companion3.e(lVarD2);
                    Object objP13 = k2VarY.p();
                    companion3.l(lVarD2, lVarE2, lVarG2);
                    rVarH.v(objP13);
                    objP = objP13;
                } else {
                    companion3 = c3.l.INSTANCE;
                    lVarD2 = companion3.d();
                    if (lVarD2 != null) {
                        lVarG2 = lVarD2.g();
                    } else {
                        lVarG2 = null;
                    }
                    lVarE2 = companion3.e(lVarD2);
                    Object objP14 = k2VarY.p();
                    companion3.l(lVarD2, lVarE2, lVarG2);
                    rVarH.v(objP14);
                    objP = objP14;
                }
                rVarH.R();
            } else {
                a3Var2 = a3Var2;
                z27 = z27;
                z28 = z28;
                rVarH.X(1666827533);
                rVarH.R();
                objP = k2VarY.p();
            }
            zBooleanValue = ((Boolean) objP).booleanValue();
            rVarH.X(838300572);
            if (t.k()) {
                t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
            }
            if (zBooleanValue) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf13 = Float.valueOf(f15);
            zW = rVarH.W(k2VarY);
            objE5 = rVarH.E();
            if (zW) {
                objE5 = x5.d(new a(k2VarY));
                rVarH.v(objE5);
            } else {
                objE5 = x5.d(new a(k2VarY));
                rVarH.v(objE5);
            }
            zBooleanValue2 = ((Boolean) ((f6) objE5).getValue()).booleanValue();
            rVarH.X(838300572);
            if (t.k()) {
                b15 = -1;
                t.o(838300572, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:216)");
            } else {
                b15 = -1;
            }
            if (zBooleanValue2) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf14 = Float.valueOf(f16);
            zW2 = rVarH.W(k2VarY);
            objE6 = rVarH.E();
            if (zW2) {
                objE6 = x5.d(new b(k2VarY));
                rVarH.v(objE6);
            } else {
                objE6 = x5.d(new b(k2VarY));
                rVarH.v(objE6);
            }
            final f6 f6VarR7 = v2.r(k2VarY, fValueOf13, fValueOf14, (j0) qVar8.w(((f6) objE6).getValue(), rVarH, 0), y2VarP7, "tooltip transition: scaling", rVarH, 196608);
            q qVar9 = new q() { // from class: f2.br
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return hr.G(j0VarB8, (k2.b) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            };
            u0.y2<Float, u0.p> y2VarP8 = s3.P(mVar10);
            if (k2VarY.B()) {
                rVarH.X(1666573488);
                zW5 = rVarH.W(k2VarY);
                objP2 = rVarH.E();
                if (zW5) {
                    companion2 = c3.l.INSTANCE;
                    lVarD = companion2.d();
                    if (lVarD != null) {
                        lVarG = lVarD.g();
                    } else {
                        lVarG = null;
                    }
                    lVarE = companion2.e(lVarD);
                    Object objP15 = k2VarY.p();
                    companion2.l(lVarD, lVarE, lVarG);
                    rVarH.v(objP15);
                    objP2 = objP15;
                } else {
                    companion2 = c3.l.INSTANCE;
                    lVarD = companion2.d();
                    if (lVarD != null) {
                        lVarG = lVarD.g();
                    } else {
                        lVarG = null;
                    }
                    lVarE = companion2.e(lVarD);
                    Object objP16 = k2VarY.p();
                    companion2.l(lVarD, lVarE, lVarG);
                    rVarH.v(objP16);
                    objP2 = objP16;
                }
                rVarH.R();
            } else {
                rVarH.X(1666827533);
                rVarH.R();
                objP2 = k2VarY.p();
            }
            zBooleanValue3 = ((Boolean) objP2).booleanValue();
            rVarH.X(-1903393104);
            if (t.k()) {
                t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
            }
            if (zBooleanValue3) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf15 = Float.valueOf(f17);
            zW3 = rVarH.W(k2VarY);
            objE7 = rVarH.E();
            if (zW3) {
                objE7 = x5.d(new c(k2VarY));
                rVarH.v(objE7);
            } else {
                objE7 = x5.d(new c(k2VarY));
                rVarH.v(objE7);
            }
            zBooleanValue4 = ((Boolean) ((f6) objE7).getValue()).booleanValue();
            rVarH.X(-1903393104);
            if (t.k()) {
                t.o(-1903393104, 0, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:225)");
            }
            if (zBooleanValue4) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            if (t.k()) {
                t.n();
            }
            rVarH.R();
            Float fValueOf16 = Float.valueOf(f18);
            zW4 = rVarH.W(k2VarY);
            objE8 = rVarH.E();
            if (zW4) {
                objE8 = x5.d(new d(k2VarY));
                rVarH.v(objE8);
            } else {
                objE8 = x5.d(new d(k2VarY));
                rVarH.v(objE8);
            }
            final f6 f6VarR8 = v2.r(k2VarY, fValueOf15, fValueOf16, (j0) qVar9.w(((f6) objE8).getValue(), rVarH, 0), y2VarP8, "tooltip transition: alpha", rVarH, 196608);
            final p076m2.a3 a3Var6 = a3Var2;
            m mVar11 = mVar2;
            er.a<i0> aVar8 = aVar4;
            boolean z311 = z27;
            boolean z312 = z28;
            h0.k(tVar, y2.m.d(-527401546, true, new p() { // from class: f2.cr
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hr.w(a3Var6, f6VarR7, f6VarR8, f6Var4, qVar, krVar4, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), lrVar, mVar11, aVar8, z212, z311, z312, fVarD4, rVarH, (i17 & 14) | 100663344 | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17), 0);
            if (t.k()) {
                t.n();
            }
            z26 = z312;
            z25 = z311;
            z18 = z212;
            aVar3 = aVar8;
            mVar3 = mVar11;
        } else {
            rVarH.O();
            z25 = z16;
            z26 = z17;
            mVar3 = mVar2;
            aVar3 = aVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.dr
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return hr.z(tVar, qVar, lrVar, mVar3, aVar3, z18, z25, z26, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 u(p076m2.a3 a3Var) {
        return (b0) a3Var.getValue();
    }

    private static final float v(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final p076m2.a3 a3Var, final f6 f6Var, final f6 f6Var2, f6 f6Var3, q qVar, kr krVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-527401546, i15, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:231)");
            }
            m.Companion companion = m.INSTANCE;
            Object objE = rVar.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new l() { // from class: f2.uq
                    @Override // er.l
                    public final Object b(Object obj) {
                        return hr.x(a3Var, (b0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarA = l1.a(companion, (l) objE);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarA);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            x xVar = x.f39368a;
            rVar.J(-1350495383, Integer.valueOf(D(f6Var3)));
            boolean zW = rVar.W(f6Var) | rVar.W(f6Var2);
            Object objE2 = rVar.E();
            if (zW || objE2 == companion2.a()) {
                objE2 = new l() { // from class: f2.vq
                    @Override // er.l
                    public final Object b(Object obj) {
                        return hr.y(f6Var, f6Var2, (n3.a2) obj);
                    }
                };
                rVar.v(objE2);
            }
            m mVarC = z1.c(companion, (l) objE2);
            w0 w0VarI2 = d1.r.i(companion3.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT2 = rVar.t();
            m mVarE2 = j.e(rVar, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarI2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            qVar.w(krVar, rVar, 6);
            rVar.x();
            rVar.U();
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
    public static final i0 x(p076m2.a3 a3Var, b0 b0Var) {
        a3Var.setValue(e.d(c0.i(b0Var)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(f6 f6Var, f6 f6Var2, n3.a2 a2Var) {
        a2Var.s(F(f6Var));
        a2Var.D(F(f6Var));
        a2Var.g(v(f6Var2));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(androidx.compose.ui.window.t tVar, q qVar, lr lrVar, m mVar, er.a aVar, boolean z15, boolean z16, boolean z17, p pVar, int i15, int i16, r rVar, int i17) {
        t(tVar, qVar, lrVar, mVar, aVar, z15, z16, z17, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
