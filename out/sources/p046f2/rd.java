package p046f2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e;
import fr.k;
import fr.t;
import h2.z1;
import h7.a;
import h7.i;
import h7.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lr.m;
import n3.g2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import pq.s0;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b7\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lf2/rd;", "", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f57544b = new a(0.15f, 0.0f, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f57545c = new a(0.2f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f57546d = new a(0.3f, 0.0f, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f57547e = new a(0.5f, 0.0f, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f57548f = new a(1.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float[] f57549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float[] f57550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float[] f57551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static i f57552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static i f57553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static i f57554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static i f57555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static i f57556n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static i f57557o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static i f57558p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static i f57559q;

    /* JADX INFO: renamed from: f2.rd$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\t*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u000f*\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0000¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0018H\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0018H\u0000¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0018H\u0000¢\u0006\u0004\b$\u0010\u001fJ\u000f\u0010%\u001a\u00020\u0018H\u0000¢\u0006\u0004\b%\u0010\u001fR\u0011\u0010'\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b&\u0010\u001fR\u0011\u0010)\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0011\u0010+\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0011\u0010-\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u0011\u0010/\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR\u0011\u00101\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u00103\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b2\u0010\u001fR\u0011\u00105\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b4\u0010\u001fR\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010;\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u0014\u0010<\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010CR\u0018\u0010I\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010CR\u0018\u0010J\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010CR\u0018\u0010K\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010CR\u0018\u0010L\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010CR\u0018\u0010M\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010CR\u0018\u0010N\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010CR\u0018\u0010O\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010CR\u0018\u0010P\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010CR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010CR\u0018\u0010R\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010CR\u0018\u0010S\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010CR\u0018\u0010T\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010CR\u0018\u0010U\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010CR\u0018\u0010V\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010CR\u0018\u0010W\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010CR\u0018\u0010X\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010CR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010CR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010CR\u0018\u0010[\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010CR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010CR\u0018\u0010]\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010CR\u0018\u0010^\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010CR\u0018\u0010_\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010CR\u0018\u0010`\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010CR\u0018\u0010a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010CR\u0018\u0010b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010CR\u0018\u0010c\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010CR\u0018\u0010d\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010CR\u0018\u0010e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010C¨\u0006f"}, d2 = {"Lf2/rd$a;", "", "<init>", "()V", "", "Lf2/rd$a$a;", "points", "", "reps", "Lm3/e;", "center", "", "mirroring", "h", "(Ljava/util/List;IJZ)Ljava/util/List;", "", "angle", "t", "(JFJ)J", "w", "(F)F", "a", "(J)F", "pnr", "Lh7/i;", "f", "(Ljava/util/List;IJZ)Lh7/i;", "numVertices", "b", "(I)Lh7/i;", "q", "()Lh7/i;", "s", "r", "v", "d", "e", "u", "i", e.f37044f, "l", "Oval", "n", "Pill", "m", "Pentagon", "p", "Sunny", "j", "Cookie4Sided", "k", "Cookie9Sided", "o", "SoftBurst", "Lh7/a;", "cornerRound15", "Lh7/a;", "cornerRound20", "cornerRound30", "cornerRound50", "cornerRound100", "Ln3/g2;", "rotateNeg45", "[F", "rotateNeg90", "rotateNeg135", "_circle", "Lh7/i;", "_square", "_slanted", "_arch", "_fan", "_arrow", "_semiCircle", "_oval", "_pill", "_triangle", "_diamond", "_clamShell", "_pentagon", "_gem", "_verySunny", "_sunny", "_cookie4Sided", "_cookie6Sided", "_cookie7Sided", "_cookie9Sided", "_cookie12Sided", "_ghostish", "_clover4Leaf", "_clover8Leaf", "_burst", "_softBurst", "_boom", "_softBoom", "_flower", "_puffy", "_puffyDiamond", "_pixelCircle", "_pixelTriangle", "_bun", "_heart", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: f2.rd$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lf2/rd$a$a;", "", "Lm3/e;", "o", "Lh7/a;", "r", "<init>", "(JLh7/a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Lh7/a;", "()Lh7/a;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final /* data */ class PointNRound {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long o;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final a r;

            public /* synthetic */ PointNRound(long j15, a aVar, k kVar) {
                this(j15, aVar);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getO() {
                return this.o;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final a getR() {
                return this.r;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PointNRound)) {
                    return false;
                }
                PointNRound pointNRound = (PointNRound) other;
                return m3.e.j(this.o, pointNRound.o) && t.c(this.r, pointNRound.r);
            }

            public int hashCode() {
                return (m3.e.o(this.o) * 31) + this.r.hashCode();
            }

            public String toString() {
                return "PointNRound(o=" + ((Object) m3.e.s(this.o)) + ", r=" + this.r + ')';
            }

            private PointNRound(long j15, a aVar) {
                this.o = j15;
                this.r = aVar;
            }

            public /* synthetic */ PointNRound(long j15, a aVar, int i15, k kVar) {
                this(j15, (i15 & 2) != 0 ? a.f81292d : aVar, null);
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final float a(long j15) {
            return (((float) Math.atan2(Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j15)), Float.intBitsToFloat((int) (j15 >> 32)))) * 180.0f) / 3.1415927f;
        }

        public static /* synthetic */ i c(Companion companion, int i15, int i16, Object obj) {
            if ((i16 & 1) != 0) {
                i15 = 10;
            }
            return companion.b(i15);
        }

        private final i f(List<PointNRound> pnr, int reps, long center, boolean mirroring) {
            List<PointNRound> listH = h(pnr, reps, center, mirroring);
            int size = listH.size() * 2;
            float[] fArr = new float[size];
            for (int i15 = 0; i15 < size; i15++) {
                long o15 = listH.get(i15 / 2).getO();
                fArr[i15] = Float.intBitsToFloat((int) (i15 % 2 == 0 ? o15 >> 32 : BodyPartID.bodyIdMax & o15));
            }
            List listC = v.c();
            Iterator<PointNRound> it = listH.iterator();
            while (it.hasNext()) {
                listC.add(it.next().getR());
            }
            i0 i0Var = i0.f148189a;
            return j.d(fArr, null, v.a(listC), Float.intBitsToFloat((int) (center >> 32)), Float.intBitsToFloat((int) (center & BodyPartID.bodyIdMax)), 2, null);
        }

        static /* synthetic */ i g(Companion companion, List list, int i15, long j15, boolean z15, int i16, Object obj) {
            if ((i16 & 4) != 0) {
                j15 = m3.e.e((((long) Float.floatToRawIntBits(0.5f)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.5f) << 32));
            }
            long j16 = j15;
            if ((i16 & 8) != 0) {
                z15 = false;
            }
            return companion.f(list, i15, j16, z15);
        }

        private final List<PointNRound> h(List<PointNRound> points, int reps, long center, boolean mirroring) {
            long j15 = center;
            if (!mirroring) {
                int size = points.size();
                lr.i iVarW = m.w(0, size * reps);
                ArrayList arrayList = new ArrayList(v.y(iVarW, 10));
                Iterator<Integer> it = iVarW.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((s0) it).nextInt();
                    int i15 = iNextInt % size;
                    arrayList.add(new PointNRound(rd.INSTANCE.t(points.get(i15).getO(), ((iNextInt / size) * 360.0f) / reps, j15), points.get(i15).getR(), null));
                    j15 = center;
                }
                return arrayList;
            }
            List listC = v.c();
            ArrayList arrayList2 = new ArrayList(points.size());
            List<PointNRound> list = points;
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList2.add(Float.valueOf(rd.INSTANCE.a(m3.e.p(points.get(i16).getO(), j15))));
            }
            ArrayList arrayList3 = new ArrayList(points.size());
            int size3 = list.size();
            for (int i17 = 0; i17 < size3; i17++) {
                arrayList3.add(Float.valueOf(m3.e.k(m3.e.p(points.get(i17).getO(), j15))));
            }
            int i18 = 2;
            int i19 = reps * 2;
            float f15 = 360.0f / i19;
            int i25 = 0;
            while (i25 < i19) {
                Iterator<Integer> it4 = v.o(list).iterator();
                while (it4.hasNext()) {
                    int iNextInt2 = ((s0) it4).nextInt();
                    int i26 = i25 % 2;
                    if (i26 != 0) {
                        iNextInt2 = v.p(points) - iNextInt2;
                    }
                    if (iNextInt2 > 0 || i26 == 0) {
                        double dW = rd.INSTANCE.w((i25 * f15) + (i26 == 0 ? ((Number) arrayList2.get(iNextInt2)).floatValue() : (f15 - ((Number) arrayList2.get(iNextInt2)).floatValue()) + (i18 * ((Number) arrayList2.get(0)).floatValue())));
                        listC.add(new PointNRound(m3.e.q(m3.e.r(m3.e.e((((long) Float.floatToRawIntBits((float) Math.cos(dW))) << 32) | (((long) Float.floatToRawIntBits((float) Math.sin(dW))) & BodyPartID.bodyIdMax)), ((Number) arrayList3.get(iNextInt2)).floatValue()), j15), points.get(iNextInt2).getR(), null));
                    } else {
                        i19 = i19;
                    }
                    i19 = i19;
                    i18 = 2;
                }
                i25++;
                i18 = 2;
            }
            return v.a(listC);
        }

        private final long t(long j15, float f15, long j16) {
            float fW = w(f15);
            long jP = m3.e.p(j15, j16);
            int i15 = (int) (jP >> 32);
            double d15 = fW;
            float fIntBitsToFloat = Float.intBitsToFloat(i15) * ((float) Math.cos(d15));
            int i16 = (int) (jP & BodyPartID.bodyIdMax);
            float fIntBitsToFloat2 = fIntBitsToFloat - (Float.intBitsToFloat(i16) * ((float) Math.sin(d15)));
            return m3.e.q(m3.e.e((((long) Float.floatToRawIntBits((Float.intBitsToFloat(i15) * ((float) Math.sin(d15))) + (Float.intBitsToFloat(i16) * ((float) Math.cos(d15))))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), j16);
        }

        private final float w(float f15) {
            return (f15 / 360.0f) * 2 * 3.1415927f;
        }

        public final i b(int numVertices) {
            return h7.k.b(i.INSTANCE, numVertices, 0.0f, 0.0f, 0.0f, 14, null);
        }

        public final i d() {
            k kVar = null;
            return g(this, v.q(new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(1.237f)) << 32) | (((long) Float.floatToRawIntBits(1.236f)) & BodyPartID.bodyIdMax)), new a(0.258f, 0.0f, 2, null), kVar), new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.918f)) & BodyPartID.bodyIdMax)), new a(0.233f, 0.0f, 2, null), kVar)), 4, 0L, false, 12, null);
        }

        public final i e() {
            return z1.a(h7.k.c(i.INSTANCE, 9, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? 0.5f : 0.8f, (242 & 8) != 0 ? a.f81292d : rd.f57547e, (242 & 16) != 0 ? null : null, (242 & 32) == 0 ? null : null, (242 & 64) != 0 ? 0.0f : 0.0f, (242 & 128) != 0 ? 0.0f : 0.0f), rd.f57550h);
        }

        public final i i() {
            i iVar = rd.f57552j;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = c(this, 0, 1, null).c();
            rd.f57552j = iVarC;
            return iVarC;
        }

        public final i j() {
            i iVar = rd.f57557o;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = d().c();
            rd.f57557o = iVarC;
            return iVarC;
        }

        public final i k() {
            i iVar = rd.f57558p;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = e().c();
            rd.f57558p = iVarC;
            return iVarC;
        }

        public final i l() {
            i iVar = rd.f57553k;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = q().c();
            rd.f57553k = iVarC;
            return iVarC;
        }

        public final i m() {
            i iVar = rd.f57555m;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = r().c();
            rd.f57555m = iVarC;
            return iVarC;
        }

        public final i n() {
            i iVar = rd.f57554l;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = s().c();
            rd.f57554l = iVarC;
            return iVarC;
        }

        public final i o() {
            i iVar = rd.f57559q;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = u().c();
            rd.f57559q = iVarC;
            return iVarC;
        }

        public final i p() {
            i iVar = rd.f57556n;
            if (iVar != null) {
                return iVar;
            }
            i iVarC = v().c();
            rd.f57556n = iVarC;
            return iVarC;
        }

        public final i q() {
            float[] fArrC = g2.c(null, 1, null);
            g2.o(fArrC, 1.0f, 0.64f, 0.0f, 4, null);
            return z1.a(z1.a(h7.k.b(i.INSTANCE, 0, 0.0f, 0.0f, 0.0f, 15, null), fArrC), rd.f57549g);
        }

        public final i r() {
            k kVar = null;
            return g(this, v.q(new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(-0.009f)) & BodyPartID.bodyIdMax)), new a(0.172f, 0.0f, 2, null), kVar), new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(1.03f)) << 32) | (((long) Float.floatToRawIntBits(0.365f)) & BodyPartID.bodyIdMax)), new a(0.164f, 0.0f, 2, null), kVar), new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(0.828f)) << 32) | (((long) Float.floatToRawIntBits(0.97f)) & BodyPartID.bodyIdMax)), new a(0.169f, 0.0f, 2, null), kVar)), 1, 0L, true, 4, null);
        }

        public final i s() {
            k kVar = null;
            a aVar = null;
            return g(this, v.q(new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(0.961f)) << 32) | (((long) Float.floatToRawIntBits(0.039f)) & BodyPartID.bodyIdMax)), new a(0.426f, 0.0f, 2, null), kVar), new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(1.001f)) << 32) | (((long) Float.floatToRawIntBits(0.428f)) & BodyPartID.bodyIdMax)), aVar, 2, null), new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(0.609f)) & BodyPartID.bodyIdMax)), new a(1.0f, 0.0f, 2, null), kVar)), 2, 0L, true, 4, null);
        }

        public final i u() {
            k kVar = null;
            return g(this, v.q(new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(0.193f)) << 32) | (((long) Float.floatToRawIntBits(0.277f)) & BodyPartID.bodyIdMax)), new a(0.053f, 0.0f, 2, null), kVar), new PointNRound(m3.e.e((((long) Float.floatToRawIntBits(0.176f)) << 32) | (((long) Float.floatToRawIntBits(0.055f)) & BodyPartID.bodyIdMax)), new a(0.053f, 0.0f, 2, null), kVar)), 10, 0L, false, 12, null);
        }

        public final i v() {
            return h7.k.c(i.INSTANCE, 8, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? 0.5f : 0.8f, (242 & 8) != 0 ? a.f81292d : rd.f57544b, (242 & 16) != 0 ? null : null, (242 & 32) == 0 ? null : null, (242 & 64) != 0 ? 0.0f : 0.0f, (242 & 128) != 0 ? 0.0f : 0.0f);
        }

        private Companion() {
        }
    }

    static {
        float[] fArrC = g2.c(null, 1, null);
        g2.m(fArrC, -45.0f);
        f57549g = fArrC;
        float[] fArrC2 = g2.c(null, 1, null);
        g2.m(fArrC2, -90.0f);
        f57550h = fArrC2;
        float[] fArrC3 = g2.c(null, 1, null);
        g2.m(fArrC3, -135.0f);
        f57551i = fArrC3;
    }
}
