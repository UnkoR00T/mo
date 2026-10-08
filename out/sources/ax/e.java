package ax;

import dx.i;
import er.p;
import java.util.List;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ^\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022$\b\u0002\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H¦@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lax/e;", "", "", "Lax/d;", "strength", "", "c", "(Ljava/util/List;)Ljava/lang/Integer;", "", "keyAlias", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ljava/util/List;Ljava/lang/String;)Ldx/i;", "Lax/c;", "mode", "Lax/b;", "labels", "", "confirmationRequired", "Lkotlin/Function2;", "Ltq/e;", "onUnrecognized", "Lax/a;", "a", "(Lax/c;Lax/b;ZLjava/util/List;Ler/p;Ltq/e;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends k implements p<Integer, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14871e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Integer num, tq.e<? super Boolean> eVar) {
            return M(num.intValue(), eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f14871e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(true);
        }

        public final Object M(int i15, tq.e<? super Boolean> eVar) {
            return ((a) v(Integer.valueOf(i15), eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object b(e eVar, c cVar, BiometricAuthLabels biometricAuthLabels, boolean z15, List list, p pVar, tq.e eVar2, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authenticate");
        }
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        boolean z16 = z15;
        if ((i15 & 16) != 0) {
            pVar = new a(null);
        }
        return eVar.a(cVar, biometricAuthLabels, z16, list, pVar, eVar2);
    }

    Object a(c cVar, BiometricAuthLabels biometricAuthLabels, boolean z15, List<? extends d> list, p<? super Integer, ? super tq.e<? super Boolean>, ? extends Object> pVar, tq.e<? super ax.a> eVar);

    Integer c(List<? extends d> strength);

    i<dx.b, i0> d(List<? extends d> strength, String keyAlias);
}
