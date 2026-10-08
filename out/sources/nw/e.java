package nw;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lnw/e;", "", "<init>", "()V", "", "index", "Loq/i0;", "b", "(I)V", "", "Llr/i;", "a", "()Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "list", "I", "lastStart", "c", "lastEnd", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<lr.i> list = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastStart = -239;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastEnd = -239;

    public final List<lr.i> a() {
        if (this.lastStart != -239) {
            this.list.add(new lr.i(this.lastStart, this.lastEnd));
        }
        this.lastStart = -239;
        this.lastEnd = -239;
        return this.list;
    }

    public final void b(int index) {
        if (this.lastEnd + 1 == index) {
            this.lastEnd = index;
            return;
        }
        if (this.lastStart != -239) {
            this.list.add(new lr.i(this.lastStart, this.lastEnd));
        }
        this.lastStart = index;
        this.lastEnd = index;
    }
}
