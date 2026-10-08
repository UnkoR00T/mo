package ae3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006 "}, d2 = {"Lae3/h;", "", "Lgz/b$a$a;", "Lsv0/m$a;", "Law0/b;", "beGetFirstPageUserCollisionsUC", "Lzd3/a;", "collisionStorageRepository", "Law0/n;", "beVerifyStatusStatementsUC", "Lae3/a;", "clearDraftNewCollisionDataUC", "Lvd3/a;", "vehicleCollisionContainersInteractor", "<init>", "(Law0/b;Lzd3/a;Law0/n;Lae3/a;Lvd3/a;)V", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Ltq/e;)Ljava/lang/Object;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Law0/b;", "b", "Lzd3/a;", "c", "Law0/n;", "d", "Lae3/a;", "Lvd3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final aw0.b beGetFirstPageUserCollisionsUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zd3.a collisionStorageRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final aw0.n beVerifyStatusStatementsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ae3.a clearDraftNewCollisionDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vd3.a vehicleCollisionContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int B;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f5749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f5751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f5752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5753h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f5754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f5755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5756l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5758n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f5759p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f5760q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f5761r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f5762s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f5763t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f5764v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f5765w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f5766x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f5767y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f5768z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5768z = obj;
            this.B |= PKIFailureInfo.systemUnavail;
            return h.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f5772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5773h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f5774j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5776l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5774j = obj;
            this.f5776l |= PKIFailureInfo.systemUnavail;
            return h.this.a(null, this);
        }
    }

    public h(aw0.b bVar, zd3.a aVar, aw0.n nVar, ae3.a aVar2, vd3.a aVar3) {
        this.beGetFirstPageUserCollisionsUC = bVar;
        this.collisionStorageRepository = aVar;
        this.beVerifyStatusStatementsUC = nVar;
        this.clearDraftNewCollisionDataUC = aVar2;
        this.vehicleCollisionContainersInteractor = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:77:0x0232 A[Catch: Exception -> 0x02a1, c -> 0x02a3, CancellationException -> 0x02a7, TRY_LEAVE, TryCatch #7 {c -> 0x02a3, CancellationException -> 0x02a7, Exception -> 0x02a1, blocks: (B:75:0x022c, B:77:0x0232), top: B:117:0x022c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0298  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x008a: MOVE (r9 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:18:0x008a */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0298 -> B:81:0x029c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(tq.e<? super dx.i<? extends dx.b, oq.i0>> r24) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae3.h.e(tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, sv0.m.First>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f5776l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f5776l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f5774j;
        Object objE = uq.b.e();
        int i16 = bVar.f5776l;
        if (i16 == 0) {
            oq.u.b(objC);
            aw0.b bVar2 = this.beGetFirstPageUserCollisionsUC;
            bVar.f5769d = vq.j.a(c1792a);
            bVar.f5776l = 1;
            objC = bVar2.c(c1792a, bVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dx.i iVar = (dx.i) bVar.f5770e;
            oq.u.b(objC);
            return iVar;
        }
        c1792a = (gz.b.a.C1792a) bVar.f5769d;
        oq.u.b(objC);
        dx.i iVar2 = (dx.i) objC;
        if (iVar2 instanceof dx.i.Right) {
            sv0.m.First first = (sv0.m.First) ((dx.i.Right) iVar2).b();
            bVar.f5769d = vq.j.a(c1792a);
            bVar.f5770e = iVar2;
            bVar.f5771f = vq.j.a(first);
            bVar.f5772g = 0;
            bVar.f5773h = 0;
            bVar.f5776l = 2;
            if (e(bVar) == objE) {
                return objE;
            }
        }
        return iVar2;
    }
}
