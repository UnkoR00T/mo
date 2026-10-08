package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR<\u0010+\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R<\u0010.\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R$\u00104\u001a\u00020/2\u0006\u0010\t\u001a\u00020/8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"Ll3/v;", "", "", "l", "()Z", "j", "(Z)V", "canFocus", "Ll3/d0;", "_", "p", "()Ll3/d0;", "m", "(Ll3/d0;)V", "next", "n", "f", "previous", "g", "setUp", "up", "i", "setDown", "down", "a", "setLeft", "left", "b", "setRight", "right", "e", "setStart", "start", "h", "setEnd", "end", "Lkotlin/Function1;", "Ll3/h;", "Loq/i0;", "o", "()Ler/l;", "k", "(Ler/l;)V", "onEnter", "q", "s", "onExit", "Lm3/g;", "d", "()Lm3/g;", "r", "(Lm3/g;)V", "focusRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f115635a;

    /* JADX INFO: renamed from: l3.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ll3/v$a;", "", "<init>", "()V", "Lm3/g;", "b", "Lm3/g;", "a", "()Lm3/g;", "UnsetFocusRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f115635a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final m3.g UnsetFocusRect = new m3.g(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

        private Companion() {
        }

        public final m3.g a() {
            return UnsetFocusRect;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll3/h;", "Loq/i0;", "c", "(Ll3/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<h, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f115637b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(h hVar) {
            c(hVar);
            return oq.i0.f148189a;
        }

        public final void c(h hVar) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll3/h;", "Loq/i0;", "c", "(Ll3/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.l<h, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f115638b = new c();

        c() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(h hVar) {
            c(hVar);
            return oq.i0.f148189a;
        }

        public final void c(h hVar) {
        }
    }

    default d0 a() {
        return d0.INSTANCE.c();
    }

    default d0 b() {
        return d0.INSTANCE.c();
    }

    default m3.g d() {
        return INSTANCE.a();
    }

    default d0 e() {
        return d0.INSTANCE.c();
    }

    default void f(d0 d0Var) {
    }

    default d0 g() {
        return d0.INSTANCE.c();
    }

    default d0 h() {
        return d0.INSTANCE.c();
    }

    default d0 i() {
        return d0.INSTANCE.c();
    }

    void j(boolean z15);

    default void k(er.l<? super h, oq.i0> lVar) {
    }

    boolean l();

    default void m(d0 d0Var) {
    }

    default d0 n() {
        return d0.INSTANCE.c();
    }

    default er.l<h, oq.i0> o() {
        return b.f115637b;
    }

    default d0 p() {
        return d0.INSTANCE.c();
    }

    default er.l<h, oq.i0> q() {
        return c.f115638b;
    }

    default void r(m3.g gVar) {
    }

    default void s(er.l<? super h, oq.i0> lVar) {
    }
}
