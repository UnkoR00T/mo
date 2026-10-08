package lw;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\n\u0010\u000e\u001a\u00060\fR\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fR\u00020\rH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00182\n\u0010\u000e\u001a\u00060\fR\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Llw/h;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h$a;", "Liw/h;", "marker", "<init>", "(Ljw/b;Liw/h$a;)V", "", "e", "()Z", "Liw/d$a;", "Liw/d;", "pos", "d", "(Liw/d$a;)Z", "Lkw/b$a;", "j", "()Lkw/b$a;", "", "g", "(Liw/d$a;)I", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "Lyv/a;", "k", "()Lyv/a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class h extends kw.c {
    public h(jw.b bVar, iw.h.a aVar) {
        super(bVar, aVar);
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
        if (iA < 3 && (aVarC = aVar2.c(pos, iA)) != null && jw.c.e(jw.c.a(i(), aVarC), i())) {
            return kw.b.c.INSTANCE.a();
        }
        return kw.b.c.INSTANCE.b();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    public yv.a k() {
        return yv.c.LIST_ITEM;
    }
}
