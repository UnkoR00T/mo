package zx;

import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\u0005*\u00028\u0000H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lzx/b;", "ACTION", "DATA", "", "data", "Loq/i0;", "P5", "(Ljava/lang/Object;)V", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public interface b<ACTION, DATA> {
    static /* synthetic */ <ACTION, DATA> Object F3(b<ACTION, DATA> bVar, ACTION action, e<? super i0> eVar) {
        Object objF = bVar.Y1().F(action, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    default Object F(ACTION action, e<? super i0> eVar) {
        return F3(this, action, eVar);
    }

    default void P5(DATA data) {
    }

    xw.b<ACTION> Y1();
}
