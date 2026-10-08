package ag2;

import fu.r;
import p071kotlin.Metadata;
import tq0.l;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lag2/a;", "Lxw/f;", "", "Ltq0/l;", "Lyf2/b;", "endpoints", "<init>", "(Lyf2/b;)V", "input", "c", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Lyf2/b;", "getEndpoints", "()Lyf2/b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<String, l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yf2.b endpoints;

    public a(yf2.b bVar) {
        this.endpoints = bVar;
    }

    @Override // er.l
    public /* bridge */ /* synthetic */ Object b(Object obj) {
        return l.a(c((String) obj));
    }

    public String c(String input) {
        return r.V(input, this.endpoints.S(), false, 2, null) ? l.b(r.P(input, this.endpoints.S(), "", false, 4, null)) : l.b(input);
    }
}
