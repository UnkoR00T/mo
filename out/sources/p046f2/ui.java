package p046f2;

import androidx.compose.material3.d;
import l1.b;
import l1.h;
import l2.w0;
import n3.t2;
import n3.y2;
import oq.p;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001d\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\r\u001a\u00020\u000e*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll1/a;", "Ll1/b;", "bottomSize", "k", "(Ll1/a;Ll1/b;)Ll1/a;", "topSize", "c", "endSize", "i", "startSize", "e", "Lf2/si;", "Ll2/w0;", "value", "Ln3/y2;", "g", "(Lf2/si;Ll2/w0;)Ln3/y2;", "Lm2/b4;", "a", "Lm2/b4;", "getLocalShapes", "()Lm2/b4;", "LocalShapes", "h", "(Ll2/w0;Lm2/r;I)Ln3/y2;", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Shapes> f57992a = d0.j(new er.a() { // from class: f2.ti
        @Override // er.a
        public final Object a() {
            return ui.b();
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57993a;

        static {
            int[] iArr = new int[w0.values().length];
            try {
                iArr[w0.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w0.CornerExtraLargeIncreased.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w0.CornerExtraExtraLarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w0.CornerExtraLargeTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w0.CornerExtraSmall.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w0.CornerExtraSmallTop.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w0.CornerFull.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[w0.CornerLarge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[w0.CornerLargeIncreased.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[w0.CornerLargeEnd.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[w0.CornerLargeTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[w0.CornerMedium.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[w0.CornerNone.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[w0.CornerSmall.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[w0.CornerLargeStart.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f57993a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shapes b() {
        return new Shapes(null, null, null, null, null, 31, null);
    }

    public static final l1.a c(l1.a aVar, b bVar) {
        return l1.a.d(aVar, bVar, bVar, null, null, 12, null);
    }

    public static /* synthetic */ l1.a d(l1.a aVar, b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = ri.f57583a.a();
        }
        return c(aVar, bVar);
    }

    public static final l1.a e(l1.a aVar, b bVar) {
        return l1.a.d(aVar, bVar, null, null, bVar, 6, null);
    }

    public static /* synthetic */ l1.a f(l1.a aVar, b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = ri.f57583a.a();
        }
        return e(aVar, bVar);
    }

    public static final y2 g(Shapes shapes, w0 w0Var) {
        switch (a.f57993a[w0Var.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return shapes.getExtralargeIncreased();
            case 3:
                return shapes.getExtraExtraLarge();
            case 4:
                return l(shapes.getExtraLarge(), null, 1, null);
            case 5:
                return shapes.getExtraSmall();
            case 6:
                return l(shapes.getExtraSmall(), null, 1, null);
            case 7:
                return h.i();
            case 8:
                return shapes.getLarge();
            case 9:
                return shapes.getLargeIncreased();
            case 10:
                return f(shapes.getLarge(), null, 1, null);
            case 11:
                return l(shapes.getLarge(), null, 1, null);
            case 12:
                return shapes.getMedium();
            case 13:
                return t2.a();
            case 14:
                return shapes.getSmall();
            case 15:
                return j(shapes.getLarge(), null, 1, null);
            default:
                throw new p();
        }
    }

    public static final y2 h(w0 w0Var, r rVar, int i15) {
        if (t.k()) {
            t.o(1629172543, i15, -1, "androidx.compose.material3.<get-value> (Shapes.kt:398)");
        }
        y2 y2VarG = g(d.f9816a.d(rVar, 6), w0Var);
        if (t.k()) {
            t.n();
        }
        return y2VarG;
    }

    public static final l1.a i(l1.a aVar, b bVar) {
        return l1.a.d(aVar, null, bVar, bVar, null, 9, null);
    }

    public static /* synthetic */ l1.a j(l1.a aVar, b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = ri.f57583a.a();
        }
        return i(aVar, bVar);
    }

    public static final l1.a k(l1.a aVar, b bVar) {
        return l1.a.d(aVar, null, null, bVar, bVar, 3, null);
    }

    public static /* synthetic */ l1.a l(l1.a aVar, b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = ri.f57583a.a();
        }
        return k(aVar, bVar);
    }
}
