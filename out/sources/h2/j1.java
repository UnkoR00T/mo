package h2;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lh2/j1;", "", "<init>", "()V", "Lt3/d;", "b", "Lt3/d;", "_close", "c", "_edit", "d", "_dateRange", "e", "_arrowDropDown", "()Lt3/d;", "Close", "Edit", "DateRange", "a", "ArrowDropDown", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static t3.d _close;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static t3.d _edit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static t3.d _dateRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static t3.d _arrowDropDown;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f79876a = new j1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79881f = 8;

    private j1() {
    }

    public final t3.d a() {
        t3.d dVar = _arrowDropDown;
        if (dVar != null) {
            return dVar;
        }
        t3.d.a aVar = new t3.d.a("Filled.ArrowDropDown", c5.h.n(24.0f), c5.h.n(24.0f), 24.0f, 24.0f, 0L, 0, false, BERTags.FLAGS, null);
        int iA = t3.o.a();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.a(), null);
        int iA2 = n3.a3.INSTANCE.a();
        int iA3 = n3.b3.INSTANCE.a();
        t3.f fVar = new t3.f();
        fVar.h(7.0f, 10.0f);
        fVar.g(5.0f, 5.0f);
        fVar.g(5.0f, -5.0f);
        fVar.a();
        t3.d dVarF = aVar.c(fVar.c(), (14336 & 2) != 0 ? t3.o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? t3.o.b() : iA2, (14336 & 512) != 0 ? t3.o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & PKIFailureInfo.certConfirmed) == 0 ? 0.0f : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : 0.0f).f();
        _arrowDropDown = dVarF;
        return dVarF;
    }

    public final t3.d b() {
        t3.d dVar = _close;
        if (dVar != null) {
            return dVar;
        }
        t3.d.a aVar = new t3.d.a("Filled.Close", c5.h.n(24.0f), c5.h.n(24.0f), 24.0f, 24.0f, 0L, 0, false, BERTags.FLAGS, null);
        int iA = t3.o.a();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.a(), null);
        int iA2 = n3.a3.INSTANCE.a();
        int iA3 = n3.b3.INSTANCE.a();
        t3.f fVar = new t3.f();
        fVar.h(19.0f, 6.41f);
        fVar.f(17.59f, 5.0f);
        fVar.f(12.0f, 10.59f);
        fVar.f(6.41f, 5.0f);
        fVar.f(5.0f, 6.41f);
        fVar.f(10.59f, 12.0f);
        fVar.f(5.0f, 17.59f);
        fVar.f(6.41f, 19.0f);
        fVar.f(12.0f, 13.41f);
        fVar.f(17.59f, 19.0f);
        fVar.f(19.0f, 17.59f);
        fVar.f(13.41f, 12.0f);
        fVar.a();
        t3.d dVarF = aVar.c(fVar.c(), (14336 & 2) != 0 ? t3.o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? t3.o.b() : iA2, (14336 & 512) != 0 ? t3.o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & PKIFailureInfo.certConfirmed) == 0 ? 0.0f : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : 0.0f).f();
        _close = dVarF;
        return dVarF;
    }

    public final t3.d c() {
        t3.d dVar = _dateRange;
        if (dVar != null) {
            return dVar;
        }
        t3.d.a aVar = new t3.d.a("Filled.DateRange", c5.h.n(24.0f), c5.h.n(24.0f), 24.0f, 24.0f, 0L, 0, false, BERTags.FLAGS, null);
        int iA = t3.o.a();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.a(), null);
        int iA2 = n3.a3.INSTANCE.a();
        int iA3 = n3.b3.INSTANCE.a();
        t3.f fVar = new t3.f();
        fVar.h(9.0f, 11.0f);
        fVar.f(7.0f, 11.0f);
        fVar.j(2.0f);
        fVar.e(2.0f);
        fVar.j(-2.0f);
        fVar.a();
        fVar.h(13.0f, 11.0f);
        fVar.e(-2.0f);
        fVar.j(2.0f);
        fVar.e(2.0f);
        fVar.j(-2.0f);
        fVar.a();
        fVar.h(17.0f, 11.0f);
        fVar.e(-2.0f);
        fVar.j(2.0f);
        fVar.e(2.0f);
        fVar.j(-2.0f);
        fVar.a();
        fVar.h(19.0f, 4.0f);
        fVar.e(-1.0f);
        fVar.f(18.0f, 2.0f);
        fVar.e(-2.0f);
        fVar.j(2.0f);
        fVar.f(8.0f, 4.0f);
        fVar.f(8.0f, 2.0f);
        fVar.f(6.0f, 2.0f);
        fVar.j(2.0f);
        fVar.f(5.0f, 4.0f);
        fVar.b(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        fVar.f(3.0f, 20.0f);
        fVar.b(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        fVar.e(14.0f);
        fVar.b(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar.f(21.0f, 6.0f);
        fVar.b(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        fVar.a();
        fVar.h(19.0f, 20.0f);
        fVar.f(5.0f, 20.0f);
        fVar.f(5.0f, 9.0f);
        fVar.e(14.0f);
        fVar.j(11.0f);
        fVar.a();
        t3.d dVarF = aVar.c(fVar.c(), (14336 & 2) != 0 ? t3.o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? t3.o.b() : iA2, (14336 & 512) != 0 ? t3.o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & PKIFailureInfo.certConfirmed) == 0 ? 0.0f : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : 0.0f).f();
        _dateRange = dVarF;
        return dVarF;
    }

    public final t3.d d() {
        t3.d dVar = _edit;
        if (dVar != null) {
            return dVar;
        }
        t3.d.a aVar = new t3.d.a("Filled.Edit", c5.h.n(24.0f), c5.h.n(24.0f), 24.0f, 24.0f, 0L, 0, false, BERTags.FLAGS, null);
        int iA = t3.o.a();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.a(), null);
        int iA2 = n3.a3.INSTANCE.a();
        int iA3 = n3.b3.INSTANCE.a();
        t3.f fVar = new t3.f();
        fVar.h(3.0f, 17.25f);
        fVar.i(21.0f);
        fVar.e(3.75f);
        fVar.f(17.81f, 9.94f);
        fVar.g(-3.75f, -3.75f);
        fVar.f(3.0f, 17.25f);
        fVar.a();
        fVar.h(20.71f, 7.04f);
        fVar.b(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        fVar.g(-2.34f, -2.34f);
        fVar.b(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        fVar.g(-1.83f, 1.83f);
        fVar.g(3.75f, 3.75f);
        fVar.g(1.83f, -1.83f);
        fVar.a();
        t3.d dVarF = aVar.c(fVar.c(), (14336 & 2) != 0 ? t3.o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? t3.o.b() : iA2, (14336 & 512) != 0 ? t3.o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & PKIFailureInfo.certConfirmed) == 0 ? 0.0f : 1.0f, (14336 & PKIFailureInfo.certRevoked) != 0 ? 0.0f : 0.0f).f();
        _edit = dVarF;
        return dVarF;
    }
}
