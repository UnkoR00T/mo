package zc;

import ad.Size;
import android.content.Context;
import kc.Extras;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zc.n, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u00002\u00020\u0001Bo\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010\u0017\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b,\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b0\u00108R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b2\u0010;¨\u0006<"}, d2 = {"Lzc/n;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lad/g;", "size", "Lad/f;", "scale", "Lad/c;", "precision", "", "diskCacheKey", "Lvv/k;", "fileSystem", "Lzc/c;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "Lkc/l;", "extras", "<init>", "(Landroid/content/Context;Lad/g;Lad/f;Lad/c;Ljava/lang/String;Lvv/k;Lzc/c;Lzc/c;Lzc/c;Lkc/l;)V", "a", "(Landroid/content/Context;Lad/g;Lad/f;Lad/c;Ljava/lang/String;Lvv/k;Lzc/c;Lzc/c;Lzc/c;Lkc/l;)Lzc/n;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Lad/g;", "k", "()Lad/g;", "Lad/f;", "j", "()Lad/f;", "d", "Lad/c;", "i", "()Lad/c;", "e", "Ljava/lang/String;", "f", "Lvv/k;", "g", "()Lvv/k;", "Lzc/c;", "getMemoryCachePolicy", "()Lzc/c;", "h", "Lkc/l;", "()Lkc/l;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Options {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Size size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ad.f scale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ad.c precision;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String diskCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final vv.k fileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final c memoryCachePolicy;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c diskCachePolicy;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final c networkCachePolicy;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Extras extras;

    public Options(Context context, Size size, ad.f fVar, ad.c cVar, String str, vv.k kVar, c cVar2, c cVar3, c cVar4, Extras lVar) {
        this.context = context;
        this.size = size;
        this.scale = fVar;
        this.precision = cVar;
        this.diskCacheKey = str;
        this.fileSystem = kVar;
        this.memoryCachePolicy = cVar2;
        this.diskCachePolicy = cVar3;
        this.networkCachePolicy = cVar4;
        this.extras = lVar;
    }

    public static /* synthetic */ Options b(Options options, Context context, Size size, ad.f fVar, ad.c cVar, String str, vv.k kVar, c cVar2, c cVar3, c cVar4, Extras lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            context = options.context;
        }
        if ((i15 & 2) != 0) {
            size = options.size;
        }
        if ((i15 & 4) != 0) {
            fVar = options.scale;
        }
        if ((i15 & 8) != 0) {
            cVar = options.precision;
        }
        if ((i15 & 16) != 0) {
            str = options.diskCacheKey;
        }
        if ((i15 & 32) != 0) {
            kVar = options.fileSystem;
        }
        if ((i15 & 64) != 0) {
            cVar2 = options.memoryCachePolicy;
        }
        if ((i15 & 128) != 0) {
            cVar3 = options.diskCachePolicy;
        }
        if ((i15 & 256) != 0) {
            cVar4 = options.networkCachePolicy;
        }
        if ((i15 & 512) != 0) {
            lVar = options.extras;
        }
        c cVar5 = cVar4;
        Extras lVar2 = lVar;
        c cVar6 = cVar2;
        c cVar7 = cVar3;
        String str2 = str;
        vv.k kVar2 = kVar;
        return options.a(context, size, fVar, cVar, str2, kVar2, cVar6, cVar7, cVar5, lVar2);
    }

    public final Options a(Context context, Size size, ad.f scale, ad.c precision, String diskCacheKey, vv.k fileSystem, c memoryCachePolicy, c diskCachePolicy, c networkCachePolicy, Extras extras) {
        return new Options(context, size, scale, precision, diskCacheKey, fileSystem, memoryCachePolicy, diskCachePolicy, networkCachePolicy, extras);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Options)) {
            return false;
        }
        Options options = (Options) other;
        return fr.t.c(this.context, options.context) && fr.t.c(this.size, options.size) && this.scale == options.scale && this.precision == options.precision && fr.t.c(this.diskCacheKey, options.diskCacheKey) && fr.t.c(this.fileSystem, options.fileSystem) && this.memoryCachePolicy == options.memoryCachePolicy && this.diskCachePolicy == options.diskCachePolicy && this.networkCachePolicy == options.networkCachePolicy && fr.t.c(this.extras, options.extras);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Extras getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final vv.k getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public int hashCode() {
        int iHashCode = ((((((this.context.hashCode() * 31) + this.size.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.precision.hashCode()) * 31;
        String str = this.diskCacheKey;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fileSystem.hashCode()) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.extras.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ad.c getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ad.f getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    public String toString() {
        return "Options(context=" + this.context + ", size=" + this.size + ", scale=" + this.scale + ", precision=" + this.precision + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", extras=" + this.extras + ")";
    }
}
