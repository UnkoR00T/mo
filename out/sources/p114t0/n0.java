package p114t0;

import androidx.compose.ui.graphics.Color;
import c5.r;
import java.util.List;
import m3.e;
import m3.g;
import n3.m2;
import n3.n2;
import n3.o1;
import n3.u0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p3.Stroke;
import p3.f;
import pq.v;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.v3;
import q4.y3;
import u0.c;
import u0.d;
import u0.f2;
import u0.i;
import u0.j0;
import u0.n1;
import u0.p;
import u0.s3;
import u0.w;
import u0.x;
import u0.x2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0014\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J_\u0010\u001d\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010$\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u001aH\u0000¢\u0006\u0004\b$\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\"\u00100\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00107\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010+\u001a\u0004\b5\u0010-\"\u0004\b6\u0010/R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010@\u001a\u0002088\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010<R#\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0A8\u0006¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lt0/n0;", "", "<init>", "()V", "", "diamondWidth", "Loq/i0;", "b", "(F)V", "key", "Landroidx/compose/ui/graphics/Color;", "c", "(Ljava/lang/Object;)J", "Lp3/c;", "animationColor", "", "isShowKeyLabelEnabled", "strokeWidth", "Lq4/v3;", "textMeasurer", "d", "(Lp3/c;JZFLjava/lang/Object;Lq4/v3;)V", "Lm3/e;", "targetOffset", "Lm3/k;", "targetSize", "Lm3/g;", "currentRect", "center", "e", "(Lp3/c;JJJLm3/g;JZFLjava/lang/Object;Lq4/v3;)V", "Lu0/j0;", "spec", "current", "target", "initialVelocity", "a", "(Lu0/j0;Lm3/g;Lm3/g;Lm3/g;)V", "Lu0/c;", "Lu0/p;", "Lu0/c;", "reverseProgress", "restartProgress", "J", "getSharedTransitionScopeOffset-F1C5BW0", "()J", "setSharedTransitionScopeOffset-k-4lQ0M", "(J)V", "sharedTransitionScopeOffset", "Lc5/r;", "getSharedTransitionScopeSize-YbymL2g", "setSharedTransitionScopeSize-ozmzZPI", "sharedTransitionScopeSize", "getDebugOffset-F1C5BW0", "setDebugOffset-k-4lQ0M", "debugOffset", "Ln3/m2;", "f", "Ln3/m2;", "getDebugPath", "()Ln3/m2;", "debugPath", "g", "getCenterPath", "centerPath", "", "h", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "getColors$annotations", "colors", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<Float, p> reverseProgress = d.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c<Float, p> restartProgress = d.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long sharedTransitionScopeOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long sharedTransitionScopeSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long debugOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m2 debugPath;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m2 centerPath;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Color> colors;

    public n0() {
        e.Companion companion = e.INSTANCE;
        this.sharedTransitionScopeOffset = companion.c();
        this.sharedTransitionScopeSize = r.INSTANCE.a();
        this.debugOffset = companion.c();
        this.debugPath = u0.a();
        this.centerPath = u0.a();
        this.colors = v.q(Color.m0boximpl(o1.d(4293542709L)), Color.m0boximpl(o1.d(4294086695L)), Color.m0boximpl(o1.d(4291905755L)), Color.m0boximpl(o1.d(4282549748L)), Color.m0boximpl(o1.d(4282038458L)));
    }

    private final void b(float diamondWidth) {
        this.centerPath.l();
        m2 m2Var = this.centerPath;
        float f15 = -diamondWidth;
        m2Var.s(0.0f, f15);
        m2Var.x(diamondWidth, 0.0f);
        m2Var.x(0.0f, diamondWidth);
        m2Var.x(f15, 0.0f);
        m2Var.close();
    }

    public final void a(j0<g> spec, g current, g target, g initialVelocity) {
        long j15;
        long j16;
        this.debugPath.l();
        boolean z15 = spec instanceof x2;
        long j17 = BodyPartID.bodyIdMax;
        if (z15 || (spec instanceof n1) || ((spec instanceof w) && x.c(((w) spec).getMode(), x.INSTANCE.a()))) {
            this.debugPath.s(Float.intBitsToFloat((int) (current.g() >> 32)), Float.intBitsToFloat((int) (current.g() & BodyPartID.bodyIdMax)));
            this.debugPath.x(Float.intBitsToFloat((int) (target.g() >> 32)), Float.intBitsToFloat((int) (target.g() & BodyPartID.bodyIdMax)));
            this.debugPath.m(e.e(current.g() ^ (-9223372034707292160L)));
            this.debugOffset = e.p(target.g(), current.g());
            return;
        }
        f2 f2VarA = i.a(spec, s3.S(g.INSTANCE), current, target, initialVelocity);
        long durationNanos = f2VarA.getDurationNanos();
        g gVar = (g) f2VarA.f(0L);
        int i15 = 0;
        while (true) {
            long jG = ((g) f2VarA.f(durationNanos - ((long) (durationNanos * (i15 / 399))))).g();
            if (i15 == 0) {
                j15 = -9223372034707292160L;
                this.debugPath.s(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & j17)));
                j16 = j17;
            } else {
                j15 = -9223372034707292160L;
                j16 = j17;
                this.debugPath.x(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & j16)));
            }
            if (i15 == 400) {
                this.debugPath.m(e.e(gVar.g() ^ j15));
                this.debugOffset = e.p(target.g(), gVar.g());
                return;
            } else {
                i15++;
                j17 = j16;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c(Object key) {
        if (o0.f186415b.b(key)) {
            return ((Color) o0.f186415b.e(key)).m20unboximpl();
        }
        if (o0.f186414a >= this.colors.size()) {
            o0.f186414a = 0;
        }
        long jM20unboximpl = this.colors.get(o0.f186414a).m20unboximpl();
        o0.f186414a++;
        o0.f186415b.x(key, Color.m0boximpl(jM20unboximpl));
        return jM20unboximpl;
    }

    public final void d(p3.c cVar, long j15, boolean z15, float f15, Object obj, v3 v3Var) {
        long jD;
        float f16 = f15 * 2.0f;
        Color.Companion companion = Color.INSTANCE;
        if (Color.m11equalsimpl0(j15, companion.h())) {
            f.c2(cVar, companion.i(), 0L, 0L, 0.0f, new Stroke(f16, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
            jD = o1.d(4288323750L);
        } else {
            jD = j15;
        }
        f.c2(cVar, jD, 0L, 0L, 0.0f, new Stroke(f15, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        if (!z15 || v3Var == null) {
            return;
        }
        y3.b(cVar, v3.b(v3Var, obj.toString(), new TextStyle(jD, c5.w.g(18), null, null, null, null, null, 0L, null, null, null, Color.m9copywmQWz5c$default(companion.i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16775164, null), 0, false, 0, 0L, null, null, null, false, 1020, null), (250 & 2) != 0 ? Color.INSTANCE.h() : 0L, (250 & 4) != 0 ? e.INSTANCE.c() : e.e((((long) Float.floatToRawIntBits(10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & BodyPartID.bodyIdMax)), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? f.INSTANCE.a() : 0);
    }

    public final void e(p3.c cVar, long j15, long j16, long j17, g gVar, long j18, boolean z15, float f15, Object obj, v3 v3Var) throws Throwable {
        float f16;
        Object obj2;
        long jC;
        Color.Companion companion = Color.INSTANCE;
        if (Color.m11equalsimpl0(j15, companion.g())) {
            return;
        }
        float f17 = f15 * 2.0f;
        if (Color.m11equalsimpl0(j15, companion.h())) {
            f.c2(cVar, companion.i(), 0L, 0L, 0.0f, new Stroke(f17, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
            int i15 = (int) (j16 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i15) - Float.intBitsToFloat((int) (gVar.n() >> 32));
            int i16 = (int) (j16 & BodyPartID.bodyIdMax);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i16) - Float.intBitsToFloat((int) (gVar.n() & BodyPartID.bodyIdMax));
            cVar.getDrawContext().getTransform().d(fIntBitsToFloat, fIntBitsToFloat2);
            try {
                f16 = fIntBitsToFloat2;
                try {
                    f.c2(cVar, companion.i(), 0L, j17, 0.0f, new Stroke(f17, 0.0f, 0, 0, null, 30, null), null, 0, 106, null);
                    cVar.getDrawContext().getTransform().d(-fIntBitsToFloat, -f16);
                    float fIntBitsToFloat3 = (Float.intBitsToFloat(i15) - Float.intBitsToFloat((int) (gVar.n() >> 32))) - Float.intBitsToFloat((int) (this.debugOffset >> 32));
                    float fIntBitsToFloat4 = (Float.intBitsToFloat(i16) - Float.intBitsToFloat((int) (gVar.n() & BodyPartID.bodyIdMax))) - Float.intBitsToFloat((int) (this.debugOffset & BodyPartID.bodyIdMax));
                    cVar.getDrawContext().getTransform().d(fIntBitsToFloat3, fIntBitsToFloat4);
                    try {
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j17 >> 32)) * 0.5f;
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j17 & BodyPartID.bodyIdMax)) * 0.5f;
                        cVar.getDrawContext().getTransform().d(fIntBitsToFloat5, fIntBitsToFloat6);
                        try {
                            f.e2(cVar, this.debugPath, companion.i(), 0.0f, new Stroke(f17, 0.0f, 0, 0, n2.Companion.b(n2.INSTANCE, new float[]{20.0f, 10.0f}, 0.0f, 2, null), 14, null), null, 0, 52, null);
                            cVar.getDrawContext().getTransform().d(-fIntBitsToFloat5, -fIntBitsToFloat6);
                            cVar.getDrawContext().getTransform().d(-fIntBitsToFloat3, -fIntBitsToFloat4);
                            b(3.5f * f15);
                            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j18 >> 32));
                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (j18 & BodyPartID.bodyIdMax));
                            cVar.getDrawContext().getTransform().d(fIntBitsToFloat7, fIntBitsToFloat8);
                            try {
                                f.e2(cVar, this.centerPath, companion.i(), 0.0f, null, null, 0, 60, null);
                                cVar.getDrawContext().getTransform().d(-fIntBitsToFloat7, -fIntBitsToFloat8);
                                obj2 = obj;
                                jC = c(obj2);
                            } catch (Throwable th4) {
                                cVar.getDrawContext().getTransform().d(-fIntBitsToFloat7, -fIntBitsToFloat8);
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            cVar.getDrawContext().getTransform().d(-fIntBitsToFloat5, -fIntBitsToFloat6);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        cVar.getDrawContext().getTransform().d(-fIntBitsToFloat3, -fIntBitsToFloat4);
                        throw th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    cVar.getDrawContext().getTransform().d(-fIntBitsToFloat, -f16);
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                f16 = fIntBitsToFloat2;
            }
        } else {
            jC = j15;
            obj2 = obj;
        }
        f.c2(cVar, jC, 0L, 0L, 0.0f, new Stroke(f15, 0.0f, 0, 0, null, 30, null), null, 0, 110, null);
        int i17 = (int) (j16 >> 32);
        float fIntBitsToFloat9 = Float.intBitsToFloat(i17) - Float.intBitsToFloat((int) (gVar.n() >> 32));
        int i18 = (int) (j16 & BodyPartID.bodyIdMax);
        float fIntBitsToFloat10 = Float.intBitsToFloat(i18) - Float.intBitsToFloat((int) (gVar.n() & BodyPartID.bodyIdMax));
        cVar.getDrawContext().getTransform().d(fIntBitsToFloat9, fIntBitsToFloat10);
        try {
            f.c2(cVar, jC, 0L, j17, 0.0f, new Stroke(f15, 0.0f, 0, 0, null, 30, null), null, 0, 106, null);
            cVar.getDrawContext().getTransform().d(-fIntBitsToFloat9, -fIntBitsToFloat10);
            float fIntBitsToFloat11 = (Float.intBitsToFloat(i17) - Float.intBitsToFloat((int) (gVar.n() >> 32))) - Float.intBitsToFloat((int) (this.debugOffset >> 32));
            float fIntBitsToFloat12 = (Float.intBitsToFloat(i18) - Float.intBitsToFloat((int) (gVar.n() & BodyPartID.bodyIdMax))) - Float.intBitsToFloat((int) (this.debugOffset & BodyPartID.bodyIdMax));
            cVar.getDrawContext().getTransform().d(fIntBitsToFloat11, fIntBitsToFloat12);
            try {
                float fIntBitsToFloat13 = Float.intBitsToFloat((int) (j17 >> 32)) * 0.5f;
                float fIntBitsToFloat14 = Float.intBitsToFloat((int) (j17 & BodyPartID.bodyIdMax)) * 0.5f;
                cVar.getDrawContext().getTransform().d(fIntBitsToFloat13, fIntBitsToFloat14);
                try {
                    long j19 = jC;
                    f.e2(cVar, this.debugPath, j19, 0.0f, new Stroke(f15, 0.0f, 0, 0, n2.Companion.b(n2.INSTANCE, new float[]{20.0f, 10.0f}, 0.0f, 2, null), 14, null), null, 0, 52, null);
                    cVar.getDrawContext().getTransform().d(-fIntBitsToFloat13, -fIntBitsToFloat14);
                    cVar.getDrawContext().getTransform().d(-fIntBitsToFloat11, -fIntBitsToFloat12);
                    b(3 * f15);
                    float fIntBitsToFloat15 = Float.intBitsToFloat((int) (j18 >> 32));
                    float fIntBitsToFloat16 = Float.intBitsToFloat((int) (j18 & BodyPartID.bodyIdMax));
                    cVar.getDrawContext().getTransform().d(fIntBitsToFloat15, fIntBitsToFloat16);
                    try {
                        f.e2(cVar, this.centerPath, j19, 0.0f, null, null, 0, 60, null);
                        cVar.getDrawContext().getTransform().d(-fIntBitsToFloat15, -fIntBitsToFloat16);
                        if (!z15 || v3Var == null) {
                            return;
                        }
                        TextLayoutResult textLayoutResultB = v3.b(v3Var, obj2.toString(), new TextStyle(j19, c5.w.g(18), null, null, null, null, null, 0L, null, null, null, Color.m9copywmQWz5c$default(companion.i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16775164, null), 0, false, 0, 0L, null, null, null, false, 1020, null);
                        y3.b(cVar, textLayoutResultB, (250 & 2) != 0 ? Color.INSTANCE.h() : 0L, (250 & 4) != 0 ? e.INSTANCE.c() : e.e((((long) Float.floatToRawIntBits(10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & BodyPartID.bodyIdMax)), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? f.INSTANCE.a() : 0);
                        float fIntBitsToFloat17 = Float.intBitsToFloat(i17) - Float.intBitsToFloat((int) (gVar.n() >> 32));
                        float fIntBitsToFloat18 = Float.intBitsToFloat(i18) - Float.intBitsToFloat((int) (gVar.n() & BodyPartID.bodyIdMax));
                        cVar.getDrawContext().getTransform().d(fIntBitsToFloat17, fIntBitsToFloat18);
                        try {
                            y3.b(cVar, textLayoutResultB, (250 & 2) != 0 ? Color.INSTANCE.h() : 0L, (250 & 4) != 0 ? e.INSTANCE.c() : e.e((((long) Float.floatToRawIntBits(10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & BodyPartID.bodyIdMax)), (250 & 8) != 0 ? Float.NaN : 0.0f, (250 & 16) != 0 ? null : null, (250 & 32) != 0 ? null : null, (250 & 64) == 0 ? null : null, (250 & 128) != 0 ? f.INSTANCE.a() : 0);
                        } finally {
                            cVar.getDrawContext().getTransform().d(-fIntBitsToFloat17, -fIntBitsToFloat18);
                        }
                    } catch (Throwable th9) {
                        cVar.getDrawContext().getTransform().d(-fIntBitsToFloat15, -fIntBitsToFloat16);
                        throw th9;
                    }
                } catch (Throwable th10) {
                    cVar.getDrawContext().getTransform().d(-fIntBitsToFloat13, -fIntBitsToFloat14);
                    throw th10;
                }
            } catch (Throwable th11) {
                cVar.getDrawContext().getTransform().d(-fIntBitsToFloat11, -fIntBitsToFloat12);
                throw th11;
            }
        } catch (Throwable th12) {
            cVar.getDrawContext().getTransform().d(-fIntBitsToFloat9, -fIntBitsToFloat10);
            throw th12;
        }
    }
}
