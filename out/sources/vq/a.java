package vq;

import java.io.Serializable;
import oq.i0;
import oq.t;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lvq/a;", "Ltq/e;", "", "Lvq/e;", "Ljava/io/Serializable;", "completion", "<init>", "(Ltq/e;)V", "Loq/t;", "result", "Loq/i0;", "i", "(Ljava/lang/Object;)V", "J", "(Ljava/lang/Object;)Ljava/lang/Object;", "K", "()V", "value", "v", "(Ljava/lang/Object;Ltq/e;)Ltq/e;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "I", "()Ljava/lang/StackTraceElement;", "a", "Ltq/e;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Ltq/e;", "e", "()Lvq/e;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements tq.e<Object>, e, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tq.e<Object> completion;

    public a(tq.e<Object> eVar) {
        this.completion = eVar;
    }

    public final tq.e<Object> H() {
        return this.completion;
    }

    public StackTraceElement I() {
        return f.a(this);
    }

    protected abstract Object J(Object result);

    protected void K() {
    }

    public e e() {
        tq.e<Object> eVar = this.completion;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    @Override // tq.e
    public final void i(Object result) {
        tq.e<Object> eVar = this;
        while (true) {
            g.b(eVar);
            a aVar = (a) eVar;
            tq.e<Object> eVar2 = aVar.completion;
            try {
                Object objJ = aVar.J(result);
                if (objJ == uq.b.e()) {
                    return;
                } else {
                    result = t.b(objJ);
                }
            } catch (Throwable th4) {
                t.Companion companion = t.INSTANCE;
                result = t.b(u.a(th4));
            }
            aVar.K();
            if (!(eVar2 instanceof a)) {
                eVar2.i(result);
                return;
            }
            eVar = eVar2;
        }
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Continuation at ");
        Object objI = I();
        if (objI == null) {
            objI = getClass().getName();
        }
        sb5.append(objI);
        return sb5.toString();
    }

    public tq.e<i0> v(Object value, tq.e<?> completion) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
