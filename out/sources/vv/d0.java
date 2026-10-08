package vv;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lvv/d0;", "", "<init>", "()V", "", "vacantIndex", "Lvv/c;", "node", "Loq/i0;", "d", "(ILvv/c;)V", "c", "b", "()Lvv/c;", "a", "(Lvv/c;)V", "e", "I", "size", "", "[Lvv/c;", "array", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public c[] array = new c[8];

    private final void c(int vacantIndex, c node) {
        c cVar;
        while (true) {
            int i15 = vacantIndex << 1;
            int i16 = i15 + 1;
            int i17 = this.size;
            if (i16 > i17) {
                if (i15 > i17) {
                    break;
                } else {
                    cVar = this.array[i15];
                }
            } else {
                c[] cVarArr = this.array;
                cVar = cVarArr[i15];
                c cVar2 = cVarArr[i16];
                if (fr.t.e(0L, cVar2.getTimeoutAt() - cVar.getTimeoutAt()) >= 0) {
                    cVar = cVar2;
                }
            }
            if (fr.t.e(0L, cVar.getTimeoutAt() - node.getTimeoutAt()) <= 0) {
                break;
            }
            int i18 = cVar.index;
            cVar.index = vacantIndex;
            this.array[vacantIndex] = cVar;
            vacantIndex = i18;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    private final void d(int vacantIndex, c node) {
        while (true) {
            int i15 = vacantIndex >> 1;
            if (i15 == 0) {
                break;
            }
            c cVar = this.array[i15];
            if (fr.t.e(0L, node.getTimeoutAt() - cVar.getTimeoutAt()) <= 0) {
                break;
            }
            cVar.index = vacantIndex;
            this.array[vacantIndex] = cVar;
            vacantIndex = i15;
        }
        this.array[vacantIndex] = node;
        node.index = vacantIndex;
    }

    public final void a(c node) {
        int i15 = this.size + 1;
        this.size = i15;
        c[] cVarArr = this.array;
        if (i15 == cVarArr.length) {
            c[] cVarArr2 = new c[i15 * 2];
            pq.n.s(cVarArr, cVarArr2, 0, 0, 0, 14, null);
            this.array = cVarArr2;
        }
        d(i15, node);
    }

    public final c b() {
        return this.array[1];
    }

    public final void e(c node) {
        int i15 = node.index;
        if (i15 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i16 = this.size;
        c[] cVarArr = this.array;
        c cVar = cVarArr[i16];
        node.index = -1;
        cVarArr[i16] = null;
        this.size = i16 - 1;
        if (node == cVar) {
            return;
        }
        int iE = fr.t.e(0L, cVar.getTimeoutAt() - node.getTimeoutAt());
        if (iE == 0) {
            this.array[i15] = cVar;
            cVar.index = i15;
        } else if (iE < 0) {
            c(i15, cVar);
        } else {
            d(i15, cVar);
        }
    }
}
