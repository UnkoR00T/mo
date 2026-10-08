package kc;

import p071kotlin.Metadata;
import zc.ImageRequest;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lkc/l;", "Lkc/l$c;", "key", "c", "(Lkc/l;Lkc/l$c;)Ljava/lang/Object;", "Lzc/f;", "a", "(Lzc/f;Lkc/l$c;)Ljava/lang/Object;", "Lzc/n;", "b", "(Lzc/n;Lkc/l$c;)Ljava/lang/Object;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    public static final <T> T a(ImageRequest imageRequest, Extras.c<T> cVar) {
        T t15 = (T) imageRequest.getExtras().c(cVar);
        if (t15 != null) {
            return t15;
        }
        T t16 = (T) imageRequest.getDefaults().getExtras().c(cVar);
        return t16 == null ? cVar.a() : t16;
    }

    public static final <T> T b(Options options, Extras.c<T> cVar) {
        T t15 = (T) options.getExtras().c(cVar);
        return t15 == null ? cVar.a() : t15;
    }

    public static final <T> T c(Extras extras, Extras.c<T> cVar) {
        T t15 = (T) extras.c(cVar);
        return t15 == null ? cVar.a() : t15;
    }
}
