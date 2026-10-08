package wc3;

import dx.j;
import fr.t;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uc3.PassportsData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0014B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lwc3/i;", "", "Lgz/b$a$a;", "Lwc3/i$b;", "Lvc3/a;", "passportsStorageRepository", "Lwc3/a;", "fetchAndSavePassportsUC", "Ltc3/b;", "userDataDocumentsInteractor", "Lez/b;", "dateCalculator", "<init>", "(Lvc3/a;Lwc3/a;Ltc3/b;Lez/b;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lvc3/a;", "b", "Lwc3/a;", "c", "Ltc3/b;", "d", "Lez/b;", "e", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f212143f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f212144g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vc3.a passportsStorageRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a fetchAndSavePassportsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tc3.b userDataDocumentsInteractor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwc3/i$b;", "", "b", "a", "Lwc3/i$b$a;", "Lwc3/i$b$b;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwc3/i$b$a;", "Lwc3/i$b;", "<init>", "()V", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements b {
        }

        /* JADX INFO: renamed from: wc3.i$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwc3/i$b$b;", "Lwc3/i$b;", "Luc3/i;", "data", "<init>", "(Luc3/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luc3/i;", "()Luc3/i;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Updated implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PassportsData data;

            public Updated(PassportsData passportsData) {
                this.data = passportsData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PassportsData getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Updated) && t.c(this.data, ((Updated) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Updated(data=" + this.data + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212153g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f212154h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f212155j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f212156k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f212157l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f212158m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f212159n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f212160p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f212161q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f212162r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f212163s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f212164t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f212165v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f212167x;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212165v = obj;
            this.f212167x |= PKIFailureInfo.systemUnavail;
            return i.this.a(null, this);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f212144g = gu.d.q(5, gu.e.MINUTES);
    }

    public i(vc3.a aVar, a aVar2, tc3.b bVar, ez.b bVar2) {
        this.passportsStorageRepository = aVar;
        this.fetchAndSavePassportsUC = aVar2;
        this.userDataDocumentsInteractor = bVar;
        this.dateCalculator = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:135:0x02da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #12 {Exception -> 0x0055, blocks: (B:15:0x0050, B:93:0x0258, B:94:0x025e, B:112:0x0284, B:120:0x0293, B:123:0x02a1, B:26:0x008a, B:81:0x01e8, B:87:0x0207, B:89:0x0216, B:84:0x01f1, B:86:0x01f5, B:95:0x0261, B:96:0x0266, B:52:0x0166, B:47:0x012d, B:41:0x00f1, B:43:0x00fe, B:48:0x0136), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f5 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #12 {Exception -> 0x0055, blocks: (B:15:0x0050, B:93:0x0258, B:94:0x025e, B:112:0x0284, B:120:0x0293, B:123:0x02a1, B:26:0x008a, B:81:0x01e8, B:87:0x0207, B:89:0x0216, B:84:0x01f1, B:86:0x01f5, B:95:0x0261, B:96:0x0266, B:52:0x0166, B:47:0x012d, B:41:0x00f1, B:43:0x00fe, B:48:0x0136), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0216 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #12 {Exception -> 0x0055, blocks: (B:15:0x0050, B:93:0x0258, B:94:0x025e, B:112:0x0284, B:120:0x0293, B:123:0x02a1, B:26:0x008a, B:81:0x01e8, B:87:0x0207, B:89:0x0216, B:84:0x01f1, B:86:0x01f5, B:95:0x0261, B:96:0x0266, B:52:0x0166, B:47:0x012d, B:41:0x00f1, B:43:0x00fe, B:48:0x0136), top: B:138:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0255  */
    /* JADX WARN: Code duplicated, block: B:95:0x0261 A[Catch: Exception -> 0x0055, c -> 0x0058, CancellationException -> 0x005b, TryCatch #12 {Exception -> 0x0055, blocks: (B:15:0x0050, B:93:0x0258, B:94:0x025e, B:112:0x0284, B:120:0x0293, B:123:0x02a1, B:26:0x008a, B:81:0x01e8, B:87:0x0207, B:89:0x0216, B:84:0x01f1, B:86:0x01f5, B:95:0x0261, B:96:0x0266, B:52:0x0166, B:47:0x012d, B:41:0x00f1, B:43:0x00fe, B:48:0x0136), top: B:138:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00b9: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:32:0x00b9 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00bd: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:34:0x00bd */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00c1: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:36:0x00c1 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
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
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, ? extends b>> eVar) throws Throwable {
        c cVar;
        String message;
        dx.i iVarA;
        Object objB;
        Object obj;
        int i15;
        int i16;
        int i17;
        ex.b aVar;
        ex.b bVar;
        gz.b.a.C1792a c1792a2;
        int i18;
        int i19;
        j<dx.b> jVar;
        int i25;
        int i26;
        j<dx.b> jVar2;
        ex.b bVar2;
        ex.b bVar3;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        Long l15;
        ex.b bVar4;
        ex.b bVar5;
        gz.b.a.C1792a c1792a3;
        ex.b bVar6;
        Object obj2;
        dx.i iVar;
        Object objA;
        Object aVar2;
        ?? r15;
        ?? r16;
        Object right;
        gz.b.a.C1792a c1792a4;
        b.Updated updated;
        Object objC;
        Long l16;
        ?? r17;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i38 = cVar.f212167x;
            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f212167x = i38 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objA2 = cVar.f212165v;
        Object objE = uq.b.e();
        int i39 = cVar.f212167x;
        ?? r18 = 4;
        ?? r19 = 3;
        ?? r25 = 1;
        try {
            try {
                try {
                    try {
                        try {
                            if (i39 == 0) {
                                u.b(objA2);
                                j<dx.b> jVarA = xw.c.f221622a.a();
                                aVar = new ex.a();
                                if (this.userDataDocumentsInteractor.a()) {
                                    vc3.a aVar3 = this.passportsStorageRepository;
                                    cVar.f212150d = vq.j.a(c1792a);
                                    cVar.f212151e = jVarA;
                                    cVar.f212152f = vq.j.a(aVar);
                                    cVar.f212153g = aVar;
                                    cVar.f212158m = 0;
                                    cVar.f212159n = 0;
                                    cVar.f212160p = 0;
                                    cVar.f212161q = 0;
                                    cVar.f212162r = 0;
                                    cVar.f212167x = 1;
                                    objA2 = aVar3.c(cVar);
                                    if (objA2 != objE) {
                                        c1792a2 = c1792a;
                                        bVar = aVar;
                                        i19 = 0;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        jVar = jVarA;
                                        iVar = (dx.i) objA2;
                                        bVar5 = bVar;
                                        bVar3 = aVar;
                                        i27 = i17;
                                        i28 = i16;
                                        i29 = i15;
                                        i26 = i19;
                                        r18 = jVar;
                                    }
                                } else {
                                    tc3.b bVar7 = this.userDataDocumentsInteractor;
                                    cVar.f212150d = vq.j.a(c1792a);
                                    cVar.f212151e = jVarA;
                                    cVar.f212152f = vq.j.a(aVar);
                                    cVar.f212153g = aVar;
                                    cVar.f212158m = 0;
                                    cVar.f212159n = 0;
                                    cVar.f212160p = 0;
                                    cVar.f212161q = 0;
                                    cVar.f212162r = 0;
                                    cVar.f212167x = 2;
                                    objA2 = bVar7.d(cVar);
                                    if (objA2 != objE) {
                                        c1792a2 = c1792a;
                                        bVar3 = aVar;
                                        bVar2 = bVar3;
                                        i25 = 0;
                                        i26 = 0;
                                        i29 = 0;
                                        i28 = 0;
                                        i27 = 0;
                                        jVar2 = jVarA;
                                        iVar = (dx.i) objA2;
                                        bVar5 = bVar2;
                                        i18 = i25;
                                        r18 = jVar2;
                                    }
                                }
                                return objE;
                            }
                            try {
                                if (i39 == 1) {
                                    int i45 = cVar.f212162r;
                                    int i46 = cVar.f212161q;
                                    i15 = cVar.f212160p;
                                    i16 = cVar.f212159n;
                                    i17 = cVar.f212158m;
                                    aVar = (ex.b) cVar.f212153g;
                                    bVar = (ex.b) cVar.f212152f;
                                    j<dx.b> jVar3 = (j) cVar.f212151e;
                                    c1792a2 = (gz.b.a.C1792a) cVar.f212150d;
                                    u.b(objA2);
                                    i18 = i45;
                                    i19 = i46;
                                    jVar = jVar3;
                                    iVar = (dx.i) objA2;
                                    bVar5 = bVar;
                                    bVar3 = aVar;
                                    i27 = i17;
                                    i28 = i16;
                                    i29 = i15;
                                    i26 = i19;
                                    r18 = jVar;
                                } else if (i39 == 2) {
                                    i25 = cVar.f212162r;
                                    int i47 = cVar.f212161q;
                                    int i48 = cVar.f212160p;
                                    int i49 = cVar.f212159n;
                                    int i55 = cVar.f212158m;
                                    ex.b bVar8 = (ex.b) cVar.f212153g;
                                    ex.b bVar9 = (ex.b) cVar.f212152f;
                                    j<dx.b> jVar4 = (j) cVar.f212151e;
                                    c1792a2 = (gz.b.a.C1792a) cVar.f212150d;
                                    u.b(objA2);
                                    i26 = i47;
                                    jVar2 = jVar4;
                                    bVar2 = bVar9;
                                    bVar3 = bVar8;
                                    i27 = i55;
                                    i28 = i49;
                                    i29 = i48;
                                    iVar = (dx.i) objA2;
                                    bVar5 = bVar2;
                                    i18 = i25;
                                    r18 = jVar2;
                                } else {
                                    if (i39 == 3) {
                                        int i56 = cVar.f212163s;
                                        i35 = cVar.f212162r;
                                        i36 = cVar.f212161q;
                                        i37 = cVar.f212160p;
                                        i28 = cVar.f212159n;
                                        i27 = cVar.f212158m;
                                        bVar3 = (ex.b) cVar.f212155j;
                                        l15 = (Long) cVar.f212154h;
                                        bVar4 = (ex.b) cVar.f212153g;
                                        bVar5 = (ex.b) cVar.f212152f;
                                        j jVar5 = (j) cVar.f212151e;
                                        c1792a3 = (gz.b.a.C1792a) cVar.f212150d;
                                        u.b(objA2);
                                        r16 = i56;
                                        r15 = jVar5;
                                        right = (dx.i) objA2;
                                        c1792a4 = c1792a3;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new p();
                                            }
                                            right = new dx.i.Right(new b.Updated((PassportsData) ((dx.i.Right) right).b()));
                                        }
                                        objA = bVar3.a(right);
                                        updated = (b.Updated) objA;
                                        if (!this.userDataDocumentsInteractor.a()) {
                                            tc3.b bVar10 = this.userDataDocumentsInteractor;
                                            cVar.f212150d = vq.j.a(c1792a4);
                                            cVar.f212151e = r15;
                                            cVar.f212152f = vq.j.a(bVar5);
                                            cVar.f212153g = vq.j.a(bVar4);
                                            cVar.f212154h = vq.j.a(l15);
                                            cVar.f212155j = vq.j.a(updated);
                                            cVar.f212156k = objA;
                                            cVar.f212157l = bVar4;
                                            cVar.f212158m = i27;
                                            cVar.f212159n = i28;
                                            cVar.f212160p = i37;
                                            cVar.f212161q = i36;
                                            cVar.f212162r = i35;
                                            cVar.f212163s = r16;
                                            cVar.f212164t = 0;
                                            cVar.f212167x = 4;
                                            objC = bVar10.c(cVar);
                                            if (objC != objE) {
                                                obj2 = objA;
                                                objA2 = objC;
                                                bVar6 = bVar4;
                                            }
                                            return objE;
                                        }
                                        aVar2 = (b) objA;
                                        return new dx.i.Right(aVar2);
                                    }
                                    if (i39 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bVar6 = (ex.b) cVar.f212157l;
                                    obj2 = cVar.f212156k;
                                    u.b(objA2);
                                }
                                bVar6.a((dx.i) objA2);
                                objA = obj2;
                                aVar2 = (b) objA;
                                return new dx.i.Right(aVar2);
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r18 = obj;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r18));
                                iVarA = r18.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                            if (r25 != 0) {
                                try {
                                    a aVar4 = this.fetchAndSavePassportsUC;
                                    gz.b.a.C1792a c1792a5 = gz.b.a.C1792a.f78542a;
                                    cVar.f212150d = vq.j.a(c1792a2);
                                    ?? r26 = r17;
                                    cVar.f212151e = r26;
                                    cVar.f212152f = vq.j.a(bVar5);
                                    cVar.f212153g = bVar3;
                                    cVar.f212154h = vq.j.a(l16);
                                    cVar.f212155j = bVar3;
                                    cVar.f212158m = i27;
                                    cVar.f212159n = i28;
                                    cVar.f212160p = i29;
                                    i36 = i26;
                                    cVar.f212161q = i36;
                                    cVar.f212162r = i18;
                                    cVar.f212163s = r25;
                                    cVar.f212167x = 3;
                                    objA2 = aVar4.a(c1792a5, cVar);
                                    if (objA2 != objE) {
                                        r15 = r26;
                                        r16 = r25;
                                        i37 = i29;
                                        i35 = i18;
                                        c1792a3 = c1792a2;
                                        l15 = l16;
                                        bVar4 = bVar3;
                                        right = (dx.i) objA2;
                                        c1792a4 = c1792a3;
                                        if (!(right instanceof dx.i.Left)) {
                                            if (right instanceof dx.i.Right) {
                                                throw new p();
                                            }
                                            right = new dx.i.Right(new b.Updated((PassportsData) ((dx.i.Right) right).b()));
                                        }
                                        objA = bVar3.a(right);
                                        updated = (b.Updated) objA;
                                        if (!this.userDataDocumentsInteractor.a()) {
                                            tc3.b bVar11 = this.userDataDocumentsInteractor;
                                            cVar.f212150d = vq.j.a(c1792a4);
                                            cVar.f212151e = r15;
                                            cVar.f212152f = vq.j.a(bVar5);
                                            cVar.f212153g = vq.j.a(bVar4);
                                            cVar.f212154h = vq.j.a(l15);
                                            cVar.f212155j = vq.j.a(updated);
                                            cVar.f212156k = objA;
                                            cVar.f212157l = bVar4;
                                            cVar.f212158m = i27;
                                            cVar.f212159n = i28;
                                            cVar.f212160p = i37;
                                            cVar.f212161q = i36;
                                            cVar.f212162r = i35;
                                            cVar.f212163s = r16;
                                            cVar.f212164t = 0;
                                            cVar.f212167x = 4;
                                            objC = bVar11.c(cVar);
                                            if (objC != objE) {
                                                obj2 = objA;
                                                objA2 = objC;
                                                bVar6 = bVar4;
                                                bVar6.a((dx.i) objA2);
                                                objA = obj2;
                                            }
                                        }
                                        aVar2 = (b) objA;
                                    }
                                    return objE;
                                } catch (ex.c e18) {
                                    e = e18;
                                    r19 = r17;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    e = e19;
                                    r19 = r17;
                                    throw e;
                                } catch (Exception e25) {
                                    e = e25;
                                    r19 = r17;
                                    r18 = r19;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r18));
                                    iVarA = r18.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            }
                            aVar2 = new b.a();
                            return new dx.i.Right(aVar2);
                        } catch (ex.c e26) {
                            e = e26;
                        } catch (CancellationException e27) {
                            e = e27;
                        } catch (Exception e28) {
                            e = e28;
                        }
                        l16 = (Long) iVar.a();
                        if (l16 != null) {
                            try {
                                long jLongValue = l16.longValue();
                                ?? r110 = r18;
                                try {
                                    boolean zD = this.dateCalculator.d(jLongValue, f212144g);
                                    r19 = jLongValue;
                                    r25 = zD;
                                    r17 = r110;
                                } catch (ex.c e29) {
                                    e = e29;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e35) {
                                    throw e35;
                                } catch (Exception e36) {
                                    e = e36;
                                    r18 = r110;
                                    px.f fVar3 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar3.d(message, e, px.c.a(r18));
                                    iVarA = r18.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            } catch (ex.c e37) {
                                e = e37;
                            } catch (CancellationException e38) {
                                throw e38;
                            } catch (Exception e39) {
                                e = e39;
                            }
                        } else {
                            r17 = r18;
                        }
                    } catch (ex.c e45) {
                        e = e45;
                    } catch (CancellationException e46) {
                        throw e46;
                    } catch (Exception e47) {
                        e = e47;
                    }
                } catch (CancellationException e48) {
                    throw e48;
                }
            } catch (Exception e49) {
                e = e49;
            }
        } catch (ex.c e55) {
            e = e55;
        } catch (CancellationException e56) {
            throw e56;
        }
    }
}
