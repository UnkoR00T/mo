package r0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"E", "Lr0/m1;", "", "key", "c", "(Lr0/m1;I)Ljava/lang/Object;", "Loq/i0;", "d", "(Lr0/m1;I)V", "e", "(Lr0/m1;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f169910a = new Object();

    public static final <E> E c(m1<E> m1Var, int i15) {
        E e15;
        int iA = s0.a.a(m1Var.f169905b, m1Var.f169907d, i15);
        if (iA < 0 || (e15 = (E) m1Var.f169906c[iA]) == f169910a) {
            return null;
        }
        return e15;
    }

    public static final <E> void d(m1<E> m1Var, int i15) {
        int iA = s0.a.a(m1Var.f169905b, m1Var.f169907d, i15);
        if (iA >= 0) {
            Object[] objArr = m1Var.f169906c;
            Object obj = objArr[iA];
            Object obj2 = f169910a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                m1Var.f169904a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void e(m1<E> m1Var) {
        int i15 = m1Var.f169907d;
        int[] iArr = m1Var.f169905b;
        Object[] objArr = m1Var.f169906c;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            Object obj = objArr[i17];
            if (obj != f169910a) {
                if (i17 != i16) {
                    iArr[i16] = iArr[i17];
                    objArr[i16] = obj;
                    objArr[i17] = null;
                }
                i16++;
            }
        }
        m1Var.f169904a = false;
        m1Var.f169907d = i16;
    }
}
