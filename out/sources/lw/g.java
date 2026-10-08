package lw;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00072\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u000b2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006 "}, d2 = {"Llw/g;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h$a;", "Liw/h;", "marker", "", "endPosition", "<init>", "(Ljw/b;Liw/h$a;I)V", "", "e", "()Z", "Lkw/b$a;", "j", "()Lkw/b$a;", "Liw/d$a;", "Liw/d;", "pos", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "g", "(Liw/d$a;)I", "Lyv/a;", "k", "()Lyv/a;", "d", "(Liw/d$a;)Z", "I", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class g extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int endPosition;

    public g(jw.b bVar, iw.h.a aVar, int i15) {
        super(bVar, aVar);
        this.endPosition = i15;
    }

    @Override // kw.b
    public boolean d(iw.d.a pos) {
        return true;
    }

    @Override // kw.b
    public boolean e() {
        return false;
    }

    @Override // kw.c
    protected int g(iw.d.a pos) {
        return this.endPosition;
    }

    @Override // kw.c
    protected kw.b.c h(iw.d.a pos, jw.b currentConstraints) {
        return pos.getGlobalPos() < this.endPosition ? kw.b.c.INSTANCE.a() : kw.b.c.INSTANCE.b();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    public yv.a k() {
        return yv.c.LINK_DEFINITION;
    }
}
