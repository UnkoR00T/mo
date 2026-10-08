package ly0;

import fr.t;
import kh0.m;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lly0/a;", "", "Lly0/a$a;", "Loq/i0;", "Llh0/a;", "addFavouritePointUC", "Llh0/g;", "getFavoritePointsContainerUC", "Lmx/c;", "labelProvider", "<init>", "(Llh0/a;Llh0/g;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lly0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Llh0/a;", "b", "Llh0/g;", "c", "Lmx/c;", "Ldx/b$c;", "Ldx/b$c;", "saveFavouritePointLimitReachedError", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lh0.a addFavouritePointUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lh0.g getFavoritePointsContainerUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business saveFavouritePointLimitReachedError;

    /* JADX INFO: renamed from: ly0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lly0/a$a;", "Lgz/b$a;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        public Params(String str) {
            this.id = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.id, ((Params) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "Params(id=" + this.id + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121369f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121370g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121371h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121372j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f121373k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f121375m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121373k = obj;
            this.f121375m |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(lh0.a aVar, lh0.g gVar, mx.c cVar) {
        this.addFavouritePointUC = aVar;
        this.getFavoritePointsContainerUC = gVar;
        this.labelProvider = cVar;
        m mVar = m.SAVE_FAVOURITE_POINT_LIMIT_REACHED_ERROR;
        Label.Companion companion = Label.INSTANCE;
        this.saveFavouritePointLimitReachedError = new dx.b.Business(mVar, null, companion.c(), cVar.c(zx0.b.f238271x), null, companion.c(), companion.c(), 18, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(ly0.a.Params r10, tq.e<? super dx.i<? extends dx.b, oq.i0>> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ly0.a.b
            if (r0 == 0) goto L13
            r0 = r11
            ly0.a$b r0 = (ly0.a.b) r0
            int r1 = r0.f121375m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121375m = r1
            goto L18
        L13:
            ly0.a$b r0 = new ly0.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f121373k
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f121375m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r10 = r0.f121369f
            kh0.h r10 = (kh0.BEFavoritePointsContainer) r10
            java.lang.Object r10 = r0.f121368e
            dx.i r10 = (dx.i) r10
            java.lang.Object r10 = r0.f121367d
            ly0.a$a r10 = (ly0.a.Params) r10
            oq.u.b(r11)
            goto Lb3
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            java.lang.Object r10 = r0.f121367d
            ly0.a$a r10 = (ly0.a.Params) r10
            oq.u.b(r11)
            goto L5f
        L4a:
            oq.u.b(r11)
            lh0.g r11 = r9.getFavoritePointsContainerUC
            lh0.g$a r2 = new lh0.g$a
            r2.<init>(r5)
            r0.f121367d = r10
            r0.f121375m = r4
            java.lang.Object r11 = r11.c(r2, r0)
            if (r11 != r1) goto L5f
            goto Lb2
        L5f:
            dx.i r11 = (dx.i) r11
            boolean r2 = r11 instanceof dx.i.Left
            if (r2 == 0) goto L66
            return r11
        L66:
            boolean r2 = r11 instanceof dx.i.Right
            if (r2 == 0) goto Lb6
            dx.i$c r2 = new dx.i$c
            r2 = r11
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            kh0.h r2 = (kh0.BEFavoritePointsContainer) r2
            if (r2 == 0) goto L7c
            boolean r4 = r2.getFavouritePointsLimitReached()
            goto L7d
        L7c:
            r4 = r5
        L7d:
            if (r4 == 0) goto L87
            dx.i$b r10 = new dx.i$b
            dx.b$c r11 = r9.saveFavouritePointLimitReachedError
            r10.<init>(r11)
            return r10
        L87:
            lh0.a r6 = r9.addFavouritePointUC
            lh0.a$a r7 = new lh0.a$a
            java.lang.String r8 = r10.getId()
            r7.<init>(r8)
            java.lang.Object r10 = vq.j.a(r10)
            r0.f121367d = r10
            java.lang.Object r10 = vq.j.a(r11)
            r0.f121368e = r10
            java.lang.Object r10 = vq.j.a(r2)
            r0.f121369f = r10
            r0.f121370g = r5
            r0.f121371h = r5
            r0.f121372j = r4
            r0.f121375m = r3
            java.lang.Object r11 = r6.c(r7, r0)
            if (r11 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            dx.i r11 = (dx.i) r11
            return r11
        Lb6:
            oq.p r10 = new oq.p
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ly0.a.d(ly0.a$a, tq.e):java.lang.Object");
    }
}
