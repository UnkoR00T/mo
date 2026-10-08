package ed;

import CON.j0;
import fr.q0;
import java.io.Closeable;
import java.util.List;
import ju.l0;
import kc.h0;
import p071kotlin.Metadata;
import zc.ErrorResult;
import zc.ImageRequest;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0002*\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0019\u001a\u00020\u0014*\u00020\u00142\u001c\u0010\u0018\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-\"(\u00104\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0018\u00108\u001a\u00020 *\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0018\u0010<\u001a\u000209*\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\" \u0010C\u001a\u0004\u0018\u00010>*\u00020=8@X\u0080\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Ljava/io/Closeable;", "Lokio/Closeable;", "Loq/i0;", "h", "(Ljava/io/Closeable;)V", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "i", "(Ljava/lang/AutoCloseable;)V", "Lkc/h;", "", "data", "Lzc/n;", "options", "Led/t;", "logger", "", "tag", "p", "(Lkc/h;Ljava/lang/Object;Lzc/n;Led/t;Ljava/lang/String;)Ljava/lang/String;", "Lkc/h$a;", "Loq/r;", "Lqc/j$a;", "Lmr/c;", "pair", "e", "(Lkc/h$a;Loq/r;)Lkc/h$a;", "Loc/i$a;", "factory", "d", "(Lkc/h$a;Loc/i$a;)Lkc/h$a;", "", "", "n", "(I)Z", "Lkc/h0;", "uri", "m", "(Lkc/h0;)Z", "Lzc/f;", "request", "", "throwable", "Lzc/e;", "c", "(Lzc/f;Ljava/lang/Throwable;)Lzc/e;", "Lkotlin/Function1;", "Lkc/n;", "a", "Ler/l;", "k", "()Ler/l;", "EMPTY_IMAGE_FACTORY", "Lrc/d$a;", "o", "(Lrc/d$a;)Z", "isPlaceholderCached", "Lkc/j;", "l", "(Lrc/d$a;)Lkc/j;", "eventListener", "Ltq/i;", "Lju/l0;", "j", "(Ltq/i;)Lju/l0;", "getDispatcher$annotations", "(Ltq/i;)V", "dispatcher", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final er.l<ImageRequest, kc.n> f49456a = a.f49457a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f49457a = new a();

        a() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(ImageRequest imageRequest) {
            return null;
        }
    }

    public static final ErrorResult c(ImageRequest imageRequest, Throwable th4) {
        kc.n nVarA;
        if (!(th4 instanceof zc.l) || (nVarA = imageRequest.b()) == null) {
            nVarA = imageRequest.a();
        }
        return new ErrorResult(nVarA, imageRequest, th4);
    }

    public static final kc.h.a d(kc.h.a aVar, final oc.i.a aVar2) {
        if (aVar2 != null) {
            aVar.q().add(0, new er.a() { // from class: ed.e0
                @Override // er.a
                public final Object a() {
                    return f0.g(aVar2);
                }
            });
        }
        return aVar;
    }

    public static final kc.h.a e(kc.h.a aVar, final oq.r<? extends qc.j.a<?>, ? extends mr.c<?>> rVar) {
        if (rVar != null) {
            aVar.r().add(0, new er.a() { // from class: ed.d0
                @Override // er.a
                public final Object a() {
                    return f0.f(rVar);
                }
            });
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(oq.r rVar) {
        return pq.v.e(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(oc.i.a aVar) {
        return pq.v.e(aVar);
    }

    public static final void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e15) {
            throw e15;
        } catch (Exception unused) {
        }
    }

    public static final void i(AutoCloseable autoCloseable) {
        try {
            j0.a(autoCloseable);
        } catch (RuntimeException e15) {
            throw e15;
        } catch (Exception unused) {
        }
    }

    public static final l0 j(tq.i iVar) {
        return (l0) iVar.m(l0.INSTANCE);
    }

    public static final er.l<ImageRequest, kc.n> k() {
        return f49456a;
    }

    public static final kc.j l(rc.d.a aVar) {
        return aVar instanceof rc.e ? ((rc.e) aVar).getEventListener() : kc.j.f109827b;
    }

    public static final boolean m(h0 h0Var) {
        return ((h0Var.getScheme() != null && !fr.t.c(h0Var.getScheme(), "file")) || h0Var.getPath() == null || g0.h(h0Var)) ? false : true;
    }

    public static final boolean n(int i15) {
        return i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE;
    }

    public static final boolean o(rc.d.a aVar) {
        return (aVar instanceof rc.e) && ((rc.e) aVar).getIsPlaceholderCached();
    }

    public static final String p(kc.h hVar, Object obj, Options options, t tVar, String str) {
        List<oq.r<sc.c<? extends Object>, mr.c<? extends Object>>> listH = hVar.h();
        int size = listH.size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            oq.r<sc.c<? extends Object>, mr.c<? extends Object>> rVar = listH.get(i15);
            sc.c<? extends Object> cVarA = rVar.a();
            if (rVar.b().A(obj)) {
                String strA = cVarA.a(obj, options);
                if (strA != null) {
                    return strA;
                }
                z15 = true;
            }
        }
        if (!z15 && tVar != null) {
            t.a aVar = t.a.Warn;
            if (tVar.a().compareTo(aVar) <= 0) {
                tVar.b(str, aVar, "No keyer is registered for data with type '" + q0.c(obj.getClass()).D() + "'. Register Keyer<" + q0.c(obj.getClass()).D() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
