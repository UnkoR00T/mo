package vc4;

import b54.c;
import dx.i;
import dx.j;
import ia2.InstitutionHistoryType;
import ia2.VerificationHistoryType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.legacy.storage.g;
import pq.v;
import px.f;
import q34.i0;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u0017H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001c0\u0017H\u0096@¢\u0006\u0004\b\u001f\u0010\u001eJ$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'¨\u0006("}, d2 = {"Lvc4/a;", "Lha2/a;", "Lq34/i0;", "getDocumentInfoUC", "Lc54/b;", "isFeatureEnabledUseCase", "Lpl/gov/coi/mobywatel/feature/legacy/storage/g;", "historyRepositoryLegacy", "<init>", "(Lq34/i0;Lc54/b;Lpl/gov/coi/mobywatel/feature/legacy/storage/g;)V", "Lej2/a;", "Lia2/a;", "f", "(Lej2/a;)Lia2/a;", "Lej2/b;", "Lia2/d;", "g", "(Lej2/b;)Lia2/d;", "", "a", "()Z", "", "documentType", "Ldx/i;", "Ldx/b;", "", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "d", "(Ltq/e;)Ljava/lang/Object;", "e", "Ly92/a;", "historyEntry", "Loq/i0;", "b", "(Ly92/a;Ltq/e;)Ljava/lang/Object;", "Lq34/i0;", "Lc54/b;", "Lpl/gov/coi/mobywatel/feature/legacy/storage/g;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ha2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i0 getDocumentInfoUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g historyRepositoryLegacy;

    /* JADX INFO: renamed from: vc4.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5387a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f206116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f206118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f206119g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f206120h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f206121j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f206122k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f206123l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f206124m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f206125n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f206126p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f206128r;

        C5387a(e<? super C5387a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f206126p = obj;
            this.f206128r |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f206129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f206130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f206131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f206132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f206133h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f206134j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f206135k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f206136l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f206137m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f206138n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f206140q;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f206138n = obj;
            this.f206140q |= PKIFailureInfo.systemUnavail;
            return a.this.b(null, this);
        }
    }

    public a(i0 i0Var, c54.b bVar, g gVar) {
        this.getDocumentInfoUC = i0Var;
        this.isFeatureEnabledUseCase = bVar;
        this.historyRepositoryLegacy = gVar;
    }

    private final InstitutionHistoryType f(ej2.InstitutionHistoryType institutionHistoryType) {
        return new InstitutionHistoryType(institutionHistoryType.getTimestamp(), institutionHistoryType.getDocumentType(), institutionHistoryType.getInstitutionName());
    }

    private final VerificationHistoryType g(ej2.VerificationHistoryType verificationHistoryType) {
        return new VerificationHistoryType(verificationHistoryType.getTimestamp(), verificationHistoryType.getDocumentType(), verificationHistoryType.getIsAccepted(), verificationHistoryType.getConnectionError());
    }

    @Override // ha2.a
    public boolean a() {
        return this.isFeatureEnabledUseCase.a(c.MOB_DB_CONTAINERS).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, y92.a] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // ha2.a
    public Object b(y92.a aVar, e<? super i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f206140q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f206140q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f206138n;
        Object objE = uq.b.e();
        int i16 = bVar.f206140q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        if (this.isFeatureEnabledUseCase.a(c.MOB_DB_CONTAINERS).booleanValue()) {
                            aVar2.b(new dx.b.Generic(new UnsupportedOperationException("Wrong saving history data method")));
                            throw new oq.g();
                        }
                        g gVar = this.historyRepositoryLegacy;
                        bVar.f206129d = vq.j.a(aVar);
                        bVar.f206130e = jVarA;
                        bVar.f206131f = vq.j.a(aVar2);
                        bVar.f206132g = vq.j.a(aVar2);
                        bVar.f206133h = 0;
                        bVar.f206134j = 0;
                        bVar.f206135k = 0;
                        bVar.f206136l = 0;
                        bVar.f206137m = 0;
                        bVar.f206140q = 1;
                        if (gVar.b(aVar, bVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        aVar = jVarA;
                        f fVar = f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(aVar));
                        i iVarA = aVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(oq.i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [dx.j, int, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ha2.a
    public Object c(String str, e<? super i<? extends dx.b, Integer>> eVar) throws Throwable {
        C5387a c5387a;
        Object objB;
        ex.b bVar;
        rq0.b bVar2;
        if (eVar instanceof C5387a) {
            c5387a = (C5387a) eVar;
            int i15 = c5387a.f206128r;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5387a.f206128r = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c5387a = new C5387a(eVar);
            }
        } else {
            c5387a = new C5387a(eVar);
        }
        Object obj = c5387a.f206126p;
        Object objE = uq.b.e();
        ?? r15 = c5387a.f206128r;
        try {
            try {
                if (r15 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    rq0.b bVarA = rq0.b.INSTANCE.a(str);
                    if (bVarA == null) {
                        aVar.b(new dx.b.Generic(new NoSuchElementException("Document type not found for reference name: " + str)));
                        throw new oq.g();
                    }
                    i0 i0Var = this.getDocumentInfoUC;
                    i0.Params params = new i0.Params(bVarA);
                    c5387a.f206116d = vq.j.a(str);
                    c5387a.f206117e = jVarA;
                    c5387a.f206118f = vq.j.a(aVar);
                    c5387a.f206119g = aVar;
                    c5387a.f206120h = bVarA;
                    c5387a.f206121j = 0;
                    c5387a.f206122k = 0;
                    c5387a.f206123l = 0;
                    c5387a.f206124m = 0;
                    c5387a.f206125n = 0;
                    c5387a.f206128r = 1;
                    Object objC = i0Var.c(params, c5387a);
                    if (objC == objE) {
                        return objE;
                    }
                    bVar = aVar;
                    obj = objC;
                    bVar2 = bVarA;
                } else {
                    if (r15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (rq0.b) c5387a.f206120h;
                    bVar = (ex.b) c5387a.f206119g;
                    try {
                        u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                k34.g gVar = (k34.g) obj;
                if (gVar != null) {
                    Integer nameAlternative = gVar.getNameAlternative();
                    return new i.Right(vq.b.e(nameAlternative != null ? nameAlternative.intValue() : gVar.getName()));
                }
                bVar.b(new dx.b.Generic(new NoSuchElementException("Document info not found for type: " + bVar2)));
                throw new oq.g();
            } catch (Exception e16) {
                f fVar = f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(r15));
                i iVarA = r15.a(e16);
                if (iVarA instanceof i.Left) {
                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                } else {
                    if (!(iVarA instanceof i.Right)) {
                        throw new p();
                    }
                    objB = ((i.Right) iVarA).b();
                }
                return new i.Left(objB);
            }
        } catch (ex.c e17) {
            return new i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // ha2.a
    public Object d(e<? super i<? extends dx.b, ? extends List<InstitutionHistoryType>>> eVar) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (this.isFeatureEnabledUseCase.a(c.MOB_DB_CONTAINERS).booleanValue()) {
                        aVar.b(new dx.b.Generic(new UnsupportedOperationException("Wrong saving history data method")));
                        throw new oq.g();
                    }
                    List<ej2.InstitutionHistoryType> listC = this.historyRepositoryLegacy.c();
                    ArrayList arrayList = new ArrayList(v.y(listC, 10));
                    Iterator<T> it = listC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(f((ej2.InstitutionHistoryType) it.next()));
                    }
                    return new i.Right(arrayList);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // ha2.a
    public Object e(e<? super i<? extends dx.b, ? extends List<VerificationHistoryType>>> eVar) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (this.isFeatureEnabledUseCase.a(c.MOB_DB_CONTAINERS).booleanValue()) {
                        aVar.b(new dx.b.Generic(new UnsupportedOperationException("Wrong saving history data method")));
                        throw new oq.g();
                    }
                    List<ej2.VerificationHistoryType> listA = this.historyRepositoryLegacy.a();
                    ArrayList arrayList = new ArrayList(v.y(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(g((ej2.VerificationHistoryType) it.next()));
                    }
                    return new i.Right(arrayList);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
