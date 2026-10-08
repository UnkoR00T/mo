package p076m2;

import er.a;
import n2.c;
import p071kotlin.Metadata;
import y2.IntRef;
import y2.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\" \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Lm2/f6;", "c", "(Ler/a;)Lm2/f6;", "Lm2/w5;", "policy", "d", "(Lm2/w5;Ler/a;)Lm2/f6;", "Ln2/c;", "Lm2/p0;", "b", "()Ln2/c;", "Ly2/v;", "Ly2/o;", "a", "Ly2/v;", "calculationBlockNestedLevel", "derivedStateObservers", "runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v<IntRef> f123258a = new v<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v<c<p0>> f123259b = new v<>();

    public static final c<p0> b() {
        v<c<p0>> vVar = f123259b;
        c<p0> cVarA = vVar.a();
        if (cVarA != null) {
            return cVarA;
        }
        c<p0> cVar = new c<>(new p0[0], 0);
        vVar.b(cVar);
        return cVar;
    }

    public static final <T> f6<T> c(a<? extends T> aVar) {
        return new n0(aVar, null);
    }

    public static final <T> f6<T> d(w5<T> w5Var, a<? extends T> aVar) {
        return new n0(aVar, w5Var);
    }
}
