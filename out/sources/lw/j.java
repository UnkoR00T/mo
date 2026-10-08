package lw;

import er.p;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005\u0012\u001c\u0010\u000b\u001a\u0018\u0012\b\u0012\u00060\bR\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\n2\n\u0010\u0010\u001a\u00060\bR\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0010\u001a\u00060\bR\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0010\u001a\u00060\bR\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR-\u0010\u000b\u001a\u0018\u0012\b\u0012\u00060\bR\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Llw/j;", "Lkw/c;", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "Liw/h$a;", "Liw/h;", "marker", "Lkotlin/Function2;", "Liw/d$a;", "Liw/d;", "", "interruptsParagraph", "<init>", "(Ljw/b;Liw/h$a;Ler/p;)V", "e", "()Z", "pos", "d", "(Liw/d$a;)Z", "Lkw/b$a;", "j", "()Lkw/b$a;", "", "g", "(Liw/d$a;)I", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "Lyv/a;", "k", "()Lyv/a;", "Ler/p;", "getInterruptsParagraph", "()Ler/p;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class j extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p<iw.d.a, jw.b, Boolean> interruptsParagraph;

    /* JADX WARN: Multi-variable type inference failed */
    public j(jw.b bVar, iw.h.a aVar, p<? super iw.d.a, ? super jw.b, Boolean> pVar) {
        super(bVar, aVar);
        this.interruptsParagraph = pVar;
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
        if (pos.getLocalPos() != -1) {
            return kw.b.c.INSTANCE.a();
        }
        hw.a aVar = hw.a.f86718a;
        if (!(pos.getLocalPos() == -1)) {
            throw new yv.d("");
        }
        if (kw.a.f112851a.a(pos, i()) >= 2) {
            return kw.b.c.INSTANCE.b();
        }
        jw.b bVarA = jw.c.a(i(), pos);
        if (!jw.c.g(bVarA, i())) {
            return kw.b.c.INSTANCE.b();
        }
        iw.d.a aVarM = pos.m(jw.c.f(bVarA, pos.getCurrentLine()) + 1);
        return (aVarM == null || this.interruptsParagraph.B(aVarM, bVarA).booleanValue()) ? kw.b.c.INSTANCE.b() : kw.b.c.INSTANCE.a();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    /* JADX INFO: renamed from: k */
    public yv.a getNodeType() {
        return yv.c.PARAGRAPH;
    }
}
