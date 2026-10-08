package lw;

import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00112\n\u0010\u0016\u001a\u00060\u0014R\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\b2\n\u0010\u0016\u001a\u00060\u0014R\u00020\u0015H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\n\u0010\u0016\u001a\u00060\u0014R\u00020\u00152\u0006\u0010 \u001a\u00020\u0002H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$¨\u0006&"}, d2 = {"Llw/a;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h;", "productionHolder", "Llr/i;", "headerRange", "", "tailStartPos", "endOfLinePos", "<init>", "(Ljw/b;Liw/h;Llr/i;II)V", "headerSize", "Lyv/a;", "m", "(I)Lyv/a;", "", "e", "()Z", "Liw/d$a;", "Liw/d;", "pos", "d", "(Liw/d$a;)Z", "k", "()Lyv/a;", "Lkw/b$a;", "j", "()Lkw/b$a;", "g", "(Liw/d$a;)I", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "Lyv/a;", "nodeType", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class a extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yv.a nodeType;

    public a(jw.b bVar, iw.h hVar, lr.i iVar, int i15, int i16) {
        super(bVar, hVar.e());
        int currentPosition = hVar.getCurrentPosition();
        List listC = v.c();
        lr.i iVar2 = new lr.i(iVar.getFirst() + currentPosition, iVar.getLast() + currentPosition + 1);
        yv.a aVar = yv.e.f229938s;
        listC.add(new nw.f.Node(iVar2, aVar));
        if (iVar.getLast() + currentPosition + 1 != i15) {
            listC.add(new nw.f.Node(new lr.i(currentPosition + iVar.getLast() + 1, i15), yv.e.f229939t));
        }
        if (i15 != i16) {
            listC.add(new nw.f.Node(new lr.i(i15, i16), aVar));
        }
        hVar.b(v.a(listC));
        this.nodeType = m((iVar.getLast() - iVar.getFirst()) + 1);
    }

    private final yv.a m(int headerSize) {
        switch (headerSize) {
            case 1:
                return yv.c.ATX_1;
            case 2:
                return yv.c.ATX_2;
            case 3:
                return yv.c.ATX_3;
            case 4:
                return yv.c.ATX_4;
            case 5:
                return yv.c.ATX_5;
            case 6:
                return yv.c.ATX_6;
            default:
                return yv.c.ATX_6;
        }
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
        return pos.g();
    }

    @Override // kw.c
    protected kw.b.c h(iw.d.a pos, jw.b currentConstraints) {
        return pos.getLocalPos() == -1 ? new kw.b.c(kw.b.a.f112854b, kw.b.a.f112853a, kw.b.EnumC2732b.PROPAGATE) : kw.b.c.INSTANCE.a();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    /* JADX INFO: renamed from: k, reason: from getter */
    public yv.a getNodeType() {
        return this.nodeType;
    }
}
