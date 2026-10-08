package w0;

import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009f\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u000b*\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lf3/m;", "Lkotlin/Function1;", "Lc5/d;", "Lm3/e;", "sourceCenter", "magnifierCenter", "Lc5/k;", "Loq/i0;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lc5/h;", "cornerRadius", "elevation", "clippingEnabled", "Lw0/l2;", "platformMagnifierFactory", "e", "(Lf3/m;Ler/l;Ler/l;Ler/l;FZJFFZLw0/l2;)Lf3/m;", "", "sdkVersion", "c", "(I)Z", "other", "a", "(FF)Z", "Ln4/h0;", "Lkotlin/Function0;", "Ln4/h0;", "b", "()Ln4/h0;", "MagnifierPositionInRoot", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n4.h0<er.a<m3.e>> f209116a = new n4.h0<>("MagnifierPositionInRoot", (er.p) null, 2, (fr.k) null);

    public static final boolean a(float f15, float f16) {
        return (Float.isNaN(f15) && Float.isNaN(f16)) || f15 == f16;
    }

    public static final n4.h0<er.a<m3.e>> b() {
        return f209116a;
    }

    public static final boolean c(int i15) {
        return i15 >= 28;
    }

    public static /* synthetic */ boolean d(int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = Build.VERSION.SDK_INT;
        }
        return c(i15);
    }

    public static final f3.m e(f3.m mVar, er.l<? super c5.d, m3.e> lVar, er.l<? super c5.d, m3.e> lVar2, er.l<? super c5.k, oq.i0> lVar3, float f15, boolean z15, long j15, float f16, float f17, boolean z16, l2 l2Var) {
        if (d(0, 1, null)) {
            return mVar.u(new s1(lVar, lVar2, lVar3, f15, z15, j15, f16, f17, z16, l2Var == null ? l2.INSTANCE.a() : l2Var, null));
        }
        return mVar;
    }

    public static /* synthetic */ f3.m f(f3.m mVar, er.l lVar, er.l lVar2, er.l lVar3, float f15, boolean z15, long j15, float f16, float f17, boolean z16, l2 l2Var, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            lVar2 = null;
        }
        if ((i15 & 4) != 0) {
            lVar3 = null;
        }
        if ((i15 & 8) != 0) {
            f15 = Float.NaN;
        }
        if ((i15 & 16) != 0) {
            z15 = false;
        }
        if ((i15 & 32) != 0) {
            j15 = c5.k.INSTANCE.a();
        }
        if ((i15 & 64) != 0) {
            f16 = c5.h.INSTANCE.c();
        }
        if ((i15 & 128) != 0) {
            f17 = c5.h.INSTANCE.c();
        }
        if ((i15 & 256) != 0) {
            z16 = true;
        }
        if ((i15 & 512) != 0) {
            l2Var = null;
        }
        return e(mVar, lVar, lVar2, lVar3, f15, z15, j15, f16, f17, z16, l2Var);
    }
}
