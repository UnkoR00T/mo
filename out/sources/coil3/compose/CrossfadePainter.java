package coil3.compose;

import fr.k;
import gu.e;
import gu.m;
import n3.n1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.x509.DisplayText;
import p036e4.l;
import p036e4.n2;
import p071kotlin.Metadata;
import p076m2.m5;
import p076m2.y2;
import p3.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u0017*\u00020\u0013H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b:\u00109R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b;\u00109R+\u0010C\u001a\u00020<2\u0006\u0010=\u001a\u00020<8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010ER\u0016\u0010G\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00107R\u0016\u0010J\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR(\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010M\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bN\u0010'\u001a\u0004\bO\u0010)R\u001a\u0010Q\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010/\u001a\u0004\b2\u00101¨\u0006R"}, d2 = {"Lcoil3/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/a;", "start", "end", "Le4/l;", "contentScale", "Lgu/b;", "duration", "Lgu/m;", "timeSource", "", "fadeStart", "preferExactIntrinsicSize", "preferEndFirstIntrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/painter/a;Landroidx/compose/ui/graphics/painter/a;Le4/l;JLgu/m;ZZZLfr/k;)V", "Lm3/k;", "p", "(Landroidx/compose/ui/graphics/painter/a;Landroidx/compose/ui/graphics/painter/a;)J", "Lp3/f;", "painter", "", "alpha", "Loq/i0;", "q", "(Lp3/f;Landroidx/compose/ui/graphics/painter/a;F)V", "srcSize", "dstSize", "o", "(JJ)J", "n", "(Lp3/f;)V", "a", "(F)Z", "Ln3/n1;", "colorFilter", "b", "(Ln3/n1;)Z", "h", "Landroidx/compose/ui/graphics/painter/a;", "getEnd", "()Landroidx/compose/ui/graphics/painter/a;", "j", "Le4/l;", "getContentScale", "()Le4/l;", "k", "J", "getDuration-UwyO8pc", "()J", "l", "Lgu/m;", "getTimeSource", "()Lgu/m;", "m", "Z", "getFadeStart", "()Z", "getPreferExactIntrinsicSize", "getPreferEndFirstIntrinsicSize", "", "<set-?>", "Lm2/y2;", "r", "()I", "s", "(I)V", "invalidateTick", "Lgu/l;", "Lgu/l;", "startTime", "isDone", "t", "F", "maxAlpha", "v", "Ln3/n1;", "value", "w", "getStart", "x", "intrinsicSize", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CrossfadePainter extends androidx.compose.ui.graphics.painter.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.graphics.painter.a end;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l contentScale;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long duration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final m timeSource;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean fadeStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean preferExactIntrinsicSize;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean preferEndFirstIntrinsicSize;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final y2 invalidateTick;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private gu.l startTime;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isDone;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float maxAlpha;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.painter.a start;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    public /* synthetic */ CrossfadePainter(androidx.compose.ui.graphics.painter.a aVar, androidx.compose.ui.graphics.painter.a aVar2, l lVar, long j15, m mVar, boolean z15, boolean z16, boolean z17, k kVar) {
        this(aVar, aVar2, lVar, j15, mVar, z15, z16, z17);
    }

    private final long o(long srcSize, long dstSize) {
        return (srcSize == 9205357640488583168L || m3.k.k(srcSize) || dstSize == 9205357640488583168L || m3.k.k(dstSize)) ? dstSize : n2.a(srcSize, this.contentScale.a(srcSize, dstSize));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r5 != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long p(androidx.compose.ui.graphics.painter.a r8, androidx.compose.ui.graphics.painter.a r9) {
        /*
            r7 = this;
            if (r8 == 0) goto L7
            long r0 = r8.getIntrinsicSize()
            goto Ld
        L7:
            m3.k$a r8 = m3.k.INSTANCE
            long r0 = r8.b()
        Ld:
            if (r9 == 0) goto L14
            long r8 = r9.getIntrinsicSize()
            goto L1a
        L14:
            m3.k$a r8 = m3.k.INSTANCE
            long r8 = r8.b()
        L1a:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L27
            r4 = r6
            goto L28
        L27:
            r4 = r5
        L28:
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            r5 = r6
        L2d:
            boolean r2 = r7.preferEndFirstIntrinsicSize
            if (r2 == 0) goto L37
            if (r5 == 0) goto L34
            goto L7f
        L34:
            if (r4 == 0) goto L37
            goto L7c
        L37:
            if (r4 == 0) goto L76
            if (r5 == 0) goto L76
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r8 >> r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r8 = r8 & r4
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = java.lang.Math.max(r0, r8)
            int r9 = java.lang.Float.floatToRawIntBits(r3)
            long r0 = (long) r9
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r8 = (long) r8
            long r0 = r0 << r2
            long r8 = r8 & r4
            long r8 = r8 | r0
            long r8 = m3.k.d(r8)
            return r8
        L76:
            boolean r2 = r7.preferExactIntrinsicSize
            if (r2 == 0) goto L80
            if (r4 == 0) goto L7d
        L7c:
            return r0
        L7d:
            if (r5 == 0) goto L80
        L7f:
            return r8
        L80:
            m3.k$a r8 = m3.k.INSTANCE
            long r8 = r8.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.CrossfadePainter.p(androidx.compose.ui.graphics.painter.a, androidx.compose.ui.graphics.painter.a):long");
    }

    private final void q(f fVar, androidx.compose.ui.graphics.painter.a aVar, float f15) {
        if (aVar == null || f15 <= 0.0f) {
            return;
        }
        long jA = fVar.a();
        long jO = o(aVar.getIntrinsicSize(), jA);
        if (jA == 9205357640488583168L || m3.k.k(jA)) {
            aVar.j(fVar, jO, f15, this.colorFilter);
            return;
        }
        float f16 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jA >> 32)) - Float.intBitsToFloat((int) (jO >> 32))) / f16;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (jO & BodyPartID.bodyIdMax))) / f16;
        fVar.getDrawContext().getTransform().j(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            aVar.j(fVar, jO, f15, this.colorFilter);
        } finally {
            float f17 = -fIntBitsToFloat;
            float f18 = -fIntBitsToFloat2;
            fVar.getDrawContext().getTransform().j(f17, f18, f17, f18);
        }
    }

    private final int r() {
        return this.invalidateTick.d();
    }

    private final void s(int i15) {
        this.invalidateTick.g(i15);
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean a(float alpha) {
        this.maxAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean b(n1 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    /* JADX INFO: renamed from: l, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected void n(f fVar) {
        if (this.isDone) {
            q(fVar, this.end, this.maxAlpha);
            return;
        }
        gu.l lVarA = this.startTime;
        if (lVarA == null) {
            lVarA = this.timeSource.a();
            this.startTime = lVarA;
        }
        float fA = gu.b.A(lVarA.b()) / gu.b.A(this.duration);
        float fM = lr.m.m(fA, 0.0f, 1.0f);
        float f15 = this.maxAlpha;
        float f16 = fM * f15;
        if (this.fadeStart) {
            f15 -= f16;
        }
        this.isDone = fA >= 1.0f;
        q(fVar, this.start, f15);
        q(fVar, this.end, f16);
        if (this.isDone) {
            this.start = null;
        } else {
            s(r() + 1);
        }
    }

    private CrossfadePainter(androidx.compose.ui.graphics.painter.a aVar, androidx.compose.ui.graphics.painter.a aVar2, l lVar, long j15, m mVar, boolean z15, boolean z16, boolean z17) {
        this.end = aVar2;
        this.contentScale = lVar;
        this.duration = j15;
        this.timeSource = mVar;
        this.fadeStart = z15;
        this.preferExactIntrinsicSize = z16;
        this.preferEndFirstIntrinsicSize = z17;
        this.invalidateTick = m5.a(0);
        this.maxAlpha = 1.0f;
        this.start = aVar;
        this.intrinsicSize = p(aVar, aVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CrossfadePainter(androidx.compose.ui.graphics.painter.a aVar, androidx.compose.ui.graphics.painter.a aVar2, l lVar, long j15, m mVar, boolean z15, boolean z16, boolean z17, int i15, k kVar) {
        long jQ;
        l lVarE = (i15 & 4) != 0 ? l.INSTANCE.e() : lVar;
        if ((i15 & 8) != 0) {
            gu.b.Companion companion = gu.b.INSTANCE;
            jQ = gu.d.q(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, e.MILLISECONDS);
        } else {
            jQ = j15;
        }
        this(aVar, aVar2, lVarE, jQ, (i15 & 16) != 0 ? m.a.f76977a : mVar, (i15 & 32) != 0 ? true : z15, (i15 & 64) != 0 ? false : z16, (i15 & 128) != 0 ? false : z17, null);
    }
}
