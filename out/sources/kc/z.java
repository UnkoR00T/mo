package kc;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ju.m0;
import ju.p0;
import ju.q0;
import ju.z2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Led/t;", "logger", "Lju/p0;", "c", "(Led/t;)Lju/p0;", "Lkc/h$a;", "Lkc/w$a;", "options", "f", "(Lkc/h$a;Lkc/w$a;)Lkc/h$a;", "e", "(Lkc/h$a;)Lkc/h$a;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"kc/z$a", "Ltq/a;", "Lju/m0;", "Ltq/i;", "context", "", "exception", "Loq/i0;", "i1", "(Ltq/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends tq.a implements m0 {
        public a(m0.Companion companion, ed.t tVar) {
            super(companion);
        }

        @Override // ju.m0
        public void i1(tq.i context, Throwable exception) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Integer.valueOf(((ed.i) t16).a()), Integer.valueOf(((ed.i) t15).a()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Integer.valueOf(((ed.f) t16).a()), Integer.valueOf(((ed.f) t15).a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 c(ed.t tVar) {
        return q0.a(z2.b(null, 1, null).n0(new a(m0.INSTANCE, tVar)));
    }

    public static final h.a e(h.a aVar) {
        return aVar.k(new tc.f(), fr.q0.c(String.class)).k(new tc.d(), fr.q0.c(vv.b0.class)).j(new sc.b(), fr.q0.c(h0.class)).j(new sc.d(), fr.q0.c(h0.class)).h(new qc.k.a(), fr.q0.c(h0.class)).h(new qc.c.a(), fr.q0.c(byte[].class)).h(new qc.g.b(), fr.q0.c(h0.class)).h(new qc.b.a(), fr.q0.c(Bitmap.class));
    }

    public static final h.a f(h.a aVar, w.Options options) {
        if (t.a(options)) {
            aVar.o(new er.a() { // from class: kc.x
                @Override // er.a
                public final Object a() {
                    return z.g();
                }
            });
            aVar.n(new er.a() { // from class: kc.y
                @Override // er.a
                public final Object a() {
                    return z.h();
                }
            });
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g() {
        mr.c cVarType;
        List listU0 = pq.v.U0(ed.a0.f49451a.f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listU0.size();
        for (int i15 = 0; i15 < size; i15++) {
            ed.i iVar = (ed.i) listU0.get(i15);
            qc.j.a aVarB = iVar.b();
            oq.r rVarA = null;
            if (aVarB != null && (cVarType = iVar.type()) != null) {
                rVarA = oq.y.a(aVarB, cVarType);
            }
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h() {
        List listU0 = pq.v.U0(ed.a0.f49451a.e(), new c());
        ArrayList arrayList = new ArrayList();
        int size = listU0.size();
        for (int i15 = 0; i15 < size; i15++) {
            oc.i.a aVarB = ((ed.f) listU0.get(i15)).b();
            if (aVarB != null) {
                arrayList.add(aVarB);
            }
        }
        return arrayList;
    }
}
