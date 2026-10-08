package n3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a¿\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aÕ\u0001\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010%\u001a\u00020\u0000*\u00020\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!H\u0007¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b'\u0010(\"\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lf3/m;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Ln3/d3;", "transformOrigin", "Ln3/y2;", "shape", "", "clip", "Ln3/u2;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Ln3/u1;", "compositingStrategy", "d", "(Lf3/m;FFFFFFFFFFJLn3/y2;ZLn3/u2;JJI)Lf3/m;", "Ln3/a1;", "blendMode", "Ln3/n1;", "colorFilter", "f", "(Lf3/m;FFFFFFFFFFJLn3/y2;ZLn3/u2;JJIILn3/n1;)Lf3/m;", "Lkotlin/Function1;", "Ln3/a2;", "Loq/i0;", "block", "c", "(Lf3/m;Ler/l;)Lf3/m;", "h", "(Lf3/m;)Lf3/m;", "Ln3/v2;", "a", "Ln3/v2;", "reusableGraphicsLayerScope", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static v2 f131123a;

    public static final f3.m c(f3.m mVar, er.l<? super a2, oq.i0> lVar) {
        return mVar.u(new f1(lVar));
    }

    @oq.a
    public static final /* synthetic */ f3.m d(f3.m mVar, float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, long j15, y2 y2Var, boolean z15, u2 u2Var, long j16, long j17, int i15) {
        return f(mVar, f15, f16, f17, f18, f19, f25, f26, f27, f28, f29, j15, y2Var, z15, u2Var, j16, j17, i15, a1.INSTANCE.B(), null);
    }

    public static final f3.m f(f3.m mVar, float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, long j15, y2 y2Var, boolean z15, u2 u2Var, long j16, long j17, int i15, int i16, n1 n1Var) {
        return mVar.u(new GraphicsLayerElement(f15, f16, f17, f18, f19, f25, f26, f27, f28, f29, j15, y2Var, z15, u2Var, j16, j17, i15, i16, n1Var, null));
    }

    public static /* synthetic */ f3.m g(f3.m mVar, float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, long j15, y2 y2Var, boolean z15, u2 u2Var, long j16, long j17, int i15, int i16, n1 n1Var, int i17, Object obj) {
        return f(mVar, (i17 & 1) != 0 ? 1.0f : f15, (i17 & 2) != 0 ? 1.0f : f16, (i17 & 4) == 0 ? f17 : 1.0f, (i17 & 8) != 0 ? 0.0f : f18, (i17 & 16) != 0 ? 0.0f : f19, (i17 & 32) != 0 ? 0.0f : f25, (i17 & 64) != 0 ? 0.0f : f26, (i17 & 128) != 0 ? 0.0f : f27, (i17 & 256) == 0 ? f28 : 0.0f, (i17 & 512) != 0 ? 8.0f : f29, (i17 & 1024) != 0 ? d3.INSTANCE.a() : j15, (i17 & 2048) != 0 ? t2.a() : y2Var, (i17 & PKIFailureInfo.certConfirmed) != 0 ? false : z15, (i17 & PKIFailureInfo.certRevoked) != 0 ? null : u2Var, (i17 & 16384) != 0 ? androidx.compose.ui.graphics.f.a() : j16, (32768 & i17) != 0 ? androidx.compose.ui.graphics.f.a() : j17, (65536 & i17) != 0 ? u1.INSTANCE.a() : i15, (i17 & PKIFailureInfo.unsupportedVersion) != 0 ? a1.INSTANCE.B() : i16, (i17 & PKIFailureInfo.transactionIdInUse) != 0 ? null : n1Var);
    }

    public static final f3.m h(f3.m mVar) {
        return androidx.compose.ui.platform.t1.b() ? mVar.u(g(f3.m.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null)) : mVar;
    }
}
