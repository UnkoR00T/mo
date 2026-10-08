package sa;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsa/k;", "Lza/d$c;", "delegate", "Lsa/b;", "autoCloser", "<init>", "(Lza/d$c;Lsa/b;)V", "Lza/d$b;", "configuration", "Lsa/g;", "b", "(Lza/d$b;)Lsa/g;", "a", "Lza/d$c;", "Lsa/b;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements za.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.d.c delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b autoCloser;

    public k(za.d.c cVar, b bVar) {
        this.delegate = cVar;
        this.autoCloser = bVar;
    }

    @Override // za.d.c
    public /* bridge */ /* synthetic */ za.d a(za.d.b bVar) {
        return io.sentry.android.sqlite.d.m(b(bVar));
    }

    public g b(za.d.b configuration) {
        return new g(this.delegate.a(configuration), this.autoCloser);
    }
}
