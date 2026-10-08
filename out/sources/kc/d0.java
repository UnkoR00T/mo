package kc;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR\u0013\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lkc/d0;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lkc/s;", "a", "(Landroid/content/Context;)Lkc/s;", "c", "Liu/e;", "reference", "coil"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f109797a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReference f109798b = new AtomicReference(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lkc/d0$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lkc/s;", "a", "(Landroid/content/Context;)Lkc/s;", "coil"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        s a(Context context);
    }

    private d0() {
    }

    public static final s a(Context context) {
        d0 d0Var = f109797a;
        Object obj = d0Var.b().get();
        s sVar = obj instanceof s ? (s) obj : null;
        return sVar == null ? d0Var.c(context) : sVar;
    }

    private final /* synthetic */ AtomicReference b() {
        return f109798b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final s c(Context context) {
        s sVar;
        a aVar;
        a aVar2;
        a aVar3;
        s sVarA;
        a aVar4;
        AtomicReference atomicReferenceB = b();
        s sVarA2 = null;
        while (true) {
            Object obj = atomicReferenceB.get();
            if (obj instanceof s) {
                sVar = sVarA2;
                sVarA2 = (s) obj;
            } else {
                if (sVarA2 == null) {
                    Context contextA = g0.a(context);
                    if (obj instanceof a) {
                        aVar4 = (a) obj;
                    } else {
                        aVar = null;
                    }
                    if (aVar == null || (sVarA = aVar.a(contextA)) == null) {
                        aVar = aVar4;
                        aVar = aVar4;
                        if (contextA instanceof a) {
                            aVar3 = (a) contextA;
                        } else {
                            aVar2 = null;
                        }
                        if (aVar2 != null) {
                            aVar2 = aVar3;
                            sVarA2 = aVar2.a(contextA);
                        } else {
                            aVar2 = aVar3;
                            sVarA2 = f0.f109802a.a(contextA);
                        }
                    } else {
                        aVar = aVar4;
                        sVarA2 = sVarA;
                    }
                }
                sVar = sVarA2;
            }
            if (androidx.camera.view.i.a(atomicReferenceB, obj, sVarA2)) {
                return sVarA2;
            }
            sVarA2 = sVar;
        }
    }
}
