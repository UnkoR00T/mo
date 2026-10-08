package aa3;

import ac4.q;
import ez.e;
import fr.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import x93.d;
import z93.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Laa3/b;", "", "Laa3/b$b;", "", "Lx93/d;", "interactor", "Lac4/q;", "saveFilesOnDeviceUC", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "<init>", "(Lx93/d;Lac4/q;Lez/e;Lez/a;)V", "d", "()Ljava/lang/String;", "params", "Ldx/i;", "Ldx/b;", "e", "(Laa3/b$b;Ltq/e;)Ljava/lang/Object;", "a", "Lx93/d;", "getInteractor", "()Lx93/d;", "b", "Lac4/q;", "getSaveFilesOnDeviceUC", "()Lac4/q;", "c", "Lez/e;", "getDateFormatter", "()Lez/e;", "Lez/a;", "getCurrentTimeProvider", "()Lez/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f5160e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5161f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d interactor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q saveFilesOnDeviceUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laa3/b$a;", "", "<init>", "()V", "", "CONFIRMATION_FILE_NAME_PREFIX", "Ljava/lang/String;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: aa3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Laa3/b$b;", "Lgz/b$a;", "Lz93/s;", "tripUuid", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tripUuid;

        public /* synthetic */ Params(String str, k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTripUuid() {
            return this.tripUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && s.d(this.tripUuid, ((Params) other).tripUuid);
        }

        public int hashCode() {
            return s.e(this.tripUuid);
        }

        public String toString() {
            return "Params(tripUuid=" + ((Object) s.f(this.tripUuid)) + ')';
        }

        private Params(String str) {
            this.tripUuid = str;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f5170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5171h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f5172j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5174l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5172j = obj;
            this.f5174l |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, this);
        }
    }

    public b(d dVar, q qVar, e eVar, ez.a aVar) {
        this.interactor = dVar;
        this.saveFilesOnDeviceUC = qVar;
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar;
    }

    private final String d() {
        return this.dateFormatter.d(new fz.b.LocalDateTime(this.currentTimeProvider.i()), fz.c.FULL_TIME_WITHOUT_MS);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r10 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(aa3.b.Params r9, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof aa3.b.c
            if (r0 == 0) goto L13
            r0 = r10
            aa3.b$c r0 = (aa3.b.c) r0
            int r1 = r0.f5174l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5174l = r1
            goto L18
        L13:
            aa3.b$c r0 = new aa3.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5172j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f5174l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r9 = r0.f5169f
            java.io.InputStream r9 = (java.io.InputStream) r9
            java.lang.Object r9 = r0.f5168e
            dx.i r9 = (dx.i) r9
            java.lang.Object r9 = r0.f5167d
            aa3.b$b r9 = (aa3.b.Params) r9
            oq.u.b(r10)
            goto Lb7
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L41:
            java.lang.Object r9 = r0.f5167d
            aa3.b$b r9 = (aa3.b.Params) r9
            oq.u.b(r10)
            goto L61
        L49:
            oq.u.b(r10)
            x93.d r10 = r8.interactor
            java.lang.String r2 = r9.getTripUuid()
            java.lang.Object r5 = vq.j.a(r9)
            r0.f5167d = r5
            r0.f5174l = r4
            java.lang.Object r10 = r10.f(r2, r0)
            if (r10 != r1) goto L61
            goto Lb6
        L61:
            dx.i r10 = (dx.i) r10
            boolean r2 = r10 instanceof dx.i.Left
            if (r2 == 0) goto L68
            return r10
        L68:
            boolean r2 = r10 instanceof dx.i.Right
            if (r2 == 0) goto Lba
            r2 = r10
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            java.io.InputStream r2 = (java.io.InputStream) r2
            ac4.q r4 = r8.saveFilesOnDeviceUC
            ac4.q$a r5 = new ac4.q$a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "potwierdzenie_"
            r6.append(r7)
            java.lang.String r7 = r8.d()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            wx.d$a r7 = wx.d.INSTANCE
            java.lang.String r7 = r7.J()
            r5.<init>(r2, r6, r7)
            java.lang.Object r9 = vq.j.a(r9)
            r0.f5167d = r9
            java.lang.Object r9 = vq.j.a(r10)
            r0.f5168e = r9
            java.lang.Object r9 = vq.j.a(r2)
            r0.f5169f = r9
            r9 = 0
            r0.f5170g = r9
            r0.f5171h = r9
            r0.f5174l = r3
            java.lang.Object r10 = r4.c(r5, r0)
            if (r10 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            dx.i r10 = (dx.i) r10
            return r10
        Lba:
            oq.p r9 = new oq.p
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: aa3.b.e(aa3.b$b, tq.e):java.lang.Object");
    }
}
