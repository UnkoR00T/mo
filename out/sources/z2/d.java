package z2;

import p071kotlin.Metadata;
import r0.q0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lz2/d;", "Lz2/f;", "<init>", "()V", "Loq/i0;", "f", "a", "b", "e", "d", "", "Z", "isEnabled", "isDisposed", "c", "isContentComposed", "La3/b;", "", "Lr0/t0;", "keptExitedValues", "()Z", "isRetainingExitedValues", "runtime-retain"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f232322e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isContentComposed;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> keptExitedValues = a3.b.c(null, 1, null);

    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[LOOP:0: B:5:0x000d->B:25:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[EDGE_INSN: B:29:0x0066->B:26:0x0066 BREAK  A[LOOP:0: B:5:0x000d->B:25:0x0063], SYNTHETIC] */
    private final void f() {
        t0<Object, Object> t0Var = this.keptExitedValues;
        Object[] objArr = t0Var.values;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            Object obj = objArr[(i15 << 3) + i17];
                            if (obj instanceof q0) {
                                q0 q0Var = (q0) obj;
                                Object[] objArr2 = q0Var.content;
                                int i18 = q0Var._size;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    Object obj2 = objArr2[i19];
                                    if (obj2 instanceof e) {
                                        ((e) obj2).a();
                                    }
                                }
                            } else if (obj instanceof e) {
                                ((e) obj).a();
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    } else if (i15 != length) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        a3.b.a(this.keptExitedValues);
    }

    public final void a() {
        this.isEnabled = false;
        f();
    }

    public final void b() {
        this.isDisposed = true;
        a();
    }

    public final boolean c() {
        return this.isEnabled && !this.isContentComposed;
    }

    public void d() {
        if (this.isDisposed) {
            return;
        }
        if (this.isContentComposed) {
            a3.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        f();
        this.isContentComposed = true;
    }

    public void e() {
        if (this.isDisposed) {
            return;
        }
        if (!this.isContentComposed) {
            a3.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!a3.b.d(this.keptExitedValues)) {
            a3.a.a("Attempted to start retaining exited values with pending exited values");
        }
        this.isContentComposed = false;
    }
}
