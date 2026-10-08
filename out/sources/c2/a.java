package c2;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import c5.h;
import n3.a3;
import n3.b3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import t3.d;
import t3.f;
import t3.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Lt3/d;", "a", "Lt3/d;", "_arrowBack", "Lb2/a;", "(Lb2/a;)Lt3/d;", "ArrowBack", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f22642a;

    public static final d a(b2.a aVar) {
        d dVar = f22642a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar2 = new d.a("AutoMirrored.Filled.ArrowBack", h.n(24.0f), h.n(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int iA = o.a();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.a(), null);
        int iA2 = a3.INSTANCE.a();
        int iA3 = b3.INSTANCE.a();
        f fVar = new f();
        fVar.h(20.0f, 11.0f);
        fVar.d(7.83f);
        fVar.g(5.59f, -5.59f);
        fVar.f(12.0f, 4.0f);
        fVar.g(-8.0f, 8.0f);
        fVar.g(8.0f, 8.0f);
        fVar.g(1.41f, -1.41f);
        fVar.f(7.83f, 13.0f);
        fVar.d(20.0f);
        fVar.j(-2.0f);
        fVar.a();
        d dVarF = aVar2.c(fVar.c(), (14336 & 2) != 0 ? o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? o.b() : iA2, (14336 & 512) != 0 ? o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & PKIFailureInfo.certConfirmed) == 0 ? 0.0f : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : 0.0f).f();
        f22642a = dVarF;
        return dVarF;
    }
}
