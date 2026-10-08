package xy0;

import androidx.compose.ui.graphics.Color;
import java.util.LinkedHashMap;
import java.util.Map;
import mx.Label;
import p071kotlin.Metadata;
import zy0.PointPinItem;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lxy0/z0;", "Lxy0/y0;", "<init>", "()V", "Lzy0/c;", "item", "Ld40/b$b;", "a", "(Lzy0/c;)Ld40/b$b;", "", "", "Ljava/util/Map;", "iconCache", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, d40.b.C0864b> iconCache = new LinkedHashMap();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222393a;

        static {
            int[] iArr = new int[kh0.l.values().length];
            try {
                iArr[kh0.l.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kh0.l.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kh0.l.C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kh0.l.D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kh0.l.E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kh0.l.F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kh0.l.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f222393a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f222394a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-612457323);
            if (p076m2.t.k()) {
                p076m2.t.o(-612457323, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MarkerIconFlyweightImpl.getIconData.<anonymous>.<anonymous> (MarkerIconFlyweight.kt:31)");
            }
            long jH = Color.INSTANCE.h();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jH;
        }
    }

    @Override // xy0.y0
    public d40.b.C0864b a(PointPinItem item) {
        int i15;
        Map<String, d40.b.C0864b> map = this.iconCache;
        String strName = item.getQuality().name();
        d40.b.C0864b c0864b = map.get(strName);
        if (c0864b == null) {
            switch (a.f222393a[item.getQuality().ordinal()]) {
                case 1:
                    i15 = zx0.a.f238233a;
                    break;
                case 2:
                    i15 = zx0.a.f238234b;
                    break;
                case 3:
                    i15 = zx0.a.f238235c;
                    break;
                case 4:
                    i15 = zx0.a.f238236d;
                    break;
                case 5:
                    i15 = zx0.a.f238237e;
                    break;
                case 6:
                    i15 = zx0.a.f238238f;
                    break;
                case 7:
                    i15 = zx0.a.f238239g;
                    break;
                default:
                    throw new oq.p();
            }
            c0864b = new d40.b.C0864b(null, i15, d40.i.h.f39711e, b.f222394a, Label.INSTANCE.c(), null, 33, null);
            map.put(strName, c0864b);
        }
        return c0864b;
    }
}
