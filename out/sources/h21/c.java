package h21;

import fu.r;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh21/c;", "Lh21/b;", "<init>", "()V", "Lh21/b$a;", "params", "", "d", "(Lh21/b$a;Ltq/e;)Ljava/lang/Object;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b {
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(b.Params params, tq.e<? super Boolean> eVar) {
        return vq.b.a(!r.t0(params.getMessage()) && (d.f80053a.matcher(params.getMessage()).find() || d.f80054b.matcher(params.getMessage()).find() || d.f80055c.matcher(params.getMessage()).find()));
    }
}
