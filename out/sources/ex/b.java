package ex;

import dx.i;
import oq.g;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lex/b;", "ERROR", "", "error", "", "b", "(Ljava/lang/Object;)Ljava/lang/Void;", "RIGHT", "Ldx/i;", "a", "(Ldx/i;)Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b<ERROR> {
    /* JADX WARN: Multi-variable type inference failed */
    default <RIGHT> RIGHT a(i<? extends ERROR, ? extends RIGHT> iVar) {
        if (iVar instanceof i.Left) {
            b(((i.Left) iVar).b());
            throw new g();
        }
        if (iVar instanceof i.Right) {
            return (RIGHT) ((i.Right) iVar).b();
        }
        throw new p();
    }

    default Void b(ERROR error) {
        throw new c(error);
    }
}
