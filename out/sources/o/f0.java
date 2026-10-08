package o;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo/f0;", "", "<init>", "()V", "", AnnotatedPrivateKey.LABEL, "Ljava/lang/Runnable;", "block", "Loq/i0;", "a", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f139956a = new f0();

    private f0() {
    }

    public static final void a(String label, Runnable block) {
        eb.a.c("CX:" + label);
        try {
            block.run();
            oq.i0 i0Var = oq.i0.f148189a;
        } finally {
            eb.a.f();
        }
    }
}
