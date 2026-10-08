package n3;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import o3.TransferParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln3/s1;", "", "<init>", "()V", "Lo3/c;", "Landroid/graphics/ColorSpace;", "c", "(Lo3/c;)Landroid/graphics/ColorSpace;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f131062a = new s1();

    private s1() {
    }

    public static final ColorSpace c(o3.c cVar) {
        ColorSpace colorSpaceA;
        o3.k kVar = o3.k.f141750a;
        if (fr.t.c(cVar, kVar.G())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (fr.t.c(cVar, kVar.m())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (fr.t.c(cVar, kVar.n())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (fr.t.c(cVar, kVar.o())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (fr.t.c(cVar, kVar.p())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (fr.t.c(cVar, kVar.s())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (fr.t.c(cVar, kVar.t())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (fr.t.c(cVar, kVar.u())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (fr.t.c(cVar, kVar.w())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (fr.t.c(cVar, kVar.x())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (fr.t.c(cVar, kVar.y())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (fr.t.c(cVar, kVar.z())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (fr.t.c(cVar, kVar.A())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (fr.t.c(cVar, kVar.B())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (fr.t.c(cVar, kVar.E())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (fr.t.c(cVar, kVar.F())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceA = t1.a(cVar)) != null) {
            return colorSpaceA;
        }
        if (!(cVar instanceof o3.f0)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        o3.f0 f0Var = (o3.f0) cVar;
        float[] fArrC = f0Var.getWhitePoint().c();
        TransferParameters transferParameters = f0Var.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        float[] transform = f0Var.getTransform();
        if (transferParameters2 != null) {
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(cVar.getName(), f0Var.getPrimaries(), fArrC, transferParameters2);
            return (Float.isNaN(transform[0]) || Arrays.equals(rgb.getTransform(), transform)) ? rgb : new ColorSpace.Rgb(cVar.getName(), transform, transferParameters2);
        }
        String name = cVar.getName();
        float[] primaries = f0Var.getPrimaries();
        final er.l<Double, Double> lVarD = f0Var.D();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: n3.q1
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d15) {
                return s1.d(lVarD, d15);
            }
        };
        final er.l<Double, Double> lVarZ = f0Var.z();
        return new ColorSpace.Rgb(name, primaries, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: n3.r1
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d15) {
                return s1.e(lVarZ, d15);
            }
        }, f0Var.f(0), f0Var.e(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d(er.l lVar, double d15) {
        return ((Number) lVar.b(Double.valueOf(d15))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double e(er.l lVar, double d15) {
        return ((Number) lVar.b(Double.valueOf(d15))).doubleValue();
    }
}
