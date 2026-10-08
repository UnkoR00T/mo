package ta;

import oq.i0;
import p071kotlin.Metadata;
import r0.a0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"V", "Lr0/a0;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "Loq/i0;", "fetchBlock", "a", "(Lr0/a0;ZLer/l;)V", "", "MAX_BIND_PARAMETER_CNT", "I", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/RelationUtil")
final /* synthetic */ class j {
    public static final <V> void a(a0<V> a0Var, boolean z15, er.l<? super a0<V>, i0> lVar) {
        a0<? extends V> a0Var2 = new a0<>(999);
        int iQ = a0Var.q();
        int i15 = 0;
        int i16 = 0;
        while (i15 < iQ) {
            if (z15) {
                a0Var2.m(a0Var.l(i15), a0Var.s(i15));
            } else {
                a0Var2.m(a0Var.l(i15), null);
            }
            i15++;
            i16++;
            if (i16 == 999) {
                lVar.b(a0Var2);
                if (!z15) {
                    a0Var.n(a0Var2);
                }
                a0Var2.b();
                i16 = 0;
            }
        }
        if (i16 > 0) {
            lVar.b(a0Var2);
            if (z15) {
                return;
            }
            a0Var.n(a0Var2);
        }
    }
}
