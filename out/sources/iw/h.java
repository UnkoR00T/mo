package iw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00060\u000eR\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Liw/h;", "", "<init>", "()V", "", "position", "Loq/i0;", "f", "(I)V", "", "Lnw/f$a;", "nodes", "b", "(Ljava/util/Collection;)V", "Liw/h$a;", "e", "()Liw/h$a;", "<set-?>", "a", "I", "c", "()I", "currentPosition", "", "Ljava/util/List;", "_production", "", "d", "()Ljava/util/List;", "production", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int currentPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<nw.f.Node> _production = new ArrayList();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"Liw/h$a;", "", "<init>", "(Liw/h;)V", "Lyv/a;", "type", "Loq/i0;", "a", "(Lyv/a;)V", "", "I", "startPos", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int startPos;

        public a() {
            this.startPos = h.this.getCurrentPosition();
        }

        public final void a(yv.a type) {
            h.this._production.add(new nw.f.Node(new lr.i(this.startPos, h.this.getCurrentPosition()), type));
        }
    }

    public final void b(Collection<nw.f.Node> nodes) {
        this._production.addAll(nodes);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final List<nw.f.Node> d() {
        return this._production;
    }

    public final a e() {
        return new a();
    }

    public final void f(int position) {
        this.currentPosition = position;
    }
}
