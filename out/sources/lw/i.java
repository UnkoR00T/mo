package lw;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006!"}, d2 = {"Llw/i;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h$a;", "Liw/h;", "marker", "", "listType", "<init>", "(Ljw/b;Liw/h$a;C)V", "", "e", "()Z", "Liw/d$a;", "Liw/d;", "pos", "d", "(Liw/d$a;)Z", "Lkw/b$a;", "j", "()Lkw/b$a;", "", "g", "(Liw/d$a;)I", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "Lyv/a;", "k", "()Lyv/a;", "C", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class i extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final char listType;

    public i(jw.b bVar, iw.h.a aVar, char c15) {
        super(bVar, aVar);
        this.listType = c15;
    }

    @Override // kw.b
    public boolean d(iw.d.a pos) {
        return pos.getLocalPos() == -1;
    }

    @Override // kw.b
    public boolean e() {
        return true;
    }

    @Override // kw.c
    protected int g(iw.d.a pos) {
        Integer numF = pos.f();
        if (numF != null) {
            return numF.intValue();
        }
        return -1;
    }

    @Override // kw.c
    protected kw.b.c h(iw.d.a pos, jw.b currentConstraints) {
        iw.d.a aVarC;
        hw.a aVar = hw.a.f86718a;
        if (!(pos.getLocalPos() == -1)) {
            throw new yv.d("");
        }
        kw.a aVar2 = kw.a.f112851a;
        int iA = aVar2.a(pos, i());
        if (iA < 3 && (aVarC = aVar2.c(pos, iA)) != null && jw.c.d(jw.c.a(i(), aVarC), i())) {
            return kw.b.c.INSTANCE.c();
        }
        return kw.b.c.INSTANCE.b();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    public yv.a k() {
        char c15 = this.listType;
        return (c15 == '-' || c15 == '*' || c15 == '+') ? yv.c.UNORDERED_LIST : yv.c.ORDERED_LIST;
    }
}
