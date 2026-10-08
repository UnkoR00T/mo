package p7;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import java.util.Arrays;
import p071kotlin.Metadata;
import r7.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lp7/b;", "Landroidx/lifecycle/w0$c;", "", "Lp7/f;", "initializers", "<init>", "([Lp7/f;)V", "Landroidx/lifecycle/t0;", "VM", "Ljava/lang/Class;", "modelClass", "Lp7/a;", "extras", "a", "(Ljava/lang/Class;Lp7/a;)Landroidx/lifecycle/t0;", "b", "[Lp7/f;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements w0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<?>[] initializers;

    public b(f<?>... fVarArr) {
        this.initializers = fVarArr;
    }

    @Override // androidx.lifecycle.w0.c
    public <VM extends t0> VM a(Class<VM> modelClass, CreationExtras extras) {
        j jVar = j.f172257a;
        mr.c<VM> cVarE = dr.a.e(modelClass);
        f<?>[] fVarArr = this.initializers;
        return (VM) jVar.b(cVarE, extras, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
