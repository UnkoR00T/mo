package u4;

import android.content.Context;
import android.graphics.Typeface;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lu4/b;", "Lu4/k0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lu4/k;", "font", "Landroid/graphics/Typeface;", "d", "(Lu4/k;)Landroid/graphics/Typeface;", "c", "(Lu4/k;Ltq/e;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object cacheKey;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f195187e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195189g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195187e = obj;
            this.f195189g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // u4.k0
    /* JADX INFO: renamed from: b, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u4.k0
    public Object c(k kVar, tq.e<? super Typeface> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f195189g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f195189g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f195187e;
        Object objE = uq.b.e();
        int i16 = aVar.f195189g;
        if (i16 == 0) {
            oq.u.b(objD);
            if (kVar instanceof u4.a) {
                ((u4.a) kVar).d();
                aVar.f195189g = 1;
                throw null;
            }
            if (!(kVar instanceof ResourceFont)) {
                throw new IllegalArgumentException("Unknown font type: " + kVar);
            }
            Context context = this.context;
            aVar.f195186d = kVar;
            aVar.f195189g = 2;
            objD = c.d((ResourceFont) kVar, context, aVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 == 1) {
                oq.u.b(objD);
                return objD;
            }
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (k) aVar.f195186d;
            oq.u.b(objD);
        }
        return r0.c((Typeface) objD, ((ResourceFont) kVar).getVariationSettings(), this.context);
    }

    @Override // u4.k0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface a(k font) {
        Object objB;
        Typeface typefaceC;
        if (font instanceof u4.a) {
            ((u4.a) font).d();
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        ResourceFont resourceFont = (ResourceFont) font;
        int loadingStrategy = resourceFont.getLoadingStrategy();
        w.Companion companion = w.INSTANCE;
        if (w.e(loadingStrategy, companion.b())) {
            typefaceC = c.c(resourceFont, this.context);
        } else {
            if (!w.e(loadingStrategy, companion.c())) {
                if (w.e(loadingStrategy, companion.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) w.g(resourceFont.getLoadingStrategy())));
            }
            try {
                oq.t.Companion companion2 = oq.t.INSTANCE;
                objB = oq.t.b(c.c((ResourceFont) font, this.context));
            } catch (Throwable th4) {
                oq.t.Companion companion3 = oq.t.INSTANCE;
                objB = oq.t.b(oq.u.a(th4));
            }
            typefaceC = (Typeface) (oq.t.f(objB) ? null : objB);
        }
        return r0.c(typefaceC, resourceFont.getVariationSettings(), this.context);
    }
}
