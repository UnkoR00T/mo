package lw;

import fu.o;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)¨\u0006+"}, d2 = {"Llw/d;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h;", "productionHolder", "", "fenceStart", "<init>", "(Ljw/b;Liw/h;Ljava/lang/String;)V", "", "line", "", "m", "(Ljava/lang/CharSequence;)Z", "e", "()Z", "Liw/d$a;", "Liw/d;", "pos", "d", "(Liw/d$a;)Z", "", "g", "(Liw/d$a;)I", "Lkw/b$a;", "j", "()Lkw/b$a;", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "Lyv/a;", "k", "()Lyv/a;", "Liw/h;", "f", "Ljava/lang/String;", "Lfu/o;", "Lfu/o;", "endLineRegex", "I", "realInterestingOffset", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class d extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iw.h productionHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fenceStart;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o endLineRegex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int realInterestingOffset;

    public d(jw.b bVar, iw.h hVar, String str) {
        super(bVar, hVar.e());
        this.productionHolder = hVar;
        this.fenceStart = str;
        this.endLineRegex = new o("^ {0,3}" + str + "+ *$");
        this.realInterestingOffset = -1;
    }

    private final boolean m(CharSequence line) {
        return this.endLineRegex.f(line);
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
        if (pos.getGlobalPos() >= this.realInterestingOffset && pos.getLocalPos() == -1) {
            hw.a aVar = hw.a.f86718a;
            if (!(pos.getLocalPos() == -1)) {
                throw new yv.d("");
            }
            jw.b bVarA = jw.c.a(i(), pos);
            if (!jw.c.e(bVarA, i())) {
                return kw.b.c.INSTANCE.b();
            }
            int iG = pos.g();
            this.realInterestingOffset = iG;
            if (m(jw.c.c(bVarA, pos.getCurrentLine()))) {
                this.productionHolder.b(v.e(new nw.f.Node(new lr.i(pos.getGlobalPos() + 1, pos.g()), yv.e.H)));
                l(iG, kw.b.c.INSTANCE.b());
            } else {
                lr.i iVar = new lr.i(Math.min(pos.getGlobalPos() + 1 + jw.c.f(i(), pos.getCurrentLine()), iG), iG);
                if (iVar.getFirst() < iVar.getLast()) {
                    this.productionHolder.b(v.e(new nw.f.Node(iVar, yv.e.G)));
                }
            }
            return kw.b.c.INSTANCE.a();
        }
        return kw.b.c.INSTANCE.a();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    /* JADX INFO: renamed from: k */
    public yv.a getNodeType() {
        return yv.c.CODE_FENCE;
    }
}
