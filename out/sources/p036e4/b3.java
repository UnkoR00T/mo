package p036e4;

import android.graphics.Rect;
import j6.f1;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.a3;
import r0.j0;
import r0.q;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0017"}, d2 = {"Le4/k2;", "Le4/y2;", "rulerProvider", "Loq/i0;", "c", "(Le4/k2;Le4/y2;)V", "Le4/c2;", "rulers", "Le4/u2;", "insets", "", "width", "height", "b", "(Le4/k2;Le4/c2;JII)V", "Lr0/q;", "Le4/z2;", "a", "Lr0/q;", "WindowInsetsTypeMap", "", "[Le4/z2;", "AnimatableInsetsRulers", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<z2> f47206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z2[] f47207b;

    static {
        j0 j0Var = new j0(8);
        int iH = f1.p.h();
        z2.Companion companion = z2.INSTANCE;
        j0Var.r(iH, companion.f());
        j0Var.r(f1.p.g(), companion.e());
        j0Var.r(f1.p.b(), companion.a());
        j0Var.r(f1.p.d(), companion.c());
        j0Var.r(f1.p.j(), companion.g());
        j0Var.r(f1.p.f(), companion.d());
        j0Var.r(f1.p.k(), companion.h());
        j0Var.r(f1.p.c(), companion.b());
        f47206a = j0Var;
        f47207b = new z2[]{companion.f(), companion.e(), companion.a(), companion.h(), companion.g(), companion.d(), companion.c(), companion.i(), companion.b()};
    }

    private static final void b(k2 k2Var, c2 c2Var, long j15, int i15, int i16) {
        if (u2.b(j15, v2.a())) {
            return;
        }
        k2Var.g2(c2Var.getLeft(), (int) ((j15 >>> 48) & 65535));
        k2Var.g2(c2Var.getTop(), (int) ((j15 >>> 32) & 65535));
        k2Var.g2(c2Var.getRight(), i15 - ((int) ((j15 >>> 16) & 65535)));
        k2Var.g2(c2Var.getBottom(), i16 - ((int) (j15 & 65535)));
    }

    public static final void c(k2 k2Var, y2 y2Var) {
        long jB = k2Var.m().b();
        r0.f1<Object, c3> f1VarJ = y2Var.j1().j();
        int i15 = (int) (jB >> 32);
        int i16 = (int) (jB & BodyPartID.bodyIdMax);
        z2[] z2VarArr = f47207b;
        int length = z2VarArr.length;
        int i17 = 0;
        while (i17 < length) {
            z2 z2Var = z2VarArr[i17];
            c3 c3VarE = f1VarJ.e(z2Var);
            k2 k2Var2 = k2Var;
            b(k2Var2, z2Var.getCurrent(), c3VarE.getCurrent(), i15, i16);
            if (c3VarE.g()) {
                b(k2Var2, c3VarE.getSource(), c3VarE.getSourceValueInsets(), i15, i16);
                b(k2Var2, c3VarE.getTarget(), c3VarE.getTargetValueInsets(), i15, i16);
            }
            b(k2Var2, z2Var.getMaximum(), c3VarE.getMaximum(), i15, i16);
            i17++;
            k2Var = k2Var2;
        }
        k2 k2Var3 = k2Var;
        q0<a3<Rect>> q0VarM1 = y2Var.M1();
        if (q0VarM1.h()) {
            List<c2> listG1 = y2Var.G1();
            Object[] objArr = q0VarM1.content;
            int i18 = q0VarM1._size;
            for (int i19 = 0; i19 < i18; i19++) {
                a3 a3Var = (a3) objArr[i19];
                c2 c2Var = listG1.get(i19);
                Rect rect = (Rect) a3Var.getValue();
                k2Var3.g2(c2Var.getLeft(), rect.left);
                k2Var3.g2(c2Var.getTop(), rect.top);
                k2Var3.g2(c2Var.getRight(), rect.right);
                k2Var3.g2(c2Var.getBottom(), rect.bottom);
            }
        }
    }
}
