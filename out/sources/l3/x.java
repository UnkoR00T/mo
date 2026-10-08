package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001e\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\"\u0010!\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\"\u0010$\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000e\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b#\u0010\u0012R\"\u0010&\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b%\u0010\u0012R\"\u0010(\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000e\u001a\u0004\b\"\u0010\u0010\"\u0004\b'\u0010\u0012R.\u00101\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b,\u00100R.\u00104\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00100R\"\u0010:\u001a\u0002058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u00106\u001a\u0004\b\u0014\u00107\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Ll3/x;", "Ll3/v;", "<init>", "()V", "", "b", "Z", "l", "()Z", "j", "(Z)V", "canFocus", "Ll3/d0;", "c", "Ll3/d0;", "p", "()Ll3/d0;", "m", "(Ll3/d0;)V", "next", "d", "n", "f", "previous", "e", "g", "setUp", "up", "i", "setDown", "down", "a", "setLeft", "left", "h", "setRight", "right", "setStart", "start", "setEnd", "end", "Lkotlin/Function1;", "Ll3/h;", "Loq/i0;", "k", "Ler/l;", "o", "()Ler/l;", "(Ler/l;)V", "onEnter", "q", "s", "onExit", "Lm3/g;", "Lm3/g;", "()Lm3/g;", "r", "(Lm3/g;)V", "focusRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean canFocus = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d0 next;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d0 previous;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private d0 up;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private d0 down;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d0 left;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d0 right;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private d0 start;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private d0 end;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private er.l<? super h, oq.i0> onEnter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private er.l<? super h, oq.i0> onExit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private m3.g focusRect;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll3/h;", "Loq/i0;", "c", "(Ll3/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<h, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f115658b = new a();

        a() {
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
    static final class b extends fr.w implements er.l<h, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f115659b = new b();

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

    public x() {
        d0.Companion companion = d0.INSTANCE;
        this.next = companion.c();
        this.previous = companion.c();
        this.up = companion.c();
        this.down = companion.c();
        this.left = companion.c();
        this.right = companion.c();
        this.start = companion.c();
        this.end = companion.c();
        this.onEnter = a.f115658b;
        this.onExit = b.f115659b;
        this.focusRect = v.INSTANCE.a();
    }

    @Override // l3.v
    /* JADX INFO: renamed from: a, reason: from getter */
    public d0 getLeft() {
        return this.left;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: b, reason: from getter */
    public d0 getRight() {
        return this.right;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: d, reason: from getter */
    public m3.g getFocusRect() {
        return this.focusRect;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public d0 getStart() {
        return this.start;
    }

    @Override // l3.v
    public void f(d0 d0Var) {
        this.previous = d0Var;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: g, reason: from getter */
    public d0 getUp() {
        return this.up;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: h, reason: from getter */
    public d0 getEnd() {
        return this.end;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: i, reason: from getter */
    public d0 getDown() {
        return this.down;
    }

    @Override // l3.v
    public void j(boolean z15) {
        this.canFocus = z15;
    }

    @Override // l3.v
    public void k(er.l<? super h, oq.i0> lVar) {
        this.onEnter = lVar;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: l, reason: from getter */
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // l3.v
    public void m(d0 d0Var) {
        this.next = d0Var;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: n, reason: from getter */
    public d0 getPrevious() {
        return this.previous;
    }

    @Override // l3.v
    public er.l<h, oq.i0> o() {
        return this.onEnter;
    }

    @Override // l3.v
    /* JADX INFO: renamed from: p, reason: from getter */
    public d0 getNext() {
        return this.next;
    }

    @Override // l3.v
    public er.l<h, oq.i0> q() {
        return this.onExit;
    }

    @Override // l3.v
    public void r(m3.g gVar) {
        this.focusRect = gVar;
    }

    @Override // l3.v
    public void s(er.l<? super h, oq.i0> lVar) {
        this.onExit = lVar;
    }
}
