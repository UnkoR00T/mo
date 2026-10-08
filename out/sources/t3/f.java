package t3;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010J=\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lt3/f;", "", "<init>", "()V", "a", "()Lt3/f;", "", "x", "y", "h", "(FF)Lt3/f;", "f", "dx", "dy", "g", "d", "(F)Lt3/f;", "e", "i", "j", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "b", "(FFFFFF)Lt3/f;", "Ljava/util/ArrayList;", "Lt3/h;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "_nodes", "", "c", "()Ljava/util/List;", "nodes", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<h> _nodes = new ArrayList<>(32);

    public final f a() {
        this._nodes.add(h.b.f187299c);
        return this;
    }

    public final f b(float dx4, float dy4, float dx5, float dy5, float dx6, float dy6) {
        this._nodes.add(new h.RelativeCurveTo(dx4, dy4, dx5, dy5, dx6, dy6));
        return this;
    }

    public final List<h> c() {
        return this._nodes;
    }

    public final f d(float x15) {
        this._nodes.add(new h.HorizontalTo(x15));
        return this;
    }

    public final f e(float dx4) {
        this._nodes.add(new h.RelativeHorizontalTo(dx4));
        return this;
    }

    public final f f(float x15, float y15) {
        this._nodes.add(new h.LineTo(x15, y15));
        return this;
    }

    public final f g(float dx4, float dy4) {
        this._nodes.add(new h.RelativeLineTo(dx4, dy4));
        return this;
    }

    public final f h(float x15, float y15) {
        this._nodes.add(new h.MoveTo(x15, y15));
        return this;
    }

    public final f i(float y15) {
        this._nodes.add(new h.VerticalTo(y15));
        return this;
    }

    public final f j(float dy4) {
        this._nodes.add(new h.RelativeVerticalTo(dy4));
        return this;
    }
}
