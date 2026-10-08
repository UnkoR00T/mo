package v4;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Lv4/v0;", "", "Lv4/m0;", "platformTextInputService", "<init>", "(Lv4/m0;)V", "Lv4/t0;", "value", "Lv4/u;", "imeOptions", "Lkotlin/Function1;", "", "Lv4/j;", "Loq/i0;", "onEditCommand", "Lv4/t;", "onImeActionPerformed", "Lv4/b1;", "d", "(Lv4/t0;Lv4/u;Ler/l;Ler/l;)Lv4/b1;", "e", "()V", "session", "g", "(Lv4/b1;)V", "f", "c", "b", "a", "Lv4/m0;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "()Lv4/b1;", "currentInputSession", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m0 platformTextInputService;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<b1> _currentInputSession = new AtomicReference<>(null);

    public v0(m0 m0Var) {
        this.platformTextInputService = m0Var;
    }

    public final b1 a() {
        return this._currentInputSession.get();
    }

    @oq.a
    public final void b() {
        this.platformTextInputService.c();
    }

    @oq.a
    public final void c() {
        if (a() != null) {
            this.platformTextInputService.f();
        }
    }

    public b1 d(TextFieldValue value, ImeOptions imeOptions, er.l<? super List<? extends j>, oq.i0> onEditCommand, er.l<? super t, oq.i0> onImeActionPerformed) {
        this.platformTextInputService.g(value, imeOptions, onEditCommand, onImeActionPerformed);
        b1 b1Var = new b1(this, this.platformTextInputService);
        this._currentInputSession.set(b1Var);
        return b1Var;
    }

    public final void e() {
        this.platformTextInputService.a();
        this._currentInputSession.set(new b1(this, this.platformTextInputService));
    }

    public final void f() {
        this._currentInputSession.set(null);
        this.platformTextInputService.b();
    }

    public void g(b1 session) {
        if (androidx.camera.view.i.a(this._currentInputSession, session, null)) {
            this.platformTextInputService.b();
        }
    }
}
