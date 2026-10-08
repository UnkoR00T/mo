package l3;

import android.view.KeyEvent;
import c4.RotaryScrollEvent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H&¢\u0006\u0004\b\u001c\u0010\u0014J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b!\u0010 J'\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H&¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b(\u0010)J'\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H&¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010+\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H&¢\u0006\u0004\b1\u0010\u0014J\u000f\u00102\u001a\u00020\u0012H&¢\u0006\u0004\b2\u0010\u0014J\u0017\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u000bH&¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00122\u0006\u00103\u001a\u000206H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0012H&¢\u0006\u0004\b9\u0010\u0014R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020?0>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8&X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001e\u0010J\u001a\u0004\u0018\u00010\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u00105R\u001c\u0010N\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010 \"\u0004\bL\u0010Mø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006OÀ\u0006\u0001"}, d2 = {"Ll3/s;", "Ll3/o;", "Ll3/g;", "focusDirection", "Lm3/g;", "previouslyFocusedRect", "", "c", "(Ll3/g;Lm3/g;)Z", "focusedRect", "Lkotlin/Function1;", "Ll3/p0;", "onFound", "A", "(ILm3/g;Ler/l;)Ljava/lang/Boolean;", "wrapAroundForOneDimensionalFocus", "f", "(IZ)Z", "Loq/i0;", "z", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "v", "(ZZZI)Z", "y", "(I)Z", "b", "d", "()Lm3/g;", "x", "()Z", "u", "Ly3/b;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "m", "(Landroid/view/KeyEvent;Ler/a;)Z", "i", "(Landroid/view/KeyEvent;)Z", "Lc4/b;", "event", "e", "(Lc4/b;Ler/a;)Z", "Lx3/c;", "r", "(Lx3/c;)Z", "q", "a", "node", "C", "(Ll3/p0;)V", "Ll3/j;", "p", "(Ll3/j;)V", "n", "Lf3/m;", "o", "()Lf3/m;", "modifier", "Lr0/q0;", "Ll3/n;", "s", "()Lr0/q0;", "listeners", "Ll3/l0;", "w", "()Ll3/l0;", "rootState", "k", "()Ll3/p0;", "j", "activeFocusTargetNode", "t", "setFocusCaptured", "(Z)V", "isFocusCaptured", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s extends o {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends fr.w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f115608b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean l(s sVar, KeyEvent keyEvent, er.a aVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i15 & 2) != 0) {
            aVar = a.f115608b;
        }
        return sVar.m(keyEvent, aVar);
    }

    Boolean A(int focusDirection, m3.g focusedRect, er.l<? super p0, Boolean> onFound);

    void C(p0 node);

    void a();

    void b();

    boolean c(g focusDirection, m3.g previouslyFocusedRect);

    m3.g d();

    boolean e(RotaryScrollEvent event, er.a<Boolean> onFocusedItem);

    boolean f(int focusDirection, boolean wrapAroundForOneDimensionalFocus);

    boolean i(KeyEvent keyEvent);

    void j(p0 p0Var);

    p0 k();

    boolean m(KeyEvent keyEvent, er.a<Boolean> onFocusedItem);

    void n();

    f3.m o();

    void p(j node);

    void q();

    boolean r(x3.c event);

    r0.q0<n> s();

    boolean t();

    boolean u();

    boolean v(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    l0 w();

    boolean x();

    boolean y(int focusDirection);

    void z();
}
