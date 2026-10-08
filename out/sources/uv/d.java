package uv;

import fv.b0;
import fv.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Luv/d;", "", "<init>", "()V", "Lfv/z;", "client", "Luv/a$a;", "b", "(Lfv/z;)Luv/a$a;", "okhttp-sse"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f201636a = new d();

    private d() {
    }

    public static final a.InterfaceC5237a b(final z client) {
        return new a.InterfaceC5237a() { // from class: uv.c
            @Override // uv.a.InterfaceC5237a
            public final a a(b0 b0Var, b bVar) {
                return d.c(client, b0Var, bVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a c(z zVar, b0 b0Var, b bVar) {
        if (b0Var.d("Accept") == null) {
            b0Var = b0Var.i().a("Accept", "text/event-stream").b();
        }
        rv.a aVar = new rv.a(b0Var, bVar);
        aVar.e(zVar);
        return aVar;
    }
}
