package hm2;

import a14.a0;
import ac4.n;
import er.l;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001f2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0002\u0017\u0015B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lhm2/k;", "Lgz/b;", "Lhm2/k$b;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "Leu0/a;", "beGetFileInputStreamFromUrlUC", "La14/a0;", "saveFilesOnDeviceUseCase", "Lac4/n;", "openUriIntentUseCase", "Laz/d;", "fileConverter", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Leu0/a;La14/a0;Lac4/n;Laz/d;Lac4/a;)V", "params", "h", "(Lhm2/k$b;Ltq/e;)Ljava/lang/Object;", "a", "Leu0/a;", "b", "La14/a0;", "c", "Lac4/n;", "d", "Laz/d;", "e", "Lac4/a;", "f", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b<Params, dx.i<? extends dx.b, ? extends i0>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f85760f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f85761g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final eu0.a beGetFileInputStreamFromUrlUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n openUriIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final az.d fileConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lhm2/k$a;", "", "<init>", "()V", "", "FILE_NAME", "Ljava/lang/String;", "FILE_EXTENSION", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: hm2.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lhm2/k$b;", "Lgz/b$a;", "", "privacyPolicyUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String privacyPolicyUrl;

        public Params(String str) {
            this.privacyPolicyUrl = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPrivacyPolicyUrl() {
            return this.privacyPolicyUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.privacyPolicyUrl, ((Params) other).privacyPolicyUrl);
        }

        public int hashCode() {
            return this.privacyPolicyUrl.hashCode();
        }

        public String toString() {
            return "Params(privacyPolicyUrl=" + this.privacyPolicyUrl + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f85769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f85770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85771h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f85772j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f85773k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Params f85775m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f85775m = params;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0083  */
        /* JADX WARN: Code duplicated, block: B:27:0x0087  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c9 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
        
            if (r10 == r0) goto L29;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: hm2.k.c.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return k.this.new c(this.f85775m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public k(eu0.a aVar, a0 a0Var, n nVar, az.d dVar, ac4.a aVar2) {
        this.beGetFileInputStreamFromUrlUC = aVar;
        this.saveFilesOnDeviceUseCase = a0Var;
        this.openUriIntentUseCase = nVar;
        this.fileConverter = dVar;
        this.callActionWithLoaderUseCase = aVar2;
    }

    public Object h(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(params, null), eVar, 1, null);
    }
}
