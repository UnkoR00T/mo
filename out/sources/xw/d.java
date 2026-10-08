package xw;

import er.p;
import ju.i;
import ju.l0;
import ju.p0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J:\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0096@¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lxw/d;", "", "T", "Lkotlin/Function2;", "Lju/p0;", "Ltq/e;", "block", "a", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "d", "Lju/l0;", "b", "()Lju/l0;", "io", "getDefault", "default", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    static /* synthetic */ <T> Object c(d dVar, p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return i.g(dVar.getDefault(), pVar, eVar);
    }

    static /* synthetic */ <T> Object e(d dVar, p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return i.g(dVar.b(), pVar, eVar);
    }

    default <T> Object a(p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return e(this, pVar, eVar);
    }

    l0 b();

    default <T> Object d(p<? super p0, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return c(this, pVar, eVar);
    }

    l0 getDefault();
}
