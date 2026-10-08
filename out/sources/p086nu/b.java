package p086nu;

import ip.a;
import java.util.Arrays;
import mu.p0;
import oq.i0;
import oq.t;
import p071kotlin.Metadata;
import p086nu.d;
import tq.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lnu/b;", "Lnu/d;", a.f96137b, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "h", "()Lnu/d;", "", "size", "", "i", "(I)[Lnu/d;", "g", "slot", "Loq/i0;", "j", "(Lnu/d;)V", "value", "a", "[Lnu/d;", "l", "()[Lnu/d;", "slots", "b", "I", "k", "()I", "nCollectors", "c", "nextIndex", "Lnu/c0;", "d", "Lnu/c0;", "_subscriptionCount", "Lmu/p0;", "m", "()Lmu/p0;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b<S extends d<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private S[] slots;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nCollectors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nextIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private c0 _subscriptionCount;

    protected final S g() {
        S s15;
        c0 c0Var;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) i(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.slots = (S[]) ((d[]) objArrCopyOf);
                    sArr = (S[]) ((d[]) objArrCopyOf);
                }
                int i15 = this.nextIndex;
                do {
                    s15 = sArr[i15];
                    if (s15 == null) {
                        s15 = (S) h();
                        sArr[i15] = s15;
                    }
                    i15++;
                    if (i15 >= sArr.length) {
                        i15 = 0;
                    }
                } while (!s15.a(this));
                this.nextIndex = i15;
                this.nCollectors++;
                c0Var = this._subscriptionCount;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (c0Var != null) {
            c0Var.c0(1);
        }
        return s15;
    }

    protected abstract S h();

    protected abstract S[] i(int size);

    protected final void j(S slot) {
        c0 c0Var;
        int i15;
        e<i0>[] eVarArrB;
        synchronized (this) {
            try {
                int i16 = this.nCollectors - 1;
                this.nCollectors = i16;
                c0Var = this._subscriptionCount;
                if (i16 == 0) {
                    this.nextIndex = 0;
                }
                eVarArrB = slot.b(this);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        for (e<i0> eVar : eVarArrB) {
            if (eVar != null) {
                t.Companion companion = t.INSTANCE;
                eVar.i(t.b(i0.f148189a));
            }
        }
        if (c0Var != null) {
            c0Var.c0(-1);
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    protected final int getNCollectors() {
        return this.nCollectors;
    }

    protected final S[] l() {
        return this.slots;
    }

    public final p0<Integer> m() {
        c0 c0Var;
        synchronized (this) {
            c0Var = this._subscriptionCount;
            if (c0Var == null) {
                c0Var = new c0(this.nCollectors);
                this._subscriptionCount = c0Var;
            }
        }
        return c0Var;
    }
}
