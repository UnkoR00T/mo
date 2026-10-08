package su;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsu/a;", "", "owner", "", "m", "(Ljava/lang/Object;)Z", "Loq/i0;", "h", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "r", "(Ljava/lang/Object;)V", "p", "()Z", "isLocked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: su.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C4762a {
        public static /* synthetic */ Object a(a aVar, Object obj, tq.e eVar, int i15, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i15 & 1) != 0) {
                obj = null;
            }
            return aVar.h(obj, eVar);
        }

        public static /* synthetic */ boolean b(a aVar, Object obj, int i15, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i15 & 1) != 0) {
                obj = null;
            }
            return aVar.m(obj);
        }

        public static /* synthetic */ void c(a aVar, Object obj, int i15, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i15 & 1) != 0) {
                obj = null;
            }
            aVar.r(obj);
        }
    }

    Object h(Object obj, tq.e<? super i0> eVar);

    boolean m(Object owner);

    boolean p();

    void r(Object owner);
}
