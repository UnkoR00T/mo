package p036e4;

import c5.b;
import c5.d;
import c5.n;
import c5.r;
import c5.t;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import g4.m0;
import lr.m;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import q3.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J5\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH$¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R*\u0010$\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010)\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020%8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R$\u0010,\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0014\u00100\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018¨\u00061"}, d2 = {"Le4/a2;", "Le4/z0;", "<init>", "()V", "Loq/i0;", "T0", "Lc5/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "W0", "(JFLer/l;)V", "Lq3/c;", "layer", "Z0", "(JFLq3/c;)V", "", "value", "a", "I", "S0", "()I", "width", "b", "K0", "height", "Lc5/r;", "c", "J", "N0", "()J", "d1", "(J)V", "measuredSize", "Lc5/b;", "d", "R0", "j1", "measurementConstraints", "e", "I0", "apparentToRealOffset", "P0", "measuredWidth", "L0", "measuredHeight", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a2 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long measuredSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long measurementConstraints = b2.f47204b;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long apparentToRealOffset = n.INSTANCE.b();

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0014\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0016J#\u0010\u0017\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0011J9\u0010\u001b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010\u001d\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\u001f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001f\u0010\u001eJ9\u0010 \u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b \u0010\u001cJ+\u0010#\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b#\u0010$J+\u0010%\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b%\u0010$J!\u0010'\u001a\u00020\u00052\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00104\u001a\u00020\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058$X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Le4/a2$a;", "Lc5/d;", "<init>", "()V", "Le4/a2;", "Loq/i0;", "r", "(Le4/a2;)V", "Le4/i2;", "", "defaultValue", "i", "(Le4/i2;F)F", "Lc5/n;", "position", "zIndex", "K", "(Le4/a2;JF)V", "", "x", "y", i.f37087n, "(Le4/a2;IIF)V", "F", "Lkotlin/Function1;", "Ln3/a2;", "layerBlock", "T", "(Le4/a2;JFLer/l;)V", "Q", "(Le4/a2;IIFLer/l;)V", "Y", "e0", "Lq3/c;", "layer", "i0", "(Le4/a2;JLq3/c;F)V", "U", "block", "r0", "(Ler/l;)V", "", "a", "Z", "motionFrameOfReferencePlacement", "getDensity", "()F", "density", "i2", "fontScale", "n", "()I", "parentWidth", "Lc5/t;", "k", "()Lc5/t;", "parentLayoutDirection", "Le4/b0;", "m", "()Le4/b0;", "coordinates", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean motionFrameOfReferencePlacement;

        public static /* synthetic */ void E(a aVar, a2 a2Var, int i15, int i16, float f15, int i17, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i17 & 4) != 0) {
                f15 = 0.0f;
            }
            aVar.y(a2Var, i15, i16, f15);
        }

        public static /* synthetic */ void G(a aVar, a2 a2Var, long j15, float f15, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i15 & 2) != 0) {
                f15 = 0.0f;
            }
            aVar.F(a2Var, j15, f15);
        }

        public static /* synthetic */ void I(a aVar, a2 a2Var, int i15, int i16, float f15, int i17, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i17 & 4) != 0) {
                f15 = 0.0f;
            }
            aVar.H(a2Var, i15, i16, f15);
        }

        public static /* synthetic */ void O(a aVar, a2 a2Var, long j15, float f15, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i15 & 2) != 0) {
                f15 = 0.0f;
            }
            aVar.K(a2Var, j15, f15);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void R(a aVar, a2 a2Var, int i15, int i16, float f15, l lVar, int i17, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i17 & 4) != 0) {
                f15 = 0.0f;
            }
            float f16 = f15;
            if ((i17 & 8) != 0) {
                lVar = b2.f47203a;
            }
            aVar.Q(a2Var, i15, i16, f16, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void W(a aVar, a2 a2Var, long j15, float f15, l lVar, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i15 & 2) != 0) {
                f15 = 0.0f;
            }
            float f16 = f15;
            if ((i15 & 4) != 0) {
                lVar = b2.f47203a;
            }
            aVar.T(a2Var, j15, f16, lVar);
        }

        public static /* synthetic */ void X(a aVar, a2 a2Var, long j15, c cVar, float f15, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i15 & 4) != 0) {
                f15 = 0.0f;
            }
            aVar.U(a2Var, j15, cVar, f15);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void d0(a aVar, a2 a2Var, int i15, int i16, float f15, l lVar, int i17, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i17 & 4) != 0) {
                f15 = 0.0f;
            }
            float f16 = f15;
            if ((i17 & 8) != 0) {
                lVar = b2.f47203a;
            }
            aVar.Y(a2Var, i15, i16, f16, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void m0(a aVar, a2 a2Var, long j15, float f15, l lVar, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i15 & 2) != 0) {
                f15 = 0.0f;
            }
            float f16 = f15;
            if ((i15 & 4) != 0) {
                lVar = b2.f47203a;
            }
            aVar.e0(a2Var, j15, f16, lVar);
        }

        public static /* synthetic */ void o0(a aVar, a2 a2Var, long j15, c cVar, float f15, int i15, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i15 & 4) != 0) {
                f15 = 0.0f;
            }
            aVar.i0(a2Var, j15, cVar, f15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void r(a2 a2Var) {
            if (a2Var instanceof m0) {
                ((m0) a2Var).R(this.motionFrameOfReferencePlacement);
            }
        }

        public final void F(a2 a2Var, long j15, float f15) {
            r(a2Var);
            a2Var.W0(n.m(j15, a2Var.apparentToRealOffset), f15, null);
        }

        public final void H(a2 a2Var, int i15, int i16, float f15) {
            long jD = n.d((((long) i15) << 32) | (((long) i16) & BodyPartID.bodyIdMax));
            if (getParentLayoutDirection() == t.Ltr || getParentWidth() == 0) {
                r(a2Var);
                a2Var.W0(n.m(jD, a2Var.apparentToRealOffset), f15, null);
            } else {
                long jD2 = n.d((((long) ((getParentWidth() - a2Var.getWidth()) - n.i(jD))) << 32) | (((long) n.j(jD)) & BodyPartID.bodyIdMax));
                r(a2Var);
                a2Var.W0(n.m(jD2, a2Var.apparentToRealOffset), f15, null);
            }
        }

        public final void K(a2 a2Var, long j15, float f15) {
            if (getParentLayoutDirection() == t.Ltr || getParentWidth() == 0) {
                r(a2Var);
                a2Var.W0(n.m(j15, a2Var.apparentToRealOffset), f15, null);
                return;
            }
            int iN = (getParentWidth() - a2Var.getWidth()) - n.i(j15);
            long jD = n.d((((long) n.j(j15)) & BodyPartID.bodyIdMax) | (((long) iN) << 32));
            r(a2Var);
            a2Var.W0(n.m(jD, a2Var.apparentToRealOffset), f15, null);
        }

        public final void Q(a2 a2Var, int i15, int i16, float f15, l<? super n3.a2, i0> lVar) {
            long jD = n.d((((long) i15) << 32) | (((long) i16) & BodyPartID.bodyIdMax));
            if (getParentLayoutDirection() == t.Ltr || getParentWidth() == 0) {
                r(a2Var);
                a2Var.W0(n.m(jD, a2Var.apparentToRealOffset), f15, lVar);
            } else {
                long jD2 = n.d((((long) ((getParentWidth() - a2Var.getWidth()) - n.i(jD))) << 32) | (((long) n.j(jD)) & BodyPartID.bodyIdMax));
                r(a2Var);
                a2Var.W0(n.m(jD2, a2Var.apparentToRealOffset), f15, lVar);
            }
        }

        public final void T(a2 a2Var, long j15, float f15, l<? super n3.a2, i0> lVar) {
            if (getParentLayoutDirection() == t.Ltr || getParentWidth() == 0) {
                r(a2Var);
                a2Var.W0(n.m(j15, a2Var.apparentToRealOffset), f15, lVar);
                return;
            }
            int iN = (getParentWidth() - a2Var.getWidth()) - n.i(j15);
            long jD = n.d((((long) n.j(j15)) & BodyPartID.bodyIdMax) | (((long) iN) << 32));
            r(a2Var);
            a2Var.W0(n.m(jD, a2Var.apparentToRealOffset), f15, lVar);
        }

        public final void U(a2 a2Var, long j15, c cVar, float f15) {
            if (getParentLayoutDirection() == t.Ltr || getParentWidth() == 0) {
                r(a2Var);
                a2Var.Z0(n.m(j15, a2Var.apparentToRealOffset), f15, cVar);
                return;
            }
            int iN = (getParentWidth() - a2Var.getWidth()) - n.i(j15);
            long jD = n.d((((long) n.j(j15)) & BodyPartID.bodyIdMax) | (((long) iN) << 32));
            r(a2Var);
            a2Var.Z0(n.m(jD, a2Var.apparentToRealOffset), f15, cVar);
        }

        public final void Y(a2 a2Var, int i15, int i16, float f15, l<? super n3.a2, i0> lVar) {
            long jD = n.d((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
            r(a2Var);
            a2Var.W0(n.m(jD, a2Var.apparentToRealOffset), f15, lVar);
        }

        public final void e0(a2 a2Var, long j15, float f15, l<? super n3.a2, i0> lVar) {
            r(a2Var);
            a2Var.W0(n.m(j15, a2Var.apparentToRealOffset), f15, lVar);
        }

        @Override // c5.d
        public float getDensity() {
            return 1.0f;
        }

        public float i(i2 i2Var, float f15) {
            return f15;
        }

        public final void i0(a2 a2Var, long j15, c cVar, float f15) {
            r(a2Var);
            a2Var.Z0(n.m(j15, a2Var.apparentToRealOffset), f15, cVar);
        }

        @Override // c5.l
        /* JADX INFO: renamed from: i2 */
        public float getFontScale() {
            return 1.0f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: k */
        public abstract t getParentLayoutDirection();

        public b0 m() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX INFO: renamed from: n */
        public abstract int getParentWidth();

        public final void r0(l<? super a, i0> block) {
            this.motionFrameOfReferencePlacement = true;
            block.b(this);
            this.motionFrameOfReferencePlacement = false;
        }

        public final void y(a2 a2Var, int i15, int i16, float f15) {
            long jD = n.d((((long) i16) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
            r(a2Var);
            a2Var.W0(n.m(jD, a2Var.apparentToRealOffset), f15, null);
        }
    }

    public a2() {
        long j15 = 0;
        this.measuredSize = r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    private final void T0() {
        this.width = m.n((int) (this.measuredSize >> 32), b.n(this.measurementConstraints), b.l(this.measurementConstraints));
        int iN = m.n((int) (this.measuredSize & BodyPartID.bodyIdMax), b.m(this.measurementConstraints), b.k(this.measurementConstraints));
        this.height = iN;
        int i15 = this.width;
        long j15 = this.measuredSize;
        this.apparentToRealOffset = n.d((((long) ((i15 - ((int) (j15 >> 32))) / 2)) << 32) | (BodyPartID.bodyIdMax & ((long) ((iN - ((int) (j15 & BodyPartID.bodyIdMax))) / 2))));
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public int L0() {
        return (int) (this.measuredSize & BodyPartID.bodyIdMax);
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    public int P0() {
        return (int) (this.measuredSize >> 32);
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void W0(long position, float zIndex, l<? super n3.a2, i0> layerBlock);

    /* JADX INFO: Access modifiers changed from: protected */
    public void Z0(long position, float zIndex, c layer) {
        W0(position, zIndex, null);
    }

    protected final void d1(long j15) {
        if (r.e(this.measuredSize, j15)) {
            return;
        }
        this.measuredSize = j15;
        T0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j1(long j15) {
        if (b.f(this.measurementConstraints, j15)) {
            return;
        }
        this.measurementConstraints = j15;
        T0();
    }
}
