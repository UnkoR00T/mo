package p046f2;

import c5.b;
import c5.t;
import d1.a3;
import d1.d3;
import d1.i;
import er.l;
import f3.c;
import fr.k;
import h2.h1;
import hr.a;
import java.util.List;
import lr.m;
import oq.g;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.f0;
import p036e4.v;
import p036e4.v0;
import p036e4.w;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJS\u0010\u001b\u001a\u00020\u001a*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u00020\u001a*\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u00020\b*\u00020\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\u00020\b*\u00020\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010%J)\u0010(\u001a\u00020\b*\u00020\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010%J)\u0010)\u001a\u00020\b*\u00020\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b2\u00103R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u00108\u001a\u0004\b9\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lf2/tr;", "Le4/w0;", "Lh2/h1;", "scrolledOffset", "Ld1/i$n;", "titleVerticalArrangement", "Lf3/c$b;", "titleHorizontalAlignment", "", "titleBottomPadding", "Lc5/h;", "height", "Ld1/d3;", "contentPadding", "<init>", "(Lh2/h1;Ld1/i$n;Lf3/c$b;IFLd1/d3;Lfr/k;)V", "Le4/y0;", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "layoutHeight", "maxLayoutHeight", "Le4/a2;", "navigationIconPlaceable", "titlePlaceable", "actionIconsPlaceable", "titleBaseline", "Le4/x0;", "b", "(Le4/y0;JIILe4/a2;Le4/a2;Le4/a2;ILd1/d3;)Le4/x0;", "", "Le4/v0;", "measurables", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "a", "Lh2/h1;", "getScrolledOffset", "()Lh2/h1;", "Ld1/i$n;", "getTitleVerticalArrangement", "()Ld1/i$n;", "Lf3/c$b;", "getTitleHorizontalAlignment", "()Lf3/c$b;", "d", "I", "getTitleBottomPadding", "()I", "F", "getHeight-D9Ej5fM", "()F", "Ld1/d3;", "getContentPadding", "()Ld1/d3;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class tr implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h1 scrolledOffset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i.n titleVerticalArrangement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c.b titleHorizontalAlignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int titleBottomPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d3 contentPadding;

    public /* synthetic */ tr(h1 h1Var, i.n nVar, c.b bVar, int i15, float f15, d3 d3Var, k kVar) {
        this(h1Var, nVar, bVar, i15, f15, d3Var);
    }

    private final x0 b(y0 y0Var, final long j15, int i15, final int i16, final a2 a2Var, final a2 a2Var2, final a2 a2Var3, final int i17, d3 d3Var) {
        int iX0 = y0Var.X0(d3Var.getTop());
        int iX1 = y0Var.X0(d3Var.getBottom());
        final int iX2 = y0Var.X0(a3.k(d3Var, y0Var.getLayoutDirection()));
        final int iX3 = y0Var.X0(a3.j(d3Var, y0Var.getLayoutDirection()));
        final int i18 = (i15 + iX0) - iX1;
        return y0.j2(y0Var, b.l(j15), i15, null, new l() { // from class: f2.sr
            @Override // er.l
            public final Object b(Object obj) {
                return tr.d(a2Var, iX2, i18, a2Var2, a2Var3, j15, iX3, this, i17, i16, (a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0067  */
    /* JADX WARN: Code duplicated, block: B:13:0x0070  */
    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a3  */
    public static final i0 d(a2 a2Var, int i15, int i16, a2 a2Var2, a2 a2Var3, long j15, int i17, tr trVar, int i18, int i19, a2.a aVar) {
        int iL;
        i.n nVar;
        i iVar;
        int height;
        int i25;
        int height2;
        int height3;
        a2.a.I(aVar, a2Var, i15, (i16 - a2Var.getHeight()) / 2, 0.0f, 4, null);
        int iMax = Math.max(aVar.X0(Function0.f55435k), a2Var.getWidth());
        int width = a2Var3.getWidth();
        int iA = trVar.titleHorizontalAlignment.a(a2Var2.getWidth(), b.l(j15), t.Ltr);
        if (iA >= iMax) {
            if (a2Var2.getWidth() + iA > b.l(j15) - width) {
                iL = (b.l(j15) - width) - (a2Var2.getWidth() + iA);
            }
            int i26 = iA;
            nVar = trVar.titleVerticalArrangement;
            iVar = i.f39152a;
            if (fr.t.c(nVar, iVar.e())) {
                height = (i16 - a2Var2.getHeight()) / 2;
            } else if (fr.t.c(nVar, iVar.d())) {
                i25 = trVar.titleBottomPadding;
                if (i25 == 0) {
                    height = i16 - a2Var2.getHeight();
                } else {
                    height2 = i25 - (a2Var2.getHeight() - i18);
                    height3 = a2Var2.getHeight() + height2;
                    if (height3 > i19) {
                        height2 -= height3 - i19;
                    }
                    height = (i16 - a2Var2.getHeight()) - Math.max(0, height2);
                }
            } else {
                height = 0;
            }
            a2.a.I(aVar, a2Var2, i26, height, 0.0f, 4, null);
            a2.a.I(aVar, a2Var3, (b.l(j15) - a2Var3.getWidth()) - i17, (i16 - a2Var3.getHeight()) / 2, 0.0f, 4, null);
            return i0.f148189a;
        }
        iL = iMax - iA;
        iA += i15 + iL;
        int i27 = iA;
        nVar = trVar.titleVerticalArrangement;
        iVar = i.f39152a;
        if (fr.t.c(nVar, iVar.e())) {
            height = (i16 - a2Var2.getHeight()) / 2;
        } else if (fr.t.c(nVar, iVar.d())) {
            i25 = trVar.titleBottomPadding;
            if (i25 == 0) {
                height = i16 - a2Var2.getHeight();
            } else {
                height2 = i25 - (a2Var2.getHeight() - i18);
                height3 = a2Var2.getHeight() + height2;
                if (height3 > i19) {
                    height2 -= height3 - i19;
                }
                height = (i16 - a2Var2.getHeight()) - Math.max(0, height2);
            }
        } else {
            height = 0;
        }
        a2.a.I(aVar, a2Var2, i27, height, 0.0f, 4, null);
        a2.a.I(aVar, a2Var3, (b.l(j15) - a2Var3.getWidth()) - i17, (i16 - a2Var3.getHeight()) / 2, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // p036e4.w0
    public int c(w wVar, List<? extends v> list, int i15) {
        int size = list.size();
        int iE0 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            iE0 += list.get(i16).e0(i15);
        }
        return iE0;
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            v0 v0Var = list.get(i15);
            if (fr.t.c(f0.a(v0Var), "navigationIcon")) {
                a2 a2VarO0 = v0Var.o0(b.d(j15, 0, 0, 0, 0, 14, null));
                List<? extends v0> list2 = list;
                int size2 = list2.size();
                int i16 = 0;
                while (i16 < size2) {
                    v0 v0Var2 = list.get(i16);
                    if (fr.t.c(f0.a(v0Var2), "actionIcons")) {
                        a2 a2VarO1 = v0Var2.o0(b.d(j15, 0, 0, 0, 0, 14, null));
                        int iL = b.l(j15) == Integer.MAX_VALUE ? b.l(j15) : m.e((((b.l(j15) - Math.max(y0Var.X0(Function0.f55435k), a2VarO0.getWidth())) - a2VarO1.getWidth()) - y0Var.X0(a3.k(this.contentPadding, y0Var.getLayoutDirection()))) - y0Var.X0(a3.j(this.contentPadding, y0Var.getLayoutDirection())), 0);
                        int size3 = list2.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            v0 v0Var3 = list.get(i17);
                            if (fr.t.c(f0.a(v0Var3), "title")) {
                                a2 a2VarO2 = v0Var3.o0(b.d(j15, 0, iL, 0, 0, 12, null));
                                int I = a2VarO2.I(p036e4.b.b()) != Integer.MIN_VALUE ? a2VarO2.I(p036e4.b.b()) : 0;
                                float fA = this.scrolledOffset.a();
                                int iD = Float.isNaN(fA) ? 0 : a.d(fA);
                                int iMax = Math.max(y0Var.X0(this.height), a2VarO2.getHeight()) + y0Var.X0(this.contentPadding.getTop()) + y0Var.X0(this.contentPadding.getBottom());
                                return this.b(y0Var, j15, b.k(j15) == Integer.MAX_VALUE ? iMax : m.e(iD + iMax, 0), iMax, a2VarO0, a2VarO2, a2VarO1, I, this.contentPadding);
                            }
                            i17++;
                            y0Var = y0Var;
                            this = this;
                        }
                        e5.b.f("Collection contains no element matching the predicate.");
                        throw new g();
                    }
                    i16++;
                    y0Var = y0Var;
                    this = this;
                }
                e5.b.f("Collection contains no element matching the predicate.");
                throw new g();
            }
        }
        e5.b.f("Collection contains no element matching the predicate.");
        throw new g();
    }

    @Override // p036e4.w0
    public int f(w wVar, List<? extends v> list, int i15) {
        Integer num;
        int iX0 = wVar.X0(this.height);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(list.get(0).n(i15));
            int iP = pq.v.p(list);
            int i16 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i16).n(i15));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i16 == iP) {
                        break;
                    }
                    i16++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iX0, num != null ? num.intValue() : 0);
    }

    @Override // p036e4.w0
    public int h(w wVar, List<? extends v> list, int i15) {
        Integer num;
        int iX0 = wVar.X0(this.height);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(list.get(0).U(i15));
            int iP = pq.v.p(list);
            int i16 = 1;
            if (1 <= iP) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i16).U(i15));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i16 == iP) {
                        break;
                    }
                    i16++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iX0, num != null ? num.intValue() : 0);
    }

    @Override // p036e4.w0
    public int i(w wVar, List<? extends v> list, int i15) {
        int size = list.size();
        int iM0 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            iM0 += list.get(i16).m0(i15);
        }
        return iM0;
    }

    private tr(h1 h1Var, i.n nVar, c.b bVar, int i15, float f15, d3 d3Var) {
        this.scrolledOffset = h1Var;
        this.titleVerticalArrangement = nVar;
        this.titleHorizontalAlignment = bVar;
        this.titleBottomPadding = i15;
        this.height = f15;
        this.contentPadding = d3Var;
    }
}
