package f1;

import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J;\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJa\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lf1/q0;", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlin/Function1;", "Lf1/e;", "Loq/i0;", "content", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ler/q;)V", "", "count", "Lkotlin/Function2;", "itemContent", "j", "(ILer/l;Ler/l;Ler/r;)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ler/r;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54842a = new a();

        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Object obj) {
            return c(((Number) obj).intValue());
        }

        public final Void c(int i15) {
            return null;
        }
    }

    static /* synthetic */ void c(q0 q0Var, Object obj, Object obj2, er.q qVar, int i15, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i15 & 1) != 0) {
            obj = null;
        }
        if ((i15 & 2) != 0) {
            obj2 = null;
        }
        q0Var.b(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void e(q0 q0Var, int i15, er.l lVar, er.l lVar2, er.r rVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i16 & 2) != 0) {
            lVar = null;
        }
        if ((i16 & 4) != 0) {
            lVar2 = a.f54842a;
        }
        q0Var.j(i15, lVar, lVar2, rVar);
    }

    static /* synthetic */ void h(q0 q0Var, Object obj, Object obj2, er.r rVar, int i15, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i15 & 1) != 0) {
            obj = null;
        }
        if ((i15 & 2) != 0) {
            obj2 = null;
        }
        q0Var.f(obj, obj2, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static oq.i0 i(er.r rVar, e eVar, p076m2.r rVar2, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar2.W(eVar) ? 4 : 2;
        }
        if (rVar2.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1691919627, i15, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
            }
            rVar.g(eVar, 0, rVar2, Integer.valueOf((i15 & 14) | 48));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    default void b(Object key, Object contentType, er.q<? super e, ? super p076m2.r, ? super Integer, oq.i0> content) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void f(Object key, Object contentType, final er.r<? super e, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> content) {
        b(key, contentType, y2.m.b(1691919627, true, new er.q() { // from class: f1.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return q0.i(content, (e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    default void j(int count, er.l<? super Integer, ? extends Object> key, er.l<? super Integer, ? extends Object> contentType, er.r<? super e, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> itemContent) {
        throw new IllegalStateException("The method is not implemented");
    }
}
