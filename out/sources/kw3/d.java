package kw3;

import androidx.compose.ui.graphics.SolidColor;
import c5.h;
import d1.r3;
import er.l;
import er.p;
import f3.m;
import fx.Line;
import fx.Point;
import fx.Rectangle;
import jw3.MaskDefinition;
import k3.k;
import m3.j;
import n3.m1;
import n3.m2;
import n3.n2;
import n3.u0;
import oq.i0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p3.Stroke;
import p3.f;
import t70.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ag\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0017\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u001b\u001a\u00020\r*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\"\u001a\u00020\r*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a;\u0010$\u001a\u00020\r*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#\"\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lf3/m;", "modifier", "Ljw3/b;", "maskDefinition", "Landroidx/compose/ui/graphics/Color;", "maskColor", "", "rectStrokeWidth", "linesStrokeWidth", "dashWidth", "gapWidth", "overlayColor", "containerCornerRadius", "Loq/i0;", "d", "(Lf3/m;Ljw3/b;JFFFFJFLm2/r;II)V", "Lp3/c;", "Lfx/e;", "rect", "Lfx/b;", "radius", "color", "strokeWidth", "h", "(Lp3/c;Lfx/e;Lfx/b;JF)V", "Ln3/m2;", "maskPath", "j", "(Lp3/c;Ln3/m2;JF)V", "Lfx/a;", "line", "maskStrokeWidth", "Ln3/n2;", "pathEffect", "k", "(Lp3/c;Lfx/a;JFFLn3/n2;)V", "i", "Lc5/h;", "a", "F", "l", "()F", "DEFAULT_MASK_RECT_STROKE_WIDTH", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f112906a = h.n(6);

    public static final void d(m mVar, final MaskDefinition maskDefinition, long j15, float f15, float f16, float f17, float f18, long j16, float f19, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        long jC;
        final float fH;
        float fH2;
        float fH3;
        long jA;
        float fH4;
        final float f25;
        final float f26;
        final float f27;
        final long j17;
        final float f28;
        final long j18;
        final float f29;
        final float fH5;
        final float f35;
        final float f36;
        m mVar3;
        float f37;
        final long j19;
        final long j25;
        final float f38;
        int i18;
        r rVarH = rVar.h(-275688632);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(maskDefinition) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            jC = j15;
            i17 |= ((i16 & 4) == 0 && rVarH.d(jC)) ? 256 : 128;
        } else {
            jC = j15;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                fH = f15;
                int i25 = rVarH.b(fH) ? 2048 : 1024;
                i17 |= i25;
            } else {
                fH = f15;
            }
            i17 |= i25;
        } else {
            fH = f15;
        }
        if ((i15 & 24576) == 0) {
            if ((i16 & 16) == 0) {
                fH2 = f16;
                if (rVarH.b(fH2)) {
                    i18 = 16384;
                }
                i17 |= i18;
            } else {
                fH2 = f16;
            }
            i18 = PKIFailureInfo.certRevoked;
            i17 |= i18;
        } else {
            fH2 = f16;
        }
        if ((i15 & 196608) == 0) {
            i17 |= ((i16 & 32) == 0 && rVarH.b(f17)) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            fH3 = f18;
            i17 |= ((i16 & 64) == 0 && rVarH.b(fH3)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            fH3 = f18;
        }
        if ((i15 & 12582912) == 0) {
            jA = j16;
            i17 |= ((i16 & 128) == 0 && rVarH.d(jA)) ? 8388608 : 4194304;
        } else {
            jA = j16;
        }
        if ((i15 & 100663296) == 0) {
            if ((i16 & 256) == 0) {
                fH4 = f19;
                int i26 = rVarH.b(fH4) ? 67108864 : 33554432;
                i17 |= i26;
            } else {
                fH4 = f19;
            }
            i17 |= i26;
        } else {
            fH4 = f19;
        }
        boolean z15 = true;
        if (rVarH.r((i17 & 38347923) != 38347922, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                m mVar4 = i19 != 0 ? m.INSTANCE : mVar2;
                if ((i16 & 4) != 0) {
                    jC = ((rw3.a) rVarH.N(rw3.c.c())).c();
                    i17 &= -897;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                    fH = s.H(f112906a, rVarH, 6);
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                    fH2 = s.H(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing25(), rVarH, 0);
                }
                if ((i16 & 32) != 0) {
                    fH5 = s.H(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50(), rVarH, 0);
                    i17 &= -458753;
                } else {
                    fH5 = f17;
                }
                if ((i16 & 64) != 0) {
                    fH3 = s.H(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50(), rVarH, 0);
                    i17 &= -3670017;
                }
                if ((i16 & 128) != 0) {
                    jA = ((rw3.a) rVarH.N(rw3.c.c())).a();
                    i17 &= -29360129;
                }
                if ((i16 & 256) != 0) {
                    fH4 = s.H(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300(), rVarH, 0);
                    i17 &= -234881025;
                }
                f35 = fH2;
                f36 = fH4;
                long j26 = jA;
                mVar3 = mVar4;
                f37 = fH3;
                j19 = jC;
                j25 = j26;
            } else {
                rVarH.O();
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                }
                if ((i16 & 8) != 0) {
                    i17 &= -7169;
                }
                if ((i16 & 16) != 0) {
                    i17 &= -57345;
                }
                if ((i16 & 32) != 0) {
                    i17 &= -458753;
                }
                if ((i16 & 64) != 0) {
                    i17 &= -3670017;
                }
                if ((i16 & 128) != 0) {
                    i17 &= -29360129;
                }
                if ((i16 & 256) != 0) {
                    i17 &= -234881025;
                }
                f37 = fH3;
                j19 = jC;
                f35 = fH2;
                f36 = fH4;
                j25 = jA;
                mVar3 = mVar2;
                fH5 = f17;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-275688632, i17, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.Mask (Mask.kt:41)");
            }
            boolean zG = ((((458752 & i17) ^ 196608) > 131072 && rVarH.b(fH5)) || (i17 & 196608) == 131072) | ((((3670016 & i17) ^ 1572864) > 1048576 && rVarH.b(f37)) || (i17 & 1572864) == 1048576) | rVarH.G(maskDefinition) | ((((i17 & 7168) ^ 3072) > 2048 && rVarH.b(fH)) || (i17 & 3072) == 2048) | ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVarH.d(j19)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | ((((29360128 & i17) ^ 12582912) > 8388608 && rVarH.d(j25)) || (i17 & 12582912) == 8388608) | ((((234881024 & i17) ^ 100663296) > 67108864 && rVarH.b(f36)) || (i17 & 100663296) == 67108864);
            if ((((57344 & i17) ^ 24576) <= 16384 || !rVarH.b(f35)) && (i17 & 24576) != 16384) {
                z15 = false;
            }
            boolean z16 = zG | z15;
            Object objE = rVarH.E();
            if (z16 || objE == r.INSTANCE.a()) {
                f38 = f37;
                l lVar = new l() { // from class: kw3.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d.e(fH5, f38, maskDefinition, fH, j19, j25, f36, f35, (k3.e) obj);
                    }
                };
                rVarH.v(lVar);
                objE = lVar;
            } else {
                f38 = f37;
            }
            r3.a(k.c(mVar3, (l) objE), rVarH, 0);
            if (t.k()) {
                t.n();
            }
            long j27 = j19;
            f27 = fH;
            j17 = j27;
            f28 = f35;
            f25 = f36;
            j18 = j25;
            f29 = fH5;
            f26 = f38;
            mVar2 = mVar3;
        } else {
            rVarH.O();
            f25 = fH4;
            f26 = fH3;
            f27 = fH;
            j17 = jC;
            f28 = fH2;
            j18 = jA;
            f29 = f17;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: kw3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.g(mVar2, maskDefinition, j17, f27, f28, f29, f26, j18, f25, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l e(float f15, float f16, final MaskDefinition maskDefinition, final float f17, final long j15, final long j16, final float f18, final float f19, k3.e eVar) {
        final n2 n2VarA = n2.INSTANCE.a(new float[]{f15, f16}, 0.0f);
        final m2 m2VarA = u0.a();
        MaskDefinition.FaceRect faceRect = maskDefinition.getFaceRect();
        float f25 = f17 / 2;
        m2.o(m2VarA, j.e(m3.h.c(m3.e.e((((long) Float.floatToRawIntBits(faceRect.getRect().getLeft() - f25)) << 32) | (((long) Float.floatToRawIntBits(faceRect.getRect().getTop() - f25)) & BodyPartID.bodyIdMax)), m3.k.d((((long) Float.floatToRawIntBits(faceRect.getRect().getHeight() + f17)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(faceRect.getRect().getWidth() + f17)) << 32))), m3.a.b((((long) Float.floatToRawIntBits(faceRect.getRadius().getX() + f25)) << 32) | (((long) Float.floatToRawIntBits(faceRect.getRadius().getY() + f25)) & BodyPartID.bodyIdMax))), null, 2, null);
        return eVar.e(new l() { // from class: kw3.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.f(maskDefinition, j15, f17, m2VarA, j16, f18, f19, n2VarA, (p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(MaskDefinition maskDefinition, long j15, float f15, m2 m2Var, long j16, float f16, float f17, n2 n2Var, p3.c cVar) {
        h(cVar, maskDefinition.getFaceRect().getRect(), maskDefinition.getFaceRect().getRadius(), j15, f15);
        j(cVar, m2Var, j16, f16);
        k(cVar, maskDefinition.getVerticalLine(), j15, f15, f17, n2Var);
        Line topEyeLine = maskDefinition.getTopEyeLine();
        if (topEyeLine != null) {
            i(cVar, topEyeLine, j15, f15, f17, n2Var);
        }
        Line bottomEyeLine = maskDefinition.getBottomEyeLine();
        if (bottomEyeLine != null) {
            i(cVar, bottomEyeLine, j15, f15, f17, n2Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(m mVar, MaskDefinition maskDefinition, long j15, float f15, float f16, float f17, float f18, long j16, float f19, int i15, int i16, r rVar, int i17) {
        d(mVar, maskDefinition, j15, f15, f16, f17, f18, j16, f19, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void h(p3.c cVar, Rectangle rectangle, Point point, long j15, float f15) {
        float width = rectangle.getWidth();
        long jD = m3.k.d((((long) Float.floatToRawIntBits(rectangle.getHeight())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(width) << 32));
        float x15 = point.getX();
        long jB = m3.a.b((((long) Float.floatToRawIntBits(point.getY())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(x15) << 32));
        Stroke stroke = new Stroke(f15, 0.0f, 0, 0, null, 30, null);
        float left = rectangle.getLeft();
        f.w2(cVar, j15, m3.e.e((((long) Float.floatToRawIntBits(rectangle.getTop())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(left) << 32)), jD, jB, stroke, 0.0f, null, 0, BERTags.FLAGS, null);
    }

    private static final void i(p3.c cVar, Line line, long j15, float f15, float f16, n2 n2Var) {
        float x15 = line.getStart().getX() + f15;
        long jE = m3.e.e((((long) Float.floatToRawIntBits(line.getStart().getY())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(x15) << 32));
        float x16 = line.getEnd().getX() - f15;
        f.w1(cVar, j15, jE, m3.e.e((((long) Float.floatToRawIntBits(line.getEnd().getY())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(x16) << 32)), f16, 0, n2Var, 0.0f, null, 0, 464, null);
    }

    private static final void j(p3.c cVar, m2 m2Var, long j15, float f15) {
        int iA = m1.INSTANCE.a();
        p3.d drawContext = cVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().e(m2Var, iA);
            f.c1(cVar, new SolidColor(j15, null), 0L, 0L, m3.a.b((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax)), 0.0f, null, null, 0, 246, null);
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    private static final void k(p3.c cVar, Line line, long j15, float f15, float f16, n2 n2Var) {
        float x15 = line.getStart().getX();
        long jE = m3.e.e((((long) Float.floatToRawIntBits(line.getStart().getY() + f15)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(x15) << 32));
        float x16 = line.getEnd().getX();
        f.w1(cVar, j15, jE, m3.e.e((((long) Float.floatToRawIntBits(line.getEnd().getY() - f15)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(x16) << 32)), f16, 0, n2Var, 0.0f, null, 0, 464, null);
    }

    public static final float l() {
        return f112906a;
    }
}
