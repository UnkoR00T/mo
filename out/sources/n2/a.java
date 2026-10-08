package n2;

import er.l;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p071kotlin.Metadata;
import pq.v;
import r0.a1;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Lr0/a1;", "Lr0/q0;", "e", "(Lr0/a1;)Lr0/q0;", "", "K", "Lkotlin/Function1;", "selector", "d", "(Lr0/a1;Ler/l;)Lr0/a1;", "", "a", "(Lr0/a1;Ler/l;)Z", "Loq/i0;", "c", "(Lr0/q0;Ler/l;)V", "b", "(Lr0/q0;)Ljava/lang/Object;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: n2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C3244a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f130719a;

        public C3244a(l lVar) {
            this.f130719a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            l lVar = this.f130719a;
            return sq.a.e((Comparable) lVar.b(t15), (Comparable) lVar.b(t16));
        }
    }

    public static final <T, K extends Comparable<? super K>> boolean a(a1<T> a1Var, l<? super T, ? extends K> lVar) {
        if (a1Var.get_size() <= 1) {
            return true;
        }
        K kB = lVar.b(a1Var.d(0));
        if (kB == null) {
            return false;
        }
        int i15 = a1Var.get_size();
        int i16 = 1;
        while (i16 < i15) {
            K kB2 = lVar.b(a1Var.d(i16));
            if (kB2 == null || kB.compareTo(kB2) > 0) {
                return false;
            }
            i16++;
            kB = kB2;
        }
        return true;
    }

    public static final <T> T b(q0<T> q0Var) {
        if (q0Var.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i15 = q0Var.get_size() - 1;
        T tD = q0Var.d(i15);
        q0Var.B(i15);
        return tD;
    }

    public static final <T, K extends Comparable<? super K>> void c(q0<T> q0Var, l<? super T, ? extends K> lVar) {
        List<T> listT = q0Var.t();
        if (listT.size() > 1) {
            v.C(listT, new C3244a(lVar));
        }
    }

    public static final <T, K extends Comparable<? super K>> a1<T> d(a1<T> a1Var, l<? super T, ? extends K> lVar) {
        if (a(a1Var, lVar)) {
            return a1Var;
        }
        q0 q0VarE = e(a1Var);
        c(q0VarE, lVar);
        return q0VarE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> q0<T> e(a1<T> a1Var) {
        q0<T> q0Var = (q0<T>) new q0(a1Var.get_size());
        Object[] objArr = a1Var.content;
        int i15 = a1Var._size;
        for (int i16 = 0; i16 < i15; i16++) {
            q0Var.n(objArr[i16]);
        }
        return q0Var;
    }
}
