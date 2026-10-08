package p056h1;

import c1.e;
import er.l;
import lr.i;
import oq.i0;
import p071kotlin.Metadata;
import r0.p0;
import r0.y0;
import r0.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lh1/q2;", "Lh1/r0;", "Llr/i;", "nearestRange", "Lh1/z;", "intervalContent", "<init>", "(Llr/i;Lh1/z;)V", "", "key", "", "c", "(Ljava/lang/Object;)I", "index", "d", "(I)Ljava/lang/Object;", "Lr0/y0;", "a", "Lr0/y0;", "map", "", "b", "[Ljava/lang/Object;", "keys", "I", "keysStartIndex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q2 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y0<Object> map;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int keysStartIndex;

    public q2(i iVar, z<?> zVar) {
        n<Interval> nVarL = zVar.l();
        final int first = iVar.getFirst();
        if (!(first >= 0)) {
            e.c("negative nearestRange.first");
        }
        final int iMin = Math.min(iVar.getLast(), nVarL.getSize() - 1);
        if (iMin < first) {
            this.map = z0.a();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i15 = (iMin - first) + 1;
            this.keys = new Object[i15];
            this.keysStartIndex = first;
            final p0 p0Var = new p0(i15);
            nVarL.a(first, iMin, new l() { // from class: h1.p2
                @Override // er.l
                public final Object b(Object obj) {
                    return q2.a(first, iMin, p0Var, this, (n.a) obj);
                }
            });
            this.map = p0Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0035  */
    public static i0 a(int i15, int i16, p0 p0Var, q2 q2Var, n.a aVar) {
        Object objA;
        l<Integer, Object> key = ((z.a) aVar.c()).getKey();
        int iMax = Math.max(i15, aVar.getStartIndex());
        int iMin = Math.min(i16, (aVar.getStartIndex() + aVar.getSize()) - 1);
        if (iMax <= iMin) {
            while (true) {
                if (key == null) {
                    objA = n2.a(iMax);
                } else {
                    objA = key.b(Integer.valueOf(iMax - aVar.getStartIndex()));
                    if (objA == null) {
                        objA = n2.a(iMax);
                    }
                }
                p0Var.u(objA, iMax);
                q2Var.keys[iMax - q2Var.keysStartIndex] = objA;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return i0.f148189a;
    }

    @Override // p056h1.r0
    public int c(Object key) {
        y0<Object> y0Var = this.map;
        int iB = y0Var.b(key);
        if (iB >= 0) {
            return y0Var.values[iB];
        }
        return -1;
    }

    @Override // p056h1.r0
    public Object d(int index) {
        Object[] objArr = this.keys;
        int i15 = index - this.keysStartIndex;
        if (i15 < 0 || i15 >= objArr.length) {
            return null;
        }
        return objArr[i15];
    }
}
