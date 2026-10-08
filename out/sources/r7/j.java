package r7;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import er.l;
import fr.t;
import java.util.Arrays;
import java.util.Collection;
import p071kotlin.Metadata;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001b\u001a\u00020\u00182\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u001c\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lr7/j;", "", "<init>", "()V", "Landroidx/lifecycle/t0;", "T", "Lmr/c;", "modelClass", "", "e", "(Lmr/c;)Ljava/lang/String;", "VM", "f", "()Landroidx/lifecycle/t0;", "", "Lp7/f;", "initializers", "Landroidx/lifecycle/w0$c;", "a", "(Ljava/util/Collection;)Landroidx/lifecycle/w0$c;", "Landroidx/lifecycle/y0;", "owner", "d", "(Landroidx/lifecycle/y0;)Landroidx/lifecycle/w0$c;", "Lp7/a;", "c", "(Landroidx/lifecycle/y0;)Lp7/a;", "extras", "", "b", "(Lmr/c;Lp7/a;[Lp7/f;)Landroidx/lifecycle/t0;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f172257a = new j();

    private j() {
    }

    public final w0.c a(Collection<? extends p7.f<?>> initializers) {
        p7.f[] fVarArr = (p7.f[]) initializers.toArray(new p7.f[0]);
        return new p7.b((p7.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public final <VM extends t0> VM b(mr.c<VM> modelClass, CreationExtras extras, p7.f<?>... initializers) {
        VM vm4;
        p7.f<?> fVar;
        l<CreationExtras, T> lVarB;
        int length = initializers.length;
        int i15 = 0;
        while (true) {
            vm4 = null;
            if (i15 >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i15];
            if (t.c(fVar.a(), modelClass)) {
                break;
            }
            i15++;
        }
        if (fVar != null && (lVarB = fVar.b()) != 0) {
            vm4 = (VM) lVarB.b(extras);
        }
        if (vm4 != null) {
            return vm4;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + a.a(modelClass)).toString());
    }

    public final CreationExtras c(y0 owner) {
        return owner instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) owner).x() : CreationExtras.b.f153222c;
    }

    public final w0.c d(y0 owner) {
        return owner instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) owner).w() : d.f172247b;
    }

    public final <T extends t0> String e(mr.c<T> modelClass) {
        String strA = a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final <VM extends t0> VM f() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
