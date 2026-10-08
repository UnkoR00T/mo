package p076m2;

import e3.ComposeStackTraceFrame;
import e3.k;
import er.a;
import er.p;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H ¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H ¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H ¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH ¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H ¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH ¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010 \u001a\u00020\u001f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH ¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\nH ¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017H ¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u001f8 X \u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u001f8 X \u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0016\u0010/\u001a\u0004\u0018\u00010\u00188 X \u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008 X \u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0004\u0018\u0001048 X \u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001f8 X \u0004¢\u0006\u0006\u001a\u0004\b8\u0010)¨\u0006:"}, d2 = {"Lm2/q1;", "Lm2/r;", "<init>", "()V", "Loq/i0;", "n0", "c0", "Y", "b0", "a0", "", "value", "Le3/a;", "m0", "(Ljava/lang/Object;)Le3/a;", "", "Le3/d;", "j0", "()Ljava/util/List;", "Lkotlin/Function0;", "block", "k0", "(Ler/a;)V", "Ln2/g;", "Lm2/f4;", "invalidationsRequested", "content", "Lm2/e5;", "shouldPause", "Z", "(Lr0/t0;Ler/p;Lm2/e5;)V", "", "l0", "(Lr0/t0;Lm2/e5;)Z", "scope", "instance", "o0", "(Lm2/f4;Ljava/lang/Object;)Z", "p0", "(Lr0/t0;)V", "d0", "()Z", "areChildrenComposing", "i0", "isComposing", "e0", "()Lm2/f4;", "currentRecomposeScope", "Le3/k;", "g0", "()Le3/k;", "errorContext", "Lm2/i;", "f0", "()Lm2/i;", "deferredChanges", "h0", "sourceMarkersEnabled", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class q1 implements r {
    public abstract void Y();

    public abstract void Z(t0<Object, Object> invalidationsRequested, p<? super r, ? super Integer, i0> content, e5 shouldPause);

    public abstract void a0();

    public abstract void b0();

    public abstract void c0();

    public abstract boolean d0();

    public abstract f4 e0();

    public abstract i f0();

    public abstract k g0();

    public abstract boolean h0();

    public abstract boolean i0();

    public abstract List<ComposeStackTraceFrame> j0();

    public abstract void k0(a<i0> block);

    public abstract boolean l0(t0<Object, Object> invalidationsRequested, e5 shouldPause);

    public abstract e3.a m0(Object value);

    public abstract void n0();

    public abstract boolean o0(f4 scope, Object instance);

    public abstract void p0(t0<Object, Object> invalidationsRequested);
}
