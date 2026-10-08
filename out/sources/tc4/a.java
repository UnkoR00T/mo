package tc4;

import dx.i;
import f24.Document;
import f24.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pc4.j1;
import pc4.r2;
import pq.v;
import px.f;
import vq.j;
import w24.f2;
import w24.i0;
import w24.r;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\u0019\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001e\u0010\u001cJ$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0 2\u0006\u0010\u001f\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Ltc4/a;", "Ls34/a;", "Lc54/b;", "isFeatureEnabledUseCase", "Lw24/f2;", "isDocumentAddedByType", "Lw24/i0;", "getDocumentIdsByTypeUC", "Lw24/r;", "getAddedDocumentTypesUC", "Lv24/b;", "documentsContainerRepository", "<init>", "(Lc54/b;Lw24/f2;Lw24/i0;Lw24/r;Lv24/b;)V", "Lf24/h;", "Ler0/h;", "c", "(Lf24/h;)Ler0/h;", "", "a", "()Z", "", "Lrq0/b;", "j", "(Ltq/e;)Ljava/lang/Object;", "document", "", "i", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "documentType", "g", "documentIid", "Ldx/i;", "Ldx/b;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lc54/b;", "Lw24/f2;", "Lw24/i0;", "d", "Lw24/r;", "e", "Lv24/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements s34.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f2 isDocumentAddedByType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i0 getDocumentIdsByTypeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r getAddedDocumentTypesUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: tc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4927a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f189510a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f189510a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f189511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f189513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f189514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f189515h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f189516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f189517k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f189518l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f189519m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f189520n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f189522q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189520n = obj;
            this.f189522q |= PKIFailureInfo.systemUnavail;
            return a.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f189523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f189524e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f189526g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189524e = obj;
            this.f189526g |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f189527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f189528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f189529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f189530g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f189531h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f189532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f189533k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f189534l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f189535m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f189536n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f189538q;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189536n = obj;
            this.f189538q |= PKIFailureInfo.systemUnavail;
            return a.this.g(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f189539d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f189541f;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f189539d = obj;
            this.f189541f |= PKIFailureInfo.systemUnavail;
            return a.this.j(this);
        }
    }

    public a(c54.b bVar, f2 f2Var, i0 i0Var, r rVar, v24.b bVar2) {
        this.isFeatureEnabledUseCase = bVar;
        this.isDocumentAddedByType = f2Var;
        this.getDocumentIdsByTypeUC = i0Var;
        this.getAddedDocumentTypesUC = rVar;
        this.documentsContainerRepository = bVar2;
    }

    private final er0.h c(h hVar) {
        int i15 = C4927a.f189510a[hVar.ordinal()];
        if (i15 == 1) {
            return er0.h.ACTIVE;
        }
        if (i15 == 2) {
            return er0.h.EXPIRED;
        }
        if (i15 == 3) {
            return er0.h.REVOKED;
        }
        if (i15 == 4) {
            return er0.h.INACTIVE;
        }
        throw new p();
    }

    @Override // s34.a
    public boolean a() {
        return this.isFeatureEnabledUseCase.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s34.a
    public Object b(String str, tq.e<? super i<? extends dx.b, ? extends er0.h>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f189526g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f189526g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f189524e;
        Object objE = uq.b.e();
        int i16 = cVar.f189526g;
        if (i16 == 0) {
            u.b(objC);
            v24.b bVar = this.documentsContainerRepository;
            cVar.f189523d = j.a(str);
            cVar.f189526g = 1;
            objC = bVar.c(str, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(c(((Document) ((i.Right) iVar).b()).getDocumentStatus()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a A[Catch: Exception -> 0x003a, c -> 0x003d, CancellationException -> 0x0040, TryCatch #5 {Exception -> 0x003a, blocks: (B:12:0x0036, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00c1, B:35:0x00c6, B:42:0x00d6, B:45:0x00e4), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[Catch: Exception -> 0x003a, c -> 0x003d, CancellationException -> 0x0040, TryCatch #5 {Exception -> 0x003a, blocks: (B:12:0x0036, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00c1, B:35:0x00c6, B:42:0x00d6, B:45:0x00e4), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab A[Catch: Exception -> 0x003a, c -> 0x003d, CancellationException -> 0x0040, TryCatch #5 {Exception -> 0x003a, blocks: (B:12:0x0036, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00c1, B:35:0x00c6, B:42:0x00d6, B:45:0x00e4), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1 A[Catch: Exception -> 0x003a, c -> 0x003d, CancellationException -> 0x0040, TryCatch #5 {Exception -> 0x003a, blocks: (B:12:0x0036, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00c1, B:35:0x00c6, B:42:0x00d6, B:45:0x00e4), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, rq0.b] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2, types: [dx.j, java.lang.Object] */
    @Override // s34.a
    public Object g(rq0.b bVar, tq.e<? super Boolean> eVar) throws Throwable {
        d dVar;
        Object objB;
        i left;
        ex.c e15;
        i iVar;
        Object objB2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f189538q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f189538q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f189536n;
        Object objE = uq.b.e();
        int i16 = dVar.f189538q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        f2 f2Var = this.isDocumentAddedByType;
                        f2.Params params = new f2.Params((f24.i) aVar.a(j1.l(bVar)));
                        dVar.f189527d = j.a(bVar);
                        dVar.f189528e = jVarA;
                        dVar.f189529f = j.a(aVar);
                        dVar.f189530g = j.a(aVar);
                        dVar.f189531h = 0;
                        dVar.f189532j = 0;
                        dVar.f189533k = 0;
                        dVar.f189534l = 0;
                        dVar.f189535m = 0;
                        dVar.f189538q = 1;
                        Object objC = f2Var.c(params, dVar);
                        if (objC == objE) {
                            return objE;
                        }
                        obj = objC;
                        iVar = (i) obj;
                        if (iVar instanceof i.Left) {
                            objB2 = vq.b.a(false);
                        } else {
                            if (iVar instanceof i.Right) {
                                throw new p();
                            }
                            objB2 = ((i.Right) iVar).b();
                        }
                        left = new i.Right(vq.b.a(((Boolean) objB2).booleanValue()));
                    } catch (ex.c e16) {
                        e15 = e16;
                        left = new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        bVar = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        i iVarA = bVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        left = new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        iVar = (i) obj;
                        if (iVar instanceof i.Left) {
                            objB2 = vq.b.a(false);
                        } else {
                            if (iVar instanceof i.Right) {
                                throw new p();
                            }
                            objB2 = ((i.Right) iVar).b();
                        }
                        left = new i.Right(vq.b.a(((Boolean) objB2).booleanValue()));
                    } catch (ex.c e19) {
                        e15 = e19;
                        left = new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
        if (left instanceof i.Left) {
            return vq.b.a(false);
        }
        if (left instanceof i.Right) {
            return ((i.Right) left).b();
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00b9, B:35:0x00be, B:42:0x00ce, B:45:0x00dc), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00b9, B:35:0x00be, B:42:0x00ce, B:45:0x00dc), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00b9, B:35:0x00be, B:42:0x00ce, B:45:0x00dc), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0094, B:29:0x009a, B:33:0x00b1, B:30:0x00a7, B:32:0x00ab, B:34:0x00b9, B:35:0x00be, B:42:0x00ce, B:45:0x00dc), top: B:68:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, rq0.b] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dx.j, java.lang.Object] */
    @Override // s34.a
    public Object i(rq0.b bVar, tq.e<? super List<String>> eVar) throws Throwable {
        b bVar2;
        Object objB;
        i left;
        ex.c e15;
        i iVar;
        Object objB2;
        if (eVar instanceof b) {
            bVar2 = (b) eVar;
            int i15 = bVar2.f189522q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f189522q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar2 = new b(eVar);
            }
        } else {
            bVar2 = new b(eVar);
        }
        Object obj = bVar2.f189520n;
        Object objE = uq.b.e();
        int i16 = bVar2.f189522q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        i0 i0Var = this.getDocumentIdsByTypeUC;
                        i0.Params params = new i0.Params((f24.i) aVar.a(j1.l(bVar)), true);
                        bVar2.f189511d = j.a(bVar);
                        bVar2.f189512e = jVarA;
                        bVar2.f189513f = j.a(aVar);
                        bVar2.f189514g = j.a(aVar);
                        bVar2.f189515h = 0;
                        bVar2.f189516j = 0;
                        bVar2.f189517k = 0;
                        bVar2.f189518l = 0;
                        bVar2.f189519m = 0;
                        bVar2.f189522q = 1;
                        Object objC = i0Var.c(params, bVar2);
                        if (objC == objE) {
                            return objE;
                        }
                        obj = objC;
                        iVar = (i) obj;
                        if (iVar instanceof i.Left) {
                            objB2 = v.n();
                        } else {
                            if (iVar instanceof i.Right) {
                                throw new p();
                            }
                            objB2 = ((i.Right) iVar).b();
                        }
                        left = new i.Right((List) objB2);
                    } catch (ex.c e16) {
                        e15 = e16;
                        left = new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        bVar = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        i iVarA = bVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        left = new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        iVar = (i) obj;
                        if (iVar instanceof i.Left) {
                            objB2 = v.n();
                        } else {
                            if (iVar instanceof i.Right) {
                                throw new p();
                            }
                            objB2 = ((i.Right) iVar).b();
                        }
                        left = new i.Right((List) objB2);
                    } catch (ex.c e19) {
                        e15 = e19;
                        left = new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
            } catch (Exception e26) {
                e = e26;
            }
            if (left instanceof i.Left) {
                return v.n();
            }
            if (left instanceof i.Right) {
                return ((i.Right) left).b();
            }
            throw new p();
        } catch (CancellationException e27) {
            throw e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s34.a
    public Object j(tq.e<? super List<? extends rq0.b>> eVar) throws Throwable {
        e eVar2;
        Object objB;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f189541f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f189541f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f189539d;
        Object objE = uq.b.e();
        int i16 = eVar2.f189541f;
        if (i16 == 0) {
            u.b(objC);
            r rVar = this.getAddedDocumentTypesUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            eVar2.f189541f = 1;
            objC = rVar.c(c1792a, eVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        i iVar = (i) objC;
        if (iVar instanceof i.Left) {
            objB = v.n();
        } else {
            if (!(iVar instanceof i.Right)) {
                throw new p();
            }
            objB = ((i.Right) iVar).b();
        }
        Iterable iterable = (Iterable) objB;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(r2.a((f24.i) it.next()));
        }
        return arrayList;
    }
}
