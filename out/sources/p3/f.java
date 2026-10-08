package p3;

import c5.n;
import c5.r;
import c5.t;
import er.l;
import fr.w;
import n3.a1;
import n3.b2;
import n3.h1;
import n3.m2;
import n3.n1;
import n3.n2;
import n3.v1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 Y2\u00020\u0001:\u0001TJ\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006Jg\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018Jg\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001b\u0010\u001cJU\u0010!\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b!\u0010\"JU\u0010#\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b#\u0010$JK\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b'\u0010(Js\u00101\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020)2\b\b\u0002\u0010.\u001a\u00020+2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J_\u00105\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b5\u00106J_\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b7\u00108JU\u0010;\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b;\u0010<Jm\u0010A\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\bA\u0010BJI\u0010E\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\bE\u0010FJI\u0010G\u001a\u00020\u00162\u0006\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\bG\u0010HJ1\u0010L\u001a\u00020\u0016*\u00020I2\b\b\u0002\u0010\u001e\u001a\u00020+2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160JH\u0016¢\u0006\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010:\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0014\u0010X\u001a\u00020U8&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010Wø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006ZÀ\u0006\u0003"}, d2 = {"Lp3/f;", "Lc5/d;", "Lm3/k;", "Lm3/e;", "offset", "f2", "(JJ)J", "Landroidx/compose/ui/graphics/c;", "brush", "start", "end", "", "strokeWidth", "Ln3/a3;", "cap", "Ln3/n2;", "pathEffect", "alpha", "Ln3/n1;", "colorFilter", "Ln3/a1;", "blendMode", "Loq/i0;", "o2", "(Landroidx/compose/ui/graphics/c;JJFILn3/n2;FLn3/n1;I)V", "Landroidx/compose/ui/graphics/Color;", "color", "t0", "(JJJFILn3/n2;FLn3/n1;I)V", "topLeft", "size", "Lp3/g;", "style", "m1", "(Landroidx/compose/ui/graphics/c;JJFLp3/g;Ln3/n1;I)V", "l1", "(JJJFLp3/g;Ln3/n1;I)V", "Ln3/b2;", "image", "a1", "(Ln3/b2;JFLp3/g;Ln3/n1;I)V", "Lc5/n;", "srcOffset", "Lc5/r;", "srcSize", "dstOffset", "dstSize", "Ln3/v1;", "filterQuality", "u0", "(Ln3/b2;JJJJFLp3/g;Ln3/n1;II)V", "Lm3/a;", "cornerRadius", "S1", "(Landroidx/compose/ui/graphics/c;JJJFLp3/g;Ln3/n1;I)V", "D0", "(JJJJLp3/g;FLn3/n1;I)V", "radius", "center", "s1", "(JFJFLp3/g;Ln3/n1;I)V", "startAngle", "sweepAngle", "", "useCenter", "V", "(JFFZJJFLp3/g;Ln3/n1;I)V", "Ln3/m2;", "path", "c0", "(Ln3/m2;JFLp3/g;Ln3/n1;I)V", "g1", "(Ln3/m2;Landroidx/compose/ui/graphics/c;FLp3/g;Ln3/n1;I)V", "Lq3/c;", "Lkotlin/Function1;", "block", "U1", "(Lq3/c;JLer/l;)V", "Lp3/d;", "n2", "()Lp3/d;", "drawContext", "y2", "()J", "a", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "k0", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f extends c5.d {

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f152585a;

    /* JADX INFO: renamed from: p3.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\r"}, d2 = {"Lp3/f$a;", "", "<init>", "()V", "Ln3/a1;", "b", "I", "a", "()I", "DefaultBlendMode", "Ln3/v1;", "c", "DefaultFilterQuality", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f152585a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultBlendMode = a1.INSTANCE.B();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final int DefaultFilterQuality = v1.INSTANCE.a();

        private Companion() {
        }

        public final int a() {
            return DefaultBlendMode;
        }

        public final int b() {
            return DefaultFilterQuality;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements l<f, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<f, i0> f152589c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super f, i0> lVar) {
            super(1);
            this.f152589c = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(f fVar) {
            f fVar2 = f.this;
            c5.d density = fVar.getDrawContext().getDensity();
            t layoutDirection = fVar.getDrawContext().getLayoutDirection();
            h1 h1VarF = fVar.getDrawContext().f();
            long jA = fVar.getDrawContext().a();
            q3.c cVarH = fVar.getDrawContext().getGraphicsLayer();
            l<f, i0> lVar = this.f152589c;
            c5.d density2 = fVar2.getDrawContext().getDensity();
            t layoutDirection2 = fVar2.getDrawContext().getLayoutDirection();
            h1 h1VarF2 = fVar2.getDrawContext().f();
            long jA2 = fVar2.getDrawContext().a();
            q3.c cVarH2 = fVar2.getDrawContext().getGraphicsLayer();
            d dVarN2 = fVar2.getDrawContext();
            dVarN2.b(density);
            dVarN2.d(layoutDirection);
            dVarN2.e(h1VarF);
            dVarN2.g(jA);
            dVarN2.i(cVarH);
            h1VarF.q();
            try {
                lVar.b(fVar2);
            } finally {
                h1VarF.j();
                d dVarN3 = fVar2.getDrawContext();
                dVarN3.b(density2);
                dVarN3.d(layoutDirection2);
                dVarN3.e(h1VarF2);
                dVarN3.g(jA2);
                dVarN3.i(cVarH2);
            }
        }
    }

    static /* synthetic */ void F1(f fVar, androidx.compose.ui.graphics.c cVar, long j15, long j16, float f15, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jC = (i16 & 2) != 0 ? m3.e.INSTANCE.c() : j15;
        fVar.m1(cVar, jC, (i16 & 4) != 0 ? fVar.f2(fVar.a(), jC) : j16, (i16 & 8) != 0 ? 1.0f : f15, (i16 & 16) != 0 ? j.f152592b : gVar, (i16 & 32) != 0 ? null : n1Var, (i16 & 64) != 0 ? INSTANCE.a() : i15);
    }

    static /* synthetic */ void M0(f fVar, m2 m2Var, androidx.compose.ui.graphics.c cVar, float f15, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i16 & 4) != 0) {
            f15 = 1.0f;
        }
        float f16 = f15;
        if ((i16 & 8) != 0) {
            gVar = j.f152592b;
        }
        g gVar2 = gVar;
        if ((i16 & 16) != 0) {
            n1Var = null;
        }
        n1 n1Var2 = n1Var;
        if ((i16 & 32) != 0) {
            i15 = INSTANCE.a();
        }
        fVar.g1(m2Var, cVar, f16, gVar2, n1Var2, i15);
    }

    static /* synthetic */ void S(f fVar, androidx.compose.ui.graphics.c cVar, long j15, long j16, float f15, int i15, n2 n2Var, float f16, n1 n1Var, int i16, int i17, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        fVar.o2(cVar, j15, j16, (i17 & 8) != 0 ? 0.0f : f15, (i17 & 16) != 0 ? Stroke.INSTANCE.a() : i15, (i17 & 32) != 0 ? null : n2Var, (i17 & 64) != 0 ? 1.0f : f16, (i17 & 128) != 0 ? null : n1Var, (i17 & 256) != 0 ? INSTANCE.a() : i16);
    }

    static /* synthetic */ void V0(f fVar, b2 b2Var, long j15, float f15, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        fVar.a1(b2Var, (i16 & 2) != 0 ? m3.e.INSTANCE.c() : j15, (i16 & 4) != 0 ? 1.0f : f15, (i16 & 8) != 0 ? j.f152592b : gVar, (i16 & 16) != 0 ? null : n1Var, (i16 & 32) != 0 ? INSTANCE.a() : i15);
    }

    static /* synthetic */ void c1(f fVar, androidx.compose.ui.graphics.c cVar, long j15, long j16, long j17, float f15, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jC = (i16 & 2) != 0 ? m3.e.INSTANCE.c() : j15;
        fVar.S1(cVar, jC, (i16 & 4) != 0 ? fVar.f2(fVar.a(), jC) : j16, (i16 & 8) != 0 ? m3.a.INSTANCE.a() : j17, (i16 & 16) != 0 ? 1.0f : f15, (i16 & 32) != 0 ? j.f152592b : gVar, (i16 & 64) != 0 ? null : n1Var, (i16 & 128) != 0 ? INSTANCE.a() : i15);
    }

    static /* synthetic */ void c2(f fVar, long j15, long j16, long j17, float f15, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jC = (i16 & 2) != 0 ? m3.e.INSTANCE.c() : j16;
        fVar.l1(j15, jC, (i16 & 4) != 0 ? fVar.f2(fVar.a(), jC) : j17, (i16 & 8) != 0 ? 1.0f : f15, (i16 & 16) != 0 ? j.f152592b : gVar, (i16 & 32) != 0 ? null : n1Var, (i16 & 64) != 0 ? INSTANCE.a() : i15);
    }

    static /* synthetic */ void e2(f fVar, m2 m2Var, long j15, float f15, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i16 & 4) != 0) {
            f15 = 1.0f;
        }
        float f16 = f15;
        if ((i16 & 8) != 0) {
            gVar = j.f152592b;
        }
        g gVar2 = gVar;
        if ((i16 & 16) != 0) {
            n1Var = null;
        }
        fVar.c0(m2Var, j15, f16, gVar2, n1Var, (i16 & 32) != 0 ? INSTANCE.a() : i15);
    }

    static /* synthetic */ void f0(f fVar, b2 b2Var, long j15, long j16, long j17, long j18, float f15, g gVar, n1 n1Var, int i15, int i16, int i17, Object obj) {
        long jC;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jB = (i17 & 2) != 0 ? n.INSTANCE.b() : j15;
        if ((i17 & 4) != 0) {
            jC = r.c((((long) b2Var.getHeight()) & BodyPartID.bodyIdMax) | (((long) b2Var.l()) << 32));
        } else {
            jC = j16;
        }
        fVar.u0(b2Var, jB, jC, (i17 & 8) != 0 ? n.INSTANCE.b() : j17, (i17 & 16) != 0 ? jC : j18, (i17 & 32) != 0 ? 1.0f : f15, (i17 & 64) != 0 ? j.f152592b : gVar, (i17 & 128) != 0 ? null : n1Var, (i17 & 256) != 0 ? INSTANCE.a() : i15, (i17 & 512) != 0 ? INSTANCE.b() : i16);
    }

    private default long f2(long j15, long j16) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32)) - Float.intBitsToFloat((int) (j16 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax));
        return m3.k.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    static /* synthetic */ void n0(f fVar, long j15, float f15, float f16, boolean z15, long j16, long j17, float f17, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        f fVar2;
        long jF2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jC = (i16 & 16) != 0 ? m3.e.INSTANCE.c() : j16;
        if ((i16 & 32) != 0) {
            fVar2 = fVar;
            jF2 = fVar2.f2(fVar.a(), jC);
        } else {
            fVar2 = fVar;
            jF2 = j17;
        }
        fVar2.V(j15, f15, f16, z15, jC, jF2, (i16 & 64) != 0 ? 1.0f : f17, (i16 & 128) != 0 ? j.f152592b : gVar, (i16 & 256) != 0 ? null : n1Var, (i16 & 512) != 0 ? INSTANCE.a() : i15);
    }

    static /* synthetic */ void w1(f fVar, long j15, long j16, long j17, float f15, int i15, n2 n2Var, float f16, n1 n1Var, int i16, int i17, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        fVar.t0(j15, j16, j17, (i17 & 8) != 0 ? 0.0f : f15, (i17 & 16) != 0 ? Stroke.INSTANCE.a() : i15, (i17 & 32) != 0 ? null : n2Var, (i17 & 64) != 0 ? 1.0f : f16, (i17 & 128) != 0 ? null : n1Var, (i17 & 256) != 0 ? INSTANCE.a() : i16);
    }

    static /* synthetic */ void w2(f fVar, long j15, long j16, long j17, long j18, g gVar, float f15, n1 n1Var, int i15, int i16, Object obj) {
        f fVar2;
        long jF2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jC = (i16 & 2) != 0 ? m3.e.INSTANCE.c() : j16;
        if ((i16 & 4) != 0) {
            fVar2 = fVar;
            jF2 = fVar2.f2(fVar.a(), jC);
        } else {
            fVar2 = fVar;
            jF2 = j17;
        }
        fVar2.D0(j15, jC, jF2, (i16 & 8) != 0 ? m3.a.INSTANCE.a() : j18, (i16 & 16) != 0 ? j.f152592b : gVar, (i16 & 32) != 0 ? 1.0f : f15, (i16 & 64) != 0 ? null : n1Var, (i16 & 128) != 0 ? INSTANCE.a() : i15);
    }

    static /* synthetic */ void x2(f fVar, long j15, float f15, long j16, float f16, g gVar, n1 n1Var, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i16 & 2) != 0) {
            f15 = m3.k.h(fVar.a()) / 2.0f;
        }
        fVar.s1(j15, f15, (i16 & 4) != 0 ? fVar.y2() : j16, (i16 & 8) != 0 ? 1.0f : f16, (i16 & 16) != 0 ? j.f152592b : gVar, (i16 & 32) != 0 ? null : n1Var, (i16 & 64) != 0 ? INSTANCE.a() : i15);
    }

    void D0(long color, long topLeft, long size, long cornerRadius, g style, float alpha, n1 colorFilter, int blendMode);

    void S1(androidx.compose.ui.graphics.c brush, long topLeft, long size, long cornerRadius, float alpha, g style, n1 colorFilter, int blendMode);

    default void U1(q3.c cVar, long j15, l<? super f, i0> lVar) {
        cVar.F(this, getLayoutDirection(), j15, new b(lVar));
    }

    void V(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, n1 colorFilter, int blendMode);

    default long a() {
        return getDrawContext().a();
    }

    void a1(b2 image, long topLeft, float alpha, g style, n1 colorFilter, int blendMode);

    void c0(m2 path, long color, float alpha, g style, n1 colorFilter, int blendMode);

    void g1(m2 path, androidx.compose.ui.graphics.c brush, float alpha, g style, n1 colorFilter, int blendMode);

    t getLayoutDirection();

    void l1(long color, long topLeft, long size, float alpha, g style, n1 colorFilter, int blendMode);

    void m1(androidx.compose.ui.graphics.c brush, long topLeft, long size, float alpha, g style, n1 colorFilter, int blendMode);

    /* JADX INFO: renamed from: n2 */
    d getDrawContext();

    void o2(androidx.compose.ui.graphics.c brush, long start, long end, float strokeWidth, int cap, n2 pathEffect, float alpha, n1 colorFilter, int blendMode);

    void s1(long color, float radius, long center, float alpha, g style, n1 colorFilter, int blendMode);

    void t0(long color, long start, long end, float strokeWidth, int cap, n2 pathEffect, float alpha, n1 colorFilter, int blendMode);

    default void u0(b2 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, g style, n1 colorFilter, int blendMode, int filterQuality) {
        f0(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    default long y2() {
        return m3.l.b(getDrawContext().a());
    }
}
