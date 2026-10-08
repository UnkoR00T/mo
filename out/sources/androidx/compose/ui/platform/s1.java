package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/s1;", "", "Landroidx/compose/ui/platform/i2;", "request", "Lkotlin/Function0;", "Loq/i0;", "onAllConnectionsClosed", "<init>", "(Landroidx/compose/ui/platform/i2;Ler/a;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "c", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "d", "()V", "a", "Landroidx/compose/ui/platform/i2;", "b", "Ler/a;", "Ljava/lang/Object;", "lock", "Ln2/c;", "Lg4/u1;", "Lv4/c0;", "Ln2/c;", "connections", "", "e", "Z", "disposed", "()Z", "isActive", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i2 request;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<oq.i0> onAllConnectionsClosed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private n2.c<g4.u1<v4.c0>> connections = new n2.c<>(new g4.u1[16], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv4/c0;", "closedConnection", "Loq/i0;", "c", "(Lv4/c0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<v4.c0, oq.i0> {
        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(v4.c0 c0Var) {
            c(c0Var);
            return oq.i0.f148189a;
        }

        public final void c(v4.c0 c0Var) {
            c0Var.a();
            n2.c cVar = s1.this.connections;
            Object[] objArr = cVar.content;
            int size = cVar.getSize();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (fr.t.c((g4.u1) objArr[i15], c0Var)) {
                    break;
                } else {
                    i15++;
                }
            }
            if (i15 >= 0) {
                s1.this.connections.v(i15);
            }
            if (s1.this.connections.getSize() == 0) {
                s1.this.onAllConnectionsClosed.a();
            }
        }
    }

    public s1(i2 i2Var, er.a<oq.i0> aVar) {
        this.request = i2Var;
        this.onAllConnectionsClosed = aVar;
    }

    public final InputConnection c(EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            v4.c0 c0VarA = v4.h0.a(this.request.a(outAttrs), new a());
            this.connections.d(new g4.u1<>(c0VarA));
            return c0VarA;
        }
    }

    public final void d() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                n2.c<g4.u1<v4.c0>> cVar = this.connections;
                g4.u1<v4.c0>[] u1VarArr = cVar.content;
                int size = cVar.getSize();
                for (int i15 = 0; i15 < size; i15++) {
                    v4.c0 c0Var = u1VarArr[i15].get();
                    if (c0Var != null) {
                        c0Var.a();
                    }
                }
                this.connections.j();
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean e() {
        return !this.disposed;
    }
}
