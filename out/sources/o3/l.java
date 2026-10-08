package o3;

import androidx.compose.ui.graphics.Color;
import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u0000  2\u00020\u0001:\u0002\u0016\u0011B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lo3/l;", "", "Lo3/c;", "source", "destination", "transformSource", "transformDestination", "Lo3/r;", "renderIntent", "", "transform", "<init>", "(Lo3/c;Lo3/c;Lo3/c;Lo3/c;I[FLfr/k;)V", "intent", "(Lo3/c;Lo3/c;ILfr/k;)V", "Landroidx/compose/ui/graphics/Color;", "color", "a", "(J)J", "Lo3/c;", "getSource", "()Lo3/c;", "b", "getDestination", "c", "d", "e", "I", "getRenderIntent-uksYyKA", "()I", "f", "[F", "g", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f141777h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c transformSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c transformDestination;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int renderIntent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: o3.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo3/l$a;", "", "<init>", "()V", "Lo3/c;", "source", "destination", "Lo3/r;", "intent", "", "b", "(Lo3/c;Lo3/c;I)[F", "Lo3/l;", "c", "(Lo3/c;)Lo3/l;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o3.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"o3/l$a$a", "Lo3/l;", "Landroidx/compose/ui/graphics/Color;", "color", "a", "(J)J", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3490a extends l {
            C3490a(c cVar, int i15) {
                super(cVar, cVar, i15, null);
            }

            @Override // o3.l
            public long a(long color) {
                return color;
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c source, c destination, int intent) {
            if (!r.e(intent, r.INSTANCE.a())) {
                return null;
            }
            long model = source.getModel();
            o3.b.Companion companion = o3.b.INSTANCE;
            boolean zE = o3.b.e(model, companion.b());
            boolean zE2 = o3.b.e(destination.getModel(), companion.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                source = destination;
            }
            f0 f0Var = (f0) source;
            float[] fArrC = zE ? f0Var.getWhitePoint().c() : o.f141788a.c();
            float[] fArrC2 = zE2 ? f0Var.getWhitePoint().c() : o.f141788a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final l c(c source) {
            return new C3490a(source, r.INSTANCE.c());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lo3/l$b;", "Lo3/l;", "Lo3/f0;", "mSource", "mDestination", "Lo3/r;", "intent", "<init>", "(Lo3/f0;Lo3/f0;ILfr/k;)V", "source", "destination", "", "b", "(Lo3/f0;Lo3/f0;I)[F", "Landroidx/compose/ui/graphics/Color;", "color", "a", "(J)J", "i", "Lo3/f0;", "j", "k", "[F", "mTransform", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends l {

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final f0 mSource;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final f0 mDestination;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final float[] mTransform;

        public /* synthetic */ b(f0 f0Var, f0 f0Var2, int i15, fr.k kVar) {
            this(f0Var, f0Var2, i15);
        }

        private final float[] b(f0 source, f0 destination, int intent) {
            if (d.f(source.getWhitePoint(), destination.getWhitePoint())) {
                return d.l(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] fArrC = source.getWhitePoint().c();
            float[] fArrC2 = destination.getWhitePoint().c();
            WhitePoint whitePoint = source.getWhitePoint();
            o oVar = o.f141788a;
            if (!d.f(whitePoint, oVar.b())) {
                transform = d.l(d.e(a.INSTANCE.a().getTransform(), fArrC, oVar.f()), source.getTransform());
            }
            if (!d.f(destination.getWhitePoint(), oVar.b())) {
                inverseTransform = d.k(d.l(d.e(a.INSTANCE.a().getTransform(), fArrC2, oVar.f()), destination.getTransform()));
            }
            if (r.e(intent, r.INSTANCE.a())) {
                transform = d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, transform);
            }
            return d.l(inverseTransform, transform);
        }

        @Override // o3.l
        public long a(long color) {
            float fM16getRedimpl = Color.m16getRedimpl(color);
            float fM15getGreenimpl = Color.m15getGreenimpl(color);
            float fM13getBlueimpl = Color.m13getBlueimpl(color);
            float fM12getAlphaimpl = Color.m12getAlphaimpl(color);
            float fA = (float) this.mSource.getEotfFunc().a(fM16getRedimpl);
            float fA2 = (float) this.mSource.getEotfFunc().a(fM15getGreenimpl);
            float fA3 = (float) this.mSource.getEotfFunc().a(fM13getBlueimpl);
            float[] fArr = this.mTransform;
            return o1.a((float) this.mDestination.getOetfFunc().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.mDestination.getOetfFunc().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fM12getAlphaimpl, this.mDestination);
        }

        private b(f0 f0Var, f0 f0Var2, int i15) {
            super(f0Var, f0Var2, f0Var, f0Var2, i15, null, null);
            this.mSource = f0Var;
            this.mDestination = f0Var2;
            this.mTransform = b(f0Var, f0Var2, i15);
        }
    }

    public /* synthetic */ l(c cVar, c cVar2, int i15, fr.k kVar) {
        this(cVar, cVar2, i15);
    }

    public long a(long color) {
        float fM16getRedimpl = Color.m16getRedimpl(color);
        float fM15getGreenimpl = Color.m15getGreenimpl(color);
        float fM13getBlueimpl = Color.m13getBlueimpl(color);
        float fM12getAlphaimpl = Color.m12getAlphaimpl(color);
        long j15 = this.transformSource.j(fM16getRedimpl, fM15getGreenimpl, fM13getBlueimpl);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        float fM = this.transformSource.m(fM16getRedimpl, fM15getGreenimpl, fM13getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fM *= fArr[2];
        }
        float f15 = fIntBitsToFloat;
        return this.transformDestination.n(f15, fIntBitsToFloat2, fM, fM12getAlphaimpl, this.destination);
    }

    public /* synthetic */ l(c cVar, c cVar2, c cVar3, c cVar4, int i15, float[] fArr, fr.k kVar) {
        this(cVar, cVar2, cVar3, cVar4, i15, fArr);
    }

    private l(c cVar, c cVar2, c cVar3, c cVar4, int i15, float[] fArr) {
        this.source = cVar;
        this.destination = cVar2;
        this.transformSource = cVar3;
        this.transformDestination = cVar4;
        this.renderIntent = i15;
        this.transform = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private l(c cVar, c cVar2, int i15) {
        long model = cVar.getModel();
        o3.b.Companion companion = o3.b.INSTANCE;
        this(cVar, cVar2, o3.b.e(model, companion.b()) ? d.d(cVar, o.f141788a.b(), null, 2, null) : cVar, o3.b.e(cVar2.getModel(), companion.b()) ? d.d(cVar2, o.f141788a.b(), null, 2, null) : cVar2, i15, INSTANCE.b(cVar, cVar2, i15), null);
    }
}
