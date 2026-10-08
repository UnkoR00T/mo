package h2;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Lh2/i1;", "", "<init>", "()V", "Lt3/d;", "b", "Lt3/d;", "_keyboardArrowLeft", "c", "_keyboardArrowRight", "a", "()Lt3/d;", "KeyboardArrowLeft", "KeyboardArrowRight", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static t3.d _keyboardArrowLeft;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static t3.d _keyboardArrowRight;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f79867a = new i1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79870d = 8;

    private i1() {
    }

    public final t3.d a() {
        t3.d dVar = _keyboardArrowLeft;
        if (dVar != null) {
            return dVar;
        }
        t3.d.a aVar = new t3.d.a("AutoMirrored.Filled.KeyboardArrowLeft", c5.h.n(24.0f), c5.h.n(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iA = t3.o.a();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.a(), null);
        int iA2 = n3.a3.INSTANCE.a();
        int iA3 = n3.b3.INSTANCE.a();
        t3.f fVar = new t3.f();
        fVar.h(15.41f, 16.59f);
        fVar.f(10.83f, 12.0f);
        fVar.g(4.58f, -4.59f);
        fVar.f(14.0f, 6.0f);
        fVar.g(-6.0f, 6.0f);
        fVar.g(6.0f, 6.0f);
        fVar.g(1.41f, -1.41f);
        fVar.a();
        t3.d dVarF = aVar.c(fVar.c(), (14336 & 2) != 0 ? t3.o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? t3.o.b() : iA2, (14336 & 512) != 0 ? t3.o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & PKIFailureInfo.certConfirmed) == 0 ? 0.0f : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : 0.0f).f();
        _keyboardArrowLeft = dVarF;
        return dVarF;
    }

    public final t3.d b() {
        t3.d dVar = _keyboardArrowRight;
        if (dVar != null) {
            return dVar;
        }
        t3.d.a aVar = new t3.d.a("AutoMirrored.Filled.KeyboardArrowRight", c5.h.n(24.0f), c5.h.n(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iA = t3.o.a();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.a(), null);
        int iA2 = n3.a3.INSTANCE.a();
        int iA3 = n3.b3.INSTANCE.a();
        t3.f fVar = new t3.f();
        fVar.h(8.59f, 16.59f);
        fVar.f(13.17f, 12.0f);
        fVar.f(8.59f, 7.41f);
        fVar.f(10.0f, 6.0f);
        fVar.g(6.0f, 6.0f);
        fVar.g(-6.0f, 6.0f);
        fVar.g(-1.41f, -1.41f);
        fVar.a();
        t3.d dVarF = aVar.c(fVar.c(), (14336 & 2) != 0 ? t3.o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? t3.o.b() : iA2, (14336 & 512) != 0 ? t3.o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & PKIFailureInfo.certConfirmed) == 0 ? 0.0f : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : 0.0f).f();
        _keyboardArrowRight = dVarF;
        return dVarF;
    }
}
