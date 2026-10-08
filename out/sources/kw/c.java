package kw;

import iw.h;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tR\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H$¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H$¢\u0006\u0004\b!\u0010\u0012J\u001b\u0010\"\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tR\u00020\nH$¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010$\u001a\u00020#H&¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0014R\u001e\u0010\u0006\u001a\u00060\u0004R\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lkw/c;", "Lkw/b;", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "Liw/h$a;", "Liw/h;", "marker", "<init>", "(Ljw/b;Liw/h$a;)V", "Liw/d$a;", "Liw/d;", "pos", "", "a", "(Liw/d$a;)I", "currentConstraints", "Lkw/b$c;", "f", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "b", "()Ljw/b;", "Lkw/b$a;", "action", "", "c", "(Lkw/b$a;)Z", "offset", "result", "Loq/i0;", "l", "(ILkw/b$c;)V", "j", "()Lkw/b$a;", "h", "g", "Lyv/a;", "k", "()Lyv/a;", "Ljw/b;", "i", "Liw/h$a;", "getMarker", "()Liw/h$a;", "I", "lastInterestingOffset", "d", "Lkw/b$c;", "scheduledResult", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jw.b constraints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.a marker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastInterestingOffset = -2;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private b.c scheduledResult;

    public c(jw.b bVar, h.a aVar) {
        this.constraints = bVar;
        this.marker = aVar;
    }

    @Override // kw.b
    public final int a(iw.d.a pos) {
        if (this.scheduledResult != null) {
            return pos.getGlobalPos() + 1;
        }
        int i15 = this.lastInterestingOffset;
        if (i15 != -1 && i15 <= pos.getGlobalPos()) {
            this.lastInterestingOffset = g(pos);
        }
        return this.lastInterestingOffset;
    }

    @Override // kw.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public final jw.b getConstraints() {
        return this.constraints;
    }

    @Override // kw.b
    public boolean c(b.a action) {
        if (action == b.a.f112855c) {
            action = j();
        }
        action.e(this.marker, k());
        return action != b.a.f112856d;
    }

    @Override // kw.b
    public final b.c f(iw.d.a pos, jw.b currentConstraints) {
        if (this.lastInterestingOffset != pos.getGlobalPos() && this.scheduledResult != null) {
            return b.c.INSTANCE.a();
        }
        int i15 = this.lastInterestingOffset;
        if (i15 == -1 || i15 > pos.getGlobalPos()) {
            return b.c.INSTANCE.c();
        }
        if (this.lastInterestingOffset < pos.getGlobalPos() && !d(pos)) {
            return b.c.INSTANCE.c();
        }
        b.c cVar = this.scheduledResult;
        return cVar != null ? cVar : h(pos, currentConstraints);
    }

    protected abstract int g(iw.d.a pos);

    protected abstract b.c h(iw.d.a pos, jw.b currentConstraints);

    protected final jw.b i() {
        return this.constraints;
    }

    protected abstract b.a j();

    public abstract yv.a k();

    protected final void l(int offset, b.c result) {
        this.lastInterestingOffset = offset;
        this.scheduledResult = result;
    }
}
