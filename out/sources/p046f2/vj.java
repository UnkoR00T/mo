package p046f2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import b1.l;
import c5.b;
import c5.h;
import e5.c;
import er.p;
import er.q;
import f3.m;
import l2.z0;
import m3.e;
import m3.i;
import m3.j;
import m3.k;
import n3.m2;
import n3.o1;
import n3.u0;
import oq.i0;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.m0;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p143z0.a2;
import p3.f;
import pq.n;
import w0.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0093\u0001\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001a\u0010\u001bJå\u0001\u0010,\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b,\u0010-JC\u00104\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00102\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u001eH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\fH\u0007¢\u0006\u0004\b6\u00107Js\u0010>\u001a\u00020\f2\b\b\u0002\u00108\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u00142\b\b\u0002\u0010#\u001a\u00020\u00142\b\b\u0002\u00109\u001a\u00020\u00142\b\b\u0002\u0010:\u001a\u00020\u00142\b\b\u0002\u0010;\u001a\u00020\u00142\b\b\u0002\u0010<\u001a\u00020\u00142\b\b\u0002\u0010=\u001a\u00020\u0014H\u0007¢\u0006\u0004\b>\u0010?J?\u0010D\u001a\u00020\u00112\u0006\u0010A\u001a\u00020@2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010EJ\u0089\u0001\u0010F\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2 \b\u0002\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\bF\u0010GJ)\u0010H\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010.\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0014¢\u0006\u0004\bH\u0010IR\u0017\u0010N\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010Q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010MR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010Y\u001a\u00020\f*\u00020V8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lf2/vj;", "", "<init>", "()V", "Lf2/mk;", "sliderState", "Lc5/h;", "trackCornerSize", "Lf3/m;", "modifier", "", "enabled", "Lf2/mj;", "colors", "Lkotlin/Function2;", "Lp3/f;", "Lm3/e;", "Loq/i0;", "drawStopIndicator", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Color;", "drawTick", "thumbTrackGapSize", "trackInsideCornerSize", "enableCornerShrinking", "isCentered", "k", "(Lf2/mk;FLf3/m;ZLf2/mj;Ler/p;Ler/q;FFZZLm2/r;II)V", "", "tickFractions", "", "activeRangeStart", "activeRangeEnd", "inactiveTrackColor", "activeTrackColor", "inactiveTickColor", "activeTickColor", "startThumbWidth", "startThumbHeight", "endThumbWidth", "endThumbHeight", "isRangeSlider", "Lz0/a2;", "orientation", "u", "(Lp3/f;[FFFJJJJFFFFFFFLer/p;Ler/q;ZZLz0/a2;Z)V", "offset", "Lm3/k;", "size", "color", "startCornerRadius", "endCornerRadius", "v", "(Lp3/f;Lz0/a2;JJJFF)V", "r", "(Lm2/r;I)Lf2/mj;", "thumbColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "s", "(JJJJJJJJJJLm2/r;III)Lf2/mj;", "Lb1/l;", "interactionSource", "Lc5/k;", "thumbSize", "h", "(Lb1/l;Lf3/m;Lf2/mj;ZJLm2/r;II)V", "j", "(Lf2/mk;Lf3/m;ZLf2/mj;Ler/p;Ler/q;FFLm2/r;II)V", "t", "(Lp3/f;JFJ)V", "b", "F", "getTrackStopIndicatorSize-D9Ej5fM", "()F", "TrackStopIndicatorSize", "c", "x", "TickSize", "Ln3/m2;", "d", "Ln3/m2;", "trackPath", "Lf2/e2;", "w", "(Lf2/e2;)Lf2/mj;", "defaultSliderColors", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vj f58107a = new vj();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float TrackStopIndicatorSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float TickSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final m2 trackPath;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<f, e, Color, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58111a = new a();

        a() {
        }

        public final void c(f fVar, long j15, long j16) {
            vj vjVar = vj.f58107a;
            vjVar.t(fVar, j15, vjVar.x(), j16);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(f fVar, e eVar, Color color) {
            c(fVar, eVar.getPackedValue(), color.m20unboximpl());
            return i0.f148189a;
        }
    }

    static {
        z0 z0Var = z0.f115398a;
        TrackStopIndicatorSize = z0Var.o();
        TickSize = z0Var.o();
        trackPath = u0.a();
    }

    private vj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(vj vjVar, l lVar, m mVar, mj mjVar, boolean z15, long j15, int i15, int i16, r rVar, int i17) {
        vjVar.h(lVar, mVar, mjVar, z15, j15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private final void k(final mk mkVar, final float f15, final m mVar, final boolean z15, final mj mjVar, final p<? super f, ? super e, i0> pVar, final q<? super f, ? super e, ? super Color, i0> qVar, final float f16, final float f17, final boolean z16, final boolean z17, r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        r rVar2;
        m mVarI;
        m mVar2;
        r rVarH = rVar.h(133396521);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(mkVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.b(f15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(mVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.W(mjVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.G(pVar) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i17 |= rVarH.G(qVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= rVarH.b(f16) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.b(f17) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i17 |= rVarH.a(z16) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (rVarH.a(z17) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if (rVarH.r(((i17 & 306783379) == 306783378 && (i18 & 3) == 2) ? false : true, i17 & 1)) {
            if (t.k()) {
                t.o(133396521, i17, i18, "androidx.compose.material3.SliderDefaults.TrackImpl (Slider.kt:1826)");
            }
            int i19 = i17;
            final long jD = mjVar.d(z15, false);
            final long jD2 = mjVar.d(z15, true);
            final long jC = mjVar.c(z15, false);
            int i25 = i18;
            final long jC2 = mjVar.c(z15, true);
            if (mkVar.getOrientation() == a2.Vertical) {
                mVarI = d.d(d.y(mVar, ik.L()), 0.0f, 1, null);
                if (mkVar.getReverseVerticalDirection()) {
                    mVarI = k3.r.b(mVarI, 1.0f, -1.0f);
                }
            } else {
                mVarI = d.i(d.h(mVar, 0.0f, 1, null), ik.L());
            }
            m.Companion companion = m.INSTANCE;
            int i26 = i19 & 112;
            boolean zG = (i26 == 32) | rVarH.G(mkVar);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new q() { // from class: f2.rj
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return vj.l(f15, mkVar, (y0) obj, (v0) obj2, (b) obj3);
                    }
                };
                rVarH.v(objE);
            }
            m mVarU = mVarI.u(m0.a(companion, (q) objE));
            boolean zG2 = (i26 == 32) | rVarH.G(mkVar) | rVarH.d(jD) | rVarH.d(jD2) | rVarH.d(jC) | rVarH.d(jC2) | ((i19 & 29360128) == 8388608) | ((i19 & 234881024) == 67108864) | ((i19 & 458752) == 131072) | ((i19 & 3670016) == 1048576) | ((i19 & 1879048192) == 536870912) | ((i25 & 14) == 4);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                mVar2 = mVarU;
                er.l lVar = new er.l() { // from class: f2.sj
                    @Override // er.l
                    public final Object b(Object obj) {
                        return vj.n(f15, mkVar, jD, jD2, jC, jC2, f16, f17, pVar, qVar, z16, z17, (f) obj);
                    }
                };
                rVar2 = rVarH;
                rVar2.v(lVar);
                objE2 = lVar;
            } else {
                mVar2 = mVarU;
                rVar2 = rVarH;
            }
            z.b(mVar2, (er.l) objE2, rVar2, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.tj
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return vj.o(this.f57873a, mkVar, f15, mVar, z15, mjVar, pVar, qVar, f16, f17, z16, z17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 l(float f15, mk mkVar, y0 y0Var, v0 v0Var, b bVar) {
        int iX0;
        final p036e4.a2 a2VarO0 = v0Var.o0(bVar.getValue());
        if (h.p(f15, h.INSTANCE.c())) {
            iX0 = mkVar.getOrientation() == a2.Vertical ? a2VarO0.getWidth() / 2 : a2VarO0.getHeight() / 2;
        } else {
            iX0 = y0Var.X0(f15);
        }
        return y0Var.x1(a2VarO0.getWidth(), a2VarO0.getHeight(), pq.v0.f(y.a(ik.K(), Integer.valueOf(iX0))), new er.l() { // from class: f2.uj
            @Override // er.l
            public final Object b(Object obj) {
                return vj.m(a2VarO0, (e4.a2.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(p036e4.a2 a2Var, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(float f15, mk mkVar, long j15, long j16, long j17, long j18, float f16, float f17, p pVar, q qVar, boolean z15, boolean z16, f fVar) {
        float fL2;
        if (h.p(f15, h.INSTANCE.c())) {
            fL2 = (mkVar.getOrientation() == a2.Vertical ? Float.intBitsToFloat((int) (fVar.a() >> 32)) : Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax))) / 2;
        } else {
            fL2 = fVar.l2(f15);
        }
        f58107a.u(fVar, mkVar.getTickFractions(), 0.0f, mkVar.i(), j15, j16, j17, j18, fVar.b2(0), fVar.b2(0), fVar.b2(mkVar.s()), fVar.b2(mkVar.r()), f16, f17, fVar.d2(fL2), pVar, qVar, false, z15, mkVar.getOrientation(), z16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(vj vjVar, mk mkVar, float f15, m mVar, boolean z15, mj mjVar, p pVar, q qVar, float f16, float f17, boolean z16, boolean z17, int i15, int i16, r rVar, int i17) {
        vjVar.k(mkVar, f15, mVar, z15, mjVar, pVar, qVar, f16, f17, z16, z17, rVar, g4.a(i15 | 1), g4.a(i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(mj mjVar, boolean z15, f fVar, e eVar) {
        vj vjVar = f58107a;
        long jD = mjVar.d(z15, true);
        vjVar.t(fVar, eVar.getPackedValue(), TrackStopIndicatorSize, jD);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(vj vjVar, mk mkVar, m mVar, boolean z15, mj mjVar, p pVar, q qVar, float f15, float f16, int i15, int i16, r rVar, int i17) {
        vjVar.j(mkVar, mVar, z15, mjVar, pVar, qVar, f15, f16, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0269  */
    /* JADX WARN: Code duplicated, block: B:184:0x0408  */
    /* JADX WARN: Code duplicated, block: B:213:0x050d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    private final void u(f fVar, float[] fArr, float f15, float f16, long j15, long j16, long j17, long j18, float f17, float f18, float f19, float f25, float f26, float f27, float f28, p<? super f, ? super e, i0> pVar, q<? super f, ? super e, ? super Color, i0> qVar, boolean z15, boolean z16, a2 a2Var, boolean z17) {
        float f29;
        float f35;
        boolean z18;
        long jE;
        long jD;
        float f36;
        float f37;
        long jE2;
        float f38;
        float f39;
        float f45;
        lr.e<Float> eVar;
        lr.e<Float> eVar2;
        long jE3;
        long jE4;
        long jD2;
        long jE5;
        long jD3;
        long jE6;
        float fL2;
        float fL3;
        float fL4;
        boolean z19 = a2Var == a2.Vertical;
        boolean z25 = fVar.getLayoutDirection() == c5.t.Rtl;
        boolean z26 = z25 && !z19;
        float fL5 = fVar.l2(f28);
        long jA = fVar.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (z19 ? jA & BodyPartID.bodyIdMax : jA >> 32));
        boolean z27 = fr.t.a(f15, n.o0(fArr)) || fr.t.a(f15, n.R0(fArr));
        float f46 = ((fArr.length == 0) || (fr.t.a(f16, n.o0(fArr)) || fr.t.a(f16, n.R0(fArr)))) ? 0.0f + ((fIntBitsToFloat - 0.0f) * f16) : (((fIntBitsToFloat - 0.0f) - (2 * fL5)) * f16) + 0.0f + fL5;
        float f47 = ((fArr.length == 0) || z27) ? 0.0f + ((fIntBitsToFloat - 0.0f) * f15) : (((fIntBitsToFloat - 0.0f) - (2 * fL5)) * f15) + 0.0f + fL5;
        float fL6 = fVar.l2(f27);
        if (h.l(f26, h.n(0)) > 0) {
            if (z19) {
                float f48 = 2;
                fL2 = (fVar.l2(f18) / f48) + fVar.l2(f26);
                fL3 = fVar.l2(f25) / f48;
                fL4 = fVar.l2(f26);
            } else {
                float f49 = 2;
                fL2 = (fVar.l2(f17) / f49) + fVar.l2(f26);
                fL3 = fVar.l2(f19) / f49;
                fL4 = fVar.l2(f26);
            }
            f29 = fL2;
            f35 = fL3 + fL4;
        } else {
            f29 = 0.0f;
            f35 = 0.0f;
        }
        long jY2 = fVar.y2();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (z19 ? jY2 & BodyPartID.bodyIdMax : jY2 >> 32));
        float f55 = f29 + 0.0f;
        if (z16) {
            if (!(fArr.length == 0)) {
                f55 += fL5;
            }
        } else {
            f55 += fL5;
        }
        float fMin = z17 ? Math.min(f46, fIntBitsToFloat2) : f47;
        if ((z17 || z15) && fMin > f55) {
            float f56 = z26 ? fL6 : fL5;
            float f57 = z26 ? fL5 : fL6;
            float f58 = fMin - f29;
            if (z26) {
                z18 = true;
                jE = e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)) - f58)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
            } else {
                z18 = true;
                jE = e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
            }
            if (z19) {
                jD = k.d((((long) Float.floatToRawIntBits(f58 - 0.0f)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)))) << 32));
            } else {
                jD = k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f58 - 0.0f)) << 32));
            }
            f36 = fIntBitsToFloat2;
            f37 = f46;
            v(fVar, a2Var, jE, jD, j15, f56, f57);
            if (z19) {
                jE2 = e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fL5 + 0.0f)) & BodyPartID.bodyIdMax));
            } else if (z25) {
                jE2 = e.e((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fVar.a() >> 32)) - 0.0f) - fL5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            } else {
                jE2 = e.e((((long) Float.floatToRawIntBits(fL5 + 0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            }
            if (pVar != null) {
                pVar.B(fVar, e.d(jE2));
                i0 i0Var = i0.f148189a;
            }
        } else {
            f36 = fIntBitsToFloat2;
            f37 = f46;
            z18 = true;
        }
        float f59 = fIntBitsToFloat - f35;
        if (z16) {
            if (!(fArr.length == 0 ? z18 : false)) {
                f59 -= fL5;
            }
        } else {
            f59 -= fL5;
        }
        float fMax = z17 ? Math.max(f37, f36) : f37;
        if (fMax < f59) {
            float f65 = z26 ? fL5 : fL6;
            float f66 = z26 ? fL6 : fL5;
            float f67 = fMax + f35;
            float f68 = fIntBitsToFloat - f67;
            if (z19) {
                jE5 = e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f67)) & BodyPartID.bodyIdMax));
            } else if (z25) {
                jE5 = e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
            } else {
                jE5 = e.e((((long) Float.floatToRawIntBits(f67)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
            }
            if (z19) {
                jD3 = k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f68)) & BodyPartID.bodyIdMax));
            } else if (!z25 || z15) {
                jD3 = k.d((((long) Float.floatToRawIntBits(f68)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            } else {
                jD3 = k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)) - f67)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            }
            v(fVar, a2Var, jE5, jD3, j15, f65, f66);
            if (z19) {
                jE6 = e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - fL5)) & BodyPartID.bodyIdMax));
            } else if (z25) {
                jE6 = e.e((((long) Float.floatToRawIntBits(fL5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            } else {
                jE6 = e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat - fL5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            }
            if (pVar != null) {
                pVar.B(fVar, e.d(jE6));
                i0 i0Var2 = i0.f148189a;
            }
        }
        if (z17) {
            f38 = fMin + (fMin < f36 ? f29 : 0.0f);
        } else {
            f38 = z15 ? f47 + f29 : 0.0f;
        }
        if (z17) {
            f39 = fMax - (fMax > f36 ? f35 : 0.0f);
        } else {
            f39 = f37 - f35;
        }
        float f69 = (z26 || z17 || z15) ? fL6 : fL5;
        float f75 = (!z26 || z17 || z15) ? fL6 : fL5;
        float f76 = (!z26 || z17 || z15) ? f39 - f38 : f39;
        if (z16) {
            if (fArr.length == 0 ? z18 : false) {
                f45 = 0.0f;
            } else {
                f45 = f69;
            }
        } else {
            f45 = f69;
        }
        if (f76 > f45) {
            if (z19) {
                jE4 = e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f38)) & BodyPartID.bodyIdMax));
            } else if (z25) {
                jE4 = e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)) - f39)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
            } else {
                jE4 = e.e((((long) Float.floatToRawIntBits(f38)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax));
            }
            long j19 = jE4;
            if (z19) {
                jD2 = k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f76)) & BodyPartID.bodyIdMax));
            } else if (!z25 || z17 || z15) {
                jD2 = k.d((((long) Float.floatToRawIntBits(f76)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            } else {
                jD2 = k.d((((long) Float.floatToRawIntBits(f39)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
            }
            v(fVar, a2Var, j19, jD2, j16, f69, f75);
        }
        float f77 = 0.0f + fL5;
        float f78 = fIntBitsToFloat - fL5;
        lr.e<Float> eVarB = lr.m.b(f38, f39);
        lr.e<Float> eVarB2 = lr.m.b(f36 - f35, f36 + f35);
        lr.e<Float> eVarB3 = lr.m.b(f47 - f29, f47 + f29);
        lr.e<Float> eVarB4 = lr.m.b(f37 - f35, f37 + f35);
        int length = fArr.length;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            float f79 = fArr[i16];
            int i17 = i15 + 1;
            if (pVar == null || !(((z17 || z15) && i15 == 0) || i15 == fArr.length - 1)) {
                float fB = c.b(f77, f78, f79);
                if ((z17 && eVarB2.g(Float.valueOf(fB))) || ((z15 && eVarB3.g(Float.valueOf(fB))) || eVarB4.g(Float.valueOf(fB)))) {
                    eVar = eVarB2;
                    eVar2 = eVarB3;
                } else {
                    if (z19) {
                        eVar = eVarB2;
                        eVar2 = eVarB3;
                        jE3 = e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fB)) & BodyPartID.bodyIdMax));
                    } else {
                        eVar = eVarB2;
                        eVar2 = eVarB3;
                        if (z25) {
                            jE3 = e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.a() >> 32)) - fB)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
                        } else {
                            jE3 = e.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fVar.y2() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
                        }
                    }
                    qVar.w(fVar, e.d(jE3), Color.m0boximpl(eVarB.g(Float.valueOf(fB)) ? j18 : j17));
                }
            } else {
                eVar = eVarB2;
                eVar2 = eVarB3;
            }
            i16++;
            eVarB2 = eVar;
            eVarB3 = eVar2;
            i15 = i17;
        }
    }

    private final void v(f fVar, a2 a2Var, long j15, long j16, long j17, float f15, float f16) {
        i iVarC;
        long jB = m3.a.b((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
        long jB2 = m3.a.b((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax));
        if (a2Var == a2.Vertical) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j16 >> 32));
            iVarC = j.c(m3.h.c(j15, k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32))), jB, jB, jB2, jB2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j16 >> 32));
            iVarC = j.c(m3.h.c(j15, k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j16 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32))), jB, jB2, jB2, jB);
        }
        m2 m2Var = trackPath;
        m2.o(m2Var, iVarC, null, 2, null);
        f.e2(fVar, m2Var, j17, 0.0f, null, null, 0, 60, null);
        m2Var.l();
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    public final void h(final l lVar, m mVar, mj mjVar, boolean z15, long j15, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        mj mjVar2;
        int i18;
        boolean z16;
        int i19;
        int i25;
        long j16;
        int i26;
        boolean z17;
        r rVar2;
        final m mVar3;
        final mj mjVar3;
        final boolean z18;
        final long j17;
        d5 d5VarM;
        m mVar4;
        long j18;
        boolean z19;
        m mVar5;
        int i27;
        r rVarH = rVar.h(-290277409);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(lVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i28 = i16 & 2;
        if (i28 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) == 0) {
                    mjVar2 = mjVar;
                    int i29 = rVarH.W(mjVar2) ? 256 : 128;
                    i17 |= i29;
                } else {
                    mjVar2 = mjVar;
                }
                i17 |= i29;
            } else {
                mjVar2 = mjVar;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        j16 = j15;
                        if (rVarH.d(j16)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    if ((i15 & 196608) == 0) {
                        if (rVarH.W(this)) {
                            i27 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i27 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i27;
                    }
                    if ((74899 & i17) != 74898) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if (i28 != 0) {
                                mVar4 = m.INSTANCE;
                            } else {
                                mVar4 = mVar2;
                            }
                            if ((i16 & 4) != 0) {
                                mj mjVarR = r(rVarH, (i17 >> 15) & 14);
                                i17 &= -897;
                                mjVar2 = mjVarR;
                            }
                            if (i18 != 0) {
                                z16 = true;
                            }
                            if (i25 != 0) {
                                j18 = ik.f56345d;
                            } else {
                                j18 = j16;
                            }
                            z19 = z16;
                            mVar5 = mVar4;
                        } else {
                            rVarH.O();
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                            }
                            mjVar2 = mjVar2;
                            j18 = j16;
                            z19 = z16;
                            mVar5 = mVar2;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
                        }
                        rVar2 = rVarH;
                        ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        mVar3 = mVar5;
                        mjVar3 = mjVar2;
                        z18 = z19;
                        j17 = j18;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        mVar3 = mVar2;
                        mjVar3 = mjVar2;
                        z18 = z16;
                        j17 = j16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.qj
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                j16 = j15;
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(this)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i27;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i28 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 4) != 0) {
                            mj mjVarR2 = r(rVarH, (i17 >> 15) & 14);
                            i17 &= -897;
                            mjVar2 = mjVarR2;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            j18 = ik.f56345d;
                        } else {
                            j18 = j16;
                        }
                        z19 = z16;
                        mVar5 = mVar4;
                    } else {
                        if (i28 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 4) != 0) {
                            mj mjVarR3 = r(rVarH, (i17 >> 15) & 14);
                            i17 &= -897;
                            mjVar2 = mjVarR3;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            j18 = ik.f56345d;
                        } else {
                            j18 = j16;
                        }
                        z19 = z16;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
                    }
                    rVar2 = rVarH;
                    ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    mjVar3 = mjVar2;
                    z18 = z19;
                    j17 = j18;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    mjVar3 = mjVar2;
                    z18 = z16;
                    j17 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.qj
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            z16 = z15;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    j16 = j15;
                    if (rVarH.d(j16)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(this)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i27;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i28 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 4) != 0) {
                            mj mjVarR4 = r(rVarH, (i17 >> 15) & 14);
                            i17 &= -897;
                            mjVar2 = mjVarR4;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            j18 = ik.f56345d;
                        } else {
                            j18 = j16;
                        }
                        z19 = z16;
                        mVar5 = mVar4;
                    } else {
                        if (i28 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 4) != 0) {
                            mj mjVarR5 = r(rVarH, (i17 >> 15) & 14);
                            i17 &= -897;
                            mjVar2 = mjVarR5;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            j18 = ik.f56345d;
                        } else {
                            j18 = j16;
                        }
                        z19 = z16;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
                    }
                    rVar2 = rVarH;
                    ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    mjVar3 = mjVar2;
                    z18 = z19;
                    j17 = j18;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    mjVar3 = mjVar2;
                    z18 = z16;
                    j17 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.qj
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            j16 = j15;
            if ((i15 & 196608) == 0) {
                if (rVarH.W(this)) {
                    i27 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i27 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i27;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i28 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        mj mjVarR6 = r(rVarH, (i17 >> 15) & 14);
                        i17 &= -897;
                        mjVar2 = mjVarR6;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        j18 = ik.f56345d;
                    } else {
                        j18 = j16;
                    }
                    z19 = z16;
                    mVar5 = mVar4;
                } else {
                    if (i28 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        mj mjVarR7 = r(rVarH, (i17 >> 15) & 14);
                        i17 &= -897;
                        mjVar2 = mjVarR7;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        j18 = ik.f56345d;
                    } else {
                        j18 = j16;
                    }
                    z19 = z16;
                    mVar5 = mVar4;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
                }
                rVar2 = rVarH;
                ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                mjVar3 = mjVar2;
                z18 = z19;
                j17 = j18;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                mjVar3 = mjVar2;
                z18 = z16;
                j17 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.qj
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                mjVar2 = mjVar;
                if (rVarH.W(mjVar2)) {
                }
                i17 |= i29;
            } else {
                mjVar2 = mjVar;
            }
            i17 |= i29;
        } else {
            mjVar2 = mjVar;
        }
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    j16 = j15;
                    if (rVarH.d(j16)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((i15 & 196608) == 0) {
                    if (rVarH.W(this)) {
                        i27 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i27 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i27;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i28 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 4) != 0) {
                            mj mjVarR8 = r(rVarH, (i17 >> 15) & 14);
                            i17 &= -897;
                            mjVar2 = mjVarR8;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            j18 = ik.f56345d;
                        } else {
                            j18 = j16;
                        }
                        z19 = z16;
                        mVar5 = mVar4;
                    } else {
                        if (i28 != 0) {
                            mVar4 = m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if ((i16 & 4) != 0) {
                            mj mjVarR9 = r(rVarH, (i17 >> 15) & 14);
                            i17 &= -897;
                            mjVar2 = mjVarR9;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if (i25 != 0) {
                            j18 = ik.f56345d;
                        } else {
                            j18 = j16;
                        }
                        z19 = z16;
                        mVar5 = mVar4;
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
                    }
                    rVar2 = rVarH;
                    ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    mVar3 = mVar5;
                    mjVar3 = mjVar2;
                    z18 = z19;
                    j17 = j18;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    mVar3 = mVar2;
                    mjVar3 = mjVar2;
                    z18 = z16;
                    j17 = j16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.qj
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            j16 = j15;
            if ((i15 & 196608) == 0) {
                if (rVarH.W(this)) {
                    i27 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i27 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i27;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i28 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        mj mjVarR10 = r(rVarH, (i17 >> 15) & 14);
                        i17 &= -897;
                        mjVar2 = mjVarR10;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        j18 = ik.f56345d;
                    } else {
                        j18 = j16;
                    }
                    z19 = z16;
                    mVar5 = mVar4;
                } else {
                    if (i28 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        mj mjVarR11 = r(rVarH, (i17 >> 15) & 14);
                        i17 &= -897;
                        mjVar2 = mjVarR11;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        j18 = ik.f56345d;
                    } else {
                        j18 = j16;
                    }
                    z19 = z16;
                    mVar5 = mVar4;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
                }
                rVar2 = rVarH;
                ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                mjVar3 = mjVar2;
                z18 = z19;
                j17 = j18;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                mjVar3 = mjVar2;
                z18 = z16;
                j17 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.qj
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z16 = z15;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                j16 = j15;
                if (rVarH.d(j16)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            if ((i15 & 196608) == 0) {
                if (rVarH.W(this)) {
                    i27 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i27 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i27;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i28 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        mj mjVarR12 = r(rVarH, (i17 >> 15) & 14);
                        i17 &= -897;
                        mjVar2 = mjVarR12;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        j18 = ik.f56345d;
                    } else {
                        j18 = j16;
                    }
                    z19 = z16;
                    mVar5 = mVar4;
                } else {
                    if (i28 != 0) {
                        mVar4 = m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if ((i16 & 4) != 0) {
                        mj mjVarR13 = r(rVarH, (i17 >> 15) & 14);
                        i17 &= -897;
                        mjVar2 = mjVarR13;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if (i25 != 0) {
                        j18 = ik.f56345d;
                    } else {
                        j18 = j16;
                    }
                    z19 = z16;
                    mVar5 = mVar4;
                }
                rVarH.y();
                if (t.k()) {
                    t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
                }
                rVar2 = rVarH;
                ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar5;
                mjVar3 = mjVar2;
                z18 = z19;
                j17 = j18;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                mVar3 = mVar2;
                mjVar3 = mjVar2;
                z18 = z16;
                j17 = j16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.qj
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        j16 = j15;
        if ((i15 & 196608) == 0) {
            if (rVarH.W(this)) {
                i27 = PKIFailureInfo.unsupportedVersion;
            } else {
                i27 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i27;
        }
        if ((74899 & i17) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i28 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 4) != 0) {
                    mj mjVarR14 = r(rVarH, (i17 >> 15) & 14);
                    i17 &= -897;
                    mjVar2 = mjVarR14;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i25 != 0) {
                    j18 = ik.f56345d;
                } else {
                    j18 = j16;
                }
                z19 = z16;
                mVar5 = mVar4;
            } else {
                if (i28 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if ((i16 & 4) != 0) {
                    mj mjVarR15 = r(rVarH, (i17 >> 15) & 14);
                    i17 &= -897;
                    mjVar2 = mjVarR15;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if (i25 != 0) {
                    j18 = ik.f56345d;
                } else {
                    j18 = j16;
                }
                z19 = z16;
                mVar5 = mVar4;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-290277409, i17, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:1537)");
            }
            rVar2 = rVarH;
            ik.y(lVar, mVar5, mjVar2, z19, j18, false, rVar2, (i17 & 14) | 196608 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344));
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar5;
            mjVar3 = mjVar2;
            z18 = z19;
            j17 = j18;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
            mjVar3 = mjVar2;
            z18 = z16;
            j17 = j16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.qj
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return vj.i(this.f57424a, lVar, mVar3, mjVar3, z18, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:129:0x0178  */
    /* JADX WARN: Code duplicated, block: B:132:0x0182  */
    /* JADX WARN: Code duplicated, block: B:134:0x018a  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:153:0x021b  */
    /* JADX WARN: Code duplicated, block: B:156:0x022c  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public final void j(final mk mkVar, m mVar, boolean z15, mj mjVar, p<? super f, ? super e, i0> pVar, q<? super f, ? super e, ? super Color, i0> qVar, float f15, float f16, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        int i18;
        final boolean z16;
        int i19;
        final mj mjVar2;
        p<? super f, ? super e, i0> pVar2;
        int i25;
        int i26;
        int i27;
        final float f17;
        int i28;
        int i29;
        int i35;
        boolean z17;
        final q<? super f, ? super e, ? super Color, i0> qVar2;
        final m mVar3;
        final boolean z18;
        final mj mjVar3;
        final p<? super f, ? super e, i0> pVar3;
        final float f18;
        d5 d5VarM;
        q<? super f, ? super e, ? super Color, i0> qVar3;
        int i36;
        Object objE;
        boolean z19;
        Object objE2;
        int i37;
        int i38;
        r rVarH = rVar.h(49984771);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(mkVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if ((i16 & 8) == 0) {
                        mjVar2 = mjVar;
                        int i45 = rVarH.W(mjVar2) ? 2048 : 1024;
                        i17 |= i45;
                    } else {
                        mjVar2 = mjVar;
                    }
                    i17 |= i45;
                } else {
                    mjVar2 = mjVar;
                }
                if ((i15 & 24576) == 0) {
                    if ((i16 & 16) == 0) {
                        pVar2 = pVar;
                        if (rVarH.G(pVar2)) {
                            i38 = 16384;
                        }
                        i17 |= i38;
                    } else {
                        pVar2 = pVar;
                    }
                    i38 = PKIFailureInfo.certRevoked;
                    i17 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    i17 |= 196608;
                } else if ((i15 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    i17 |= 1572864;
                    f17 = f15;
                } else {
                    f17 = f15;
                    if ((i15 & 1572864) == 0) {
                        if (rVarH.b(f17)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.b(f16)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(this)) {
                        i37 = 67108864;
                    } else {
                        i37 = 33554432;
                    }
                    i17 |= i37;
                }
                if ((i17 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i18 != 0) {
                            z16 = true;
                        }
                        if ((i16 & 8) != 0) {
                            mj mjVarR = r(rVarH, (i17 >> 24) & 14);
                            i17 &= -7169;
                            mjVar2 = mjVarR;
                        }
                        if ((i16 & 16) != 0) {
                            z19 = ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.W(mjVar2)) || (i17 & 3072) == 2048) | ((i17 & 896) == 256);
                            objE2 = rVarH.E();
                            if (z19 || objE2 == r.INSTANCE.a()) {
                                objE2 = new p() { // from class: f2.oj
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                    }
                                };
                                rVarH.v(objE2);
                            }
                            pVar2 = (p) objE2;
                            i17 = (-57345) & i17;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = a.f58111a;
                                rVarH.v(objE);
                            }
                            qVar3 = (q) objE;
                        } else {
                            qVar3 = qVar;
                        }
                        if (i27 != 0) {
                            f17 = ik.f56347f;
                        }
                        if (i29 != 0) {
                            qVar2 = qVar3;
                            i36 = i17;
                            z18 = z16;
                            mjVar3 = mjVar2;
                            f18 = ik.f56348g;
                        } else {
                            qVar2 = qVar3;
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(49984771, i36, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1686)");
                        }
                        int i46 = i36 << 3;
                        mVar3 = mVar2;
                        pVar3 = pVar2;
                        k(mkVar, h.INSTANCE.c(), mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, false, false, rVarH, (i36 & 14) | 805306416 | (i46 & 896) | (i46 & 7168) | (57344 & i46) | (458752 & i46) | (3670016 & i46) | (29360128 & i46) | (i46 & 234881024), ((i36 >> 21) & 112) | 6);
                        if (t.k()) {
                            t.n();
                        }
                    } else {
                        rVarH.O();
                        if ((i16 & 8) != 0) {
                            i17 &= -7169;
                        }
                        if ((i16 & 16) != 0) {
                            i17 &= -57345;
                        }
                        qVar2 = qVar;
                    }
                    i36 = i17;
                    z18 = z16;
                    mjVar3 = mjVar2;
                    f18 = f16;
                    rVarH.y();
                    if (t.k()) {
                        t.o(49984771, i36, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1686)");
                    }
                    int i47 = i36 << 3;
                    mVar3 = mVar2;
                    pVar3 = pVar2;
                    k(mkVar, h.INSTANCE.c(), mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, false, false, rVarH, (i36 & 14) | 805306416 | (i47 & 896) | (i47 & 7168) | (57344 & i47) | (458752 & i47) | (3670016 & i47) | (29360128 & i47) | (i47 & 234881024), ((i36 >> 21) & 112) | 6);
                    if (t.k()) {
                        t.n();
                    }
                } else {
                    rVarH.O();
                    qVar2 = qVar;
                    mVar3 = mVar2;
                    z18 = z16;
                    mjVar3 = mjVar2;
                    pVar3 = pVar2;
                    f18 = f16;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.pj
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return vj.q(this.f57288a, mkVar, mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            z16 = z15;
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    mjVar2 = mjVar;
                    if (rVarH.W(mjVar2)) {
                    }
                    i17 |= i45;
                } else {
                    mjVar2 = mjVar;
                }
                i17 |= i45;
            } else {
                mjVar2 = mjVar;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    pVar2 = pVar;
                    if (rVarH.G(pVar2)) {
                        i38 = 16384;
                    }
                    i17 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i38 = PKIFailureInfo.certRevoked;
                i17 |= i38;
            } else {
                pVar2 = pVar;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
            } else if ((i15 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
                f17 = f15;
            } else {
                f17 = f15;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.b(f17)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.b(f16)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(this)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i17 |= i37;
            }
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        mj mjVarR2 = r(rVarH, (i17 >> 24) & 14);
                        i17 &= -7169;
                        mjVar2 = mjVarR2;
                    }
                    if ((i16 & 16) != 0) {
                        z19 = ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.W(mjVar2)) || (i17 & 3072) == 2048) | ((i17 & 896) == 256);
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        pVar2 = (p) objE2;
                        i17 = (-57345) & i17;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = a.f58111a;
                            rVarH.v(objE);
                        }
                        qVar3 = (q) objE;
                    } else {
                        qVar3 = qVar;
                    }
                    if (i27 != 0) {
                        f17 = ik.f56347f;
                    }
                    if (i29 != 0) {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = ik.f56348g;
                    } else {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = f16;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        mj mjVarR3 = r(rVarH, (i17 >> 24) & 14);
                        i17 &= -7169;
                        mjVar2 = mjVarR3;
                    }
                    if ((i16 & 16) != 0) {
                        z19 = ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.W(mjVar2)) || (i17 & 3072) == 2048) | ((i17 & 896) == 256);
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        pVar2 = (p) objE2;
                        i17 = (-57345) & i17;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = a.f58111a;
                            rVarH.v(objE);
                        }
                        qVar3 = (q) objE;
                    } else {
                        qVar3 = qVar;
                    }
                    if (i27 != 0) {
                        f17 = ik.f56347f;
                    }
                    if (i29 != 0) {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = ik.f56348g;
                    } else {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = f16;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(49984771, i36, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1686)");
                }
                int i48 = i36 << 3;
                mVar3 = mVar2;
                pVar3 = pVar2;
                k(mkVar, h.INSTANCE.c(), mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, false, false, rVarH, (i36 & 14) | 805306416 | (i48 & 896) | (i48 & 7168) | (57344 & i48) | (458752 & i48) | (3670016 & i48) | (29360128 & i48) | (i48 & 234881024), ((i36 >> 21) & 112) | 6);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                qVar2 = qVar;
                mVar3 = mVar2;
                z18 = z16;
                mjVar3 = mjVar2;
                pVar3 = pVar2;
                f18 = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.pj
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return vj.q(this.f57288a, mkVar, mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    mjVar2 = mjVar;
                    if (rVarH.W(mjVar2)) {
                    }
                    i17 |= i45;
                } else {
                    mjVar2 = mjVar;
                }
                i17 |= i45;
            } else {
                mjVar2 = mjVar;
            }
            if ((i15 & 24576) == 0) {
                if ((i16 & 16) == 0) {
                    pVar2 = pVar;
                    if (rVarH.G(pVar2)) {
                        i38 = 16384;
                    }
                    i17 |= i38;
                } else {
                    pVar2 = pVar;
                }
                i38 = PKIFailureInfo.certRevoked;
                i17 |= i38;
            } else {
                pVar2 = pVar;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                i17 |= 196608;
            } else if ((i15 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                i17 |= 1572864;
                f17 = f15;
            } else {
                f17 = f15;
                if ((i15 & 1572864) == 0) {
                    if (rVarH.b(f17)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.b(f16)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(this)) {
                    i37 = 67108864;
                } else {
                    i37 = 33554432;
                }
                i17 |= i37;
            }
            if ((i17 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        mj mjVarR4 = r(rVarH, (i17 >> 24) & 14);
                        i17 &= -7169;
                        mjVar2 = mjVarR4;
                    }
                    if ((i16 & 16) != 0) {
                        z19 = ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.W(mjVar2)) || (i17 & 3072) == 2048) | ((i17 & 896) == 256);
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        pVar2 = (p) objE2;
                        i17 = (-57345) & i17;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = a.f58111a;
                            rVarH.v(objE);
                        }
                        qVar3 = (q) objE;
                    } else {
                        qVar3 = qVar;
                    }
                    if (i27 != 0) {
                        f17 = ik.f56347f;
                    }
                    if (i29 != 0) {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = ik.f56348g;
                    } else {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = f16;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i18 != 0) {
                        z16 = true;
                    }
                    if ((i16 & 8) != 0) {
                        mj mjVarR5 = r(rVarH, (i17 >> 24) & 14);
                        i17 &= -7169;
                        mjVar2 = mjVarR5;
                    }
                    if ((i16 & 16) != 0) {
                        z19 = ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.W(mjVar2)) || (i17 & 3072) == 2048) | ((i17 & 896) == 256);
                        objE2 = rVarH.E();
                        if (z19) {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        } else {
                            objE2 = new p() { // from class: f2.oj
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                                }
                            };
                            rVarH.v(objE2);
                        }
                        pVar2 = (p) objE2;
                        i17 = (-57345) & i17;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = a.f58111a;
                            rVarH.v(objE);
                        }
                        qVar3 = (q) objE;
                    } else {
                        qVar3 = qVar;
                    }
                    if (i27 != 0) {
                        f17 = ik.f56347f;
                    }
                    if (i29 != 0) {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = ik.f56348g;
                    } else {
                        qVar2 = qVar3;
                        i36 = i17;
                        z18 = z16;
                        mjVar3 = mjVar2;
                        f18 = f16;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(49984771, i36, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1686)");
                }
                int i49 = i36 << 3;
                mVar3 = mVar2;
                pVar3 = pVar2;
                k(mkVar, h.INSTANCE.c(), mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, false, false, rVarH, (i36 & 14) | 805306416 | (i49 & 896) | (i49 & 7168) | (57344 & i49) | (458752 & i49) | (3670016 & i49) | (29360128 & i49) | (i49 & 234881024), ((i36 >> 21) & 112) | 6);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                qVar2 = qVar;
                mVar3 = mVar2;
                z18 = z16;
                mjVar3 = mjVar2;
                pVar3 = pVar2;
                f18 = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.pj
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return vj.q(this.f57288a, mkVar, mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        z16 = z15;
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                mjVar2 = mjVar;
                if (rVarH.W(mjVar2)) {
                }
                i17 |= i45;
            } else {
                mjVar2 = mjVar;
            }
            i17 |= i45;
        } else {
            mjVar2 = mjVar;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                pVar2 = pVar;
                if (rVarH.G(pVar2)) {
                    i38 = 16384;
                }
                i17 |= i38;
            } else {
                pVar2 = pVar;
            }
            i38 = PKIFailureInfo.certRevoked;
            i17 |= i38;
        } else {
            pVar2 = pVar;
        }
        i25 = i16 & 32;
        if (i25 != 0) {
            i17 |= 196608;
        } else if ((i15 & 196608) == 0) {
            if (rVarH.G(qVar)) {
                i26 = PKIFailureInfo.unsupportedVersion;
            } else {
                i26 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i26;
        }
        i27 = i16 & 64;
        if (i27 != 0) {
            i17 |= 1572864;
            f17 = f15;
        } else {
            f17 = f15;
            if ((i15 & 1572864) == 0) {
                if (rVarH.b(f17)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
        }
        i29 = i16 & 128;
        if (i29 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.b(f16)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i17 |= i35;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.W(this)) {
                i37 = 67108864;
            } else {
                i37 = 33554432;
            }
            i17 |= i37;
        }
        if ((i17 & 38347923) != 38347922) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i39 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 8) != 0) {
                    mj mjVarR6 = r(rVarH, (i17 >> 24) & 14);
                    i17 &= -7169;
                    mjVar2 = mjVarR6;
                }
                if ((i16 & 16) != 0) {
                    z19 = ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.W(mjVar2)) || (i17 & 3072) == 2048) | ((i17 & 896) == 256);
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new p() { // from class: f2.oj
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new p() { // from class: f2.oj
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    pVar2 = (p) objE2;
                    i17 = (-57345) & i17;
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = a.f58111a;
                        rVarH.v(objE);
                    }
                    qVar3 = (q) objE;
                } else {
                    qVar3 = qVar;
                }
                if (i27 != 0) {
                    f17 = ik.f56347f;
                }
                if (i29 != 0) {
                    qVar2 = qVar3;
                    i36 = i17;
                    z18 = z16;
                    mjVar3 = mjVar2;
                    f18 = ik.f56348g;
                } else {
                    qVar2 = qVar3;
                    i36 = i17;
                    z18 = z16;
                    mjVar3 = mjVar2;
                    f18 = f16;
                }
            } else {
                if (i39 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i18 != 0) {
                    z16 = true;
                }
                if ((i16 & 8) != 0) {
                    mj mjVarR7 = r(rVarH, (i17 >> 24) & 14);
                    i17 &= -7169;
                    mjVar2 = mjVarR7;
                }
                if ((i16 & 16) != 0) {
                    z19 = ((((i17 & 7168) ^ 3072) <= 2048 && rVarH.W(mjVar2)) || (i17 & 3072) == 2048) | ((i17 & 896) == 256);
                    objE2 = rVarH.E();
                    if (z19) {
                        objE2 = new p() { // from class: f2.oj
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                            }
                        };
                        rVarH.v(objE2);
                    } else {
                        objE2 = new p() { // from class: f2.oj
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return vj.p(mjVar2, z16, (f) obj, (e) obj2);
                            }
                        };
                        rVarH.v(objE2);
                    }
                    pVar2 = (p) objE2;
                    i17 = (-57345) & i17;
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = a.f58111a;
                        rVarH.v(objE);
                    }
                    qVar3 = (q) objE;
                } else {
                    qVar3 = qVar;
                }
                if (i27 != 0) {
                    f17 = ik.f56347f;
                }
                if (i29 != 0) {
                    qVar2 = qVar3;
                    i36 = i17;
                    z18 = z16;
                    mjVar3 = mjVar2;
                    f18 = ik.f56348g;
                } else {
                    qVar2 = qVar3;
                    i36 = i17;
                    z18 = z16;
                    mjVar3 = mjVar2;
                    f18 = f16;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(49984771, i36, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1686)");
            }
            int i410 = i36 << 3;
            mVar3 = mVar2;
            pVar3 = pVar2;
            k(mkVar, h.INSTANCE.c(), mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, false, false, rVarH, (i36 & 14) | 805306416 | (i410 & 896) | (i410 & 7168) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (29360128 & i410) | (i410 & 234881024), ((i36 >> 21) & 112) | 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            qVar2 = qVar;
            mVar3 = mVar2;
            z18 = z16;
            mjVar3 = mjVar2;
            pVar3 = pVar2;
            f18 = f16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.pj
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return vj.q(this.f57288a, mkVar, mVar3, z18, mjVar3, pVar3, qVar2, f17, f18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final mj r(r rVar, int i15) {
        if (t.k()) {
            t.o(1376295968, i15, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1431)");
        }
        mj mjVarW = w(androidx.compose.material3.d.f9816a.a(rVar, 6));
        if (t.k()) {
            t.n();
        }
        return mjVarW;
    }

    public final mj s(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, r rVar, int i15, int i16, int i17) {
        long jH = (i17 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jH2 = (i17 & 2) != 0 ? Color.INSTANCE.h() : j16;
        long jH3 = (i17 & 4) != 0 ? Color.INSTANCE.h() : j17;
        long jH4 = (i17 & 8) != 0 ? Color.INSTANCE.h() : j18;
        long jH5 = (i17 & 16) != 0 ? Color.INSTANCE.h() : j19;
        long jH6 = (i17 & 32) != 0 ? Color.INSTANCE.h() : j25;
        long jH7 = (i17 & 64) != 0 ? Color.INSTANCE.h() : j26;
        long jH8 = (i17 & 128) != 0 ? Color.INSTANCE.h() : j27;
        long j35 = jH;
        long jH9 = (i17 & 256) != 0 ? Color.INSTANCE.h() : j28;
        long jH10 = (i17 & 512) != 0 ? Color.INSTANCE.h() : j29;
        if (t.k()) {
            t.o(885588574, i15, i16, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:1473)");
        }
        mj mjVarA = w(androidx.compose.material3.d.f9816a.a(rVar, 6)).a(j35, jH2, jH3, jH4, jH5, jH6, jH7, jH8, jH9, jH10);
        if (t.k()) {
            t.n();
        }
        return mjVarA;
    }

    public final void t(f fVar, long j15, float f15, long j16) {
        f.x2(fVar, j16, fVar.l2(f15) / 2.0f, j15, 0.0f, null, null, 0, 120, null);
    }

    public final mj w(ColorScheme colorScheme) {
        mj defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        z0 z0Var = z0.f115398a;
        mj mjVar = new mj(g2.h(colorScheme, z0Var.i()), g2.h(colorScheme, z0Var.b()), g2.h(colorScheme, z0Var.m()), g2.h(colorScheme, z0Var.m()), g2.h(colorScheme, z0Var.b()), o1.g(Color.m9copywmQWz5c$default(g2.h(colorScheme, z0Var.e()), z0Var.f(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m9copywmQWz5c$default(g2.h(colorScheme, z0Var.c()), z0Var.d(), 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(g2.h(colorScheme, z0Var.g()), z0Var.h(), 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(g2.h(colorScheme, z0Var.g()), z0Var.h(), 0.0f, 0.0f, 0.0f, 14, null), Color.m9copywmQWz5c$default(g2.h(colorScheme, z0Var.c()), z0Var.d(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.s0(mjVar);
        return mjVar;
    }

    public final float x() {
        return TickSize;
    }
}
