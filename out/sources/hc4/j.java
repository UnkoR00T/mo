package hc4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lhc4/j;", "Lcc4/a;", "Lgy/a;", "permissionManager", "Lb00/o;", "photoTakerManager", "Laz/e;", "fileFactory", "Laz/d;", "fileConverter", "Lb00/c;", "imageConverter", "Lmx/c;", "labelProvider", "Lqx/a;", "imagePropertiesProvider", "Lxx/a;", "exifDataManager", "<init>", "(Lgy/a;Lb00/o;Laz/e;Laz/d;Lb00/c;Lmx/c;Lqx/a;Lxx/a;)V", "Lcc4/a$a;", "params", "Ldx/i;", "Ldx/b;", "Lcc4/a$b;", "d", "(Lcc4/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgy/a;", "b", "Lb00/o;", "c", "Laz/e;", "Laz/d;", "e", "Lb00/c;", "f", "Lmx/c;", "g", "Lqx/a;", "h", "Lxx/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements cc4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b00.o photoTakerManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final az.e fileFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final az.d fileConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xx.a exifDataManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83454h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f83455j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f83456k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f83457l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f83458m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83459n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f83460p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83461q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f83462r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f83463s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f83464t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f83466w;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83464t = obj;
            this.f83466w |= PKIFailureInfo.systemUnavail;
            return j.this.c(null, this);
        }
    }

    public j(gy.a aVar, b00.o oVar, az.e eVar, az.d dVar, b00.c cVar, mx.c cVar2, qx.a aVar2, xx.a aVar3) {
        this.permissionManager = aVar;
        this.photoTakerManager = oVar;
        this.fileFactory = eVar;
        this.fileConverter = dVar;
        this.imageConverter = cVar;
        this.labelProvider = cVar2;
        this.imagePropertiesProvider = aVar2;
        this.exifDataManager = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0361  */
    /* JADX WARN: Code duplicated, block: B:103:0x0367  */
    /* JADX WARN: Code duplicated, block: B:105:0x0389  */
    /* JADX WARN: Code duplicated, block: B:16:0x00c6 A[PHI: r1 r4 r5 r6 r7
      0x00c6: PHI (r1v26 java.lang.Object) = (r1v21 java.lang.Object), (r1v1 java.lang.Object) binds: [B:55:0x01f2, B:15:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r4v25 int) = (r4v22 int), (r4v29 int) binds: [B:55:0x01f2, B:15:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r5v6 java.util.Map<java.lang.String, java.lang.String>) = (r5v4 java.util.Map<java.lang.String, java.lang.String>), (r5v10 java.util.Map<java.lang.String, java.lang.String>) binds: [B:55:0x01f2, B:15:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r6v22 java.lang.String) = (r6v16 java.lang.String), (r6v33 java.lang.String) binds: [B:55:0x01f2, B:15:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r7v14 cc4.a$a) = (r7v10 cc4.a$a), (r7v18 cc4.a$a) binds: [B:55:0x01f2, B:15:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0120  */
    /* JADX WARN: Code duplicated, block: B:30:0x0150  */
    /* JADX WARN: Code duplicated, block: B:34:0x0174  */
    /* JADX WARN: Code duplicated, block: B:37:0x0180  */
    /* JADX WARN: Code duplicated, block: B:39:0x0186  */
    /* JADX WARN: Code duplicated, block: B:54:0x01dd A[PHI: r4 r5 r6 r7
      0x01dd: PHI (r4v22 int) = (r4v17 int), (r4v23 int), (r4v23 int) binds: [B:38:0x0184, B:43:0x01a4, B:53:0x01d9] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r5v4 java.util.Map<java.lang.String, java.lang.String>) = 
      (r5v0 java.util.Map<java.lang.String, java.lang.String>)
      (r5v0 java.util.Map<java.lang.String, java.lang.String>)
      (r5v5 java.util.Map<java.lang.String, java.lang.String>)
     binds: [B:38:0x0184, B:43:0x01a4, B:53:0x01d9] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r6v16 java.lang.String) = (r6v11 java.lang.String), (r6v17 java.lang.String), (r6v17 java.lang.String) binds: [B:38:0x0184, B:43:0x01a4, B:53:0x01d9] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r7v10 cc4.a$a) = (r7v6 cc4.a$a), (r7v11 cc4.a$a), (r7v11 cc4.a$a) binds: [B:38:0x0184, B:43:0x01a4, B:53:0x01d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0228  */
    /* JADX WARN: Code duplicated, block: B:63:0x022c  */
    /* JADX WARN: Code duplicated, block: B:65:0x023f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0244  */
    /* JADX WARN: Code duplicated, block: B:70:0x0271  */
    /* JADX WARN: Code duplicated, block: B:73:0x0280 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0281  */
    /* JADX WARN: Code duplicated, block: B:76:0x0285  */
    /* JADX WARN: Code duplicated, block: B:78:0x0296  */
    /* JADX WARN: Code duplicated, block: B:79:0x029b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:95:0x033c  */
    /* JADX WARN: Code duplicated, block: B:99:0x035b  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019e, code lost:
    
        if (r1 == r3) goto L91;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0120, please report this as an issue */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(cc4.a.Params r19, tq.e<? super dx.i<? extends dx.b, cc4.a.Result>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc4.j.c(cc4.a$a, tq.e):java.lang.Object");
    }
}
