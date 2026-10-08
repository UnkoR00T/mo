package zc;

import android.content.Context;
import ed.f0;
import fr.w0;
import java.util.Map;
import kc.Extras;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: renamed from: zc.f, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bD\u0018\u00002\u00020\u0001:\u0004HE76Bµ\u0002\b\u0002\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001c\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b7\u00105J\u001d\u00109\u001a\u0002082\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0007¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010CR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b6\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b7\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bH\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010CR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010CR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R-\u0010\u0014\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bX\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bS\u0010bR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bg\u0010d\u001a\u0004\bg\u0010fR\u0017\u0010\u001a\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b^\u0010d\u001a\u0004\bP\u0010fR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b[\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\be\u0010h\u001a\u0004\b`\u0010jR\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bN\u0010h\u001a\u0004\bk\u0010jR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bR\u0010l\u001a\u0004\bm\u0010nR%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bU\u0010o\u001a\u0004\bp\u0010qR%\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\br\u0010qR%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0006¢\u0006\f\n\u0004\bk\u0010o\u001a\u0004\bs\u0010qR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bm\u0010t\u001a\u0004\bu\u0010vR\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\by\u0010{\u001a\u0004\bw\u0010|R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bu\u0010}\u001a\u0004\bc\u0010~R\u0018\u0010/\u001a\u00020.8\u0006¢\u0006\r\n\u0004\bK\u0010\u007f\u001a\u0005\bY\u0010\u0080\u0001R\u0019\u00101\u001a\u0002008\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0081\u0001\u001a\u0005\bW\u0010\u0082\u0001¨\u0006\u0083\u0001"}, d2 = {"Lzc/f;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "data", "Lbd/a;", "target", "Lzc/f$d;", "listener", "", "memoryCacheKey", "", "memoryCacheKeyExtras", "diskCacheKey", "Lvv/k;", "fileSystem", "Loq/r;", "Lqc/j$a;", "Lmr/c;", "fetcherFactory", "Loc/i$a;", "decoderFactory", "Ltq/i;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lzc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Luc/d$b;", "placeholderMemoryCacheKey", "Lkotlin/Function1;", "Lkc/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lad/i;", "sizeResolver", "Lad/f;", "scale", "Lad/c;", "precision", "Lkc/l;", "extras", "Lzc/f$c;", "defined", "Lzc/f$b;", "defaults", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lbd/a;Lzc/f$d;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lvv/k;Loq/r;Loc/i$a;Ltq/i;Ltq/i;Ltq/i;Lzc/c;Lzc/c;Lzc/c;Luc/d$b;Ler/l;Ler/l;Ler/l;Lad/i;Lad/f;Lad/c;Lkc/l;Lzc/f$c;Lzc/f$b;)V", "B", "()Lkc/n;", "a", "b", "Lzc/f$a;", "z", "(Landroid/content/Context;)Lzc/f$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "Lbd/a;", "y", "()Lbd/a;", "Lzc/f$d;", "p", "()Lzc/f$d;", "e", "Ljava/lang/String;", "q", "f", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "g", "i", "h", "Lvv/k;", "n", "()Lvv/k;", "Loq/r;", "m", "()Loq/r;", "j", "Loc/i$a;", "()Loc/i$a;", "k", "Ltq/i;", "o", "()Ltq/i;", "l", "Lzc/c;", "s", "()Lzc/c;", "t", "Luc/d$b;", "u", "()Luc/d$b;", "Ler/l;", "getPlaceholderFactory", "()Ler/l;", "getErrorFactory", "getFallbackFactory", "Lad/i;", "x", "()Lad/i;", "v", "Lad/f;", "w", "()Lad/f;", "Lad/c;", "()Lad/c;", "Lkc/l;", "()Lkc/l;", "Lzc/f$c;", "()Lzc/f$c;", "Lzc/f$b;", "()Lzc/f$b;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final bd.a target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String memoryCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> memoryCacheKeyExtras;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String diskCacheKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final vv.k fileSystem;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final oq.r<qc.j.a<?>, mr.c<?>> fetcherFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final oc.i.a decoderFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final tq.i interceptorCoroutineContext;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final tq.i fetcherCoroutineContext;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final tq.i decoderCoroutineContext;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final c memoryCachePolicy;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final c diskCachePolicy;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final c networkCachePolicy;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final uc.d.Key placeholderMemoryCacheKey;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<ImageRequest, kc.n> placeholderFactory;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<ImageRequest, kc.n> errorFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<ImageRequest, kc.n> fallbackFactory;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final ad.i sizeResolver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final ad.f scale;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final ad.c precision;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final Extras extras;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final Defined defined;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final Defaults defaults;

    /* JADX INFO: renamed from: zc.f$c, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b$\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b(\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b2\u00101R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b4\u00105R'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00105R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b.\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b6\u0010>¨\u0006?"}, d2 = {"Lzc/f$c;", "", "Lvv/k;", "fileSystem", "Ltq/i;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lzc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lzc/f;", "Lkc/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lad/i;", "sizeResolver", "Lad/f;", "scale", "Lad/c;", "precision", "<init>", "(Lvv/k;Ltq/i;Ltq/i;Ltq/i;Lzc/c;Lzc/c;Lzc/c;Ler/l;Ler/l;Ler/l;Lad/i;Lad/f;Lad/c;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lvv/k;", "f", "()Lvv/k;", "b", "Ltq/i;", "g", "()Ltq/i;", "c", "e", "d", "Lzc/c;", "h", "()Lzc/c;", "i", "Ler/l;", "j", "()Ler/l;", "k", "Lad/i;", "m", "()Lad/i;", "l", "Lad/f;", "()Lad/f;", "Lad/c;", "()Lad/c;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Defined {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vv.k fileSystem;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq.i interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq.i fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq.i decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ImageRequest, kc.n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ImageRequest, kc.n> errorFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ImageRequest, kc.n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ad.i sizeResolver;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ad.f scale;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final ad.c precision;

        /* JADX WARN: Multi-variable type inference failed */
        public Defined(vv.k kVar, tq.i iVar, tq.i iVar2, tq.i iVar3, c cVar, c cVar2, c cVar3, er.l<? super ImageRequest, ? extends kc.n> lVar, er.l<? super ImageRequest, ? extends kc.n> lVar2, er.l<? super ImageRequest, ? extends kc.n> lVar3, ad.i iVar4, ad.f fVar, ad.c cVar4) {
            this.fileSystem = kVar;
            this.interceptorCoroutineContext = iVar;
            this.fetcherCoroutineContext = iVar2;
            this.decoderCoroutineContext = iVar3;
            this.memoryCachePolicy = cVar;
            this.diskCachePolicy = cVar2;
            this.networkCachePolicy = cVar3;
            this.placeholderFactory = lVar;
            this.errorFactory = lVar2;
            this.fallbackFactory = lVar3;
            this.sizeResolver = iVar4;
            this.scale = fVar;
            this.precision = cVar4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final tq.i getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        public final er.l<ImageRequest, kc.n> c() {
            return this.errorFactory;
        }

        public final er.l<ImageRequest, kc.n> d() {
            return this.fallbackFactory;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final tq.i getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) other;
            return fr.t.c(this.fileSystem, defined.fileSystem) && fr.t.c(this.interceptorCoroutineContext, defined.interceptorCoroutineContext) && fr.t.c(this.fetcherCoroutineContext, defined.fetcherCoroutineContext) && fr.t.c(this.decoderCoroutineContext, defined.decoderCoroutineContext) && this.memoryCachePolicy == defined.memoryCachePolicy && this.diskCachePolicy == defined.diskCachePolicy && this.networkCachePolicy == defined.networkCachePolicy && fr.t.c(this.placeholderFactory, defined.placeholderFactory) && fr.t.c(this.errorFactory, defined.errorFactory) && fr.t.c(this.fallbackFactory, defined.fallbackFactory) && fr.t.c(this.sizeResolver, defined.sizeResolver) && this.scale == defined.scale && this.precision == defined.precision;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final vv.k getFileSystem() {
            return this.fileSystem;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final tq.i getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        public int hashCode() {
            vv.k kVar = this.fileSystem;
            int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
            tq.i iVar = this.interceptorCoroutineContext;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            tq.i iVar2 = this.fetcherCoroutineContext;
            int iHashCode3 = (iHashCode2 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
            tq.i iVar3 = this.decoderCoroutineContext;
            int iHashCode4 = (iHashCode3 + (iVar3 == null ? 0 : iVar3.hashCode())) * 31;
            c cVar = this.memoryCachePolicy;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            c cVar2 = this.diskCachePolicy;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            c cVar3 = this.networkCachePolicy;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            er.l<ImageRequest, kc.n> lVar = this.placeholderFactory;
            int iHashCode8 = (iHashCode7 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            er.l<ImageRequest, kc.n> lVar2 = this.errorFactory;
            int iHashCode9 = (iHashCode8 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
            er.l<ImageRequest, kc.n> lVar3 = this.fallbackFactory;
            int iHashCode10 = (iHashCode9 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
            ad.i iVar4 = this.sizeResolver;
            int iHashCode11 = (iHashCode10 + (iVar4 == null ? 0 : iVar4.hashCode())) * 31;
            ad.f fVar = this.scale;
            int iHashCode12 = (iHashCode11 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            ad.c cVar4 = this.precision;
            return iHashCode12 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        public final er.l<ImageRequest, kc.n> j() {
            return this.placeholderFactory;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final ad.c getPrecision() {
            return this.precision;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ad.f getScale() {
            return this.scale;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final ad.i getSizeResolver() {
            return this.sizeResolver;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ")";
        }
    }

    /* JADX INFO: renamed from: zc.f$d */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lzc/f$d;", "", "Lzc/f;", "request", "Loq/i0;", "b", "(Lzc/f;)V", "c", "Lzc/e;", "result", "d", "(Lzc/f;Lzc/e;)V", "Lzc/r;", "a", "(Lzc/f;Lzc/r;)V", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface d {
        default void a(ImageRequest request, SuccessResult result) {
        }

        default void b(ImageRequest request) {
        }

        default void c(ImageRequest request) {
        }

        default void d(ImageRequest request, ErrorResult result) {
        }
    }

    public /* synthetic */ ImageRequest(Context context, Object obj, bd.a aVar, d dVar, String str, Map map, String str2, vv.k kVar, oq.r rVar, oc.i.a aVar2, tq.i iVar, tq.i iVar2, tq.i iVar3, c cVar, c cVar2, c cVar3, uc.d.Key key, er.l lVar, er.l lVar2, er.l lVar3, ad.i iVar4, ad.f fVar, ad.c cVar4, Extras lVar4, Defined defined, Defaults defaults, fr.k kVar2) {
        this(context, obj, aVar, dVar, str, map, str2, kVar, rVar, aVar2, iVar, iVar2, iVar3, cVar, cVar2, cVar3, key, lVar, lVar2, lVar3, iVar4, fVar, cVar4, lVar4, defined, defaults);
    }

    public static /* synthetic */ a A(ImageRequest imageRequest, Context context, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.z(context);
    }

    public final kc.n B() {
        kc.n nVarB = this.placeholderFactory.b(this);
        return nVarB == null ? this.defaults.m().b(this) : nVarB;
    }

    public final kc.n a() {
        kc.n nVarB = this.errorFactory.b(this);
        return nVarB == null ? this.defaults.e().b(this) : nVarB;
    }

    public final kc.n b() {
        kc.n nVarB = this.fallbackFactory.b(this);
        return nVarB == null ? this.defaults.g().b(this) : nVarB;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final tq.i getDecoderCoroutineContext() {
        return this.decoderCoroutineContext;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) other;
        return fr.t.c(this.context, imageRequest.context) && fr.t.c(this.data, imageRequest.data) && fr.t.c(this.target, imageRequest.target) && fr.t.c(this.listener, imageRequest.listener) && fr.t.c(this.memoryCacheKey, imageRequest.memoryCacheKey) && fr.t.c(this.memoryCacheKeyExtras, imageRequest.memoryCacheKeyExtras) && fr.t.c(this.diskCacheKey, imageRequest.diskCacheKey) && fr.t.c(this.fileSystem, imageRequest.fileSystem) && fr.t.c(this.fetcherFactory, imageRequest.fetcherFactory) && fr.t.c(this.decoderFactory, imageRequest.decoderFactory) && fr.t.c(this.interceptorCoroutineContext, imageRequest.interceptorCoroutineContext) && fr.t.c(this.fetcherCoroutineContext, imageRequest.fetcherCoroutineContext) && fr.t.c(this.decoderCoroutineContext, imageRequest.decoderCoroutineContext) && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && fr.t.c(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && fr.t.c(this.placeholderFactory, imageRequest.placeholderFactory) && fr.t.c(this.errorFactory, imageRequest.errorFactory) && fr.t.c(this.fallbackFactory, imageRequest.fallbackFactory) && fr.t.c(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && this.precision == imageRequest.precision && fr.t.c(this.extras, imageRequest.extras) && fr.t.c(this.defined, imageRequest.defined) && fr.t.c(this.defaults, imageRequest.defaults);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final oc.i.a getDecoderFactory() {
        return this.decoderFactory;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Defaults getDefaults() {
        return this.defaults;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Defined getDefined() {
        return this.defined;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        bd.a aVar = this.target;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.listener;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.memoryCacheKey;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.memoryCacheKeyExtras.hashCode()) * 31;
        String str2 = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.fileSystem.hashCode()) * 31;
        oq.r<qc.j.a<?>, mr.c<?>> rVar = this.fetcherFactory;
        int iHashCode6 = (iHashCode5 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        oc.i.a aVar2 = this.decoderFactory;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31) + this.interceptorCoroutineContext.hashCode()) * 31) + this.fetcherCoroutineContext.hashCode()) * 31) + this.decoderCoroutineContext.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31;
        uc.d.Key key = this.placeholderMemoryCacheKey;
        return ((((((((((((((((((iHashCode7 + (key != null ? key.hashCode() : 0)) * 31) + this.placeholderFactory.hashCode()) * 31) + this.errorFactory.hashCode()) * 31) + this.fallbackFactory.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.extras.hashCode()) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Extras getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final tq.i getFetcherCoroutineContext() {
        return this.fetcherCoroutineContext;
    }

    public final oq.r<qc.j.a<?>, mr.c<?>> m() {
        return this.fetcherFactory;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final vv.k getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final tq.i getInterceptorCoroutineContext() {
        return this.interceptorCoroutineContext;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final d getListener() {
        return this.listener;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final Map<String, String> r() {
        return this.memoryCacheKeyExtras;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final c getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final c getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public String toString() {
        return "ImageRequest(context=" + this.context + ", data=" + this.data + ", target=" + this.target + ", listener=" + this.listener + ", memoryCacheKey=" + this.memoryCacheKey + ", memoryCacheKeyExtras=" + this.memoryCacheKeyExtras + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", fetcherFactory=" + this.fetcherFactory + ", decoderFactory=" + this.decoderFactory + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderMemoryCacheKey=" + this.placeholderMemoryCacheKey + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ", defined=" + this.defined + ", defaults=" + this.defaults + ")";
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final uc.d.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final ad.c getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final ad.f getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final ad.i getSizeResolver() {
        return this.sizeResolver;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final bd.a getTarget() {
        return this.target;
    }

    public final a z(Context context) {
        return new a(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImageRequest(Context context, Object obj, bd.a aVar, d dVar, String str, Map<String, String> map, String str2, vv.k kVar, oq.r<? extends qc.j.a<?>, ? extends mr.c<?>> rVar, oc.i.a aVar2, tq.i iVar, tq.i iVar2, tq.i iVar3, c cVar, c cVar2, c cVar3, uc.d.Key key, er.l<? super ImageRequest, ? extends kc.n> lVar, er.l<? super ImageRequest, ? extends kc.n> lVar2, er.l<? super ImageRequest, ? extends kc.n> lVar3, ad.i iVar4, ad.f fVar, ad.c cVar4, Extras lVar4, Defined defined, Defaults defaults) {
        this.context = context;
        this.data = obj;
        this.target = aVar;
        this.listener = dVar;
        this.memoryCacheKey = str;
        this.memoryCacheKeyExtras = map;
        this.diskCacheKey = str2;
        this.fileSystem = kVar;
        this.fetcherFactory = rVar;
        this.decoderFactory = aVar2;
        this.interceptorCoroutineContext = iVar;
        this.fetcherCoroutineContext = iVar2;
        this.decoderCoroutineContext = iVar3;
        this.memoryCachePolicy = cVar;
        this.diskCachePolicy = cVar2;
        this.networkCachePolicy = cVar3;
        this.placeholderMemoryCacheKey = key;
        this.placeholderFactory = lVar;
        this.errorFactory = lVar2;
        this.fallbackFactory = lVar3;
        this.sizeResolver = iVar4;
        this.scale = fVar;
        this.precision = cVar4;
        this.extras = lVar4;
        this.defined = defined;
        this.defaults = defaults;
    }

    /* JADX INFO: renamed from: zc.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u0000 @2\u00020\u0001:\u0001\u001cB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJÃ\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b1\u00105R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b0\u00109\u001a\u0004\b:\u0010;R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b2\u0010;R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b7\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b:\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\b6\u0010F¨\u0006G"}, d2 = {"Lzc/f$b;", "", "Lvv/k;", "fileSystem", "Ltq/i;", "interceptorCoroutineContext", "fetcherCoroutineContext", "decoderCoroutineContext", "Lzc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkotlin/Function1;", "Lzc/f;", "Lkc/n;", "placeholderFactory", "errorFactory", "fallbackFactory", "Lad/i;", "sizeResolver", "Lad/f;", "scale", "Lad/c;", "precision", "Lkc/l;", "extras", "<init>", "(Lvv/k;Ltq/i;Ltq/i;Ltq/i;Lzc/c;Lzc/c;Lzc/c;Ler/l;Ler/l;Ler/l;Lad/i;Lad/f;Lad/c;Lkc/l;)V", "a", "(Lvv/k;Ltq/i;Ltq/i;Ltq/i;Lzc/c;Lzc/c;Lzc/c;Ler/l;Ler/l;Ler/l;Lad/i;Lad/f;Lad/c;Lkc/l;)Lzc/f$b;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lvv/k;", "i", "()Lvv/k;", "b", "Ltq/i;", "j", "()Ltq/i;", "c", "h", "d", "e", "Lzc/c;", "k", "()Lzc/c;", "f", "g", "l", "Ler/l;", "m", "()Ler/l;", "Lad/i;", "p", "()Lad/i;", "Lad/f;", "o", "()Lad/f;", "Lad/c;", "n", "()Lad/c;", "Lkc/l;", "()Lkc/l;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Defaults {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Defaults f234139p = new Defaults(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vv.k fileSystem;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq.i interceptorCoroutineContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq.i fetcherCoroutineContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq.i decoderCoroutineContext;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c memoryCachePolicy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c diskCachePolicy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final c networkCachePolicy;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ImageRequest, kc.n> placeholderFactory;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ImageRequest, kc.n> errorFactory;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ImageRequest, kc.n> fallbackFactory;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ad.i sizeResolver;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ad.f scale;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final ad.c precision;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Extras extras;

        /* JADX WARN: Multi-variable type inference failed */
        public Defaults(vv.k kVar, tq.i iVar, tq.i iVar2, tq.i iVar3, c cVar, c cVar2, c cVar3, er.l<? super ImageRequest, ? extends kc.n> lVar, er.l<? super ImageRequest, ? extends kc.n> lVar2, er.l<? super ImageRequest, ? extends kc.n> lVar3, ad.i iVar4, ad.f fVar, ad.c cVar4, Extras lVar4) {
            this.fileSystem = kVar;
            this.interceptorCoroutineContext = iVar;
            this.fetcherCoroutineContext = iVar2;
            this.decoderCoroutineContext = iVar3;
            this.memoryCachePolicy = cVar;
            this.diskCachePolicy = cVar2;
            this.networkCachePolicy = cVar3;
            this.placeholderFactory = lVar;
            this.errorFactory = lVar2;
            this.fallbackFactory = lVar3;
            this.sizeResolver = iVar4;
            this.scale = fVar;
            this.precision = cVar4;
            this.extras = lVar4;
        }

        public final Defaults a(vv.k fileSystem, tq.i interceptorCoroutineContext, tq.i fetcherCoroutineContext, tq.i decoderCoroutineContext, c memoryCachePolicy, c diskCachePolicy, c networkCachePolicy, er.l<? super ImageRequest, ? extends kc.n> placeholderFactory, er.l<? super ImageRequest, ? extends kc.n> errorFactory, er.l<? super ImageRequest, ? extends kc.n> fallbackFactory, ad.i sizeResolver, ad.f scale, ad.c precision, Extras extras) {
            return new Defaults(fileSystem, interceptorCoroutineContext, fetcherCoroutineContext, decoderCoroutineContext, memoryCachePolicy, diskCachePolicy, networkCachePolicy, placeholderFactory, errorFactory, fallbackFactory, sizeResolver, scale, precision, extras);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final tq.i getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final c getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        public final er.l<ImageRequest, kc.n> e() {
            return this.errorFactory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) other;
            return fr.t.c(this.fileSystem, defaults.fileSystem) && fr.t.c(this.interceptorCoroutineContext, defaults.interceptorCoroutineContext) && fr.t.c(this.fetcherCoroutineContext, defaults.fetcherCoroutineContext) && fr.t.c(this.decoderCoroutineContext, defaults.decoderCoroutineContext) && this.memoryCachePolicy == defaults.memoryCachePolicy && this.diskCachePolicy == defaults.diskCachePolicy && this.networkCachePolicy == defaults.networkCachePolicy && fr.t.c(this.placeholderFactory, defaults.placeholderFactory) && fr.t.c(this.errorFactory, defaults.errorFactory) && fr.t.c(this.fallbackFactory, defaults.fallbackFactory) && fr.t.c(this.sizeResolver, defaults.sizeResolver) && this.scale == defaults.scale && this.precision == defaults.precision && fr.t.c(this.extras, defaults.extras);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Extras getExtras() {
            return this.extras;
        }

        public final er.l<ImageRequest, kc.n> g() {
            return this.fallbackFactory;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final tq.i getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.fileSystem.hashCode() * 31) + this.interceptorCoroutineContext.hashCode()) * 31) + this.fetcherCoroutineContext.hashCode()) * 31) + this.decoderCoroutineContext.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.placeholderFactory.hashCode()) * 31) + this.errorFactory.hashCode()) * 31) + this.fallbackFactory.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.extras.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final vv.k getFileSystem() {
            return this.fileSystem;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final tq.i getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final c getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final c getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        public final er.l<ImageRequest, kc.n> m() {
            return this.placeholderFactory;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final ad.c getPrecision() {
            return this.precision;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final ad.f getScale() {
            return this.scale;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final ad.i getSizeResolver() {
            return this.sizeResolver;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ")";
        }

        public /* synthetic */ Defaults(vv.k kVar, tq.i iVar, tq.i iVar2, tq.i iVar3, c cVar, c cVar2, c cVar3, er.l lVar, er.l lVar2, er.l lVar3, ad.i iVar4, ad.f fVar, ad.c cVar4, Extras lVar4, int i15, fr.k kVar2) {
            this((i15 & 1) != 0 ? ed.m.a() : kVar, (i15 & 2) != 0 ? tq.j.f191408a : iVar, (i15 & 4) != 0 ? ed.e.a() : iVar2, (i15 & 8) != 0 ? ed.e.a() : iVar3, (i15 & 16) != 0 ? c.ENABLED : cVar, (i15 & 32) != 0 ? c.ENABLED : cVar2, (i15 & 64) != 0 ? c.ENABLED : cVar3, (i15 & 128) != 0 ? f0.k() : lVar, (i15 & 256) != 0 ? f0.k() : lVar2, (i15 & 512) != 0 ? f0.k() : lVar3, (i15 & 1024) != 0 ? ad.i.f5431b : iVar4, (i15 & 2048) != 0 ? ad.f.FIT : fVar, (i15 & PKIFailureInfo.certConfirmed) != 0 ? ad.c.EXACT : cVar4, (i15 & PKIFailureInfo.certRevoked) != 0 ? Extras.f109832c : lVar4);
        }
    }

    /* JADX INFO: renamed from: zc.f$a */
    @Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010&R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0016\u00103\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0018\u00105\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R,\u0010?\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030;\u0012\b\u0012\u0006\u0012\u0002\b\u00030<\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010P\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR&\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010X\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR&\u0010]\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010X\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR&\u0010_\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010X\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010ZR\u0018\u0010b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010(¨\u0006i"}, d2 = {"Lzc/f$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lzc/f;", "request", "(Lzc/f;Landroid/content/Context;)V", "data", "c", "(Ljava/lang/Object;)Lzc/f$a;", "Lbd/a;", "target", "h", "(Lbd/a;)Lzc/f$a;", "Ltq/i;", "b", "(Ltq/i;)Lzc/f$a;", "Lad/i;", "resolver", "g", "(Lad/i;)Lzc/f$a;", "Lad/f;", "scale", "f", "(Lad/f;)Lzc/f$a;", "Lad/c;", "precision", "e", "(Lad/c;)Lzc/f$a;", "Lzc/f$b;", "defaults", "d", "(Lzc/f$b;)Lzc/f$a;", "a", "()Lzc/f;", "Landroid/content/Context;", "Lzc/f$b;", "Ljava/lang/Object;", "Lbd/a;", "Lzc/f$d;", "Lzc/f$d;", "listener", "", "Ljava/lang/String;", "memoryCacheKey", "", "Z", "memoryCacheKeyExtrasAreMutable", "lazyMemoryCacheKeyExtras", "i", "diskCacheKey", "Lvv/k;", "j", "Lvv/k;", "fileSystem", "Loq/r;", "Lqc/j$a;", "Lmr/c;", "k", "Loq/r;", "fetcherFactory", "Loc/i$a;", "l", "Loc/i$a;", "decoderFactory", "m", "Ltq/i;", "interceptorCoroutineContext", "n", "fetcherCoroutineContext", "o", "decoderCoroutineContext", "Lzc/c;", "p", "Lzc/c;", "memoryCachePolicy", "q", "diskCachePolicy", "r", "networkCachePolicy", "Luc/d$b;", "s", "Luc/d$b;", "placeholderMemoryCacheKey", "Lkotlin/Function1;", "Lkc/n;", "t", "Ler/l;", "placeholderFactory", "u", "errorFactory", "v", "fallbackFactory", "w", "Lad/i;", "sizeResolver", "x", "Lad/f;", "y", "Lad/c;", "z", "lazyExtras", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Defaults defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Object data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private bd.a target;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private d listener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private String memoryCacheKey;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean memoryCacheKeyExtrasAreMutable;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private Object lazyMemoryCacheKeyExtras;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private String diskCacheKey;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private vv.k fileSystem;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private oq.r<? extends qc.j.a<?>, ? extends mr.c<?>> fetcherFactory;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private oc.i.a decoderFactory;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private tq.i interceptorCoroutineContext;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private tq.i fetcherCoroutineContext;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private tq.i decoderCoroutineContext;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private c memoryCachePolicy;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private c diskCachePolicy;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private c networkCachePolicy;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private uc.d.Key placeholderMemoryCacheKey;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private er.l<? super ImageRequest, ? extends kc.n> placeholderFactory;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private er.l<? super ImageRequest, ? extends kc.n> errorFactory;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private er.l<? super ImageRequest, ? extends kc.n> fallbackFactory;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private ad.i sizeResolver;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private ad.f scale;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private ad.c precision;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private Object lazyExtras;

        public a(Context context) {
            this.context = context;
            this.defaults = Defaults.f234139p;
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.lazyMemoryCacheKeyExtras = v0.i();
            this.diskCacheKey = null;
            this.fileSystem = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.interceptorCoroutineContext = null;
            this.fetcherCoroutineContext = null;
            this.decoderCoroutineContext = null;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderFactory = f0.k();
            this.errorFactory = f0.k();
            this.fallbackFactory = f0.k();
            this.sizeResolver = null;
            this.scale = null;
            this.precision = null;
            this.lazyExtras = Extras.f109832c;
        }

        public final ImageRequest a() {
            Map mapD;
            Extras lVarA;
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = k.f234180a;
            }
            Object obj2 = obj;
            bd.a aVar = this.target;
            d dVar = this.listener;
            String str = this.memoryCacheKey;
            Object obj3 = this.lazyMemoryCacheKeyExtras;
            if (fr.t.c(obj3, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                mapD = ed.c.d(w0.d(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapD = (Map) obj3;
            }
            Map map = mapD;
            String str2 = this.diskCacheKey;
            vv.k fileSystem = this.fileSystem;
            if (fileSystem == null) {
                fileSystem = this.defaults.getFileSystem();
            }
            vv.k kVar = fileSystem;
            oq.r<? extends qc.j.a<?>, ? extends mr.c<?>> rVar = this.fetcherFactory;
            oc.i.a aVar2 = this.decoderFactory;
            c memoryCachePolicy = this.memoryCachePolicy;
            if (memoryCachePolicy == null) {
                memoryCachePolicy = this.defaults.getMemoryCachePolicy();
            }
            c cVar = memoryCachePolicy;
            c diskCachePolicy = this.diskCachePolicy;
            if (diskCachePolicy == null) {
                diskCachePolicy = this.defaults.getDiskCachePolicy();
            }
            c cVar2 = diskCachePolicy;
            c networkCachePolicy = this.networkCachePolicy;
            if (networkCachePolicy == null) {
                networkCachePolicy = this.defaults.getNetworkCachePolicy();
            }
            c cVar3 = networkCachePolicy;
            tq.i interceptorCoroutineContext = this.interceptorCoroutineContext;
            if (interceptorCoroutineContext == null) {
                interceptorCoroutineContext = this.defaults.getInterceptorCoroutineContext();
            }
            tq.i iVar = interceptorCoroutineContext;
            tq.i fetcherCoroutineContext = this.fetcherCoroutineContext;
            if (fetcherCoroutineContext == null) {
                fetcherCoroutineContext = this.defaults.getFetcherCoroutineContext();
            }
            tq.i iVar2 = fetcherCoroutineContext;
            tq.i decoderCoroutineContext = this.decoderCoroutineContext;
            if (decoderCoroutineContext == null) {
                decoderCoroutineContext = this.defaults.getDecoderCoroutineContext();
            }
            tq.i iVar3 = decoderCoroutineContext;
            uc.d.Key key = this.placeholderMemoryCacheKey;
            er.l lVarM = this.placeholderFactory;
            if (lVarM == null) {
                lVarM = this.defaults.m();
            }
            er.l lVar = lVarM;
            er.l lVarE = this.errorFactory;
            if (lVarE == null) {
                lVarE = this.defaults.e();
            }
            er.l lVar2 = lVarE;
            er.l lVarG = this.fallbackFactory;
            if (lVarG == null) {
                lVarG = this.defaults.g();
            }
            er.l lVar3 = lVarG;
            ad.i sizeResolver = this.sizeResolver;
            if (sizeResolver == null) {
                sizeResolver = this.defaults.getSizeResolver();
            }
            ad.i iVar4 = sizeResolver;
            ad.f scale = this.scale;
            if (scale == null) {
                scale = this.defaults.getScale();
            }
            ad.f fVar = scale;
            ad.c precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            ad.c cVar4 = precision;
            Object obj4 = this.lazyExtras;
            if (obj4 instanceof Extras.a) {
                lVarA = ((Extras.a) obj4).a();
            } else {
                if (!(obj4 instanceof Extras)) {
                    throw new AssertionError();
                }
                lVarA = (Extras) obj4;
            }
            return new ImageRequest(context, obj2, aVar, dVar, str, map, str2, kVar, rVar, aVar2, iVar, iVar2, iVar3, cVar, cVar2, cVar3, key, lVar, lVar2, lVar3, iVar4, fVar, cVar4, lVarA, new Defined(this.fileSystem, this.interceptorCoroutineContext, this.fetcherCoroutineContext, this.decoderCoroutineContext, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy, this.placeholderFactory, this.errorFactory, this.fallbackFactory, this.sizeResolver, this.scale, this.precision), this.defaults, null);
        }

        public final a b(tq.i context) {
            this.interceptorCoroutineContext = context;
            this.fetcherCoroutineContext = context;
            this.decoderCoroutineContext = context;
            return this;
        }

        public final a c(Object data) {
            this.data = data;
            return this;
        }

        public final a d(Defaults defaults) {
            this.defaults = defaults;
            return this;
        }

        public final a e(ad.c precision) {
            this.precision = precision;
            return this;
        }

        public final a f(ad.f scale) {
            this.scale = scale;
            return this;
        }

        public final a g(ad.i resolver) {
            this.sizeResolver = resolver;
            return this;
        }

        public final a h(bd.a target) {
            this.target = target;
            return this;
        }

        public a(ImageRequest imageRequest, Context context) {
            this.context = context;
            this.defaults = imageRequest.getDefaults();
            this.data = imageRequest.getData();
            this.target = imageRequest.getTarget();
            this.listener = imageRequest.getListener();
            this.memoryCacheKey = imageRequest.getMemoryCacheKey();
            this.lazyMemoryCacheKeyExtras = imageRequest.r();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.fileSystem = imageRequest.getDefined().getFileSystem();
            this.fetcherFactory = imageRequest.m();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.interceptorCoroutineContext = imageRequest.getDefined().getInterceptorCoroutineContext();
            this.fetcherCoroutineContext = imageRequest.getDefined().getFetcherCoroutineContext();
            this.decoderCoroutineContext = imageRequest.getDefined().getDecoderCoroutineContext();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderFactory = imageRequest.getDefined().j();
            this.errorFactory = imageRequest.getDefined().c();
            this.fallbackFactory = imageRequest.getDefined().d();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            this.precision = imageRequest.getDefined().getPrecision();
            this.lazyExtras = imageRequest.getExtras();
        }
    }
}
