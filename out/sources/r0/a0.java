package r0;

import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b%\u0010.R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u00106\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lr0/a0;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Lr0/a0;", "", "key", "g", "(J)Ljava/lang/Object;", "Loq/i0;", "o", "(J)V", "index", "p", "value", "m", "(JLjava/lang/Object;)V", "other", "n", "(Lr0/a0;)V", "q", "()I", "", "j", "()Z", "l", "(I)J", "s", "(I)Ljava/lang/Object;", "i", "(J)I", "e", "(J)Z", "b", "()V", "", "toString", "()Ljava/lang/String;", "a", "Z", "garbage", "", "[J", "keys", "", "", "[Ljava/lang/Object;", "values", "d", "I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class a0<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ long[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public a0() {
        this(0, 1, null);
    }

    public void b() {
        int i15 = this.size;
        Object[] objArr = this.values;
        for (int i16 = 0; i16 < i15; i16++) {
            objArr[i16] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a0<E> clone() {
        a0<E> a0Var = (a0) super.clone();
        a0Var.keys = (long[]) this.keys.clone();
        a0Var.values = (Object[]) this.values.clone();
        return a0Var;
    }

    public boolean e(long key) {
        return i(key) >= 0;
    }

    public E g(long key) {
        int iB = s0.a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == b0.f169807a) {
            return null;
        }
        return (E) this.values[iB];
    }

    public int i(long key) {
        if (this.garbage) {
            int i15 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                Object obj = objArr[i17];
                if (obj != b0.f169807a) {
                    if (i17 != i16) {
                        jArr[i16] = jArr[i17];
                        objArr[i16] = obj;
                        objArr[i17] = null;
                    }
                    i16++;
                }
            }
            this.garbage = false;
            this.size = i16;
        }
        return s0.a.b(this.keys, this.size, key);
    }

    public boolean j() {
        return q() == 0;
    }

    public long l(int index) {
        if (!(index >= 0 && index < this.size)) {
            s0.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i15 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                Object obj = objArr[i17];
                if (obj != b0.f169807a) {
                    if (i17 != i16) {
                        jArr[i16] = jArr[i17];
                        objArr[i16] = obj;
                        objArr[i17] = null;
                    }
                    i16++;
                }
            }
            this.garbage = false;
            this.size = i16;
        }
        return this.keys[index];
    }

    public void m(long key, E value) {
        int iB = s0.a.b(this.keys, this.size, key);
        if (iB >= 0) {
            this.values[iB] = value;
            return;
        }
        int i15 = ~iB;
        if (i15 < this.size && this.values[i15] == b0.f169807a) {
            this.keys[i15] = key;
            this.values[i15] = value;
            return;
        }
        if (this.garbage) {
            int i16 = this.size;
            long[] jArr = this.keys;
            if (i16 >= jArr.length) {
                Object[] objArr = this.values;
                int i17 = 0;
                for (int i18 = 0; i18 < i16; i18++) {
                    Object obj = objArr[i18];
                    if (obj != b0.f169807a) {
                        if (i18 != i17) {
                            jArr[i17] = jArr[i18];
                            objArr[i17] = obj;
                            objArr[i18] = null;
                        }
                        i17++;
                    }
                }
                this.garbage = false;
                this.size = i17;
                i15 = ~s0.a.b(this.keys, i17, key);
            }
        }
        int i19 = this.size;
        if (i19 >= this.keys.length) {
            int iF = s0.a.f(i19 + 1);
            this.keys = Arrays.copyOf(this.keys, iF);
            this.values = Arrays.copyOf(this.values, iF);
        }
        int i25 = this.size;
        if (i25 - i15 != 0) {
            long[] jArr2 = this.keys;
            int i26 = i15 + 1;
            pq.n.m(jArr2, jArr2, i26, i15, i25);
            Object[] objArr2 = this.values;
            pq.n.n(objArr2, objArr2, i26, i15, this.size);
        }
        this.keys[i15] = key;
        this.values[i15] = value;
        this.size++;
    }

    public void n(a0<? extends E> other) {
        int iQ = other.q();
        for (int i15 = 0; i15 < iQ; i15++) {
            m(other.l(i15), other.s(i15));
        }
    }

    public void o(long key) {
        int iB = s0.a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == b0.f169807a) {
            return;
        }
        this.values[iB] = b0.f169807a;
        this.garbage = true;
    }

    public void p(int index) {
        if (this.values[index] != b0.f169807a) {
            this.values[index] = b0.f169807a;
            this.garbage = true;
        }
    }

    public int q() {
        if (this.garbage) {
            int i15 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                Object obj = objArr[i17];
                if (obj != b0.f169807a) {
                    if (i17 != i16) {
                        jArr[i16] = jArr[i17];
                        objArr[i16] = obj;
                        objArr[i17] = null;
                    }
                    i16++;
                }
            }
            this.garbage = false;
            this.size = i16;
        }
        return this.size;
    }

    public E s(int index) {
        if (!(index >= 0 && index < this.size)) {
            s0.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i15 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i16 = 0;
            for (int i17 = 0; i17 < i15; i17++) {
                Object obj = objArr[i17];
                if (obj != b0.f169807a) {
                    if (i17 != i16) {
                        jArr[i16] = jArr[i17];
                        objArr[i16] = obj;
                        objArr[i17] = null;
                    }
                    i16++;
                }
            }
            this.garbage = false;
            this.size = i16;
        }
        return (E) this.values[index];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb5 = new StringBuilder(this.size * 28);
        sb5.append('{');
        int i15 = this.size;
        for (int i16 = 0; i16 < i15; i16++) {
            if (i16 > 0) {
                sb5.append(", ");
            }
            sb5.append(l(i16));
            sb5.append('=');
            E eS = s(i16);
            if (eS != sb5) {
                sb5.append(eS);
            } else {
                sb5.append("(this Map)");
            }
        }
        sb5.append('}');
        return sb5.toString();
    }

    public a0(int i15) {
        if (i15 == 0) {
            this.keys = s0.a.f176997b;
            this.values = s0.a.f176998c;
        } else {
            int iF = s0.a.f(i15);
            this.keys = new long[iF];
            this.values = new Object[iF];
        }
    }

    public /* synthetic */ a0(int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 10 : i15);
    }
}
