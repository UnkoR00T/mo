package p143z0;

import c1.e;
import er.l;
import java.util.concurrent.CancellationException;
import ju.n;
import lr.i;
import lr.m;
import m3.g;
import n2.c;
import oq.i0;
import oq.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lz0/x;", "", "<init>", "()V", "Lz0/b0$a;", "request", "", "d", "(Lz0/b0$a;)Z", "Loq/i0;", "f", "", "cause", "c", "(Ljava/lang/Throwable;)V", "Ln2/c;", "a", "Ln2/c;", "requests", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f231773b = c.f130721d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<b0.a> requests = new c<>(new b0.a[16], 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(x xVar, b0.a aVar, Throwable th4) {
        xVar.requests.t(aVar);
        return i0.f148189a;
    }

    public final void c(Throwable cause) {
        c<b0.a> cVar = this.requests;
        int size = cVar.getSize();
        n[] nVarArr = new n[size];
        for (int i15 = 0; i15 < size; i15++) {
            nVarArr[i15] = cVar.content[i15].a();
        }
        for (int i16 = 0; i16 < size; i16++) {
            nVarArr[i16].Q(cause);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        e.c("uncancelled requests present");
    }

    public final boolean d(final b0.a request) {
        g gVarA = request.b().a();
        if (gVarA == null) {
            n<i0> nVarA = request.a();
            t.Companion companion = t.INSTANCE;
            nVarA.i(t.b(i0.f148189a));
            return false;
        }
        request.a().E(new l() { // from class: z0.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.e(this.f231768a, request, (Throwable) obj);
            }
        });
        i iVarW = m.w(0, this.requests.getSize());
        int first = iVarW.getFirst();
        int last = iVarW.getLast();
        if (first <= last) {
            while (true) {
                g gVarA2 = this.requests.content[last].b().a();
                if (gVarA2 != null) {
                    g gVarQ = gVarA.q(gVarA2);
                    if (!fr.t.c(gVarQ, gVarA)) {
                        if (!fr.t.c(gVarQ, gVarA2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int size = this.requests.getSize() - 1;
                            if (size <= last) {
                                while (true) {
                                    this.requests.content[last].a().Q(cancellationException);
                                    if (size == last) {
                                        break;
                                    }
                                    size++;
                                }
                            }
                        }
                    } else {
                        this.requests.c(last + 1, request);
                        return true;
                    }
                }
                if (last != first) {
                    last--;
                }
            }
        }
        this.requests.c(0, request);
        return true;
    }

    public final void f() {
        i iVarW = m.w(0, this.requests.getSize());
        int first = iVarW.getFirst();
        int last = iVarW.getLast();
        if (first <= last) {
            while (true) {
                this.requests.content[first].a().i(t.b(i0.f148189a));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.j();
    }
}
