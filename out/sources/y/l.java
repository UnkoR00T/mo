package y;

import p071kotlin.Metadata;
import p105prN.o2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ly/l;", "", "<init>", "()V", "I", "O", "Landroidx/lifecycle/y;", "source", "LprN/o2;", "mapFunction", "a", "(Landroidx/lifecycle/y;LprN/o2;)Landroidx/lifecycle/y;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f222501a = new l();

    private l() {
    }

    public static final <I, O> androidx.p016lifecycle.y<O> a(androidx.p016lifecycle.y<I> source, o2<I, O> mapFunction) {
        r rVar = new r(mapFunction.apply(source.f()), mapFunction);
        rVar.u(source);
        return rVar;
    }
}
